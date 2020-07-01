package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.useFormMod.ReducerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalHooks extends js.Object {
  def dispatch(action: ReducerAction): Unit = js.native
  def getFields(): js.Array[FieldData] = js.native
  def getFields(namePathList: js.Array[InternalNamePath]): js.Array[FieldData] = js.native
  def registerField(entity: FieldEntity): js.Function0[Unit] = js.native
  def setCallbacks(callbacks: Callbacks): Unit = js.native
  def setInitialValues(values: Store, init: Boolean): Unit = js.native
  def setPreserve(): Unit = js.native
  def setPreserve(preserve: Boolean): Unit = js.native
  def setValidateMessages(validateMessages: ValidateMessages): Unit = js.native
  def useSubscribe(subscribable: Boolean): Unit = js.native
}

