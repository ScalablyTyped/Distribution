package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.radiobuttons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICustomRadioButton
  extends StObject
     with ICustomControl {
  
  var component: radiobuttons
  
  var defaultValue: String
  
  var options: valueOrfunc[ICustomControlOption]
}
object ICustomRadioButton {
  
  inline def apply(
    defaultValue: String,
    label: String,
    options: valueOrfunc[ICustomControlOption],
    ref: String,
    `type`: String
  ): ICustomRadioButton = {
    val __obj = js.Dynamic.literal(component = "radiobuttons", defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomRadioButton]
  }
  
  extension [Self <: ICustomRadioButton](x: Self) {
    
    inline def setComponent(value: radiobuttons): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: valueOrfunc[ICustomControlOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsFunction0(value: () => ICustomControlOption): Self = StObject.set(x, "options", js.Any.fromFunction0(value))
  }
}
