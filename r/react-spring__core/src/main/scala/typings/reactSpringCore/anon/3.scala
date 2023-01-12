package typings.reactSpringCore.anon

import typings.reactSpringCore.distDeclarationsSrcControllerMod.Controller
import typings.reactSpringCore.distDeclarationsSrcSpringValueMod.SpringValue
import typings.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.SpringToFn
import typings.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.StartFn
import typings.reactSpringCore.distDeclarationsSrcTypesFunctionsMod.StopFn
import typings.reactSpringTypes.utilMod.Falsy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`[T /* <: SpringValue[Any] | Controller[Any] */] extends StObject {
  
  var to: js.UndefOr[SpringToFn[T] | Falsy] = js.undefined
}
object `3` {
  
  inline def apply[T /* <: SpringValue[Any] | Controller[Any] */](): `3`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`[?], T /* <: SpringValue[Any] | Controller[Any] */] (val x: Self & `3`[T]) extends AnyVal {
    
    inline def setTo(value: SpringToFn[T] | Falsy): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToFunction2(value: (/* start */ StartFn[T], /* stop */ StopFn[T]) => js.Promise[Any] | Unit): Self = StObject.set(x, "to", js.Any.fromFunction2(value))
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
