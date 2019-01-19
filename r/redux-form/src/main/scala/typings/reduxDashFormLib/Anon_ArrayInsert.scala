package typings
package reduxDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrayInsert extends js.Object {
  @JSName("arrayInsert")
  var arrayInsert_Original: js.Function4[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* index */ scala.Double, 
    /* value */ js.Any, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("arrayMove")
  var arrayMove_Original: js.Function4[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* from */ scala.Double, 
    /* to */ scala.Double, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("arrayPop")
  var arrayPop_Original: js.Function2[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("arrayPush")
  var arrayPush_Original: js.Function3[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* value */ js.Any, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("arrayRemoveAll")
  var arrayRemoveAll_Original: js.Function2[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("arrayRemove")
  var arrayRemove_Original: js.Function3[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* index */ scala.Double, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("arrayShift")
  var arrayShift_Original: js.Function2[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("arraySplice")
  var arraySplice_Original: js.Function5[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* index */ scala.Double, 
    /* removeNum */ scala.Double, 
    /* value */ js.Any, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("arraySwap")
  var arraySwap_Original: js.Function4[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* indexA */ scala.Double, 
    /* indexB */ scala.Double, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("arrayUnshift")
  var arrayUnshift_Original: js.Function3[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* value */ js.Any, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("autofill")
  var autofill_Original: js.Function3[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* value */ js.Any, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("blur")
  var blur_Original: js.Function4[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* value */ js.Any, 
    /* touch */ js.UndefOr[scala.Boolean], 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("change")
  var change_Original: js.Function5[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* value */ js.Any, 
    /* touch */ js.UndefOr[scala.Boolean], 
    /* persistentSubmitErrors */ js.UndefOr[scala.Boolean], 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("clearAsyncError")
  var clearAsyncError_Original: js.Function2[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("clearFields")
  var clearFields_Original: js.Function4[
    /* form */ java.lang.String, 
    /* keepTouched */ scala.Boolean, 
    /* persistentSubmitErrors */ scala.Boolean, 
    /* repeated */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("clearSubmitErrors")
  var clearSubmitErrors_Original: js.Function1[/* form */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction] = js.native
  @JSName("clearSubmit")
  var clearSubmit_Original: js.Function1[/* form */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction] = js.native
  @JSName("destroy")
  var destroy_Original: js.Function1[/* repeated */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction] = js.native
  @JSName("focus")
  var focus_Original: js.Function2[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("initialize")
  var initialize_Original: Anon_Data = js.native
  @JSName("registerField")
  var registerField_Original: js.Function3[
    /* form */ java.lang.String, 
    /* name */ java.lang.String, 
    /* type */ reduxDashFormLib.reduxDashFormMod.FieldType, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("reset")
  var reset_Original: js.Function1[/* form */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction] = js.native
  @JSName("setSubmitFailed")
  var setSubmitFailed_Original: js.Function2[
    /* form */ java.lang.String, 
    /* repeated */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("setSubmitSucceeded")
  var setSubmitSucceeded_Original: js.Function2[
    /* form */ java.lang.String, 
    /* repeated */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("startAsyncValidation")
  var startAsyncValidation_Original: js.Function1[/* form */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction] = js.native
  @JSName("startSubmit")
  var startSubmit_Original: js.Function1[/* form */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction] = js.native
  @JSName("stopAsyncValidation")
  var stopAsyncValidation_Original: js.Function2[
    /* form */ java.lang.String, 
    /* errors */ js.UndefOr[reduxDashFormLib.reduxDashFormMod.FormErrors[stdLib.FormData, _]], 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("stopSubmit")
  var stopSubmit_Original: js.Function2[
    /* form */ java.lang.String, 
    /* errors */ js.UndefOr[reduxDashFormLib.reduxDashFormMod.FormErrors[stdLib.FormData, _]], 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("submit")
  var submit_Original: js.Function1[/* form */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction] = js.native
  @JSName("touch")
  var touch_Original: js.Function2[
    /* form */ java.lang.String, 
    /* repeated */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("unregisterField")
  var unregisterField_Original: js.Function2[
    /* form */ java.lang.String, 
    /* name */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("untouch")
  var untouch_Original: js.Function2[
    /* form */ java.lang.String, 
    /* repeated */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  @JSName("updateSyncErrors")
  var updateSyncErrors_Original: Anon_Error = js.native
  @JSName("updateSyncWarnings")
  var updateSyncWarnings_Original: Anon_FormSyncWarnings = js.native
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

