package typings.pubnub.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// addListener
@js.native
trait ListenerParameters extends js.Object {
  
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
  implicit class ListenerParametersOps[Self <: ListenerParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMembership(value: /* membershipEvent */ MembershipEvent => Unit): Self = this.set("membership", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMembership: Self = this.set("membership", js.undefined)
    
    @scala.inline
    def setMessage(value: /* messageEvent */ MessageEvent => Unit): Self = this.set("message", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMessageAction(value: /* messageActionEvent */ MessageActionEvent => Unit): Self = this.set("messageAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMessageAction: Self = this.set("messageAction", js.undefined)
    
    @scala.inline
    def setObjects(value: /* objectsEvent */ ObjectsEvent[ObjectCustom, ObjectCustom, ObjectCustom] => Unit): Self = this.set("objects", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteObjects: Self = this.set("objects", js.undefined)
    
    @scala.inline
    def setPresence(value: /* presenceEvent */ PresenceEvent => Unit): Self = this.set("presence", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePresence: Self = this.set("presence", js.undefined)
    
    @scala.inline
    def setSignal(value: /* signalEvent */ SignalEvent => Unit): Self = this.set("signal", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    
    @scala.inline
    def setSpace(value: /* spaceEvent */ SpaceEvent => Unit): Self = this.set("space", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
    
    @scala.inline
    def setStatus(value: /* statusEvent */ StatusEvent => Unit): Self = this.set("status", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUser(value: /* userEvent */ UserEvent => Unit): Self = this.set("user", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
