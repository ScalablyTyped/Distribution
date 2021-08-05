package typings.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dimmerInnerMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Dimmer/DimmerInner", JSImport.Default)
  @js.native
  class default ()
    extends Component[DimmerInnerProps, js.Object, js.Any]
  
  type DimmerInner = Component[DimmerInnerProps, js.Object, js.Any]
  
  trait DimmerInnerProps
    extends StObject
       with StrictDimmerInnerProps
       with /* key */ StringDictionary[js.Any]
  object DimmerInnerProps {
    
    inline def apply(): DimmerInnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DimmerInnerProps]
    }
  }
  
  trait StrictDimmerInnerProps extends StObject {
    
    /** An active dimmer will dim its parent container. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.undefined
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.undefined
    
    /** A disabled dimmer cannot be activated */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** A dimmer can be formatted to have its colors inverted. */
    var inverted: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Called when the dimmer is clicked.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
          /* data */ DimmerInnerProps, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Handles click outside Dimmer's content, but inside Dimmer area.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClickOutside: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], 
          /* data */ DimmerInnerProps, 
          Unit
        ]
      ] = js.undefined
    
    /** A dimmer can be formatted to be fixed to the page. */
    var page: js.UndefOr[Boolean] = js.undefined
    
    /** A dimmer can be controlled with simple prop. */
    var simple: js.UndefOr[Boolean] = js.undefined
    
    /** A dimmer can have its content top or bottom aligned. */
    var verticalAlign: js.UndefOr[bottom | top] = js.undefined
  }
  object StrictDimmerInnerProps {
    
    inline def apply(): StrictDimmerInnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictDimmerInnerProps]
    }
    
    extension [Self <: StrictDimmerInnerProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      inline def setOnClick(
        value: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ DimmerInnerProps) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickOutside(
        value: (/* event */ MouseEvent[HTMLDivElement, NativeMouseEvent], /* data */ DimmerInnerProps) => Unit
      ): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction2(value))
      
      inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPage(value: Boolean): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setSimple(value: Boolean): Self = StObject.set(x, "simple", value.asInstanceOf[js.Any])
      
      inline def setSimpleUndefined: Self = StObject.set(x, "simple", js.undefined)
      
      inline def setVerticalAlign(value: bottom | top): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
}
