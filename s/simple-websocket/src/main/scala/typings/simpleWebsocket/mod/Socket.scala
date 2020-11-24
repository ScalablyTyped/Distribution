package typings.simpleWebsocket.mod

import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Socket extends Duplex {
  
  /** Send text/binary data to the WebSocket server */
  def send(chunk: js.Any): Unit = js.native
}
