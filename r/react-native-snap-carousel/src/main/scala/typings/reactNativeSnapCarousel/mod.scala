package typings.reactNativeSnapCarousel

import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Props
import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.AnimatedValue
import typings.reactNative.mod.Animated.DecayAnimationConfig
import typings.reactNative.mod.Animated.SpringAnimationConfig
import typings.reactNative.mod.Animated.TimingAnimationConfig
import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.FlatListProps
import typings.reactNative.mod.ImageProps
import typings.reactNative.mod.ImageSourcePropType
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeScrollEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.ScrollViewProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeSnapCarousel.anon.Height
import typings.reactNativeSnapCarousel.anon.Index
import typings.reactNativeSnapCarousel.anon.InputRange
import typings.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.center
import typings.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.decay
import typings.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.end
import typings.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.spring
import typings.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.stack
import typings.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.start
import typings.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.timing
import typings.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.tinder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-snap-carousel", JSImport.Default)
  @js.native
  class default[T] () extends Carousel[T]
  
  @JSImport("react-native-snap-carousel", "Pagination")
  @js.native
  class Pagination protected ()
    extends Component[PaginationProperties, js.Object, js.Any] {
    def this(props: PaginationProperties) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PaginationProperties, context: js.Any) = this()
  }
  
  @JSImport("react-native-snap-carousel", "ParallaxImage")
  @js.native
  class ParallaxImage protected ()
    extends Component[ParallaxImageProperties, js.Object, js.Any] {
    def this(props: ParallaxImageProperties) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ParallaxImageProperties, context: js.Any) = this()
  }
  
  @JSImport("react-native-snap-carousel", "getInputRangeFromIndexes")
  @js.native
  def getInputRangeFromIndexes(range: js.Array[Double], index: Double, carouselProps: CarouselProps[_]): js.Array[Double] = js.native
  
  @js.native
  trait AdditionalParallaxProps extends StObject {
    
    var carouselRef: js.UndefOr[Component[FlatListProps[_], js.Object, _]] = js.native
    
    var itemHeight: js.UndefOr[Double] = js.native
    
    var itemWidth: js.UndefOr[Double] = js.native
    
    var scrollPosition: js.UndefOr[Value] = js.native
    
    var sliderHeight: js.UndefOr[Double] = js.native
    
    var sliderWidth: js.UndefOr[Double] = js.native
    
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object AdditionalParallaxProps {
    
    @scala.inline
    def apply(): AdditionalParallaxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalParallaxProps]
    }
    
    @scala.inline
    implicit class AdditionalParallaxPropsMutableBuilder[Self <: AdditionalParallaxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCarouselRef(value: Component[FlatListProps[_], js.Object, _]): Self = StObject.set(x, "carouselRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarouselRefUndefined: Self = StObject.set(x, "carouselRef", js.undefined)
      
      @scala.inline
      def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      @scala.inline
      def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      @scala.inline
      def setScrollPosition(value: Value): Self = StObject.set(x, "scrollPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollPositionUndefined: Self = StObject.set(x, "scrollPosition", js.undefined)
      
      @scala.inline
      def setSliderHeight(value: Double): Self = StObject.set(x, "sliderHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderHeightUndefined: Self = StObject.set(x, "sliderHeight", js.undefined)
      
      @scala.inline
      def setSliderWidth(value: Double): Self = StObject.set(x, "sliderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderWidthUndefined: Self = StObject.set(x, "sliderWidth", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  @js.native
  trait Carousel[T]
    extends Component[CarouselProperties[T], js.Object, js.Any] {
    
    /**
      * Current active item (int, starts at 0)
      */
    var currentIndex: Double = js.native
    
    /**
      * Underlying ScrollView's current content offset
      * (int, starts at 0 if activeSlideAlignment is set to start, negative value otherwise)
      */
    var currentScrollPosition: Double = js.native
    
    /**
      * Snap to an item manually
      */
    def snapToItem(index: Double): Unit = js.native
    def snapToItem(index: Double, animated: js.UndefOr[scala.Nothing], fireCallback: Boolean): Unit = js.native
    def snapToItem(index: Double, animated: Boolean): Unit = js.native
    def snapToItem(index: Double, animated: Boolean, fireCallback: Boolean): Unit = js.native
    
    /**
      * Snap to next item manually
      */
    def snapToNext(): Unit = js.native
    def snapToNext(animated: js.UndefOr[scala.Nothing], fireCallback: Boolean): Unit = js.native
    def snapToNext(animated: Boolean): Unit = js.native
    def snapToNext(animated: Boolean, fireCallback: Boolean): Unit = js.native
    
    /**
      * Snap to previous item manually
      */
    def snapToPrev(): Unit = js.native
    def snapToPrev(animated: js.UndefOr[scala.Nothing], fireCallback: Boolean): Unit = js.native
    def snapToPrev(animated: Boolean): Unit = js.native
    def snapToPrev(animated: Boolean, fireCallback: Boolean): Unit = js.native
    
    /**
      * Start the autoplay manually
      */
    def startAutoplay(): Unit = js.native
    def startAutoplay(instantly: Boolean): Unit = js.native
    
    /**
      * Stop the autoplay manually
      */
    def stopAutoplay(): Unit = js.native
    
    /**
      * Call this when needed to work around a random FlatList bug that keeps content hidden until the carousel is scrolled
      * (see #238). Note that the offset parameter is not required and will default to either 1 or -1 depending
      * on the current scroll position
      */
    def triggerRenderingHack(): Unit = js.native
    def triggerRenderingHack(offset: Double): Unit = js.native
  }
  
  type CarouselProperties[T] = ScrollViewProps with FlatListProps[T] with CarouselProps[T]
  
  @js.native
  trait CarouselProps[T] extends StObject {
    
    // Style and animation
    /**
      * Custom animation options.
      * Note that useNativeDriver will be enabled by default and that opacity's easing will always be kept linear.
      * Setting this prop to something other than null will trigger custom animations and will completely change
      * the way items are animated: rather than having their opacity and scale interpolated based the scroll value (default behavior),
      * they will now play the custom animation you provide as soon as they become active.
      * This means you cannot use props layout, scrollInterpolator or slideInterpolatedStyle in conjunction with activeAnimationOptions
      */
    var activeAnimationOptions: js.UndefOr[DecayAnimationConfig | TimingAnimationConfig | SpringAnimationConfig] = js.native
    
    /**
      * Custom animation type: either 'decay, 'spring' or 'timing'.
      * Note that it will only be applied to the scale animation since opacity's animation type will always be set
      * to timing (no one wants the opacity to 'bounce' around)
      */
    var activeAnimationType: js.UndefOr[decay | spring | timing] = js.native
    
    /**
      * Determine active slide's alignment relative to the carousel
      */
    var activeSlideAlignment: js.UndefOr[start | center | end] = js.native
    
    // Behavior
    /**
      * From slider's center, minimum slide distance to be scrolled before being set to active
      */
    var activeSlideOffset: js.UndefOr[Double] = js.native
    
    /**
      * Duration of time while component is hidden after mounting. NOTE: May cause rendering
      * issues on Android. Defaults to 0
      */
    var apparitionDelay: js.UndefOr[Double] = js.native
    
    // Autoplay
    /**
      * Trigger autoplay on mount
      */
    var autoplay: js.UndefOr[Boolean] = js.native
    
    /**
      * Delay before enabling autoplay on startup & after releasing the touch
      */
    var autoplayDelay: js.UndefOr[Double] = js.native
    
    /**
      * Delay in ms until navigating to the next item
      */
    var autoplayInterval: js.UndefOr[Double] = js.native
    
    /**
      * Defines a small margin for callbacks firing from scroll events.  Increase this value
      * if you experience missed callbacks. Defaults to 5
      */
    var callbackOffsetMargin: js.UndefOr[Double] = js.native
    
    /**
      * Optional styles for Scrollview's global wrapper
      */
    var containerCustomStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    /**
      * Optional styles for Scrollview's items container
      */
    var contentContainerCustomStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
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
    var enableMomentum: js.UndefOr[Boolean] = js.native
    
    /**
      * If enabled, releasing the touch will scroll to the center of the nearest/active item
      */
    var enableSnap: js.UndefOr[Boolean] = js.native
    
    /**
      * Index of the first item to display
      */
    var firstItem: js.UndefOr[Double] = js.native
    
    /**
      * Flag to indicate whether the carousel contains `<ParallaxImage />`. Parallax data
      * will not be passed to carousel items if this is false
      */
    var hasParallaxImages: js.UndefOr[Boolean] = js.native
    
    /**
      * Value of the opacity effect applied to inactive slides
      */
    var inactiveSlideOpacity: js.UndefOr[Double] = js.native
    
    /**
      * Value of the 'scale' transform applied to inactive slides
      */
    var inactiveSlideScale: js.UndefOr[Double] = js.native
    
    /**
      * Value of the 'translate' transform applied to inactive slides. Not recommended with
      * `customAnimationOptions`
      */
    var inactiveSlideShift: js.UndefOr[Double] = js.native
    
    /**
      * How many items should be rendered at the start?
      */
    var initialNumToRender: js.UndefOr[Double] = js.native
    
    /**
      * Width in pixels of your slides, must be the same for all of them
      * Note: Required with horizontal carousel
      */
    /**
      * Reverses the direction of scroll. Uses scale transforms of -1.
      */
    var inverted: js.UndefOr[Boolean] = js.native
    
    /**
      * Height in pixels of carousel's items, must be the same for all of them
      * Note: Required with vertical carousel
      */
    var itemHeight: js.UndefOr[Double] = js.native
    
    var itemWidth: js.UndefOr[Double] = js.native
    
    /**
      * Define the way items are rendered and animated.
      * Possible values are 'default', 'stack' and 'tinder'.
      * See this for more info and visual examples.
      * WARNING: setting this prop to either 'stack' or 'tinder' will activate useScrollView to prevent rendering bugs with FlatList.
      * Therefore, those layouts will probably not be suited if you have a large data set.
      */
    var layout: js.UndefOr[
        typings.reactNativeSnapCarousel.reactNativeSnapCarouselStrings.default | stack | tinder
      ] = js.native
    
    /**
      * Use to increase or decrease the default card offset in both 'stack' and 'tinder' layouts.
      */
    var layoutCardOffset: js.UndefOr[Double] = js.native
    
    /**
      * Changes default lock's timeout duration in ms.
      */
    var lockScrollTimeoutDuration: js.UndefOr[Double] = js.native
    
    /**
      * Prevent the user from interacting with the carousel while it is snapping. Ignored
      * if `enableMomentum` is `true`
      */
    var lockScrollWhileSnapping: js.UndefOr[Boolean] = js.native
    
    // Loop
    /**
      * Enable infinite loop mode. Does not work if `enableSnap` is `false`
      */
    var loop: js.UndefOr[Boolean] = js.native
    
    /**
      * Number of clones to render at the beginning and end of the list. Default
      * is 3
      */
    var loopClonesPerSide: js.UndefOr[Double] = js.native
    
    /**
      * Callback fired before navigating to an item
      */
    var onBeforeSnapToItem: js.UndefOr[js.Function1[/* slideIndex */ Double, Unit]] = js.native
    
    // Callbacks
    /**
      * Exposed View callback; invoked on mount and layout changes
      */
    var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.native
    
    /**
      * Exposed ScrollView callback; fired while scrolling
      */
    var onScroll: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[NativeScrollEvent], Unit]] = js.native
    
    /**
      * Callback fired when navigating to an item
      */
    var onSnapToItem: js.UndefOr[js.Function1[/* slideIndex */ Double, Unit]] = js.native
    
    /**
      * Function that takes an item from the `data` array and returns a React
      * Element. See `react-native`'s `FlatList`
      */
    def renderItem(item: Index[T]): ReactNode = js.native
    def renderItem(item: Index[T], parallaxProps: AdditionalParallaxProps): ReactNode = js.native
    
    /**
      * Allow scroll independently of user interaction on carousel. `false` as default.
      */
    var scrollEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * When momentum is disabled, this prop defines the timeframe during which multiple
      * callback calls should be "grouped" into a single one. This debounce also helps
      * smoothing the snap effect by providing a bit of inertia when touch is released..
      * Note that this will delay callback's execution.
      */
    var scrollEndDragDebounceValue: js.UndefOr[Double] = js.native
    
    /**
      * Used to define custom interpolations
      */
    var scrollInterpolator: js.UndefOr[
        js.Function2[/* index */ Double, /* carouselProps */ CarouselProps[_], InputRange]
      ] = js.native
    
    /**
      * Whether to implement a shouldComponentUpdate strategy to minimize updates
      */
    var shouldOptimizeUpdates: js.UndefOr[Boolean] = js.native
    
    /**
      * Used to define custom interpolations
      */
    var slideInterpolatedStyle: js.UndefOr[
        js.Function3[
          /* index */ Double, 
          /* animatedValue */ AnimatedValue, 
          /* carouselProps */ CarouselProps[_], 
          StyleProp[ViewStyle]
        ]
      ] = js.native
    
    /**
      * Optional style for each item's container (the one whose scale and opacity are animated)
      */
    var slideStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    /**
      * Height in pixels of the carousel itself
      * Note: Required with vertical carousel
      */
    var sliderHeight: js.UndefOr[Double] = js.native
    
    /**
      * Width in pixels of your slider
      * Note: Required with horizontal carousel
      */
    var sliderWidth: js.UndefOr[Double] = js.native
    
    /**
      * Delta x when swiping to trigger the snap
      */
    var swipeThreshold: js.UndefOr[Double] = js.native
    
    /**
      * Determines whether to use `ScrollView` instead of `FlatList`. May cause
      * rendering performance issues due to losing `FlatList`'s performance
      * optimizations
      */
    var useScrollView: js.UndefOr[Boolean] = js.native
    
    /*
      * Layout slides vertically instead of horizontally
      */
    var vertical: js.UndefOr[Boolean] = js.native
  }
  
  type PaginationProperties = PaginationProps with Props[PaginationStatic]
  
  @js.native
  trait PaginationProps extends StObject {
    
    /**
      * Currently focused dot
      */
    var activeDotIndex: Double = js.native
    
    /**
      * Opacity of the dot when tapped. The prop has no effect if tappableDots hasn't been set to true
      */
    var activeOpacity: js.UndefOr[Double] = js.native
    
    /**
      * Length of dot animation (milliseconds)
      */
    var animatedDuration: js.UndefOr[Double] = js.native
    
    /**
      * Controls "bounciness"/overshoot on dot animation
      */
    var animatedFriction: js.UndefOr[Double] = js.native
    
    /**
      * Controls speed dot animation
      */
    var animatedTension: js.UndefOr[Double] = js.native
    
    /**
      * Reference to the Carousel component to which pagination is linked.
      * Needed only when setting tappableDots to true
      */
    var carouselRef: js.UndefOr[Component[FlatListProps[_], js.Object, _]] = js.native
    
    /**
      * Style for dots' container that will be merged with the default one
      */
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    /**
      * Delay in ms, from the start of the touch, before onPressIn is called on dot
      */
    var delayPressInDot: js.UndefOr[Double] = js.native
    
    /**
      * Background color of the active dot.
      * Use this if you want to animate the change between active and inactive colors,
      * and always in conjunction with inactiveDotColor
      */
    var dotColor: js.UndefOr[String] = js.native
    
    /**
      * Style of each dot's container.
      * Use this if you need to specify styles that wouldn't have any effect when defined with dotStyle (such as flex)
      */
    var dotContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    /**
      * Optional custom active dot element that will replace the default one.
      * The element will receive a prop active set to true as well as a prop index
      */
    var dotElement: js.UndefOr[ReactNode] = js.native
    
    /**
      * Dots' style that will be merged with the default one
      */
    var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    /**
      * Number of dots to display
      */
    var dotsLength: Double = js.native
    
    /**
      * Background color of the inactive dots.
      * Use this if you want to animate the change between active and inactive colors, and always in conjunction with dotColor
      */
    var inactiveDotColor: js.UndefOr[String] = js.native
    
    /**
      * Optional custom inactive dot element that will replace the default one.
      * The element will receive a prop active set to false as well as a prop index
      */
    var inactiveDotElement: js.UndefOr[ReactNode] = js.native
    
    /**
      * Value of the opacity effect applied to inactive dots
      */
    var inactiveDotOpacity: js.UndefOr[Double] = js.native
    
    /**
      * Value of the 'scale' transform applied to inactive dots
      */
    var inactiveDotScale: js.UndefOr[Double] = js.native
    
    /**
      * Dots' style that will be applied to inactive elements
      */
    var inactiveDotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    /**
      * Function that gives you complete control over pagination's rendering.
      * It will receive three parameters : (activeIndex, total, context).
      * This can be especially useful in order to replace dots with numbers
      */
    var renderDots: js.UndefOr[
        js.Function3[/* activeIndex */ Double, /* total */ Double, /* context */ js.Any, ReactNode]
      ] = js.native
    
    /**
      * Make default dots tappable, e.g. your carousel will slide to the corresponding item.
      * Note that carouselRef must be specified for this to work
      */
    var tappableDots: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to layout dots vertically or horizontally
      */
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object PaginationProps {
    
    @scala.inline
    def apply(activeDotIndex: Double, dotsLength: Double): PaginationProps = {
      val __obj = js.Dynamic.literal(activeDotIndex = activeDotIndex.asInstanceOf[js.Any], dotsLength = dotsLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationProps]
    }
    
    @scala.inline
    implicit class PaginationPropsMutableBuilder[Self <: PaginationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveDotIndex(value: Double): Self = StObject.set(x, "activeDotIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
      
      @scala.inline
      def setAnimatedDuration(value: Double): Self = StObject.set(x, "animatedDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedDurationUndefined: Self = StObject.set(x, "animatedDuration", js.undefined)
      
      @scala.inline
      def setAnimatedFriction(value: Double): Self = StObject.set(x, "animatedFriction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedFrictionUndefined: Self = StObject.set(x, "animatedFriction", js.undefined)
      
      @scala.inline
      def setAnimatedTension(value: Double): Self = StObject.set(x, "animatedTension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedTensionUndefined: Self = StObject.set(x, "animatedTension", js.undefined)
      
      @scala.inline
      def setCarouselRef(value: Component[FlatListProps[_], js.Object, _]): Self = StObject.set(x, "carouselRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarouselRefUndefined: Self = StObject.set(x, "carouselRef", js.undefined)
      
      @scala.inline
      def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setDelayPressInDot(value: Double): Self = StObject.set(x, "delayPressInDot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayPressInDotUndefined: Self = StObject.set(x, "delayPressInDot", js.undefined)
      
      @scala.inline
      def setDotColor(value: String): Self = StObject.set(x, "dotColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotColorUndefined: Self = StObject.set(x, "dotColor", js.undefined)
      
      @scala.inline
      def setDotContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotContainerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotContainerStyleNull: Self = StObject.set(x, "dotContainerStyle", null)
      
      @scala.inline
      def setDotContainerStyleUndefined: Self = StObject.set(x, "dotContainerStyle", js.undefined)
      
      @scala.inline
      def setDotElement(value: ReactNode): Self = StObject.set(x, "dotElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotElementUndefined: Self = StObject.set(x, "dotElement", js.undefined)
      
      @scala.inline
      def setDotStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotStyleNull: Self = StObject.set(x, "dotStyle", null)
      
      @scala.inline
      def setDotStyleUndefined: Self = StObject.set(x, "dotStyle", js.undefined)
      
      @scala.inline
      def setDotsLength(value: Double): Self = StObject.set(x, "dotsLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInactiveDotColor(value: String): Self = StObject.set(x, "inactiveDotColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInactiveDotColorUndefined: Self = StObject.set(x, "inactiveDotColor", js.undefined)
      
      @scala.inline
      def setInactiveDotElement(value: ReactNode): Self = StObject.set(x, "inactiveDotElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInactiveDotElementUndefined: Self = StObject.set(x, "inactiveDotElement", js.undefined)
      
      @scala.inline
      def setInactiveDotOpacity(value: Double): Self = StObject.set(x, "inactiveDotOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInactiveDotOpacityUndefined: Self = StObject.set(x, "inactiveDotOpacity", js.undefined)
      
      @scala.inline
      def setInactiveDotScale(value: Double): Self = StObject.set(x, "inactiveDotScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInactiveDotScaleUndefined: Self = StObject.set(x, "inactiveDotScale", js.undefined)
      
      @scala.inline
      def setInactiveDotStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "inactiveDotStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInactiveDotStyleNull: Self = StObject.set(x, "inactiveDotStyle", null)
      
      @scala.inline
      def setInactiveDotStyleUndefined: Self = StObject.set(x, "inactiveDotStyle", js.undefined)
      
      @scala.inline
      def setRenderDots(value: (/* activeIndex */ Double, /* total */ Double, /* context */ js.Any) => ReactNode): Self = StObject.set(x, "renderDots", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderDotsUndefined: Self = StObject.set(x, "renderDots", js.undefined)
      
      @scala.inline
      def setTappableDots(value: Boolean): Self = StObject.set(x, "tappableDots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTappableDotsUndefined: Self = StObject.set(x, "tappableDots", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  type PaginationStatic = ComponentClass[PaginationProps, ComponentState]
  
  type ParallaxImageProperties = ParallaxImageProps with Props[ParallaxImageStatic]
  
  @js.native
  trait ParallaxImageProps
    extends ImageProps
       with AdditionalParallaxProps {
    
    /**
      * Optional style for image's container
      */
    var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    /**
      * On screen dimensions of the image
      */
    var dimensions: js.UndefOr[Height] = js.native
    
    /**
      * Speed of parallax effect. A higher value appears more 'zoomed in'
      */
    var parallaxFactor: js.UndefOr[Double] = js.native
    
    /**
      * Whether to display a loading spinner
      */
    var showSpinner: js.UndefOr[Boolean] = js.native
    
    /**
      * Color of the loading spinner if displayed
      */
    var spinnerColor: js.UndefOr[String] = js.native
  }
  object ParallaxImageProps {
    
    @scala.inline
    def apply(source: ImageSourcePropType): ParallaxImageProps = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParallaxImageProps]
    }
    
    @scala.inline
    implicit class ParallaxImagePropsMutableBuilder[Self <: ParallaxImageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
      
      @scala.inline
      def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      @scala.inline
      def setDimensions(value: Height): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      @scala.inline
      def setParallaxFactor(value: Double): Self = StObject.set(x, "parallaxFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParallaxFactorUndefined: Self = StObject.set(x, "parallaxFactor", js.undefined)
      
      @scala.inline
      def setShowSpinner(value: Boolean): Self = StObject.set(x, "showSpinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSpinnerUndefined: Self = StObject.set(x, "showSpinner", js.undefined)
      
      @scala.inline
      def setSpinnerColor(value: String): Self = StObject.set(x, "spinnerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinnerColorUndefined: Self = StObject.set(x, "spinnerColor", js.undefined)
    }
  }
  
  type ParallaxImageStatic = ComponentClass[ParallaxImageProps, ComponentState]
}
