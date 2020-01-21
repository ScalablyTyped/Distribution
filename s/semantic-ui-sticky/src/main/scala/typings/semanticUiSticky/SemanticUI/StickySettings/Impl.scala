package typings.semanticUiSticky.SemanticUI.StickySettings

import typings.semanticUiSticky.JQuery
import typings.semanticUiSticky.SemanticUI.Sticky.ClassNameSettings
import typings.semanticUiSticky.SemanticUI.Sticky.ErrorSettings
import typings.semanticUiSticky.semanticUiStickyBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  /**
    * Offset in pixels from the bottom of the screen when fixing element to viewport
    *
    * @default 0
    */
  var bottomOffset: Double
  // endregion
  // region DOM Settings
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings
  /**
    * Context which sticky element should stick to
    *
    * @default false
    */
  var context: `false` | String | JQuery
  /**
    * Debug output to console
    */
  var debug: Boolean
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  /**
    * Sticky container height will only be set if the difference between heights of container and context is larger than this jitter value.
    *
    * @default 5
    */
  var jitter: Double
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String
  /**
    * Whether any change in context DOM should automatically refresh cached sticky positions
    *
    * @default false
    */
  var observeChanges: Boolean
  /**
    * Offset in pixels from the top of the screen when fixing element to viewport
    *
    * @default 0
    */
  var offset: Double
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  // region Sticky Settings
  /**
    * Whether element should be "pushed" by the viewport, attaching to the bottom of the screen when scrolling up
    *
    * @default false
    */
  var pushing: Boolean
  /**
    * Context which sticky should attach onscroll events.
    *
    * @default 'window'
    */
  var scrollContext: String | JQuery
  /**
    * Sets size of fixed content to match its width before fixing to screen dynamically.
    * This is used because fixed may display block or 100% width content differently than it appears before sticking.
    *
    * @default true
    * @since 2.2.11
    */
  var setSize: Boolean
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  /**
    * Callback when element is bound to bottom of parent container
    */
  def onBottom(): Unit
  // endregion
  // region Callbacks
  /**
    * Callback when element is repositioned from layout change
    */
  def onReposition(): Unit
  /**
    * Callback when requestAnimationFrame fires from scroll handler.
    */
  def onScroll(): Unit
  /**
    * Callback when element is fixed to page
    */
  def onStick(): Unit
  /**
    * Callback when element is bound to top of parent container
    */
  def onTop(): Unit
  /**
    * Callback when element is unfixed from page
    */
  def onUnstick(): Unit
}

object Impl {
  @scala.inline
  def apply(
    bottomOffset: Double,
    className: ClassNameSettings,
    context: `false` | String | JQuery,
    debug: Boolean,
    error: ErrorSettings,
    jitter: Double,
    name: String,
    namespace: String,
    observeChanges: Boolean,
    offset: Double,
    onBottom: () => Unit,
    onReposition: () => Unit,
    onScroll: () => Unit,
    onStick: () => Unit,
    onTop: () => Unit,
    onUnstick: () => Unit,
    performance: Boolean,
    pushing: Boolean,
    scrollContext: String | JQuery,
    setSize: Boolean,
    silent: Boolean,
    verbose: Boolean
  ): Impl = {
    val __obj = js.Dynamic.literal(bottomOffset = bottomOffset.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], jitter = jitter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onBottom = js.Any.fromFunction0(onBottom), onReposition = js.Any.fromFunction0(onReposition), onScroll = js.Any.fromFunction0(onScroll), onStick = js.Any.fromFunction0(onStick), onTop = js.Any.fromFunction0(onTop), onUnstick = js.Any.fromFunction0(onUnstick), performance = performance.asInstanceOf[js.Any], pushing = pushing.asInstanceOf[js.Any], scrollContext = scrollContext.asInstanceOf[js.Any], setSize = setSize.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

