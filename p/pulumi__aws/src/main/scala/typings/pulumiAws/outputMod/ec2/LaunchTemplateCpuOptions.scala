package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateCpuOptions extends js.Object {
  /**
    * The number of CPU cores for the instance.
    */
  var coreCount: js.UndefOr[Double] = js.native
  /**
    * The number of threads per CPU core. To disable Intel Hyper-Threading Technology for the instance, specify a value of 1.
    * Otherwise, specify the default value of 2.
    */
  var threadsPerCore: js.UndefOr[Double] = js.native
}

object LaunchTemplateCpuOptions {
  @scala.inline
  def apply(coreCount: js.UndefOr[Double] = js.undefined, threadsPerCore: js.UndefOr[Double] = js.undefined): LaunchTemplateCpuOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(coreCount)) __obj.updateDynamic("coreCount")(coreCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threadsPerCore)) __obj.updateDynamic("threadsPerCore")(threadsPerCore.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateCpuOptions]
  }
}

