package typings.atPulumiAws.atPulumiAwsMod.lambda

import typings.atPulumiAws.lambdaGetInvocationMod.GetInvocationArgs
import typings.atPulumiAws.lambdaGetInvocationMod.GetInvocationResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "lambda.getInvocation")
@js.native
object getInvocation extends js.Object {
  def apply(args: GetInvocationArgs): js.Promise[GetInvocationResult] with GetInvocationResult = js.native
  def apply(args: GetInvocationArgs, opts: InvokeOptions): js.Promise[GetInvocationResult] with GetInvocationResult = js.native
}

