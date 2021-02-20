package typings.reactStickyEl

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.HTMLAttributes
import typings.reactStickyEl.mod.Sticky.Props
import typings.reactStickyEl.reactStickyElStrings.bottom
import typings.reactStickyEl.reactStickyElStrings.top
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-sticky-el", JSImport.Default)
  @js.native
  class default ()
    extends Component[Props[js.Object], js.Object, js.Any]
  
  object Sticky {
    
    @js.native
    trait Props[HolderProps /* <: js.Object */] extends HTMLAttributes[HTMLElement] {
      
      /**
        * Sticky state will be triggered when the bottom of the element is
        * `bottomOffset` pixels from the bottom of the `scrollElement`.
        *
        * Defaults to `0`.
        */
      var bottomOffset: js.UndefOr[Double] = js.native
      
      /**
        * Selector to define a `boundaryElement`. It should be one of the parents
        * of the current element.
        *
        * Defaults to `null`.
        */
      var boundaryElement: js.UndefOr[String] = js.native
      
      /**
        * Allows you to disable sticking by setting this prop to `true`.
        *
        * Defaults to `false`.
        */
      var disabled: js.UndefOr[Boolean] = js.native
      
      /**
        * If `false` then boundaryEl should have position: relative. In this case
        * sticky element won't disappear on reaching it's boundaries.
        *
        * Defaults to `true`.
        */
      var hideOnBoundaryHit: js.UndefOr[Boolean] = js.native
      
      /**
        * Anything that can be used by React.createElement. Used for holder
        * element. If you want to use some custom component, please be sure that
        * you don't lose style and className props.
        *
        * Defaults to 'div'.
        */
      var holderCmp: js.UndefOr[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
          ] = js.native
      
      /**
        * These props will be used to create `holderElement`.
        */
      var holderProps: js.UndefOr[HolderProps] = js.native
      
      /**
        * 'top' or 'bottom' - to which side element should stick.
        *
        * Defaults to 'top'.
        */
      var mode: js.UndefOr[top | bottom] = js.native
      
      /**
        * This handler will be called right before changing `fixed` state.
        *
        * Defaults to `null`.
        */
      var onFixedToggle: js.UndefOr[js.Function1[/* fixed */ Boolean, Unit]] = js.native
      
      /**
        * If your DOM structure is mutating (you are adding/removing elements), it
        * will be usefull to provide `positionRecheckInterval` greater than zero,
        * in this case position check will be also performed using setInterval in
        * addition to scroll events.
        *
        * Defaults to `0`.
        */
      var positionRecheckInterval: js.UndefOr[Double] = js.native
      
      /**
        * Selector to define a `scrollElement`. All position checks will be
        * performed according to this element, also it will be listened for
        * 'scroll' event.
        *
        * It should be one of the parents of the current element. Possible
        * selectors: 'body', 'window', '#{id}', anything suitable for
        * `Element.matches`.
        *
        * Defaults to `window`.
        */
      var scrollElement: js.UndefOr[String] = js.native
      
      /**
        * You can also specify a class name to be applied when the element becomes
        * sticky.
        *
        * Defaults to 'sticky'.
        */
      var stickyClassName: js.UndefOr[String] = js.native
      
      /**
        * In the event that you wish to override the style rules applied, simply
        * pass in the style object as a prop.
        *
        * Note: You likely want to avoid messing with the following attributes in
        * your stickyStyle: `left`, `top`, and `width`.
        */
      var stickyStyle: js.UndefOr[CSSProperties] = js.native
      
      /**
        * Sticky state will be triggered when the top of the element is `topOffset`
        * pixels from the top of the `scrollElement`. Positive numbers give the
        * impression of a lazy sticky state, whereas negative numbers are more
        * eager in their attachment.
        *
        * Defaults to `0`.
        */
      var topOffset: js.UndefOr[Double] = js.native
      
      /**
        * Anything that can be used by `React.createElement`. Used for `wrapper
        * element`. If you want to use some custom component, please be sure that
        * you don't lose `style` and `className` props.
        *
        * Defaults to 'div'.
        */
      var wrapperCmp: js.UndefOr[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
          ] = js.native
    }
    object Props {
      
      @scala.inline
      def apply[HolderProps /* <: js.Object */](): Props[HolderProps] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props[HolderProps]]
      }
      
      @scala.inline
      implicit class PropsMutableBuilder[Self <: Props[_], HolderProps /* <: js.Object */] (val x: Self with Props[HolderProps]) extends AnyVal {
        
        @scala.inline
        def setBottomOffset(value: Double): Self = StObject.set(x, "bottomOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBottomOffsetUndefined: Self = StObject.set(x, "bottomOffset", js.undefined)
        
        @scala.inline
        def setBoundaryElement(value: String): Self = StObject.set(x, "boundaryElement", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundaryElementUndefined: Self = StObject.set(x, "boundaryElement", js.undefined)
        
        @scala.inline
        def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
        
        @scala.inline
        def setHideOnBoundaryHit(value: Boolean): Self = StObject.set(x, "hideOnBoundaryHit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHideOnBoundaryHitUndefined: Self = StObject.set(x, "hideOnBoundaryHit", js.undefined)
        
        @scala.inline
        def setHolderCmp(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any): Self = StObject.set(x, "holderCmp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHolderCmpUndefined: Self = StObject.set(x, "holderCmp", js.undefined)
        
        @scala.inline
        def setHolderProps(value: HolderProps): Self = StObject.set(x, "holderProps", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHolderPropsUndefined: Self = StObject.set(x, "holderProps", js.undefined)
        
        @scala.inline
        def setMode(value: top | bottom): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        @scala.inline
        def setOnFixedToggle(value: /* fixed */ Boolean => Unit): Self = StObject.set(x, "onFixedToggle", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnFixedToggleUndefined: Self = StObject.set(x, "onFixedToggle", js.undefined)
        
        @scala.inline
        def setPositionRecheckInterval(value: Double): Self = StObject.set(x, "positionRecheckInterval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionRecheckIntervalUndefined: Self = StObject.set(x, "positionRecheckInterval", js.undefined)
        
        @scala.inline
        def setScrollElement(value: String): Self = StObject.set(x, "scrollElement", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollElementUndefined: Self = StObject.set(x, "scrollElement", js.undefined)
        
        @scala.inline
        def setStickyClassName(value: String): Self = StObject.set(x, "stickyClassName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStickyClassNameUndefined: Self = StObject.set(x, "stickyClassName", js.undefined)
        
        @scala.inline
        def setStickyStyle(value: CSSProperties): Self = StObject.set(x, "stickyStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStickyStyleUndefined: Self = StObject.set(x, "stickyStyle", js.undefined)
        
        @scala.inline
        def setTopOffset(value: Double): Self = StObject.set(x, "topOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTopOffsetUndefined: Self = StObject.set(x, "topOffset", js.undefined)
        
        @scala.inline
        def setWrapperCmp(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any): Self = StObject.set(x, "wrapperCmp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWrapperCmpUndefined: Self = StObject.set(x, "wrapperCmp", js.undefined)
      }
    }
  }
  type Sticky = Component[Props[js.Object], js.Object, js.Any]
}
