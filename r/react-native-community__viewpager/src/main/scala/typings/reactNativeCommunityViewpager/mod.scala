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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-community/viewpager", JSImport.Default)
  @js.native
  class default () extends ViewPager
  
  @js.native
  trait PageScrollStateChangedEvent extends StObject {
    
    var pageScrollState: idle | dragging | settling = js.native
  }
  object PageScrollStateChangedEvent {
    
    @scala.inline
    def apply(pageScrollState: idle | dragging | settling): PageScrollStateChangedEvent = {
      val __obj = js.Dynamic.literal(pageScrollState = pageScrollState.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageScrollStateChangedEvent]
    }
    
    @scala.inline
    implicit class PageScrollStateChangedEventMutableBuilder[Self <: PageScrollStateChangedEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPageScrollState(value: idle | dragging | settling): Self = StObject.set(x, "pageScrollState", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait ViewPagerOnPageScrollEventData extends StObject {
    
    var offset: Double = js.native
    
    var position: Double = js.native
  }
  object ViewPagerOnPageScrollEventData {
    
    @scala.inline
    def apply(offset: Double, position: Double): ViewPagerOnPageScrollEventData = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewPagerOnPageScrollEventData]
    }
    
    @scala.inline
    implicit class ViewPagerOnPageScrollEventDataMutableBuilder[Self <: ViewPagerOnPageScrollEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ViewPagerOnPageSelectedEventData extends StObject {
    
    var position: Double = js.native
  }
  object ViewPagerOnPageSelectedEventData {
    
    @scala.inline
    def apply(position: Double): ViewPagerOnPageSelectedEventData = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewPagerOnPageSelectedEventData]
    }
    
    @scala.inline
    implicit class ViewPagerOnPageSelectedEventDataMutableBuilder[Self <: ViewPagerOnPageSelectedEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ViewPagerProps extends StObject {
    
    var children: ReactNode = js.native
    
    /**
      * Index of initial page that should be selected. Use `setPage` method to
      * update the page, and `onPageSelected` to monitor page changes
      */
    var initialPage: js.UndefOr[Double] = js.native
    
    /**
      * Determines whether the keyboard gets dismissed in response to a drag.
      *   - 'none' (the default), drags do not dismiss the keyboard.
      *   - 'on-drag', the keyboard is dismissed when a drag begins.
      */
    var keyboardDismissMode: js.UndefOr[none | `on-drag`] = js.native
    
    /**
      * If a parent `View` wants to prevent a child `View` from becoming responder
      * on a move, it should have this handler which returns `true`.
      *
      * `View.props.onMoveShouldSetResponderCapture: (event) => [true | false]`,
      * where `event` is a synthetic touch event as described above.
      *
      * See http://facebook.github.io/react-native/docs/view.html#onMoveShouldsetrespondercapture
      */
    var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.native
    
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
      ] = js.native
    
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
      ] = js.native
    
    /**
      * This callback will be called once ViewPager finish navigating to selected page
      * (when user swipes between pages). The `event.nativeEvent` object passed to this
      * callback will have following fields:
      *  - position - index of page that has been selected
      */
    var onPageSelected: js.UndefOr[
        js.Function1[/* event */ NativeSyntheticEvent[ViewPagerOnPageSelectedEventData], Unit]
      ] = js.native
    
    /**
      * iOS only
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.native
    
    /**
      * Android only
      */
    var overScrollMode: js.UndefOr[auto | always | never] = js.native
    
    /**
      * Blank space to show between pages. This is only visible while scrolling, pages are still
      * edge-to-edge.
      */
    var pageMargin: js.UndefOr[Double] = js.native
    
    /**
      * When false, the content does not scroll.
      * The default value is true.
      */
    var scrollEnabled: js.UndefOr[Boolean] = js.native
    
    var showPageIndicator: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var transitionStyle: js.UndefOr[scroll | curl] = js.native
  }
  object ViewPagerProps {
    
    @scala.inline
    def apply(): ViewPagerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewPagerProps]
    }
    
    @scala.inline
    implicit class ViewPagerPropsMutableBuilder[Self <: ViewPagerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setInitialPage(value: Double): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
      
      @scala.inline
      def setKeyboardDismissMode(value: none | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
      
      @scala.inline
      def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      @scala.inline
      def setOnPageScroll(value: /* event */ NativeSyntheticEvent[ViewPagerOnPageScrollEventData] => Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageScrollStateChanged(value: /* event */ NativeSyntheticEvent[PageScrollStateChangedEvent] => Unit): Self = StObject.set(x, "onPageScrollStateChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageScrollStateChangedUndefined: Self = StObject.set(x, "onPageScrollStateChanged", js.undefined)
      
      @scala.inline
      def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
      
      @scala.inline
      def setOnPageSelected(value: /* event */ NativeSyntheticEvent[ViewPagerOnPageSelectedEventData] => Unit): Self = StObject.set(x, "onPageSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPageSelectedUndefined: Self = StObject.set(x, "onPageSelected", js.undefined)
      
      @scala.inline
      def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setOverScrollMode(value: auto | always | never): Self = StObject.set(x, "overScrollMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverScrollModeUndefined: Self = StObject.set(x, "overScrollMode", js.undefined)
      
      @scala.inline
      def setPageMargin(value: Double): Self = StObject.set(x, "pageMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageMarginUndefined: Self = StObject.set(x, "pageMargin", js.undefined)
      
      @scala.inline
      def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
      
      @scala.inline
      def setShowPageIndicator(value: Boolean): Self = StObject.set(x, "showPageIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPageIndicatorUndefined: Self = StObject.set(x, "showPageIndicator", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransitionStyle(value: scroll | curl): Self = StObject.set(x, "transitionStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionStyleUndefined: Self = StObject.set(x, "transitionStyle", js.undefined)
    }
  }
}
