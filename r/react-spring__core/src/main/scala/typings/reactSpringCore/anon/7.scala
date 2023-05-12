package typings.reactSpringCore.anon

import typings.reactSpringCore.mod.GoalValues
import typings.reactSpringTypes.mod.Falsy
import typings.reactSpringTypes.mod.Lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7`[State /* <: Lookup[Any] */] extends StObject {
  
  var to: js.UndefOr[GoalValues[State] | Falsy] = js.undefined
}
object `7` {
  
  inline def apply[State /* <: Lookup[Any] */](): `7`[State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`7`[State]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `7`[?], State /* <: Lookup[Any] */] (val x: Self & `7`[State]) extends AnyVal {
    
    inline def setTo(value: GoalValues[State] | Falsy): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
