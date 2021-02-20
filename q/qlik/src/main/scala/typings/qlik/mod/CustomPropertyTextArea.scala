package typings.qlik.mod

import typings.qlik.qlikStrings.string
import typings.qlik.qlikStrings.textarea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPropertyTextArea
  extends CustomPropertyCommon
     with CustomProperty {
  
  var component: textarea = js.native
  
  var defaultValue: js.UndefOr[String] = js.native
  
  var maxlength: js.UndefOr[Double] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CustomPropertyTextArea: string = js.native
}
object CustomPropertyTextArea {
  
  @scala.inline
  def apply(component: textarea, `type`: string): CustomPropertyTextArea = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyTextArea]
  }
  
  @scala.inline
  implicit class CustomPropertyTextAreaMutableBuilder[Self <: CustomPropertyTextArea] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: textarea): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setMaxlength(value: Double): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
