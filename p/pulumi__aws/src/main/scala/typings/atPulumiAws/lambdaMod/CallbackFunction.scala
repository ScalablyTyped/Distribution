package typings.atPulumiAws.lambdaMod

import typings.atPulumiAws.lambdaLambdaMixinsMod.CallbackFunctionArgs
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda", "CallbackFunction")
@js.native
class CallbackFunction[E, R] protected ()
  extends typings.atPulumiAws.lambdaLambdaMixinsMod.CallbackFunction[E, R] {
  def this(name: String, args: CallbackFunctionArgs[E, R]) = this()
  def this(name: String, args: CallbackFunctionArgs[E, R], opts: CustomResourceOptions) = this()
}

