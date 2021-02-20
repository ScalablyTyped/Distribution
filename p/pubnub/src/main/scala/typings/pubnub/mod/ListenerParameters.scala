package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// addListener
@js.native
trait ListenerParameters extends StObject {
  
  /**
    * deprecated: For objects v2, use objects.the objects listener
    */
  var membership: js.UndefOr[js.Function1[/* membershipEvent */ MembershipEvent, Unit]] = js.native
  
  var message: js.UndefOr[js.Function1[/* messageEvent */ MessageEvent, Unit]] = js.native
  
  var messageAction: js.UndefOr[js.Function1[/* messageActionEvent */ MessageActionEvent, Unit]] = js.native
  
  var objects: js.UndefOr[
    js.Function1[/* objectsEvent */ ObjectsEvent[ObjectCustom, ObjectCustom, ObjectCustom], Unit]
  ] = js.native
  
  var presence: js.UndefOr[js.Function1[/* presenceEvent */ PresenceEvent, Unit]] = js.native
  
  var signal: js.UndefOr[js.Function1[/* signalEvent */ SignalEvent, Unit]] = js.native
  
  /**
    * deprecated: For objects v2, use objects.the objects listener
    */
  var space: js.UndefOr[js.Function1[/* spaceEvent */ SpaceEvent, Unit]] = js.native
  
  var status: js.UndefOr[js.Function1[/* statusEvent */ StatusEvent, Unit]] = js.native
  
  /**
    * deprecated: For objects v2, use objects.the objects listener
    */
  var user: js.UndefOr[js.Function1[/* userEvent */ UserEvent, Unit]] = js.native
}
object ListenerParameters {
  
  @scala.inline
  def apply(): ListenerParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerParameters]
  }
  
  @scala.inline
  implicit class ListenerParametersMutableBuilder[Self <: ListenerParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembership(value: /* membershipEvent */ MembershipEvent => Unit): Self = StObject.set(x, "membership", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMembershipUndefined: Self = StObject.set(x, "membership", js.undefined)
    
    @scala.inline
    def setMessage(value: /* messageEvent */ MessageEvent => Unit): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMessageAction(value: /* messageActionEvent */ MessageActionEvent => Unit): Self = StObject.set(x, "messageAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMessageActionUndefined: Self = StObject.set(x, "messageAction", js.undefined)
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setObjects(value: /* objectsEvent */ ObjectsEvent[ObjectCustom, ObjectCustom, ObjectCustom] => Unit): Self = StObject.set(x, "objects", js.Any.fromFunction1(value))
    
    @scala.inline
    def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    @scala.inline
    def setPresence(value: /* presenceEvent */ PresenceEvent => Unit): Self = StObject.set(x, "presence", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPresenceUndefined: Self = StObject.set(x, "presence", js.undefined)
    
    @scala.inline
    def setSignal(value: /* signalEvent */ SignalEvent => Unit): Self = StObject.set(x, "signal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setSpace(value: /* spaceEvent */ SpaceEvent => Unit): Self = StObject.set(x, "space", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    @scala.inline
    def setStatus(value: /* statusEvent */ StatusEvent => Unit): Self = StObject.set(x, "status", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUser(value: /* userEvent */ UserEvent => Unit): Self = StObject.set(x, "user", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
