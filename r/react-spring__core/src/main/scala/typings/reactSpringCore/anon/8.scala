package typings.reactSpringCore.anon

import typings.reactSpringCore.mod.GoalValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8`[T] extends StObject {
  
  var to: js.UndefOr[GoalValue[T]] = js.undefined
}
object `8` {
  
  inline def apply[T](): `8`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`8`[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `8`[?], T] (val x: Self & `8`[T]) extends AnyVal {
    
    inline def setTo(value: GoalValue[T]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
