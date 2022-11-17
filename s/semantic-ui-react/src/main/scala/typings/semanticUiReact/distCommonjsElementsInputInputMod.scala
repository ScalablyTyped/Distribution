package typings.semanticUiReact

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.semanticUiReact.distCommonjsElementsLabelLabelMod.LabelProps
import typings.semanticUiReact.distCommonjsGenericMod.HtmlInputrops
import typings.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsElementsInputInputMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Input/Input", JSImport.Default)
  @js.native
  open class default () extends Input
  
  @js.native
  trait Input
    extends Component[InputProps, js.Object, Any] {
    
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
    
    inline def apply(value: String): InputOnChangeData = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputOnChangeData]
    }
    
    extension [Self <: InputOnChangeData](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type InputProps = StrictInputProps
  
  trait StrictInputProps
    extends StObject
       with InputHTMLAttributes[HTMLInputElement] {
    
    /** An Input can be formatted to alert the user to an action they may perform. */
    var action: js.UndefOr[Any | Boolean] = js.undefined
    
    /** An action can appear along side an Input on the left or right. */
    var actionPosition: js.UndefOr["left"] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[Any] = js.undefined
    
    /** An Input field can show the data contains errors. */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** Take on the size of its container. */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /** An Input field can show a user is currently interacting with it. */
    var focus: js.UndefOr[Boolean] = js.undefined
    
    /** Optional Icon to display inside the Input. */
    var icon: js.UndefOr[Any | SemanticShorthandItem[InputProps]] = js.undefined
    
    /** An Icon can appear inside an Input on the left. */
    var iconPosition: js.UndefOr["left"] = js.undefined
    
    /** Shorthand for creating the HTML Input. */
    var input: js.UndefOr[SemanticShorthandItem[HtmlInputrops]] = js.undefined
    
    /** Format to appear on dark backgrounds. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /** Optional Label to display along side the Input. */
    var label: js.UndefOr[SemanticShorthandItem[LabelProps]] = js.undefined
    
    /** A Label can appear outside an Input on the left or right. */
    var labelPosition: js.UndefOr["left" | "right" | ("left corner") | ("right corner")] = js.undefined
    
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
    var size_StrictInputProps: js.UndefOr["mini" | "small" | "large" | "big" | "huge" | "massive"] = js.undefined
    
    /** An Input can receive focus. */
    @JSName("tabIndex")
    var tabIndex_StrictInputProps: js.UndefOr[Double | String] = js.undefined
    
    /** Transparent Input has no background. */
    var transparent: js.UndefOr[Boolean] = js.undefined
    
    /** The HTML input type. */
    @JSName("type")
    var type_StrictInputProps: js.UndefOr[String] = js.undefined
  }
  object StrictInputProps {
    
    inline def apply(): StrictInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictInputProps]
    }
    
    extension [Self <: StrictInputProps](x: Self) {
      
      inline def setAction(value: Any | Boolean): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionPosition(value: "left"): Self = StObject.set(x, "actionPosition", value.asInstanceOf[js.Any])
      
      inline def setActionPositionUndefined: Self = StObject.set(x, "actionPosition", js.undefined)
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setAs(value: Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setFocus(value: Boolean): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setIcon(value: Any | SemanticShorthandItem[InputProps]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction3(
        value: (/* component */ ElementType[InputProps], InputProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "icon", js.Any.fromFunction3(value))
      
      inline def setIconPosition(value: "left"): Self = StObject.set(x, "iconPosition", value.asInstanceOf[js.Any])
      
      inline def setIconPositionUndefined: Self = StObject.set(x, "iconPosition", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setInput(value: SemanticShorthandItem[HtmlInputrops]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputFunction3(
        value: (/* component */ ElementType[HtmlInputrops], HtmlInputrops, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "input", js.Any.fromFunction3(value))
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setLabel(value: SemanticShorthandItem[LabelProps]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction3(
        value: (/* component */ ElementType[LabelProps], LabelProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "label", js.Any.fromFunction3(value))
      
      inline def setLabelPosition(value: "left" | "right" | ("left corner") | ("right corner")): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOnChange(value: (/* event */ ChangeEvent[HTMLInputElement], /* data */ InputOnChangeData) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setSize(value: "mini" | "small" | "large" | "big" | "huge" | "massive"): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTabIndex(value: Double | String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
