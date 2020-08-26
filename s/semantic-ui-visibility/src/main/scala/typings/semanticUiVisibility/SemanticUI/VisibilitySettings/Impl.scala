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

@js.native
trait Impl extends js.Object {
  /**
    * Whether visibility conditions should be checked on calls to refresh.
    * These calls can be triggered from either resize, load or manually calling $('.foo').visibility('refresh')
    *
    * @default true
    */
  var checkOnRefresh: Boolean = js.native
  // endregion
  // region DOM Settings
  /**
    * Class names used to attach style to state
    */
  var className: ClassNameSettings = js.native
  /**
    * The scroll context visibility should use.
    *
    * @default 'window'
    */
  var context: String | JQuery = js.native
  /**
    * When set to true a callback will occur anytime an element passes a condition not just immediately after the threshold is met.
    *
    * @default false
    */
  var continuous: Boolean = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  /**
    * When using type: image allows you to specify transition duration
    *
    * @default 1000
    */
  var duration: Double = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * Whether element calculations should include its margin
    *
    * @default false
    */
  var includeMargin: Boolean = js.native
  /**
    * Whether visibility conditions should be checked immediately on init
    *
    * @default true
    */
  var initialCheck: Boolean = js.native
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String = js.native
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String = js.native
  /**
    * Whether to automatically refresh content when changes are made to the element's DOM subtree
    *
    * @default true
    */
  var observeChanges: Boolean = js.native
  /**
    * Value that context scrollTop should be adjusted in pixels. Useful for making content appear below content fixed to the page.
    *
    * @default 0
    */
  var offset: Double = js.native
  // region Functionality
  /**
    * When set to false a callback will occur each time an element passes the threshold for a condition.
    *
    * @default true
    */
  var once: Boolean = js.native
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  /**
    * Whether visibility conditions should be checked on window load. This ensures that after images load content positions will be updated correctly.
    *
    * @default true
    */
  var refreshOnLoad: Boolean = js.native
  /**
    * Whether visibility conditions should be checked on window resize. Useful when content resizes causes continuous changes in position
    *
    * @default true
    */
  var refreshOnResize: Boolean = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  /**
    * When set to an integer, scroll position will be debounced using this ms value. false will debounce with requestAnimationFrame.
    *
    * @default false
    */
  var throttle: `false` | Double = js.native
  /**
    * When using type: image allows you to specify transition when showing a loaded image
    *
    * @default false
    */
  var transition: `false` | String = js.native
  /**
    * Set to image to load images when on screen. Set to fixed to add class name fixed when passed.
    *
    * @default false
    */
  var `type`: `false` | image | fixed = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  /**
    * Specify a z-index when using type: 'fixed'.
    *
    * @default 1
    * @since 2.2
    */
  var zIndex: Double = js.native
  /**
    * Occurs after all img initialized at the same time have loaded.
    *
    * @since 2.2
    */
  def onAllLoaded(): Unit = js.native
  /**
    * Element's bottom edge has passed top of screen
    */
  def onBottomPassed(): Unit = js.native
  /**
    * Element's bottom edge has not passed top of screen
    */
  def onBottomPassedReverse(): Unit = js.native
  /**
    * Element's bottom edge has passed bottom of screen
    */
  def onBottomVisible(): Unit = js.native
  /**
    * Element's bottom edge has not passed bottom of screen
    */
  def onBottomVisibleReverse(): Unit = js.native
  // endregion
  // region Fixed Callbacks
  /**
    * Occurs after element has been assigned position fixed
    *
    * @since 2.2
    */
  def onFixed(): Unit = js.native
  // endregion
  // region Image Callbacks
  /**
    * Occurs after an image has completed loading
    *
    * @since 2.2
    */
  def onLoad(): Unit = js.native
  def onOffScreen(): Unit = js.native
  def onOnScreen(): Unit = js.native
  /**
    * Any part of an element is visible on screen
    */
  def onPassing(): Unit = js.native
  /**
    * Element's top has not passed top of screen but bottom has
    */
  def onPassingReverse(): Unit = js.native
  /**
    * Occurs whenever element's visibility is refreshed
    */
  def onRefresh(): Unit = js.native
  /**
    * Element's top edge has passed top of the screen
    */
  def onTopPassed(): Unit = js.native
  /**
    * Element's top edge has not passed top of the screen
    */
  def onTopPassedReverse(): Unit = js.native
  // endregion
  // region Visibility Callbacks
  /**
    * Element's top edge has passed bottom of screen
    */
  def onTopVisible(): Unit = js.native
  /**
    * Element's top edge has not passed bottom of screen
    */
  def onTopVisibleReverse(): Unit = js.native
  /**
    * Occurs after element has been removed from fixed position
    *
    * @since 2.2
    */
  def onUnfixed(): Unit = js.native
  // endregion
  // region Utility Callbacks
  /**
    * Occurs each time an elements calculations are updated
    */
  def onUpdate(calculations: ElementCalculations): Unit = js.native
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
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCheckOnRefresh(value: Boolean): Self = this.set("checkOnRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: String | JQuery): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setContinuous(value: Boolean): Self = this.set("continuous", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeMargin(value: Boolean): Self = this.set("includeMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialCheck(value: Boolean): Self = this.set("initialCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setObserveChanges(value: Boolean): Self = this.set("observeChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnAllLoaded(value: () => Unit): Self = this.set("onAllLoaded", js.Any.fromFunction0(value))
    @scala.inline
    def setOnBottomPassed(value: () => Unit): Self = this.set("onBottomPassed", js.Any.fromFunction0(value))
    @scala.inline
    def setOnBottomPassedReverse(value: () => Unit): Self = this.set("onBottomPassedReverse", js.Any.fromFunction0(value))
    @scala.inline
    def setOnBottomVisible(value: () => Unit): Self = this.set("onBottomVisible", js.Any.fromFunction0(value))
    @scala.inline
    def setOnBottomVisibleReverse(value: () => Unit): Self = this.set("onBottomVisibleReverse", js.Any.fromFunction0(value))
    @scala.inline
    def setOnFixed(value: () => Unit): Self = this.set("onFixed", js.Any.fromFunction0(value))
    @scala.inline
    def setOnLoad(value: () => Unit): Self = this.set("onLoad", js.Any.fromFunction0(value))
    @scala.inline
    def setOnOffScreen(value: () => Unit): Self = this.set("onOffScreen", js.Any.fromFunction0(value))
    @scala.inline
    def setOnOnScreen(value: () => Unit): Self = this.set("onOnScreen", js.Any.fromFunction0(value))
    @scala.inline
    def setOnPassing(value: () => Unit): Self = this.set("onPassing", js.Any.fromFunction0(value))
    @scala.inline
    def setOnPassingReverse(value: () => Unit): Self = this.set("onPassingReverse", js.Any.fromFunction0(value))
    @scala.inline
    def setOnRefresh(value: () => Unit): Self = this.set("onRefresh", js.Any.fromFunction0(value))
    @scala.inline
    def setOnTopPassed(value: () => Unit): Self = this.set("onTopPassed", js.Any.fromFunction0(value))
    @scala.inline
    def setOnTopPassedReverse(value: () => Unit): Self = this.set("onTopPassedReverse", js.Any.fromFunction0(value))
    @scala.inline
    def setOnTopVisible(value: () => Unit): Self = this.set("onTopVisible", js.Any.fromFunction0(value))
    @scala.inline
    def setOnTopVisibleReverse(value: () => Unit): Self = this.set("onTopVisibleReverse", js.Any.fromFunction0(value))
    @scala.inline
    def setOnUnfixed(value: () => Unit): Self = this.set("onUnfixed", js.Any.fromFunction0(value))
    @scala.inline
    def setOnUpdate(value: ElementCalculations => Unit): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefreshOnLoad(value: Boolean): Self = this.set("refreshOnLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefreshOnResize(value: Boolean): Self = this.set("refreshOnResize", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setThrottle(value: `false` | Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransition(value: `false` | String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `false` | image | fixed): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
  }
  
}

