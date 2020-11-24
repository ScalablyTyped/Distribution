package typings.pulumiAws.lambdaMixinsMod

import typings.pulumiAws.lambdaFunctionMod.Function
import typings.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/lambda/lambdaMixins", "createFunctionFromEventHandler")
@js.native
object createFunctionFromEventHandler extends js.Object {
  
  def apply[E, R](name: String, handler: EventHandler[E, R]): Function = js.native
  def apply[E, R](name: String, handler: EventHandler[E, R], opts: ResourceOptions): Function = js.native
}
