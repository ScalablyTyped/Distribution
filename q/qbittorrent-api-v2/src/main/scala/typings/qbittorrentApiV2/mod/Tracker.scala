package typings.qbittorrentApiV2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tracker extends StObject {
  
  var msg: String
  
  var num_downloaded: Double
  
  var num_leeches: Double
  
  var num_peers: Double
  
  var num_seeds: Double
  
  var status: Double
  
  var tier: Double
  
  var url: String
}
object Tracker {
  
  inline def apply(
    msg: String,
    num_downloaded: Double,
    num_leeches: Double,
    num_peers: Double,
    num_seeds: Double,
    status: Double,
    tier: Double,
    url: String
  ): Tracker = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], num_downloaded = num_downloaded.asInstanceOf[js.Any], num_leeches = num_leeches.asInstanceOf[js.Any], num_peers = num_peers.asInstanceOf[js.Any], num_seeds = num_seeds.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tier = tier.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracker]
  }
  
  extension [Self <: Tracker](x: Self) {
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    inline def setNum_downloaded(value: Double): Self = StObject.set(x, "num_downloaded", value.asInstanceOf[js.Any])
    
    inline def setNum_leeches(value: Double): Self = StObject.set(x, "num_leeches", value.asInstanceOf[js.Any])
    
    inline def setNum_peers(value: Double): Self = StObject.set(x, "num_peers", value.asInstanceOf[js.Any])
    
    inline def setNum_seeds(value: Double): Self = StObject.set(x, "num_seeds", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTier(value: Double): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
