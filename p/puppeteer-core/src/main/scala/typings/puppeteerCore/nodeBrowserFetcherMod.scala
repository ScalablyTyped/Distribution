package typings.puppeteerCore

import typings.puppeteerCore.commonProductMod.Product
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeBrowserFetcherMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/node/BrowserFetcher", "BrowserFetcher")
  @js.native
  class BrowserFetcher protected () extends StObject {
    /**
      * @internal
      */
    def this(projectRoot: String) = this()
    def this(projectRoot: String, options: BrowserFetcherOptions) = this()
    
    var _downloadHost: js.Any = js.native
    
    var _downloadsFolder: js.Any = js.native
    
    /**
      * @internal
      */
    def _getFolderPath(revision: String): String = js.native
    
    var _platform: js.Any = js.native
    
    var _product: js.Any = js.native
    
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
    def download(revision: String): js.Promise[BrowserFetcherRevisionInfo] = js.native
    def download(revision: String, progressCallback: js.Function2[/* x */ Double, /* y */ Double, Unit]): js.Promise[BrowserFetcherRevisionInfo] = js.native
    
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
      * @returns Returns the current `Platform`.
      */
    def platform(): Platform = js.native
    
    /**
      * @returns Returns the current `Product`.
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
    
    var setPlatform: js.Any = js.native
  }
  
  trait BrowserFetcherOptions extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var platform: js.UndefOr[Platform] = js.undefined
    
    var product: js.UndefOr[String] = js.undefined
  }
  object BrowserFetcherOptions {
    
    @scala.inline
    def apply(): BrowserFetcherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserFetcherOptions]
    }
    
    @scala.inline
    implicit class BrowserFetcherOptionsMutableBuilder[Self <: BrowserFetcherOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class BrowserFetcherRevisionInfoMutableBuilder[Self <: BrowserFetcherRevisionInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFolderPath(value: String): Self = StObject.set(x, "folderPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.puppeteerCoreStrings.linux
    - typings.puppeteerCore.puppeteerCoreStrings.mac
    - typings.puppeteerCore.puppeteerCoreStrings.win32
    - typings.puppeteerCore.puppeteerCoreStrings.win64
  */
  trait Platform extends StObject
  object Platform {
    
    @scala.inline
    def linux: typings.puppeteerCore.puppeteerCoreStrings.linux = "linux".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.linux]
    
    @scala.inline
    def mac: typings.puppeteerCore.puppeteerCoreStrings.mac = "mac".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.mac]
    
    @scala.inline
    def win32: typings.puppeteerCore.puppeteerCoreStrings.win32 = "win32".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.win32]
    
    @scala.inline
    def win64: typings.puppeteerCore.puppeteerCoreStrings.win64 = "win64".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.win64]
  }
}
