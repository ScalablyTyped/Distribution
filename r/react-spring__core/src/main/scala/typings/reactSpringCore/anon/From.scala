package typings.reactSpringCore.anon

import typings.reactSpringCore.mod.SpringChain
import typings.reactSpringCore.mod.SpringToFn
import typings.reactSpringCore.mod.StartFn
import typings.reactSpringCore.mod.StopFn
import typings.reactSpringTypes.mod.NoInfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From[State /* <: js.Object */] extends StObject {
  
  var from: State
  
  var to: js.UndefOr[SpringChain[NoInfer[State]] | SpringToFn[NoInfer[State]]] = js.undefined
}
object From {
  
  inline def apply[State /* <: js.Object */](from: State): From[State] = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[From[State]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: From[?], State /* <: js.Object */] (val x: Self & From[State]) extends AnyVal {
    
    inline def setFrom(value: State): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: SpringChain[NoInfer[State]] | SpringToFn[NoInfer[State]]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToFunction2(
      value: (/* start */ StartFn[NoInfer[State]], /* stop */ StopFn[NoInfer[State]]) => js.Promise[Any] | Unit
    ): Self = StObject.set(x, "to", js.Any.fromFunction2(value))
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setToVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: [T] extends [@react-spring/core.@react-spring/core.IsPlainObject<T>] ? @react-spring/core.@react-spring/core.ControllerUpdate<T, undefined> : @react-spring/core.@react-spring/core.SpringTo<T> | @react-spring/core.@react-spring/core.SpringUpdate<T> */ js.Any)*
    ): Self = StObject.set(x, "to", js.Array(value*))
  }
}
