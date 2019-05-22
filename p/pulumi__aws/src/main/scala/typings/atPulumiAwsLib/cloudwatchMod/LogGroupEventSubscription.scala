package typings
package atPulumiAwsLib.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch", "LogGroupEventSubscription")
@js.native
class LogGroupEventSubscription protected ()
  extends atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscription {
  def this(name: java.lang.String, logGroup: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup, handler: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventHandler) = this()
  def this(name: java.lang.String, logGroup: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup, handler: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventHandler, args: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscriptionArgs) = this()
  def this(name: java.lang.String, logGroup: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.cloudwatchLogGroupMod.LogGroup, handler: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventHandler, args: atPulumiAwsLib.cloudwatchLogGroupMixinsMod.LogGroupEventSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.ComponentResourceOptions) = this()
}

