package typings.pulumiAws.cloudwatchMod

import typings.pulumiAws.logGroupMixinsMod.LogGroupEventHandler
import typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscriptionArgs
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/cloudwatch", "LogGroupEventSubscription")
@js.native
class LogGroupEventSubscription protected ()
  extends typings.pulumiAws.logGroupMixinsMod.LogGroupEventSubscription {
  def this(name: String, logGroup: typings.pulumiAws.logGroupMod.LogGroup, handler: LogGroupEventHandler) = this()
  def this(
    name: String,
    logGroup: typings.pulumiAws.logGroupMod.LogGroup,
    handler: LogGroupEventHandler,
    args: LogGroupEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    logGroup: typings.pulumiAws.logGroupMod.LogGroup,
    handler: LogGroupEventHandler,
    args: js.UndefOr[scala.Nothing],
    opts: ComponentResourceOptions
  ) = this()
  def this(
    name: String,
    logGroup: typings.pulumiAws.logGroupMod.LogGroup,
    handler: LogGroupEventHandler,
    args: LogGroupEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}
