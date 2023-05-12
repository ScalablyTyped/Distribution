package typings.reactSpringCore.anon

import typings.reactSpringCore.mod.SpringChain
import typings.reactSpringTypes.mod.Falsy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`[State] extends StObject {
  
  var to: js.UndefOr[SpringChain[State] | Falsy] = js.undefined
}
object `6` {
  
  inline def apply[State](): `6`[State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`[State]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `6`[?], State] (val x: Self & `6`[State]) extends AnyVal {
    
    inline def setTo(value: SpringChain[State] | Falsy): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setToVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: [T] extends [@react-spring/core.@react-spring/core.IsPlainObject<T>] ? @react-spring/core.@react-spring/core.ControllerUpdate<T, undefined> : @react-spring/core.@react-spring/core.SpringTo<T> | @react-spring/core.@react-spring/core.SpringUpdate<T> */ js.Any)*
    ): Self = StObject.set(x, "to", js.Array(value*))
  }
}
