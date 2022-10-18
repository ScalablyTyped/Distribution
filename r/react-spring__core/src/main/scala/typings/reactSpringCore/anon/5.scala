package typings.reactSpringCore.anon

import typings.reactSpringCore.distDeclarationsSrcTypesPropsMod.GoalValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`[T] extends StObject {
  
  var to: js.UndefOr[GoalValue[T]] = js.undefined
}
object `5` {
  
  inline def apply[T](): `5`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`5`[T]]
  }
  
  extension [Self <: `5`[?], T](x: Self & `5`[T]) {
    
    inline def setTo(value: GoalValue[T]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
