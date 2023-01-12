package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerEventMap
  extends StObject
     with AbstractWorkerEventMap {
  
  /* standard dom */
  var message: MessageEvent[Any]
  
  /* standard dom */
  var messageerror: MessageEvent[Any]
}
object WorkerEventMap {
  
  inline def apply(error: ErrorEvent, message: MessageEvent[Any], messageerror: MessageEvent[Any]): WorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerEventMap] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: MessageEvent[Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageerror(value: MessageEvent[Any]): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
  }
}
