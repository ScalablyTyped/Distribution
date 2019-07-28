package typings.reduxDashForm.libActionsMod

import typings.reduxDashForm.Fn_Data
import typings.reduxDashForm.Fn_Error
import typings.reduxDashForm.Fn_Form
import typings.reduxDashForm.reduxDashFormMod.FieldType
import typings.reduxDashForm.reduxDashFormMod.FormErrors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-form/lib/actions", JSImport.Default)
@js.native
object default extends js.Object {
  var arrayInsert: js.Function4[
    /* form */ String, 
    /* field */ String, 
    /* index */ Double, 
    /* value */ js.Any, 
    FormAction
  ] = js.native
  var arrayMove: js.Function4[/* form */ String, /* field */ String, /* from */ Double, /* to */ Double, FormAction] = js.native
  var arrayPop: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
  var arrayPush: js.Function3[/* form */ String, /* field */ String, /* value */ js.Any, FormAction] = js.native
  var arrayRemove: js.Function3[/* form */ String, /* field */ String, /* index */ Double, FormAction] = js.native
  var arrayRemoveAll: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
  var arrayShift: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
  var arraySplice: js.Function5[
    /* form */ String, 
    /* field */ String, 
    /* index */ Double, 
    /* removeNum */ Double, 
    /* value */ js.Any, 
    FormAction
  ] = js.native
  var arraySwap: js.Function4[
    /* form */ String, 
    /* field */ String, 
    /* indexA */ Double, 
    /* indexB */ Double, 
    FormAction
  ] = js.native
  var arrayUnshift: js.Function3[/* form */ String, /* field */ String, /* value */ js.Any, FormAction] = js.native
  var autofill: js.Function3[/* form */ String, /* field */ String, /* value */ js.Any, FormAction] = js.native
  var blur: js.Function4[
    /* form */ String, 
    /* field */ String, 
    /* value */ js.Any, 
    /* touch */ js.UndefOr[Boolean], 
    FormAction
  ] = js.native
  var change: js.Function5[
    /* form */ String, 
    /* field */ String, 
    /* value */ js.Any, 
    /* touch */ js.UndefOr[Boolean], 
    /* persistentSubmitErrors */ js.UndefOr[Boolean], 
    FormAction
  ] = js.native
  var clearAsyncError: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
  var clearFields: js.Function4[
    /* form */ String, 
    /* keepTouched */ Boolean, 
    /* persistentSubmitErrors */ Boolean, 
    /* repeated */ String, 
    FormAction
  ] = js.native
  var clearSubmit: js.Function1[/* form */ String, FormAction] = js.native
  var clearSubmitErrors: js.Function1[/* form */ String, FormAction] = js.native
  var destroy: js.Function1[/* repeated */ String, FormAction] = js.native
  var focus: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
  var initialize: Fn_Data = js.native
  var registerField: js.Function3[/* form */ String, /* name */ String, /* type */ FieldType, FormAction] = js.native
  var reset: js.Function1[/* form */ String, FormAction] = js.native
  var setSubmitFailed: js.Function2[/* form */ String, /* repeated */ String, FormAction] = js.native
  var setSubmitSucceeded: js.Function2[/* form */ String, /* repeated */ String, FormAction] = js.native
  var startAsyncValidation: js.Function1[/* form */ String, FormAction] = js.native
  var startSubmit: js.Function1[/* form */ String, FormAction] = js.native
  var stopAsyncValidation: js.Function2[/* form */ String, /* errors */ js.UndefOr[FormErrors[_, _]], FormAction] = js.native
  var stopSubmit: js.Function2[/* form */ String, /* errors */ js.UndefOr[FormErrors[_, _]], FormAction] = js.native
  var submit: js.Function1[/* form */ String, FormAction] = js.native
  var touch: js.Function2[/* form */ String, /* repeated */ String, FormAction] = js.native
  var unregisterField: js.Function2[/* form */ String, /* name */ String, FormAction] = js.native
  var untouch: js.Function2[/* form */ String, /* repeated */ String, FormAction] = js.native
  var updateSyncErrors: Fn_Error = js.native
  var updateSyncWarnings: Fn_Form = js.native
}

