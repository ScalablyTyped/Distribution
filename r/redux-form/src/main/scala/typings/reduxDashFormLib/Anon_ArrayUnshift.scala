package typings
package reduxDashFormLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ArrayUnshift extends js.Object {
  var arrayInsert: js.Function4[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* index */ scala.Double, 
    /* value */ js.Any, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var arrayMove: js.Function4[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* from */ scala.Double, 
    /* to */ scala.Double, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var arrayPop: js.Function2[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var arrayPush: js.Function3[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* value */ js.Any, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var arrayRemove: js.Function3[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* index */ scala.Double, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var arrayRemoveAll: js.Function2[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var arrayShift: js.Function2[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var arraySplice: js.Function5[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* index */ scala.Double, 
    /* removeNum */ scala.Double, 
    /* value */ js.Any, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var arraySwap: js.Function4[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* indexA */ scala.Double, 
    /* indexB */ scala.Double, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var arrayUnshift: js.Function3[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* value */ js.Any, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var autofill: js.Function3[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* value */ js.Any, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var blur: js.Function3[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* value */ js.Any, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var change: js.Function3[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    /* value */ js.Any, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var clearAsyncError: js.Function2[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var clearFields: js.Function4[
    /* form */ java.lang.String, 
    /* keepTouched */ scala.Boolean, 
    /* persistentSubmitErrors */ scala.Boolean, 
    /* repeated */java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var clearSubmit: js.Function1[/* form */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction]
  var clearSubmitErrors: js.Function1[/* form */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction]
  var destroy: js.Function1[/* repeated */java.lang.String, reduxDashFormLib.libActionsMod.FormAction]
  var focus: js.Function2[
    /* form */ java.lang.String, 
    /* field */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var initialize: js.Function3[
    /* form */ java.lang.String, 
    /* data */ js.Any, 
    /* options */ js.UndefOr[stdLib.Partial[reduxDashFormLib.libActionsMod.InitializeOptions]], 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var registerField: js.Function3[
    /* form */ java.lang.String, 
    /* name */ java.lang.String, 
    /* type */ reduxDashFormLib.reduxDashFormMod.FieldType, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var reset: js.Function1[/* form */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction]
  var setSubmitFailed: js.Function2[
    /* form */ java.lang.String, 
    /* repeated */java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var setSubmitSucceeded: js.Function2[
    /* form */ java.lang.String, 
    /* repeated */java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var startAsyncValidation: js.Function1[/* form */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction]
  var startSubmit: js.Function1[/* form */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction]
  var stopAsyncValidation: js.Function2[
    /* form */ java.lang.String, 
    /* errors */ js.UndefOr[reduxDashFormLib.reduxDashFormMod.FormErrors[stdLib.FormData, _]], 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var stopSubmit: js.Function2[
    /* form */ java.lang.String, 
    /* errors */ js.UndefOr[reduxDashFormLib.reduxDashFormMod.FormErrors[stdLib.FormData, _]], 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var submit: js.Function1[/* form */ java.lang.String, reduxDashFormLib.libActionsMod.FormAction]
  var touch: js.Function2[
    /* form */ java.lang.String, 
    /* repeated */java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var unregisterField: js.Function2[
    /* form */ java.lang.String, 
    /* name */ java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var untouch: js.Function2[
    /* form */ java.lang.String, 
    /* repeated */java.lang.String, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var updateSyncErrors: js.Function3[
    /* from */ java.lang.String, 
    /* syncErrors */ reduxDashFormLib.reduxDashFormMod.FormErrors[stdLib.FormData, _], 
    /* error */ js.Any, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
  var updateSyncWarnings: js.Function3[
    /* form */ java.lang.String, 
    /* syncWarnings */ reduxDashFormLib.reduxDashFormMod.FormWarnings[stdLib.FormData, _], 
    /* warning */ js.Any, 
    reduxDashFormLib.libActionsMod.FormAction
  ]
}

