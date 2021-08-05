package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WrapperSettings extends StObject {
  
  var options: OptionsParameter
  
  var parameters: StringDictionary[js.Any]
}
object WrapperSettings {
  
  inline def apply(options: OptionsParameter, parameters: StringDictionary[js.Any]): WrapperSettings = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapperSettings]
  }
  
  extension [Self <: WrapperSettings](x: Self) {
    
    inline def setOptions(value: OptionsParameter): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: StringDictionary[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
