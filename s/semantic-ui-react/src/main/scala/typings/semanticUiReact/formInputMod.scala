package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.inputInputMod.StrictInputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formInputMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Form/FormInput", JSImport.Default)
  @js.native
  val default: StatelessComponent[FormInputProps] = js.native
  
  @js.native
  trait FormInputProps
    extends StrictFormInputProps
       with /* key */ StringDictionary[js.Any]
  object FormInputProps {
    
    @scala.inline
    def apply(): FormInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormInputProps]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.semanticUiReact.formFieldMod.StrictFormFieldProps because var conflicts: as, children, className, disabled, error, id, label, required, `type`, width. Inlined content, control, `inline` */ @js.native
  trait StrictFormInputProps extends StrictInputProps {
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A FormField control prop. */
    var control: js.UndefOr[js.Any] = js.native
    
    /** Individual fields may display an error state along with a message. */
    @JSName("error")
    var error_StrictFormInputProps: js.UndefOr[js.Any] = js.native
    
    /** A field can have its label next to instead of above it. */
    var `inline`: js.UndefOr[Boolean] = js.native
  }
  object StrictFormInputProps {
    
    @scala.inline
    def apply(): StrictFormInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictFormInputProps]
    }
    
    @scala.inline
    implicit class StrictFormInputPropsMutableBuilder[Self <: StrictFormInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setControl(value: js.Any): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    }
  }
  
  type _To = StatelessComponent[FormInputProps]
  
  /* This means you don't have to write `default`, but can instead just say `formInputMod.foo` */
  override def _to: StatelessComponent[FormInputProps] = default
}
