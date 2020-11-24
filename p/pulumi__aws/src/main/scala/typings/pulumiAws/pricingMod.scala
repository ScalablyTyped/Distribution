package typings.pulumiAws

import typings.pulumiAws.getProductMod.GetProductArgs
import typings.pulumiAws.getProductMod.GetProductResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/pricing", JSImport.Namespace)
@js.native
object pricingMod extends js.Object {
  
  def getProduct(args: GetProductArgs): js.Promise[GetProductResult] = js.native
  def getProduct(args: GetProductArgs, opts: InvokeOptions): js.Promise[GetProductResult] = js.native
}
