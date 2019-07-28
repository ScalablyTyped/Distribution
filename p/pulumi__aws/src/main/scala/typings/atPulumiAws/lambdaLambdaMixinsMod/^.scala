package typings.atPulumiAws.lambdaLambdaMixinsMod

import typings.atPulumiAws.lambdaLambdaMixinsMod.lambdaFunctionMod.Function
import typings.atPulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda/lambdaMixins", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createFunctionFromEventHandler[E, R](name: String, handler: EventHandler[E, R]): Function = js.native
  def createFunctionFromEventHandler[E, R](name: String, handler: EventHandler[E, R], opts: ResourceOptions): Function = js.native
  def isEventHandler(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/lambdaMixins.EventHandler<any, any> */ Boolean = js.native
}

