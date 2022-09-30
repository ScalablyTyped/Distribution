package typings.reactNativeReanimated.anon

import typings.react.mod.MutableRefObject
import typings.reactNativeReanimated.setAndForwardRefMod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetForwardedRef[T] extends StObject {
  
  var getForwardedRef: ForwardedRef[T]
  
  def setLocalRef(ref: T): Unit
}
object GetForwardedRef {
  
  inline def apply[T](getForwardedRef: () => MutableRefObject[T] | (js.Function1[T, Unit]), setLocalRef: T => Unit): GetForwardedRef[T] = {
    val __obj = js.Dynamic.literal(getForwardedRef = js.Any.fromFunction0(getForwardedRef), setLocalRef = js.Any.fromFunction1(setLocalRef))
    __obj.asInstanceOf[GetForwardedRef[T]]
  }
  
  extension [Self <: GetForwardedRef[?], T](x: Self & GetForwardedRef[T]) {
    
    inline def setGetForwardedRef(value: () => MutableRefObject[T] | (js.Function1[T, Unit])): Self = StObject.set(x, "getForwardedRef", js.Any.fromFunction0(value))
    
    inline def setSetLocalRef(value: T => Unit): Self = StObject.set(x, "setLocalRef", js.Any.fromFunction1(value))
  }
}
