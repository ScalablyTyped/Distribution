package typings.pulumiAws.iamMod

import typings.pulumiAws.getInstanceProfileMod.GetInstanceProfileArgs
import typings.pulumiAws.getInstanceProfileMod.GetInstanceProfileResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam", "getInstanceProfile")
@js.native
object getInstanceProfile extends js.Object {
  def apply(args: GetInstanceProfileArgs): js.Promise[GetInstanceProfileResult] = js.native
  def apply(args: GetInstanceProfileArgs, opts: InvokeOptions): js.Promise[GetInstanceProfileResult] = js.native
}

