package typings.pulumiAws.mod

import typings.pulumiAws.getProductMod.GetProductArgs
import typings.pulumiAws.getProductMod.GetProductResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pricing {
  
  @JSImport("@pulumi/aws", "pricing")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getProduct(args: GetProductArgs): js.Promise[GetProductResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProduct")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetProductResult]]
  @scala.inline
  def getProduct(args: GetProductArgs, opts: InvokeOptions): js.Promise[GetProductResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getProduct")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetProductResult]]
}
