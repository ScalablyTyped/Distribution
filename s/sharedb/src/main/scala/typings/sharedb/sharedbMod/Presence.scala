package typings.sharedb.sharedbMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sharedb/lib/sharedb", "Presence")
@js.native
open class Presence[T] () extends TypedEmitter[PresenceEventMap[T]] {
  
  var channel: String = js.native
  
  var connection: String = js.native
  
  def create(): LocalPresence[T] = js.native
  def create(id: String): LocalPresence[T] = js.native
  
  def destroy(): Unit = js.native
  def destroy(callback: Callback): Unit = js.native
  
  var localPresences: Record[String, LocalPresence[T]] = js.native
  
  var remotePresences: Record[String, T] = js.native
  
  def subscribe(): Unit = js.native
  def subscribe(callback: Callback): Unit = js.native
  
  var subscribed: Boolean = js.native
  
  def unsubscribe(): Unit = js.native
  def unsubscribe(callback: Callback): Unit = js.native
  
  var wantSubscribe: Boolean = js.native
}
