package typings.smithyTypes.distTypesMiddlewareMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pluggable[Input /* <: js.Object */, Output /* <: js.Object */] extends StObject {
  
  /**
    * A function that mutate the passed in middleware stack. Functions implementing
    * this interface can add, remove, modify existing middleware stack from clients
    * or commands
    */
  def applyToStack(stack: MiddlewareStack[Input, Output]): Unit
}
object Pluggable {
  
  inline def apply[Input /* <: js.Object */, Output /* <: js.Object */](applyToStack: MiddlewareStack[Input, Output] => Unit): Pluggable[Input, Output] = {
    val __obj = js.Dynamic.literal(applyToStack = js.Any.fromFunction1(applyToStack))
    __obj.asInstanceOf[Pluggable[Input, Output]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pluggable[?, ?], Input /* <: js.Object */, Output /* <: js.Object */] (val x: Self & (Pluggable[Input, Output])) extends AnyVal {
    
    inline def setApplyToStack(value: MiddlewareStack[Input, Output] => Unit): Self = StObject.set(x, "applyToStack", js.Any.fromFunction1(value))
  }
}
