package typings.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.semanticUiReact.semanticUiReactStrings.ellipsisItem
import typings.semanticUiReact.semanticUiReactStrings.firstItem
import typings.semanticUiReact.semanticUiReactStrings.lastItem
import typings.semanticUiReact.semanticUiReactStrings.nextItem
import typings.semanticUiReact.semanticUiReactStrings.pageItem
import typings.semanticUiReact.semanticUiReactStrings.prevItem
import typings.std.HTMLAnchorElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationItemMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/Pagination/PaginationItem", JSImport.Default)
  @js.native
  class default ()
    extends Component[PaginationItemProps, js.Object, js.Any]
  
  type PaginationItem = Component[PaginationItemProps, js.Object, js.Any]
  
  trait PaginationItemProps
    extends StObject
       with StrictPaginationItemProps
       with /* key */ StringDictionary[js.Any]
  object PaginationItemProps {
    
    inline def apply(): PaginationItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationItemProps]
    }
  }
  
  trait StrictPaginationItemProps extends StObject {
    
    /** A pagination item can be active. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** A pagination item can be disabled. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Called on click.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onClick: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], 
          /* data */ PaginationItemProps, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Called on key down.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onKeyDown: js.UndefOr[
        js.Function2[
          /* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], 
          /* data */ PaginationItemProps, 
          Unit
        ]
      ] = js.undefined
    
    /** A pagination should have a type. */
    var `type`: js.UndefOr[ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem] = js.undefined
  }
  object StrictPaginationItemProps {
    
    inline def apply(): StrictPaginationItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictPaginationItemProps]
    }
    
    extension [Self <: StrictPaginationItemProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnClick(
        value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ PaginationItemProps) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnKeyDown(
        value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ PaginationItemProps) => Unit
      ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setType(value: ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
