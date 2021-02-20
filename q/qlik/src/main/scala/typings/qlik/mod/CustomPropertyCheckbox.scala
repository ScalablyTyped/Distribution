package typings.qlik.mod

import typings.qlik.qlikStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPropertyCheckbox
  extends CustomPropertyCommon
     with CustomProperty {
  
  var defaultValue: js.UndefOr[Boolean] = js.native
  
  @JSName("type")
  var type_CustomPropertyCheckbox: boolean = js.native
}
object CustomPropertyCheckbox {
  
  @scala.inline
  def apply(`type`: boolean): CustomPropertyCheckbox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyCheckbox]
  }
  
  @scala.inline
  implicit class CustomPropertyCheckboxMutableBuilder[Self <: CustomPropertyCheckbox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
