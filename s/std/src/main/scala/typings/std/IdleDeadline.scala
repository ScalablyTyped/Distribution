package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IdleDeadline) */
trait IdleDeadline extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IdleDeadline/didTimeout) */
  /* standard dom */
  val didTimeout: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/IdleDeadline/timeRemaining) */
  /* standard dom */
  def timeRemaining(): DOMHighResTimeStamp
}
object IdleDeadline {
  
  inline def apply(didTimeout: scala.Boolean, timeRemaining: () => DOMHighResTimeStamp): IdleDeadline = {
    val __obj = js.Dynamic.literal(didTimeout = didTimeout.asInstanceOf[js.Any], timeRemaining = js.Any.fromFunction0(timeRemaining))
    __obj.asInstanceOf[IdleDeadline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdleDeadline] (val x: Self) extends AnyVal {
    
    inline def setDidTimeout(value: scala.Boolean): Self = StObject.set(x, "didTimeout", value.asInstanceOf[js.Any])
    
    inline def setTimeRemaining(value: () => DOMHighResTimeStamp): Self = StObject.set(x, "timeRemaining", js.Any.fromFunction0(value))
  }
}
