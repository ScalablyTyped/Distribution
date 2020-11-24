package typings.pulumiAws.mod.sns

import typings.pulumiAws.getTopicMod.GetTopicArgs
import typings.pulumiAws.getTopicMod.GetTopicResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "sns.getTopic")
@js.native
object getTopic extends js.Object {
  
  def apply(args: GetTopicArgs): js.Promise[GetTopicResult] = js.native
  def apply(args: GetTopicArgs, opts: InvokeOptions): js.Promise[GetTopicResult] = js.native
}
