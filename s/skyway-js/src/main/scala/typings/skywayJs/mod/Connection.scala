package typings.skywayJs.mod

import typings.events.mod.EventEmitter
import typings.std.RTCPeerConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends EventEmitter {
  
  def close(): Unit = js.native
  def close(forceClose: Boolean): Unit = js.native
  
  def getPeerConnection(): RTCPeerConnection | Null = js.native
  
  var id: String = js.native
  
  var metadata: Any = js.native
  
  var open: Boolean = js.native
  
  var remoteId: String = js.native
  
  var `type`: String = js.native
}
