package typings.smartFoxServer.global.SFS2X.Requests

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.Requests.MessageRecipientMode")
@js.native
class MessageRecipientMode protected ()
  extends StObject
     with typings.smartFoxServer.SFS2X.Requests.MessageRecipientMode {
  /**
    * Creates a new MessageRecipientMode instance.
    * @param {number} mode   One of the costants contained in this class, describing the recipient mode.
    * @param {any}    target The moderator/administrator message recipient/s, according to the selected recipient mode.
    */
  def this(mode: Double, target: js.Any) = this()
  
  /** @type {number} Returns the selected recipient mode. */
  /* CompleteClass */
  var mode: Double = js.native
  
  /** @type {any} Returns the moderator/administrator message target, according to the selected recipient mode. */
  /* CompleteClass */
  var target: js.Any = js.native
}
/* static members */
object MessageRecipientMode {
  
  @JSGlobal("SFS2X.Requests.MessageRecipientMode")
  @js.native
  val ^ : js.Any = js.native
  
  /** @type {number} The moderator/administrator message will be sent to all the clients who subscribed a specific Room Group. */
  @JSGlobal("SFS2X.Requests.MessageRecipientMode.TO_GROUP")
  @js.native
  def TO_GROUP: Double = js.native
  @scala.inline
  def TO_GROUP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TO_GROUP")(x.asInstanceOf[js.Any])
  
  /** @type {number} The moderator/administrator message will be sent to all the users in a specific Room. */
  @JSGlobal("SFS2X.Requests.MessageRecipientMode.TO_ROOM")
  @js.native
  def TO_ROOM: Double = js.native
  @scala.inline
  def TO_ROOM_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TO_ROOM")(x.asInstanceOf[js.Any])
  
  /** @type {number} The moderator/administrator message will be sent to a specific user. */
  @JSGlobal("SFS2X.Requests.MessageRecipientMode.TO_USER")
  @js.native
  def TO_USER: Double = js.native
  @scala.inline
  def TO_USER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TO_USER")(x.asInstanceOf[js.Any])
  
  /** @type {number} The moderator/administrator message will be sent to all the users in the Zone. */
  @JSGlobal("SFS2X.Requests.MessageRecipientMode.TO_ZONE")
  @js.native
  def TO_ZONE: Double = js.native
  @scala.inline
  def TO_ZONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TO_ZONE")(x.asInstanceOf[js.Any])
}
