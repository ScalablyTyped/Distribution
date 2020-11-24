package typings.pulumiAws.mod.lambda

import typings.pulumiAws.getLayerVersionMod.GetLayerVersionArgs
import typings.pulumiAws.getLayerVersionMod.GetLayerVersionResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "lambda.getLayerVersion")
@js.native
object getLayerVersion extends js.Object {
  
  def apply(args: GetLayerVersionArgs): js.Promise[GetLayerVersionResult] = js.native
  def apply(args: GetLayerVersionArgs, opts: InvokeOptions): js.Promise[GetLayerVersionResult] = js.native
}
