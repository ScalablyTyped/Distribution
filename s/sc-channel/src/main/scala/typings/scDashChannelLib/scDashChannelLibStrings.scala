package typings
package scDashChannelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object scDashChannelLibStrings {
  @js.native
  sealed trait pending extends js.Object
  
  @js.native
  sealed trait subscribed extends js.Object
  
  @js.native
  sealed trait unsubscribed extends js.Object
  
  def pending: pending = "pending".asInstanceOf[pending]
  def subscribed: subscribed = "subscribed".asInstanceOf[subscribed]
  def unsubscribed: unsubscribed = "unsubscribed".asInstanceOf[unsubscribed]
}

