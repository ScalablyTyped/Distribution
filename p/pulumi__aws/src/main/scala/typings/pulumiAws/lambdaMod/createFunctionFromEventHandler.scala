package typings.pulumiAws.lambdaMod

import typings.pulumiAws.lambdaMixinsMod.EventHandler
import typings.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/lambda", "createFunctionFromEventHandler")
@js.native
object createFunctionFromEventHandler extends js.Object {
  
  def apply[E, R](name: String, handler: EventHandler[E, R]): typings.pulumiAws.lambdaFunctionMod.Function = js.native
  def apply[E, R](name: String, handler: EventHandler[E, R], opts: ResourceOptions): typings.pulumiAws.lambdaFunctionMod.Function = js.native
}
