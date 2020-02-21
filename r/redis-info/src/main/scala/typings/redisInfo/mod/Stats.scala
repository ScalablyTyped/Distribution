package typings.redisInfo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
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
}

