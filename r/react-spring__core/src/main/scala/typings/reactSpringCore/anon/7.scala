package typings.reactSpringCore.anon

import typings.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.SpringToFn
import typings.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.StartFn
import typings.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.StopFn
import typings.reactSpringCore.distDeclarationsSrcTypesPropsMod.GoalProp
import typings.reactSpringCore.distDeclarationsSrcTypesPropsMod.SpringChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7`[T] extends StObject {
  
  var to: js.UndefOr[GoalProp[T] | SpringToFn[T] | SpringChain[T]] = js.undefined
}
object `7` {
  
  inline def apply[T](): `7`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`7`[T]]
  }
  
  extension [Self <: `7`[?], T](x: Self & `7`[T]) {
    
    inline def setTo(value: GoalProp[T] | SpringToFn[T] | SpringChain[T]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToFunction2(value: (/* start */ StartFn[T], /* stop */ StopFn[T]) => js.Promise[Any] | Unit): Self = StObject.set(x, "to", js.Any.fromFunction2(value))
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setToVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: [T] extends [@react-spring/core.@react-spring/core/dist/declarations/src/types/common.IsPlainObject<T>] ? @react-spring/core.@react-spring/core/dist/declarations/src/types/props.ControllerUpdate<T, undefined> : @react-spring/core.@react-spring/core/dist/declarations/src/types/props.SpringTo<T> | @react-spring/core.@react-spring/core/dist/declarations/src/types/props.SpringUpdate<T> */ js.Any)*
    ): Self = StObject.set(x, "to", js.Array(value*))
  }
}
