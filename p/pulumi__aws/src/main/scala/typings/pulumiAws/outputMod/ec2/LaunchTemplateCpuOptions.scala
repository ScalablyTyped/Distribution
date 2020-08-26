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
  def apply(): LaunchTemplateCpuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateCpuOptions]
  }
  @scala.inline
  implicit class LaunchTemplateCpuOptionsOps[Self <: LaunchTemplateCpuOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCoreCount(value: Double): Self = this.set("coreCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoreCount: Self = this.set("coreCount", js.undefined)
    @scala.inline
    def setThreadsPerCore(value: Double): Self = this.set("threadsPerCore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreadsPerCore: Self = this.set("threadsPerCore", js.undefined)
  }
  
}

