package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateCpuOptions extends js.Object {
  var coreCount: js.UndefOr[Input[Double]] = js.native
  var threadsPerCore: js.UndefOr[Input[Double]] = js.native
}

object LaunchTemplateCpuOptions {
  @scala.inline
  def apply(coreCount: Input[Double] = null, threadsPerCore: Input[Double] = null): LaunchTemplateCpuOptions = {
    val __obj = js.Dynamic.literal()
    if (coreCount != null) __obj.updateDynamic("coreCount")(coreCount.asInstanceOf[js.Any])
    if (threadsPerCore != null) __obj.updateDynamic("threadsPerCore")(threadsPerCore.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateCpuOptions]
  }
}

