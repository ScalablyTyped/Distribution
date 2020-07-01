package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.rcFieldFormBooleans.`false`
import typings.rcFieldForm.rcFieldFormBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<rc-field-form.rc-field-form/es/interface.FormInstance, 'validateFields'> & {  validateFields  :rc-field-form.rc-field-form/es/interface.InternalValidateFields,   prefixName ? :rc-field-form.rc-field-form/es/interface.InternalNamePath,   validateTrigger ? :string | std.Array<string> | false, getInternalHooks (secret : string): rc-field-form.rc-field-form/es/interface.InternalHooks | null} */
trait InternalFormInstance extends js.Object {
  var getFieldError: js.Function1[/* name */ NamePath, js.Array[String]]
  var getFieldValue: js.Function1[/* name */ NamePath, StoreValue]
  var getFieldsError: js.Function1[/* nameList */ js.UndefOr[js.Array[NamePath]], js.Array[FieldError]]
  var getFieldsValue: js.Function2[
    /* nameList */ js.UndefOr[js.Array[NamePath] | `true`], 
    /* filterFunc */ js.UndefOr[js.Function1[/* meta */ Meta, Boolean]], 
    Store
  ]
  var isFieldTouched: js.Function1[/* name */ NamePath, Boolean]
  var isFieldValidating: js.Function1[/* name */ NamePath, Boolean]
  var isFieldsTouched: js.Function2[
    /* nameList */ js.UndefOr[js.Array[NamePath]], 
    /* allFieldsTouched */ js.UndefOr[Boolean], 
    Boolean
  ]
  var isFieldsValidating: js.Function1[/* nameList */ js.Array[NamePath], Boolean]
  /**
    * Passed by field context props
    */
  var prefixName: js.UndefOr[InternalNamePath] = js.undefined
  var resetFields: js.Function1[/* fields */ js.UndefOr[js.Array[NamePath]], Unit]
  var setFields: js.Function1[/* fields */ js.Array[FieldData], Unit]
  var setFieldsValue: js.Function1[/* value */ Store, Unit]
  var submit: js.Function0[Unit]
  var validateFields: InternalValidateFields
  var validateTrigger: js.UndefOr[String | js.Array[String] | `false`] = js.undefined
  /**
    * Form component should register some content into store.
    * We pass the `HOOK_MARK` as key to avoid user call the function.
    */
  def getInternalHooks(secret: String): InternalHooks | Null
}

object InternalFormInstance {
  @scala.inline
  def apply(
    getFieldError: /* name */ NamePath => js.Array[String],
    getFieldValue: /* name */ NamePath => StoreValue,
    getFieldsError: /* nameList */ js.UndefOr[js.Array[NamePath]] => js.Array[FieldError],
    getFieldsValue: (/* nameList */ js.UndefOr[js.Array[NamePath] | `true`], /* filterFunc */ js.UndefOr[js.Function1[/* meta */ Meta, Boolean]]) => Store,
    getInternalHooks: String => InternalHooks | Null,
    isFieldTouched: /* name */ NamePath => Boolean,
    isFieldValidating: /* name */ NamePath => Boolean,
    isFieldsTouched: (/* nameList */ js.UndefOr[js.Array[NamePath]], /* allFieldsTouched */ js.UndefOr[Boolean]) => Boolean,
    isFieldsValidating: /* nameList */ js.Array[NamePath] => Boolean,
    resetFields: /* fields */ js.UndefOr[js.Array[NamePath]] => Unit,
    setFields: /* fields */ js.Array[FieldData] => Unit,
    setFieldsValue: /* value */ Store => Unit,
    submit: () => Unit,
    validateFields: (/* nameList */ js.UndefOr[js.Array[NamePath]], /* options */ js.UndefOr[ValidateOptions]) => js.Promise[Store],
    prefixName: InternalNamePath = null,
    validateTrigger: String | js.Array[String] | `false` = null
  ): InternalFormInstance = {
    val __obj = js.Dynamic.literal(getFieldError = js.Any.fromFunction1(getFieldError), getFieldValue = js.Any.fromFunction1(getFieldValue), getFieldsError = js.Any.fromFunction1(getFieldsError), getFieldsValue = js.Any.fromFunction2(getFieldsValue), getInternalHooks = js.Any.fromFunction1(getInternalHooks), isFieldTouched = js.Any.fromFunction1(isFieldTouched), isFieldValidating = js.Any.fromFunction1(isFieldValidating), isFieldsTouched = js.Any.fromFunction2(isFieldsTouched), isFieldsValidating = js.Any.fromFunction1(isFieldsValidating), resetFields = js.Any.fromFunction1(resetFields), setFields = js.Any.fromFunction1(setFields), setFieldsValue = js.Any.fromFunction1(setFieldsValue), submit = js.Any.fromFunction0(submit), validateFields = js.Any.fromFunction2(validateFields))
    if (prefixName != null) __obj.updateDynamic("prefixName")(prefixName.asInstanceOf[js.Any])
    if (validateTrigger != null) __obj.updateDynamic("validateTrigger")(validateTrigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalFormInstance]
  }
}

