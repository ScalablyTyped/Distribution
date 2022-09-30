package typings.storybookCoreCommon.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadedPreset extends StObject {
  
  var name: String
  
  var options: Any
  
  var preset: Any
}
object LoadedPreset {
  
  inline def apply(name: String, options: Any, preset: Any): LoadedPreset = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], preset = preset.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadedPreset]
  }
  
  extension [Self <: LoadedPreset](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPreset(value: Any): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
  }
}
