package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundleModuleOutput extends StObject {
  
  var bundleId: String
  
  var code: String
  
  var fileName: String
}
object BundleModuleOutput {
  
  inline def apply(bundleId: String, code: String, fileName: String): BundleModuleOutput = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleModuleOutput]
  }
  
  extension [Self <: BundleModuleOutput](x: Self) {
    
    inline def setBundleId(value: String): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
  }
}
