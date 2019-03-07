package typings
package atPulumiAwsLib.cloudwatchLogGroupMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch/logGroupMixins", "LogGroupEventSubscription")
@js.native
class LogGroupEventSubscription protected ()
  extends atPulumiAwsLib.lambdaMod.EventSubscription {
  def this(name: java.lang.String, logGroup: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup, handler: LogGroupEventHandler, args: LogGroupEventSubscriptionArgs) = this()
  def this(name: java.lang.String, logGroup: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup, handler: LogGroupEventHandler, args: LogGroupEventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
  val logGroup: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup] = js.native
  val logSubscriptionFilter: atPulumiAwsLib.cloudwatchLogSubscriptionFilterMod.LogSubscriptionFilter = js.native
}

