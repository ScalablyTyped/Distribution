package typings.rcFieldForm.useFormMod

import typings.rcFieldForm.interfaceMod.InternalFormInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-field-form/es/useForm", "FormStore")
@js.native
class FormStore protected () extends js.Object {
  def this(forceRootUpdate: js.Function0[Unit]) = this()
  var callbacks: js.Any = js.native
  var dispatch: js.Any = js.native
  var fieldEntities: js.Any = js.native
  var forceRootUpdate: js.Any = js.native
  var formHooked: js.Any = js.native
  var getDependencyChildrenFields: js.Any = js.native
  /**
    * Get registered field entities.
    * @param pure Only return field which has a `name`. Default: false
    */
  var getFieldEntities: js.Any = js.native
  var getFieldEntitiesForNamePathList: js.Any = js.native
  var getFieldError: js.Any = js.native
  var getFieldValue: js.Any = js.native
  var getFields: js.Any = js.native
  var getFieldsError: js.Any = js.native
  var getFieldsMap: js.Any = js.native
  var getFieldsValue: js.Any = js.native
  var getInitialValue: js.Any = js.native
  var getInternalHooks: js.Any = js.native
  var initialValues: js.Any = js.native
  var isFieldTouched: js.Any = js.native
  var isFieldValidating: js.Any = js.native
  var isFieldsTouched: js.Any = js.native
  var isFieldsValidating: js.Any = js.native
  var lastValidatePromise: js.Any = js.native
  var notifyObservers: js.Any = js.native
  var preserve: js.Any = js.native
  var registerField: js.Any = js.native
  var resetFields: js.Any = js.native
  /**
    * Reset Field with field `initialValue` prop.
    * Can pass `entities` or `namePathList` or just nothing.
    */
  var resetWithFieldInitialValue: js.Any = js.native
  var setCallbacks: js.Any = js.native
  var setFields: js.Any = js.native
  var setFieldsValue: js.Any = js.native
  /**
    * First time `setInitialValues` should update store with initial value
    */
  var setInitialValues: js.Any = js.native
  var setPreserve: js.Any = js.native
  var setValidateMessages: js.Any = js.native
  var store: js.Any = js.native
  var submit: js.Any = js.native
  var subscribable: js.Any = js.native
  var timeoutId: js.Any = js.native
  var triggerOnFieldsChange: js.Any = js.native
  var updateValue: js.Any = js.native
  var useSubscribe: js.Any = js.native
  var validateFields: js.Any = js.native
  var validateMessages: js.Any = js.native
  var warningUnhooked: js.Any = js.native
  def getForm(): InternalFormInstance = js.native
}

