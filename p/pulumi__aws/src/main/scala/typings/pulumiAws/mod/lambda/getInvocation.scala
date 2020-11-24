package typings.pulumiAws.mod.lambda

import typings.pulumiAws.getInvocationMod.GetInvocationArgs
import typings.pulumiAws.getInvocationMod.GetInvocationResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "lambda.getInvocation")
@js.native
object getInvocation extends js.Object {
  
  def apply(args: GetInvocationArgs): js.Promise[GetInvocationResult] = js.native
  def apply(args: GetInvocationArgs, opts: InvokeOptions): js.Promise[GetInvocationResult] = js.native
}
