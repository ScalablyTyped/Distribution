package typings.pulumiAws.mod

import typings.pulumiAws.getRegionsMod.GetRegionsArgs
import typings.pulumiAws.getRegionsMod.GetRegionsResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "getRegions")
@js.native
object getRegions extends js.Object {
  def apply(): js.Promise[GetRegionsResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetRegionsResult] = js.native
  def apply(args: GetRegionsArgs): js.Promise[GetRegionsResult] = js.native
  def apply(args: GetRegionsArgs, opts: InvokeOptions): js.Promise[GetRegionsResult] = js.native
}

