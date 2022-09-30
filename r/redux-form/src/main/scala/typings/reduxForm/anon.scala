package typings.reduxForm

import typings.reduxForm.actionsMod.FormAction
import typings.reduxForm.mod.FormErrors
import typings.reduxForm.mod.FormWarnings
import typings.reduxForm.reduxFormMod.WrappedReduxFormContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(form: String, data: Any): FormAction = js.native
    def apply(form: String, data: Any, keepDirty: Boolean): FormAction = js.native
    def apply(form: String, data: Any, keepDirty: Boolean, options: PartialInitializeOptions): FormAction = js.native
    def apply(form: String, data: Any, keepDirty: Unit, options: PartialInitializeOptions): FormAction = js.native
    def apply(form: String, data: Any, options: PartialInitializeOptions): FormAction = js.native
  }
  
  @js.native
  trait FnCallFormSyncErrorsError extends StObject {
    
    def apply[T](form: String, syncErrors: FormErrors[Any, T], error: T): FormAction = js.native
  }
  
  @js.native
  trait FnCallFormSyncWarningsWarning extends StObject {
    
    def apply[T](form: String, syncWarnings: FormWarnings[Any, T], warning: T): FormAction = js.native
  }
  
  trait Form extends StObject {
    
    var form: String
    
    var sectionPrefix: js.UndefOr[String] = js.undefined
  }
  object Form {
    
    inline def apply(form: String): Form = {
      val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
      __obj.asInstanceOf[Form]
    }
    
    extension [Self <: Form](x: Self) {
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setSectionPrefix(value: String): Self = StObject.set(x, "sectionPrefix", value.asInstanceOf[js.Any])
      
      inline def setSectionPrefixUndefined: Self = StObject.set(x, "sectionPrefix", js.undefined)
    }
  }
  
  /* Inlined std.Partial<redux-form.redux-form/lib/actions.InitializeOptions> */
  trait PartialInitializeOptions extends StObject {
    
    var keepDirty: js.UndefOr[Boolean] = js.undefined
    
    var keepSubmitSucceeded: js.UndefOr[Boolean] = js.undefined
    
    var keepValues: js.UndefOr[Boolean] = js.undefined
    
    var updateUnregisteredFields: js.UndefOr[Boolean] = js.undefined
  }
  object PartialInitializeOptions {
    
    inline def apply(): PartialInitializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialInitializeOptions]
    }
    
    extension [Self <: PartialInitializeOptions](x: Self) {
      
      inline def setKeepDirty(value: Boolean): Self = StObject.set(x, "keepDirty", value.asInstanceOf[js.Any])
      
      inline def setKeepDirtyUndefined: Self = StObject.set(x, "keepDirty", js.undefined)
      
      inline def setKeepSubmitSucceeded(value: Boolean): Self = StObject.set(x, "keepSubmitSucceeded", value.asInstanceOf[js.Any])
      
      inline def setKeepSubmitSucceededUndefined: Self = StObject.set(x, "keepSubmitSucceeded", js.undefined)
      
      inline def setKeepValues(value: Boolean): Self = StObject.set(x, "keepValues", value.asInstanceOf[js.Any])
      
      inline def setKeepValuesUndefined: Self = StObject.set(x, "keepValues", js.undefined)
      
      inline def setUpdateUnregisteredFields(value: Boolean): Self = StObject.set(x, "updateUnregisteredFields", value.asInstanceOf[js.Any])
      
      inline def setUpdateUnregisteredFieldsUndefined: Self = StObject.set(x, "updateUnregisteredFields", js.undefined)
    }
  }
  
  trait Props[P] extends StObject {
    
    var props: js.UndefOr[P] = js.undefined
  }
  object Props {
    
    inline def apply[P](): Props[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props[P]]
    }
    
    extension [Self <: Props[?], P](x: Self & Props[P]) {
      
      inline def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
  
  trait ReduxForm extends StObject {
    
    var _reduxForm: js.UndefOr[WrappedReduxFormContext] = js.undefined
  }
  object ReduxForm {
    
    inline def apply(): ReduxForm = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReduxForm]
    }
    
    extension [Self <: ReduxForm](x: Self) {
      
      inline def set_reduxForm(value: WrappedReduxFormContext): Self = StObject.set(x, "_reduxForm", value.asInstanceOf[js.Any])
      
      inline def set_reduxFormUndefined: Self = StObject.set(x, "_reduxForm", js.undefined)
    }
  }
}
