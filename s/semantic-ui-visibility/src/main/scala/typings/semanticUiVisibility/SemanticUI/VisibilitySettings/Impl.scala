package typings.semanticUiVisibility.SemanticUI.VisibilitySettings

import typings.semanticUiVisibility.JQuery
import typings.semanticUiVisibility.SemanticUI.Visibility.ClassNameSettings
import typings.semanticUiVisibility.SemanticUI.Visibility.ElementCalculations
import typings.semanticUiVisibility.SemanticUI.Visibility.ErrorSettings
import typings.semanticUiVisibility.semanticUiVisibilityBooleans.`false`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.fixed
import typings.semanticUiVisibility.semanticUiVisibilityStrings.image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
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
  def onAllLoaded(): Unit
  /**
    * Element's bottom edge has passed top of screen
    */
  def onBottomPassed(): Unit
  /**
    * Element's bottom edge has not passed top of screen
    */
  def onBottomPassedReverse(): Unit
  /**
    * Element's bottom edge has passed bottom of screen
    */
  def onBottomVisible(): Unit
  /**
    * Element's bottom edge has not passed bottom of screen
    */
  def onBottomVisibleReverse(): Unit
  // endregion
  // region Fixed Callbacks
  /**
    * Occurs after element has been assigned position fixed
    *
    * @since 2.2
    */
  def onFixed(): Unit
  // endregion
  // region Image Callbacks
  /**
    * Occurs after an image has completed loading
    *
    * @since 2.2
    */
  def onLoad(): Unit
  def onOffScreen(): Unit
  def onOnScreen(): Unit
  /**
    * Any part of an element is visible on screen
    */
  def onPassing(): Unit
  /**
    * Element's top has not passed top of screen but bottom has
    */
  def onPassingReverse(): Unit
  /**
    * Occurs whenever element's visibility is refreshed
    */
  def onRefresh(): Unit
  /**
    * Element's top edge has passed top of the screen
    */
  def onTopPassed(): Unit
  /**
    * Element's top edge has not passed top of the screen
    */
  def onTopPassedReverse(): Unit
  // endregion
  // region Visibility Callbacks
  /**
    * Element's top edge has passed bottom of screen
    */
  def onTopVisible(): Unit
  /**
    * Element's top edge has not passed bottom of screen
    */
  def onTopVisibleReverse(): Unit
  /**
    * Occurs after element has been removed from fixed position
    *
    * @since 2.2
    */
  def onUnfixed(): Unit
  // endregion
  // region Utility Callbacks
  /**
    * Occurs each time an elements calculations are updated
    */
  def onUpdate(calculations: ElementCalculations): Unit
}

object Impl {
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
    onAllLoaded: () => Unit,
    onBottomPassed: () => Unit,
    onBottomPassedReverse: () => Unit,
    onBottomVisible: () => Unit,
    onBottomVisibleReverse: () => Unit,
    onFixed: () => Unit,
    onLoad: () => Unit,
    onOffScreen: () => Unit,
    onOnScreen: () => Unit,
    onPassing: () => Unit,
    onPassingReverse: () => Unit,
    onRefresh: () => Unit,
    onTopPassed: () => Unit,
    onTopPassedReverse: () => Unit,
    onTopVisible: () => Unit,
    onTopVisibleReverse: () => Unit,
    onUnfixed: () => Unit,
    onUpdate: ElementCalculations => Unit,
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
  ): Impl = {
    val __obj = js.Dynamic.literal(checkOnRefresh = checkOnRefresh.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], continuous = continuous.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], includeMargin = includeMargin.asInstanceOf[js.Any], initialCheck = initialCheck.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onAllLoaded = js.Any.fromFunction0(onAllLoaded), onBottomPassed = js.Any.fromFunction0(onBottomPassed), onBottomPassedReverse = js.Any.fromFunction0(onBottomPassedReverse), onBottomVisible = js.Any.fromFunction0(onBottomVisible), onBottomVisibleReverse = js.Any.fromFunction0(onBottomVisibleReverse), onFixed = js.Any.fromFunction0(onFixed), onLoad = js.Any.fromFunction0(onLoad), onOffScreen = js.Any.fromFunction0(onOffScreen), onOnScreen = js.Any.fromFunction0(onOnScreen), onPassing = js.Any.fromFunction0(onPassing), onPassingReverse = js.Any.fromFunction0(onPassingReverse), onRefresh = js.Any.fromFunction0(onRefresh), onTopPassed = js.Any.fromFunction0(onTopPassed), onTopPassedReverse = js.Any.fromFunction0(onTopPassedReverse), onTopVisible = js.Any.fromFunction0(onTopVisible), onTopVisibleReverse = js.Any.fromFunction0(onTopVisibleReverse), onUnfixed = js.Any.fromFunction0(onUnfixed), onUpdate = js.Any.fromFunction1(onUpdate), once = once.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], refreshOnLoad = refreshOnLoad.asInstanceOf[js.Any], refreshOnResize = refreshOnResize.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
}

