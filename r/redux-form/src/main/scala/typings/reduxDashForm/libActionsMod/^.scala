package typings.reduxDashForm.libActionsMod

import typings.reduxDashForm.reduxDashFormMod.FieldType
import typings.reduxDashForm.reduxDashFormMod.FormErrors
import typings.reduxDashForm.reduxDashFormMod.FormWarnings
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/actions", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def arrayInsert(form: String, field: String, index: Double, value: js.Any): FormAction = js.native
  def arrayMove(form: String, field: String, from: Double, to: Double): FormAction = js.native
  def arrayPop(form: String, field: String): FormAction = js.native
  def arrayPush(form: String, field: String, value: js.Any): FormAction = js.native
  def arrayRemove(form: String, field: String, index: Double): FormAction = js.native
  def arrayRemoveAll(form: String, field: String): FormAction = js.native
  def arrayShift(form: String, field: String): FormAction = js.native
  def arraySplice(form: String, field: String, index: Double, removeNum: Double, value: js.Any): FormAction = js.native
  def arraySwap(form: String, field: String, indexA: Double, indexB: Double): FormAction = js.native
  def arrayUnshift(form: String, field: String, value: js.Any): FormAction = js.native
  def autofill(form: String, field: String, value: js.Any): FormAction = js.native
  def blur(form: String, field: String, value: js.Any): FormAction = js.native
  def blur(form: String, field: String, value: js.Any, touch: Boolean): FormAction = js.native
  def change(form: String, field: String, value: js.Any): FormAction = js.native
  def change(form: String, field: String, value: js.Any, touch: Boolean): FormAction = js.native
  def change(form: String, field: String, value: js.Any, touch: Boolean, persistentSubmitErrors: Boolean): FormAction = js.native
  def clearAsyncError(form: String, field: String): FormAction = js.native
  def clearFields(form: String, keepTouched: Boolean, persistentSubmitErrors: Boolean, fields: String*): FormAction = js.native
  def clearSubmit(form: String): FormAction = js.native
  def clearSubmitErrors(form: String): FormAction = js.native
  def destroy(form: String*): FormAction = js.native
  def focus(form: String, field: String): FormAction = js.native
  def initialize(form: String, data: js.Any): FormAction = js.native
  def initialize(form: String, data: js.Any, keepDirty: Boolean): FormAction = js.native
  def initialize(form: String, data: js.Any, keepDirty: Boolean, options: Partial[InitializeOptions]): FormAction = js.native
  def initialize(form: String, data: js.Any, options: Partial[InitializeOptions]): FormAction = js.native
  def registerField(form: String, name: String, `type`: FieldType): FormAction = js.native
  def reset(form: String): FormAction = js.native
  def resetSection(form: String, sections: String*): FormAction = js.native
  def setSubmitFailed(form: String, fields: String*): FormAction = js.native
  def setSubmitSucceeded(form: String, fields: String*): FormAction = js.native
  def startAsyncValidation(form: String): FormAction = js.native
  def startSubmit(form: String): FormAction = js.native
  def stopAsyncValidation(form: String): FormAction = js.native
  def stopAsyncValidation(form: String, errors: FormErrors[_, _]): FormAction = js.native
  def stopSubmit(form: String): FormAction = js.native
  def stopSubmit(form: String, errors: FormErrors[_, _]): FormAction = js.native
  def submit(form: String): FormAction = js.native
  def touch(form: String, fields: String*): FormAction = js.native
  def unregisterField(form: String, name: String): FormAction = js.native
  def untouch(form: String, fields: String*): FormAction = js.native
  def updateSyncErrors[T](from: String, syncErrors: FormErrors[_, T], error: T): FormAction = js.native
  def updateSyncWarnings[T](form: String, syncWarnings: FormWarnings[_, T], warning: T): FormAction = js.native
}

