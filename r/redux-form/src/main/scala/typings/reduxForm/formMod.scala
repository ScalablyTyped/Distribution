package typings.reduxForm

import typings.react.mod.Component
import typings.react.mod.FormHTMLAttributes
import typings.redux.mod.Dispatch
import typings.reduxForm.mod.FormErrors
import typings.reduxForm.mod.Omit
import typings.reduxForm.reduxFormMod.DecoratedFormProps
import typings.reduxForm.reduxFormMod.FormSubmitHandler
import typings.reduxForm.reduxFormStrings.onSubmit
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formMod {
  
  @JSImport("redux-form/lib/Form", "Form")
  @js.native
  class Form[FormData, P, ErrorType] protected () extends GenericForm[FormData, P, ErrorType] {
    def this(props: FormProps[FormData, P, ErrorType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormProps[FormData, P, ErrorType], context: js.Any) = this()
  }
  
  @JSImport("redux-form/lib/Form", "GenericForm")
  @js.native
  class GenericForm[FormData, P, ErrorType] protected ()
    extends Component[FormProps[FormData, P, ErrorType], js.Object, js.Any] {
    def this(props: FormProps[FormData, P, ErrorType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormProps[FormData, P, ErrorType], context: js.Any) = this()
  }
  
  type FormProps[FormData, P, ErrorType] = (Omit[FormHTMLAttributes[HTMLFormElement], onSubmit]) with (FormSubmitProp[FormData, P, ErrorType])
  
  @js.native
  trait FormSubmitProp[FormData, P, ErrorType] extends StObject {
    
    var onSubmit: js.UndefOr[FormSubmitHandler[FormData, P, ErrorType]] = js.native
  }
  object FormSubmitProp {
    
    @scala.inline
    def apply[FormData, P, ErrorType](): FormSubmitProp[FormData, P, ErrorType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormSubmitProp[FormData, P, ErrorType]]
    }
    
    @scala.inline
    implicit class FormSubmitPropMutableBuilder[Self <: FormSubmitProp[_, _, _], FormData, P, ErrorType] (val x: Self with (FormSubmitProp[FormData, P, ErrorType])) extends AnyVal {
      
      @scala.inline
      def setOnSubmit(
        value: (FormData, /* dispatch */ Dispatch[js.Any], /* props */ DecoratedFormProps[FormData, P, ErrorType]) => Unit | (FormErrors[FormData, ErrorType]) | js.Promise[js.Any]
      ): Self = StObject.set(x, "onSubmit", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    }
  }
}
