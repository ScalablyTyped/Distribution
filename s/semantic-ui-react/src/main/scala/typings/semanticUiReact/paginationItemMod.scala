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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationItemMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/Pagination/PaginationItem", JSImport.Default)
  @js.native
  class default ()
    extends Component[PaginationItemProps, js.Object, js.Any]
  
  type PaginationItem = Component[PaginationItemProps, js.Object, js.Any]
  
  @js.native
  trait PaginationItemProps
    extends StrictPaginationItemProps
       with /* key */ StringDictionary[js.Any]
  object PaginationItemProps {
    
    @scala.inline
    def apply(): PaginationItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaginationItemProps]
    }
  }
  
  @js.native
  trait StrictPaginationItemProps extends StObject {
    
    /** A pagination item can be active. */
    var active: js.UndefOr[Boolean] = js.native
    
    /** A pagination item can be disabled. */
    var disabled: js.UndefOr[Boolean] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
    /** A pagination should have a type. */
    var `type`: js.UndefOr[ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem] = js.native
  }
  object StrictPaginationItemProps {
    
    @scala.inline
    def apply(): StrictPaginationItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictPaginationItemProps]
    }
    
    @scala.inline
    implicit class StrictPaginationItemPropsMutableBuilder[Self <: StrictPaginationItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ PaginationItemProps) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyDown(
        value: (/* event */ MouseEvent[HTMLAnchorElement, NativeMouseEvent], /* data */ PaginationItemProps) => Unit
      ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setType(value: ellipsisItem | firstItem | prevItem | pageItem | nextItem | lastItem): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
