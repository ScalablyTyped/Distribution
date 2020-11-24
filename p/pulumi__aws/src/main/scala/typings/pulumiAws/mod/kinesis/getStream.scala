package typings.pulumiAws.mod.kinesis

import typings.pulumiAws.getStreamMod.GetStreamArgs
import typings.pulumiAws.getStreamMod.GetStreamResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "kinesis.getStream")
@js.native
object getStream extends js.Object {
  
  def apply(args: GetStreamArgs): js.Promise[GetStreamResult] = js.native
  def apply(args: GetStreamArgs, opts: InvokeOptions): js.Promise[GetStreamResult] = js.native
}
