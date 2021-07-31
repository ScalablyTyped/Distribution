package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserFetcher extends StObject {
  
  /** The method initiates a HEAD request to check if the revision is available. */
  def canDownload(revision: String): js.Promise[Boolean] = js.native
  
  /** The method initiates a GET request to download the revision from the host. */
  def download(revision: String): js.Promise[RevisionInfo] = js.native
  def download(
    revision: String,
    progressCallback: js.Function2[/* downloadBytes */ Double, /* totalBytes */ Double, Unit]
  ): js.Promise[RevisionInfo] = js.native
  
  def localRevisions(): js.Promise[js.Array[String]] = js.native
  
  def platform(): Platform = js.native
  
  def product(): Product_ = js.native
  
  def remove(revision: String): js.Promise[Unit] = js.native
  
  def revisionInfo(revision: String): RevisionInfo = js.native
}
