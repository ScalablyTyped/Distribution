package typings.reactSpringCore.anon

import typings.reactSpringCore.mod.Controller
import typings.reactSpringCore.mod.SpringToFn
import typings.reactSpringCore.mod.SpringValue
import typings.reactSpringCore.mod.StartFn
import typings.reactSpringCore.mod.StopFn
import typings.reactSpringTypes.mod.Falsy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`[T /* <: SpringValue[Any] | Controller[Any] */] extends StObject {
  
  var to: js.UndefOr[SpringToFn[T] | Falsy] = js.undefined
}
object `5` {
  
  inline def apply[T /* <: SpringValue[Any] | Controller[Any] */](): `5`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `5`[?], T /* <: SpringValue[Any] | Controller[Any] */] (val x: Self & `5`[T]) extends AnyVal {
    
    inline def setTo(value: SpringToFn[T] | Falsy): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToFunction2(value: (/* start */ StartFn[T], /* stop */ StopFn[T]) => js.Promise[Any] | Unit): Self = StObject.set(x, "to", js.Any.fromFunction2(value))
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
