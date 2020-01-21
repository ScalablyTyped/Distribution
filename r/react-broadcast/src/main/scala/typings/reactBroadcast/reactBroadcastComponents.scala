package typings.reactBroadcast

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactBroadcastComponents extends reactBroadcastProps {
  @scala.inline
  def Broadcast[T]: ComponentType[BroadcastProps[T]] = js.constructorOf[typings.reactBroadcast.mod.Broadcast_[T]].asInstanceOf[typings.react.mod.ComponentType[BroadcastProps[T]]]
  @scala.inline
  def Subscriber[T]: ComponentType[SubscriberProps[T]] = js.constructorOf[typings.reactBroadcast.mod.Subscriber_[T]].asInstanceOf[typings.react.mod.ComponentType[SubscriberProps[T]]]
}

