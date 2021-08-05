package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// addListener
trait ListenerParameters extends StObject {
  
  /**
    * deprecated: For objects v2, use objects.the objects listener
    */
  var membership: js.UndefOr[js.Function1[/* membershipEvent */ MembershipEvent, Unit]] = js.undefined
  
  var message: js.UndefOr[js.Function1[/* messageEvent */ MessageEvent, Unit]] = js.undefined
  
  var messageAction: js.UndefOr[js.Function1[/* messageActionEvent */ MessageActionEvent, Unit]] = js.undefined
  
  var objects: js.UndefOr[
    js.Function1[/* objectsEvent */ ObjectsEvent[ObjectCustom, ObjectCustom, ObjectCustom], Unit]
  ] = js.undefined
  
  var presence: js.UndefOr[js.Function1[/* presenceEvent */ PresenceEvent, Unit]] = js.undefined
  
  var signal: js.UndefOr[js.Function1[/* signalEvent */ SignalEvent, Unit]] = js.undefined
  
  /**
    * deprecated: For objects v2, use objects.the objects listener
    */
  var space: js.UndefOr[js.Function1[/* spaceEvent */ SpaceEvent, Unit]] = js.undefined
  
  var status: js.UndefOr[js.Function1[/* statusEvent */ StatusEvent, Unit]] = js.undefined
  
  /**
    * deprecated: For objects v2, use objects.the objects listener
    */
  var user: js.UndefOr[js.Function1[/* userEvent */ UserEvent, Unit]] = js.undefined
}
object ListenerParameters {
  
  inline def apply(): ListenerParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerParameters]
  }
  
  extension [Self <: ListenerParameters](x: Self) {
    
    inline def setMembership(value: /* membershipEvent */ MembershipEvent => Unit): Self = StObject.set(x, "membership", js.Any.fromFunction1(value))
    
    inline def setMembershipUndefined: Self = StObject.set(x, "membership", js.undefined)
    
    inline def setMessage(value: /* messageEvent */ MessageEvent => Unit): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    inline def setMessageAction(value: /* messageActionEvent */ MessageActionEvent => Unit): Self = StObject.set(x, "messageAction", js.Any.fromFunction1(value))
    
    inline def setMessageActionUndefined: Self = StObject.set(x, "messageAction", js.undefined)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setObjects(value: /* objectsEvent */ ObjectsEvent[ObjectCustom, ObjectCustom, ObjectCustom] => Unit): Self = StObject.set(x, "objects", js.Any.fromFunction1(value))
    
    inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    inline def setPresence(value: /* presenceEvent */ PresenceEvent => Unit): Self = StObject.set(x, "presence", js.Any.fromFunction1(value))
    
    inline def setPresenceUndefined: Self = StObject.set(x, "presence", js.undefined)
    
    inline def setSignal(value: /* signalEvent */ SignalEvent => Unit): Self = StObject.set(x, "signal", js.Any.fromFunction1(value))
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSpace(value: /* spaceEvent */ SpaceEvent => Unit): Self = StObject.set(x, "space", js.Any.fromFunction1(value))
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    inline def setStatus(value: /* statusEvent */ StatusEvent => Unit): Self = StObject.set(x, "status", js.Any.fromFunction1(value))
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setUser(value: /* userEvent */ UserEvent => Unit): Self = StObject.set(x, "user", js.Any.fromFunction1(value))
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
