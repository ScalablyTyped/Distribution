package typings.pulumiAws.mod.cloudwatch

import typings.pulumiAws.lambdaMixinsMod.Callback
import typings.pulumiAws.logGroupMixinsMod.DecodedLogGroupEvent
import typings.pulumiAws.logGroupMixinsMod.LogGroupEventHandler
import typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscriptionArgs
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("@pulumi/aws/cloudwatch/logGroup", JSImport.Namespace)
@js.native
object pulumiAwsCloudwatchLogGroupAugmentingMod extends js.Object {
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
    def onDecodedEvent(name: String, callback: Callback[DecodedLogGroupEvent, Unit]): typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
    def onDecodedEvent(
      name: String,
      callback: Callback[DecodedLogGroupEvent, Unit],
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions
    ): typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
    def onDecodedEvent(name: String, callback: Callback[DecodedLogGroupEvent, Unit], args: LogGroupEventSubscriptionArgs): typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
    def onDecodedEvent(
      name: String,
      callback: Callback[DecodedLogGroupEvent, Unit],
      args: LogGroupEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ): typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
    /**
      * Creates a new subscription to events fired from this LogGroup to the handler provided,
      * along with options to control the behavior of the subscription.
      *
      * The events will be produced in raw (gzipped + base64 encoded) form.
      */
    def onEvent(name: String, handler: LogGroupEventHandler): typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
    def onEvent(
      name: String,
      handler: LogGroupEventHandler,
      args: js.UndefOr[scala.Nothing],
      opts: ComponentResourceOptions
    ): typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
    def onEvent(name: String, handler: LogGroupEventHandler, args: LogGroupEventSubscriptionArgs): typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
    def onEvent(
      name: String,
      handler: LogGroupEventHandler,
      args: LogGroupEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ): typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription = js.native
  }
  
}

