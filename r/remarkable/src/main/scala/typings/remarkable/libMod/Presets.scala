package typings.remarkable.libMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Presets extends StObject {
  
  var components: StringDictionary[typings.remarkable.anon.Rules]
  
  var options: Options
}
object Presets {
  
  inline def apply(components: StringDictionary[typings.remarkable.anon.Rules], options: Options): Presets = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Presets]
  }
  
  extension [Self <: Presets](x: Self) {
    
    inline def setComponents(value: StringDictionary[typings.remarkable.anon.Rules]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
