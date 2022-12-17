package typings.semanticUiTransition.anon

import typings.semanticUiTransition.JQuery
import typings.semanticUiTransition.SemanticUI.Transition.ClassNameSettings
import typings.semanticUiTransition.SemanticUI.Transition.ErrorSettings
import typings.semanticUiTransition.SemanticUI.TransitionSettings.Param
import typings.semanticUiTransition.semanticUiTransitionBooleans.`false`
import typings.semanticUiTransition.semanticUiTransitionStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, 'reverse'> & std.Partial<std.Pick<semantic-ui-transition.SemanticUI.TransitionSettings._Impl, keyof semantic-ui-transition.SemanticUI.TransitionSettings._Impl>> */
trait PickImplreversePartialPic
  extends StObject
     with Param {
  
  var allowRepeats: js.UndefOr[Boolean] = js.undefined
  
  var animation: js.UndefOr[String] = js.undefined
  
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var displayType: js.UndefOr[`false` | String] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var error: js.UndefOr[ErrorSettings] = js.undefined
  
  var interval: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var namespace: js.UndefOr[String] = js.undefined
  
  var onComplete: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  
  var onShow: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  
  var onStart: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  
  var performance: js.UndefOr[Boolean] = js.undefined
  
  var queue: js.UndefOr[Boolean] = js.undefined
  
  var reverse: auto | Boolean
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var useFailSafe: js.UndefOr[Boolean] = js.undefined
  
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object PickImplreversePartialPic {
  
  inline def apply(reverse: auto | Boolean): PickImplreversePartialPic = {
    val __obj = js.Dynamic.literal(reverse = reverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplreversePartialPic]
  }
  
  extension [Self <: PickImplreversePartialPic](x: Self) {
    
    inline def setAllowRepeats(value: Boolean): Self = StObject.set(x, "allowRepeats", value.asInstanceOf[js.Any])
    
    inline def setAllowRepeatsUndefined: Self = StObject.set(x, "allowRepeats", js.undefined)
    
    inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDisplayType(value: `false` | String): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
    
    inline def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setOnComplete(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
    
    inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
    
    inline def setOnHide(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnShow(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setOnStart(value: js.ThisFunction0[/* this */ JQuery, Unit]): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
    
    inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setQueue(value: Boolean): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "queue", js.undefined)
    
    inline def setReverse(value: auto | Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setUseFailSafe(value: Boolean): Self = StObject.set(x, "useFailSafe", value.asInstanceOf[js.Any])
    
    inline def setUseFailSafeUndefined: Self = StObject.set(x, "useFailSafe", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
