package typings.reactNativeCommunityViewpager

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.`on-drag`
import typings.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.always
import typings.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.auto
import typings.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.curl
import typings.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.dragging
import typings.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.horizontal
import typings.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.idle
import typings.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.never
import typings.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.none
import typings.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.scroll
import typings.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.settling
import typings.reactNativeCommunityViewpager.reactNativeCommunityViewpagerStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-community/viewpager", JSImport.Default)
  @js.native
  class default () extends ViewPager
  
  trait PageScrollStateChangedEvent extends StObject {
    
    var pageScrollState: idle | dragging | settling
  }
  object PageScrollStateChangedEvent {
    
    inline def apply(pageScrollState: idle | dragging | settling): PageScrollStateChangedEvent = {
      val __obj = js.Dynamic.literal(pageScrollState = pageScrollState.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageScrollStateChangedEvent]
    }
    
    extension [Self <: PageScrollStateChangedEvent](x: Self) {
      
      inline def setPageScrollState(value: idle | dragging | settling): Self = StObject.set(x, "pageScrollState", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethodsMixin */ @js.native
  trait ViewPager
    extends Component[ViewPagerProps, js.Object, js.Any] {
    
    /**
      * A helper function to scroll to a specific page in the ViewPager.
      * The transition between pages will be animated.
      */
    def setPage(selectedPage: Double): Unit = js.native
    
    /**
      * A helper function to scroll to a specific page in the ViewPager.
      * The transition between pages will *not* be animated.
      */
    def setPageWithoutAnimation(selectedPage: Double): Unit = js.native
  }
  
  type ViewPagerComponent = Component[ViewPagerProps, js.Object, js.Any]
  
  trait ViewPagerOnPageScrollEventData extends StObject {
    
    var offset: Double
    
    var position: Double
  }
  object ViewPagerOnPageScrollEventData {
    
    inline def apply(offset: Double, position: Double): ViewPagerOnPageScrollEventData = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewPagerOnPageScrollEventData]
    }
    
    extension [Self <: ViewPagerOnPageScrollEventData](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait ViewPagerOnPageSelectedEventData extends StObject {
    
    var position: Double
  }
  object ViewPagerOnPageSelectedEventData {
    
    inline def apply(position: Double): ViewPagerOnPageSelectedEventData = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewPagerOnPageSelectedEventData]
    }
    
    extension [Self <: ViewPagerOnPageSelectedEventData](x: Self) {
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait ViewPagerProps extends StObject {
    
    var children: ReactNode
    
    /**
      * Index of initial page that should be selected. Use `setPage` method to
      * update the page, and `onPageSelected` to monitor page changes
      */
    var initialPage: js.UndefOr[Double] = js.undefined
    
    /**
      * Determines whether the keyboard gets dismissed in response to a drag.
      *   - 'none' (the default), drags do not dismiss the keyboard.
      *   - 'on-drag', the keyboard is dismissed when a drag begins.
      */
    var keyboardDismissMode: js.UndefOr[none | `on-drag`] = js.undefined
    
    /**
      * If a parent `View` wants to prevent a child `View` from becoming responder
      * on a move, it should have this handler which returns `true`.
      *
      * `View.props.onMoveShouldSetResponderCapture: (event) => [true | false]`,
      * where `event` is a synthetic touch event as described above.
      *
      * See http://facebook.github.io/react-native/docs/view.html#onMoveShouldsetrespondercapture
      */
    var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    /**
      * Executed when transitioning between pages (ether because of animation for
      * the requested page change or when user is swiping/dragging between pages)
      * The `event.nativeEvent` object for this callback will carry following data:
      *  - position - index of first page from the left that is currently visible
      *  - offset - value from range [0,1) describing stage between page transitions.
      *    Value x means that (1 - x) fraction of the page at "position" index is
      *    visible, and x fraction of the next page is visible.
      */
    var onPageScroll: js.UndefOr[
        js.Function1[/* event */ NativeSyntheticEvent[ViewPagerOnPageScrollEventData], Unit]
      ] = js.undefined
    
    /**
      * Function called when the page scrolling state has changed.
      * The page scrolling state can be in 3 states:
      * - idle, meaning there is no interaction with the page scroller happening at the time
      * - dragging, meaning there is currently an interaction with the page scroller
      * - settling, meaning that there was an interaction with the page scroller, and the
      *   page scroller is now finishing it's closing or opening animation
      */
    var onPageScrollStateChanged: js.UndefOr[
        js.Function1[/* event */ NativeSyntheticEvent[PageScrollStateChangedEvent], Unit]
      ] = js.undefined
    
    /**
      * This callback will be called once ViewPager finish navigating to selected page
      * (when user swipes between pages). The `event.nativeEvent` object passed to this
      * callback will have following fields:
      *  - position - index of page that has been selected
      */
    var onPageSelected: js.UndefOr[
        js.Function1[/* event */ NativeSyntheticEvent[ViewPagerOnPageSelectedEventData], Unit]
      ] = js.undefined
    
    /**
      * iOS only
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    /**
      * Android only
      */
    var overScrollMode: js.UndefOr[auto | always | never] = js.undefined
    
    /**
      * Blank space to show between pages. This is only visible while scrolling, pages are still
      * edge-to-edge.
      */
    var pageMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * When false, the content does not scroll.
      * The default value is true.
      */
    var scrollEnabled: js.UndefOr[Boolean] = js.undefined
    
    var showPageIndicator: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var transitionStyle: js.UndefOr[scroll | curl] = js.undefined
  }
  object ViewPagerProps {
    
    inline def apply(): ViewPagerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewPagerProps]
    }
    
    extension [Self <: ViewPagerProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialPage(value: Double): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
      
      inline def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
      
      inline def setKeyboardDismissMode(value: none | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
      
      inline def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      inline def setOnPageScroll(value: /* event */ NativeSyntheticEvent[ViewPagerOnPageScrollEventData] => Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
      
      inline def setOnPageScrollStateChanged(value: /* event */ NativeSyntheticEvent[PageScrollStateChangedEvent] => Unit): Self = StObject.set(x, "onPageScrollStateChanged", js.Any.fromFunction1(value))
      
      inline def setOnPageScrollStateChangedUndefined: Self = StObject.set(x, "onPageScrollStateChanged", js.undefined)
      
      inline def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
      
      inline def setOnPageSelected(value: /* event */ NativeSyntheticEvent[ViewPagerOnPageSelectedEventData] => Unit): Self = StObject.set(x, "onPageSelected", js.Any.fromFunction1(value))
      
      inline def setOnPageSelectedUndefined: Self = StObject.set(x, "onPageSelected", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setOverScrollMode(value: auto | always | never): Self = StObject.set(x, "overScrollMode", value.asInstanceOf[js.Any])
      
      inline def setOverScrollModeUndefined: Self = StObject.set(x, "overScrollMode", js.undefined)
      
      inline def setPageMargin(value: Double): Self = StObject.set(x, "pageMargin", value.asInstanceOf[js.Any])
      
      inline def setPageMarginUndefined: Self = StObject.set(x, "pageMargin", js.undefined)
      
      inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
      
      inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
      
      inline def setShowPageIndicator(value: Boolean): Self = StObject.set(x, "showPageIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowPageIndicatorUndefined: Self = StObject.set(x, "showPageIndicator", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTransitionStyle(value: scroll | curl): Self = StObject.set(x, "transitionStyle", value.asInstanceOf[js.Any])
      
      inline def setTransitionStyleUndefined: Self = StObject.set(x, "transitionStyle", js.undefined)
    }
  }
}
