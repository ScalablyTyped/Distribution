package typings.reduxForm

import typings.redux.mod.Action
import typings.reduxForm.anon.FnCall
import typings.reduxForm.anon.FnCallFormSyncErrorsError
import typings.reduxForm.anon.FnCallFormSyncWarningsWarning
import typings.reduxForm.anon.PartialInitializeOptions
import typings.reduxForm.mod.FieldType
import typings.reduxForm.mod.FormErrors
import typings.reduxForm.mod.FormWarnings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionsMod {
  
  @JSImport("redux-form/lib/actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("redux-form/lib/actions", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("redux-form/lib/actions", "default.arrayInsert")
    @js.native
    def arrayInsert: js.Function4[/* form */ String, /* field */ String, /* index */ Double, /* value */ Any, FormAction] = js.native
    inline def arrayInsert_=(
      x: js.Function4[/* form */ String, /* field */ String, /* index */ Double, /* value */ Any, FormAction]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayInsert")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.arrayMove")
    @js.native
    def arrayMove: js.Function4[/* form */ String, /* field */ String, /* from */ Double, /* to */ Double, FormAction] = js.native
    inline def arrayMove_=(
      x: js.Function4[/* form */ String, /* field */ String, /* from */ Double, /* to */ Double, FormAction]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayMove")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.arrayPop")
    @js.native
    def arrayPop: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
    inline def arrayPop_=(x: js.Function2[/* form */ String, /* field */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayPop")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.arrayPush")
    @js.native
    def arrayPush: js.Function3[/* form */ String, /* field */ String, /* value */ Any, FormAction] = js.native
    inline def arrayPush_=(x: js.Function3[/* form */ String, /* field */ String, /* value */ Any, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayPush")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.arrayRemove")
    @js.native
    def arrayRemove: js.Function3[/* form */ String, /* field */ String, /* index */ Double, FormAction] = js.native
    
    @JSImport("redux-form/lib/actions", "default.arrayRemoveAll")
    @js.native
    def arrayRemoveAll: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
    inline def arrayRemoveAll_=(x: js.Function2[/* form */ String, /* field */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayRemoveAll")(x.asInstanceOf[js.Any])
    
    inline def arrayRemove_=(x: js.Function3[/* form */ String, /* field */ String, /* index */ Double, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayRemove")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.arrayShift")
    @js.native
    def arrayShift: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
    inline def arrayShift_=(x: js.Function2[/* form */ String, /* field */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayShift")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.arraySplice")
    @js.native
    def arraySplice: js.Function5[
        /* form */ String, 
        /* field */ String, 
        /* index */ Double, 
        /* removeNum */ Double, 
        /* value */ Any, 
        FormAction
      ] = js.native
    inline def arraySplice_=(
      x: js.Function5[
          /* form */ String, 
          /* field */ String, 
          /* index */ Double, 
          /* removeNum */ Double, 
          /* value */ Any, 
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
    inline def arraySwap_=(
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
    def arrayUnshift: js.Function3[/* form */ String, /* field */ String, /* value */ Any, FormAction] = js.native
    inline def arrayUnshift_=(x: js.Function3[/* form */ String, /* field */ String, /* value */ Any, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayUnshift")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.autofill")
    @js.native
    def autofill: js.Function3[/* form */ String, /* field */ String, /* value */ Any, FormAction] = js.native
    inline def autofill_=(x: js.Function3[/* form */ String, /* field */ String, /* value */ Any, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autofill")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.blur")
    @js.native
    def blur: js.Function4[
        /* form */ String, 
        /* field */ String, 
        /* value */ Any, 
        /* touch */ js.UndefOr[Boolean], 
        FormAction
      ] = js.native
    inline def blur_=(
      x: js.Function4[
          /* form */ String, 
          /* field */ String, 
          /* value */ Any, 
          /* touch */ js.UndefOr[Boolean], 
          FormAction
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blur")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.change")
    @js.native
    def change: js.Function5[
        /* form */ String, 
        /* field */ String, 
        /* value */ Any, 
        /* touch */ js.UndefOr[Boolean], 
        /* persistentSubmitErrors */ js.UndefOr[Boolean], 
        FormAction
      ] = js.native
    inline def change_=(
      x: js.Function5[
          /* form */ String, 
          /* field */ String, 
          /* value */ Any, 
          /* touch */ js.UndefOr[Boolean], 
          /* persistentSubmitErrors */ js.UndefOr[Boolean], 
          FormAction
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("change")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.clearAsyncError")
    @js.native
    def clearAsyncError: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
    inline def clearAsyncError_=(x: js.Function2[/* form */ String, /* field */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearAsyncError")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.clearFields")
    @js.native
    def clearFields: js.Function4[
        /* form */ String, 
        /* keepTouched */ Boolean, 
        /* persistentSubmitErrors */ Boolean, 
        /* repeated */ String, 
        FormAction
      ] = js.native
    inline def clearFields_=(
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
    inline def clearSubmitErrors_=(x: js.Function1[/* form */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearSubmitErrors")(x.asInstanceOf[js.Any])
    
    inline def clearSubmit_=(x: js.Function1[/* form */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearSubmit")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.destroy")
    @js.native
    def destroy: js.Function1[/* repeated */ String, FormAction] = js.native
    inline def destroy_=(x: js.Function1[/* repeated */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destroy")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.focus")
    @js.native
    def focus: js.Function2[/* form */ String, /* field */ String, FormAction] = js.native
    inline def focus_=(x: js.Function2[/* form */ String, /* field */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focus")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.initialize")
    @js.native
    def initialize: FnCall = js.native
    inline def initialize_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialize")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.registerField")
    @js.native
    def registerField: js.Function3[/* form */ String, /* name */ String, /* type */ FieldType, FormAction] = js.native
    inline def registerField_=(x: js.Function3[/* form */ String, /* name */ String, /* type */ FieldType, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("registerField")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.reset")
    @js.native
    def reset: js.Function1[/* form */ String, FormAction] = js.native
    
    @JSImport("redux-form/lib/actions", "default.resetSection")
    @js.native
    def resetSection: js.Function2[/* form */ String, /* repeated */ String, FormAction] = js.native
    inline def resetSection_=(x: js.Function2[/* form */ String, /* repeated */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resetSection")(x.asInstanceOf[js.Any])
    
    inline def reset_=(x: js.Function1[/* form */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reset")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.setSubmitFailed")
    @js.native
    def setSubmitFailed: js.Function2[/* form */ String, /* repeated */ String, FormAction] = js.native
    inline def setSubmitFailed_=(x: js.Function2[/* form */ String, /* repeated */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setSubmitFailed")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.setSubmitSucceeded")
    @js.native
    def setSubmitSucceeded: js.Function2[/* form */ String, /* repeated */ String, FormAction] = js.native
    inline def setSubmitSucceeded_=(x: js.Function2[/* form */ String, /* repeated */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setSubmitSucceeded")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.startAsyncValidation")
    @js.native
    def startAsyncValidation: js.Function1[/* form */ String, FormAction] = js.native
    inline def startAsyncValidation_=(x: js.Function1[/* form */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startAsyncValidation")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.startSubmit")
    @js.native
    def startSubmit: js.Function1[/* form */ String, FormAction] = js.native
    inline def startSubmit_=(x: js.Function1[/* form */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startSubmit")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.stopAsyncValidation")
    @js.native
    def stopAsyncValidation: js.Function2[/* form */ String, /* errors */ js.UndefOr[FormErrors[Any, Any]], FormAction] = js.native
    inline def stopAsyncValidation_=(x: js.Function2[/* form */ String, /* errors */ js.UndefOr[FormErrors[Any, Any]], FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopAsyncValidation")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.stopSubmit")
    @js.native
    def stopSubmit: js.Function2[/* form */ String, /* errors */ js.UndefOr[FormErrors[Any, Any]], FormAction] = js.native
    inline def stopSubmit_=(x: js.Function2[/* form */ String, /* errors */ js.UndefOr[FormErrors[Any, Any]], FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stopSubmit")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.submit")
    @js.native
    def submit: js.Function1[/* form */ String, FormAction] = js.native
    inline def submit_=(x: js.Function1[/* form */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("submit")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.touch")
    @js.native
    def touch: js.Function2[/* form */ String, /* repeated */ String, FormAction] = js.native
    inline def touch_=(x: js.Function2[/* form */ String, /* repeated */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touch")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.unregisterField")
    @js.native
    def unregisterField: js.Function2[/* form */ String, /* name */ String, FormAction] = js.native
    inline def unregisterField_=(x: js.Function2[/* form */ String, /* name */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unregisterField")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.untouch")
    @js.native
    def untouch: js.Function2[/* form */ String, /* repeated */ String, FormAction] = js.native
    inline def untouch_=(x: js.Function2[/* form */ String, /* repeated */ String, FormAction]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("untouch")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.updateSyncErrors")
    @js.native
    def updateSyncErrors: FnCallFormSyncErrorsError = js.native
    inline def updateSyncErrors_=(x: FnCallFormSyncErrorsError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updateSyncErrors")(x.asInstanceOf[js.Any])
    
    @JSImport("redux-form/lib/actions", "default.updateSyncWarnings")
    @js.native
    def updateSyncWarnings: FnCallFormSyncWarningsWarning = js.native
    inline def updateSyncWarnings_=(x: FnCallFormSyncWarningsWarning): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updateSyncWarnings")(x.asInstanceOf[js.Any])
  }
  
  inline def arrayInsert(form: String, field: String, index: Double, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayInsert")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayMove(form: String, field: String, from: Double, to: Double): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMove")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayPop(form: String, field: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPop")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayPush(form: String, field: String, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayPush")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayRemove(form: String, field: String, index: Double): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayRemoveAll(form: String, field: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemoveAll")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayShift(form: String, field: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayShift")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arraySplice(form: String, field: String, index: Double, removeNum: Double, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arraySplice")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], index.asInstanceOf[js.Any], removeNum.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arraySwap(form: String, field: String, indexA: Double, indexB: Double): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arraySwap")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], indexA.asInstanceOf[js.Any], indexB.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def arrayUnshift(form: String, field: String, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnshift")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def autofill(form: String, field: String, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("autofill")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def blur(form: String, field: String, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def blur(form: String, field: String, value: Any, touch: Boolean): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any], touch.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def change(form: String, field: String, value: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("change")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def change(form: String, field: String, value: Any, touch: Boolean): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("change")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any], touch.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def change(form: String, field: String, value: Any, touch: Boolean, persistentSubmitErrors: Boolean): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("change")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any], touch.asInstanceOf[js.Any], persistentSubmitErrors.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def change(form: String, field: String, value: Any, touch: Unit, persistentSubmitErrors: Boolean): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("change")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any], value.asInstanceOf[js.Any], touch.asInstanceOf[js.Any], persistentSubmitErrors.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def clearAsyncError(form: String, field: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("clearAsyncError")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def clearFields(form: String, keepTouched: Boolean, persistentSubmitErrors: Boolean, fields: String*): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("clearFields")((scala.List(form.asInstanceOf[js.Any], keepTouched.asInstanceOf[js.Any], persistentSubmitErrors.asInstanceOf[js.Any])).`++`(fields.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FormAction]
  
  inline def clearSubmit(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSubmit")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def clearSubmitErrors(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("clearSubmitErrors")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def destroy(form: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(form.asInstanceOf[Seq[js.Any]]*).asInstanceOf[FormAction]
  
  inline def focus(form: String, field: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("focus")(form.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def initialize(form: String, data: Any): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def initialize(form: String, data: Any, keepDirty: Boolean): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any], keepDirty.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def initialize(form: String, data: Any, keepDirty: Boolean, options: PartialInitializeOptions): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any], keepDirty.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def initialize(form: String, data: Any, keepDirty: Unit, options: PartialInitializeOptions): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any], keepDirty.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  inline def initialize(form: String, data: Any, options: PartialInitializeOptions): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(form.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def registerField(form: String, name: String, `type`: FieldType): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("registerField")(form.asInstanceOf[js.Any], name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def reset(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def resetSection(form: String, sections: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("resetSection")(scala.List(form.asInstanceOf[js.Any]).`++`(sections.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FormAction]
  
  inline def setSubmitFailed(form: String, fields: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("setSubmitFailed")(scala.List(form.asInstanceOf[js.Any]).`++`(fields.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FormAction]
  
  inline def setSubmitSucceeded(form: String, fields: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("setSubmitSucceeded")(scala.List(form.asInstanceOf[js.Any]).`++`(fields.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FormAction]
  
  inline def startAsyncValidation(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("startAsyncValidation")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def startSubmit(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("startSubmit")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def stopAsyncValidation(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("stopAsyncValidation")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  inline def stopAsyncValidation(form: String, errors: FormErrors[Any, Any]): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("stopAsyncValidation")(form.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def stopSubmit(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("stopSubmit")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  inline def stopSubmit(form: String, errors: FormErrors[Any, Any]): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("stopSubmit")(form.asInstanceOf[js.Any], errors.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def submit(form: String): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("submit")(form.asInstanceOf[js.Any]).asInstanceOf[FormAction]
  
  inline def touch(form: String, fields: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("touch")(scala.List(form.asInstanceOf[js.Any]).`++`(fields.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FormAction]
  
  inline def unregisterField(form: String, name: String): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("unregisterField")(form.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def untouch(form: String, fields: String*): FormAction = ^.asInstanceOf[js.Dynamic].applyDynamic("untouch")(scala.List(form.asInstanceOf[js.Any]).`++`(fields.asInstanceOf[Seq[js.Any]])*).asInstanceOf[FormAction]
  
  inline def updateSyncErrors[T](form: String, syncErrors: FormErrors[Any, T], error: T): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSyncErrors")(form.asInstanceOf[js.Any], syncErrors.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  inline def updateSyncWarnings[T](form: String, syncWarnings: FormWarnings[Any, T], warning: T): FormAction = (^.asInstanceOf[js.Dynamic].applyDynamic("updateSyncWarnings")(form.asInstanceOf[js.Any], syncWarnings.asInstanceOf[js.Any], warning.asInstanceOf[js.Any])).asInstanceOf[FormAction]
  
  trait FormAction
    extends StObject
       with Action[Any] {
    
    var error: js.UndefOr[Any] = js.undefined
    
    var meta: js.UndefOr[Any] = js.undefined
    
    var payload: js.UndefOr[Any] = js.undefined
  }
  object FormAction {
    
    inline def apply(`type`: Any): FormAction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormAction]
    }
    
    extension [Self <: FormAction](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  trait InitializeOptions extends StObject {
    
    var keepDirty: Boolean
    
    var keepSubmitSucceeded: Boolean
    
    var keepValues: Boolean
    
    var updateUnregisteredFields: Boolean
  }
  object InitializeOptions {
    
    inline def apply(
      keepDirty: Boolean,
      keepSubmitSucceeded: Boolean,
      keepValues: Boolean,
      updateUnregisteredFields: Boolean
    ): InitializeOptions = {
      val __obj = js.Dynamic.literal(keepDirty = keepDirty.asInstanceOf[js.Any], keepSubmitSucceeded = keepSubmitSucceeded.asInstanceOf[js.Any], keepValues = keepValues.asInstanceOf[js.Any], updateUnregisteredFields = updateUnregisteredFields.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitializeOptions]
    }
    
    extension [Self <: InitializeOptions](x: Self) {
      
      inline def setKeepDirty(value: Boolean): Self = StObject.set(x, "keepDirty", value.asInstanceOf[js.Any])
      
      inline def setKeepSubmitSucceeded(value: Boolean): Self = StObject.set(x, "keepSubmitSucceeded", value.asInstanceOf[js.Any])
      
      inline def setKeepValues(value: Boolean): Self = StObject.set(x, "keepValues", value.asInstanceOf[js.Any])
      
      inline def setUpdateUnregisteredFields(value: Boolean): Self = StObject.set(x, "updateUnregisteredFields", value.asInstanceOf[js.Any])
    }
  }
}
