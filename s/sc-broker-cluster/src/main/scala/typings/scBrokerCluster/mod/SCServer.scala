package typings.scBrokerCluster.mod

import typings.socketclusterServer.serverMod.CodecEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCServer extends js.Object {
  var codec: CodecEngine
}

object SCServer {
  @scala.inline
  def apply(codec: CodecEngine): SCServer = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SCServer]
  }
}

