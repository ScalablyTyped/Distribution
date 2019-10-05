package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.getRegionMod.GetRegionArgs
import typings.atPulumiAws.getRegionMod.GetRegionResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "getRegion")
@js.native
object getRegion extends js.Object {
  def apply(): js.Promise[GetRegionResult] with GetRegionResult = js.native
  def apply(args: GetRegionArgs): js.Promise[GetRegionResult] with GetRegionResult = js.native
  def apply(args: GetRegionArgs, opts: InvokeOptions): js.Promise[GetRegionResult] with GetRegionResult = js.native
}

