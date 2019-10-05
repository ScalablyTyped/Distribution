package typings.atPulumiAws.lambdaLambdaMixinsMod

import typings.atPulumiAws.lambdaFunctionMod.Function
import typings.atPulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda/lambdaMixins", "createFunctionFromEventHandler")
@js.native
object createFunctionFromEventHandler extends js.Object {
  def apply[E, R](name: String, handler: EventHandler[E, R]): Function = js.native
  def apply[E, R](name: String, handler: EventHandler[E, R], opts: ResourceOptions): Function = js.native
}

