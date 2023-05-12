package typings.sentryReplay.anon

import typings.sentryCore.mod.Scope
import typings.sentryTypes.typesReplayMod.ReplayEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Client extends StObject {
  
  var client: ClientClientOptionsBaseTr
  
  var event: ReplayEvent
  
  var replayId: String
  
  var scope: Scope
}
object Client {
  
  inline def apply(client: ClientClientOptionsBaseTr, event: ReplayEvent, replayId: String, scope: Scope): Client = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], replayId = replayId.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Client] (val x: Self) extends AnyVal {
    
    inline def setClient(value: ClientClientOptionsBaseTr): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: ReplayEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setReplayId(value: String): Self = StObject.set(x, "replayId", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Scope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
