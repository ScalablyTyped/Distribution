package typings.pulumiAws.mod

import typings.pulumiAws.getAmiMod.GetAmiArgs
import typings.pulumiAws.getAmiMod.GetAmiResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "getAmi")
@js.native
object getAmi extends js.Object {
  def apply(args: GetAmiArgs): js.Promise[GetAmiResult] = js.native
  def apply(args: GetAmiArgs, opts: InvokeOptions): js.Promise[GetAmiResult] = js.native
}

