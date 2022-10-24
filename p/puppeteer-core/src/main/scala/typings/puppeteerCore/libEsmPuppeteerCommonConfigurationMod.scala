package typings.puppeteerCore

import typings.puppeteerCore.anon.MacArmChromiumEnabled
import typings.puppeteerCore.libEsmPuppeteerCommonProductMod.Product
import typings.puppeteerCore.puppeteerCoreStrings.error
import typings.puppeteerCore.puppeteerCoreStrings.silent
import typings.puppeteerCore.puppeteerCoreStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerCommonConfigurationMod {
  
  trait Configuration extends StObject {
    
    var browserRevision: js.UndefOr[String] = js.undefined
    
    var cacheDirectory: js.UndefOr[String] = js.undefined
    
    var defaultProduct: js.UndefOr[Product] = js.undefined
    
    var downloadHost: js.UndefOr[String] = js.undefined
    
    var downloadPath: js.UndefOr[String] = js.undefined
    
    var executablePath: js.UndefOr[String] = js.undefined
    
    var experiments: js.UndefOr[MacArmChromiumEnabled] = js.undefined
    
    var logLevel: js.UndefOr[silent | error | warn] = js.undefined
    
    var skipDownload: js.UndefOr[Boolean] = js.undefined
    
    var temporaryDirectory: js.UndefOr[String] = js.undefined
  }
  object Configuration {
    
    inline def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setBrowserRevision(value: String): Self = StObject.set(x, "browserRevision", value.asInstanceOf[js.Any])
      
      inline def setBrowserRevisionUndefined: Self = StObject.set(x, "browserRevision", js.undefined)
      
      inline def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      inline def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
      
      inline def setDefaultProduct(value: Product): Self = StObject.set(x, "defaultProduct", value.asInstanceOf[js.Any])
      
      inline def setDefaultProductUndefined: Self = StObject.set(x, "defaultProduct", js.undefined)
      
      inline def setDownloadHost(value: String): Self = StObject.set(x, "downloadHost", value.asInstanceOf[js.Any])
      
      inline def setDownloadHostUndefined: Self = StObject.set(x, "downloadHost", js.undefined)
      
      inline def setDownloadPath(value: String): Self = StObject.set(x, "downloadPath", value.asInstanceOf[js.Any])
      
      inline def setDownloadPathUndefined: Self = StObject.set(x, "downloadPath", js.undefined)
      
      inline def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
      
      inline def setExecutablePathUndefined: Self = StObject.set(x, "executablePath", js.undefined)
      
      inline def setExperiments(value: MacArmChromiumEnabled): Self = StObject.set(x, "experiments", value.asInstanceOf[js.Any])
      
      inline def setExperimentsUndefined: Self = StObject.set(x, "experiments", js.undefined)
      
      inline def setLogLevel(value: silent | error | warn): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setSkipDownload(value: Boolean): Self = StObject.set(x, "skipDownload", value.asInstanceOf[js.Any])
      
      inline def setSkipDownloadUndefined: Self = StObject.set(x, "skipDownload", js.undefined)
      
      inline def setTemporaryDirectory(value: String): Self = StObject.set(x, "temporaryDirectory", value.asInstanceOf[js.Any])
      
      inline def setTemporaryDirectoryUndefined: Self = StObject.set(x, "temporaryDirectory", js.undefined)
    }
  }
}
