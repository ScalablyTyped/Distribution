package typings.pulumiAws.iamMod

import typings.pulumiAws.getUserMod.GetUserArgs
import typings.pulumiAws.getUserMod.GetUserResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iam", "getUser")
@js.native
object getUser extends js.Object {
  def apply(args: GetUserArgs): js.Promise[GetUserResult] = js.native
  def apply(args: GetUserArgs, opts: InvokeOptions): js.Promise[GetUserResult] = js.native
}

