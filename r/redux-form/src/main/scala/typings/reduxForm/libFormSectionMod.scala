package typings.reduxForm

import typings.react.mod.Component
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormSectionMod {
  
  @JSImport("redux-form/lib/FormSection", JSImport.Default)
  @js.native
  open class default[P] protected () extends FormSection[P] {
    def this(props: FormSectionProps[P] & P) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: FormSectionProps[P] & P, context: Any) = this()
  }
  
  @JSImport("redux-form/lib/FormSection", "FormSection")
  @js.native
  open class FormSection[P] protected ()
    extends Component[FormSectionProps[P] & P, js.Object, Any] {
    def this(props: FormSectionProps[P] & P) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: FormSectionProps[P] & P, context: Any) = this()
  }
  
  trait FormSectionProps[P] extends StObject {
    
    var component: js.UndefOr[ComponentType[P]] = js.undefined
    
    var name: String
  }
  object FormSectionProps {
    
    inline def apply[P](name: String): FormSectionProps[P] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormSectionProps[P]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormSectionProps[?], P] (val x: Self & FormSectionProps[P]) extends AnyVal {
      
      inline def setComponent(value: ComponentType[P]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
