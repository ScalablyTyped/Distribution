package typings.pulumiAws.mod.ec2

import typings.pulumiAws.getLaunchTemplateMod.GetLaunchTemplateArgs
import typings.pulumiAws.getLaunchTemplateMod.GetLaunchTemplateResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.getLaunchTemplate")
@js.native
object getLaunchTemplate extends js.Object {
  
  def apply(): js.Promise[GetLaunchTemplateResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLaunchTemplateResult] = js.native
  def apply(args: GetLaunchTemplateArgs): js.Promise[GetLaunchTemplateResult] = js.native
  def apply(args: GetLaunchTemplateArgs, opts: InvokeOptions): js.Promise[GetLaunchTemplateResult] = js.native
}
