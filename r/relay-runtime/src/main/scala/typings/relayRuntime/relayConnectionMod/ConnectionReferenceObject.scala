package typings.relayRuntime.relayConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionReferenceObject[TEdge] extends js.Object {
  var __connection: ConnectionReference[TEdge]
}

object ConnectionReferenceObject {
  @scala.inline
  def apply[TEdge](__connection: ConnectionReference[TEdge]): ConnectionReferenceObject[TEdge] = {
    val __obj = js.Dynamic.literal(__connection = __connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionReferenceObject[TEdge]]
  }
}

