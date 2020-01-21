package typings.pulumiAws.mod

import typings.pulumiAws.getIpRangesMod.GetIpRangesArgs
import typings.pulumiAws.getIpRangesMod.GetIpRangesResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "getIpRanges")
@js.native
object getIpRanges extends js.Object {
  def apply(args: GetIpRangesArgs): js.Promise[GetIpRangesResult] with GetIpRangesResult = js.native
  def apply(args: GetIpRangesArgs, opts: InvokeOptions): js.Promise[GetIpRangesResult] with GetIpRangesResult = js.native
}

