package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserFetcher extends js.Object {
  /** The method initiates a HEAD request to check if the revision is available. */
  def canDownload(revision: java.lang.String): js.Promise[scala.Boolean] = js.native
  /** The method initiates a GET request to download the revision from the host. */
  def download(revision: java.lang.String): js.Promise[RevisionInfo] = js.native
  def download(
    revision: java.lang.String,
    progressCallback: js.Function2[/* downloadBytes */ scala.Double, /* totalBytes */ scala.Double, scala.Unit]
  ): js.Promise[RevisionInfo] = js.native
  def localRevisions(): js.Promise[js.Array[java.lang.String]] = js.native
  def platform(): Platform = js.native
  def remove(revision: java.lang.String): js.Promise[scala.Unit] = js.native
  def revisionInfo(revision: java.lang.String): RevisionInfo = js.native
}

