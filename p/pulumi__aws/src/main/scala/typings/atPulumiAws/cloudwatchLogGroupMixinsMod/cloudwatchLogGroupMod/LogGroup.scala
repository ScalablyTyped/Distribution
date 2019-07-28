package typings.atPulumiAws.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod

import typings.atPulumiAws.cloudwatchLogGroupMixinsMod.DecodedLogGroupEvent
import typings.atPulumiAws.cloudwatchLogGroupMixinsMod.LogGroupEventHandler
import typings.atPulumiAws.cloudwatchLogGroupMixinsMod.LogGroupEventSubscription
import typings.atPulumiAws.cloudwatchLogGroupMixinsMod.LogGroupEventSubscriptionArgs
import typings.atPulumiAws.lambdaLambdaMixinsMod.Callback
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
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
  def onDecodedEvent(name: String, callback: Callback[DecodedLogGroupEvent, Unit]): LogGroupEventSubscription = js.native
  def onDecodedEvent(name: String, callback: Callback[DecodedLogGroupEvent, Unit], args: LogGroupEventSubscriptionArgs): LogGroupEventSubscription = js.native
  def onDecodedEvent(
    name: String,
    callback: Callback[DecodedLogGroupEvent, Unit],
    args: LogGroupEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): LogGroupEventSubscription = js.native
  /**
    * Creates a new subscription to events fired from this LogGroup to the handler provided,
    * along with options to control the behavior of the subscription.
    *
    * The events will be produced in raw (gzipped + base64 encoded) form.
    */
  def onEvent(name: String, handler: LogGroupEventHandler): LogGroupEventSubscription = js.native
  def onEvent(name: String, handler: LogGroupEventHandler, args: LogGroupEventSubscriptionArgs): LogGroupEventSubscription = js.native
  def onEvent(
    name: String,
    handler: LogGroupEventHandler,
    args: LogGroupEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): LogGroupEventSubscription = js.native
}

