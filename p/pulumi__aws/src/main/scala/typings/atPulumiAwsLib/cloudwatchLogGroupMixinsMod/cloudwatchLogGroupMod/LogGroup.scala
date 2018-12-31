package typings
package atPulumiAwsLib.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogGroup extends js.Object {
  /**
    * Creates a new subscription to events fired from this LogGroup to the callback provided,
    * along with options to control the behavior of the subscription.
    *
    * The events will be provided in their decoded form.  Because this event hookup needs to
    * execute code to convert the raw messages, it can only be passed an [EntryPoint] callback,
    * not a [lambda.Function] instance.
    */
  def onDecodedEvent(
    name: java.lang.String,
    callback: atPulumiAwsLib.lambdaLambdaMixinsMod.Callback[atPulumiAwsLib.cloudwatchLogGroupMixinsMod.DecodedLogGroupEvent, scala.Unit]
  ): atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscription = js.native
  def onDecodedEvent(
    name: java.lang.String,
    callback: atPulumiAwsLib.lambdaLambdaMixinsMod.Callback[atPulumiAwsLib.cloudwatchLogGroupMixinsMod.DecodedLogGroupEvent, scala.Unit],
    args: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscriptionArgs
  ): atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscription = js.native
  def onDecodedEvent(
    name: java.lang.String,
    callback: atPulumiAwsLib.lambdaLambdaMixinsMod.Callback[atPulumiAwsLib.cloudwatchLogGroupMixinsMod.DecodedLogGroupEvent, scala.Unit],
    args: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscriptionArgs,
    opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions
  ): atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscription = js.native
  /**
    * Creates a new subscription to events fired from this LogGroup to the handler provided,
    * along with options to control the behavior of the subscription.
    *
    * The events will be produced in raw (gzipped + base64 encoded) form.
    */
  def onEvent(name: java.lang.String, handler: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventHandler): atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscription = js.native
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventHandler,
    args: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscriptionArgs
  ): atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscription = js.native
  def onEvent(
    name: java.lang.String,
    handler: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventHandler,
    args: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscriptionArgs,
    opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions
  ): atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscription = js.native
}

