package typings.skywayJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RTCPeerConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("skyway-js", "SfuRoom")
@js.native
open class SfuRoom () extends Room {
  
  def getPeerConnection(): RTCPeerConnection | Null = js.native
  
  var members: js.Array[String] = js.native
  
  var remoteStreams: StringDictionary[RoomStream] = js.native
}
