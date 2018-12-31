package typings
package atPulumiAwsLib.kinesisKinesisMixinsMod.kinesisStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream extends js.Object {
  /**
    * Creates a new subscription to events fired from this Stream to the handler provided, along
    * with options to control the behavior of the subscription.
    */
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.kinesisKinesisMixinsMod.StreamEventHandler,
    args: atPulumiAwsLib.kinesisKinesisMixinsMod.StreamEventSubscriptionArgs
  ): atPulumiAwsLib.kinesisKinesisMixinsMod.StreamEventSubscription = js.native
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.kinesisKinesisMixinsMod.StreamEventHandler,
    args: atPulumiAwsLib.kinesisKinesisMixinsMod.StreamEventSubscriptionArgs,
    opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions
  ): atPulumiAwsLib.kinesisKinesisMixinsMod.StreamEventSubscription = js.native
}

