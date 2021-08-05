package typings.reactAsync.mod

import typings.reactAsync.anon.Dictmeta
import typings.reactAsync.reactAsyncBooleans.`true`
import typings.reactAsync.reactAsyncStrings.reject
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reject
  extends StObject
     with AbstractAction
     with AsyncAction[js.Any] {
  
  var error: `true`
  
  var payload: Error
  
  @JSName("type")
  var type_Reject: reject
}
object Reject {
  
  inline def apply(meta: Dictmeta, payload: Error): Reject = {
    val __obj = js.Dynamic.literal(error = true, meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("reject")
    __obj.asInstanceOf[Reject]
  }
  
  extension [Self <: Reject](x: Self) {
    
    inline def setError(value: `true`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: Error): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: reject): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
