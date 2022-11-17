package typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<rc-field-form.rc-field-form/es/interface.FormInstance<any>, 'validateFields'> & {  validateFields :rc-field-form.rc-field-form/es/interface.InternalValidateFields<any>,   prefixName :rc-field-form.rc-field-form/es/interface.InternalNamePath | undefined,   validateTrigger :string | std.Array<string> | false | undefined, getInternalHooks (secret : string): rc-field-form.rc-field-form/es/interface.InternalHooks | null,   _init :boolean | undefined} */
trait InternalFormInstance extends StObject {
  
  /** @private Internal usage. Do not use it in your production */
  var _init: js.UndefOr[Boolean] = js.undefined
  
  var getFieldError: js.Function1[/* name */ NamePath, js.Array[String]]
  
  var getFieldValue: js.Function1[/* name */ NamePath, StoreValue]
  
  var getFieldWarning: js.Function1[/* name */ NamePath, js.Array[String]]
  
  var getFieldsError: js.Function1[/* nameList */ js.UndefOr[js.Array[NamePath]], js.Array[FieldError]]
  
  var getFieldsValue: js.Function0[Any] & (js.Function2[
    /* nameList */ js.Array[NamePath] | true, 
    /* filterFunc */ js.UndefOr[js.Function1[/* meta */ Meta, Boolean]], 
    Any
  ])
  
  /**
    * Form component should register some content into store.
    * We pass the `HOOK_MARK` as key to avoid user call the function.
    */
  def getInternalHooks(secret: String): InternalHooks | Null
  
  var isFieldTouched: js.Function1[/* name */ NamePath, Boolean]
  
  var isFieldValidating: js.Function1[/* name */ NamePath, Boolean]
  
  var isFieldsTouched: (js.Function2[
    /* nameList */ js.UndefOr[js.Array[NamePath]], 
    /* allFieldsTouched */ js.UndefOr[Boolean], 
    Boolean
  ]) & (js.Function1[/* allFieldsTouched */ js.UndefOr[Boolean], Boolean])
  
  var isFieldsValidating: js.Function1[/* nameList */ js.Array[NamePath], Boolean]
  
  /**
    * Passed by field context props
    */
  var prefixName: js.UndefOr[InternalNamePath] = js.undefined
  
  var resetFields: js.Function1[/* fields */ js.UndefOr[js.Array[NamePath]], Unit]
  
  var setFieldValue: js.Function2[/* name */ NamePath, /* value */ Any, Unit]
  
  var setFields: js.Function1[/* fields */ js.Array[FieldData], Unit]
  
  var setFieldsValue: js.Function1[/* values */ RecursivePartial[Any], Unit]
  
  var submit: js.Function0[Unit]
  
  var validateFields: InternalValidateFields[Any]
  
  var validateTrigger: js.UndefOr[String | js.Array[String] | false] = js.undefined
}
object InternalFormInstance {
  
  inline def apply(
    getFieldError: /* name */ NamePath => js.Array[String],
    getFieldValue: /* name */ NamePath => StoreValue,
    getFieldWarning: /* name */ NamePath => js.Array[String],
    getFieldsError: /* nameList */ js.UndefOr[js.Array[NamePath]] => js.Array[FieldError],
    getFieldsValue: js.Function0[Any] & (js.Function2[
      /* nameList */ js.Array[NamePath] | true, 
      /* filterFunc */ js.UndefOr[js.Function1[/* meta */ Meta, Boolean]], 
      Any
    ]),
    getInternalHooks: String => InternalHooks | Null,
    isFieldTouched: /* name */ NamePath => Boolean,
    isFieldValidating: /* name */ NamePath => Boolean,
    isFieldsTouched: (js.Function2[
      /* nameList */ js.UndefOr[js.Array[NamePath]], 
      /* allFieldsTouched */ js.UndefOr[Boolean], 
      Boolean
    ]) & (js.Function1[/* allFieldsTouched */ js.UndefOr[Boolean], Boolean]),
    isFieldsValidating: /* nameList */ js.Array[NamePath] => Boolean,
    resetFields: /* fields */ js.UndefOr[js.Array[NamePath]] => Unit,
    setFieldValue: (/* name */ NamePath, /* value */ Any) => Unit,
    setFields: /* fields */ js.Array[FieldData] => Unit,
    setFieldsValue: /* values */ RecursivePartial[Any] => Unit,
    submit: () => Unit,
    validateFields: (/* nameList */ js.UndefOr[js.Array[NamePath]], /* options */ js.UndefOr[ValidateOptions]) => js.Promise[Any]
  ): InternalFormInstance = {
    val __obj = js.Dynamic.literal(getFieldError = js.Any.fromFunction1(getFieldError), getFieldValue = js.Any.fromFunction1(getFieldValue), getFieldWarning = js.Any.fromFunction1(getFieldWarning), getFieldsError = js.Any.fromFunction1(getFieldsError), getFieldsValue = getFieldsValue.asInstanceOf[js.Any], getInternalHooks = js.Any.fromFunction1(getInternalHooks), isFieldTouched = js.Any.fromFunction1(isFieldTouched), isFieldValidating = js.Any.fromFunction1(isFieldValidating), isFieldsTouched = isFieldsTouched.asInstanceOf[js.Any], isFieldsValidating = js.Any.fromFunction1(isFieldsValidating), resetFields = js.Any.fromFunction1(resetFields), setFieldValue = js.Any.fromFunction2(setFieldValue), setFields = js.Any.fromFunction1(setFields), setFieldsValue = js.Any.fromFunction1(setFieldsValue), submit = js.Any.fromFunction0(submit), validateFields = js.Any.fromFunction2(validateFields))
    __obj.asInstanceOf[InternalFormInstance]
  }
  
  extension [Self <: InternalFormInstance](x: Self) {
    
    inline def setGetFieldError(value: /* name */ NamePath => js.Array[String]): Self = StObject.set(x, "getFieldError", js.Any.fromFunction1(value))
    
    inline def setGetFieldValue(value: /* name */ NamePath => StoreValue): Self = StObject.set(x, "getFieldValue", js.Any.fromFunction1(value))
    
    inline def setGetFieldWarning(value: /* name */ NamePath => js.Array[String]): Self = StObject.set(x, "getFieldWarning", js.Any.fromFunction1(value))
    
    inline def setGetFieldsError(value: /* nameList */ js.UndefOr[js.Array[NamePath]] => js.Array[FieldError]): Self = StObject.set(x, "getFieldsError", js.Any.fromFunction1(value))
    
    inline def setGetFieldsValue(
      value: js.Function0[Any] & (js.Function2[
          /* nameList */ js.Array[NamePath] | true, 
          /* filterFunc */ js.UndefOr[js.Function1[/* meta */ Meta, Boolean]], 
          Any
        ])
    ): Self = StObject.set(x, "getFieldsValue", value.asInstanceOf[js.Any])
    
    inline def setGetInternalHooks(value: String => InternalHooks | Null): Self = StObject.set(x, "getInternalHooks", js.Any.fromFunction1(value))
    
    inline def setIsFieldTouched(value: /* name */ NamePath => Boolean): Self = StObject.set(x, "isFieldTouched", js.Any.fromFunction1(value))
    
    inline def setIsFieldValidating(value: /* name */ NamePath => Boolean): Self = StObject.set(x, "isFieldValidating", js.Any.fromFunction1(value))
    
    inline def setIsFieldsTouched(
      value: (js.Function2[
          /* nameList */ js.UndefOr[js.Array[NamePath]], 
          /* allFieldsTouched */ js.UndefOr[Boolean], 
          Boolean
        ]) & (js.Function1[/* allFieldsTouched */ js.UndefOr[Boolean], Boolean])
    ): Self = StObject.set(x, "isFieldsTouched", value.asInstanceOf[js.Any])
    
    inline def setIsFieldsValidating(value: /* nameList */ js.Array[NamePath] => Boolean): Self = StObject.set(x, "isFieldsValidating", js.Any.fromFunction1(value))
    
    inline def setPrefixName(value: InternalNamePath): Self = StObject.set(x, "prefixName", value.asInstanceOf[js.Any])
    
    inline def setPrefixNameUndefined: Self = StObject.set(x, "prefixName", js.undefined)
    
    inline def setPrefixNameVarargs(value: (String | Double)*): Self = StObject.set(x, "prefixName", js.Array(value*))
    
    inline def setResetFields(value: /* fields */ js.UndefOr[js.Array[NamePath]] => Unit): Self = StObject.set(x, "resetFields", js.Any.fromFunction1(value))
    
    inline def setSetFieldValue(value: (/* name */ NamePath, /* value */ Any) => Unit): Self = StObject.set(x, "setFieldValue", js.Any.fromFunction2(value))
    
    inline def setSetFields(value: /* fields */ js.Array[FieldData] => Unit): Self = StObject.set(x, "setFields", js.Any.fromFunction1(value))
    
    inline def setSetFieldsValue(value: /* values */ RecursivePartial[Any] => Unit): Self = StObject.set(x, "setFieldsValue", js.Any.fromFunction1(value))
    
    inline def setSubmit(value: () => Unit): Self = StObject.set(x, "submit", js.Any.fromFunction0(value))
    
    inline def setValidateFields(
      value: (/* nameList */ js.UndefOr[js.Array[NamePath]], /* options */ js.UndefOr[ValidateOptions]) => js.Promise[Any]
    ): Self = StObject.set(x, "validateFields", js.Any.fromFunction2(value))
    
    inline def setValidateTrigger(value: String | js.Array[String] | false): Self = StObject.set(x, "validateTrigger", value.asInstanceOf[js.Any])
    
    inline def setValidateTriggerUndefined: Self = StObject.set(x, "validateTrigger", js.undefined)
    
    inline def setValidateTriggerVarargs(value: String*): Self = StObject.set(x, "validateTrigger", js.Array(value*))
    
    inline def set_init(value: Boolean): Self = StObject.set(x, "_init", value.asInstanceOf[js.Any])
    
    inline def set_initUndefined: Self = StObject.set(x, "_init", js.undefined)
  }
}
