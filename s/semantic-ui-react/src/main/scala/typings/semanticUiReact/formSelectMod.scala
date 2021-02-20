package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.dropdownItemMod.DropdownItemProps
import typings.semanticUiReact.genericMod.HtmlLabelProps
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.genericMod.SemanticWIDTHS
import typings.semanticUiReact.selectSelectMod.StrictSelectProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formSelectMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/collections/Form/FormSelect", JSImport.Default)
  @js.native
  val default: StatelessComponent[FormSelectProps] = js.native
  
  @js.native
  trait FormSelectProps
    extends StrictFormSelectProps
       with /* key */ StringDictionary[js.Any]
  object FormSelectProps {
    
    @scala.inline
    def apply(options: js.Array[DropdownItemProps]): FormSelectProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormSelectProps]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.semanticUiReact.formFieldMod.StrictFormFieldProps because var conflicts: as, children, className, disabled, error, `inline`. Inlined content, control, id, label, required, `type`, width */ @js.native
  trait StrictFormSelectProps extends StrictSelectProps {
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A FormField control prop. */
    var control: js.UndefOr[js.Any] = js.native
    
    /** Individual fields may display an error state along with a message. */
    @JSName("error")
    var error_StrictFormSelectProps: js.UndefOr[js.Any] = js.native
    
    /** The id of the control */
    var id: js.UndefOr[Double | String] = js.native
    
    /** Mutually exclusive with children. */
    var label: js.UndefOr[SemanticShorthandItem[HtmlLabelProps]] = js.native
    
    /** A field can show that input is mandatory.  Requires a label. */
    var required: js.UndefOr[js.Any] = js.native
    
    /** Passed to the control component (i.e. <input type='password' />) */
    var `type`: js.UndefOr[String] = js.native
    
    /** A field can specify its width in grid columns */
    var width: js.UndefOr[SemanticWIDTHS] = js.native
  }
  object StrictFormSelectProps {
    
    @scala.inline
    def apply(options: js.Array[DropdownItemProps]): StrictFormSelectProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrictFormSelectProps]
    }
    
    @scala.inline
    implicit class StrictFormSelectPropsMutableBuilder[Self <: StrictFormSelectProps] (val x: Self) extends AnyVal {
      
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
      def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLabel(value: SemanticShorthandItem[HtmlLabelProps]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFunction3(
        value: (/* component */ ElementType[HtmlLabelProps], HtmlLabelProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "label", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setRequired(value: js.Any): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: SemanticWIDTHS): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = StatelessComponent[FormSelectProps]
  
  /* This means you don't have to write `default`, but can instead just say `formSelectMod.foo` */
  override def _to: StatelessComponent[FormSelectProps] = default
}
