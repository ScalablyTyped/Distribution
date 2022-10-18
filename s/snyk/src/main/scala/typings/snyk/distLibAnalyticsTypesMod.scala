package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibAnalyticsTypesMod {
  
  trait StandardAnalyticsData extends StObject {
    
    var ci: Boolean
    
    var durationMs: Double
    
    var id: String
    
    var integrationEnvironment: String
    
    var integrationEnvironmentVersion: String
    
    var integrationName: String
    
    var integrationVersion: String
    
    var metrics: js.UndefOr[js.Array[Any]] = js.undefined
    
    var nodeVersion: String
    
    var os: String
    
    var standalone: Boolean
    
    var version: String
  }
  object StandardAnalyticsData {
    
    inline def apply(
      ci: Boolean,
      durationMs: Double,
      id: String,
      integrationEnvironment: String,
      integrationEnvironmentVersion: String,
      integrationName: String,
      integrationVersion: String,
      nodeVersion: String,
      os: String,
      standalone: Boolean,
      version: String
    ): StandardAnalyticsData = {
      val __obj = js.Dynamic.literal(ci = ci.asInstanceOf[js.Any], durationMs = durationMs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], integrationEnvironment = integrationEnvironment.asInstanceOf[js.Any], integrationEnvironmentVersion = integrationEnvironmentVersion.asInstanceOf[js.Any], integrationName = integrationName.asInstanceOf[js.Any], integrationVersion = integrationVersion.asInstanceOf[js.Any], nodeVersion = nodeVersion.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[StandardAnalyticsData]
    }
    
    extension [Self <: StandardAnalyticsData](x: Self) {
      
      inline def setCi(value: Boolean): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
      
      inline def setDurationMs(value: Double): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIntegrationEnvironment(value: String): Self = StObject.set(x, "integrationEnvironment", value.asInstanceOf[js.Any])
      
      inline def setIntegrationEnvironmentVersion(value: String): Self = StObject.set(x, "integrationEnvironmentVersion", value.asInstanceOf[js.Any])
      
      inline def setIntegrationName(value: String): Self = StObject.set(x, "integrationName", value.asInstanceOf[js.Any])
      
      inline def setIntegrationVersion(value: String): Self = StObject.set(x, "integrationVersion", value.asInstanceOf[js.Any])
      
      inline def setMetrics(value: js.Array[Any]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setMetricsVarargs(value: Any*): Self = StObject.set(x, "metrics", js.Array(value*))
      
      inline def setNodeVersion(value: String): Self = StObject.set(x, "nodeVersion", value.asInstanceOf[js.Any])
      
      inline def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
