package typings.reactSpringCore.anon

import typings.reactSpringCore.mod.GoalProp
import typings.reactSpringCore.mod.SpringChain
import typings.reactSpringCore.mod.SpringToFn
import typings.reactSpringCore.mod.StartFn
import typings.reactSpringCore.mod.StopFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[T] extends StObject {
  
  var to: js.UndefOr[GoalProp[T] | SpringToFn[T] | SpringChain[T]] = js.undefined
}
object `0` {
  
  inline def apply[T](): `0`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`[?], T] (val x: Self & `0`[T]) extends AnyVal {
    
    inline def setTo(value: GoalProp[T] | SpringToFn[T] | SpringChain[T]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToFunction2(value: (/* start */ StartFn[T], /* stop */ StopFn[T]) => js.Promise[Any] | Unit): Self = StObject.set(x, "to", js.Any.fromFunction2(value))
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setToVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: [T] extends [@react-spring/core.@react-spring/core.IsPlainObject<T>] ? @react-spring/core.@react-spring/core.ControllerUpdate<T, undefined> : @react-spring/core.@react-spring/core.SpringTo<T> | @react-spring/core.@react-spring/core.SpringUpdate<T> */ js.Any)*
    ): Self = StObject.set(x, "to", js.Array(value*))
  }
}
