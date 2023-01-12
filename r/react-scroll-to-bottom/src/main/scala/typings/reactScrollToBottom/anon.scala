package typings.reactScrollToBottom

import typings.react.mod.ReactNode
import typings.reactScrollToBottom.reactScrollToBottomStrings.`100Percentsign`
import typings.reactScrollToBottom.reactScrollToBottomStrings.auto
import typings.reactScrollToBottom.reactScrollToBottomStrings.bottom
import typings.reactScrollToBottom.reactScrollToBottomStrings.smooth
import typings.reactScrollToBottom.reactScrollToBottomStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Animating extends StObject {
    
    /**
      * `true` if the panel is animating scroll effect
      */
    var animating: Boolean
    
    /**
      * `true` if the panel is animating scroll effect and towards the end (depends on `mode`)
      */
    var animatingToEnd: Boolean
    
    /**
      * `true` if the panel is currently near bottom
      */
    var atBottom: Boolean
    
    /**
      * `true` if the panel is currently near the end (depends on `mode`)
      */
    var atEnd: Boolean
    
    /**
      * `true` if the panel is currently near the start (depends on `mode`)
      */
    var atStart: Boolean
    
    /**
      * `true` if the panel is currently near top
      */
    var atTop: Boolean
    
    /**
      * `"bottom"` for scroll-to-bottom, `"top"` for scroll-to-top
      */
    var mode: String
    
    /**
      * `true` if the panel is sticking to the end
      */
    var sticky: Boolean
  }
  object Animating {
    
    inline def apply(
      animating: Boolean,
      animatingToEnd: Boolean,
      atBottom: Boolean,
      atEnd: Boolean,
      atStart: Boolean,
      atTop: Boolean,
      mode: String,
      sticky: Boolean
    ): Animating = {
      val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any], animatingToEnd = animatingToEnd.asInstanceOf[js.Any], atBottom = atBottom.asInstanceOf[js.Any], atEnd = atEnd.asInstanceOf[js.Any], atStart = atStart.asInstanceOf[js.Any], atTop = atTop.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], sticky = sticky.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animating]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Animating] (val x: Self) extends AnyVal {
      
      inline def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
      
      inline def setAnimatingToEnd(value: Boolean): Self = StObject.set(x, "animatingToEnd", value.asInstanceOf[js.Any])
      
      inline def setAtBottom(value: Boolean): Self = StObject.set(x, "atBottom", value.asInstanceOf[js.Any])
      
      inline def setAtEnd(value: Boolean): Self = StObject.set(x, "atEnd", value.asInstanceOf[js.Any])
      
      inline def setAtStart(value: Boolean): Self = StObject.set(x, "atStart", value.asInstanceOf[js.Any])
      
      inline def setAtTop(value: Boolean): Self = StObject.set(x, "atTop", value.asInstanceOf[js.Any])
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxValue extends StObject {
    
    /**
      * Maximum distance (in pixel) to scroll
      */
    var maxValue: Double
    
    /**
      * Minimum distance (in pixel) to scroll
      */
    var minValue: Double
    
    /**
      * View height of the scrollable container
      */
    var offsetHeight: Double
    
    /**
      * Total height of the content in the container, must be equal or greater than offsetHeight
      */
    var scrollHeight: Double
    
    /**
      * Current scroll position (in pixel)
      */
    var scrollTop: Double
  }
  object MaxValue {
    
    inline def apply(maxValue: Double, minValue: Double, offsetHeight: Double, scrollHeight: Double, scrollTop: Double): MaxValue = {
      val __obj = js.Dynamic.literal(maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxValue] (val x: Self) extends AnyVal {
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setOffsetHeight(value: Double): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react.react.PropsWithChildren<{  checkInterval :number | undefined,   className :string | undefined,   debounce :number | undefined,   debug :boolean | undefined,   followButtonClassName :string | undefined,   initialScrollBehavior :'auto' | 'smooth' | undefined,   mode :'bottom' | 'top' | undefined,   nonce :string | undefined,   scroller :(values : {  maxValue :number,   minValue :number,   offsetHeight :number,   scrollHeight :number,   scrollTop :number}): number | undefined,   scrollViewClassName :string | undefined}> */
  trait PropsWithChildrencheckInt extends StObject {
    
    /**
      * Recurring interval of stickiness check, in milliseconds (minimum is 17 ms)
      */
    var checkInterval: js.UndefOr[Double] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Set the class name for the root element
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Set the debounce for tracking the `onScroll` event
      */
    var debounce: js.UndefOr[Double] = js.undefined
    
    /**
      * Show debug information in console
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the class name for the follow button
      */
    var followButtonClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Set the initial scroll behavior, either `"auto"` (discrete scrolling) or `"smooth"`
      */
    var initialScrollBehavior: js.UndefOr[auto | smooth] = js.undefined
    
    /**
      * Set it to `"bottom"` for scroll-to-bottom, `"top"` for scroll-to-top
      */
    var mode: js.UndefOr[bottom | top] = js.undefined
    
    /**
      * Set the nonce for Content Security Policy
      */
    var nonce: js.UndefOr[String] = js.undefined
    
    /**
      * Set the class name for the container element that house all `props.children`
      */
    var scrollViewClassName: js.UndefOr[String] = js.undefined
    
    /**
      * A function to determine how far should scroll when scroll is needed
      */
    var scroller: js.UndefOr[js.Function1[/* values */ MaxValue, Double]] = js.undefined
  }
  object PropsWithChildrencheckInt {
    
    inline def apply(): PropsWithChildrencheckInt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropsWithChildrencheckInt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropsWithChildrencheckInt] (val x: Self) extends AnyVal {
      
      inline def setCheckInterval(value: Double): Self = StObject.set(x, "checkInterval", value.asInstanceOf[js.Any])
      
      inline def setCheckIntervalUndefined: Self = StObject.set(x, "checkInterval", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setFollowButtonClassName(value: String): Self = StObject.set(x, "followButtonClassName", value.asInstanceOf[js.Any])
      
      inline def setFollowButtonClassNameUndefined: Self = StObject.set(x, "followButtonClassName", js.undefined)
      
      inline def setInitialScrollBehavior(value: auto | smooth): Self = StObject.set(x, "initialScrollBehavior", value.asInstanceOf[js.Any])
      
      inline def setInitialScrollBehaviorUndefined: Self = StObject.set(x, "initialScrollBehavior", js.undefined)
      
      inline def setMode(value: bottom | top): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setScrollViewClassName(value: String): Self = StObject.set(x, "scrollViewClassName", value.asInstanceOf[js.Any])
      
      inline def setScrollViewClassNameUndefined: Self = StObject.set(x, "scrollViewClassName", js.undefined)
      
      inline def setScroller(value: /* values */ MaxValue => Double): Self = StObject.set(x, "scroller", js.Any.fromFunction1(value))
      
      inline def setScrollerUndefined: Self = StObject.set(x, "scroller", js.undefined)
    }
  }
  
  @js.native
  trait ScrollTo extends StObject {
    
    /**
      * Scroll panel to specified position
      */
    def scrollTo(scrollTop: Double): Unit = js.native
    
    /**
      * Scroll panel to bottom
      */
    def scrollToBottom(): Unit = js.native
    
    /**
      * Scroll panel to end (depends on mode)
      */
    def scrollToEnd(): Unit = js.native
    
    /**
      * Scroll panel to start (depends on mode)
      */
    def scrollToStart(): Unit = js.native
    
    /**
      * Scroll panel to top
      */
    def scrollToTop(): Unit = js.native
    
    @JSName("scrollTo")
    def scrollTo_100(scrollTop: `100Percentsign`): Unit = js.native
  }
  
  trait ScrollTop extends StObject {
    
    var scrollTop: Double
  }
  object ScrollTop {
    
    inline def apply(scrollTop: Double): ScrollTop = {
      val __obj = js.Dynamic.literal(scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollTop]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollTop] (val x: Self) extends AnyVal {
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
}
