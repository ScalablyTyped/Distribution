package typings.qlik.mod

import typings.qlik.qlikStrings.StringExpr
import typings.qlik.qlikStrings.StringExpression
import typings.qlik.qlikStrings.ValueExpression
import typings.qlik.qlikStrings.dimension
import typings.qlik.qlikStrings.expression
import typings.qlik.qlikStrings.measure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPropertyExpression
  extends StObject
     with CustomPropertyCommon
     with CustomProperty {
  
  var component: expression
  
  var defaultValue: js.UndefOr[String] = js.undefined
  
  var expressionType: dimension | measure | StringExpr | typings.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression
  
  @JSName("type")
  var type_CustomPropertyExpression: Unit
}
object CustomPropertyExpression {
  
  @scala.inline
  def apply(
    expressionType: dimension | measure | StringExpr | typings.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression,
    `type`: Unit
  ): CustomPropertyExpression = {
    val __obj = js.Dynamic.literal(component = "expression", expressionType = expressionType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyExpression]
  }
  
  @scala.inline
  implicit class CustomPropertyExpressionMutableBuilder[Self <: CustomPropertyExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: expression): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setExpressionType(
      value: dimension | measure | StringExpr | typings.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression
    ): Self = StObject.set(x, "expressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
