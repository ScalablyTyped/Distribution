package typings.reduxForm

import typings.redux.mod.Action
import typings.reduxForm.anon.FnCall
import typings.reduxForm.anon.FnCallFormSyncWarningsWarning
import typings.reduxForm.anon.FnCallFromSyncErrorsError
import typings.reduxForm.anon.PartialInitializeOptions
import typings.reduxForm.mod.FieldType
import typings.reduxForm.mod.FormErrors
import typings.reduxForm.mod.FormWarnings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  object default {
    
    @JSImport("redux-form/lib/actions", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("redux-form/lib/actions", "default.arrayInsert")
    @js.native
    def arrayInsert: js.Function4[
        /* form */ String, 
        /* field */ String, 
        /* index */ Double, 
        /* value */ js.Any, 
        FormAction
      ] = js.native
    @scala.inline
    def arrayInsert_=(
      x: js.Function4[
          /* form */ String, 
          /* field */ String, 
          /* index */ Double, 
          /* value */ js.Any, 
          FormAction
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayInsert")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.arrayMove")
    @js.native
    def arrayMove: js.Function4[/* form */ String, /* field */ String, /* from */ Double, /* to */ Double, FormAction] = js.native
    @scala.inline
    def arrayMove_=(
      x: js.Function4[/* form */ String, /* field */ String, /* from */ Double, /* to */ Double, FormAction]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayMove")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.arrayPop")
    @js.native
    def arrayPop: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
    @scala.inline
    def arrayPop_=(x: js.Function2[/* form */ String, /* field */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayPop")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.arrayPush")
    @js.native
    def arrayPush: js.Function3[/* form */ String, /* field */ String, /* value */ js.Any, FormAction] = js.native
    @scala.inline
    def arrayPush_=(x: js.Function3[/* form */ String, /* field */ String, /* value */ js.Any, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayPush")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.arrayRemove")
    @js.native
    def arrayRemove: js.Function3[/* form */ String, /* field */ String, /* index */ Double, FormAction] = js.native
    
    @JSImport("redux-form/lib/actions", "default.arrayRemoveAll")
    @js.native
    def arrayRemoveAll: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
    @scala.inline
    def arrayRemoveAll_=(x: js.Function2[/* form */ String, /* field */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayRemoveAll")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def arrayRemove_=(x: js.Function3[/* form */ String, /* field */ String, /* index */ Double, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayRemove")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.arrayShift")
    @js.native
    def arrayShift: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
    @scala.inline
    def arrayShift_=(x: js.Function2[/* form */ String, /* field */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayShift")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.arraySplice")
    @js.native
    def arraySplice: js.Function5[
        /* form */ String, 
        /* field */ String, 
        /* index */ Double, 
        /* removeNum */ Double, 
        /* value */ js.Any, 
        FormAction
      ] = js.native
    @scala.inline
    def arraySplice_=(
      x: js.Function5[
          /* form */ String, 
          /* field */ String, 
          /* index */ Double, 
          /* removeNum */ Double, 
          /* value */ js.Any, 
          FormAction
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arraySplice")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.arraySwap")
    @js.native
    def arraySwap: js.Function4[
        /* form */ String, 
        /* field */ String, 
        /* indexA */ Double, 
        /* indexB */ Double, 
        FormAction
      ] = js.native
    @scala.inline
    def arraySwap_=(
      x: js.Function4[
          /* form */ String, 
          /* field */ String, 
          /* indexA */ Double, 
          /* indexB */ Double, 
          FormAction
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arraySwap")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.arrayUnshift")
    @js.native
    def arrayUnshift: js.Function3[/* form */ String, /* field */ String, /* value */ js.Any, FormAction] = js.native
    @scala.inline
    def arrayUnshift_=(x: js.Function3[/* form */ String, /* field */ String, /* value */ js.Any, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayUnshift")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.autofill")
    @js.native
    def autofill: js.Function3[/* form */ String, /* field */ String, /* value */ js.Any, FormAction] = js.native
    @scala.inline
    def autofill_=(x: js.Function3[/* form */ String, /* field */ String, /* value */ js.Any, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autofill")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.blur")
    @js.native
    def blur: js.Function4[
        /* form */ String, 
        /* field */ String, 
        /* value */ js.Any, 
        /* touch */ js.UndefOr[Boolean], 
        FormAction
      ] = js.native
    @scala.inline
    def blur_=(
      x: js.Function4[
          /* form */ String, 
          /* field */ String, 
          /* value */ js.Any, 
          /* touch */ js.UndefOr[Boolean], 
          FormAction
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blur")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.change")
    @js.native
    def change: js.Function5[
        /* form */ String, 
        /* field */ String, 
        /* value */ js.Any, 
        /* touch */ js.UndefOr[Boolean], 
        /* persistentSubmitErrors */ js.UndefOr[Boolean], 
        FormAction
      ] = js.native
    @scala.inline
    def change_=(
      x: js.Function5[
          /* form */ String, 
          /* field */ String, 
          /* value */ js.Any, 
          /* touch */ js.UndefOr[Boolean], 
          /* persistentSubmitErrors */ js.UndefOr[Boolean], 
          FormAction
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("change")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.clearAsyncError")
    @js.native
    def clearAsyncError: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
    @scala.inline
    def clearAsyncError_=(x: js.Function2[/* form */ String, /* field */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearAsyncError")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.clearFields")
    @js.native
    def clearFields: js.Function4[
        /* form */ String, 
        /* keepTouched */ Boolean, 
        /* persistentSubmitErrors */ Boolean, 
        /* repeated */ String, 
        FormAction
      ] = js.native
    @scala.inline
    def clearFields_=(
      x: js.Function4[
          /* form */ String, 
          /* keepTouched */ Boolean, 
          /* persistentSubmitErrors */ Boolean, 
          /* repeated */ String, 
          FormAction
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearFields")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.clearSubmit")
    @js.native
    def clearSubmit: js.Function1[/* form */ String, FormAction] = js.native
    
    @JSImport("redux-form/lib/actions", "default.clearSubmitErrors")
    @js.native
    def clearSubmitErrors: js.Function1[/* form */ String, FormAction] = js.native
    @scala.inline
    def clearSubmitErrors_=(x: js.Function1[/* form */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearSubmitErrors")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def clearSubmit_=(x: js.Function1[/* form */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearSubmit")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.destroy")
    @js.native
    def destroy: js.Function1[/* repeated */ String, FormAction] = js.native
    @scala.inline
    def destroy_=(x: js.Function1[/* repeated */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destroy")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.focus")
    @js.native
    def focus: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
    @scala.inline
    def focus_=(x: js.Function2[/* form */ String, /* field */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focus")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.initialize")
    @js.native
    def initialize: FnCall = js.native
    @scala.inline
    def initialize_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialize")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.registerField")
    @js.native
    def registerField: js.Function3[/* form */ String, /* name */ String, /* type */ FieldType, FormAction] = js.native
    @scala.inline
    def registerField_=(x: js.Function3[/* form */ String, /* name */ String, /* type */ FieldType, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("registerField")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.reset")
    @js.native
    def reset: js.Function1[/* form */ String, FormAction] = js.native
    
    @JSImport("redux-form/lib/actions", "default.resetSection")
    @js.native
    def resetSection: js.Function2[/* form */ String, /* repeated */ String, FormAction] = js.native
    @scala.inline
    def resetSection_=(x: js.Function2[/* form */ String, /* repeated */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resetSection")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def reset_=(x: js.Function1[/* form */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reset")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.setSubmitFailed")
    @js.native
    def setSubmitFailed: js.Function2[/* form */ String, /* repeated */ String, FormAction] = js.native
    @scala.inline
    def setSubmitFailed_=(x: js.Function2[/* form */ String, /* repeated */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setSubmitFailed")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.setSubmitSucceeded")
    @js.native
    def setSubmitSucceeded: js.Function2[/* form */ String, /* repeated */ String, FormAction] = js.native
    @scala.inline
    def setSubmitSucceeded_=(x: js.Function2[/* form */ String, /* repeated */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setSubmitSucceeded")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.startAsyncValidation")
    @js.native
    def startAsyncValidation: js.Function1[/* form */ String, FormAction] = js.native
    @scala.inline
    def startAsyncValidation_=(x: js.Function1[/* form */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startAsyncValidation")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.startSubmit")
    @js.native
    def startSubmit: js.Function1[/* form */ String, FormAction] = js.native
    @scala.inline
    def startSubmit_=(x: js.Function1[/* form */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startSubmit")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.stopAsyncValidation")
    @js.native
    def stopAsyncValidation: js.Function2[/* form */ String, /* errors */ js.UndefOr[FormErrors[js.Any, js.Any]], FormAction] = js.native
    @scala.inline
    def stopAsyncValidation_=(
      x: js.Function2[/* form */ String, /* errors */ js.UndefOr[FormErrors[js.Any, js.Any]], FormAction]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopAsyncValidation")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.stopSubmit")
    @js.native
    def stopSubmit: js.Function2[/* form */ String, /* errors */ js.UndefOr[FormErrors[js.Any, js.Any]], FormAction] = js.native
    @scala.inline
    def stopSubmit_=(
      x: js.Function2[/* form */ String, /* errors */ js.UndefOr[FormErrors[js.Any, js.Any]], FormAction]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopSubmit")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.submit")
    @js.native
    def submit: js.Function1[/* form */ String, FormAction] = js.native
    @scala.inline
    def submit_=(x: js.Function1[/* form */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("submit")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.touch")
    @js.native
    def touch: js.Function2[/* form */ String, /* repeated */ String, FormAction] = js.native
    @scala.inline
    def touch_=(x: js.Function2[/* form */ String, /* repeated */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touch")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.unregisterField")
    @js.native
    def unregisterField: js.Function2[/* form */ String, /* name */ String, FormAction] = js.native
    @scala.inline
    def unregisterField_=(x: js.Function2[/* form */ String, /* name */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unregisterField")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.untouch")
    @js.native
    def untouch: js.Function2[/* form */ String, /* repeated */ String, FormAction] = js.native
    @scala.inline
    def untouch_=(x: js.Function2[/* form */ String, /* repeated */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("untouch")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.updateSyncErrors")
    @js.native
    def updateSyncErrors: FnCallFromSyncErrorsError = js.native
    @scala.inline
    def updateSyncErrors_=(x: FnCallFromSyncErrorsError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updateSyncErrors")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.updateSyncWarnings")
    @js.native
    def updateSyncWarnings: FnCallFormSyncWarningsWarning = js.native
    @scala.inline
    def updateSyncWarnings_=(x: FnCallFormSyncWarningsWarning): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updateSyncWarnings")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("redux-form/lib/actions", "arrayInsert")
  @js.native
  def arrayInsert(form: String, field: String, index: Double, value: js.Any): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "arrayMove")
  @js.native
  def arrayMove(form: String, field: String, from: Double, to: Double): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "arrayPop")
  @js.native
  def arrayPop(form: String, field: String): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "arrayPush")
  @js.native
  def arrayPush(form: String, field: String, value: js.Any): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "arrayRemove")
  @js.native
  def arrayRemove(form: String, field: String, index: Double): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "arrayRemoveAll")
  @js.native
  def arrayRemoveAll(form: String, field: String): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "arrayShift")
  @js.native
  def arrayShift(form: String, field: String): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "arraySplice")
  @js.native
  def arraySplice(form: String, field: String, index: Double, removeNum: Double, value: js.Any): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "arraySwap")
  @js.native
  def arraySwap(form: String, field: String, indexA: Double, indexB: Double): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "arrayUnshift")
  @js.native
  def arrayUnshift(form: String, field: String, value: js.Any): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "autofill")
  @js.native
  def autofill(form: String, field: String, value: js.Any): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "blur")
  @js.native
  def blur(form: String, field: String, value: js.Any): FormAction = js.native
  @JSImport("redux-form/lib/actions", "blur")
  @js.native
  def blur(form: String, field: String, value: js.Any, touch: Boolean): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "change")
  @js.native
  def change(form: String, field: String, value: js.Any): FormAction = js.native
  @JSImport("redux-form/lib/actions", "change")
  @js.native
  def change(
    form: String,
    field: String,
    value: js.Any,
    touch: js.UndefOr[scala.Nothing],
    persistentSubmitErrors: Boolean
  ): FormAction = js.native
  @JSImport("redux-form/lib/actions", "change")
  @js.native
  def change(form: String, field: String, value: js.Any, touch: Boolean): FormAction = js.native
  @JSImport("redux-form/lib/actions", "change")
  @js.native
  def change(form: String, field: String, value: js.Any, touch: Boolean, persistentSubmitErrors: Boolean): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "clearAsyncError")
  @js.native
  def clearAsyncError(form: String, field: String): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "clearFields")
  @js.native
  def clearFields(form: String, keepTouched: Boolean, persistentSubmitErrors: Boolean, fields: String*): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "clearSubmit")
  @js.native
  def clearSubmit(form: String): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "clearSubmitErrors")
  @js.native
  def clearSubmitErrors(form: String): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "destroy")
  @js.native
  def destroy(form: String*): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "focus")
  @js.native
  def focus(form: String, field: String): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "initialize")
  @js.native
  def initialize(form: String, data: js.Any): FormAction = js.native
  @JSImport("redux-form/lib/actions", "initialize")
  @js.native
  def initialize(
    form: String,
    data: js.Any,
    keepDirty: js.UndefOr[scala.Nothing],
    options: PartialInitializeOptions
  ): FormAction = js.native
  @JSImport("redux-form/lib/actions", "initialize")
  @js.native
  def initialize(form: String, data: js.Any, keepDirty: Boolean): FormAction = js.native
  @JSImport("redux-form/lib/actions", "initialize")
  @js.native
  def initialize(form: String, data: js.Any, keepDirty: Boolean, options: PartialInitializeOptions): FormAction = js.native
  @JSImport("redux-form/lib/actions", "initialize")
  @js.native
  def initialize(form: String, data: js.Any, options: PartialInitializeOptions): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "registerField")
  @js.native
  def registerField(form: String, name: String, `type`: FieldType): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "reset")
  @js.native
  def reset(form: String): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "resetSection")
  @js.native
  def resetSection(form: String, sections: String*): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "setSubmitFailed")
  @js.native
  def setSubmitFailed(form: String, fields: String*): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "setSubmitSucceeded")
  @js.native
  def setSubmitSucceeded(form: String, fields: String*): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "startAsyncValidation")
  @js.native
  def startAsyncValidation(form: String): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "startSubmit")
  @js.native
  def startSubmit(form: String): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "stopAsyncValidation")
  @js.native
  def stopAsyncValidation(form: String): FormAction = js.native
  @JSImport("redux-form/lib/actions", "stopAsyncValidation")
  @js.native
  def stopAsyncValidation(form: String, errors: FormErrors[_, _]): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "stopSubmit")
  @js.native
  def stopSubmit(form: String): FormAction = js.native
  @JSImport("redux-form/lib/actions", "stopSubmit")
  @js.native
  def stopSubmit(form: String, errors: FormErrors[_, _]): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "submit")
  @js.native
  def submit(form: String): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "touch")
  @js.native
  def touch(form: String, fields: String*): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "unregisterField")
  @js.native
  def unregisterField(form: String, name: String): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "untouch")
  @js.native
  def untouch(form: String, fields: String*): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "updateSyncErrors")
  @js.native
  def updateSyncErrors[T](from: String, syncErrors: FormErrors[_, T], error: T): FormAction = js.native
  
  @JSImport("redux-form/lib/actions", "updateSyncWarnings")
  @js.native
  def updateSyncWarnings[T](form: String, syncWarnings: FormWarnings[_, T], warning: T): FormAction = js.native
  
  @js.native
  trait FormAction
    extends Action[js.Any] {
    
    var error: js.UndefOr[js.Any] = js.native
    
    var meta: js.UndefOr[js.Any] = js.native
    
    var payload: js.UndefOr[js.Any] = js.native
  }
  object FormAction {
    
    @scala.inline
    def apply(`type`: js.Any): FormAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormAction]
    }
    
    @scala.inline
    implicit class FormActionMutableBuilder[Self <: FormAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  @js.native
  trait InitializeOptions extends StObject {
    
    var keepDirty: Boolean = js.native
    
    var keepSubmitSucceeded: Boolean = js.native
    
    var keepValues: Boolean = js.native
    
    var updateUnregisteredFields: Boolean = js.native
  }
  object InitializeOptions {
    
    @scala.inline
    def apply(
      keepDirty: Boolean,
      keepSubmitSucceeded: Boolean,
      keepValues: Boolean,
      updateUnregisteredFields: Boolean
    ): InitializeOptions = {
      val __obj = js.Dynamic.literal(keepDirty = keepDirty.asInstanceOf[js.Any], keepSubmitSucceeded = keepSubmitSucceeded.asInstanceOf[js.Any], keepValues = keepValues.asInstanceOf[js.Any], updateUnregisteredFields = updateUnregisteredFields.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitializeOptions]
    }
    
    @scala.inline
    implicit class InitializeOptionsMutableBuilder[Self <: InitializeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeepDirty(value: Boolean): Self = StObject.set(x, "keepDirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepSubmitSucceeded(value: Boolean): Self = StObject.set(x, "keepSubmitSucceeded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepValues(value: Boolean): Self = StObject.set(x, "keepValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUnregisteredFields(value: Boolean): Self = StObject.set(x, "updateUnregisteredFields", value.asInstanceOf[js.Any])
    }
  }
}
