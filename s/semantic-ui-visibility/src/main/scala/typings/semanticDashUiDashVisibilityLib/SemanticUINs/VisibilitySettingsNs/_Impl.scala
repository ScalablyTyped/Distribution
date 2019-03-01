package typings
package semanticDashUiDashVisibilityLib.SemanticUINs.VisibilitySettingsNs

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
  var checkOnRefresh: scala.Boolean
  // endregion
  // region DOM Settings
  /**
    * Class names used to attach style to state
    */
  var className: semanticDashUiDashVisibilityLib.SemanticUINs.VisibilityNs.ClassNameSettings
  /**
    * The scroll context visibility should use.
    *
    * @default 'window'
    */
  var context: java.lang.String | semanticDashUiDashVisibilityLib.JQuery
  /**
    * When set to true a callback will occur anytime an element passes a condition not just immediately after the threshold is met.
    *
    * @default false
    */
  var continuous: scala.Boolean
  /**
    * Debug output to console
    */
  var debug: scala.Boolean
  /**
    * When using type: image allows you to specify transition duration
    *
    * @default 1000
    */
  var duration: scala.Double
  // endregion
  // region Debug Settings
  var error: semanticDashUiDashVisibilityLib.SemanticUINs.VisibilityNs.ErrorSettings
  /**
    * Whether element calculations should include its margin
    *
    * @default false
    */
  var includeMargin: scala.Boolean
  /**
    * Whether visibility conditions should be checked immediately on init
    *
    * @default true
    */
  var initialCheck: scala.Boolean
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: java.lang.String
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: java.lang.String
  /**
    * Whether to automatically refresh content when changes are made to the element's DOM subtree
    *
    * @default true
    */
  var observeChanges: scala.Boolean
  /**
    * Value that context scrollTop should be adjusted in pixels. Useful for making content appear below content fixed to the page.
    *
    * @default 0
    */
  var offset: scala.Double
  // region Functionality
  /**
    * When set to false a callback will occur each time an element passes the threshold for a condition.
    *
    * @default true
    */
  var once: scala.Boolean
  /**
    * Show console.table output with performance metrics
    */
  var performance: scala.Boolean
  /**
    * Whether visibility conditions should be checked on window load. This ensures that after images load content positions will be updated correctly.
    *
    * @default true
    */
  var refreshOnLoad: scala.Boolean
  /**
    * Whether visibility conditions should be checked on window resize. Useful when content resizes causes continuous changes in position
    *
    * @default true
    */
  var refreshOnResize: scala.Boolean
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: scala.Boolean
  /**
    * When set to an integer, scroll position will be debounced using this ms value. false will debounce with requestAnimationFrame.
    *
    * @default false
    */
  var throttle: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibNumbers.`false` | scala.Double
  /**
    * When using type: image allows you to specify transition when showing a loaded image
    *
    * @default false
    */
  var transition: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibNumbers.`false` | java.lang.String
  /**
    * Set to image to load images when on screen. Set to fixed to add class name fixed when passed.
    *
    * @default false
    */
  var `type`: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibNumbers.`false` | semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.image | semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.fixed
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: scala.Boolean
  /**
    * Specify a z-index when using type: 'fixed'.
    *
    * @default 1
    * @since 2.2
    */
  var zIndex: scala.Double
  /**
    * Occurs after all img initialized at the same time have loaded.
    *
    * @since 2.2
    */
  def onAllLoaded(`this`: semanticDashUiDashVisibilityLib.JQuery): scala.Unit
  /**
    * Element's bottom edge has passed top of screen
    */
  def onBottomPassed(`this`: semanticDashUiDashVisibilityLib.JQuery): scala.Unit
  /**
    * Element's bottom edge has not passed top of screen
    */
  def onBottomPassedReverse(`this`: semanticDashUiDashVisibilityLib.JQuery): scala.Unit
  /**
    * Element's bottom edge has passed bottom of screen
    */
  def onBottomVisible(`this`: semanticDashUiDashVisibilityLib.JQuery): scala.Unit
  /**
    * Element's bottom edge has not passed bottom of screen
    */
  def onBottomVisibleReverse(`this`: semanticDashUiDashVisibilityLib.JQuery): scala.Unit
  // endregion
  // region Fixed Callbacks
  /**
    * Occurs after element has been assigned position fixed
    *
    * @since 2.2
    */
  def onFixed(`this`: semanticDashUiDashVisibilityLib.JQuery): scala.Unit
  // endregion
  // region Image Callbacks
  /**
    * Occurs after an image has completed loading
    *
    * @since 2.2
    */
  def onLoad(`this`: semanticDashUiDashVisibilityLib.JQuery): scala.Unit
  def onOffScreen(`this`: semanticDashUiDashVisibilityLib.JQuery): scala.Unit
  def onOnScreen(`this`: semanticDashUiDashVisibilityLib.JQuery): scala.Unit
  /**
    * Any part of an element is visible on screen
    */
  def onPassing(`this`: semanticDashUiDashVisibilityLib.JQuery): scala.Unit
  /**
    * Element's top has not passed top of screen but bottom has
    */
  def onPassingReverse(`this`: semanticDashUiDashVisibilityLib.JQuery): scala.Unit
  /**
    * Occurs whenever element's visibility is refreshed
    */
  def onRefresh(`this`: semanticDashUiDashVisibilityLib.JQuery): scala.Unit
  /**
    * Element's top edge has passed top of the screen
    */
  def onTopPassed(`this`: semanticDashUiDashVisibilityLib.JQuery): scala.Unit
  /**
    * Element's top edge has not passed top of the screen
    */
  def onTopPassedReverse(`this`: semanticDashUiDashVisibilityLib.JQuery): scala.Unit
  // endregion
  // region Visibility Callbacks
  /**
    * Element's top edge has passed bottom of screen
    */
  def onTopVisible(`this`: semanticDashUiDashVisibilityLib.JQuery): scala.Unit
  /**
    * Element's top edge has not passed bottom of screen
    */
  def onTopVisibleReverse(`this`: semanticDashUiDashVisibilityLib.JQuery): scala.Unit
  /**
    * Occurs after element has been removed from fixed position
    *
    * @since 2.2
    */
  def onUnfixed(`this`: semanticDashUiDashVisibilityLib.JQuery): scala.Unit
  // endregion
  // region Utility Callbacks
  /**
    * Occurs each time an elements calculations are updated
    */
  def onUpdate(
    `this`: semanticDashUiDashVisibilityLib.JQuery,
    calculations: semanticDashUiDashVisibilityLib.SemanticUINs.VisibilityNs.ElementCalculations
  ): scala.Unit
}

object _Impl {
  @scala.inline
  def apply(
    checkOnRefresh: scala.Boolean,
    className: semanticDashUiDashVisibilityLib.SemanticUINs.VisibilityNs.ClassNameSettings,
    context: java.lang.String | semanticDashUiDashVisibilityLib.JQuery,
    continuous: scala.Boolean,
    debug: scala.Boolean,
    duration: scala.Double,
    error: semanticDashUiDashVisibilityLib.SemanticUINs.VisibilityNs.ErrorSettings,
    includeMargin: scala.Boolean,
    initialCheck: scala.Boolean,
    name: java.lang.String,
    namespace: java.lang.String,
    observeChanges: scala.Boolean,
    offset: scala.Double,
    onAllLoaded: js.Function1[semanticDashUiDashVisibilityLib.JQuery, scala.Unit],
    onBottomPassed: js.Function1[semanticDashUiDashVisibilityLib.JQuery, scala.Unit],
    onBottomPassedReverse: js.Function1[semanticDashUiDashVisibilityLib.JQuery, scala.Unit],
    onBottomVisible: js.Function1[semanticDashUiDashVisibilityLib.JQuery, scala.Unit],
    onBottomVisibleReverse: js.Function1[semanticDashUiDashVisibilityLib.JQuery, scala.Unit],
    onFixed: js.Function1[semanticDashUiDashVisibilityLib.JQuery, scala.Unit],
    onLoad: js.Function1[semanticDashUiDashVisibilityLib.JQuery, scala.Unit],
    onOffScreen: js.Function1[semanticDashUiDashVisibilityLib.JQuery, scala.Unit],
    onOnScreen: js.Function1[semanticDashUiDashVisibilityLib.JQuery, scala.Unit],
    onPassing: js.Function1[semanticDashUiDashVisibilityLib.JQuery, scala.Unit],
    onPassingReverse: js.Function1[semanticDashUiDashVisibilityLib.JQuery, scala.Unit],
    onRefresh: js.Function1[semanticDashUiDashVisibilityLib.JQuery, scala.Unit],
    onTopPassed: js.Function1[semanticDashUiDashVisibilityLib.JQuery, scala.Unit],
    onTopPassedReverse: js.Function1[semanticDashUiDashVisibilityLib.JQuery, scala.Unit],
    onTopVisible: js.Function1[semanticDashUiDashVisibilityLib.JQuery, scala.Unit],
    onTopVisibleReverse: js.Function1[semanticDashUiDashVisibilityLib.JQuery, scala.Unit],
    onUnfixed: js.Function1[semanticDashUiDashVisibilityLib.JQuery, scala.Unit],
    onUpdate: js.Function2[
      semanticDashUiDashVisibilityLib.JQuery, 
      semanticDashUiDashVisibilityLib.SemanticUINs.VisibilityNs.ElementCalculations, 
      scala.Unit
    ],
    once: scala.Boolean,
    performance: scala.Boolean,
    refreshOnLoad: scala.Boolean,
    refreshOnResize: scala.Boolean,
    silent: scala.Boolean,
    throttle: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibNumbers.`false` | scala.Double,
    transition: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibNumbers.`false` | java.lang.String,
    `type`: semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibNumbers.`false` | semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.image | semanticDashUiDashVisibilityLib.semanticDashUiDashVisibilityLibStrings.fixed,
    verbose: scala.Boolean,
    zIndex: scala.Double
  ): _Impl = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("checkOnRefresh")(checkOnRefresh)
    __obj.updateDynamic("className")(className)
    __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.updateDynamic("continuous")(continuous)
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("includeMargin")(includeMargin)
    __obj.updateDynamic("initialCheck")(initialCheck)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("observeChanges")(observeChanges)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("onAllLoaded")(onAllLoaded)
    __obj.updateDynamic("onBottomPassed")(onBottomPassed)
    __obj.updateDynamic("onBottomPassedReverse")(onBottomPassedReverse)
    __obj.updateDynamic("onBottomVisible")(onBottomVisible)
    __obj.updateDynamic("onBottomVisibleReverse")(onBottomVisibleReverse)
    __obj.updateDynamic("onFixed")(onFixed)
    __obj.updateDynamic("onLoad")(onLoad)
    __obj.updateDynamic("onOffScreen")(onOffScreen)
    __obj.updateDynamic("onOnScreen")(onOnScreen)
    __obj.updateDynamic("onPassing")(onPassing)
    __obj.updateDynamic("onPassingReverse")(onPassingReverse)
    __obj.updateDynamic("onRefresh")(onRefresh)
    __obj.updateDynamic("onTopPassed")(onTopPassed)
    __obj.updateDynamic("onTopPassedReverse")(onTopPassedReverse)
    __obj.updateDynamic("onTopVisible")(onTopVisible)
    __obj.updateDynamic("onTopVisibleReverse")(onTopVisibleReverse)
    __obj.updateDynamic("onUnfixed")(onUnfixed)
    __obj.updateDynamic("onUpdate")(onUpdate)
    __obj.updateDynamic("once")(once)
    __obj.updateDynamic("performance")(performance)
    __obj.updateDynamic("refreshOnLoad")(refreshOnLoad)
    __obj.updateDynamic("refreshOnResize")(refreshOnResize)
    __obj.updateDynamic("silent")(silent)
    __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.updateDynamic("verbose")(verbose)
    __obj.updateDynamic("zIndex")(zIndex)
    __obj.asInstanceOf[_Impl]
  }
}

