package typings.atPulumiAws.atPulumiAwsMod.iam

import typings.atPulumiAws.iamGetRoleMod.GetRoleArgs
import typings.atPulumiAws.iamGetRoleMod.GetRoleResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "iam.getRole")
@js.native
object getRole extends js.Object {
  def apply(args: GetRoleArgs): js.Promise[GetRoleResult] with GetRoleResult = js.native
  def apply(args: GetRoleArgs, opts: InvokeOptions): js.Promise[GetRoleResult] with GetRoleResult = js.native
}

