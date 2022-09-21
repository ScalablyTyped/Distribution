package typings.stencilCore.stencilPublicCompilerMod

import typings.stencilCore.stencilCoreStrings._empty
import typings.stencilCore.stencilCoreStrings.darwin
import typings.stencilCore.stencilCoreStrings.linux
import typings.stencilCore.stencilCoreStrings.windows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemDetails extends StObject {
  
  var cpuModel: String
  
  def freemem(): Double
  
  var platform: darwin | windows | linux | _empty
  
  var release: String
  
  var totalmem: Double
}
object SystemDetails {
  
  inline def apply(
    cpuModel: String,
    freemem: () => Double,
    platform: darwin | windows | linux | _empty,
    release: String,
    totalmem: Double
  ): SystemDetails = {
    val __obj = js.Dynamic.literal(cpuModel = cpuModel.asInstanceOf[js.Any], freemem = js.Any.fromFunction0(freemem), platform = platform.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], totalmem = totalmem.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemDetails]
  }
  
  extension [Self <: SystemDetails](x: Self) {
    
    inline def setCpuModel(value: String): Self = StObject.set(x, "cpuModel", value.asInstanceOf[js.Any])
    
    inline def setFreemem(value: () => Double): Self = StObject.set(x, "freemem", js.Any.fromFunction0(value))
    
    inline def setPlatform(value: darwin | windows | linux | _empty): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setTotalmem(value: Double): Self = StObject.set(x, "totalmem", value.asInstanceOf[js.Any])
  }
}
