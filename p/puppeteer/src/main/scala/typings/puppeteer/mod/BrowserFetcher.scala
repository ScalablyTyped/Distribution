package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer", "BrowserFetcher")
@js.native
/**
  * Constructs a browser fetcher for the given options.
  */
open class BrowserFetcher () extends StObject {
  def this(options: BrowserFetcherOptions) = this()
  
  /**
    * Initiates a HEAD request to check if the revision is available.
    * @remarks
    * This method is affected by the current `product`.
    * @param revision - The revision to check availability for.
    * @returns A promise that resolves to `true` if the revision could be downloaded
    * from the host.
    */
  def canDownload(revision: String): js.Promise[Boolean] = js.native
  
  /**
    * Initiates a GET request to download the revision from the host.
    * @remarks
    * This method is affected by the current `product`.
    * @param revision - The revision to download.
    * @param progressCallback - A function that will be called with two arguments:
    * How many bytes have been downloaded and the total number of bytes of the download.
    * @returns A promise with revision information when the revision is downloaded
    * and extracted.
    */
  def download(revision: String): js.Promise[js.UndefOr[BrowserFetcherRevisionInfo]] = js.native
  def download(revision: String, progressCallback: js.Function2[/* x */ Double, /* y */ Double, Unit]): js.Promise[js.UndefOr[BrowserFetcherRevisionInfo]] = js.native
  
  /**
    * @returns The download host being used.
    */
  def host(): String = js.native
  
  /**
    * @remarks
    * This method is affected by the current `product`.
    * @returns A promise with a list of all revision strings (for the current `product`)
    * available locally on disk.
    */
  def localRevisions(): js.Promise[js.Array[String]] = js.native
  
  /**
    * @returns Returns the current `Platform`, which is one of `mac`, `linux`,
    * `win32` or `win64`.
    */
  def platform(): Platform = js.native
  
  /* private */ var `private`: Any = js.native
  
  /**
    * @returns Returns the current `Product`, which is one of `chrome` or
    * `firefox`.
    */
  def product(): Product = js.native
  
  /**
    * @remarks
    * This method is affected by the current `product`.
    * @param revision - A revision to remove for the current `product`.
    * @returns A promise that resolves when the revision has been removes or
    * throws if the revision has not been downloaded.
    */
  def remove(revision: String): js.Promise[Unit] = js.native
  
  /**
    * @param revision - The revision to get info for.
    * @returns The revision info for the given revision.
    */
  def revisionInfo(revision: String): BrowserFetcherRevisionInfo = js.native
}
