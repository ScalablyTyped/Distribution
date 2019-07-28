package typings.atPulumiAws.sqsSqsMixinsMod.sqsQueueMod

import typings.atPulumiAws.sqsSqsMixinsMod.QueueEventHandler
import typings.atPulumiAws.sqsSqsMixinsMod.QueueEventSubscription
import typings.atPulumiAws.sqsSqsMixinsMod.QueueEventSubscriptionArgs
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queue extends js.Object {
  /**
    * Creates a new subscription to events fired from this Queue to the handler provided, along
    * with options to control the behavior of the subscription.
    */
  def onEvent(name: String, handler: QueueEventHandler): QueueEventSubscription = js.native
  def onEvent(name: String, handler: QueueEventHandler, args: QueueEventSubscriptionArgs): QueueEventSubscription = js.native
  def onEvent(
    name: String,
    handler: QueueEventHandler,
    args: QueueEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): QueueEventSubscription = js.native
}

