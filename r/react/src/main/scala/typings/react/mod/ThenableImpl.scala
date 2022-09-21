package typings.react.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThenableImpl[T] extends StObject {
  
  def `then`(onFulfill: js.Function1[/* value */ T, Any], onReject: js.Function1[/* error */ Any, Any]): Unit | js.Thenable[Any]
}
object ThenableImpl {
  
  inline def apply[T](
    `then`: (js.Function1[/* value */ T, Any], js.Function1[/* error */ Any, Any]) => Unit | js.Thenable[Any]
  ): ThenableImpl[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[ThenableImpl[T]]
  }
  
  extension [Self <: ThenableImpl[?], T](x: Self & ThenableImpl[T]) {
    
    inline def setThen(
      value: (js.Function1[/* value */ T, Any], js.Function1[/* error */ Any, Any]) => Unit | js.Thenable[Any]
    ): Self = StObject.set(x, "then", js.Any.fromFunction2(value))
  }
}
