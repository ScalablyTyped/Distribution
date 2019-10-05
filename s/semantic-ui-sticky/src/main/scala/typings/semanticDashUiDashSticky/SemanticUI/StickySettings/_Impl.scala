package typings.semanticDashUiDashSticky.SemanticUI.StickySettings

import typings.semanticDashUiDashSticky.JQuery
import typings.semanticDashUiDashSticky.SemanticUI.Sticky.ClassNameSettings
import typings.semanticDashUiDashSticky.SemanticUI.Sticky.ErrorSettings
import typings.semanticDashUiDashSticky.semanticDashUiDashStickyNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
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
  def onBottom(`this`: JQuery): Unit
  // endregion
  // region Callbacks
  /**
    * Callback when element is repositioned from layout change
    */
  def onReposition(`this`: JQuery): Unit
  /**
    * Callback when requestAnimationFrame fires from scroll handler.
    */
  def onScroll(`this`: JQuery): Unit
  /**
    * Callback when element is fixed to page
    */
  def onStick(`this`: JQuery): Unit
  /**
    * Callback when element is bound to top of parent container
    */
  def onTop(`this`: JQuery): Unit
  /**
    * Callback when element is unfixed from page
    */
  def onUnstick(`this`: JQuery): Unit
}

object _Impl {
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
    onBottom: JQuery => Unit,
    onReposition: JQuery => Unit,
    onScroll: JQuery => Unit,
    onStick: JQuery => Unit,
    onTop: JQuery => Unit,
    onUnstick: JQuery => Unit,
    performance: Boolean,
    pushing: Boolean,
    scrollContext: String | JQuery,
    setSize: Boolean,
    silent: Boolean,
    verbose: Boolean
  ): _Impl = {
    val __obj = js.Dynamic.literal(bottomOffset = bottomOffset, className = className, context = context.asInstanceOf[js.Any], debug = debug, error = error, jitter = jitter, name = name, namespace = namespace, observeChanges = observeChanges, offset = offset, onBottom = js.Any.fromFunction1(onBottom), onReposition = js.Any.fromFunction1(onReposition), onScroll = js.Any.fromFunction1(onScroll), onStick = js.Any.fromFunction1(onStick), onTop = js.Any.fromFunction1(onTop), onUnstick = js.Any.fromFunction1(onUnstick), performance = performance, pushing = pushing, scrollContext = scrollContext.asInstanceOf[js.Any], setSize = setSize, silent = silent, verbose = verbose)
  
    __obj.asInstanceOf[_Impl]
  }
}

