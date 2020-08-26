package typings.pulumiAws.mod.iam

import typings.pulumiAws.getRoleMod.GetRoleArgs
import typings.pulumiAws.getRoleMod.GetRoleResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "iam.getRole")
@js.native
object getRole extends js.Object {
  def apply(args: GetRoleArgs): js.Promise[GetRoleResult] = js.native
  def apply(args: GetRoleArgs, opts: InvokeOptions): js.Promise[GetRoleResult] = js.native
}

