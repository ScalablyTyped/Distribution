package typings
package reduxDashFormLib.libActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/actions", JSImport.Default)
@js.native
object default extends js.Object {
  var arrayInsert: js.Function4[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* index */ scala.Double, 
    /* value */ js.Any, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var arrayMove: js.Function4[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* from */ scala.Double, 
    /* to */ scala.Double, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var arrayPop: js.Function2[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var arrayPush: js.Function3[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* value */ js.Any, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var arrayRemove: js.Function3[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* index */ scala.Double, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var arrayRemoveAll: js.Function2[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var arrayShift: js.Function2[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var arraySplice: js.Function5[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* index */ scala.Double, 
    /* removeNum */ scala.Double, 
    /* value */ js.Any, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var arraySwap: js.Function4[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* indexA */ scala.Double, 
    /* indexB */ scala.Double, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var arrayUnshift: js.Function3[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* value */ js.Any, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var autofill: js.Function3[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* value */ js.Any, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var blur: js.Function4[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* value */ js.Any, 
    /* touch */ js.UndefOr[scala.Boolean], 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var change: js.Function5[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* value */ js.Any, 
    /* touch */ js.UndefOr[scala.Boolean], 
    /* persistentSubmitErrors */ js.UndefOr[scala.Boolean], 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var clearAsyncError: js.Function2[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var clearFields: js.Function4[
    /* form */ java.lang.String, 
    /* keepTouched */ scala.Boolean, 
    /* persistentSubmitErrors */ scala.Boolean, 
    /* repeated */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var clearSubmit: js.Function1[/* form */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction] = js.native
  var clearSubmitErrors: js.Function1[/* form */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction] = js.native
  var destroy: js.Function1[/* repeated */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction] = js.native
  var focus: js.Function2[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var initialize: reduxDashFormLib.Fn_Data = js.native
  var registerField: js.Function3[
    /* form */ java.lang.String, 
    /* name */ java.lang.String, 
    /* type */ reduxDashFormLib.reduxDashFormMod.FieldType, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var reset: js.Function1[/* form */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction] = js.native
  var setSubmitFailed: js.Function2[
    /* form */ java.lang.String, 
    /* repeated */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var setSubmitSucceeded: js.Function2[
    /* form */ java.lang.String, 
    /* repeated */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var startAsyncValidation: js.Function1[/* form */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction] = js.native
  var startSubmit: js.Function1[/* form */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction] = js.native
  var stopAsyncValidation: js.Function2[
    /* form */ java.lang.String, 
    /* errors */ js.UndefOr[reduxDashFormLib.reduxDashFormMod.FormErrors[_, _]], 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var stopSubmit: js.Function2[
    /* form */ java.lang.String, 
    /* errors */ js.UndefOr[reduxDashFormLib.reduxDashFormMod.FormErrors[_, _]], 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var submit: js.Function1[/* form */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction] = js.native
  var touch: js.Function2[
    /* form */ java.lang.String, 
    /* repeated */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var unregisterField: js.Function2[
    /* form */ java.lang.String, 
    /* name */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var untouch: js.Function2[
    /* form */ java.lang.String, 
    /* repeated */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ] = js.native
  var updateSyncErrors: reduxDashFormLib.Fn_Error = js.native
  var updateSyncWarnings: reduxDashFormLib.Fn_Form = js.native
}

