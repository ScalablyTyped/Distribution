package typings.pulumiAws.mod

import typings.pulumiAws.getProductMod.GetProductArgs
import typings.pulumiAws.getProductMod.GetProductResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pricing {
  
  @JSImport("@pulumi/aws", "pricing.getProduct")
  @js.native
  def getProduct(args: GetProductArgs): js.Promise[GetProductResult] = js.native
  @JSImport("@pulumi/aws", "pricing.getProduct")
  @js.native
  def getProduct(args: GetProductArgs, opts: InvokeOptions): js.Promise[GetProductResult] = js.native
}
