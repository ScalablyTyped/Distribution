package typings
package atPulumiAwsLib.lambdaLambdaMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda/lambdaMixins", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createFunctionFromEventHandler[E, R](name: java.lang.String, handler: EventHandler[E, R]): atPulumiAwsLib.lambdaLambdaMixinsMod.lambdaFunctionMod.Function = js.native
  def createFunctionFromEventHandler[E, R](
    name: java.lang.String,
    handler: EventHandler[E, R],
    opts: atPulumiPulumiLib.resourceMod.ResourceOptions
  ): atPulumiAwsLib.lambdaLambdaMixinsMod.lambdaFunctionMod.Function = js.native
  def isEventHandler(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/lambdaMixins.EventHandler<any, any> */ scala.Boolean = js.native
}

