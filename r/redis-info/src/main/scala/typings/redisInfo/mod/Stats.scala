package typings.redisInfo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stats extends StObject {
  
  var active_defrag_hits: String
  
  var active_defrag_key_hits: String
  
  var active_defrag_key_misses: String
  
  var active_defrag_misses: String
  
  var evicted_keys: String
  
  var expired_keys: String
  
  var expired_stale_perc: String
  
  var expired_time_cap_reached_count: String
  
  var instantaneous_input_kbps: String
  
  var instantaneous_ops_per_sec: String
  
  var instantaneous_output_kbps: String
  
  var keyspace_hits: String
  
  var keyspace_misses: String
  
  var latest_fork_usec: String
  
  var migrate_cached_sockets: String
  
  var pubsub_channels: String
  
  var pubsub_patterns: String
  
  var rejected_connections: String
  
  var slave_expires_tracked_keys: String
  
  var sync_full: String
  
  var sync_partial_err: String
  
  var sync_partial_ok: String
  
  var total_commands_processed: String
  
  var total_connections_received: String
  
  var total_net_input_bytes: String
  
  var total_net_output_bytes: String
}
object Stats {
  
  @scala.inline
  def apply(
    active_defrag_hits: String,
    active_defrag_key_hits: String,
    active_defrag_key_misses: String,
    active_defrag_misses: String,
    evicted_keys: String,
    expired_keys: String,
    expired_stale_perc: String,
    expired_time_cap_reached_count: String,
    instantaneous_input_kbps: String,
    instantaneous_ops_per_sec: String,
    instantaneous_output_kbps: String,
    keyspace_hits: String,
    keyspace_misses: String,
    latest_fork_usec: String,
    migrate_cached_sockets: String,
    pubsub_channels: String,
    pubsub_patterns: String,
    rejected_connections: String,
    slave_expires_tracked_keys: String,
    sync_full: String,
    sync_partial_err: String,
    sync_partial_ok: String,
    total_commands_processed: String,
    total_connections_received: String,
    total_net_input_bytes: String,
    total_net_output_bytes: String
  ): Stats = {
    val __obj = js.Dynamic.literal(active_defrag_hits = active_defrag_hits.asInstanceOf[js.Any], active_defrag_key_hits = active_defrag_key_hits.asInstanceOf[js.Any], active_defrag_key_misses = active_defrag_key_misses.asInstanceOf[js.Any], active_defrag_misses = active_defrag_misses.asInstanceOf[js.Any], evicted_keys = evicted_keys.asInstanceOf[js.Any], expired_keys = expired_keys.asInstanceOf[js.Any], expired_stale_perc = expired_stale_perc.asInstanceOf[js.Any], expired_time_cap_reached_count = expired_time_cap_reached_count.asInstanceOf[js.Any], instantaneous_input_kbps = instantaneous_input_kbps.asInstanceOf[js.Any], instantaneous_ops_per_sec = instantaneous_ops_per_sec.asInstanceOf[js.Any], instantaneous_output_kbps = instantaneous_output_kbps.asInstanceOf[js.Any], keyspace_hits = keyspace_hits.asInstanceOf[js.Any], keyspace_misses = keyspace_misses.asInstanceOf[js.Any], latest_fork_usec = latest_fork_usec.asInstanceOf[js.Any], migrate_cached_sockets = migrate_cached_sockets.asInstanceOf[js.Any], pubsub_channels = pubsub_channels.asInstanceOf[js.Any], pubsub_patterns = pubsub_patterns.asInstanceOf[js.Any], rejected_connections = rejected_connections.asInstanceOf[js.Any], slave_expires_tracked_keys = slave_expires_tracked_keys.asInstanceOf[js.Any], sync_full = sync_full.asInstanceOf[js.Any], sync_partial_err = sync_partial_err.asInstanceOf[js.Any], sync_partial_ok = sync_partial_ok.asInstanceOf[js.Any], total_commands_processed = total_commands_processed.asInstanceOf[js.Any], total_connections_received = total_connections_received.asInstanceOf[js.Any], total_net_input_bytes = total_net_input_bytes.asInstanceOf[js.Any], total_net_output_bytes = total_net_output_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  
  @scala.inline
  implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive_defrag_hits(value: String): Self = StObject.set(x, "active_defrag_hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive_defrag_key_hits(value: String): Self = StObject.set(x, "active_defrag_key_hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive_defrag_key_misses(value: String): Self = StObject.set(x, "active_defrag_key_misses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive_defrag_misses(value: String): Self = StObject.set(x, "active_defrag_misses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvicted_keys(value: String): Self = StObject.set(x, "evicted_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpired_keys(value: String): Self = StObject.set(x, "expired_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpired_stale_perc(value: String): Self = StObject.set(x, "expired_stale_perc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpired_time_cap_reached_count(value: String): Self = StObject.set(x, "expired_time_cap_reached_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstantaneous_input_kbps(value: String): Self = StObject.set(x, "instantaneous_input_kbps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstantaneous_ops_per_sec(value: String): Self = StObject.set(x, "instantaneous_ops_per_sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstantaneous_output_kbps(value: String): Self = StObject.set(x, "instantaneous_output_kbps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyspace_hits(value: String): Self = StObject.set(x, "keyspace_hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyspace_misses(value: String): Self = StObject.set(x, "keyspace_misses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatest_fork_usec(value: String): Self = StObject.set(x, "latest_fork_usec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrate_cached_sockets(value: String): Self = StObject.set(x, "migrate_cached_sockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsub_channels(value: String): Self = StObject.set(x, "pubsub_channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsub_patterns(value: String): Self = StObject.set(x, "pubsub_patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejected_connections(value: String): Self = StObject.set(x, "rejected_connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlave_expires_tracked_keys(value: String): Self = StObject.set(x, "slave_expires_tracked_keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSync_full(value: String): Self = StObject.set(x, "sync_full", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSync_partial_err(value: String): Self = StObject.set(x, "sync_partial_err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSync_partial_ok(value: String): Self = StObject.set(x, "sync_partial_ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_commands_processed(value: String): Self = StObject.set(x, "total_commands_processed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_connections_received(value: String): Self = StObject.set(x, "total_connections_received", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_net_input_bytes(value: String): Self = StObject.set(x, "total_net_input_bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_net_output_bytes(value: String): Self = StObject.set(x, "total_net_output_bytes", value.asInstanceOf[js.Any])
  }
}
