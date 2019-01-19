package typings
package reduxDashFormLib.libActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/actions", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: reduxDashFormLib.Anon_ArrayInsert = js.native
  def arrayInsert(form: java.lang.String, field: java.lang.String, index: scala.Double, value: js.Any): reduxDashFormLib.libActionsMod.FormAction = js.native
  def arrayMove(form: java.lang.String, field: java.lang.String, from: scala.Double, to: scala.Double): reduxDashFormLib.libActionsMod.FormAction = js.native
  def arrayPop(form: java.lang.String, field: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def arrayPush(form: java.lang.String, field: java.lang.String, value: js.Any): reduxDashFormLib.libActionsMod.FormAction = js.native
  def arrayRemove(form: java.lang.String, field: java.lang.String, index: scala.Double): reduxDashFormLib.libActionsMod.FormAction = js.native
  def arrayRemoveAll(form: java.lang.String, field: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def arrayShift(form: java.lang.String, field: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def arraySplice(
    form: java.lang.String,
    field: java.lang.String,
    index: scala.Double,
    removeNum: scala.Double,
    value: js.Any
  ): reduxDashFormLib.libActionsMod.FormAction = js.native
  def arraySwap(form: java.lang.String, field: java.lang.String, indexA: scala.Double, indexB: scala.Double): reduxDashFormLib.libActionsMod.FormAction = js.native
  def arrayUnshift(form: java.lang.String, field: java.lang.String, value: js.Any): reduxDashFormLib.libActionsMod.FormAction = js.native
  def autofill(form: java.lang.String, field: java.lang.String, value: js.Any): reduxDashFormLib.libActionsMod.FormAction = js.native
  def blur(form: java.lang.String, field: java.lang.String, value: js.Any): reduxDashFormLib.libActionsMod.FormAction = js.native
  def blur(form: java.lang.String, field: java.lang.String, value: js.Any, touch: scala.Boolean): reduxDashFormLib.libActionsMod.FormAction = js.native
  def change(form: java.lang.String, field: java.lang.String, value: js.Any): reduxDashFormLib.libActionsMod.FormAction = js.native
  def change(form: java.lang.String, field: java.lang.String, value: js.Any, touch: scala.Boolean): reduxDashFormLib.libActionsMod.FormAction = js.native
  def change(
    form: java.lang.String,
    field: java.lang.String,
    value: js.Any,
    touch: scala.Boolean,
    persistentSubmitErrors: scala.Boolean
  ): reduxDashFormLib.libActionsMod.FormAction = js.native
  def clearAsyncError(form: java.lang.String, field: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def clearFields(
    form: java.lang.String,
    keepTouched: scala.Boolean,
    persistentSubmitErrors: scala.Boolean,
    fields: java.lang.String*
  ): reduxDashFormLib.libActionsMod.FormAction = js.native
  def clearSubmit(form: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def clearSubmitErrors(form: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def destroy(form: java.lang.String*): reduxDashFormLib.libActionsMod.FormAction = js.native
  def focus(form: java.lang.String, field: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def initialize(form: java.lang.String, data: js.Any): reduxDashFormLib.libActionsMod.FormAction = js.native
  def initialize(form: java.lang.String, data: js.Any, keepDirty: scala.Boolean): reduxDashFormLib.libActionsMod.FormAction = js.native
  def initialize(
    form: java.lang.String,
    data: js.Any,
    keepDirty: scala.Boolean,
    options: stdLib.Partial[reduxDashFormLib.libActionsMod.InitializeOptions]
  ): reduxDashFormLib.libActionsMod.FormAction = js.native
  def initialize(
    form: java.lang.String,
    data: js.Any,
    options: stdLib.Partial[reduxDashFormLib.libActionsMod.InitializeOptions]
  ): reduxDashFormLib.libActionsMod.FormAction = js.native
  def registerField(
    form: java.lang.String,
    name: java.lang.String,
    `type`: reduxDashFormLib.reduxDashFormMod.FieldType
  ): reduxDashFormLib.libActionsMod.FormAction = js.native
  def reset(form: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def resetSection(form: java.lang.String, sections: java.lang.String*): reduxDashFormLib.libActionsMod.FormAction = js.native
  def setSubmitFailed(form: java.lang.String, fields: java.lang.String*): reduxDashFormLib.libActionsMod.FormAction = js.native
  def setSubmitSucceeded(form: java.lang.String, fields: java.lang.String*): reduxDashFormLib.libActionsMod.FormAction = js.native
  def startAsyncValidation(form: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def startSubmit(form: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def stopAsyncValidation(form: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def stopAsyncValidation(form: java.lang.String, errors: reduxDashFormLib.reduxDashFormMod.FormErrors[stdLib.FormData, _]): reduxDashFormLib.libActionsMod.FormAction = js.native
  def stopSubmit(form: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def stopSubmit(form: java.lang.String, errors: reduxDashFormLib.reduxDashFormMod.FormErrors[stdLib.FormData, _]): reduxDashFormLib.libActionsMod.FormAction = js.native
  def submit(form: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def touch(form: java.lang.String, fields: java.lang.String*): reduxDashFormLib.libActionsMod.FormAction = js.native
  def unregisterField(form: java.lang.String, name: java.lang.String): reduxDashFormLib.libActionsMod.FormAction = js.native
  def untouch(form: java.lang.String, fields: java.lang.String*): reduxDashFormLib.libActionsMod.FormAction = js.native
  def updateSyncErrors[T](
    from: java.lang.String,
    syncErrors: reduxDashFormLib.reduxDashFormMod.FormErrors[stdLib.FormData, T],
    error: T
  ): reduxDashFormLib.libActionsMod.FormAction = js.native
  def updateSyncWarnings[T](
    form: java.lang.String,
    syncWarnings: reduxDashFormLib.reduxDashFormMod.FormWarnings[stdLib.FormData, T],
    warning: T
  ): reduxDashFormLib.libActionsMod.FormAction = js.native
}

