package typings.qbittorrentApiV2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TorrentInfo extends StObject {
  
  var addition_date: Double
  
  var comment: String
  
  var completion_date: Double
  
  var created_by: String
  
  var creation_date: Double
  
  var dl_limit: Double
  
  var dl_speed: Double
  
  var dl_speed_avg: Double
  
  var eta: Double
  
  var last_seen: Double
  
  var nb_connections: Double
  
  var nb_connections_limit: Double
  
  var peers: Double
  
  var peers_total: Double
  
  var piece_size: Double
  
  var pieces_have: Double
  
  var pieces_num: Double
  
  var reannounce: Double
  
  var save_path: String
  
  var seeding_time: Double
  
  var seeds: Double
  
  var seeds_total: Double
  
  var share_ratio: Double
  
  var time_elapsed: Double
  
  var total_downloaded: Double
  
  var total_downloaded_session: Double
  
  var total_size: Double
  
  var total_uploaded: Double
  
  var total_uploaded_session: Double
  
  var total_wasted: Double
  
  var up_limit: Double
  
  var up_speed: Double
  
  var up_speed_avg: Double
}
object TorrentInfo {
  
  inline def apply(
    addition_date: Double,
    comment: String,
    completion_date: Double,
    created_by: String,
    creation_date: Double,
    dl_limit: Double,
    dl_speed: Double,
    dl_speed_avg: Double,
    eta: Double,
    last_seen: Double,
    nb_connections: Double,
    nb_connections_limit: Double,
    peers: Double,
    peers_total: Double,
    piece_size: Double,
    pieces_have: Double,
    pieces_num: Double,
    reannounce: Double,
    save_path: String,
    seeding_time: Double,
    seeds: Double,
    seeds_total: Double,
    share_ratio: Double,
    time_elapsed: Double,
    total_downloaded: Double,
    total_downloaded_session: Double,
    total_size: Double,
    total_uploaded: Double,
    total_uploaded_session: Double,
    total_wasted: Double,
    up_limit: Double,
    up_speed: Double,
    up_speed_avg: Double
  ): TorrentInfo = {
    val __obj = js.Dynamic.literal(addition_date = addition_date.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], completion_date = completion_date.asInstanceOf[js.Any], created_by = created_by.asInstanceOf[js.Any], creation_date = creation_date.asInstanceOf[js.Any], dl_limit = dl_limit.asInstanceOf[js.Any], dl_speed = dl_speed.asInstanceOf[js.Any], dl_speed_avg = dl_speed_avg.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], last_seen = last_seen.asInstanceOf[js.Any], nb_connections = nb_connections.asInstanceOf[js.Any], nb_connections_limit = nb_connections_limit.asInstanceOf[js.Any], peers = peers.asInstanceOf[js.Any], peers_total = peers_total.asInstanceOf[js.Any], piece_size = piece_size.asInstanceOf[js.Any], pieces_have = pieces_have.asInstanceOf[js.Any], pieces_num = pieces_num.asInstanceOf[js.Any], reannounce = reannounce.asInstanceOf[js.Any], save_path = save_path.asInstanceOf[js.Any], seeding_time = seeding_time.asInstanceOf[js.Any], seeds = seeds.asInstanceOf[js.Any], seeds_total = seeds_total.asInstanceOf[js.Any], share_ratio = share_ratio.asInstanceOf[js.Any], time_elapsed = time_elapsed.asInstanceOf[js.Any], total_downloaded = total_downloaded.asInstanceOf[js.Any], total_downloaded_session = total_downloaded_session.asInstanceOf[js.Any], total_size = total_size.asInstanceOf[js.Any], total_uploaded = total_uploaded.asInstanceOf[js.Any], total_uploaded_session = total_uploaded_session.asInstanceOf[js.Any], total_wasted = total_wasted.asInstanceOf[js.Any], up_limit = up_limit.asInstanceOf[js.Any], up_speed = up_speed.asInstanceOf[js.Any], up_speed_avg = up_speed_avg.asInstanceOf[js.Any])
    __obj.asInstanceOf[TorrentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TorrentInfo] (val x: Self) extends AnyVal {
    
    inline def setAddition_date(value: Double): Self = StObject.set(x, "addition_date", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCompletion_date(value: Double): Self = StObject.set(x, "completion_date", value.asInstanceOf[js.Any])
    
    inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
    
    inline def setCreation_date(value: Double): Self = StObject.set(x, "creation_date", value.asInstanceOf[js.Any])
    
    inline def setDl_limit(value: Double): Self = StObject.set(x, "dl_limit", value.asInstanceOf[js.Any])
    
    inline def setDl_speed(value: Double): Self = StObject.set(x, "dl_speed", value.asInstanceOf[js.Any])
    
    inline def setDl_speed_avg(value: Double): Self = StObject.set(x, "dl_speed_avg", value.asInstanceOf[js.Any])
    
    inline def setEta(value: Double): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
    
    inline def setLast_seen(value: Double): Self = StObject.set(x, "last_seen", value.asInstanceOf[js.Any])
    
    inline def setNb_connections(value: Double): Self = StObject.set(x, "nb_connections", value.asInstanceOf[js.Any])
    
    inline def setNb_connections_limit(value: Double): Self = StObject.set(x, "nb_connections_limit", value.asInstanceOf[js.Any])
    
    inline def setPeers(value: Double): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
    
    inline def setPeers_total(value: Double): Self = StObject.set(x, "peers_total", value.asInstanceOf[js.Any])
    
    inline def setPiece_size(value: Double): Self = StObject.set(x, "piece_size", value.asInstanceOf[js.Any])
    
    inline def setPieces_have(value: Double): Self = StObject.set(x, "pieces_have", value.asInstanceOf[js.Any])
    
    inline def setPieces_num(value: Double): Self = StObject.set(x, "pieces_num", value.asInstanceOf[js.Any])
    
    inline def setReannounce(value: Double): Self = StObject.set(x, "reannounce", value.asInstanceOf[js.Any])
    
    inline def setSave_path(value: String): Self = StObject.set(x, "save_path", value.asInstanceOf[js.Any])
    
    inline def setSeeding_time(value: Double): Self = StObject.set(x, "seeding_time", value.asInstanceOf[js.Any])
    
    inline def setSeeds(value: Double): Self = StObject.set(x, "seeds", value.asInstanceOf[js.Any])
    
    inline def setSeeds_total(value: Double): Self = StObject.set(x, "seeds_total", value.asInstanceOf[js.Any])
    
    inline def setShare_ratio(value: Double): Self = StObject.set(x, "share_ratio", value.asInstanceOf[js.Any])
    
    inline def setTime_elapsed(value: Double): Self = StObject.set(x, "time_elapsed", value.asInstanceOf[js.Any])
    
    inline def setTotal_downloaded(value: Double): Self = StObject.set(x, "total_downloaded", value.asInstanceOf[js.Any])
    
    inline def setTotal_downloaded_session(value: Double): Self = StObject.set(x, "total_downloaded_session", value.asInstanceOf[js.Any])
    
    inline def setTotal_size(value: Double): Self = StObject.set(x, "total_size", value.asInstanceOf[js.Any])
    
    inline def setTotal_uploaded(value: Double): Self = StObject.set(x, "total_uploaded", value.asInstanceOf[js.Any])
    
    inline def setTotal_uploaded_session(value: Double): Self = StObject.set(x, "total_uploaded_session", value.asInstanceOf[js.Any])
    
    inline def setTotal_wasted(value: Double): Self = StObject.set(x, "total_wasted", value.asInstanceOf[js.Any])
    
    inline def setUp_limit(value: Double): Self = StObject.set(x, "up_limit", value.asInstanceOf[js.Any])
    
    inline def setUp_speed(value: Double): Self = StObject.set(x, "up_speed", value.asInstanceOf[js.Any])
    
    inline def setUp_speed_avg(value: Double): Self = StObject.set(x, "up_speed_avg", value.asInstanceOf[js.Any])
  }
}
