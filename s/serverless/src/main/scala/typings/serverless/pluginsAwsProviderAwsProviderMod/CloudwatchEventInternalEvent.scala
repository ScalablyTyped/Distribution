package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudwatchEventInternalEvent extends StObject {
  
  var account: js.UndefOr[String] = js.undefined
  
  var detail: js.UndefOr[js.Object] = js.undefined
  
  var `detail-type`: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Supposed to be array of ARNs but needs more info
    */
  var resources: js.UndefOr[js.Array[String]] = js.undefined
  
  var source: String | js.Array[String]
  
  var time: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object CloudwatchEventInternalEvent {
  
  inline def apply(source: String | js.Array[String]): CloudwatchEventInternalEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudwatchEventInternalEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudwatchEventInternalEvent] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setDetail(value: js.Object): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def `setDetail-type`(value: String | js.Array[String]): Self = StObject.set(x, "detail-type", value.asInstanceOf[js.Any])
    
    inline def `setDetail-typeUndefined`: Self = StObject.set(x, "detail-type", js.undefined)
    
    inline def `setDetail-typeVarargs`(value: String*): Self = StObject.set(x, "detail-type", js.Array(value*))
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setSource(value: String | js.Array[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
