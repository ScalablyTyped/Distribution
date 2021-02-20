package typings.sharepoint.SP.JsGrid

import typings.sharepoint.anon.DataValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPropertyType extends StObject {
  
  def BeginValidateNormalizeConvert(
    recordKey: Double,
    fieldKey: String,
    newValue: js.Any,
    bIsLocalized: Boolean,
    fnCallback: js.Function1[/* args */ DataValue, Unit],
    fnError: js.Any
  ): Unit = js.native
  
  var ID: String = js.native
}
object IPropertyType {
  
  @scala.inline
  def apply(
    BeginValidateNormalizeConvert: (Double, String, js.Any, Boolean, js.Function1[/* args */ DataValue, Unit], js.Any) => Unit,
    ID: String
  ): IPropertyType = {
    val __obj = js.Dynamic.literal(BeginValidateNormalizeConvert = js.Any.fromFunction6(BeginValidateNormalizeConvert), ID = ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyType]
  }
  
  @scala.inline
  implicit class IPropertyTypeMutableBuilder[Self <: IPropertyType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginValidateNormalizeConvert(value: (Double, String, js.Any, Boolean, js.Function1[/* args */ DataValue, Unit], js.Any) => Unit): Self = StObject.set(x, "BeginValidateNormalizeConvert", js.Any.fromFunction6(value))
    
    @scala.inline
    def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
  }
}
