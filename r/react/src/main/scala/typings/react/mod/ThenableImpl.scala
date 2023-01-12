package typings.react.mod

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThenableImpl[T] extends StObject {
  
  def `then`(onFulfill: js.Function1[/* value */ T, Any], onReject: js.Function1[/* error */ Any, Any]): Unit | PromiseLike[Any]
}
object ThenableImpl {
  
  inline def apply[T](
    `then`: (js.Function1[/* value */ T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
  ): ThenableImpl[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[ThenableImpl[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThenableImpl[?], T] (val x: Self & ThenableImpl[T]) extends AnyVal {
    
    inline def setThen(
      value: (js.Function1[/* value */ T, Any], js.Function1[/* error */ Any, Any]) => Unit | PromiseLike[Any]
    ): Self = StObject.set(x, "then", js.Any.fromFunction2(value))
  }
}
