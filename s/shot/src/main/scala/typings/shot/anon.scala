package typings.shot

import typings.shot.mod.SimulatedRequestObject
import typings.shot.mod.SimulatedResponseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Close extends StObject {
    
    /** whether the request will emit a close event. Defaults to undefined, meaning no close event will be emitted. */
    var close: js.UndefOr[Boolean] = js.undefined
    
    /** indicates whether the request will fire an end event. Defaults to undefined, meaning an end event will fire. */
    var end: js.UndefOr[Boolean] = js.undefined
    
    /** whether the request will emit an error event. Defaults to undefined, meaning no error event will be emitted. If set to true, the emitted error will have a message of 'Simulated'. */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /** indicates whether the request payload will be split into chunks. Defaults to `undefined`, meaning payload will not be chunked. */
    var split: js.UndefOr[Boolean] = js.undefined
  }
  object Close {
    
    inline def apply(): Close = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Close]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
      
      inline def setClose(value: Boolean): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setSplit(value: Boolean): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    }
  }
  
  trait Req extends StObject {
    
    /** the simulated request object. */
    var req: SimulatedRequestObject
    
    /** the simulated response object. */
    var res: SimulatedResponseObject
  }
  object Req {
    
    inline def apply(req: SimulatedRequestObject, res: SimulatedResponseObject): Req = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[Req]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Req] (val x: Self) extends AnyVal {
      
      inline def setReq(value: SimulatedRequestObject): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setRes(value: SimulatedResponseObject): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
}
