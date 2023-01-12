package typings.reactSpringCore.anon

import typings.reactSpringCore.distDeclarationsSrcTypesPropsMod.SpringChain
import typings.reactSpringTypes.utilMod.Falsy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`[State] extends StObject {
  
  var to: js.UndefOr[SpringChain[State] | Falsy] = js.undefined
}
object `4` {
  
  inline def apply[State](): `4`[State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`[State]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `4`[?], State] (val x: Self & `4`[State]) extends AnyVal {
    
    inline def setTo(value: SpringChain[State] | Falsy): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setToVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: [T] extends [@react-spring/core.@react-spring/core/dist/declarations/src/types/common.IsPlainObject<T>] ? @react-spring/core.@react-spring/core/dist/declarations/src/types/props.ControllerUpdate<T, undefined> : @react-spring/core.@react-spring/core/dist/declarations/src/types/props.SpringTo<T> | @react-spring/core.@react-spring/core/dist/declarations/src/types/props.SpringUpdate<T> */ js.Any)*
    ): Self = StObject.set(x, "to", js.Array(value*))
  }
}
