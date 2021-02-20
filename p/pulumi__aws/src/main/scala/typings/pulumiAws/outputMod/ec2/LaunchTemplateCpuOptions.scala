package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateCpuOptions extends StObject {
  
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
  implicit class LaunchTemplateCpuOptionsMutableBuilder[Self <: LaunchTemplateCpuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoreCount(value: Double): Self = StObject.set(x, "coreCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoreCountUndefined: Self = StObject.set(x, "coreCount", js.undefined)
    
    @scala.inline
    def setThreadsPerCore(value: Double): Self = StObject.set(x, "threadsPerCore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadsPerCoreUndefined: Self = StObject.set(x, "threadsPerCore", js.undefined)
  }
}
