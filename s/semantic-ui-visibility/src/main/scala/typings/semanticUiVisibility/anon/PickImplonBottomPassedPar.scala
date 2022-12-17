package typings.semanticUiVisibility.anon

import typings.semanticUiVisibility.JQuery
import typings.semanticUiVisibility.SemanticUI.Visibility.ClassNameSettings
import typings.semanticUiVisibility.SemanticUI.Visibility.ElementCalculations
import typings.semanticUiVisibility.SemanticUI.Visibility.ErrorSettings
import typings.semanticUiVisibility.SemanticUI.VisibilitySettings.Param
import typings.semanticUiVisibility.semanticUiVisibilityBooleans.`false`
import typings.semanticUiVisibility.semanticUiVisibilityStrings.fixed
import typings.semanticUiVisibility.semanticUiVisibilityStrings.image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, 'onBottomPassed'> & std.Partial<std.Pick<semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl, keyof semantic-ui-visibility.SemanticUI.VisibilitySettings._Impl>> */
trait PickImplonBottomPassedPar
  extends StObject
     with Param {
  
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
  
  def onBottomPassed(): Unit
  
  var onBottomPassedReverse: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  
  @JSName("onBottomPassed")
  var onBottomPassed_Original: js.ThisFunction0[/* this */ JQuery, Unit]
  
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
object PickImplonBottomPassedPar {
  
  inline def apply(onBottomPassed: js.ThisFunction0[/* this */ JQuery, Unit]): PickImplonBottomPassedPar = {
    val __obj = js.Dynamic.literal(onBottomPassed = onBottomPassed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonBottomPassedPar]
  }
  
  extension [Self <: PickImplonBottomPassedPar](x: Self) {
    
    inline def setCheckOnRefresh(value: Boolean): Self = StObject.set(x, "checkOnRefresh", value.asInstanceOf[js.Any])
    
    inline def setCheckOnRefreshUndefined: Self = StObject.set(x, "checkOnRefresh", js.undefined)
    
    inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContext(value: String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    inline def setContinuousUndefined: Self = StObject.set(x, "continuous", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setIncludeMargin(value: Boolean): Self = StObject.set(x, "includeMargin", value.asInstanceOf[js.Any])
    
    inline def setIncludeMarginUndefined: Self = StObject.set(x, "includeMargin", js.undefined)
    
    inline def setInitialCheck(value: Boolean): Self = StObject.set(x, "initialCheck", value.asInstanceOf[js.Any])
    
    inline def setInitialCheckUndefined: Self = StObject.set(x, "initialCheck", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setObserveChanges(value: Boolean): Self = StObject.set(x, "observeChanges", value.asInstanceOf[js.Any])
    
    inline def setObserveChangesUndefined: Self = StObject.set(x, "observeChanges", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOnAllLoaded(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onAllLoaded", value.asInstanceOf[js.Any])
    
    inline def setOnAllLoadedUndefined: Self = StObject.set(x, "onAllLoaded", js.undefined)
    
    inline def setOnBottomPassed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onBottomPassed", value.asInstanceOf[js.Any])
    
    inline def setOnBottomPassedReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onBottomPassedReverse", value.asInstanceOf[js.Any])
    
    inline def setOnBottomPassedReverseUndefined: Self = StObject.set(x, "onBottomPassedReverse", js.undefined)
    
    inline def setOnBottomVisible(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onBottomVisible", value.asInstanceOf[js.Any])
    
    inline def setOnBottomVisibleReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onBottomVisibleReverse", value.asInstanceOf[js.Any])
    
    inline def setOnBottomVisibleReverseUndefined: Self = StObject.set(x, "onBottomVisibleReverse", js.undefined)
    
    inline def setOnBottomVisibleUndefined: Self = StObject.set(x, "onBottomVisible", js.undefined)
    
    inline def setOnFixed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onFixed", value.asInstanceOf[js.Any])
    
    inline def setOnFixedUndefined: Self = StObject.set(x, "onFixed", js.undefined)
    
    inline def setOnLoad(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onLoad", value.asInstanceOf[js.Any])
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnOffScreen(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onOffScreen", value.asInstanceOf[js.Any])
    
    inline def setOnOffScreenUndefined: Self = StObject.set(x, "onOffScreen", js.undefined)
    
    inline def setOnOnScreen(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onOnScreen", value.asInstanceOf[js.Any])
    
    inline def setOnOnScreenUndefined: Self = StObject.set(x, "onOnScreen", js.undefined)
    
    inline def setOnPassing(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onPassing", value.asInstanceOf[js.Any])
    
    inline def setOnPassingReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onPassingReverse", value.asInstanceOf[js.Any])
    
    inline def setOnPassingReverseUndefined: Self = StObject.set(x, "onPassingReverse", js.undefined)
    
    inline def setOnPassingUndefined: Self = StObject.set(x, "onPassing", js.undefined)
    
    inline def setOnRefresh(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onRefresh", value.asInstanceOf[js.Any])
    
    inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
    
    inline def setOnTopPassed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onTopPassed", value.asInstanceOf[js.Any])
    
    inline def setOnTopPassedReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onTopPassedReverse", value.asInstanceOf[js.Any])
    
    inline def setOnTopPassedReverseUndefined: Self = StObject.set(x, "onTopPassedReverse", js.undefined)
    
    inline def setOnTopPassedUndefined: Self = StObject.set(x, "onTopPassed", js.undefined)
    
    inline def setOnTopVisible(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onTopVisible", value.asInstanceOf[js.Any])
    
    inline def setOnTopVisibleReverse(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onTopVisibleReverse", value.asInstanceOf[js.Any])
    
    inline def setOnTopVisibleReverseUndefined: Self = StObject.set(x, "onTopVisibleReverse", js.undefined)
    
    inline def setOnTopVisibleUndefined: Self = StObject.set(x, "onTopVisible", js.undefined)
    
    inline def setOnUnfixed(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onUnfixed", value.asInstanceOf[js.Any])
    
    inline def setOnUnfixedUndefined: Self = StObject.set(x, "onUnfixed", js.undefined)
    
    inline def setOnUpdate(value: js.ThisFunction1[/* this */ JQuery, /* calculations */ ElementCalculations, Unit]): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
    
    inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    
    inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setRefreshOnLoad(value: Boolean): Self = StObject.set(x, "refreshOnLoad", value.asInstanceOf[js.Any])
    
    inline def setRefreshOnLoadUndefined: Self = StObject.set(x, "refreshOnLoad", js.undefined)
    
    inline def setRefreshOnResize(value: Boolean): Self = StObject.set(x, "refreshOnResize", value.asInstanceOf[js.Any])
    
    inline def setRefreshOnResizeUndefined: Self = StObject.set(x, "refreshOnResize", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setThrottle(value: `false` | Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    
    inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    
    inline def setTransition(value: `false` | String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    inline def setType(value: `false` | image | fixed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
