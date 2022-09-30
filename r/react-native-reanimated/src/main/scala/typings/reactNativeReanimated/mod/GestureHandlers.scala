package typings.reactNativeReanimated.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GestureHandlers[T, TContext /* <: Context */] extends StObject {
  
  var onActive: js.UndefOr[Handler[T, TContext]] = js.undefined
  
  var onCancel: js.UndefOr[Handler[T, TContext]] = js.undefined
  
  var onEnd: js.UndefOr[Handler[T, TContext]] = js.undefined
  
  var onFail: js.UndefOr[Handler[T, TContext]] = js.undefined
  
  var onFinish: js.UndefOr[
    js.Function3[/* event */ T, /* context */ TContext, /* isCanceledOrFailed */ Boolean, Unit]
  ] = js.undefined
  
  var onStart: js.UndefOr[Handler[T, TContext]] = js.undefined
}
object GestureHandlers {
  
  inline def apply[T, TContext /* <: Context */](): GestureHandlers[T, TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GestureHandlers[T, TContext]]
  }
  
  extension [Self <: GestureHandlers[?, ?], T, TContext /* <: Context */](x: Self & (GestureHandlers[T, TContext])) {
    
    inline def setOnActive(value: (T, TContext) => Unit): Self = StObject.set(x, "onActive", js.Any.fromFunction2(value))
    
    inline def setOnActiveUndefined: Self = StObject.set(x, "onActive", js.undefined)
    
    inline def setOnCancel(value: (T, TContext) => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction2(value))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setOnEnd(value: (T, TContext) => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction2(value))
    
    inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
    
    inline def setOnFail(value: (T, TContext) => Unit): Self = StObject.set(x, "onFail", js.Any.fromFunction2(value))
    
    inline def setOnFailUndefined: Self = StObject.set(x, "onFail", js.undefined)
    
    inline def setOnFinish(value: (/* event */ T, /* context */ TContext, /* isCanceledOrFailed */ Boolean) => Unit): Self = StObject.set(x, "onFinish", js.Any.fromFunction3(value))
    
    inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
    
    inline def setOnStart(value: (T, TContext) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
    
    inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
  }
}
