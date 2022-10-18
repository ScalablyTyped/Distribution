package typings.reactSpringCore.anon

import typings.reactSpringCore.distDeclarationsSrcTypesPropsMod.GoalValues
import typings.reactSpringTypes.utilMod.Falsy
import typings.reactSpringTypes.utilMod.Lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6`[State /* <: Lookup[Any] */] extends StObject {
  
  var to: js.UndefOr[GoalValues[State] | Falsy] = js.undefined
}
object `6` {
  
  inline def apply[State /* <: Lookup[Any] */](): `6`[State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`[State]]
  }
  
  extension [Self <: `6`[?], State /* <: Lookup[Any] */](x: Self & `6`[State]) {
    
    inline def setTo(value: GoalValues[State] | Falsy): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
