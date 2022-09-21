package typings.puppeteer

import typings.puppeteer.commonProductMod.Product
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeBrowserFetcherMod {
  
  @JSImport("puppeteer/lib/esm/puppeteer/node/BrowserFetcher", "BrowserFetcher")
  @js.native
  open class BrowserFetcher protected () extends StObject {
    /**
      * @internal
      */
    def this(projectRoot: String) = this()
    def this(projectRoot: String, options: BrowserFetcherOptions) = this()
    
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
  
  trait BrowserFetcherOptions extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var platform: js.UndefOr[Platform] = js.undefined
    
    var product: js.UndefOr[String] = js.undefined
  }
  object BrowserFetcherOptions {
    
    inline def apply(): BrowserFetcherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserFetcherOptions]
    }
    
    extension [Self <: BrowserFetcherOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    }
  }
  
  trait BrowserFetcherRevisionInfo extends StObject {
    
    var executablePath: String
    
    var folderPath: String
    
    var local: Boolean
    
    var product: String
    
    var revision: String
    
    var url: String
  }
  object BrowserFetcherRevisionInfo {
    
    inline def apply(
      executablePath: String,
      folderPath: String,
      local: Boolean,
      product: String,
      revision: String,
      url: String
    ): BrowserFetcherRevisionInfo = {
      val __obj = js.Dynamic.literal(executablePath = executablePath.asInstanceOf[js.Any], folderPath = folderPath.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowserFetcherRevisionInfo]
    }
    
    extension [Self <: BrowserFetcherRevisionInfo](x: Self) {
      
      inline def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
      
      inline def setFolderPath(value: String): Self = StObject.set(x, "folderPath", value.asInstanceOf[js.Any])
      
      inline def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteer.puppeteerStrings.linux
    - typings.puppeteer.puppeteerStrings.mac
    - typings.puppeteer.puppeteerStrings.mac_arm
    - typings.puppeteer.puppeteerStrings.win32
    - typings.puppeteer.puppeteerStrings.win64
  */
  trait Platform extends StObject
  object Platform {
    
    inline def linux: typings.puppeteer.puppeteerStrings.linux = "linux".asInstanceOf[typings.puppeteer.puppeteerStrings.linux]
    
    inline def mac: typings.puppeteer.puppeteerStrings.mac = "mac".asInstanceOf[typings.puppeteer.puppeteerStrings.mac]
    
    inline def mac_arm: typings.puppeteer.puppeteerStrings.mac_arm = "mac_arm".asInstanceOf[typings.puppeteer.puppeteerStrings.mac_arm]
    
    inline def win32: typings.puppeteer.puppeteerStrings.win32 = "win32".asInstanceOf[typings.puppeteer.puppeteerStrings.win32]
    
    inline def win64: typings.puppeteer.puppeteerStrings.win64 = "win64".asInstanceOf[typings.puppeteer.puppeteerStrings.win64]
  }
}
