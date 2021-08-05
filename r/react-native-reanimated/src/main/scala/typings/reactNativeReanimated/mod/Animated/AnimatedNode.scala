package typings.reactNativeReanimated.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedNode[T] extends StObject {
  
  /**
    * ' __value' is not available at runtime on AnimatedNode<T>. It is
    * necessary to have some discriminating property on a type to know that
    * an AnimatedNode<number> and AnimatedNode<string> are not compatible types.
    */
  @JSName(" __value")
  var Space__value: T
  
  def isNativelyInitialized(): Boolean
}
object AnimatedNode {
  
  inline def apply[T](Space__value: T, isNativelyInitialized: () => Boolean): AnimatedNode[T] = {
    val __obj = js.Dynamic.literal(isNativelyInitialized = js.Any.fromFunction0(isNativelyInitialized))
    __obj.updateDynamic(" __value")(Space__value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedNode[T]]
  }
  
  extension [Self <: AnimatedNode[?], T](x: Self & AnimatedNode[T]) {
    
    inline def setIsNativelyInitialized(value: () => Boolean): Self = StObject.set(x, "isNativelyInitialized", js.Any.fromFunction0(value))
    
    inline def setSpace__value(value: T): Self = StObject.set(x, " __value", value.asInstanceOf[js.Any])
  }
}
