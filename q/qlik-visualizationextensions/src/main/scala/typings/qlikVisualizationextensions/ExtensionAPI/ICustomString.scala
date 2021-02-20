package typings.qlikVisualizationextensions.ExtensionAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomString extends ICustomControl {
  
  var defaultValue: String = js.native
  
  var expression: ExpressionType = js.native
  
  var maxlength: Double = js.native
  
  var show: valueOrfunc[Boolean] = js.native
}
object ICustomString {
  
  @scala.inline
  def apply(
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
  implicit class ICustomStringMutableBuilder[Self <: ICustomString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: ExpressionType): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxlength(value: Double): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: valueOrfunc[Boolean]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFunction0(value: () => Boolean): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
