package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerEventMap extends AbstractWorkerEventMap {
  
  var message: MessageEvent[_] = js.native
  
  var messageerror: MessageEvent[_] = js.native
}
object WorkerEventMap {
  
  @scala.inline
  def apply(error: ErrorEvent, message: MessageEvent[_], messageerror: MessageEvent[_]): WorkerEventMap = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], messageerror = messageerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerEventMap]
  }
  
  @scala.inline
  implicit class WorkerEventMapMutableBuilder[Self <: WorkerEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: MessageEvent[_]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageerror(value: MessageEvent[_]): Self = StObject.set(x, "messageerror", value.asInstanceOf[js.Any])
  }
}
