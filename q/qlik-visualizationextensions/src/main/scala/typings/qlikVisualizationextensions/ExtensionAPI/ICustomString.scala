package typings.qlikVisualizationextensions.ExtensionAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICustomString
  extends StObject
     with ICustomControl {
  
  var defaultValue: String
  
  var expression: ExpressionType
  
  var maxlength: Double
  
  var show: valueOrfunc[Boolean]
}
object ICustomString {
  
  inline def apply(
    defaultValue: String,
    expression: ExpressionType,
    label: String,
    maxlength: Double,
    ref: String,
    show: valueOrfunc[Boolean],
    `type`: String
  ): ICustomString = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxlength = maxlength.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICustomString] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setExpression(value: ExpressionType): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setMaxlength(value: Double): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    inline def setShow(value: valueOrfunc[Boolean]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowFunction0(value: () => Boolean): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
