package typings.snyk.distLibEcosystemsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcosystemMonitorError extends StObject {
  
  var error: String
  
  var path: String
  
  var scanResult: ScanResult
}
object EcosystemMonitorError {
  
  inline def apply(error: String, path: String, scanResult: ScanResult): EcosystemMonitorError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scanResult = scanResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcosystemMonitorError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EcosystemMonitorError] (val x: Self) extends AnyVal {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setScanResult(value: ScanResult): Self = StObject.set(x, "scanResult", value.asInstanceOf[js.Any])
  }
}
