package typings.qbittorrentApiV2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Torrent extends StObject {
  
  var added_on: Double
  
  var amount_left: Double
  
  var auto_tmm: Boolean
  
  var category: String
  
  var completed: Double
  
  var completion_on: Double
  
  var dl_limit: Double
  
  var dlspeed: Double
  
  var downloaded: Double
  
  var downloaded_session: Double
  
  var eta: Double
  
  var f_l_piece_prio: Boolean
  
  var force_start: Boolean
  
  var hash: String
  
  var last_activity: Double
  
  var magnet_uri: String
  
  var max_ratio: Double
  
  var max_seeding_time: Double
  
  var name: String
  
  var num_complete: Double
  
  var num_incomplete: Double
  
  var num_leechs: Double
  
  var num_seeds: Double
  
  var priority: Double
  
  var progress: Double
  
  var ratio: Double
  
  var ratio_limit: Double
  
  var save_path: String
  
  var seeding_time_limit: Double
  
  var seen_complete: Double
  
  var seq_dl: Boolean
  
  var size: Double
  
  var state: String
  
  var super_seeding: Boolean
  
  var tags: String
  
  var time_active: Double
  
  var total_size: Double
  
  var tracker: String
  
  var up_limit: Double
  
  var uploaded: Double
  
  var uploaded_session: Double
  
  var upspeed: Double
}
object Torrent {
  
  inline def apply(
    added_on: Double,
    amount_left: Double,
    auto_tmm: Boolean,
    category: String,
    completed: Double,
    completion_on: Double,
    dl_limit: Double,
    dlspeed: Double,
    downloaded: Double,
    downloaded_session: Double,
    eta: Double,
    f_l_piece_prio: Boolean,
    force_start: Boolean,
    hash: String,
    last_activity: Double,
    magnet_uri: String,
    max_ratio: Double,
    max_seeding_time: Double,
    name: String,
    num_complete: Double,
    num_incomplete: Double,
    num_leechs: Double,
    num_seeds: Double,
    priority: Double,
    progress: Double,
    ratio: Double,
    ratio_limit: Double,
    save_path: String,
    seeding_time_limit: Double,
    seen_complete: Double,
    seq_dl: Boolean,
    size: Double,
    state: String,
    super_seeding: Boolean,
    tags: String,
    time_active: Double,
    total_size: Double,
    tracker: String,
    up_limit: Double,
    uploaded: Double,
    uploaded_session: Double,
    upspeed: Double
  ): Torrent = {
    val __obj = js.Dynamic.literal(added_on = added_on.asInstanceOf[js.Any], amount_left = amount_left.asInstanceOf[js.Any], auto_tmm = auto_tmm.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], completion_on = completion_on.asInstanceOf[js.Any], dl_limit = dl_limit.asInstanceOf[js.Any], dlspeed = dlspeed.asInstanceOf[js.Any], downloaded = downloaded.asInstanceOf[js.Any], downloaded_session = downloaded_session.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], f_l_piece_prio = f_l_piece_prio.asInstanceOf[js.Any], force_start = force_start.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], last_activity = last_activity.asInstanceOf[js.Any], magnet_uri = magnet_uri.asInstanceOf[js.Any], max_ratio = max_ratio.asInstanceOf[js.Any], max_seeding_time = max_seeding_time.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], num_complete = num_complete.asInstanceOf[js.Any], num_incomplete = num_incomplete.asInstanceOf[js.Any], num_leechs = num_leechs.asInstanceOf[js.Any], num_seeds = num_seeds.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], ratio_limit = ratio_limit.asInstanceOf[js.Any], save_path = save_path.asInstanceOf[js.Any], seeding_time_limit = seeding_time_limit.asInstanceOf[js.Any], seen_complete = seen_complete.asInstanceOf[js.Any], seq_dl = seq_dl.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], super_seeding = super_seeding.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], time_active = time_active.asInstanceOf[js.Any], total_size = total_size.asInstanceOf[js.Any], tracker = tracker.asInstanceOf[js.Any], up_limit = up_limit.asInstanceOf[js.Any], uploaded = uploaded.asInstanceOf[js.Any], uploaded_session = uploaded_session.asInstanceOf[js.Any], upspeed = upspeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Torrent]
  }
  
  extension [Self <: Torrent](x: Self) {
    
    inline def setAdded_on(value: Double): Self = StObject.set(x, "added_on", value.asInstanceOf[js.Any])
    
    inline def setAmount_left(value: Double): Self = StObject.set(x, "amount_left", value.asInstanceOf[js.Any])
    
    inline def setAuto_tmm(value: Boolean): Self = StObject.set(x, "auto_tmm", value.asInstanceOf[js.Any])
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCompleted(value: Double): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
    
    inline def setCompletion_on(value: Double): Self = StObject.set(x, "completion_on", value.asInstanceOf[js.Any])
    
    inline def setDl_limit(value: Double): Self = StObject.set(x, "dl_limit", value.asInstanceOf[js.Any])
    
    inline def setDlspeed(value: Double): Self = StObject.set(x, "dlspeed", value.asInstanceOf[js.Any])
    
    inline def setDownloaded(value: Double): Self = StObject.set(x, "downloaded", value.asInstanceOf[js.Any])
    
    inline def setDownloaded_session(value: Double): Self = StObject.set(x, "downloaded_session", value.asInstanceOf[js.Any])
    
    inline def setEta(value: Double): Self = StObject.set(x, "eta", value.asInstanceOf[js.Any])
    
    inline def setF_l_piece_prio(value: Boolean): Self = StObject.set(x, "f_l_piece_prio", value.asInstanceOf[js.Any])
    
    inline def setForce_start(value: Boolean): Self = StObject.set(x, "force_start", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setLast_activity(value: Double): Self = StObject.set(x, "last_activity", value.asInstanceOf[js.Any])
    
    inline def setMagnet_uri(value: String): Self = StObject.set(x, "magnet_uri", value.asInstanceOf[js.Any])
    
    inline def setMax_ratio(value: Double): Self = StObject.set(x, "max_ratio", value.asInstanceOf[js.Any])
    
    inline def setMax_seeding_time(value: Double): Self = StObject.set(x, "max_seeding_time", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNum_complete(value: Double): Self = StObject.set(x, "num_complete", value.asInstanceOf[js.Any])
    
    inline def setNum_incomplete(value: Double): Self = StObject.set(x, "num_incomplete", value.asInstanceOf[js.Any])
    
    inline def setNum_leechs(value: Double): Self = StObject.set(x, "num_leechs", value.asInstanceOf[js.Any])
    
    inline def setNum_seeds(value: Double): Self = StObject.set(x, "num_seeds", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    
    inline def setRatio_limit(value: Double): Self = StObject.set(x, "ratio_limit", value.asInstanceOf[js.Any])
    
    inline def setSave_path(value: String): Self = StObject.set(x, "save_path", value.asInstanceOf[js.Any])
    
    inline def setSeeding_time_limit(value: Double): Self = StObject.set(x, "seeding_time_limit", value.asInstanceOf[js.Any])
    
    inline def setSeen_complete(value: Double): Self = StObject.set(x, "seen_complete", value.asInstanceOf[js.Any])
    
    inline def setSeq_dl(value: Boolean): Self = StObject.set(x, "seq_dl", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSuper_seeding(value: Boolean): Self = StObject.set(x, "super_seeding", value.asInstanceOf[js.Any])
    
    inline def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTime_active(value: Double): Self = StObject.set(x, "time_active", value.asInstanceOf[js.Any])
    
    inline def setTotal_size(value: Double): Self = StObject.set(x, "total_size", value.asInstanceOf[js.Any])
    
    inline def setTracker(value: String): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
    
    inline def setUp_limit(value: Double): Self = StObject.set(x, "up_limit", value.asInstanceOf[js.Any])
    
    inline def setUploaded(value: Double): Self = StObject.set(x, "uploaded", value.asInstanceOf[js.Any])
    
    inline def setUploaded_session(value: Double): Self = StObject.set(x, "uploaded_session", value.asInstanceOf[js.Any])
    
    inline def setUpspeed(value: Double): Self = StObject.set(x, "upspeed", value.asInstanceOf[js.Any])
  }
}
