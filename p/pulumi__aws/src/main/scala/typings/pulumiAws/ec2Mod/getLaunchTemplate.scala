package typings.pulumiAws.ec2Mod

import typings.pulumiAws.getLaunchTemplateMod.GetLaunchTemplateArgs
import typings.pulumiAws.getLaunchTemplateMod.GetLaunchTemplateResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getLaunchTemplate")
@js.native
object getLaunchTemplate extends js.Object {
  def apply(args: GetLaunchTemplateArgs): js.Promise[GetLaunchTemplateResult] with GetLaunchTemplateResult = js.native
  def apply(args: GetLaunchTemplateArgs, opts: InvokeOptions): js.Promise[GetLaunchTemplateResult] with GetLaunchTemplateResult = js.native
}

