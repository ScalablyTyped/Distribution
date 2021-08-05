package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionId extends StObject {
  
  var sessionId: js.UndefOr[String] = js.undefined
}
object SessionId {
  
  inline def apply(): SessionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionId]
  }
  
  extension [Self <: SessionId](x: Self) {
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
