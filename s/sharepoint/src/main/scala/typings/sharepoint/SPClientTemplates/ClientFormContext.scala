package typings.sharepoint.SPClientTemplates

import typings.sharepoint.SPClientForms.ClientValidation.ValidatorSet
import typings.sharepoint.anon.AllowScriptableWebParts
import typings.sharepoint.anon.BaseType
import typings.sharepoint.anon.ExternalListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientFormContext extends StObject {
  
  var controlMode: Double
  
  var fieldName: String
  
  var fieldSchema: FieldSchemaInForm
  
  var fieldValue: Any
  
  var itemAttributes: ExternalListItem
  
  var listAttributes: BaseType
  
  def registerClientValidator(fieldname: String, validator: ValidatorSet): Unit
  
  def registerFocusCallback(fieldname: String, callback: js.Function0[Unit]): Unit
  
  def registerGetValueCallback(fieldname: String, callback: js.Function0[Any]): Unit
  
  def registerHasValueChangedCallback(fieldname: String, callback: js.Function1[/* eventArg */ js.UndefOr[Any], Unit]): Unit
  
  def registerInitCallback(fieldname: String, callback: js.Function0[Unit]): Unit
  
  def registerValidationErrorCallback(fieldname: String, callback: js.Function1[/* error */ Any, Unit]): Unit
  
  def updateControlValue(fieldname: String, value: Any): Unit
  
  var webAttributes: AllowScriptableWebParts
}
object ClientFormContext {
  
  inline def apply(
    controlMode: Double,
    fieldName: String,
    fieldSchema: FieldSchemaInForm,
    fieldValue: Any,
    itemAttributes: ExternalListItem,
    listAttributes: BaseType,
    registerClientValidator: (String, ValidatorSet) => Unit,
    registerFocusCallback: (String, js.Function0[Unit]) => Unit,
    registerGetValueCallback: (String, js.Function0[Any]) => Unit,
    registerHasValueChangedCallback: (String, js.Function1[/* eventArg */ js.UndefOr[Any], Unit]) => Unit,
    registerInitCallback: (String, js.Function0[Unit]) => Unit,
    registerValidationErrorCallback: (String, js.Function1[/* error */ Any, Unit]) => Unit,
    updateControlValue: (String, Any) => Unit,
    webAttributes: AllowScriptableWebParts
  ): ClientFormContext = {
    val __obj = js.Dynamic.literal(controlMode = controlMode.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], fieldSchema = fieldSchema.asInstanceOf[js.Any], fieldValue = fieldValue.asInstanceOf[js.Any], itemAttributes = itemAttributes.asInstanceOf[js.Any], listAttributes = listAttributes.asInstanceOf[js.Any], registerClientValidator = js.Any.fromFunction2(registerClientValidator), registerFocusCallback = js.Any.fromFunction2(registerFocusCallback), registerGetValueCallback = js.Any.fromFunction2(registerGetValueCallback), registerHasValueChangedCallback = js.Any.fromFunction2(registerHasValueChangedCallback), registerInitCallback = js.Any.fromFunction2(registerInitCallback), registerValidationErrorCallback = js.Any.fromFunction2(registerValidationErrorCallback), updateControlValue = js.Any.fromFunction2(updateControlValue), webAttributes = webAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientFormContext]
  }
  
  extension [Self <: ClientFormContext](x: Self) {
    
    inline def setControlMode(value: Double): Self = StObject.set(x, "controlMode", value.asInstanceOf[js.Any])
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldSchema(value: FieldSchemaInForm): Self = StObject.set(x, "fieldSchema", value.asInstanceOf[js.Any])
    
    inline def setFieldValue(value: Any): Self = StObject.set(x, "fieldValue", value.asInstanceOf[js.Any])
    
    inline def setItemAttributes(value: ExternalListItem): Self = StObject.set(x, "itemAttributes", value.asInstanceOf[js.Any])
    
    inline def setListAttributes(value: BaseType): Self = StObject.set(x, "listAttributes", value.asInstanceOf[js.Any])
    
    inline def setRegisterClientValidator(value: (String, ValidatorSet) => Unit): Self = StObject.set(x, "registerClientValidator", js.Any.fromFunction2(value))
    
    inline def setRegisterFocusCallback(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "registerFocusCallback", js.Any.fromFunction2(value))
    
    inline def setRegisterGetValueCallback(value: (String, js.Function0[Any]) => Unit): Self = StObject.set(x, "registerGetValueCallback", js.Any.fromFunction2(value))
    
    inline def setRegisterHasValueChangedCallback(value: (String, js.Function1[/* eventArg */ js.UndefOr[Any], Unit]) => Unit): Self = StObject.set(x, "registerHasValueChangedCallback", js.Any.fromFunction2(value))
    
    inline def setRegisterInitCallback(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "registerInitCallback", js.Any.fromFunction2(value))
    
    inline def setRegisterValidationErrorCallback(value: (String, js.Function1[/* error */ Any, Unit]) => Unit): Self = StObject.set(x, "registerValidationErrorCallback", js.Any.fromFunction2(value))
    
    inline def setUpdateControlValue(value: (String, Any) => Unit): Self = StObject.set(x, "updateControlValue", js.Any.fromFunction2(value))
    
    inline def setWebAttributes(value: AllowScriptableWebParts): Self = StObject.set(x, "webAttributes", value.asInstanceOf[js.Any])
  }
}
