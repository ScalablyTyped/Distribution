package typings.semanticUiSticky.anon

import typings.semanticUiSticky.JQuery
import typings.semanticUiSticky.SemanticUI.Sticky.ClassNameSettings
import typings.semanticUiSticky.SemanticUI.Sticky.ErrorSettings
import typings.semanticUiSticky.SemanticUI.StickySettings.Param
import typings.semanticUiSticky.semanticUiStickyBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, 'pushing'> & std.Partial<std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, keyof semantic-ui-sticky.SemanticUI.StickySettings._Impl>> */
trait PickImplpushingPartialPic
  extends StObject
     with Param {
  
  var bottomOffset: js.UndefOr[Double] = js.undefined
  
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  
  var context: js.UndefOr[`false` | String | JQuery] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[ErrorSettings] = js.undefined
  
  var jitter: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var namespace: js.UndefOr[String] = js.undefined
  
  var observeChanges: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var onBottom: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  
  var onReposition: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  
  var onScroll: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  
  var onStick: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  
  var onTop: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  
  var onUnstick: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  
  var performance: js.UndefOr[Boolean] = js.undefined
  
  var pushing: Boolean & js.UndefOr[Boolean]
  
  var scrollContext: js.UndefOr[String | JQuery] = js.undefined
  
  var setSize: js.UndefOr[Boolean] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object PickImplpushingPartialPic {
  
  inline def apply(pushing: Boolean & js.UndefOr[Boolean]): PickImplpushingPartialPic = {
    val __obj = js.Dynamic.literal(pushing = pushing.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpushingPartialPic]
  }
  
  extension [Self <: PickImplpushingPartialPic](x: Self) {
    
    inline def setBottomOffset(value: Double): Self = StObject.set(x, "bottomOffset", value.asInstanceOf[js.Any])
    
    inline def setBottomOffsetUndefined: Self = StObject.set(x, "bottomOffset", js.undefined)
    
    inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setContext(value: `false` | String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setJitter(value: Double): Self = StObject.set(x, "jitter", value.asInstanceOf[js.Any])
    
    inline def setJitterUndefined: Self = StObject.set(x, "jitter", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setObserveChanges(value: Boolean): Self = StObject.set(x, "observeChanges", value.asInstanceOf[js.Any])
    
    inline def setObserveChangesUndefined: Self = StObject.set(x, "observeChanges", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOnBottom(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onBottom", value.asInstanceOf[js.Any])
    
    inline def setOnBottomUndefined: Self = StObject.set(x, "onBottom", js.undefined)
    
    inline def setOnReposition(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onReposition", value.asInstanceOf[js.Any])
    
    inline def setOnRepositionUndefined: Self = StObject.set(x, "onReposition", js.undefined)
    
    inline def setOnScroll(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onScroll", value.asInstanceOf[js.Any])
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnStick(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onStick", value.asInstanceOf[js.Any])
    
    inline def setOnStickUndefined: Self = StObject.set(x, "onStick", js.undefined)
    
    inline def setOnTop(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onTop", value.asInstanceOf[js.Any])
    
    inline def setOnTopUndefined: Self = StObject.set(x, "onTop", js.undefined)
    
    inline def setOnUnstick(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onUnstick", value.asInstanceOf[js.Any])
    
    inline def setOnUnstickUndefined: Self = StObject.set(x, "onUnstick", js.undefined)
    
    inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setPushing(value: Boolean & js.UndefOr[Boolean]): Self = StObject.set(x, "pushing", value.asInstanceOf[js.Any])
    
    inline def setScrollContext(value: String | JQuery): Self = StObject.set(x, "scrollContext", value.asInstanceOf[js.Any])
    
    inline def setScrollContextUndefined: Self = StObject.set(x, "scrollContext", js.undefined)
    
    inline def setSetSize(value: Boolean): Self = StObject.set(x, "setSize", value.asInstanceOf[js.Any])
    
    inline def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
