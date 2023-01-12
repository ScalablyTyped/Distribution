package typings.qlikVisualizationextensions.ExtensionAPI

import typings.qlikVisualizationextensions.qlikVisualizationextensionsStrings.textarea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICustomTextArea
  extends StObject
     with ICustomControl {
  
  var component: textarea
  
  var defaultValue: String
  
  var maxlength: Double
  
  var rows: Double
  
  var show: valueOrfunc[Boolean]
}
object ICustomTextArea {
  
  inline def apply(
    defaultValue: String,
    label: String,
    maxlength: Double,
    ref: String,
    rows: Double,
    show: valueOrfunc[Boolean],
    `type`: String
  ): ICustomTextArea = {
    val __obj = js.Dynamic.literal(component = "textarea", defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxlength = maxlength.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomTextArea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICustomTextArea] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: textarea): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setMaxlength(value: Double): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setShow(value: valueOrfunc[Boolean]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowFunction0(value: () => Boolean): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
