package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import typings.semanticUiVisibility.SemanticUI.Visibility.ClassNameSettings
import typings.semanticUiVisibility.SemanticUI.Visibility.ElementCalculations
import typings.semanticUiVisibility.SemanticUI.Visibility.ErrorSettings
import typings.semanticUiVisibility.semanticUiVisibilityBooleans.`false`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.fixed
import typings.semanticUiVisibility.semanticUiVisibilityStrings.image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, keyof semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl>> */
@js.native
trait PartialPickImplkeyofImpl extends StObject {
  
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
  implicit class PartialPickImplkeyofImplMutableBuilder[Self <: PartialPickImplkeyofImpl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckOnRefresh(value: Boolean): Self = StObject.set(x, "checkOnRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckOnRefreshUndefined: Self = StObject.set(x, "checkOnRefresh", js.undefined)
    
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContext(value: String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setIncludeMargin(value: Boolean): Self = StObject.set(x, "includeMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeMarginUndefined: Self = StObject.set(x, "includeMargin", js.undefined)
    
    @scala.inline
    def setInitialCheck(value: Boolean): Self = StObject.set(x, "initialCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialCheckUndefined: Self = StObject.set(x, "initialCheck", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setObserveChanges(value: Boolean): Self = StObject.set(x, "observeChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObserveChangesUndefined: Self = StObject.set(x, "observeChanges", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOnAllLoaded(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onAllLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAllLoadedUndefined: Self = StObject.set(x, "onAllLoaded", js.undefined)
    
    @scala.inline
    def setOnBottomPassed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onBottomPassed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBottomPassedReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onBottomPassedReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBottomPassedReverseUndefined: Self = StObject.set(x, "onBottomPassedReverse", js.undefined)
    
    @scala.inline
    def setOnBottomPassedUndefined: Self = StObject.set(x, "onBottomPassed", js.undefined)
    
    @scala.inline
    def setOnBottomVisible(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onBottomVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBottomVisibleReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onBottomVisibleReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBottomVisibleReverseUndefined: Self = StObject.set(x, "onBottomVisibleReverse", js.undefined)
    
    @scala.inline
    def setOnBottomVisibleUndefined: Self = StObject.set(x, "onBottomVisible", js.undefined)
    
    @scala.inline
    def setOnFixed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onFixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFixedUndefined: Self = StObject.set(x, "onFixed", js.undefined)
    
    @scala.inline
    def setOnLoad(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    @scala.inline
    def setOnOffScreen(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onOffScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOffScreenUndefined: Self = StObject.set(x, "onOffScreen", js.undefined)
    
    @scala.inline
    def setOnOnScreen(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onOnScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnOnScreenUndefined: Self = StObject.set(x, "onOnScreen", js.undefined)
    
    @scala.inline
    def setOnPassing(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onPassing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPassingReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onPassingReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPassingReverseUndefined: Self = StObject.set(x, "onPassingReverse", js.undefined)
    
    @scala.inline
    def setOnPassingUndefined: Self = StObject.set(x, "onPassing", js.undefined)
    
    @scala.inline
    def setOnRefresh(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
    
    @scala.inline
    def setOnTopPassed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onTopPassed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTopPassedReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onTopPassedReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTopPassedReverseUndefined: Self = StObject.set(x, "onTopPassedReverse", js.undefined)
    
    @scala.inline
    def setOnTopPassedUndefined: Self = StObject.set(x, "onTopPassed", js.undefined)
    
    @scala.inline
    def setOnTopVisible(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onTopVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTopVisibleReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onTopVisibleReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTopVisibleReverseUndefined: Self = StObject.set(x, "onTopVisibleReverse", js.undefined)
    
    @scala.inline
    def setOnTopVisibleUndefined: Self = StObject.set(x, "onTopVisible", js.undefined)
    
    @scala.inline
    def setOnUnfixed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onUnfixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUnfixedUndefined: Self = StObject.set(x, "onUnfixed", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit]): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    
    @scala.inline
    def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    @scala.inline
    def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    @scala.inline
    def setRefreshOnLoad(value: Boolean): Self = StObject.set(x, "refreshOnLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshOnLoadUndefined: Self = StObject.set(x, "refreshOnLoad", js.undefined)
    
    @scala.inline
    def setRefreshOnResize(value: Boolean): Self = StObject.set(x, "refreshOnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshOnResizeUndefined: Self = StObject.set(x, "refreshOnResize", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setThrottle(value: `false` | Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    
    @scala.inline
    def setTransition(value: `false` | String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setType(value: `false` | image | fixed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
