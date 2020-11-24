package typings.storybookChannels.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelTransport extends js.Object {
  
  def send(event: ChannelEvent): Unit = js.native
  def send(event: ChannelEvent, options: js.Any): Unit = js.native
  
  def setHandler(handler: ChannelHandler): Unit = js.native
}
