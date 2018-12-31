package typings
package atPulumiAwsLib.sqsSqsMixinsMod.sqsQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queue extends js.Object {
  /**
    * Creates a new subscription to events fired from this Queue to the handler provided, along
    * with options to control the behavior of the subscription.
    */
  def onEvent(name: java.lang.String, handler: atPulumiAwsLib.sqsSqsMixinsMod.QueueEventHandler): atPulumiAwsLib.sqsSqsMixinsMod.QueueEventSubscription = js.native
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.sqsSqsMixinsMod.QueueEventHandler,
    args: atPulumiAwsLib.sqsSqsMixinsMod.QueueEventSubscriptionArgs
  ): atPulumiAwsLib.sqsSqsMixinsMod.QueueEventSubscription = js.native
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.sqsSqsMixinsMod.QueueEventHandler,
    args: atPulumiAwsLib.sqsSqsMixinsMod.QueueEventSubscriptionArgs,
    opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions
  ): atPulumiAwsLib.sqsSqsMixinsMod.QueueEventSubscription = js.native
}

