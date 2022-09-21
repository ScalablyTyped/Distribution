package typings.skywayJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RTCPeerConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("skyway-js", "MeshRoom")
@js.native
open class MeshRoom () extends Room {
  
  var connections: StringDictionary[js.Array[DataConnection | MediaConnection]] = js.native
  
  def getPeerConnections(): StringDictionary[RTCPeerConnection] = js.native
}
