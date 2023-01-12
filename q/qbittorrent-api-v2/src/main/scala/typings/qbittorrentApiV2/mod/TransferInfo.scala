package typings.qbittorrentApiV2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferInfo extends StObject {
  
  var connection_status: String
  
  var dht_nodes: Double
  
  var dl_info_data: Double
  
  var dl_info_speed: Double
  
  var dl_rate_limit: Double
  
  var up_info_data: Double
  
  var up_info_speed: Double
  
  var up_rate_limit: Double
}
object TransferInfo {
  
  inline def apply(
    connection_status: String,
    dht_nodes: Double,
    dl_info_data: Double,
    dl_info_speed: Double,
    dl_rate_limit: Double,
    up_info_data: Double,
    up_info_speed: Double,
    up_rate_limit: Double
  ): TransferInfo = {
    val __obj = js.Dynamic.literal(connection_status = connection_status.asInstanceOf[js.Any], dht_nodes = dht_nodes.asInstanceOf[js.Any], dl_info_data = dl_info_data.asInstanceOf[js.Any], dl_info_speed = dl_info_speed.asInstanceOf[js.Any], dl_rate_limit = dl_rate_limit.asInstanceOf[js.Any], up_info_data = up_info_data.asInstanceOf[js.Any], up_info_speed = up_info_speed.asInstanceOf[js.Any], up_rate_limit = up_rate_limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransferInfo] (val x: Self) extends AnyVal {
    
    inline def setConnection_status(value: String): Self = StObject.set(x, "connection_status", value.asInstanceOf[js.Any])
    
    inline def setDht_nodes(value: Double): Self = StObject.set(x, "dht_nodes", value.asInstanceOf[js.Any])
    
    inline def setDl_info_data(value: Double): Self = StObject.set(x, "dl_info_data", value.asInstanceOf[js.Any])
    
    inline def setDl_info_speed(value: Double): Self = StObject.set(x, "dl_info_speed", value.asInstanceOf[js.Any])
    
    inline def setDl_rate_limit(value: Double): Self = StObject.set(x, "dl_rate_limit", value.asInstanceOf[js.Any])
    
    inline def setUp_info_data(value: Double): Self = StObject.set(x, "up_info_data", value.asInstanceOf[js.Any])
    
    inline def setUp_info_speed(value: Double): Self = StObject.set(x, "up_info_speed", value.asInstanceOf[js.Any])
    
    inline def setUp_rate_limit(value: Double): Self = StObject.set(x, "up_rate_limit", value.asInstanceOf[js.Any])
  }
}
