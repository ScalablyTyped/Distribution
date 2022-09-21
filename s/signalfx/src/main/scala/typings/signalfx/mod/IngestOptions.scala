package typings.signalfx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestOptions extends StObject {
  
  var batchSize: js.UndefOr[Double] = js.undefined
  
  var dimensions: js.UndefOr[js.Object] = js.undefined
  
  var enableAmazonUniqueId: js.UndefOr[Boolean] = js.undefined
  
  var ingestEndpoint: js.UndefOr[String] = js.undefined
  
  var proxy: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var userAgents: js.UndefOr[js.Array[String]] = js.undefined
}
object IngestOptions {
  
  inline def apply(): IngestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestOptions]
  }
  
  extension [Self <: IngestOptions](x: Self) {
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setDimensions(value: js.Object): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setEnableAmazonUniqueId(value: Boolean): Self = StObject.set(x, "enableAmazonUniqueId", value.asInstanceOf[js.Any])
    
    inline def setEnableAmazonUniqueIdUndefined: Self = StObject.set(x, "enableAmazonUniqueId", js.undefined)
    
    inline def setIngestEndpoint(value: String): Self = StObject.set(x, "ingestEndpoint", value.asInstanceOf[js.Any])
    
    inline def setIngestEndpointUndefined: Self = StObject.set(x, "ingestEndpoint", js.undefined)
    
    inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUserAgents(value: js.Array[String]): Self = StObject.set(x, "userAgents", value.asInstanceOf[js.Any])
    
    inline def setUserAgentsUndefined: Self = StObject.set(x, "userAgents", js.undefined)
    
    inline def setUserAgentsVarargs(value: String*): Self = StObject.set(x, "userAgents", js.Array(value*))
  }
}
