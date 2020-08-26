package typings.pulumiAws.cloudwatchMod

import typings.pulumiAws.getLogGroupMod.GetLogGroupArgs
import typings.pulumiAws.getLogGroupMod.GetLogGroupResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch", "getLogGroup")
@js.native
object getLogGroup extends js.Object {
  def apply(args: GetLogGroupArgs): js.Promise[GetLogGroupResult] = js.native
  def apply(args: GetLogGroupArgs, opts: InvokeOptions): js.Promise[GetLogGroupResult] = js.native
}

