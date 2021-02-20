package typings.storybookAddons.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrapperSettings extends StObject {
  
  var options: OptionsParameter = js.native
  
  var parameters: StringDictionary[js.Any] = js.native
}
object WrapperSettings {
  
  @scala.inline
  def apply(options: OptionsParameter, parameters: StringDictionary[js.Any]): WrapperSettings = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapperSettings]
  }
  
  @scala.inline
  implicit class WrapperSettingsMutableBuilder[Self <: WrapperSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: OptionsParameter): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: StringDictionary[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
