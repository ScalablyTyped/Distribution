package typings.reactSpringCore.anon

import typings.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.SpringToFn
import typings.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.StartFn
import typings.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.StopFn
import typings.reactSpringCore.distDeclarationsSrcTypesPropsMod.SpringChain
import typings.reactSpringTypes.utilMod.NoInfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait To[State /* <: js.Object */] extends StObject {
  
  var from: State
  
  var to: js.UndefOr[SpringChain[NoInfer[State]] | SpringToFn[NoInfer[State]]] = js.undefined
}
object To {
  
  inline def apply[State /* <: js.Object */](from: State): To[State] = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[To[State]]
  }
  
  extension [Self <: To[?], State /* <: js.Object */](x: Self & To[State]) {
    
    inline def setFrom(value: State): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: SpringChain[NoInfer[State]] | SpringToFn[NoInfer[State]]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToFunction2(
      value: (/* start */ StartFn[NoInfer[State]], /* stop */ StopFn[NoInfer[State]]) => js.Promise[Any] | Unit
    ): Self = StObject.set(x, "to", js.Any.fromFunction2(value))
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setToVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: [T] extends [@react-spring/core.@react-spring/core/dist/declarations/src/types/common.IsPlainObject<T>] ? @react-spring/core.@react-spring/core/dist/declarations/src/types/props.ControllerUpdate<T, undefined> : @react-spring/core.@react-spring/core/dist/declarations/src/types/props.SpringTo<T> | @react-spring/core.@react-spring/core/dist/declarations/src/types/props.SpringUpdate<T> */ js.Any)*
    ): Self = StObject.set(x, "to", js.Array(value*))
  }
}
