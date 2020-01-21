package typings.pulumiAws.mod.waf

import typings.pulumiAws.wafGetIpsetMod.GetIpsetArgs
import typings.pulumiAws.wafGetIpsetMod.GetIpsetResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "waf.getIpset")
@js.native
object getIpset extends js.Object {
  def apply(args: GetIpsetArgs): js.Promise[GetIpsetResult] with GetIpsetResult = js.native
  def apply(args: GetIpsetArgs, opts: InvokeOptions): js.Promise[GetIpsetResult] with GetIpsetResult = js.native
}

