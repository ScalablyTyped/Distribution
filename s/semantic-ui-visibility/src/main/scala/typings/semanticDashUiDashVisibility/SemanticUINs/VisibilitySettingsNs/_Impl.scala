package typings.semanticDashUiDashVisibility.SemanticUINs.VisibilitySettingsNs

import typings.semanticDashUiDashVisibility.JQuery
import typings.semanticDashUiDashVisibility.SemanticUINs.VisibilityNs.ClassNameSettings
import typings.semanticDashUiDashVisibility.SemanticUINs.VisibilityNs.ElementCalculations
import typings.semanticDashUiDashVisibility.SemanticUINs.VisibilityNs.ErrorSettings
import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityNumbers.`false`
import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.fixed
import typings.semanticDashUiDashVisibility.semanticDashUiDashVisibilityStrings.image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * Whether visibility conditions should be checked on calls to refresh.
    * These calls can be triggered from either resize, load or manually calling $('.foo').visibility('refresh')
    *
    * @default true
    */
  var checkOnRefresh: Boolean
  // endregion
  // region DOM Settings
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings
  /**
    * The scroll context visibility should use.
    *
    * @default 'window'
    */
  var context: String | JQuery
  /**
    * When set to true a callback will occur anytime an element passes a condition not just immediately after the threshold is met.
    *
    * @default false
    */
  var continuous: Boolean
  /**
    * Debug output to console
    */
  var debug: Boolean
  /**
    * When using type: image allows you to specify transition duration
    *
    * @default 1000
    */
  var duration: Double
  // endregion
  // region Debug Settings
  var error: ErrorSettings
  /**
    * Whether element calculations should include its margin
    *
    * @default false
    */
  var includeMargin: Boolean
  /**
    * Whether visibility conditions should be checked immediately on init
    *
    * @default true
    */
  var initialCheck: Boolean
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
    * Whether to automatically refresh content when changes are made to the element's DOM subtree
    *
    * @default true
    */
  var observeChanges: Boolean
  /**
    * Value that context scrollTop should be adjusted in pixels. Useful for making content appear below content fixed to the page.
    *
    * @default 0
    */
  var offset: Double
  // region Functionality
  /**
    * When set to false a callback will occur each time an element passes the threshold for a condition.
    *
    * @default true
    */
  var once: Boolean
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean
  /**
    * Whether visibility conditions should be checked on window load. This ensures that after images load content positions will be updated correctly.
    *
    * @default true
    */
  var refreshOnLoad: Boolean
  /**
    * Whether visibility conditions should be checked on window resize. Useful when content resizes causes continuous changes in position
    *
    * @default true
    */
  var refreshOnResize: Boolean
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean
  /**
    * When set to an integer, scroll position will be debounced using this ms value. false will debounce with requestAnimationFrame.
    *
    * @default false
    */
  var throttle: `false` | Double
  /**
    * When using type: image allows you to specify transition when showing a loaded image
    *
    * @default false
    */
  var transition: `false` | String
  /**
    * Set to image to load images when on screen. Set to fixed to add class name fixed when passed.
    *
    * @default false
    */
  var `type`: `false` | image | fixed
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean
  /**
    * Specify a z-index when using type: 'fixed'.
    *
    * @default 1
    * @since 2.2
    */
  var zIndex: Double
  /**
    * Occurs after all img initialized at the same time have loaded.
    *
    * @since 2.2
    */
  def onAllLoaded(`this`: JQuery): Unit
  /**
    * Element's bottom edge has passed top of screen
    */
  def onBottomPassed(`this`: JQuery): Unit
  /**
    * Element's bottom edge has not passed top of screen
    */
  def onBottomPassedReverse(`this`: JQuery): Unit
  /**
    * Element's bottom edge has passed bottom of screen
    */
  def onBottomVisible(`this`: JQuery): Unit
  /**
    * Element's bottom edge has not passed bottom of screen
    */
  def onBottomVisibleReverse(`this`: JQuery): Unit
  // endregion
  // region Fixed Callbacks
  /**
    * Occurs after element has been assigned position fixed
    *
    * @since 2.2
    */
  def onFixed(`this`: JQuery): Unit
  // endregion
  // region Image Callbacks
  /**
    * Occurs after an image has completed loading
    *
    * @since 2.2
    */
  def onLoad(`this`: JQuery): Unit
  def onOffScreen(`this`: JQuery): Unit
  def onOnScreen(`this`: JQuery): Unit
  /**
    * Any part of an element is visible on screen
    */
  def onPassing(`this`: JQuery): Unit
  /**
    * Element's top has not passed top of screen but bottom has
    */
  def onPassingReverse(`this`: JQuery): Unit
  /**
    * Occurs whenever element's visibility is refreshed
    */
  def onRefresh(`this`: JQuery): Unit
  /**
    * Element's top edge has passed top of the screen
    */
  def onTopPassed(`this`: JQuery): Unit
  /**
    * Element's top edge has not passed top of the screen
    */
  def onTopPassedReverse(`this`: JQuery): Unit
  // endregion
  // region Visibility Callbacks
  /**
    * Element's top edge has passed bottom of screen
    */
  def onTopVisible(`this`: JQuery): Unit
  /**
    * Element's top edge has not passed bottom of screen
    */
  def onTopVisibleReverse(`this`: JQuery): Unit
  /**
    * Occurs after element has been removed from fixed position
    *
    * @since 2.2
    */
  def onUnfixed(`this`: JQuery): Unit
  // endregion
  // region Utility Callbacks
  /**
    * Occurs each time an elements calculations are updated
    */
  def onUpdate(`this`: JQuery, calculations: ElementCalculations): Unit
}

object _Impl {
  @scala.inline
  def apply(
    checkOnRefresh: Boolean,
    className: ClassNameSettings,
    context: String | JQuery,
    continuous: Boolean,
    debug: Boolean,
    duration: Double,
    error: ErrorSettings,
    includeMargin: Boolean,
    initialCheck: Boolean,
    name: String,
    namespace: String,
    observeChanges: Boolean,
    offset: Double,
    onAllLoaded: JQuery => Unit,
    onBottomPassed: JQuery => Unit,
    onBottomPassedReverse: JQuery => Unit,
    onBottomVisible: JQuery => Unit,
    onBottomVisibleReverse: JQuery => Unit,
    onFixed: JQuery => Unit,
    onLoad: JQuery => Unit,
    onOffScreen: JQuery => Unit,
    onOnScreen: JQuery => Unit,
    onPassing: JQuery => Unit,
    onPassingReverse: JQuery => Unit,
    onRefresh: JQuery => Unit,
    onTopPassed: JQuery => Unit,
    onTopPassedReverse: JQuery => Unit,
    onTopVisible: JQuery => Unit,
    onTopVisibleReverse: JQuery => Unit,
    onUnfixed: JQuery => Unit,
    onUpdate: (JQuery, ElementCalculations) => Unit,
    once: Boolean,
    performance: Boolean,
    refreshOnLoad: Boolean,
    refreshOnResize: Boolean,
    silent: Boolean,
    throttle: `false` | Double,
    transition: `false` | String,
    `type`: `false` | image | fixed,
    verbose: Boolean,
    zIndex: Double
  ): _Impl = {
    val __obj = js.Dynamic.literal(checkOnRefresh = checkOnRefresh, className = className, context = context.asInstanceOf[js.Any], continuous = continuous, debug = debug, duration = duration, error = error, includeMargin = includeMargin, initialCheck = initialCheck, name = name, namespace = namespace, observeChanges = observeChanges, offset = offset, onAllLoaded = js.Any.fromFunction1(onAllLoaded), onBottomPassed = js.Any.fromFunction1(onBottomPassed), onBottomPassedReverse = js.Any.fromFunction1(onBottomPassedReverse), onBottomVisible = js.Any.fromFunction1(onBottomVisible), onBottomVisibleReverse = js.Any.fromFunction1(onBottomVisibleReverse), onFixed = js.Any.fromFunction1(onFixed), onLoad = js.Any.fromFunction1(onLoad), onOffScreen = js.Any.fromFunction1(onOffScreen), onOnScreen = js.Any.fromFunction1(onOnScreen), onPassing = js.Any.fromFunction1(onPassing), onPassingReverse = js.Any.fromFunction1(onPassingReverse), onRefresh = js.Any.fromFunction1(onRefresh), onTopPassed = js.Any.fromFunction1(onTopPassed), onTopPassedReverse = js.Any.fromFunction1(onTopPassedReverse), onTopVisible = js.Any.fromFunction1(onTopVisible), onTopVisibleReverse = js.Any.fromFunction1(onTopVisibleReverse), onUnfixed = js.Any.fromFunction1(onUnfixed), onUpdate = js.Any.fromFunction2(onUpdate), once = once, performance = performance, refreshOnLoad = refreshOnLoad, refreshOnResize = refreshOnResize, silent = silent, throttle = throttle.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], verbose = verbose, zIndex = zIndex)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Impl]
  }
}

