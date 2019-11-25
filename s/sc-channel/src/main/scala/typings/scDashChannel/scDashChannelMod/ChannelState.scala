package typings.scDashChannel.scDashChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.scDashChannel.scDashChannelStrings.pending
  - typings.scDashChannel.scDashChannelStrings.subscribed
  - typings.scDashChannel.scDashChannelStrings.unsubscribed
*/
trait ChannelState extends js.Object

object ChannelState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pending: typings.scDashChannel.scDashChannelStrings.pending = this.cast("pending")
  @scala.inline
  def subscribed: typings.scDashChannel.scDashChannelStrings.subscribed = this.cast("subscribed")
  @scala.inline
  def unsubscribed: typings.scDashChannel.scDashChannelStrings.unsubscribed = this.cast("unsubscribed")
}

