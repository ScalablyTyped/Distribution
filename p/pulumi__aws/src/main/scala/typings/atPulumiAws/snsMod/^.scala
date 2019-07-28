package typings.atPulumiAws.snsMod

import typings.atPulumiAws.snsGetTopicMod.GetTopicArgs
import typings.atPulumiAws.snsGetTopicMod.GetTopicResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sns", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getTopic(args: GetTopicArgs): js.Promise[GetTopicResult] with GetTopicResult = js.native
  def getTopic(args: GetTopicArgs, opts: InvokeOptions): js.Promise[GetTopicResult] with GetTopicResult = js.native
}

