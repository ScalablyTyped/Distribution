package typings.pulumiAws.mod

import typings.pulumiAws.getRegionMod.GetRegionArgs
import typings.pulumiAws.getRegionMod.GetRegionResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "getRegion")
@js.native
object getRegion extends js.Object {
  
  def apply(): js.Promise[GetRegionResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetRegionResult] = js.native
  def apply(args: GetRegionArgs): js.Promise[GetRegionResult] = js.native
  def apply(args: GetRegionArgs, opts: InvokeOptions): js.Promise[GetRegionResult] = js.native
}
