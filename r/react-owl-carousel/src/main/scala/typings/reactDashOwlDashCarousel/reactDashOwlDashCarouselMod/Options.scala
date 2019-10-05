package typings.reactDashOwlDashCarousel.reactDashOwlDashCarouselMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Default: false
    * Listen to url hash changes. data-hash on items is required.
    */
  var URLhashListener: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    * Class for CSS3 animation in.
    */
  var animateIn: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Default: false
    * Class for CSS3 animation out.
    */
  var animateOut: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Default: owl-height
    * Auto height class.
    */
  var autoHeightClass: js.UndefOr[String] = js.undefined
  /**
    * Default: false
    * Set non grid content. Try using width style on divs.
    */
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    * Autoplay.
    */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    * Pause on mouse hover.
    */
  var autoplayHoverPause: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    * autoplay speed.
    */
  var autoplaySpeed: js.UndefOr[Double | Boolean] = js.undefined
  /**
    * Default: 5000
    * Autoplay interval timeout.
    */
  var autoplayTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Default: true
    * Enable callback events.
    */
  var callbacks: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    * Center item. Works well with even an odd number of items.
    */
  var center: js.UndefOr[Boolean] = js.undefined
  // OPTIONS
  /**
    * Default:
    * Adding a -striped className to OwlCarousel.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Default: owl-controls
    * Controls container class - wrapper for navs and dots.
    */
  var controlsClass: js.UndefOr[String] = js.undefined
  /**
    * Default: owl-dot
    * Dot Class.
    */
  var dotClass: js.UndefOr[String] = js.undefined
  /**
    * Default: false
    * Used by data-dot content.
    */
  var dotData: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: true
    * Show dots navigation.
    */
  var dots: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: owl-dots
    * Dots container class.
    */
  var dotsClass: js.UndefOr[String] = js.undefined
  /**
    * Default: false
    * Set your own container for nav.
    */
  var dotsContainer: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Default: false
    * Show dots each x item.
    */
  var dotsEach: js.UndefOr[Double | Boolean] = js.undefined
  /**
    * Default: Number/Boolean
    * Pagination speed.
    */
  var dotsSpeed: js.UndefOr[Double | Boolean] = js.undefined
  /**
    * Default: owl-drag
    * Class for mouse drag mode.
    */
  var dragClass: js.UndefOr[String] = js.undefined
  /**
    * Default: false
    * Drag end speed.
    */
  var dragEndSpeed: js.UndefOr[Double | Boolean] = js.undefined
  /**
    * Default: swing
    * Easing for CSS2 $.animate.
    */
  var fallbackEasing: js.UndefOr[String] = js.undefined
  /**
    * Default: Number
    * Speed Calculate. More info to come..
    */
  var fluidSpeed: js.UndefOr[Double | Boolean] = js.undefined
  /**
    * Default: false
    * Item pull to edge.
    */
  var freeDrag: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: owl-grab
    * Class during mouse drag.
    */
  var grabClass: js.UndefOr[String] = js.undefined
  /**
    * Default: false
    * Callback to retrieve basic information (current item/pages/widths).
    * Info function second parameter is Owl DOM object reference.
    */
  var info: js.UndefOr[HandlerCallback] = js.undefined
  /**
    * Default: div
    * DOM element type for owl-item.
    */
  var itemElement: js.UndefOr[String] = js.undefined
  /**
    * Default: 3
    * The number of items you want to see on the screen.
    */
  var items: js.UndefOr[Double] = js.undefined
  /**
    * Default: false
    * lazyContent was introduced during beta tests but i removed it from the final release due to bad implementation.
    * It is a nice options so i will work on it in the nearest feature.
    */
  var lazyContent: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    * Lazy load images. data-src and data-src-retina for highres.
    * Also load images into background inline style if element is not <img>.
    */
  var lazyLoad: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: owl-loaded
    * Class after load.
    */
  var loadedClass: js.UndefOr[String] = js.undefined
  /**
    * Default: owl-loading
    * Class during load.
    */
  var loadingClass: js.UndefOr[String] = js.undefined
  /**
    * Default: false
    * Infinity loop. Duplicate last and first items to get loop illusion.
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: 0
    * margin-right(px) on item.
    */
  var margin: js.UndefOr[Double] = js.undefined
  /**
    * Default: false
    * Merge items. Looking for data-merge='{number}' inside item.
    */
  var merge: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: true
    * Fit merged items if screen is smaller than items value.
    */
  var mergeFit: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: true
    * Mouse drag enabled.
    */
  var mouseDrag: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    * Show next/prev buttons.
    */
  var nav: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: [&#x27;owl-prev&#x27;,&#x27;owl-next&#x27;]
    * Navigation buttons classes.
    */
  var navClass: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Default: false
    * Set your own container for nav.
    */
  var navContainer: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Default: owl-nav
    * Navigation container class.
    */
  var navContainerClass: js.UndefOr[String] = js.undefined
  /**
    * Default: div
    * DOM element type for a single directional navigation link.
    */
  var navElement: js.UndefOr[String] = js.undefined
  /**
    * Default: false
    * Navigation speed.
    */
  var navSpeed: js.UndefOr[Double | Boolean] = js.undefined
  /**
    * Default: [&#x27;next&#x27;,&#x27;prev&#x27;]
    * HTML allowed.
    */
  var navText: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Default: false
    * Use it if owl items are deep nested inside some generated content. E.g 'youritem'. Dont use dot before class name.
    */
  var nestedItemSelector: js.UndefOr[String] = js.undefined
  /**
    * When a property is going to change its value.
    */
  var onChange: js.UndefOr[HandlerCallback] = js.undefined
  /**
    * When a property has changed its value.
    */
  var onChanged: js.UndefOr[HandlerCallback] = js.undefined
  /**
    * When the dragging of an item is started.
    */
  var onDrag: js.UndefOr[HandlerCallback] = js.undefined
  /**
    * When the dragging of an item has finished.
    */
  var onDragged: js.UndefOr[HandlerCallback] = js.undefined
  // EVENTS
  /**
    * When the plugin initializes.
    */
  var onInitialize: js.UndefOr[HandlerCallback] = js.undefined
  /**
    * When the plugin has initialized.
    */
  var onInitialized: js.UndefOr[HandlerCallback] = js.undefined
  /**
    * When lazy image loads.
    */
  var onLoadLazy: js.UndefOr[HandlerCallback] = js.undefined
  /**
    * When lazy image has loaded.
    */
  var onLoadedLazy: js.UndefOr[HandlerCallback] = js.undefined
  /**
    * When video has loaded.
    */
  var onPlayVideo: js.UndefOr[HandlerCallback] = js.undefined
  /**
    * When the internal state of the plugin needs update.
    */
  var onRefresh: js.UndefOr[HandlerCallback] = js.undefined
  /**
    * When the internal state of the plugin has updated.
    */
  var onRefreshed: js.UndefOr[HandlerCallback] = js.undefined
  /**
    * When the plugin gets resized.
    */
  var onResize: js.UndefOr[HandlerCallback] = js.undefined
  /**
    * When the plugin has resized.
    */
  var onResized: js.UndefOr[HandlerCallback] = js.undefined
  /**
    * When video has unloaded.
    */
  var onStopVideo: js.UndefOr[HandlerCallback] = js.undefined
  /**
    * When the translation of the stage starts.
    */
  var onTranslate: js.UndefOr[HandlerCallback] = js.undefined
  /**
    * When the translation of the stage has finished.
    */
  var onTranslated: js.UndefOr[HandlerCallback] = js.undefined
  /**
    * Default: true
    * Stage pull to edge.
    */
  var pullDrag: js.UndefOr[Boolean] = js.undefined
  // CLASSES
  /**
    * Default: owl-refresh
    * Class during refresh.
    */
  var refreshClass: js.UndefOr[String] = js.undefined
  /**
    * Default: empty object
    * Object containing responsive options. Can be set to false to remove responsive capabilities..
    */
  var responsive: js.UndefOr[StringDictionary[Options]] = js.undefined
  /**
    * Default: window
    * Set on any DOM element.
    * If you care about non responsive browser (like ie8) then use it on main wrapper. This will prevent from crazy resizing.
    */
  var responsiveBaseElement: js.UndefOr[Element] = js.undefined
  /**
    * Default: false
    * Optional helper class.
    * Add '<responsiveClass>-<breakpoint>' class to main element. Can be used to stylize content on given breakpoint.
    */
  var responsiveClass: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Default: 200
    * Responsive refresh rate.
    */
  var responsiveRefreshRate: js.UndefOr[Double] = js.undefined
  /**
    * Default: true
    * Go backwards when the boundary has reached.
    */
  var rewind: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: owl-rtl
    * Class for right to left mode.
    */
  var rtlClass: js.UndefOr[String] = js.undefined
  /**
    * Default: 1
    * Navigation slide by x. 'page' string can be set to slide by page.
    */
  var slideBy: js.UndefOr[Double | String] = js.undefined
  /**
    * Default: 250
    * Speed Calculate. More info to come..
    */
  var smartSpeed: js.UndefOr[Double | Boolean] = js.undefined
  /**
    * Default: owl-stage
    * Stage class.
    */
  var stageClass: js.UndefOr[String] = js.undefined
  /**
    * Default: div
    * DOM element type for owl-stage.
    */
  var stageElement: js.UndefOr[String] = js.undefined
  /**
    * Default: owl-stage-outer
    * Stage outer class.
    */
  var stageOuterClass: js.UndefOr[String] = js.undefined
  /**
    * Default: 0
    * Padding left and right on stage (can see neighbours).
    */
  var stagePadding: js.UndefOr[Double] = js.undefined
  /**
    * Default: 0
    * Start position or URL Hash string like '#id'.
    */
  var startPosition: js.UndefOr[Double | String] = js.undefined
  /**
    * Default: true
    * Touch drag enabled.
    */
  var touchDrag: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    * Enable fetching YouTube/Vimeo/Vzaar videos.
    */
  var video: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    * Set height for videos.
    */
  var videoHeight: js.UndefOr[Double | Boolean] = js.undefined
  /**
    * Default: false
    * Set width for videos.
    */
  var videoWidth: js.UndefOr[Double | Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    URLhashListener: js.UndefOr[Boolean] = js.undefined,
    animateIn: String | Boolean = null,
    animateOut: String | Boolean = null,
    autoHeightClass: String = null,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    autoplayHoverPause: js.UndefOr[Boolean] = js.undefined,
    autoplaySpeed: Double | Boolean = null,
    autoplayTimeout: Int | Double = null,
    callbacks: js.UndefOr[Boolean] = js.undefined,
    center: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    controlsClass: String = null,
    dotClass: String = null,
    dotData: js.UndefOr[Boolean] = js.undefined,
    dots: js.UndefOr[Boolean] = js.undefined,
    dotsClass: String = null,
    dotsContainer: String | Boolean = null,
    dotsEach: Double | Boolean = null,
    dotsSpeed: Double | Boolean = null,
    dragClass: String = null,
    dragEndSpeed: Double | Boolean = null,
    fallbackEasing: String = null,
    fluidSpeed: Double | Boolean = null,
    freeDrag: js.UndefOr[Boolean] = js.undefined,
    grabClass: String = null,
    info: /* repeated */ js.Any => Unit = null,
    itemElement: String = null,
    items: Int | Double = null,
    lazyContent: js.UndefOr[Boolean] = js.undefined,
    lazyLoad: js.UndefOr[Boolean] = js.undefined,
    loadedClass: String = null,
    loadingClass: String = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    margin: Int | Double = null,
    merge: js.UndefOr[Boolean] = js.undefined,
    mergeFit: js.UndefOr[Boolean] = js.undefined,
    mouseDrag: js.UndefOr[Boolean] = js.undefined,
    nav: js.UndefOr[Boolean] = js.undefined,
    navClass: js.Array[String] = null,
    navContainer: String | Boolean = null,
    navContainerClass: String = null,
    navElement: String = null,
    navSpeed: Double | Boolean = null,
    navText: js.Array[String] = null,
    nestedItemSelector: String = null,
    onChange: /* repeated */ js.Any => Unit = null,
    onChanged: /* repeated */ js.Any => Unit = null,
    onDrag: /* repeated */ js.Any => Unit = null,
    onDragged: /* repeated */ js.Any => Unit = null,
    onInitialize: /* repeated */ js.Any => Unit = null,
    onInitialized: /* repeated */ js.Any => Unit = null,
    onLoadLazy: /* repeated */ js.Any => Unit = null,
    onLoadedLazy: /* repeated */ js.Any => Unit = null,
    onPlayVideo: /* repeated */ js.Any => Unit = null,
    onRefresh: /* repeated */ js.Any => Unit = null,
    onRefreshed: /* repeated */ js.Any => Unit = null,
    onResize: /* repeated */ js.Any => Unit = null,
    onResized: /* repeated */ js.Any => Unit = null,
    onStopVideo: /* repeated */ js.Any => Unit = null,
    onTranslate: /* repeated */ js.Any => Unit = null,
    onTranslated: /* repeated */ js.Any => Unit = null,
    pullDrag: js.UndefOr[Boolean] = js.undefined,
    refreshClass: String = null,
    responsive: StringDictionary[Options] = null,
    responsiveBaseElement: Element = null,
    responsiveClass: String | Boolean = null,
    responsiveRefreshRate: Int | Double = null,
    rewind: js.UndefOr[Boolean] = js.undefined,
    rtlClass: String = null,
    slideBy: Double | String = null,
    smartSpeed: Double | Boolean = null,
    stageClass: String = null,
    stageElement: String = null,
    stageOuterClass: String = null,
    stagePadding: Int | Double = null,
    startPosition: Double | String = null,
    touchDrag: js.UndefOr[Boolean] = js.undefined,
    video: js.UndefOr[Boolean] = js.undefined,
    videoHeight: Double | Boolean = null,
    videoWidth: Double | Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(URLhashListener)) __obj.updateDynamic("URLhashListener")(URLhashListener)
    if (animateIn != null) __obj.updateDynamic("animateIn")(animateIn.asInstanceOf[js.Any])
    if (animateOut != null) __obj.updateDynamic("animateOut")(animateOut.asInstanceOf[js.Any])
    if (autoHeightClass != null) __obj.updateDynamic("autoHeightClass")(autoHeightClass)
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay)
    if (!js.isUndefined(autoplayHoverPause)) __obj.updateDynamic("autoplayHoverPause")(autoplayHoverPause)
    if (autoplaySpeed != null) __obj.updateDynamic("autoplaySpeed")(autoplaySpeed.asInstanceOf[js.Any])
    if (autoplayTimeout != null) __obj.updateDynamic("autoplayTimeout")(autoplayTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(callbacks)) __obj.updateDynamic("callbacks")(callbacks)
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (className != null) __obj.updateDynamic("className")(className)
    if (controlsClass != null) __obj.updateDynamic("controlsClass")(controlsClass)
    if (dotClass != null) __obj.updateDynamic("dotClass")(dotClass)
    if (!js.isUndefined(dotData)) __obj.updateDynamic("dotData")(dotData)
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots)
    if (dotsClass != null) __obj.updateDynamic("dotsClass")(dotsClass)
    if (dotsContainer != null) __obj.updateDynamic("dotsContainer")(dotsContainer.asInstanceOf[js.Any])
    if (dotsEach != null) __obj.updateDynamic("dotsEach")(dotsEach.asInstanceOf[js.Any])
    if (dotsSpeed != null) __obj.updateDynamic("dotsSpeed")(dotsSpeed.asInstanceOf[js.Any])
    if (dragClass != null) __obj.updateDynamic("dragClass")(dragClass)
    if (dragEndSpeed != null) __obj.updateDynamic("dragEndSpeed")(dragEndSpeed.asInstanceOf[js.Any])
    if (fallbackEasing != null) __obj.updateDynamic("fallbackEasing")(fallbackEasing)
    if (fluidSpeed != null) __obj.updateDynamic("fluidSpeed")(fluidSpeed.asInstanceOf[js.Any])
    if (!js.isUndefined(freeDrag)) __obj.updateDynamic("freeDrag")(freeDrag)
    if (grabClass != null) __obj.updateDynamic("grabClass")(grabClass)
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction1(info))
    if (itemElement != null) __obj.updateDynamic("itemElement")(itemElement)
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyContent)) __obj.updateDynamic("lazyContent")(lazyContent)
    if (!js.isUndefined(lazyLoad)) __obj.updateDynamic("lazyLoad")(lazyLoad)
    if (loadedClass != null) __obj.updateDynamic("loadedClass")(loadedClass)
    if (loadingClass != null) __obj.updateDynamic("loadingClass")(loadingClass)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(merge)) __obj.updateDynamic("merge")(merge)
    if (!js.isUndefined(mergeFit)) __obj.updateDynamic("mergeFit")(mergeFit)
    if (!js.isUndefined(mouseDrag)) __obj.updateDynamic("mouseDrag")(mouseDrag)
    if (!js.isUndefined(nav)) __obj.updateDynamic("nav")(nav)
    if (navClass != null) __obj.updateDynamic("navClass")(navClass)
    if (navContainer != null) __obj.updateDynamic("navContainer")(navContainer.asInstanceOf[js.Any])
    if (navContainerClass != null) __obj.updateDynamic("navContainerClass")(navContainerClass)
    if (navElement != null) __obj.updateDynamic("navElement")(navElement)
    if (navSpeed != null) __obj.updateDynamic("navSpeed")(navSpeed.asInstanceOf[js.Any])
    if (navText != null) __obj.updateDynamic("navText")(navText)
    if (nestedItemSelector != null) __obj.updateDynamic("nestedItemSelector")(nestedItemSelector)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChanged != null) __obj.updateDynamic("onChanged")(js.Any.fromFunction1(onChanged))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragged != null) __obj.updateDynamic("onDragged")(js.Any.fromFunction1(onDragged))
    if (onInitialize != null) __obj.updateDynamic("onInitialize")(js.Any.fromFunction1(onInitialize))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onLoadLazy != null) __obj.updateDynamic("onLoadLazy")(js.Any.fromFunction1(onLoadLazy))
    if (onLoadedLazy != null) __obj.updateDynamic("onLoadedLazy")(js.Any.fromFunction1(onLoadedLazy))
    if (onPlayVideo != null) __obj.updateDynamic("onPlayVideo")(js.Any.fromFunction1(onPlayVideo))
    if (onRefresh != null) __obj.updateDynamic("onRefresh")(js.Any.fromFunction1(onRefresh))
    if (onRefreshed != null) __obj.updateDynamic("onRefreshed")(js.Any.fromFunction1(onRefreshed))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (onResized != null) __obj.updateDynamic("onResized")(js.Any.fromFunction1(onResized))
    if (onStopVideo != null) __obj.updateDynamic("onStopVideo")(js.Any.fromFunction1(onStopVideo))
    if (onTranslate != null) __obj.updateDynamic("onTranslate")(js.Any.fromFunction1(onTranslate))
    if (onTranslated != null) __obj.updateDynamic("onTranslated")(js.Any.fromFunction1(onTranslated))
    if (!js.isUndefined(pullDrag)) __obj.updateDynamic("pullDrag")(pullDrag)
    if (refreshClass != null) __obj.updateDynamic("refreshClass")(refreshClass)
    if (responsive != null) __obj.updateDynamic("responsive")(responsive)
    if (responsiveBaseElement != null) __obj.updateDynamic("responsiveBaseElement")(responsiveBaseElement)
    if (responsiveClass != null) __obj.updateDynamic("responsiveClass")(responsiveClass.asInstanceOf[js.Any])
    if (responsiveRefreshRate != null) __obj.updateDynamic("responsiveRefreshRate")(responsiveRefreshRate.asInstanceOf[js.Any])
    if (!js.isUndefined(rewind)) __obj.updateDynamic("rewind")(rewind)
    if (rtlClass != null) __obj.updateDynamic("rtlClass")(rtlClass)
    if (slideBy != null) __obj.updateDynamic("slideBy")(slideBy.asInstanceOf[js.Any])
    if (smartSpeed != null) __obj.updateDynamic("smartSpeed")(smartSpeed.asInstanceOf[js.Any])
    if (stageClass != null) __obj.updateDynamic("stageClass")(stageClass)
    if (stageElement != null) __obj.updateDynamic("stageElement")(stageElement)
    if (stageOuterClass != null) __obj.updateDynamic("stageOuterClass")(stageOuterClass)
    if (stagePadding != null) __obj.updateDynamic("stagePadding")(stagePadding.asInstanceOf[js.Any])
    if (startPosition != null) __obj.updateDynamic("startPosition")(startPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(touchDrag)) __obj.updateDynamic("touchDrag")(touchDrag)
    if (!js.isUndefined(video)) __obj.updateDynamic("video")(video)
    if (videoHeight != null) __obj.updateDynamic("videoHeight")(videoHeight.asInstanceOf[js.Any])
    if (videoWidth != null) __obj.updateDynamic("videoWidth")(videoWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

