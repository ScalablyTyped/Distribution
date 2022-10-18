package typings.snyk.distLibEcosystemsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcosystemMonitorResult
  extends StObject
     with MonitorDependenciesResponse {
  
  var scanResult: ScanResult
}
object EcosystemMonitorResult {
  
  inline def apply(
    id: String,
    isMonitored: Boolean,
    licensesPolicy: Any,
    ok: Boolean,
    org_ : String,
    path: String,
    projectName: String,
    scanResult: ScanResult,
    trialStarted: Boolean,
    uri: String
  ): EcosystemMonitorResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isMonitored = isMonitored.asInstanceOf[js.Any], licensesPolicy = licensesPolicy.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], scanResult = scanResult.asInstanceOf[js.Any], trialStarted = trialStarted.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcosystemMonitorResult]
  }
  
  extension [Self <: EcosystemMonitorResult](x: Self) {
    
    inline def setScanResult(value: ScanResult): Self = StObject.set(x, "scanResult", value.asInstanceOf[js.Any])
  }
}
