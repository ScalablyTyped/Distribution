package typings.storybookRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A change to the current location that was blocked. May be retried
  * after obtaining user confirmation.
  */
trait Transition
  extends StObject
     with Update {
  
  /**
    * Retries the update to the current location.
    */
  def retry(): Unit
}
object Transition {
  
  inline def apply(action: Action, location: Location1, retry: () => Unit): Transition = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], retry = js.Any.fromFunction0(retry))
    __obj.asInstanceOf[Transition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transition] (val x: Self) extends AnyVal {
    
    inline def setRetry(value: () => Unit): Self = StObject.set(x, "retry", js.Any.fromFunction0(value))
  }
}
