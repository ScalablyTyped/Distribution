package typings.scChannel

import typings.scChannel.mod.ChannelState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scChannelStrings {
  
  @js.native
  sealed trait pending
    extends StObject
       with ChannelState
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait subscribed
    extends StObject
       with ChannelState
  @scala.inline
  def subscribed: subscribed = "subscribed".asInstanceOf[subscribed]
  
  @js.native
  sealed trait unsubscribed
    extends StObject
       with ChannelState
  @scala.inline
  def unsubscribed: unsubscribed = "unsubscribed".asInstanceOf[unsubscribed]
}
