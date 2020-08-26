package typings.pulumiAws.logGroupMixinsMod

import typings.pulumiAws.lambdaMod.EventSubscription
import typings.pulumiAws.logGroupMod.LogGroup
import typings.pulumiAws.logSubscriptionFilterMod.LogSubscriptionFilter
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch/logGroupMixins", "LogGroupEventSubscription")
@js.native
class LogGroupEventSubscription protected () extends EventSubscription {
  def this(name: String, logGroup: LogGroup, handler: LogGroupEventHandler) = this()
  def this(
    name: String,
    logGroup: LogGroup,
    handler: LogGroupEventHandler,
    args: LogGroupEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    logGroup: LogGroup,
    handler: LogGroupEventHandler,
    args: js.UndefOr[scala.Nothing],
    opts: ComponentResourceOptions
  ) = this()
  def this(
    name: String,
    logGroup: LogGroup,
    handler: LogGroupEventHandler,
    args: LogGroupEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
  val logGroup: LogGroup = js.native
  val logSubscriptionFilter: LogSubscriptionFilter = js.native
}

