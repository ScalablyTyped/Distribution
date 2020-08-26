package typings.semanticUiVisibility.anon

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

/* Inlined std.Partial<std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, keyof semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends js.Object {
  var checkOnRefresh: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[ClassNameSettings] = js.native
  var context: js.UndefOr[String | JQuery] = js.native
  var continuous: js.UndefOr[Boolean] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var duration: js.UndefOr[Double] = js.native
  var error: js.UndefOr[ErrorSettings] = js.native
  var includeMargin: js.UndefOr[Boolean] = js.native
  var initialCheck: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var namespace: js.UndefOr[String] = js.native
  var observeChanges: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Double] = js.native
  var onAllLoaded: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onBottomPassed: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onBottomPassedReverse: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onBottomVisible: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onBottomVisibleReverse: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onFixed: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onLoad: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onOffScreen: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onOnScreen: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onPassing: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onPassingReverse: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onRefresh: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onTopPassed: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onTopPassedReverse: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onTopVisible: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onTopVisibleReverse: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onUnfixed: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.native
  var onUpdate: js.UndefOr[
    js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit]
  ] = js.native
  var once: js.UndefOr[Boolean] = js.native
  var performance: js.UndefOr[Boolean] = js.native
  var refreshOnLoad: js.UndefOr[Boolean] = js.native
  var refreshOnResize: js.UndefOr[Boolean] = js.native
  var silent: js.UndefOr[Boolean] = js.native
  var throttle: js.UndefOr[`false` | Double] = js.native
  var transition: js.UndefOr[`false` | String] = js.native
  var `type`: js.UndefOr[`false` | image | fixed] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
  @scala.inline
  implicit class PartialPickImplkeyofImplOps[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
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
    def deleteCheckOnRefresh: Self = this.set("checkOnRefresh", js.undefined)
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContext(value: String | JQuery): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setContinuous(value: Boolean): Self = this.set("continuous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinuous: Self = this.set("continuous", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setIncludeMargin(value: Boolean): Self = this.set("includeMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeMargin: Self = this.set("includeMargin", js.undefined)
    @scala.inline
    def setInitialCheck(value: Boolean): Self = this.set("initialCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialCheck: Self = this.set("initialCheck", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setObserveChanges(value: Boolean): Self = this.set("observeChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObserveChanges: Self = this.set("observeChanges", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOnAllLoaded(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onAllLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnAllLoaded: Self = this.set("onAllLoaded", js.undefined)
    @scala.inline
    def setOnBottomPassed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onBottomPassed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBottomPassed: Self = this.set("onBottomPassed", js.undefined)
    @scala.inline
    def setOnBottomPassedReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onBottomPassedReverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBottomPassedReverse: Self = this.set("onBottomPassedReverse", js.undefined)
    @scala.inline
    def setOnBottomVisible(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onBottomVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBottomVisible: Self = this.set("onBottomVisible", js.undefined)
    @scala.inline
    def setOnBottomVisibleReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onBottomVisibleReverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnBottomVisibleReverse: Self = this.set("onBottomVisibleReverse", js.undefined)
    @scala.inline
    def setOnFixed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onFixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnFixed: Self = this.set("onFixed", js.undefined)
    @scala.inline
    def setOnLoad(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOnOffScreen(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onOffScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOffScreen: Self = this.set("onOffScreen", js.undefined)
    @scala.inline
    def setOnOnScreen(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onOnScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnOnScreen: Self = this.set("onOnScreen", js.undefined)
    @scala.inline
    def setOnPassing(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onPassing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPassing: Self = this.set("onPassing", js.undefined)
    @scala.inline
    def setOnPassingReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onPassingReverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPassingReverse: Self = this.set("onPassingReverse", js.undefined)
    @scala.inline
    def setOnRefresh(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnRefresh: Self = this.set("onRefresh", js.undefined)
    @scala.inline
    def setOnTopPassed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onTopPassed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTopPassed: Self = this.set("onTopPassed", js.undefined)
    @scala.inline
    def setOnTopPassedReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onTopPassedReverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTopPassedReverse: Self = this.set("onTopPassedReverse", js.undefined)
    @scala.inline
    def setOnTopVisible(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onTopVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTopVisible: Self = this.set("onTopVisible", js.undefined)
    @scala.inline
    def setOnTopVisibleReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onTopVisibleReverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnTopVisibleReverse: Self = this.set("onTopVisibleReverse", js.undefined)
    @scala.inline
    def setOnUnfixed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = this.set("onUnfixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnUnfixed: Self = this.set("onUnfixed", js.undefined)
    @scala.inline
    def setOnUpdate(value: js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit]): Self = this.set("onUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    @scala.inline
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    @scala.inline
    def setRefreshOnLoad(value: Boolean): Self = this.set("refreshOnLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshOnLoad: Self = this.set("refreshOnLoad", js.undefined)
    @scala.inline
    def setRefreshOnResize(value: Boolean): Self = this.set("refreshOnResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshOnResize: Self = this.set("refreshOnResize", js.undefined)
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    @scala.inline
    def setThrottle(value: `false` | Double): Self = this.set("throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
    @scala.inline
    def setTransition(value: `false` | String): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    @scala.inline
    def setType(value: `false` | image | fixed): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

