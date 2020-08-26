package typings.pulumiAws.mod.ec2

import typings.pulumiAws.getLaunchConfigurationMod.GetLaunchConfigurationArgs
import typings.pulumiAws.getLaunchConfigurationMod.GetLaunchConfigurationResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getLaunchConfiguration")
@js.native
object getLaunchConfiguration extends js.Object {
  def apply(args: GetLaunchConfigurationArgs): js.Promise[GetLaunchConfigurationResult] = js.native
  def apply(args: GetLaunchConfigurationArgs, opts: InvokeOptions): js.Promise[GetLaunchConfigurationResult] = js.native
}

