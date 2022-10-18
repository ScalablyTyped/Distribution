package typings.snyk.distLibEcosystemsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginResponse extends StObject {
  
  var scanResults: js.Array[ScanResult]
}
object PluginResponse {
  
  inline def apply(scanResults: js.Array[ScanResult]): PluginResponse = {
    val __obj = js.Dynamic.literal(scanResults = scanResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginResponse]
  }
  
  extension [Self <: PluginResponse](x: Self) {
    
    inline def setScanResults(value: js.Array[ScanResult]): Self = StObject.set(x, "scanResults", value.asInstanceOf[js.Any])
    
    inline def setScanResultsVarargs(value: ScanResult*): Self = StObject.set(x, "scanResults", js.Array(value*))
  }
}
