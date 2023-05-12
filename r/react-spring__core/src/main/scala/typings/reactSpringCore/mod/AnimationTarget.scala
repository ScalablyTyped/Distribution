package typings.reactSpringCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @internal */
trait AnimationTarget[T]
  extends StObject
     with Readable[T] {
  
  var item: js.UndefOr[scala.Any] = js.undefined
  
  def start(props: scala.Any): js.Promise[AnimationResult[this.type]]
  
  var stop: js.Function
}
object AnimationTarget {
  
  inline def apply[T](
    get: () => T,
    start: scala.Any => js.Promise[AnimationResult[AnimationTarget[T]]],
    stop: js.Function
  ): AnimationTarget[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), start = js.Any.fromFunction1(start), stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTarget[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationTarget[?], T] (val x: Self & AnimationTarget[T]) extends AnyVal {
    
    inline def setItem(value: scala.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setStart(value: scala.Any => js.Promise[AnimationResult[AnimationTarget[T]]]): Self = StObject.set(x, "start", js.Any.fromFunction1(value))
    
    inline def setStop(value: js.Function): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
  }
}
