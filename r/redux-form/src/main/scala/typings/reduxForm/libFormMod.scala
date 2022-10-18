package typings.reduxForm

import typings.react.mod.Component
import typings.react.mod.FormHTMLAttributes
import typings.redux.mod.Dispatch
import typings.reduxForm.libReduxFormMod.DecoratedFormProps
import typings.reduxForm.libReduxFormMod.FormSubmitHandler
import typings.reduxForm.mod.FormErrors
import typings.reduxForm.mod.Omit
import typings.reduxForm.reduxFormStrings.onSubmit
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormMod {
  
  @JSImport("redux-form/lib/Form", "Form")
  @js.native
  open class Form[FormData, P, ErrorType] protected () extends GenericForm[FormData, P, ErrorType] {
    def this(props: FormProps[FormData, P, ErrorType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormProps[FormData, P, ErrorType], context: Any) = this()
  }
  
  @JSImport("redux-form/lib/Form", "GenericForm")
  @js.native
  open class GenericForm[FormData, P, ErrorType] protected ()
    extends Component[FormProps[FormData, P, ErrorType], js.Object, Any] {
    def this(props: FormProps[FormData, P, ErrorType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormProps[FormData, P, ErrorType], context: Any) = this()
  }
  
  type FormProps[FormData, P, ErrorType] = (Omit[FormHTMLAttributes[HTMLFormElement], onSubmit]) & (FormSubmitProp[FormData, P, ErrorType])
  
  trait FormSubmitProp[FormData, P, ErrorType] extends StObject {
    
    var onSubmit: js.UndefOr[FormSubmitHandler[FormData, P, ErrorType]] = js.undefined
  }
  object FormSubmitProp {
    
    inline def apply[FormData, P, ErrorType](): FormSubmitProp[FormData, P, ErrorType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormSubmitProp[FormData, P, ErrorType]]
    }
    
    extension [Self <: FormSubmitProp[?, ?, ?], FormData, P, ErrorType](x: Self & (FormSubmitProp[FormData, P, ErrorType])) {
      
      inline def setOnSubmit(
        value: (FormData, /* dispatch */ Dispatch[Any], /* props */ DecoratedFormProps[FormData, P, ErrorType]) => Unit | (FormErrors[FormData, ErrorType]) | js.Promise[Any]
      ): Self = StObject.set(x, "onSubmit", js.Any.fromFunction3(value))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    }
  }
}
