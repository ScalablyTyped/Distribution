package typings.atPulumiAws

import typings.atPulumiAws.pricingGetProductMod.GetProductArgs
import typings.atPulumiAws.pricingGetProductMod.GetProductResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pricing", JSImport.Namespace)
@js.native
object pricingMod extends js.Object {
  def getProduct(args: GetProductArgs): js.Promise[GetProductResult] with GetProductResult = js.native
  def getProduct(args: GetProductArgs, opts: InvokeOptions): js.Promise[GetProductResult] with GetProductResult = js.native
}

