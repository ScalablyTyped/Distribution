package typings.atPulumiAws.atPulumiAwsMod.lambda

import typings.atPulumiAws.lambdaLambdaMixinsMod.EventHandler
import typings.atPulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "lambda.createFunctionFromEventHandler")
@js.native
object createFunctionFromEventHandler extends js.Object {
  def apply[E, R](name: String, handler: EventHandler[E, R]): typings.atPulumiAws.lambdaLambdaMixinsMod.lambdaFunctionMod.Function = js.native
  def apply[E, R](name: String, handler: EventHandler[E, R], opts: ResourceOptions): typings.atPulumiAws.lambdaLambdaMixinsMod.lambdaFunctionMod.Function = js.native
}

