package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.switch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomSwitch extends StObject {
  
  var component: switch = js.native
  
  var defaultValue: Boolean = js.native
  
  var options: valueOrfunc[ICustomControlOption] = js.native
}
object ICustomSwitch {
  
  @scala.inline
  def apply(component: switch, defaultValue: Boolean, options: valueOrfunc[ICustomControlOption]): ICustomSwitch = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomSwitch]
  }
  
  @scala.inline
  implicit class ICustomSwitchMutableBuilder[Self <: ICustomSwitch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: switch): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: valueOrfunc[ICustomControlOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsFunction0(value: () => ICustomControlOption): Self = StObject.set(x, "options", js.Any.fromFunction0(value))
  }
}
