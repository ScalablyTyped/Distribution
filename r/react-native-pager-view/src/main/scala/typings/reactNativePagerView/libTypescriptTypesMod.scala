package typings.reactNativePagerView

import typings.react.mod.ReactNode
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativePagerView.reactNativePagerViewStrings.`on-drag`
import typings.reactNativePagerView.reactNativePagerViewStrings.locale
import typings.reactNativePagerView.reactNativePagerViewStrings.ltr
import typings.reactNativePagerView.reactNativePagerViewStrings.none
import typings.reactNativePagerView.reactNativePagerViewStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativePagerView.reactNativePagerViewStrings.horizontal
    - typings.reactNativePagerView.reactNativePagerViewStrings.vertical
  */
  trait Orientation extends StObject
  object Orientation {
    
    inline def horizontal: typings.reactNativePagerView.reactNativePagerViewStrings.horizontal = "horizontal".asInstanceOf[typings.reactNativePagerView.reactNativePagerViewStrings.horizontal]
    
    inline def vertical: typings.reactNativePagerView.reactNativePagerViewStrings.vertical = "vertical".asInstanceOf[typings.reactNativePagerView.reactNativePagerViewStrings.vertical]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativePagerView.reactNativePagerViewStrings.auto
    - typings.reactNativePagerView.reactNativePagerViewStrings.always
    - typings.reactNativePagerView.reactNativePagerViewStrings.never
  */
  trait OverScrollMode extends StObject
  object OverScrollMode {
    
    inline def always: typings.reactNativePagerView.reactNativePagerViewStrings.always = "always".asInstanceOf[typings.reactNativePagerView.reactNativePagerViewStrings.always]
    
    inline def auto: typings.reactNativePagerView.reactNativePagerViewStrings.auto = "auto".asInstanceOf[typings.reactNativePagerView.reactNativePagerViewStrings.auto]
    
    inline def never: typings.reactNativePagerView.reactNativePagerViewStrings.never = "never".asInstanceOf[typings.reactNativePagerView.reactNativePagerViewStrings.never]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativePagerView.reactNativePagerViewStrings.idle
    - typings.reactNativePagerView.reactNativePagerViewStrings.dragging
    - typings.reactNativePagerView.reactNativePagerViewStrings.settling
  */
  trait PageScrollState extends StObject
  object PageScrollState {
    
    inline def dragging: typings.reactNativePagerView.reactNativePagerViewStrings.dragging = "dragging".asInstanceOf[typings.reactNativePagerView.reactNativePagerViewStrings.dragging]
    
    inline def idle: typings.reactNativePagerView.reactNativePagerViewStrings.idle = "idle".asInstanceOf[typings.reactNativePagerView.reactNativePagerViewStrings.idle]
    
    inline def settling: typings.reactNativePagerView.reactNativePagerViewStrings.settling = "settling".asInstanceOf[typings.reactNativePagerView.reactNativePagerViewStrings.settling]
  }
  
  trait PageScrollStateChangedEvent extends StObject {
    
    var pageScrollState: PageScrollState
  }
  object PageScrollStateChangedEvent {
    
    inline def apply(pageScrollState: PageScrollState): PageScrollStateChangedEvent = {
      val __obj = js.Dynamic.literal(pageScrollState = pageScrollState.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageScrollStateChangedEvent]
    }
    
    extension [Self <: PageScrollStateChangedEvent](x: Self) {
      
      inline def setPageScrollState(value: PageScrollState): Self = StObject.set(x, "pageScrollState", value.asInstanceOf[js.Any])
    }
  }
  
  type PageScrollStateChangedNativeEvent = NativeSyntheticEvent[PageScrollStateChangedEvent]
  
  type PagerViewOnPageScrollEvent = NativeSyntheticEvent[PagerViewOnPageScrollEventData]
  
  trait PagerViewOnPageScrollEventData extends StObject {
    
    var offset: Double
    
    var position: Double
  }
  object PagerViewOnPageScrollEventData {
    
    inline def apply(offset: Double, position: Double): PagerViewOnPageScrollEventData = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[PagerViewOnPageScrollEventData]
    }
    
    extension [Self <: PagerViewOnPageScrollEventData](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  type PagerViewOnPageSelectedEvent = NativeSyntheticEvent[PagerViewOnPageSelectedEventData]
  
  trait PagerViewOnPageSelectedEventData extends StObject {
    
    var position: Double
  }
  object PagerViewOnPageSelectedEventData {
    
    inline def apply(position: Double): PagerViewOnPageSelectedEventData = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[PagerViewOnPageSelectedEventData]
    }
    
    extension [Self <: PagerViewOnPageSelectedEventData](x: Self) {
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait PagerViewProps extends StObject {
    
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
      * A class for defining layout directions. A layout direction can be left-to-right (LTR) or right-to-left (RTL).
      * It can also be deduced from the default language script of a locale.
      *   - 'rtl' right to left
      *   - 'ltr', left to right
      *   - 'locale', default language script of a locale
      */
    var layoutDirection: js.UndefOr[rtl | ltr | locale] = js.undefined
    
    /**
      * Set the number of pages that should be retained to either side
      * of the currently visible page(s). Pages beyond this limit will
      * be recreated from the adapter when needed.
      * Defaults to RecyclerView's caching strategy.
      * The given value must either be larger than 0.
      *
      * Only supported on Android.
      */
    var offscreenPageLimit: js.UndefOr[Double] = js.undefined
    
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
    var onPageScroll: js.UndefOr[js.Function1[/* event */ PagerViewOnPageScrollEvent, Unit]] = js.undefined
    
    /**
      * Function called when the page scrolling state has changed.
      * The page scrolling state can be in 3 states:
      * - idle, meaning there is no interaction with the page scroller happening at the time
      * - dragging, meaning there is currently an interaction with the page scroller
      * - settling, meaning that there was an interaction with the page scroller, and the
      *   page scroller is now finishing its closing or opening animation
      */
    var onPageScrollStateChanged: js.UndefOr[js.Function1[/* event */ PageScrollStateChangedNativeEvent, Unit]] = js.undefined
    
    /**
      * This callback will be called once PagerView finish navigating to selected page
      * (when user swipes between pages). The `event.nativeEvent` object passed to this
      * callback will have following fields:
      *  - position - index of page that has been selected
      */
    var onPageSelected: js.UndefOr[js.Function1[/* event */ PagerViewOnPageSelectedEvent, Unit]] = js.undefined
    
    /**
      * Does this view want to become responder on the start of a touch?
      *
      * See https://reactnative.dev/docs/view#onstartshouldsetrespondercapture
      */
    var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    /**
      * iOS only
      */
    var orientation: js.UndefOr[Orientation] = js.undefined
    
    /**
      * Android only
      */
    var overScrollMode: js.UndefOr[OverScrollMode] = js.undefined
    
    /**
      * Determines whether it's possible to overscroll a bit
      * after reaching end or very beginning of pages. The default value is false.
      */
    var overdrag: js.UndefOr[Boolean] = js.undefined
    
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
  }
  object PagerViewProps {
    
    inline def apply(): PagerViewProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagerViewProps]
    }
    
    extension [Self <: PagerViewProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialPage(value: Double): Self = StObject.set(x, "initialPage", value.asInstanceOf[js.Any])
      
      inline def setInitialPageUndefined: Self = StObject.set(x, "initialPage", js.undefined)
      
      inline def setKeyboardDismissMode(value: none | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
      
      inline def setLayoutDirection(value: rtl | ltr | locale): Self = StObject.set(x, "layoutDirection", value.asInstanceOf[js.Any])
      
      inline def setLayoutDirectionUndefined: Self = StObject.set(x, "layoutDirection", js.undefined)
      
      inline def setOffscreenPageLimit(value: Double): Self = StObject.set(x, "offscreenPageLimit", value.asInstanceOf[js.Any])
      
      inline def setOffscreenPageLimitUndefined: Self = StObject.set(x, "offscreenPageLimit", js.undefined)
      
      inline def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      inline def setOnPageScroll(value: /* event */ PagerViewOnPageScrollEvent => Unit): Self = StObject.set(x, "onPageScroll", js.Any.fromFunction1(value))
      
      inline def setOnPageScrollStateChanged(value: /* event */ PageScrollStateChangedNativeEvent => Unit): Self = StObject.set(x, "onPageScrollStateChanged", js.Any.fromFunction1(value))
      
      inline def setOnPageScrollStateChangedUndefined: Self = StObject.set(x, "onPageScrollStateChanged", js.undefined)
      
      inline def setOnPageScrollUndefined: Self = StObject.set(x, "onPageScroll", js.undefined)
      
      inline def setOnPageSelected(value: /* event */ PagerViewOnPageSelectedEvent => Unit): Self = StObject.set(x, "onPageSelected", js.Any.fromFunction1(value))
      
      inline def setOnPageSelectedUndefined: Self = StObject.set(x, "onPageSelected", js.undefined)
      
      inline def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setOverScrollMode(value: OverScrollMode): Self = StObject.set(x, "overScrollMode", value.asInstanceOf[js.Any])
      
      inline def setOverScrollModeUndefined: Self = StObject.set(x, "overScrollMode", js.undefined)
      
      inline def setOverdrag(value: Boolean): Self = StObject.set(x, "overdrag", value.asInstanceOf[js.Any])
      
      inline def setOverdragUndefined: Self = StObject.set(x, "overdrag", js.undefined)
      
      inline def setPageMargin(value: Double): Self = StObject.set(x, "pageMargin", value.asInstanceOf[js.Any])
      
      inline def setPageMarginUndefined: Self = StObject.set(x, "pageMargin", js.undefined)
      
      inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
      
      inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
      
      inline def setShowPageIndicator(value: Boolean): Self = StObject.set(x, "showPageIndicator", value.asInstanceOf[js.Any])
      
      inline def setShowPageIndicatorUndefined: Self = StObject.set(x, "showPageIndicator", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
