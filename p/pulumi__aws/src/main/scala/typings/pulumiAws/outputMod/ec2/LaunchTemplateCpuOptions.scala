package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateCpuOptions extends StObject {
  
  /**
    * The number of CPU cores for the instance.
    */
  var coreCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of threads per CPU core. To disable Intel Hyper-Threading Technology for the instance, specify a value of 1.
    * Otherwise, specify the default value of 2.
    */
  var threadsPerCore: js.UndefOr[Double] = js.undefined
}
object LaunchTemplateCpuOptions {
  
  inline def apply(): LaunchTemplateCpuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateCpuOptions]
  }
  
  extension [Self <: LaunchTemplateCpuOptions](x: Self) {
    
    inline def setCoreCount(value: Double): Self = StObject.set(x, "coreCount", value.asInstanceOf[js.Any])
    
    inline def setCoreCountUndefined: Self = StObject.set(x, "coreCount", js.undefined)
    
    inline def setThreadsPerCore(value: Double): Self = StObject.set(x, "threadsPerCore", value.asInstanceOf[js.Any])
    
    inline def setThreadsPerCoreUndefined: Self = StObject.set(x, "threadsPerCore", js.undefined)
  }
}
