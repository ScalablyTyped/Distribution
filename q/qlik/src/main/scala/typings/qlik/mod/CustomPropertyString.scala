package typings.qlik.mod

import typings.qlik.qlikStrings._empty
import typings.qlik.qlikStrings.always
import typings.qlik.qlikStrings.optional
import typings.qlik.qlikStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPropertyString
  extends CustomPropertyCommon
     with CustomProperty {
  
  var defaultValue: js.UndefOr[String] = js.native
  
  var expression: js.UndefOr[always | optional | _empty] = js.native
  
  var maxLength: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CustomPropertyString: string = js.native
}
object CustomPropertyString {
  
  @scala.inline
  def apply(`type`: string): CustomPropertyString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyString]
  }
  
  @scala.inline
  implicit class CustomPropertyStringMutableBuilder[Self <: CustomPropertyString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setExpression(value: always | optional | _empty): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
