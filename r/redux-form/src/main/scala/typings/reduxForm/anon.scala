package typings.reduxForm

import typings.reduxForm.actionsMod.FormAction
import typings.reduxForm.mod.FormErrors
import typings.reduxForm.mod.FormWarnings
import typings.reduxForm.reduxFormMod.WrappedReduxFormContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(form: String, data: js.Any): FormAction = js.native
    def apply(
      form: String,
      data: js.Any,
      keepDirty: js.UndefOr[scala.Nothing],
      options: PartialInitializeOptions
    ): FormAction = js.native
    def apply(form: String, data: js.Any, keepDirty: Boolean): FormAction = js.native
    def apply(form: String, data: js.Any, keepDirty: Boolean, options: PartialInitializeOptions): FormAction = js.native
    def apply(form: String, data: js.Any, options: PartialInitializeOptions): FormAction = js.native
  }
  
  @js.native
  trait FnCallFormSyncWarningsWarning extends StObject {
    
    def apply[T](form: String, syncWarnings: FormWarnings[_, T], warning: T): FormAction = js.native
  }
  
  @js.native
  trait FnCallFromSyncErrorsError extends StObject {
    
    def apply[T](from: String, syncErrors: FormErrors[_, T], error: T): FormAction = js.native
  }
  
  @js.native
  trait Form extends StObject {
    
    var form: String = js.native
    
    var sectionPrefix: js.UndefOr[String] = js.native
  }
  object Form {
    
    @scala.inline
    def apply(form: String): Form = {
      val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any])
      __obj.asInstanceOf[Form]
    }
    
    @scala.inline
    implicit class FormMutableBuilder[Self <: Form] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionPrefix(value: String): Self = StObject.set(x, "sectionPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectionPrefixUndefined: Self = StObject.set(x, "sectionPrefix", js.undefined)
    }
  }
  
  /* Inlined std.Partial<redux-form.redux-form/lib/actions.InitializeOptions> */
  @js.native
  trait PartialInitializeOptions extends StObject {
    
    var keepDirty: js.UndefOr[Boolean] = js.native
    
    var keepSubmitSucceeded: js.UndefOr[Boolean] = js.native
    
    var keepValues: js.UndefOr[Boolean] = js.native
    
    var updateUnregisteredFields: js.UndefOr[Boolean] = js.native
  }
  object PartialInitializeOptions {
    
    @scala.inline
    def apply(): PartialInitializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialInitializeOptions]
    }
    
    @scala.inline
    implicit class PartialInitializeOptionsMutableBuilder[Self <: PartialInitializeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeepDirty(value: Boolean): Self = StObject.set(x, "keepDirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepDirtyUndefined: Self = StObject.set(x, "keepDirty", js.undefined)
      
      @scala.inline
      def setKeepSubmitSucceeded(value: Boolean): Self = StObject.set(x, "keepSubmitSucceeded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepSubmitSucceededUndefined: Self = StObject.set(x, "keepSubmitSucceeded", js.undefined)
      
      @scala.inline
      def setKeepValues(value: Boolean): Self = StObject.set(x, "keepValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepValuesUndefined: Self = StObject.set(x, "keepValues", js.undefined)
      
      @scala.inline
      def setUpdateUnregisteredFields(value: Boolean): Self = StObject.set(x, "updateUnregisteredFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUnregisteredFieldsUndefined: Self = StObject.set(x, "updateUnregisteredFields", js.undefined)
    }
  }
  
  @js.native
  trait Props[P] extends StObject {
    
    var props: P = js.native
  }
  object Props {
    
    @scala.inline
    def apply[P](props: P): Props[P] = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[P]]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props[_], P] (val x: Self with Props[P]) extends AnyVal {
      
      @scala.inline
      def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReduxForm extends StObject {
    
    var _reduxForm: js.UndefOr[WrappedReduxFormContext] = js.native
  }
  object ReduxForm {
    
    @scala.inline
    def apply(): ReduxForm = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReduxForm]
    }
    
    @scala.inline
    implicit class ReduxFormMutableBuilder[Self <: ReduxForm] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_reduxForm(value: WrappedReduxFormContext): Self = StObject.set(x, "_reduxForm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_reduxFormUndefined: Self = StObject.set(x, "_reduxForm", js.undefined)
    }
  }
}
