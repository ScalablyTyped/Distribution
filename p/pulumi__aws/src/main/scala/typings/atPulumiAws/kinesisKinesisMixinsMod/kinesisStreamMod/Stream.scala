package typings.atPulumiAws.kinesisKinesisMixinsMod.kinesisStreamMod

import typings.atPulumiAws.kinesisKinesisMixinsMod.StreamEventHandler
import typings.atPulumiAws.kinesisKinesisMixinsMod.StreamEventSubscription
import typings.atPulumiAws.kinesisKinesisMixinsMod.StreamEventSubscriptionArgs
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends js.Object {
  /**
    * Creates a new subscription to events fired from this Stream to the handler provided, along
    * with options to control the behavior of the subscription.
    */
  def onEvent(name: String, handler: StreamEventHandler, args: StreamEventSubscriptionArgs): StreamEventSubscription = js.native
  def onEvent(
    name: String,
    handler: StreamEventHandler,
    args: StreamEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): StreamEventSubscription = js.native
}

