package typings.reduxForm

import typings.react.mod.Component
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formSectionMod {
  
  @JSImport("redux-form/lib/FormSection", JSImport.Default)
  @js.native
  class default[P] protected () extends FormSection[P] {
    def this(props: FormSectionProps[P] with P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormSectionProps[P] with P, context: js.Any) = this()
  }
  
  @JSImport("redux-form/lib/FormSection", "FormSection")
  @js.native
  class FormSection[P] protected ()
    extends Component[FormSectionProps[P] with P, js.Object, js.Any] {
    def this(props: FormSectionProps[P] with P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FormSectionProps[P] with P, context: js.Any) = this()
  }
  
  @js.native
  trait FormSectionProps[P] extends StObject {
    
    var component: js.UndefOr[ComponentType[P]] = js.native
    
    var name: String = js.native
  }
  object FormSectionProps {
    
    @scala.inline
    def apply[P](name: String): FormSectionProps[P] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormSectionProps[P]]
    }
    
    @scala.inline
    implicit class FormSectionPropsMutableBuilder[Self <: FormSectionProps[_], P] (val x: Self with FormSectionProps[P]) extends AnyVal {
      
      @scala.inline
      def setComponent(value: ComponentType[P]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
