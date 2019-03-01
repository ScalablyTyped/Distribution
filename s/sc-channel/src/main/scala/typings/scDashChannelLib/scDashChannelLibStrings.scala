package typings
package scDashChannelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object scDashChannelLibStrings {
  @js.native
  sealed trait pending
    extends scDashChannelLib.scDashChannelMod.ChannelState
  
  @js.native
  sealed trait subscribed
    extends scDashChannelLib.scDashChannelMod.ChannelState
  
  @js.native
  sealed trait unsubscribed
    extends scDashChannelLib.scDashChannelMod.ChannelState
  
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def subscribed: subscribed = "subscribed".asInstanceOf[subscribed]
  @scala.inline
  def unsubscribed: unsubscribed = "unsubscribed".asInstanceOf[unsubscribed]
}

