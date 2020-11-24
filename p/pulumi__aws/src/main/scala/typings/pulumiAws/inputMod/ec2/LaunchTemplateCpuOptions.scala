package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateCpuOptions extends js.Object {
  
  /**
    * The number of CPU cores for the instance.
    */
  var coreCount: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The number of threads per CPU core. To disable Intel Hyper-Threading Technology for the instance, specify a value of 1.
    * Otherwise, specify the default value of 2.
    */
  var threadsPerCore: js.UndefOr[Input[Double]] = js.native
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
    def setCoreCount(value: Input[Double]): Self = this.set("coreCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoreCount: Self = this.set("coreCount", js.undefined)
    
    @scala.inline
    def setThreadsPerCore(value: Input[Double]): Self = this.set("threadsPerCore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreadsPerCore: Self = this.set("threadsPerCore", js.undefined)
  }
}
