package typings.reduxForm.reduxFormMod

import typings.reduxForm.fieldMod.Validator
import typings.reduxForm.reduxFormStrings.blur
import typings.reduxForm.reduxFormStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReduxFormContext extends js.Object {
  var form: String = js.native
  var getFormState: GetFormState = js.native
  var prefixName: js.UndefOr[String] = js.native
  var sectionPrefix: js.UndefOr[String] = js.native
  def asyncValidate(): js.Promise[_] = js.native
  def asyncValidate(name: String): js.Promise[_] = js.native
  def asyncValidate(name: String, value: js.Any): js.Promise[_] = js.native
  @JSName("asyncValidate")
  def asyncValidate_blur(name: String, value: js.Any, trigger: blur): js.Promise[_] = js.native
  @JSName("asyncValidate")
  def asyncValidate_change(name: String, value: js.Any, trigger: change): js.Promise[_] = js.native
  def blur(name: String, value: js.Any): Unit = js.native
  def change(name: String, value: js.Any): Unit = js.native
  def focus(name: String): Unit = js.native
  def getValues(): js.Any = js.native
  def register(name: String, `type`: String): Unit = js.native
  def register(name: String, `type`: String, getValidator: js.Function0[Validator | js.Array[Validator]]): Unit = js.native
  def register(
    name: String,
    `type`: String,
    getValidator: js.Function0[Validator | js.Array[Validator]],
    getWarner: js.Function0[Validator | js.Array[Validator]]
  ): Unit = js.native
  def registerInnerOnSubmit(innerOnSubmit: js.Function0[Unit]): Unit = js.native
  def unregister(name: String): Unit = js.native
}

