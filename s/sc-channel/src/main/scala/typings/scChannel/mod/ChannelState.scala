package typings.scChannel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.scChannel.scChannelStrings.pending
  - typings.scChannel.scChannelStrings.subscribed
  - typings.scChannel.scChannelStrings.unsubscribed
*/
trait ChannelState extends js.Object

object ChannelState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def pending: typings.scChannel.scChannelStrings.pending = this.cast("pending")
  @scala.inline
  def subscribed: typings.scChannel.scChannelStrings.subscribed = this.cast("subscribed")
  @scala.inline
  def unsubscribed: typings.scChannel.scChannelStrings.unsubscribed = this.cast("unsubscribed")
}

