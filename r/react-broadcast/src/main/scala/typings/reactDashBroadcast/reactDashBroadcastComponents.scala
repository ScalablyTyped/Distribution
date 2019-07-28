package typings.reactDashBroadcast

import typings.react.reactMod.ComponentType
import typings.reactDashBroadcast.reactDashBroadcastMod.BroadcastNs.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashBroadcastComponents extends reactDashBroadcastProps {
  @scala.inline
  def Broadcast[T]: ComponentType[Props[T]] = js.constructorOf[typings.reactDashBroadcast.reactDashBroadcastMod.Broadcast[T]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashBroadcast.reactDashBroadcastMod.BroadcastNs.Props[T]]]
  @scala.inline
  def Subscriber[T]: ComponentType[typings.reactDashBroadcast.reactDashBroadcastMod.SubscriberNs.Props[T]] = js.constructorOf[typings.reactDashBroadcast.reactDashBroadcastMod.Subscriber[T]].asInstanceOf[typings.react.reactMod.ComponentType[typings.reactDashBroadcast.reactDashBroadcastMod.SubscriberNs.Props[T]]]
}

