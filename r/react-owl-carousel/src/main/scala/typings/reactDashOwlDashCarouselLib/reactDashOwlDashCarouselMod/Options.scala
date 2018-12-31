package typings
package reactDashOwlDashCarouselLib.reactDashOwlDashCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Default: false
    * Listen to url hash changes. data-hash on items is required.
    */
  var URLhashListener: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: false
    * Class for CSS3 animation in.
    */
  var animateIn: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * Default: false
    * Class for CSS3 animation out.
    */
  var animateOut: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * Default: owl-height
    * Auto height class.
    */
  var autoHeightClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: false
    * Set non grid content. Try using width style on divs.
    */
  var autoWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: false
    * Autoplay.
    */
  var autoplay: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: false
    * Pause on mouse hover.
    */
  var autoplayHoverPause: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: false
    * autoplay speed.
    */
  var autoplaySpeed: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
    * Default: 5000
    * Autoplay interval timeout.
    */
  var autoplayTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default: true
    * Enable callback events.
    */
  var callbacks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: false
    * Center item. Works well with even an odd number of items.
    */
  var center: js.UndefOr[scala.Boolean] = js.undefined
  // OPTIONS
  /**
    * Default:
    * Adding a -striped className to OwlCarousel.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: owl-controls
    * Controls container class - wrapper for navs and dots.
    */
  var controlsClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: owl-dot
    * Dot Class.
    */
  var dotClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: false
    * Used by data-dot content.
    */
  var dotData: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: true
    * Show dots navigation.
    */
  var dots: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: owl-dots
    * Dots container class.
    */
  var dotsClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: false
    * Set your own container for nav.
    */
  var dotsContainer: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * Default: false
    * Show dots each x item.
    */
  var dotsEach: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
    * Default: Number/Boolean
    * Pagination speed.
    */
  var dotsSpeed: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
    * Default: owl-drag
    * Class for mouse drag mode.
    */
  var dragClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: false
    * Drag end speed.
    */
  var dragEndSpeed: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
    * Default: swing
    * Easing for CSS2 $.animate.
    */
  var fallbackEasing: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: Number
    * Speed Calculate. More info to come..
    */
  var fluidSpeed: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
    * Default: false
    * Item pull to edge.
    */
  var freeDrag: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: owl-grab
    * Class during mouse drag.
    */
  var grabClass: js.UndefOr[java.lang.String] = js.undefined
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
  var itemElement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: 3
    * The number of items you want to see on the screen.
    */
  var items: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default: false
    * lazyContent was introduced during beta tests but i removed it from the final release due to bad implementation.
    * It is a nice options so i will work on it in the nearest feature.
    */
  var lazyContent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: false
    * Lazy load images. data-src and data-src-retina for highres.
    * Also load images into background inline style if element is not <img>.
    */
  var lazyLoad: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: owl-loaded
    * Class after load.
    */
  var loadedClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: owl-loading
    * Class during load.
    */
  var loadingClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: false
    * Infinity loop. Duplicate last and first items to get loop illusion.
    */
  var loop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: 0
    * margin-right(px) on item.
    */
  var margin: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default: false
    * Merge items. Looking for data-merge='{number}' inside item.
    */
  var merge: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: true
    * Fit merged items if screen is smaller than items value.
    */
  var mergeFit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: true
    * Mouse drag enabled.
    */
  var mouseDrag: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: false
    * Show next/prev buttons.
    */
  var nav: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: [&#x27;owl-prev&#x27;,&#x27;owl-next&#x27;]
    * Navigation buttons classes.
    */
  var navClass: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Default: false
    * Set your own container for nav.
    */
  var navContainer: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * Default: owl-nav
    * Navigation container class.
    */
  var navContainerClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: div
    * DOM element type for a single directional navigation link.
    */
  var navElement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: false
    * Navigation speed.
    */
  var navSpeed: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
    * Default: [&#x27;next&#x27;,&#x27;prev&#x27;]
    * HTML allowed.
    */
  var navText: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Default: false
    * Use it if owl items are deep nested inside some generated content. E.g 'youritem'. Dont use dot before class name.
    */
  var nestedItemSelector: js.UndefOr[java.lang.String] = js.undefined
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
  var pullDrag: js.UndefOr[scala.Boolean] = js.undefined
  // CLASSES
  /**
    * Default: owl-refresh
    * Class during refresh.
    */
  var refreshClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: empty object
    * Object containing responsive options. Can be set to false to remove responsive capabilities..
    */
  var responsive: js.UndefOr[org.scalablytyped.runtime.StringDictionary[Options]] = js.undefined
  /**
    * Default: window
    * Set on any DOM element.
    * If you care about non responsive browser (like ie8) then use it on main wrapper. This will prevent from crazy resizing.
    */
  var responsiveBaseElement: js.UndefOr[reactLib.Element] = js.undefined
  /**
    * Default: false
    * Optional helper class.
    * Add '<responsiveClass>-<breakpoint>' class to main element. Can be used to stylize content on given breakpoint.
    */
  var responsiveClass: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * Default: 200
    * Responsive refresh rate.
    */
  var responsiveRefreshRate: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default: true
    * Go backwards when the boundary has reached.
    */
  var rewind: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: owl-rtl
    * Class for right to left mode.
    */
  var rtlClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: 1
    * Navigation slide by x. 'page' string can be set to slide by page.
    */
  var slideBy: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Default: 250
    * Speed Calculate. More info to come..
    */
  var smartSpeed: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
    * Default: owl-stage
    * Stage class.
    */
  var stageClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: div
    * DOM element type for owl-stage.
    */
  var stageElement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: owl-stage-outer
    * Stage outer class.
    */
  var stageOuterClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: 0
    * Padding left and right on stage (can see neighbours).
    */
  var stagePadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default: 0
    * Start position or URL Hash string like '#id'.
    */
  var startPosition: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Default: true
    * Touch drag enabled.
    */
  var touchDrag: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: false
    * Enable fetching YouTube/Vimeo/Vzaar videos.
    */
  var video: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: false
    * Set height for videos.
    */
  var videoHeight: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
    * Default: false
    * Set width for videos.
    */
  var videoWidth: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
}

