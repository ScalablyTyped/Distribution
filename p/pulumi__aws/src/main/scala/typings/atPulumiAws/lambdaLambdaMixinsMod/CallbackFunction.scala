package typings.atPulumiAws.lambdaLambdaMixinsMod

import typings.atPulumiAws.lambdaFunctionMod.Function
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda/lambdaMixins", "CallbackFunction")
@js.native
class CallbackFunction[E, R] protected () extends Function {
  def this(name: String, args: CallbackFunctionArgs[E, R]) = this()
  def this(name: String, args: CallbackFunctionArgs[E, R], opts: CustomResourceOptions) = this()
}

