package typings.storybookCoreCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigDir extends StObject {
  
  var configDir: String
}
object ConfigDir {
  
  inline def apply(configDir: String): ConfigDir = {
    val __obj = js.Dynamic.literal(configDir = configDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigDir]
  }
  
  extension [Self <: ConfigDir](x: Self) {
    
    inline def setConfigDir(value: String): Self = StObject.set(x, "configDir", value.asInstanceOf[js.Any])
  }
}
