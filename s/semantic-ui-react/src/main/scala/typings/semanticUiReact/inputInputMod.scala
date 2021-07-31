package typings.semanticUiReact

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.genericMod.HtmlInputrops
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.labelLabelMod.LabelProps
import typings.semanticUiReact.semanticUiReactStrings.`left corner`
import typings.semanticUiReact.semanticUiReactStrings.`right corner`
import typings.semanticUiReact.semanticUiReactStrings.big
import typings.semanticUiReact.semanticUiReactStrings.huge
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.left
import typings.semanticUiReact.semanticUiReactStrings.massive
import typings.semanticUiReact.semanticUiReactStrings.mini
import typings.semanticUiReact.semanticUiReactStrings.right
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputInputMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Input/Input", JSImport.Default)
  @js.native
  class default () extends Input
  
  @js.native
  trait Input
    extends Component[InputProps, js.Object, js.Any] {
    
    def focus(): Unit = js.native
    
    def select(): Unit = js.native
  }
  
  trait InputOnChangeData
    extends StObject
       with StrictInputProps {
    
    @JSName("value")
    var value_InputOnChangeData: String
  }
  object InputOnChangeData {
    
    @scala.inline
    def apply(value: String): InputOnChangeData = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputOnChangeData]
    }
    
    @scala.inline
    implicit class InputOnChangeDataMutableBuilder[Self <: InputOnChangeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type InputProps = StrictInputProps
  
  trait StrictInputProps
    extends StObject
       with InputHTMLAttributes[HTMLInputElement] {
    
    /** An Input can be formatted to alert the user to an action they may perform. */
    var action: js.UndefOr[js.Any | Boolean] = js.undefined
    
    /** An action can appear along side an Input on the left or right. */
    var actionPosition: js.UndefOr[left] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** An Input field can show the data contains errors. */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** Take on the size of its container. */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /** An Input field can show a user is currently interacting with it. */
    var focus: js.UndefOr[Boolean] = js.undefined
    
    /** Optional Icon to display inside the Input. */
    var icon: js.UndefOr[js.Any | SemanticShorthandItem[InputProps]] = js.undefined
    
    /** An Icon can appear inside an Input on the left. */
    var iconPosition: js.UndefOr[left] = js.undefined
    
    /** Shorthand for creating the HTML Input. */
    var input: js.UndefOr[SemanticShorthandItem[HtmlInputrops]] = js.undefined
    
    /** Format to appear on dark backgrounds. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** Optional Label to display along side the Input. */
    var label: js.UndefOr[SemanticShorthandItem[LabelProps]] = js.undefined
    
    /** A Label can appear outside an Input on the left or right. */
    var labelPosition: js.UndefOr[left | right | (`left corner`) | (`right corner`)] = js.undefined
    
    /** An Icon Input field can show that it is currently loading data. */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Called on change.
      *
      * @param {ChangeEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props and a proposed value.
      */
    @JSName("onChange")
    var onChange_StrictInputProps: js.UndefOr[
        js.Function2[/* event */ ChangeEvent[HTMLInputElement], /* data */ InputOnChangeData, Unit]
      ] = js.undefined
    
    /** An Input can vary in size. */
    @JSName("size")
    var size_StrictInputProps: js.UndefOr[mini | small | large | big | huge | massive] = js.undefined
    
    /** An Input can receive focus. */
    @JSName("tabIndex")
    var tabIndex_StrictInputProps: js.UndefOr[Double | String] = js.undefined
    
    /** Transparent Input has no background. */
    var transparent: js.UndefOr[Boolean] = js.undefined
  }
  object StrictInputProps {
    
    @scala.inline
    def apply(): StrictInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictInputProps]
    }
    
    @scala.inline
    implicit class StrictInputPropsMutableBuilder[Self <: StrictInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: js.Any | Boolean): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionPosition(value: left): Self = StObject.set(x, "actionPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionPositionUndefined: Self = StObject.set(x, "actionPosition", js.undefined)
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      @scala.inline
      def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      @scala.inline
      def setIcon(value: js.Any | SemanticShorthandItem[InputProps]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconFunction3(
        value: (/* component */ ElementType[InputProps], InputProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "icon", js.Any.fromFunction3(value))
      
      @scala.inline
      def setIconPosition(value: left): Self = StObject.set(x, "iconPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPositionUndefined: Self = StObject.set(x, "iconPosition", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setInput(value: SemanticShorthandItem[HtmlInputrops]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputFunction3(
        value: (/* component */ ElementType[HtmlInputrops], HtmlInputrops, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "input", js.Any.fromFunction3(value))
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setLabel(value: SemanticShorthandItem[LabelProps]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelFunction3(
        value: (/* component */ ElementType[LabelProps], LabelProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "label", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLabelPosition(value: left | right | (`left corner`) | (`right corner`)): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* event */ ChangeEvent[HTMLInputElement], /* data */ InputOnChangeData) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setSize(value: mini | small | large | big | huge | massive): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double | String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    }
  }
}
