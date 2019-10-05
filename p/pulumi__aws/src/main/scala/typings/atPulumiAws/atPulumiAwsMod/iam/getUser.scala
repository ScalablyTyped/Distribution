package typings.atPulumiAws.atPulumiAwsMod.iam

import typings.atPulumiAws.iamGetUserMod.GetUserArgs
import typings.atPulumiAws.iamGetUserMod.GetUserResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "iam.getUser")
@js.native
object getUser extends js.Object {
  def apply(args: GetUserArgs): js.Promise[GetUserResult] with GetUserResult = js.native
  def apply(args: GetUserArgs, opts: InvokeOptions): js.Promise[GetUserResult] with GetUserResult = js.native
}

