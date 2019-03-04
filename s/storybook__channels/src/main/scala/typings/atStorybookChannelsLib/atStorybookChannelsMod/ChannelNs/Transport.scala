package typings
package atStorybookChannelsLib.atStorybookChannelsMod.ChannelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends js.Object {
  def send(event: js.Any): scala.Unit
  def setHandler(handler: atStorybookChannelsLib.EventHandler): scala.Unit
}

object Transport {
  @scala.inline
  def apply(
    send: js.Function1[js.Any, scala.Unit],
    setHandler: js.Function1[atStorybookChannelsLib.EventHandler, scala.Unit]
  ): Transport = {
    val __obj = js.Dynamic.literal(send = send, setHandler = setHandler)
  
    __obj.asInstanceOf[Transport]
  }
}

