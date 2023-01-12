package typings.qlik.mod

import typings.qlik.qlikStrings.boolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPropertyCheckbox
  extends StObject
     with CustomPropertyCommon
     with CustomProperty {
  
  var defaultValue: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_CustomPropertyCheckbox: boolean
}
object CustomPropertyCheckbox {
  
  inline def apply(): CustomPropertyCheckbox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[CustomPropertyCheckbox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomPropertyCheckbox] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: Boolean): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
