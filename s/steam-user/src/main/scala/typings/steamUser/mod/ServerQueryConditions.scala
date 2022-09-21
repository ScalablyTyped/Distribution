package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerQueryConditions extends StObject {
  
  var app_id: js.UndefOr[Double] = js.undefined
  
  var filter_text: js.UndefOr[String] = js.undefined
  
  var geo_location_ip: js.UndefOr[String] = js.undefined
  
  // https://developer.valvesoftware.com/wiki/Master_Server_Query_Protocol#Filter
  var max_servers: js.UndefOr[Double] = js.undefined
  
  var region_code: js.UndefOr[RegionCode] = js.undefined
}
object ServerQueryConditions {
  
  inline def apply(): ServerQueryConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerQueryConditions]
  }
  
  extension [Self <: ServerQueryConditions](x: Self) {
    
    inline def setApp_id(value: Double): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    inline def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
    
    inline def setFilter_text(value: String): Self = StObject.set(x, "filter_text", value.asInstanceOf[js.Any])
    
    inline def setFilter_textUndefined: Self = StObject.set(x, "filter_text", js.undefined)
    
    inline def setGeo_location_ip(value: String): Self = StObject.set(x, "geo_location_ip", value.asInstanceOf[js.Any])
    
    inline def setGeo_location_ipUndefined: Self = StObject.set(x, "geo_location_ip", js.undefined)
    
    inline def setMax_servers(value: Double): Self = StObject.set(x, "max_servers", value.asInstanceOf[js.Any])
    
    inline def setMax_serversUndefined: Self = StObject.set(x, "max_servers", js.undefined)
    
    inline def setRegion_code(value: RegionCode): Self = StObject.set(x, "region_code", value.asInstanceOf[js.Any])
    
    inline def setRegion_codeUndefined: Self = StObject.set(x, "region_code", js.undefined)
  }
}
