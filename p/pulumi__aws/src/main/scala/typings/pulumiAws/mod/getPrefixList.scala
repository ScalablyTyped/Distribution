package typings.pulumiAws.mod

import typings.pulumiAws.getPrefixListMod.GetPrefixListArgs
import typings.pulumiAws.getPrefixListMod.GetPrefixListResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "getPrefixList")
@js.native
object getPrefixList extends js.Object {
  
  def apply(): js.Promise[GetPrefixListResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetPrefixListResult] = js.native
  def apply(args: GetPrefixListArgs): js.Promise[GetPrefixListResult] = js.native
  def apply(args: GetPrefixListArgs, opts: InvokeOptions): js.Promise[GetPrefixListResult] = js.native
}
