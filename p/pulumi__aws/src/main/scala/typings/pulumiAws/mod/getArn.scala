package typings.pulumiAws.mod

import typings.pulumiAws.getArnMod.GetArnArgs
import typings.pulumiAws.getArnMod.GetArnResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "getArn")
@js.native
object getArn extends js.Object {
  def apply(args: GetArnArgs): js.Promise[GetArnResult] = js.native
  def apply(args: GetArnArgs, opts: InvokeOptions): js.Promise[GetArnResult] = js.native
}

