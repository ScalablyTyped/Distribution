package typings.atPulumiAws.cloudwatchMod

import typings.atPulumiAws.cloudwatchLogGroupMixinsMod.LogGroupEventHandler
import typings.atPulumiAws.cloudwatchLogGroupMixinsMod.LogGroupEventSubscriptionArgs
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch", "LogGroupEventSubscription")
@js.native
class LogGroupEventSubscription protected ()
  extends typings.atPulumiAws.cloudwatchLogGroupMixinsMod.LogGroupEventSubscription {
  def this(
    name: String,
    logGroup: typings.atPulumiAws.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup,
    handler: LogGroupEventHandler
  ) = this()
  def this(
    name: String,
    logGroup: typings.atPulumiAws.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup,
    handler: LogGroupEventHandler,
    args: LogGroupEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    logGroup: typings.atPulumiAws.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup,
    handler: LogGroupEventHandler,
    args: LogGroupEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

