package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerEventMap
  extends StObject
     with AbstractWorkerEventMap {
  
  var message: MessageEvent[js.Any]
  
  var messageerror: MessageEvent[js.Any]
}
object WorkerEventMap {
  
  @scala.inline
  def apply(error: ErrorEvent, message: MessageEvent[js.Any], messageerror: MessageEvent[js.Any]): WorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerEventMap]
  }
  
  @scala.inline
  implicit class WorkerEventMapMutableBuilder[Self <: WorkerEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: MessageEvent[js.Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageerror(value: MessageEvent[js.Any]): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
  }
}
