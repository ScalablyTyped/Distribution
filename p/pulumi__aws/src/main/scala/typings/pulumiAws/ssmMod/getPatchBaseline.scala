package typings.pulumiAws.ssmMod

import typings.pulumiAws.getPatchBaselineMod.GetPatchBaselineArgs
import typings.pulumiAws.getPatchBaselineMod.GetPatchBaselineResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ssm", "getPatchBaseline")
@js.native
object getPatchBaseline extends js.Object {
  
  def apply(args: GetPatchBaselineArgs): js.Promise[GetPatchBaselineResult] = js.native
  def apply(args: GetPatchBaselineArgs, opts: InvokeOptions): js.Promise[GetPatchBaselineResult] = js.native
}
