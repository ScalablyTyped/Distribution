package typings.pulumiAws.iamMod

import typings.pulumiAws.getPolicyMod.GetPolicyArgs
import typings.pulumiAws.getPolicyMod.GetPolicyResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/iam", "getPolicy")
@js.native
object getPolicy extends js.Object {
  
  def apply(args: GetPolicyArgs): js.Promise[GetPolicyResult] = js.native
  def apply(args: GetPolicyArgs, opts: InvokeOptions): js.Promise[GetPolicyResult] = js.native
}
