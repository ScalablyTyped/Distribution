package typings.semanticUiVisibility

import typings.semanticUiVisibility.SemanticUI.Visibility.ClassNameSettings
import typings.semanticUiVisibility.SemanticUI.Visibility.ElementCalculations
import typings.semanticUiVisibility.SemanticUI.Visibility.ErrorSettings
import typings.semanticUiVisibility.semanticUiVisibilityBooleans.`false`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.fixed
import typings.semanticUiVisibility.semanticUiVisibilityStrings.image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, keyof semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl>> */
trait PartialPickImplkeyofImpl extends js.Object {
  var checkOnRefresh: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  var context: js.UndefOr[String | JQuery] = js.undefined
  var continuous: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[ErrorSettings] = js.undefined
  var includeMargin: js.UndefOr[Boolean] = js.undefined
  var initialCheck: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var observeChanges: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var onAllLoaded: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onBottomPassed: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onBottomPassedReverse: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onBottomVisible: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onBottomVisibleReverse: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onFixed: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onOffScreen: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onOnScreen: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onPassing: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onPassingReverse: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onRefresh: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onTopPassed: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onTopPassedReverse: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onTopVisible: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onTopVisibleReverse: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onUnfixed: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var onUpdate: js.UndefOr[
    js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit]
  ] = js.undefined
  var once: js.UndefOr[Boolean] = js.undefined
  var performance: js.UndefOr[Boolean] = js.undefined
  var refreshOnLoad: js.UndefOr[Boolean] = js.undefined
  var refreshOnResize: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var throttle: js.UndefOr[`false` | Double] = js.undefined
  var transition: js.UndefOr[`false` | String] = js.undefined
  var `type`: js.UndefOr[`false` | image | fixed] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(
    checkOnRefresh: js.UndefOr[Boolean] = js.undefined,
    className: ClassNameSettings = null,
    context: String | JQuery = null,
    continuous: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    error: ErrorSettings = null,
    includeMargin: js.UndefOr[Boolean] = js.undefined,
    initialCheck: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    namespace: String = null,
    observeChanges: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    onAllLoaded: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onBottomPassed: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onBottomPassedReverse: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onBottomVisible: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onBottomVisibleReverse: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onFixed: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onLoad: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onOffScreen: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onOnScreen: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onPassing: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onPassingReverse: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onRefresh: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onTopPassed: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onTopPassedReverse: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onTopVisible: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onTopVisibleReverse: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onUnfixed: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    onUpdate: js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit] = null,
    once: js.UndefOr[Boolean] = js.undefined,
    performance: js.UndefOr[Boolean] = js.undefined,
    refreshOnLoad: js.UndefOr[Boolean] = js.undefined,
    refreshOnResize: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    throttle: `false` | Double = null,
    transition: `false` | String = null,
    `type`: `false` | image | fixed = null,
    verbose: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkOnRefresh)) __obj.updateDynamic("checkOnRefresh")(checkOnRefresh.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(includeMargin)) __obj.updateDynamic("includeMargin")(includeMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(initialCheck)) __obj.updateDynamic("initialCheck")(initialCheck.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (!js.isUndefined(observeChanges)) __obj.updateDynamic("observeChanges")(observeChanges.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onAllLoaded != null) __obj.updateDynamic("onAllLoaded")(onAllLoaded.asInstanceOf[js.Any])
    if (onBottomPassed != null) __obj.updateDynamic("onBottomPassed")(onBottomPassed.asInstanceOf[js.Any])
    if (onBottomPassedReverse != null) __obj.updateDynamic("onBottomPassedReverse")(onBottomPassedReverse.asInstanceOf[js.Any])
    if (onBottomVisible != null) __obj.updateDynamic("onBottomVisible")(onBottomVisible.asInstanceOf[js.Any])
    if (onBottomVisibleReverse != null) __obj.updateDynamic("onBottomVisibleReverse")(onBottomVisibleReverse.asInstanceOf[js.Any])
    if (onFixed != null) __obj.updateDynamic("onFixed")(onFixed.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad.asInstanceOf[js.Any])
    if (onOffScreen != null) __obj.updateDynamic("onOffScreen")(onOffScreen.asInstanceOf[js.Any])
    if (onOnScreen != null) __obj.updateDynamic("onOnScreen")(onOnScreen.asInstanceOf[js.Any])
    if (onPassing != null) __obj.updateDynamic("onPassing")(onPassing.asInstanceOf[js.Any])
    if (onPassingReverse != null) __obj.updateDynamic("onPassingReverse")(onPassingReverse.asInstanceOf[js.Any])
    if (onRefresh != null) __obj.updateDynamic("onRefresh")(onRefresh.asInstanceOf[js.Any])
    if (onTopPassed != null) __obj.updateDynamic("onTopPassed")(onTopPassed.asInstanceOf[js.Any])
    if (onTopPassedReverse != null) __obj.updateDynamic("onTopPassedReverse")(onTopPassedReverse.asInstanceOf[js.Any])
    if (onTopVisible != null) __obj.updateDynamic("onTopVisible")(onTopVisible.asInstanceOf[js.Any])
    if (onTopVisibleReverse != null) __obj.updateDynamic("onTopVisibleReverse")(onTopVisibleReverse.asInstanceOf[js.Any])
    if (onUnfixed != null) __obj.updateDynamic("onUnfixed")(onUnfixed.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshOnLoad)) __obj.updateDynamic("refreshOnLoad")(refreshOnLoad.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshOnResize)) __obj.updateDynamic("refreshOnResize")(refreshOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}

