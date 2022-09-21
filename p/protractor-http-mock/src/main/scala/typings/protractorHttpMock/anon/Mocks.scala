package typings.protractorHttpMock.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mocks extends StObject {
  
  var mocks: js.UndefOr[Default] = js.undefined
  
  var plugins: js.UndefOr[`0`] = js.undefined
  
  /**
    * Path to protractor configuration file.
    * Default: protractor-conf.js
    */
  var protractorConfig: js.UndefOr[String] = js.undefined
  
  /**
    * Mocks directory where mock files are located.
    * Default: process.cwd()
    */
  var rootDirectory: js.UndefOr[String] = js.undefined
}
object Mocks {
  
  inline def apply(): Mocks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mocks]
  }
  
  extension [Self <: Mocks](x: Self) {
    
    inline def setMocks(value: Default): Self = StObject.set(x, "mocks", value.asInstanceOf[js.Any])
    
    inline def setMocksUndefined: Self = StObject.set(x, "mocks", js.undefined)
    
    inline def setPlugins(value: `0`): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setProtractorConfig(value: String): Self = StObject.set(x, "protractorConfig", value.asInstanceOf[js.Any])
    
    inline def setProtractorConfigUndefined: Self = StObject.set(x, "protractorConfig", js.undefined)
    
    inline def setRootDirectory(value: String): Self = StObject.set(x, "rootDirectory", value.asInstanceOf[js.Any])
    
    inline def setRootDirectoryUndefined: Self = StObject.set(x, "rootDirectory", js.undefined)
  }
}
