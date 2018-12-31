package typings
package reactDashNativeDashSnapDashCarouselLib.reactDashNativeDashSnapDashCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselProps[T]
  extends reactLib.reactMod.ReactNs.Props[reactDashNativeLib.reactDashNativeMod.ScrollViewProps] {
  // Style and animation
  /**
    * Custom animation options.
    * Note that useNativeDriver will be enabled by default and that opacity's easing will always be kept linear.
    * Setting this prop to something other than null will trigger custom animations and will completely change
    * the way items are animated: rather than having their opacity and scale interpolated based the scroll value (default behavior),
    * they will now play the custom animation you provide as soon as they become active.
    * This means you cannot use props layout, scrollInterpolator or slideInterpolatedStyle in conjunction with activeAnimationOptions
    */
  var activeAnimationOptions: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.AnimatedNs.DecayAnimationConfig | reactDashNativeLib.reactDashNativeMod.AnimatedNs.TimingAnimationConfig | reactDashNativeLib.reactDashNativeMod.AnimatedNs.SpringAnimationConfig
  ] = js.native
  /**
    * Custom animation type: either 'decay, 'spring' or 'timing'.
    * Note that it will only be applied to the scale animation since opacity's animation type will always be set
    * to timing (no one wants the opacity to 'bounce' around)
    */
  var activeAnimationType: js.UndefOr[
    reactDashNativeDashSnapDashCarouselLib.reactDashNativeDashSnapDashCarouselLibStrings.decay | reactDashNativeDashSnapDashCarouselLib.reactDashNativeDashSnapDashCarouselLibStrings.spring | reactDashNativeDashSnapDashCarouselLib.reactDashNativeDashSnapDashCarouselLibStrings.timing
  ] = js.native
  /**
    * Determine active slide's alignment relative to the carousel
    */
  var activeSlideAlignment: js.UndefOr[
    reactDashNativeDashSnapDashCarouselLib.reactDashNativeDashSnapDashCarouselLibStrings.start | reactDashNativeDashSnapDashCarouselLib.reactDashNativeDashSnapDashCarouselLibStrings.center | reactDashNativeDashSnapDashCarouselLib.reactDashNativeDashSnapDashCarouselLibStrings.end
  ] = js.native
  // Behavior
  /**
    * From slider's center, minimum slide distance to be scrolled before being set to active
    */
  var activeSlideOffset: js.UndefOr[scala.Double] = js.native
  /**
    * Duration of time while component is hidden after mounting. NOTE: May cause rendering
    * issues on Android. Defaults to 0
    */
  var apparitionDelay: js.UndefOr[scala.Double] = js.native
  // Autoplay
  /**
    * Trigger autoplay on mount
    */
  var autoplay: js.UndefOr[scala.Boolean] = js.native
  /**
    * Delay before enabling autoplay on startup & after releasing the touch
    */
  var autoplayDelay: js.UndefOr[scala.Double] = js.native
  /**
    * Delay in ms until navigating to the next item
    */
  var autoplayInterval: js.UndefOr[scala.Double] = js.native
  /**
    * Defines a small margin for callbacks firing from scroll events.  Increase this value
    * if you experience missed callbacks. Defaults to 5
    */
  var callbackOffsetMargin: js.UndefOr[scala.Double] = js.native
  /**
    * Optional styles for Scrollview's global wrapper
    */
  var containerCustomStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.native
  /**
    * Optional styles for Scrollview's items container
    */
  var contentContainerCustomStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.native
  // Required
  /**
    * Array of items to loop over
    */
  var data: js.Array[T] = js.native
  /**
    * Since 1.5.0, the snapping effect can now be based on momentum instead of when you're
    * releasing your finger. It means that the component will wait until the ScrollView
    * isn't moving anymore to snap
    */
  var enableMomentum: js.UndefOr[scala.Boolean] = js.native
  /**
    * If enabled, releasing the touch will scroll to the center of the nearest/active item
    */
  var enableSnap: js.UndefOr[scala.Boolean] = js.native
  /**
    * Index of the first item to display
    */
  var firstItem: js.UndefOr[scala.Double] = js.native
  /**
    * Flag to indicate whether the carousel contains `<ParallaxImage />`. Parallax data
    * will not be passed to carousel items if this is false
    */
  var hasParallaxImages: js.UndefOr[scala.Boolean] = js.native
  /**
    * Value of the opacity effect applied to inactive slides
    */
  var inactiveSlideOpacity: js.UndefOr[scala.Double] = js.native
  /**
    * Value of the 'scale' transform applied to inactive slides
    */
  var inactiveSlideScale: js.UndefOr[scala.Double] = js.native
  /**
    * Value of the 'translate' transform applied to inactive slides. Not recommended with
    * `customAnimationOptions`
    */
  var inactiveSlideShift: js.UndefOr[scala.Double] = js.native
  /**
    * Width in pixels of your slides, must be the same for all of them
    * Note: Required with horizontal carousel
    */
  /**
    * Reverses the direction of scroll. Uses scale transforms of -1.
    */
  var inverted: js.UndefOr[scala.Boolean] = js.native
  /**
    * Height in pixels of carousel's items, must be the same for all of them
    * Note: Required with vertical carousel
    */
  var itemHeight: js.UndefOr[scala.Double] = js.native
  var itemWidth: js.UndefOr[scala.Double] = js.native
  /**
    * Define the way items are rendered and animated.
    * Possible values are 'default', 'stack' and 'tinder'.
    * See this for more info and visual examples.
    * WARNING: setting this prop to either 'stack' or 'tinder' will activate useScrollView to prevent rendering bugs with FlatList.
    * Therefore, those layouts will probably not be suited if you have a large data set.
    */
  var layout: js.UndefOr[
    reactDashNativeDashSnapDashCarouselLib.reactDashNativeDashSnapDashCarouselLibStrings.default | reactDashNativeDashSnapDashCarouselLib.reactDashNativeDashSnapDashCarouselLibStrings.stack | reactDashNativeDashSnapDashCarouselLib.reactDashNativeDashSnapDashCarouselLibStrings.tinder
  ] = js.native
  /**
    * Use to increase or decrease the default card offset in both 'stack' and 'tinder' layouts.
    */
  var layoutCardOffset: js.UndefOr[scala.Double] = js.native
  /**
    * Changes default lock's timeout duration in ms.
    */
  var lockScrollTimeoutDuration: js.UndefOr[scala.Double] = js.native
  /**
    * Prevent the user from interacting with the carousel while it is snapping. Ignored
    * if `enableMomentum` is `true`
    */
  var lockScrollWhileSnapping: js.UndefOr[scala.Boolean] = js.native
  // Loop
  /**
    * Enable infinite loop mode. Does not work if `enableSnap` is `false`
    */
  var loop: js.UndefOr[scala.Boolean] = js.native
  /**
    * Number of clones to render at the beginning and end of the list. Default
    * is 3
    */
  var loopClonesPerSide: js.UndefOr[scala.Double] = js.native
  /**
    * Callback fired before navigating to an item
    */
  var onBeforeSnapToItem: js.UndefOr[js.Function1[/* slideIndex */ scala.Double, scala.Unit]] = js.native
  // Callbacks
  /**
    * Exposed View callback; invoked on mount and layout changes
    */
  var onLayout: js.UndefOr[
    js.Function1[/* event */ reactDashNativeLib.reactDashNativeMod.LayoutChangeEvent, scala.Unit]
  ] = js.native
  /**
    * Exposed ScrollView callback; fired while scrolling
    */
  var onScroll: js.UndefOr[
    js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.NativeScrollEvent], 
      scala.Unit
    ]
  ] = js.native
  /**
    * Callback fired when navigating to an item
    */
  var onSnapToItem: js.UndefOr[js.Function1[/* slideIndex */ scala.Double, scala.Unit]] = js.native
  /**
    * Allow scroll independently of user interaction on carousel. `false` as default.
    */
  var scrollEnabled: js.UndefOr[scala.Boolean] = js.native
  /**
    * When momentum is disabled, this prop defines the timeframe during which multiple
    * callback calls should be "grouped" into a single one. This debounce also helps
    * smoothing the snap effect by providing a bit of inertia when touch is released..
    * Note that this will delay callback's execution.
    */
  var scrollEndDragDebounceValue: js.UndefOr[scala.Double] = js.native
  /**
    * Used to define custom interpolations
    */
  var scrollInterpolator: js.UndefOr[
    js.Function2[
      /* index */ scala.Double, 
      /* carouselProps */ CarouselProps[_], 
      reactDashNativeDashSnapDashCarouselLib.Anon_InputRange
    ]
  ] = js.native
  /**
    * Whether to implement a shouldComponentUpdate strategy to minimize updates
    */
  var shouldOptimizeUpdates: js.UndefOr[scala.Boolean] = js.native
  /**
    * Used to define custom interpolations
    */
  var slideInterpolatedStyle: js.UndefOr[
    js.Function3[
      /* index */ scala.Double, 
      /* animatedValue */ reactDashNativeLib.reactDashNativeMod.AnimatedNs.AnimatedValue, 
      /* carouselProps */ CarouselProps[_], 
      reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
    ]
  ] = js.native
  /**
    * Optional style for each item's container (the one whose scale and opacity are animated)
    */
  var slideStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.native
  /**
    * Height in pixels of the carousel itself
    * Note: Required with vertical carousel
    */
  var sliderHeight: js.UndefOr[scala.Double] = js.native
  /**
    * Width in pixels of your slider
    * Note: Required with horizontal carousel
    */
  var sliderWidth: js.UndefOr[scala.Double] = js.native
  /**
    * Delta x when swiping to trigger the snap
    */
  var swipeThreshold: js.UndefOr[scala.Double] = js.native
  /**
    * Determines whether to use `ScrollView` instead of `FlatList`. May cause
    * rendering performance issues due to losing `FlatList`'s performance
    * optimizations
    */
  var useScrollView: js.UndefOr[scala.Boolean] = js.native
  /*
    * Layout slides vertically instead of horizontally
    */
  var vertical: js.UndefOr[scala.Boolean] = js.native
  /**
    * Function that takes an item from the `data` array and returns a React
    * Element. See `react-native`'s `FlatList`
    */
  def renderItem(item: reactDashNativeDashSnapDashCarouselLib.Anon_Index[T]): reactLib.reactMod.ReactNs.ReactNode = js.native
  def renderItem(item: reactDashNativeDashSnapDashCarouselLib.Anon_Index[T], parallaxProps: AdditionalParallaxProps): reactLib.reactMod.ReactNs.ReactNode = js.native
}

