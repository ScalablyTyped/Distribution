package typings.sentryReplay.typesTypesMod

import typings.sentryReplay.sentryReplayStrings.addEvent
import typings.sentryReplay.sentryReplayStrings.clear
import typings.sentryReplay.sentryReplayStrings.finish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerRequest extends StObject {
  
  var arg: js.UndefOr[String] = js.undefined
  
  var id: Double
  
  var method: clear | addEvent | finish
}
object WorkerRequest {
  
  inline def apply(id: Double, method: clear | addEvent | finish): WorkerRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerRequest] (val x: Self) extends AnyVal {
    
    inline def setArg(value: String): Self = StObject.set(x, "arg", value.asInstanceOf[js.Any])
    
    inline def setArgUndefined: Self = StObject.set(x, "arg", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: clear | addEvent | finish): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
