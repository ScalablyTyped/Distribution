package typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeReanimated.libTypesReanimated2CoreMod._WorkletValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationObject
  extends StObject
     with /* key */ StringDictionary[Any]
     with _WorkletValue {
  
  var __prefix: js.UndefOr[String] = js.undefined
  
  var __suffix: js.UndefOr[String] = js.undefined
  
  var callback: AnimationCallback
  
  var cancelled: js.UndefOr[Boolean] = js.undefined
  
  var current: js.UndefOr[AnimatableValue] = js.undefined
  
  var finished: js.UndefOr[Boolean] = js.undefined
  
  def onFrame(animation: Any, timestamp: Timestamp): Boolean
  
  def onStart(nextAnimation: Any, current: Any, timestamp: Timestamp, previousAnimation: Any): Unit
  
  var startValue: js.UndefOr[AnimatableValue] = js.undefined
  
  var strippedCurrent: js.UndefOr[Double] = js.undefined
  
  var toValue: js.UndefOr[AnimatableValue] = js.undefined
}
object AnimationObject {
  
  inline def apply(
    callback: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Unit,
    onFrame: (Any, Timestamp) => Boolean,
    onStart: (Any, Any, Timestamp, Any) => Unit
  ): AnimationObject = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), onFrame = js.Any.fromFunction2(onFrame), onStart = js.Any.fromFunction4(onStart))
    __obj.asInstanceOf[AnimationObject]
  }
  
  extension [Self <: AnimationObject](x: Self) {
    
    inline def setCallback(value: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    inline def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
    
    inline def setCurrent(value: AnimatableValue): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setCurrentVarargs(value: Double*): Self = StObject.set(x, "current", js.Array(value*))
    
    inline def setFinished(value: Boolean): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    inline def setFinishedUndefined: Self = StObject.set(x, "finished", js.undefined)
    
    inline def setOnFrame(value: (Any, Timestamp) => Boolean): Self = StObject.set(x, "onFrame", js.Any.fromFunction2(value))
    
    inline def setOnStart(value: (Any, Any, Timestamp, Any) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction4(value))
    
    inline def setStartValue(value: AnimatableValue): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
    
    inline def setStartValueVarargs(value: Double*): Self = StObject.set(x, "startValue", js.Array(value*))
    
    inline def setStrippedCurrent(value: Double): Self = StObject.set(x, "strippedCurrent", value.asInstanceOf[js.Any])
    
    inline def setStrippedCurrentUndefined: Self = StObject.set(x, "strippedCurrent", js.undefined)
    
    inline def setToValue(value: AnimatableValue): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
    
    inline def setToValueUndefined: Self = StObject.set(x, "toValue", js.undefined)
    
    inline def setToValueVarargs(value: Double*): Self = StObject.set(x, "toValue", js.Array(value*))
    
    inline def set__prefix(value: String): Self = StObject.set(x, "__prefix", value.asInstanceOf[js.Any])
    
    inline def set__prefixUndefined: Self = StObject.set(x, "__prefix", js.undefined)
    
    inline def set__suffix(value: String): Self = StObject.set(x, "__suffix", value.asInstanceOf[js.Any])
    
    inline def set__suffixUndefined: Self = StObject.set(x, "__suffix", js.undefined)
  }
}
