package typings.reactBroadcast

import typings.react.mod.ComponentType
import typings.reactBroadcast.mod.Broadcast_
import typings.reactBroadcast.mod.Subscriber_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactBroadcastComponents extends reactBroadcastProps {
  @scala.inline
  def Broadcast[T]: ComponentType[BroadcastProps[T]] = js.constructorOf[Broadcast_[T]].asInstanceOf[ComponentType[BroadcastProps[T]]]
  @scala.inline
  def Subscriber[T]: ComponentType[SubscriberProps[T]] = js.constructorOf[Subscriber_[T]].asInstanceOf[ComponentType[SubscriberProps[T]]]
}

