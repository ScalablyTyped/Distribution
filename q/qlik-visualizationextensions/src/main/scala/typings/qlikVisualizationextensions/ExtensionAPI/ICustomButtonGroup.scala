package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.buttongroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomButtonGroup extends ICustomControl {
  
  var component: buttongroup = js.native
  
  var defaultValue: String = js.native
  
  var options: valueOrfunc[ICustomControlOption] = js.native
}
object ICustomButtonGroup {
  
  @scala.inline
  def apply(
    component: buttongroup,
    defaultValue: String,
    label: String,
    options: valueOrfunc[ICustomControlOption],
    ref: String,
    `type`: String
  ): ICustomButtonGroup = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomButtonGroup]
  }
  
  @scala.inline
  implicit class ICustomButtonGroupMutableBuilder[Self <: ICustomButtonGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: buttongroup): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: valueOrfunc[ICustomControlOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsFunction0(value: () => ICustomControlOption): Self = StObject.set(x, "options", js.Any.fromFunction0(value))
  }
}
