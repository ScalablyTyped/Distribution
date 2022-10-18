package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sharedb/lib/sharedb", "LocalPresence")
@js.native
open class LocalPresence[T] () extends TypedEmitter[LocalPresenceEventMap] {
  
  var connection: String = js.native
  
  def destroy(): Unit = js.native
  def destroy(callback: Callback): Unit = js.native
  
  var presence: Presence[T] = js.native
  
  var presenceId: String = js.native
  
  var presenceVersion: Double = js.native
  
  def send(): Unit = js.native
  def send(callback: Callback): Unit = js.native
  
  def submit(value: T): Unit = js.native
  def submit(value: T, callback: Callback): Unit = js.native
  
  var value: T = js.native
}
