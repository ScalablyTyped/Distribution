package typings.pulumiAws.mod.sqs

import typings.pulumiAws.getQueueMod.GetQueueArgs
import typings.pulumiAws.getQueueMod.GetQueueResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sqs.getQueue")
@js.native
object getQueue extends js.Object {
  def apply(args: GetQueueArgs): js.Promise[GetQueueResult] = js.native
  def apply(args: GetQueueArgs, opts: InvokeOptions): js.Promise[GetQueueResult] = js.native
}

