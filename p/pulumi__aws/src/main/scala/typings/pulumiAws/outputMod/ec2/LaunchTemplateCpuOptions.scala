package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateCpuOptions extends js.Object {
  var coreCount: js.UndefOr[Double] = js.native
  var threadsPerCore: js.UndefOr[Double] = js.native
}

object LaunchTemplateCpuOptions {
  @scala.inline
  def apply(coreCount: Int | Double = null, threadsPerCore: Int | Double = null): LaunchTemplateCpuOptions = {
    val __obj = js.Dynamic.literal()
    if (coreCount != null) __obj.updateDynamic("coreCount")(coreCount.asInstanceOf[js.Any])
    if (threadsPerCore != null) __obj.updateDynamic("threadsPerCore")(threadsPerCore.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateCpuOptions]
  }
}

