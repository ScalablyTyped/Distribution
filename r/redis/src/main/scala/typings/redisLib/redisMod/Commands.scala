package typings
package redisLib.redisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commands[R] extends js.Object {
  @JSName("BITFIELD")
  var BITFIELD_Original: OverloadedKeyCommand[java.lang.String | scala.Double, js.Tuple2[scala.Double, scala.Double], R] = js.native
  @JSName("BLPOP")
  var BLPOP_Original: OverloadedLastCommand[java.lang.String, scala.Double, js.Tuple2[java.lang.String, java.lang.String], R] = js.native
  @JSName("BRPOP")
  var BRPOP_Original: OverloadedLastCommand[java.lang.String, scala.Double, js.Tuple2[java.lang.String, java.lang.String], R] = js.native
  @JSName("CLIENT")
  var CLIENT_Original: OverloadedCommand[java.lang.String, _, R] = js.native
  @JSName("CLUSTER")
  var CLUSTER_Original: OverloadedCommand[java.lang.String, _, this.type] = js.native
  @JSName("CONFIG")
  var CONFIG_Original: OverloadedCommand[java.lang.String, scala.Boolean, R] = js.native
  @JSName("DEBUG")
  var DEBUG_Original: OverloadedCommand[java.lang.String, scala.Boolean, R] = js.native
  @JSName("DEL")
  var DEL_Original: OverloadedCommand[java.lang.String, scala.Double, R] = js.native
  @JSName("EVALSHA")
  var EVALSHA_Original: OverloadedCommand[java.lang.String | scala.Double, _, R] = js.native
  @JSName("EVAL")
  var EVAL_Original: OverloadedCommand[java.lang.String | scala.Double, _, R] = js.native
  @JSName("EXISTS")
  var EXISTS_Original: OverloadedCommand[java.lang.String, scala.Double, R] = js.native
  @JSName("GEOADD")
  var GEOADD_Original: OverloadedKeyCommand[java.lang.String | scala.Double, scala.Double, R] = js.native
  @JSName("GEODIST")
  var GEODIST_Original: OverloadedKeyCommand[java.lang.String, java.lang.String, R] = js.native
  @JSName("GEOHASH")
  var GEOHASH_Original: OverloadedKeyCommand[java.lang.String, java.lang.String, R] = js.native
  @JSName("GEOPOS")
  var GEOPOS_Original: OverloadedKeyCommand[java.lang.String, js.Array[js.Tuple2[scala.Double, scala.Double]], R] = js.native
  @JSName("GEORADIUSBYMEMBER")
  var GEORADIUSBYMEMBER_Original: OverloadedKeyCommand[
    java.lang.String | scala.Double, 
    js.Array[
      java.lang.String | (js.Tuple2[
        java.lang.String, 
        java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
      ])
    ], 
    R
  ] = js.native
  @JSName("GEORADIUS")
  var GEORADIUS_Original: OverloadedKeyCommand[
    java.lang.String | scala.Double, 
    js.Array[
      java.lang.String | (js.Tuple2[
        java.lang.String, 
        java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
      ])
    ], 
    R
  ] = js.native
  @JSName("HDEL")
  var HDEL_Original: OverloadedKeyCommand[java.lang.String, scala.Double, R] = js.native
  @JSName("HMGET")
  var HMGET_Original: OverloadedKeyCommand[java.lang.String, js.Array[java.lang.String], R] = js.native
  @JSName("HMSET")
  var HMSET_Original: OverloadedSetCommand[java.lang.String | scala.Double, scala.Boolean, R] = js.native
  @JSName("HSCAN")
  var HSCAN_Original: OverloadedKeyCommand[java.lang.String, js.Tuple2[java.lang.String, js.Array[java.lang.String]], R] = js.native
  @JSName("LPUSH")
  var LPUSH_Original: OverloadedKeyCommand[java.lang.String, scala.Double, R] = js.native
  @JSName("MGET")
  var MGET_Original: OverloadedCommand[java.lang.String, js.Array[java.lang.String], R] = js.native
  @JSName("MIGRATE")
  var MIGRATE_Original: OverloadedCommand[java.lang.String, scala.Boolean, R] = js.native
  @JSName("MSETNX")
  var MSETNX_Original: OverloadedCommand[java.lang.String, scala.Boolean, R] = js.native
  @JSName("MSET")
  var MSET_Original: OverloadedCommand[java.lang.String, scala.Boolean, R] = js.native
  @JSName("OBJECT")
  var OBJECT_Original: OverloadedCommand[java.lang.String, _, R] = js.native
  @JSName("PFADD")
  var PFADD_Original: OverloadedKeyCommand[java.lang.String, scala.Double, R] = js.native
  @JSName("PFCOUNT")
  var PFCOUNT_Original: OverloadedCommand[java.lang.String, scala.Double, R] = js.native
  @JSName("PFMERGE")
  var PFMERGE_Original: OverloadedCommand[java.lang.String, scala.Boolean, R] = js.native
  @JSName("PSUBSCRIBE")
  var PSUBSCRIBE_Original: OverloadedListCommand[java.lang.String, java.lang.String, R] = js.native
  @JSName("PUBSUB")
  var PUBSUB_Original: OverloadedCommand[java.lang.String, scala.Double, R] = js.native
  @JSName("PUNSUBSCRIBE")
  var PUNSUBSCRIBE_Original: OverloadedListCommand[java.lang.String, java.lang.String, R] = js.native
  @JSName("RPUSH")
  var RPUSH_Original: OverloadedKeyCommand[java.lang.String, scala.Double, R] = js.native
  @JSName("SADD")
  var SADD_Original: OverloadedKeyCommand[java.lang.String, scala.Double, R] = js.native
  @JSName("SCAN")
  var SCAN_Original: OverloadedCommand[java.lang.String, js.Tuple2[java.lang.String, js.Array[java.lang.String]], R] = js.native
  @JSName("SCRIPT")
  var SCRIPT_Original: OverloadedCommand[java.lang.String, _, R] = js.native
  @JSName("SDIFFSTORE")
  var SDIFFSTORE_Original: OverloadedKeyCommand[java.lang.String, scala.Double, R] = js.native
  @JSName("SDIFF")
  var SDIFF_Original: OverloadedCommand[java.lang.String, js.Array[java.lang.String], R] = js.native
  @JSName("SHUTDOWN")
  var SHUTDOWN_Original: OverloadedCommand[java.lang.String, java.lang.String, R] = js.native
  @JSName("SINTERSTORE")
  var SINTERSTORE_Original: OverloadedCommand[java.lang.String, scala.Double, R] = js.native
  @JSName("SINTER")
  var SINTER_Original: OverloadedKeyCommand[java.lang.String, js.Array[java.lang.String], R] = js.native
  @JSName("SLOWLOG")
  var SLOWLOG_Original: OverloadedCommand[
    java.lang.String, 
    js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]], 
    R
  ] = js.native
  @JSName("SORT")
  var SORT_Original: OverloadedCommand[java.lang.String, js.Array[java.lang.String], R] = js.native
  @JSName("SREM")
  var SREM_Original: OverloadedKeyCommand[java.lang.String, scala.Double, R] = js.native
  @JSName("SSCAN")
  var SSCAN_Original: OverloadedKeyCommand[java.lang.String, js.Tuple2[java.lang.String, js.Array[java.lang.String]], R] = js.native
  @JSName("SUBSCRIBE")
  var SUBSCRIBE_Original: OverloadedListCommand[java.lang.String, java.lang.String, R] = js.native
  @JSName("SUNIONSTORE")
  var SUNIONSTORE_Original: OverloadedCommand[java.lang.String, scala.Double, R] = js.native
  @JSName("SUNION")
  var SUNION_Original: OverloadedCommand[java.lang.String, js.Array[java.lang.String], R] = js.native
  @JSName("UNSUBSCRIBE")
  var UNSUBSCRIBE_Original: OverloadedListCommand[java.lang.String, java.lang.String, R] = js.native
  @JSName("WATCH")
  var WATCH_Original: OverloadedCommand[java.lang.String, redisLib.redisLibStrings.OK, R] = js.native
  @JSName("ZADD")
  var ZADD_Original: OverloadedKeyCommand[java.lang.String | scala.Double, scala.Double, R] = js.native
  @JSName("ZINTERSTORE")
  var ZINTERSTORE_Original: OverloadedCommand[java.lang.String | scala.Double, scala.Double, R] = js.native
  @JSName("ZREM")
  var ZREM_Original: OverloadedKeyCommand[java.lang.String, scala.Double, R] = js.native
  @JSName("ZSCAN")
  var ZSCAN_Original: OverloadedKeyCommand[java.lang.String, js.Tuple2[java.lang.String, js.Array[java.lang.String]], R] = js.native
  @JSName("ZUNIONSTORE")
  var ZUNIONSTORE_Original: OverloadedCommand[java.lang.String | scala.Double, scala.Double, R] = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  @JSName("bitfield")
  var bitfield_Original: OverloadedKeyCommand[java.lang.String | scala.Double, js.Tuple2[scala.Double, scala.Double], R] = js.native
  /**
       * Remove and get the first element in a list, or block until one is available.
       */
  @JSName("blpop")
  var blpop_Original: OverloadedLastCommand[java.lang.String, scala.Double, js.Tuple2[java.lang.String, java.lang.String], R] = js.native
  /**
       * Remove and get the last element in a list, or block until one is available.
       */
  @JSName("brpop")
  var brpop_Original: OverloadedLastCommand[java.lang.String, scala.Double, js.Tuple2[java.lang.String, java.lang.String], R] = js.native
  /**
       * KILL - Kill the connection of a client.
       * LIST - Get the list of client connections.
       * GETNAME - Get the current connection name.
       * PAUSE - Stop processing commands from clients for some time.
       * REPLY - Instruct the server whether to reply to commands.
       * SETNAME - Set the current connection name.
       */
  @JSName("client")
  var client_Original: OverloadedCommand[java.lang.String, _, R] = js.native
  /**
       * ADDSLOTS - Assign new hash slots to receiving node.
       * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
       * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
       * DELSLOTS - Set hash slots as unbound in receiving node.
       * FAILOVER - Forces a slave to perform a manual failover of its master.
       * FORGET - Remove a node from the nodes table.
       * GETKEYSINSLOT - Return local key names in the specified hash slot.
       * INFO - Provides info about Redis Cluster node state.
       * KEYSLOT - Returns the hash slot of the specified key.
       * MEET - Force a node cluster to handshake with another node.
       * NODES - Get cluster config for the node.
       * REPLICATE - Reconfigure a node as a slave of the specified master node.
       * RESET - Reset a Redis Cluster node.
       * SAVECONFIG - Forces the node to save cluster state on disk.
       * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
       * SETSLOT - Bind a hash slot to a specified node.
       * SLAVES - List slave nodes of the specified master node.
       * SLOTS - Get array of Cluster slot to node mappings.
       */
  @JSName("cluster")
  var cluster_Original: OverloadedCommand[java.lang.String, _, this.type] = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get array of Redis command details.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific Redis command details.
       * GET - Get the value of a configuration parameter.
       * REWRITE - Rewrite the configuration file with the in memory configuration.
       * SET - Set a configuration parameter to the given value.
       * RESETSTAT - Reset the stats returned by INFO.
       */
  @JSName("config")
  var config_Original: OverloadedCommand[java.lang.String, scala.Boolean, R] = js.native
  /**
       * OBJECT - Get debugging information about a key.
       * SEGFAULT - Make the server crash.
       */
  @JSName("debug")
  var debug_Original: OverloadedCommand[java.lang.String, scala.Boolean, R] = js.native
  /**
       * Delete a key.
       */
  @JSName("del")
  var del_Original: OverloadedCommand[java.lang.String, scala.Double, R] = js.native
  /**
       * Execute a Lua script server side.
       */
  @JSName("eval")
  var eval_Original: OverloadedCommand[java.lang.String | scala.Double, _, R] = js.native
  /**
       * Execute a Lue script server side.
       */
  @JSName("evalsha")
  var evalsha_Original: OverloadedCommand[java.lang.String | scala.Double, _, R] = js.native
  /**
       * Determine if a key exists.
       */
  @JSName("exists")
  var exists_Original: OverloadedCommand[java.lang.String, scala.Double, R] = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  @JSName("geoadd")
  var geoadd_Original: OverloadedKeyCommand[java.lang.String | scala.Double, scala.Double, R] = js.native
  /**
       * Returns the distance between two members of a geospatial index.
       */
  @JSName("geodist")
  var geodist_Original: OverloadedKeyCommand[java.lang.String, java.lang.String, R] = js.native
  /**
       * Returns members of a geospatial index as standard geohash strings.
       */
  @JSName("geohash")
  var geohash_Original: OverloadedKeyCommand[java.lang.String, java.lang.String, R] = js.native
  /**
       * Returns longitude and latitude of members of a geospatial index.
       */
  @JSName("geopos")
  var geopos_Original: OverloadedKeyCommand[java.lang.String, js.Array[js.Tuple2[scala.Double, scala.Double]], R] = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  @JSName("georadius")
  var georadius_Original: OverloadedKeyCommand[
    java.lang.String | scala.Double, 
    js.Array[
      java.lang.String | (js.Tuple2[
        java.lang.String, 
        java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
      ])
    ], 
    R
  ] = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  @JSName("georadiusbymember")
  var georadiusbymember_Original: OverloadedKeyCommand[
    java.lang.String | scala.Double, 
    js.Array[
      java.lang.String | (js.Tuple2[
        java.lang.String, 
        java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
      ])
    ], 
    R
  ] = js.native
  /**
       * Delete on or more hash fields.
       */
  @JSName("hdel")
  var hdel_Original: OverloadedKeyCommand[java.lang.String, scala.Double, R] = js.native
  /**
       * Get the values of all the given hash fields.
       */
  @JSName("hmget")
  var hmget_Original: OverloadedKeyCommand[java.lang.String, js.Array[java.lang.String], R] = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  @JSName("hmset")
  var hmset_Original: OverloadedSetCommand[java.lang.String | scala.Double, scala.Boolean, R] = js.native
  /**
       * Incrementally iterate hash fields and associated values.
       */
  @JSName("hscan")
  var hscan_Original: OverloadedKeyCommand[java.lang.String, js.Tuple2[java.lang.String, js.Array[java.lang.String]], R] = js.native
  /**
       * Prepend one or multiple values to a list.
       */
  @JSName("lpush")
  var lpush_Original: OverloadedKeyCommand[java.lang.String, scala.Double, R] = js.native
  /**
       * Get the values of all given keys.
       */
  @JSName("mget")
  var mget_Original: OverloadedCommand[java.lang.String, js.Array[java.lang.String], R] = js.native
  /**
       * Atomically tranfer a key from a Redis instance to another one.
       */
  @JSName("migrate")
  var migrate_Original: OverloadedCommand[java.lang.String, scala.Boolean, R] = js.native
  /**
       * Set multiple keys to multiple values.
       */
  @JSName("mset")
  var mset_Original: OverloadedCommand[java.lang.String, scala.Boolean, R] = js.native
  /**
       * Set multiple keys to multiple values, only if none of the keys exist.
       */
  @JSName("msetnx")
  var msetnx_Original: OverloadedCommand[java.lang.String, scala.Boolean, R] = js.native
  /**
       * Inspect the internals of Redis objects.
       */
  @JSName("object")
  var object_Original: OverloadedCommand[java.lang.String, _, R] = js.native
  /**
       * Adds the specified elements to the specified HyperLogLog.
       */
  @JSName("pfadd")
  var pfadd_Original: OverloadedKeyCommand[java.lang.String, scala.Double, R] = js.native
  /**
       * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
       */
  @JSName("pfcount")
  var pfcount_Original: OverloadedCommand[java.lang.String, scala.Double, R] = js.native
  /**
       * Merge N different HyperLogLogs into a single one.
       */
  @JSName("pfmerge")
  var pfmerge_Original: OverloadedCommand[java.lang.String, scala.Boolean, R] = js.native
  /**
       * Listen for messages published to channels matching the given patterns.
       */
  @JSName("psubscribe")
  var psubscribe_Original: OverloadedListCommand[java.lang.String, java.lang.String, R] = js.native
  /**
       * Inspect the state of the Pub/Sub subsytem.
       */
  @JSName("pubsub")
  var pubsub_Original: OverloadedCommand[java.lang.String, scala.Double, R] = js.native
  /**
       * Stop listening for messages posted to channels matching the given patterns.
       */
  @JSName("punsubscribe")
  var punsubscribe_Original: OverloadedListCommand[java.lang.String, java.lang.String, R] = js.native
  /**
       * Append one or multiple values to a list.
       */
  @JSName("rpush")
  var rpush_Original: OverloadedKeyCommand[java.lang.String, scala.Double, R] = js.native
  /**
       * Append one or multiple members to a set.
       */
  @JSName("sadd")
  var sadd_Original: OverloadedKeyCommand[java.lang.String, scala.Double, R] = js.native
  /**
       * Incrementally iterate the keys space.
       */
  @JSName("scan")
  var scan_Original: OverloadedCommand[java.lang.String, js.Tuple2[java.lang.String, js.Array[java.lang.String]], R] = js.native
  /**
       * DEBUG - Set the debug mode for executed scripts.
       * EXISTS - Check existence of scripts in the script cache.
       * FLUSH - Remove all scripts from the script cache.
       * KILL - Kill the script currently in execution.
       * LOAD - Load the specified Lua script into the script cache.
       */
  @JSName("script")
  var script_Original: OverloadedCommand[java.lang.String, _, R] = js.native
  /**
       * Subtract multiple sets.
       */
  @JSName("sdiff")
  var sdiff_Original: OverloadedCommand[java.lang.String, js.Array[java.lang.String], R] = js.native
  /**
       * Subtract multiple sets and store the resulting set in a key.
       */
  @JSName("sdiffstore")
  var sdiffstore_Original: OverloadedKeyCommand[java.lang.String, scala.Double, R] = js.native
  /**
       * Synchronously save the dataset to disk and then shut down the server.
       */
  @JSName("shutdown")
  var shutdown_Original: OverloadedCommand[java.lang.String, java.lang.String, R] = js.native
  /**
       * Intersect multiple sets.
       */
  @JSName("sinter")
  var sinter_Original: OverloadedKeyCommand[java.lang.String, js.Array[java.lang.String], R] = js.native
  /**
       * Intersect multiple sets and store the resulting set in a key.
       */
  @JSName("sinterstore")
  var sinterstore_Original: OverloadedCommand[java.lang.String, scala.Double, R] = js.native
  /**
       * Manages the Redis slow queries log.
       */
  @JSName("slowlog")
  var slowlog_Original: OverloadedCommand[
    java.lang.String, 
    js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]], 
    R
  ] = js.native
  /**
       * Sort the elements in a list, set or sorted set.
       */
  @JSName("sort")
  var sort_Original: OverloadedCommand[java.lang.String, js.Array[java.lang.String], R] = js.native
  /**
       * Remove one or more members from a set.
       */
  @JSName("srem")
  var srem_Original: OverloadedKeyCommand[java.lang.String, scala.Double, R] = js.native
  /**
       * Incrementally iterate Set elements.
       */
  @JSName("sscan")
  var sscan_Original: OverloadedKeyCommand[java.lang.String, js.Tuple2[java.lang.String, js.Array[java.lang.String]], R] = js.native
  /**
       * Listen for messages published to the given channels.
       */
  @JSName("subscribe")
  var subscribe_Original: OverloadedListCommand[java.lang.String, java.lang.String, R] = js.native
  /**
       * Add multiple sets.
       */
  @JSName("sunion")
  var sunion_Original: OverloadedCommand[java.lang.String, js.Array[java.lang.String], R] = js.native
  /**
       * Add multiple sets and store the resulting set in a key.
       */
  @JSName("sunionstore")
  var sunionstore_Original: OverloadedCommand[java.lang.String, scala.Double, R] = js.native
  /**
       * Stop listening for messages posted to the given channels.
       */
  @JSName("unsubscribe")
  var unsubscribe_Original: OverloadedListCommand[java.lang.String, java.lang.String, R] = js.native
  /**
       * Watch the given keys to determine execution of the MULTI/EXEC block.
       */
  @JSName("watch")
  var watch_Original: OverloadedCommand[java.lang.String, redisLib.redisLibStrings.OK, R] = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  @JSName("zadd")
  var zadd_Original: OverloadedKeyCommand[java.lang.String | scala.Double, scala.Double, R] = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  @JSName("zinterstore")
  var zinterstore_Original: OverloadedCommand[java.lang.String | scala.Double, scala.Double, R] = js.native
  /**
       * Remove one or more members from a sorted set.
       */
  @JSName("zrem")
  var zrem_Original: OverloadedKeyCommand[java.lang.String, scala.Double, R] = js.native
  /**
       * Incrementally iterate sorted sets elements and associated scores.
       */
  @JSName("zscan")
  var zscan_Original: OverloadedKeyCommand[java.lang.String, js.Tuple2[java.lang.String, js.Array[java.lang.String]], R] = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  @JSName("zunionstore")
  var zunionstore_Original: OverloadedCommand[java.lang.String | scala.Double, scala.Double, R] = js.native
  def APPEND(key: java.lang.String, value: java.lang.String): R = js.native
  def APPEND(key: java.lang.String, value: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def AUTH(password: java.lang.String): R = js.native
  def AUTH(password: java.lang.String, callback: Callback[java.lang.String]): R = js.native
  def BGREWRITEAOF(): R = js.native
  @JSName("BGREWRITEAOF")
  def BGREWRITEAOF_OK(cb: Callback[redisLib.redisLibStrings.OK]): R = js.native
  def BGSAVE(): R = js.native
  def BGSAVE(cb: Callback[java.lang.String]): R = js.native
  def BITCOUNT(key: java.lang.String): R = js.native
  def BITCOUNT(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def BITCOUNT(key: java.lang.String, start: scala.Double, end: scala.Double): R = js.native
  def BITCOUNT(key: java.lang.String, start: scala.Double, end: scala.Double, cb: Callback[scala.Double]): R = js.native
  def BITFIELD(args: (java.lang.String | scala.Double | (Callback[js.Tuple2[scala.Double, scala.Double]]))*): R = js.native
  def BITFIELD(key: java.lang.String, arg1: java.lang.String | scala.Double): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def BITFIELD(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double): R = js.native
  def BITFIELD(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(key: java.lang.String, arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: js.Array[java.lang.String | scala.Double],
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String): R = js.native
  def BITFIELD(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(key: java.lang.String, arg1: scala.Double, arg2: scala.Double): R = js.native
  def BITFIELD(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  def BITFIELD(
    key: java.lang.String,
    args: (java.lang.String | scala.Double | (Callback[js.Tuple2[scala.Double, scala.Double]]))*
  ): R = js.native
  def BITOP(
    operation: java.lang.String,
    destkey: java.lang.String,
    args: (java.lang.String | Callback[scala.Double])*
  ): R = js.native
  def BITOP(
    operation: java.lang.String,
    destkey: java.lang.String,
    key1: java.lang.String,
    key2: java.lang.String
  ): R = js.native
  def BITOP(
    operation: java.lang.String,
    destkey: java.lang.String,
    key1: java.lang.String,
    key2: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def BITOP(
    operation: java.lang.String,
    destkey: java.lang.String,
    key1: java.lang.String,
    key2: java.lang.String,
    key3: java.lang.String
  ): R = js.native
  def BITOP(
    operation: java.lang.String,
    destkey: java.lang.String,
    key1: java.lang.String,
    key2: java.lang.String,
    key3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def BITOP(operation: java.lang.String, destkey: java.lang.String, key: java.lang.String): R = js.native
  def BITOP(
    operation: java.lang.String,
    destkey: java.lang.String,
    key: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def BITPOS(key: java.lang.String, bit: scala.Double): R = js.native
  def BITPOS(key: java.lang.String, bit: scala.Double, cb: Callback[scala.Double]): R = js.native
  def BITPOS(key: java.lang.String, bit: scala.Double, start: scala.Double): R = js.native
  def BITPOS(key: java.lang.String, bit: scala.Double, start: scala.Double, cb: Callback[scala.Double]): R = js.native
  def BITPOS(key: java.lang.String, bit: scala.Double, start: scala.Double, end: scala.Double): R = js.native
  def BITPOS(
    key: java.lang.String,
    bit: scala.Double,
    start: scala.Double,
    end: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def BLPOP(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: scala.Double
  ): R = js.native
  def BLPOP(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  def BLPOP(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: scala.Double
  ): R = js.native
  def BLPOP(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  def BLPOP(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  def BLPOP(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  def BLPOP(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def BLPOP(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  def BLPOP(arg1: java.lang.String, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  def BLPOP(
    arg1: java.lang.String,
    arg2: js.Array[java.lang.String | scala.Double],
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  def BLPOP(arg1: java.lang.String, arg2: scala.Double): R = js.native
  def BLPOP(
    arg1: java.lang.String,
    arg2: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  def BLPOP(
    args: (java.lang.String | scala.Double | (Callback[js.Tuple2[java.lang.String, java.lang.String]]))*
  ): R = js.native
  def BLPOP(args: js.Array[java.lang.String | scala.Double]): R = js.native
  def BLPOP(
    args: js.Array[java.lang.String | scala.Double],
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  def BRPOP(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: scala.Double
  ): R = js.native
  def BRPOP(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  def BRPOP(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: scala.Double
  ): R = js.native
  def BRPOP(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  def BRPOP(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  def BRPOP(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  def BRPOP(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def BRPOP(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  def BRPOP(arg1: java.lang.String, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  def BRPOP(
    arg1: java.lang.String,
    arg2: js.Array[java.lang.String | scala.Double],
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  def BRPOP(arg1: java.lang.String, arg2: scala.Double): R = js.native
  def BRPOP(
    arg1: java.lang.String,
    arg2: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  def BRPOP(
    args: (java.lang.String | scala.Double | (Callback[js.Tuple2[java.lang.String, java.lang.String]]))*
  ): R = js.native
  def BRPOP(args: js.Array[java.lang.String | scala.Double]): R = js.native
  def BRPOP(
    args: js.Array[java.lang.String | scala.Double],
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  def BRPOPLPUSH(source: java.lang.String, destination: java.lang.String, timeout: scala.Double): R = js.native
  def BRPOPLPUSH(
    source: java.lang.String,
    destination: java.lang.String,
    timeout: scala.Double,
    cb: Callback[java.lang.String | scala.Null]
  ): R = js.native
  def CLIENT(arg1: java.lang.String): R = js.native
  def CLIENT(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def CLIENT(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def CLIENT(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def CLIENT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def CLIENT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def CLIENT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def CLIENT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def CLIENT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def CLIENT(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[_]): R = js.native
  def CLIENT(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[_]): R = js.native
  def CLIENT(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def CLIENT(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[_]): R = js.native
  def CLIENT(arg1: java.lang.String, cb: Callback[_]): R = js.native
  def CLIENT(arg1: js.Array[java.lang.String]): R = js.native
  def CLIENT(arg1: js.Array[java.lang.String], cb: Callback[_]): R = js.native
  def CLIENT(args: (java.lang.String | Callback[_])*): R = js.native
  def CLUSTER(arg1: java.lang.String): this.type = js.native
  def CLUSTER(arg1: java.lang.String, arg2: java.lang.String): this.type = js.native
  def CLUSTER(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): this.type = js.native
  def CLUSTER(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): this.type = js.native
  def CLUSTER(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): this.type = js.native
  def CLUSTER(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): this.type = js.native
  def CLUSTER(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[_]
  ): this.type = js.native
  def CLUSTER(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[_]
  ): this.type = js.native
  def CLUSTER(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): this.type = js.native
  def CLUSTER(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[_]): this.type = js.native
  def CLUSTER(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[_]): this.type = js.native
  def CLUSTER(arg1: java.lang.String, arg2: js.Array[java.lang.String]): this.type = js.native
  def CLUSTER(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[_]): this.type = js.native
  def CLUSTER(arg1: java.lang.String, cb: Callback[_]): this.type = js.native
  def CLUSTER(arg1: js.Array[java.lang.String]): this.type = js.native
  def CLUSTER(arg1: js.Array[java.lang.String], cb: Callback[_]): this.type = js.native
  def CLUSTER(args: (java.lang.String | Callback[_])*): this.type = js.native
  def COMMAND(): R = js.native
  def COMMAND(
    cb: Callback[
      js.Array[
        js.Tuple6[
          java.lang.String, 
          scala.Double, 
          js.Array[java.lang.String], 
          scala.Double, 
          scala.Double, 
          scala.Double
        ]
      ]
    ]
  ): R = js.native
  def CONFIG(arg1: java.lang.String): R = js.native
  def CONFIG(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def CONFIG(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def CONFIG(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def CONFIG(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def CONFIG(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def CONFIG(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def CONFIG(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def CONFIG(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def CONFIG(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def CONFIG(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  def CONFIG(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def CONFIG(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  def CONFIG(arg1: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  def CONFIG(arg1: js.Array[java.lang.String]): R = js.native
  def CONFIG(arg1: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  def CONFIG(args: (java.lang.String | Callback[scala.Boolean])*): R = js.native
  def DBSIZE(): R = js.native
  def DBSIZE(cb: Callback[scala.Double]): R = js.native
  def DEBUG(arg1: java.lang.String): R = js.native
  def DEBUG(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def DEBUG(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def DEBUG(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def DEBUG(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def DEBUG(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def DEBUG(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def DEBUG(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def DEBUG(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def DEBUG(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def DEBUG(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  def DEBUG(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def DEBUG(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  def DEBUG(arg1: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  def DEBUG(arg1: js.Array[java.lang.String]): R = js.native
  def DEBUG(arg1: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  def DEBUG(args: (java.lang.String | Callback[scala.Boolean])*): R = js.native
  def DECR(key: java.lang.String): R = js.native
  def DECR(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def DECRBY(key: java.lang.String, decrement: scala.Double): R = js.native
  def DECRBY(key: java.lang.String, decrement: scala.Double, cb: Callback[scala.Double]): R = js.native
  def DEL(arg1: java.lang.String): R = js.native
  def DEL(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def DEL(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def DEL(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def DEL(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def DEL(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def DEL(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def DEL(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def DEL(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def DEL(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def DEL(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def DEL(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def DEL(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def DEL(arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def DEL(arg1: js.Array[java.lang.String]): R = js.native
  def DEL(arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def DEL(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def DISCARD(): R = js.native
  @JSName("DISCARD")
  def DISCARD_OK(cb: Callback[redisLib.redisLibStrings.OK]): R = js.native
  def DUMP(key: java.lang.String): R = js.native
  def DUMP(key: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def ECHO[T /* <: java.lang.String */](message: T): R = js.native
  def ECHO[T /* <: java.lang.String */](message: T, cb: Callback[T]): R = js.native
  def EVAL(arg1: java.lang.String | scala.Double): R = js.native
  def EVAL(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  def EVAL(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  def EVAL(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[_]
  ): R = js.native
  def EVAL(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[_]
  ): R = js.native
  def EVAL(arg1: java.lang.String | scala.Double, cb: Callback[_]): R = js.native
  def EVAL(arg1: java.lang.String, arg2: java.lang.String | scala.Double): R = js.native
  def EVAL(arg1: java.lang.String, arg2: java.lang.String | scala.Double, cb: Callback[_]): R = js.native
  def EVAL(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def EVAL(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def EVAL(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def EVAL(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  def EVAL(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  def EVAL(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[_]): R = js.native
  def EVAL(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def EVAL(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, arg4: java.lang.String): R = js.native
  def EVAL(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def EVAL(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, arg4: scala.Double): R = js.native
  def EVAL(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  def EVAL(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, cb: Callback[_]): R = js.native
  def EVAL(arg1: java.lang.String, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  def EVAL(arg1: java.lang.String, arg2: js.Array[java.lang.String | scala.Double], cb: Callback[_]): R = js.native
  def EVAL(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def EVAL(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def EVAL(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def EVAL(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, arg4: scala.Double): R = js.native
  def EVAL(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  def EVAL(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, cb: Callback[_]): R = js.native
  def EVAL(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  def EVAL(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, arg4: java.lang.String): R = js.native
  def EVAL(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def EVAL(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double): R = js.native
  def EVAL(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  def EVAL(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, cb: Callback[_]): R = js.native
  def EVAL(arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  def EVAL(arg1: js.Array[java.lang.String | scala.Double], cb: Callback[_]): R = js.native
  def EVAL(arg1: scala.Double, arg2: java.lang.String | scala.Double): R = js.native
  def EVAL(arg1: scala.Double, arg2: java.lang.String | scala.Double, cb: Callback[_]): R = js.native
  def EVAL(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def EVAL(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def EVAL(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def EVAL(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  def EVAL(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  def EVAL(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[_]): R = js.native
  def EVAL(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def EVAL(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, arg4: java.lang.String): R = js.native
  def EVAL(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def EVAL(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, arg4: scala.Double): R = js.native
  def EVAL(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  def EVAL(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, cb: Callback[_]): R = js.native
  def EVAL(arg1: scala.Double, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  def EVAL(arg1: scala.Double, arg2: js.Array[java.lang.String | scala.Double], cb: Callback[_]): R = js.native
  def EVAL(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def EVAL(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def EVAL(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def EVAL(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, arg4: scala.Double): R = js.native
  def EVAL(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  def EVAL(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, cb: Callback[_]): R = js.native
  def EVAL(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  def EVAL(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: java.lang.String): R = js.native
  def EVAL(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def EVAL(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double): R = js.native
  def EVAL(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double, cb: Callback[_]): R = js.native
  def EVAL(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, cb: Callback[_]): R = js.native
  def EVAL(args: (java.lang.String | scala.Double | Callback[_])*): R = js.native
  def EVALSHA(arg1: java.lang.String | scala.Double): R = js.native
  def EVALSHA(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  def EVALSHA(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  def EVALSHA(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[_]
  ): R = js.native
  def EVALSHA(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[_]
  ): R = js.native
  def EVALSHA(arg1: java.lang.String | scala.Double, cb: Callback[_]): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: java.lang.String | scala.Double): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: java.lang.String | scala.Double, cb: Callback[_]): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def EVALSHA(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  def EVALSHA(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[_]): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, arg4: java.lang.String): R = js.native
  def EVALSHA(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, arg4: scala.Double): R = js.native
  def EVALSHA(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, cb: Callback[_]): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: js.Array[java.lang.String | scala.Double], cb: Callback[_]): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def EVALSHA(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, arg4: scala.Double): R = js.native
  def EVALSHA(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, cb: Callback[_]): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, arg4: java.lang.String): R = js.native
  def EVALSHA(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double): R = js.native
  def EVALSHA(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  def EVALSHA(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, cb: Callback[_]): R = js.native
  def EVALSHA(arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  def EVALSHA(arg1: js.Array[java.lang.String | scala.Double], cb: Callback[_]): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: java.lang.String | scala.Double): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: java.lang.String | scala.Double, cb: Callback[_]): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def EVALSHA(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  def EVALSHA(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[_]): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, arg4: java.lang.String): R = js.native
  def EVALSHA(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, arg4: scala.Double): R = js.native
  def EVALSHA(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, cb: Callback[_]): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: js.Array[java.lang.String | scala.Double], cb: Callback[_]): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def EVALSHA(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, arg4: scala.Double): R = js.native
  def EVALSHA(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, cb: Callback[_]): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: java.lang.String): R = js.native
  def EVALSHA(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double, cb: Callback[_]): R = js.native
  def EVALSHA(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, cb: Callback[_]): R = js.native
  def EVALSHA(args: (java.lang.String | scala.Double | Callback[_])*): R = js.native
  def EXISTS(arg1: java.lang.String): R = js.native
  def EXISTS(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def EXISTS(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def EXISTS(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def EXISTS(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def EXISTS(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def EXISTS(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def EXISTS(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def EXISTS(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def EXISTS(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def EXISTS(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def EXISTS(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def EXISTS(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def EXISTS(arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def EXISTS(arg1: js.Array[java.lang.String]): R = js.native
  def EXISTS(arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def EXISTS(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def EXPIRE(key: java.lang.String, seconds: scala.Double): R = js.native
  def EXPIRE(key: java.lang.String, seconds: scala.Double, cb: Callback[scala.Double]): R = js.native
  def EXPIREAT(key: java.lang.String, timestamp: scala.Double): R = js.native
  def EXPIREAT(key: java.lang.String, timestamp: scala.Double, cb: Callback[scala.Double]): R = js.native
  def FLUSHALL(): R = js.native
  def FLUSHALL(cb: Callback[java.lang.String]): R = js.native
  def FLUSHDB(): R = js.native
  def FLUSHDB(cb: Callback[java.lang.String]): R = js.native
  def GEOADD(args: (java.lang.String | scala.Double | Callback[scala.Double])*): R = js.native
  def GEOADD(key: java.lang.String, arg1: java.lang.String | scala.Double): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(key: java.lang.String, arg1: java.lang.String | scala.Double, cb: Callback[scala.Double]): R = js.native
  def GEOADD(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def GEOADD(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def GEOADD(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double): R = js.native
  def GEOADD(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, cb: Callback[scala.Double]): R = js.native
  def GEOADD(key: java.lang.String, arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  def GEOADD(key: java.lang.String, arg1: js.Array[java.lang.String | scala.Double], cb: Callback[scala.Double]): R = js.native
  def GEOADD(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String): R = js.native
  def GEOADD(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def GEOADD(key: java.lang.String, arg1: scala.Double, arg2: scala.Double): R = js.native
  def GEOADD(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def GEOADD(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, cb: Callback[scala.Double]): R = js.native
  def GEOADD(key: java.lang.String, args: (java.lang.String | scala.Double | Callback[scala.Double])*): R = js.native
  def GEODIST(args: (java.lang.String | Callback[java.lang.String])*): R = js.native
  def GEODIST(key: java.lang.String, arg1: java.lang.String): R = js.native
  def GEODIST(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def GEODIST(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def GEODIST(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def GEODIST(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def GEODIST(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def GEODIST(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def GEODIST(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def GEODIST(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def GEODIST(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def GEODIST(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def GEODIST(key: java.lang.String, arg1: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def GEODIST(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  def GEODIST(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[java.lang.String]): R = js.native
  def GEODIST(key: java.lang.String, args: (java.lang.String | Callback[java.lang.String])*): R = js.native
  def GEOHASH(args: (java.lang.String | Callback[java.lang.String])*): R = js.native
  def GEOHASH(key: java.lang.String, arg1: java.lang.String): R = js.native
  def GEOHASH(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def GEOHASH(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def GEOHASH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def GEOHASH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def GEOHASH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def GEOHASH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def GEOHASH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def GEOHASH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def GEOHASH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def GEOHASH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def GEOHASH(key: java.lang.String, arg1: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def GEOHASH(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  def GEOHASH(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[java.lang.String]): R = js.native
  def GEOHASH(key: java.lang.String, args: (java.lang.String | Callback[java.lang.String])*): R = js.native
  def GEOPOS(args: (java.lang.String | (Callback[js.Array[js.Tuple2[scala.Double, scala.Double]]]))*): R = js.native
  def GEOPOS(key: java.lang.String, arg1: java.lang.String): R = js.native
  def GEOPOS(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def GEOPOS(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def GEOPOS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def GEOPOS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def GEOPOS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def GEOPOS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Array[js.Tuple2[scala.Double, scala.Double]]]
  ): R = js.native
  def GEOPOS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Array[js.Tuple2[scala.Double, scala.Double]]]
  ): R = js.native
  def GEOPOS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Array[js.Tuple2[scala.Double, scala.Double]]]
  ): R = js.native
  def GEOPOS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Array[js.Tuple2[scala.Double, scala.Double]]]
  ): R = js.native
  def GEOPOS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[js.Array[js.Tuple2[scala.Double, scala.Double]]]
  ): R = js.native
  def GEOPOS(
    key: java.lang.String,
    arg1: java.lang.String,
    cb: Callback[js.Array[js.Tuple2[scala.Double, scala.Double]]]
  ): R = js.native
  def GEOPOS(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  def GEOPOS(
    key: java.lang.String,
    arg1: js.Array[java.lang.String],
    cb: Callback[js.Array[js.Tuple2[scala.Double, scala.Double]]]
  ): R = js.native
  def GEOPOS(
    key: java.lang.String,
    args: (java.lang.String | (Callback[js.Array[js.Tuple2[scala.Double, scala.Double]]]))*
  ): R = js.native
  def GEORADIUS(
    args: (java.lang.String | scala.Double | (Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]))*
  ): R = js.native
  def GEORADIUS(key: java.lang.String, arg1: java.lang.String | scala.Double): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def GEORADIUS(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double): R = js.native
  def GEORADIUS(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(key: java.lang.String, arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: js.Array[java.lang.String | scala.Double],
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String): R = js.native
  def GEORADIUS(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(key: java.lang.String, arg1: scala.Double, arg2: scala.Double): R = js.native
  def GEORADIUS(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUS(
    key: java.lang.String,
    args: (java.lang.String | scala.Double | (Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]))*
  ): R = js.native
  def GEORADIUSBYMEMBER(
    args: (java.lang.String | scala.Double | (Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]))*
  ): R = js.native
  def GEORADIUSBYMEMBER(key: java.lang.String, arg1: java.lang.String | scala.Double): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def GEORADIUSBYMEMBER(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double): R = js.native
  def GEORADIUSBYMEMBER(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(key: java.lang.String, arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: js.Array[java.lang.String | scala.Double],
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String): R = js.native
  def GEORADIUSBYMEMBER(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(key: java.lang.String, arg1: scala.Double, arg2: scala.Double): R = js.native
  def GEORADIUSBYMEMBER(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  def GEORADIUSBYMEMBER(
    key: java.lang.String,
    args: (java.lang.String | scala.Double | (Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]))*
  ): R = js.native
  def GET(key: java.lang.String): R = js.native
  def GET(key: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def GETBIT(key: java.lang.String, offset: scala.Double): R = js.native
  def GETBIT(key: java.lang.String, offset: scala.Double, cb: Callback[scala.Double]): R = js.native
  def GETRANGE(key: java.lang.String, start: scala.Double, end: scala.Double): R = js.native
  def GETRANGE(key: java.lang.String, start: scala.Double, end: scala.Double, cb: Callback[java.lang.String]): R = js.native
  def GETSET(key: java.lang.String, value: java.lang.String): R = js.native
  def GETSET(key: java.lang.String, value: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def HDEL(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def HDEL(key: java.lang.String, arg1: java.lang.String): R = js.native
  def HDEL(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def HDEL(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def HDEL(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def HDEL(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def HDEL(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def HDEL(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def HDEL(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def HDEL(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def HDEL(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def HDEL(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def HDEL(key: java.lang.String, arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def HDEL(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  def HDEL(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def HDEL(key: java.lang.String, args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def HEXISTS(key: java.lang.String, field: java.lang.String): R = js.native
  def HEXISTS(key: java.lang.String, field: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def HGET(key: java.lang.String, field: java.lang.String): R = js.native
  def HGET(key: java.lang.String, field: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def HGETALL(key: java.lang.String): R = js.native
  def HGETALL(key: java.lang.String, cb: Callback[ScalablyTyped.runtime.StringDictionary[java.lang.String]]): R = js.native
  def HINCRBY(key: java.lang.String, field: java.lang.String, increment: scala.Double): R = js.native
  def HINCRBY(
    key: java.lang.String,
    field: java.lang.String,
    increment: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def HINCRBYFLOAT(key: java.lang.String, field: java.lang.String, increment: scala.Double): R = js.native
  def HINCRBYFLOAT(
    key: java.lang.String,
    field: java.lang.String,
    increment: scala.Double,
    cb: Callback[java.lang.String]
  ): R = js.native
  def HKEYS(key: java.lang.String): R = js.native
  def HKEYS(key: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  def HLEN(key: java.lang.String): R = js.native
  def HLEN(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def HMGET(args: (java.lang.String | Callback[js.Array[java.lang.String]])*): R = js.native
  def HMGET(key: java.lang.String, arg1: java.lang.String): R = js.native
  def HMGET(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def HMGET(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def HMGET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def HMGET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def HMGET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def HMGET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def HMGET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def HMGET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def HMGET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def HMGET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def HMGET(key: java.lang.String, arg1: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  def HMGET(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  def HMGET(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  def HMGET(key: java.lang.String, args: (java.lang.String | Callback[js.Array[java.lang.String]])*): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: ScalablyTyped.runtime.StringDictionary[java.lang.String | scala.Double]
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: ScalablyTyped.runtime.StringDictionary[java.lang.String | scala.Double],
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(key: java.lang.String, arg1: java.lang.String | scala.Double): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(key: java.lang.String, arg1: java.lang.String | scala.Double, cb: Callback[scala.Boolean]): R = js.native
  def HMSET(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def HMSET(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  def HMSET(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double): R = js.native
  def HMSET(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, cb: Callback[scala.Boolean]): R = js.native
  def HMSET(key: java.lang.String, arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: js.Array[java.lang.String | scala.Double],
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String): R = js.native
  def HMSET(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  def HMSET(key: java.lang.String, arg1: scala.Double, arg2: scala.Double): R = js.native
  def HMSET(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def HMSET(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, cb: Callback[scala.Boolean]): R = js.native
  def HMSET(key: java.lang.String, args: (java.lang.String | scala.Double | Callback[scala.Boolean])*): R = js.native
  def HSCAN(args: (java.lang.String | (Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]))*): R = js.native
  def HSCAN(key: java.lang.String, arg1: java.lang.String): R = js.native
  def HSCAN(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def HSCAN(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def HSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def HSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def HSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def HSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def HSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def HSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def HSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def HSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def HSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def HSCAN(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  def HSCAN(
    key: java.lang.String,
    arg1: js.Array[java.lang.String],
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def HSCAN(
    key: java.lang.String,
    args: (java.lang.String | (Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]))*
  ): R = js.native
  def HSET(key: java.lang.String, field: java.lang.String, value: java.lang.String): R = js.native
  def HSET(
    key: java.lang.String,
    field: java.lang.String,
    value: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def HSETNX(key: java.lang.String, field: java.lang.String, value: java.lang.String): R = js.native
  def HSETNX(
    key: java.lang.String,
    field: java.lang.String,
    value: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def HSTRLEN(key: java.lang.String, field: java.lang.String): R = js.native
  def HSTRLEN(key: java.lang.String, field: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def HVALS(key: java.lang.String): R = js.native
  def HVALS(key: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  def INCR(key: java.lang.String): R = js.native
  def INCR(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def INCRBY(key: java.lang.String, increment: scala.Double): R = js.native
  def INCRBY(key: java.lang.String, increment: scala.Double, cb: Callback[scala.Double]): R = js.native
  def INCRBYFLOAT(key: java.lang.String, increment: scala.Double): R = js.native
  def INCRBYFLOAT(key: java.lang.String, increment: scala.Double, cb: Callback[java.lang.String]): R = js.native
  def INFO(): R = js.native
  def INFO(cb: Callback[ServerInfo]): R = js.native
  def INFO(section: java.lang.String): R = js.native
  def INFO(section: java.lang.String, cb: Callback[ServerInfo]): R = js.native
  def INFO(section: js.Array[java.lang.String]): R = js.native
  def INFO(section: js.Array[java.lang.String], cb: Callback[ServerInfo]): R = js.native
  def KEYS(pattern: java.lang.String): R = js.native
  def KEYS(pattern: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  def LASTSAVE(): R = js.native
  def LASTSAVE(cb: Callback[scala.Double]): R = js.native
  def LINDEX(key: java.lang.String, index: scala.Double): R = js.native
  def LINDEX(key: java.lang.String, index: scala.Double, cb: Callback[java.lang.String]): R = js.native
  @JSName("LINSERT")
  def LINSERT_AFTER(
    key: java.lang.String,
    dir: redisLib.redisLibStrings.AFTER,
    pivot: java.lang.String,
    value: java.lang.String
  ): R = js.native
  @JSName("LINSERT")
  def LINSERT_AFTER(
    key: java.lang.String,
    dir: redisLib.redisLibStrings.AFTER,
    pivot: java.lang.String,
    value: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  @JSName("LINSERT")
  def LINSERT_BEFORE(
    key: java.lang.String,
    dir: redisLib.redisLibStrings.BEFORE,
    pivot: java.lang.String,
    value: java.lang.String
  ): R = js.native
  @JSName("LINSERT")
  def LINSERT_BEFORE(
    key: java.lang.String,
    dir: redisLib.redisLibStrings.BEFORE,
    pivot: java.lang.String,
    value: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def LLEN(key: java.lang.String): R = js.native
  def LLEN(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def LPOP(key: java.lang.String): R = js.native
  def LPOP(key: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def LPUSH(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def LPUSH(key: java.lang.String, arg1: java.lang.String): R = js.native
  def LPUSH(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def LPUSH(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def LPUSH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def LPUSH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def LPUSH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def LPUSH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def LPUSH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def LPUSH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def LPUSH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def LPUSH(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def LPUSH(key: java.lang.String, arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def LPUSH(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  def LPUSH(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def LPUSH(key: java.lang.String, args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def LPUSHX(key: java.lang.String, value: java.lang.String): R = js.native
  def LPUSHX(key: java.lang.String, value: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def LRANGE(key: java.lang.String, start: scala.Double, stop: scala.Double): R = js.native
  def LRANGE(
    key: java.lang.String,
    start: scala.Double,
    stop: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def LREM(key: java.lang.String, count: scala.Double, value: java.lang.String): R = js.native
  def LREM(key: java.lang.String, count: scala.Double, value: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def LSET(key: java.lang.String, index: scala.Double, value: java.lang.String): R = js.native
  @JSName("LSET")
  def LSET_OK(
    key: java.lang.String,
    index: scala.Double,
    value: java.lang.String,
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  def LTRIM(key: java.lang.String, start: scala.Double, stop: scala.Double): R = js.native
  @JSName("LTRIM")
  def LTRIM_OK(
    key: java.lang.String,
    start: scala.Double,
    stop: scala.Double,
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  def MGET(arg1: java.lang.String): R = js.native
  def MGET(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def MGET(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def MGET(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def MGET(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def MGET(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def MGET(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def MGET(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def MGET(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def MGET(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def MGET(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  def MGET(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def MGET(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  def MGET(arg1: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  def MGET(arg1: js.Array[java.lang.String]): R = js.native
  def MGET(arg1: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  def MGET(args: (java.lang.String | Callback[js.Array[java.lang.String]])*): R = js.native
  def MIGRATE(arg1: java.lang.String): R = js.native
  def MIGRATE(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def MIGRATE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def MIGRATE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def MIGRATE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def MIGRATE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def MIGRATE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def MIGRATE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def MIGRATE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def MIGRATE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def MIGRATE(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  def MIGRATE(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def MIGRATE(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  def MIGRATE(arg1: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  def MIGRATE(arg1: js.Array[java.lang.String]): R = js.native
  def MIGRATE(arg1: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  def MIGRATE(args: (java.lang.String | Callback[scala.Boolean])*): R = js.native
  def MONITOR(): R = js.native
  def MONITOR(cb: Callback[js.UndefOr[scala.Nothing]]): R = js.native
  def MOVE(key: java.lang.String, db: java.lang.String): R = js.native
  def MOVE(key: java.lang.String, db: scala.Double): R = js.native
  def MSET(arg1: java.lang.String): R = js.native
  def MSET(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def MSET(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def MSET(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def MSET(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def MSET(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def MSET(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def MSET(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def MSET(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def MSET(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def MSET(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  def MSET(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def MSET(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  def MSET(arg1: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  def MSET(arg1: js.Array[java.lang.String]): R = js.native
  def MSET(arg1: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  def MSET(args: (java.lang.String | Callback[scala.Boolean])*): R = js.native
  def MSETNX(arg1: java.lang.String): R = js.native
  def MSETNX(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def MSETNX(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def MSETNX(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def MSETNX(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def MSETNX(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def MSETNX(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def MSETNX(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def MSETNX(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def MSETNX(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def MSETNX(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  def MSETNX(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def MSETNX(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  def MSETNX(arg1: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  def MSETNX(arg1: js.Array[java.lang.String]): R = js.native
  def MSETNX(arg1: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  def MSETNX(args: (java.lang.String | Callback[scala.Boolean])*): R = js.native
  def OBJECT(arg1: java.lang.String): R = js.native
  def OBJECT(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def OBJECT(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def OBJECT(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def OBJECT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def OBJECT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def OBJECT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def OBJECT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def OBJECT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def OBJECT(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[_]): R = js.native
  def OBJECT(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[_]): R = js.native
  def OBJECT(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def OBJECT(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[_]): R = js.native
  def OBJECT(arg1: java.lang.String, cb: Callback[_]): R = js.native
  def OBJECT(arg1: js.Array[java.lang.String]): R = js.native
  def OBJECT(arg1: js.Array[java.lang.String], cb: Callback[_]): R = js.native
  def OBJECT(args: (java.lang.String | Callback[_])*): R = js.native
  def PERSIST(key: java.lang.String): R = js.native
  def PERSIST(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def PEXPIRE(key: java.lang.String, milliseconds: scala.Double): R = js.native
  def PEXPIRE(key: java.lang.String, milliseconds: scala.Double, cb: Callback[scala.Double]): R = js.native
  def PEXPIREAT(key: java.lang.String, millisecondsTimestamp: scala.Double): R = js.native
  def PEXPIREAT(key: java.lang.String, millisecondsTimestamp: scala.Double, cb: Callback[scala.Double]): R = js.native
  def PFADD(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def PFADD(key: java.lang.String, arg1: java.lang.String): R = js.native
  def PFADD(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def PFADD(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def PFADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def PFADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def PFADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def PFADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def PFADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def PFADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def PFADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def PFADD(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def PFADD(key: java.lang.String, arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def PFADD(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  def PFADD(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def PFADD(key: java.lang.String, args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def PFCOUNT(arg1: java.lang.String): R = js.native
  def PFCOUNT(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def PFCOUNT(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def PFCOUNT(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def PFCOUNT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def PFCOUNT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def PFCOUNT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def PFCOUNT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def PFCOUNT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def PFCOUNT(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def PFCOUNT(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def PFCOUNT(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def PFCOUNT(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def PFCOUNT(arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def PFCOUNT(arg1: js.Array[java.lang.String]): R = js.native
  def PFCOUNT(arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def PFCOUNT(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def PFMERGE(arg1: java.lang.String): R = js.native
  def PFMERGE(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def PFMERGE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def PFMERGE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def PFMERGE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def PFMERGE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def PFMERGE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def PFMERGE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def PFMERGE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def PFMERGE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  def PFMERGE(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  def PFMERGE(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def PFMERGE(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  def PFMERGE(arg1: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  def PFMERGE(arg1: js.Array[java.lang.String]): R = js.native
  def PFMERGE(arg1: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  def PFMERGE(args: (java.lang.String | Callback[scala.Boolean])*): R = js.native
  def PING(): R = js.native
  def PING(callback: Callback[java.lang.String]): R = js.native
  def PING(message: java.lang.String): R = js.native
  def PING(message: java.lang.String, callback: Callback[java.lang.String]): R = js.native
  def PSETEX(key: java.lang.String, milliseconds: scala.Double, value: java.lang.String): R = js.native
  @JSName("PSETEX")
  def PSETEX_OK(
    key: java.lang.String,
    milliseconds: scala.Double,
    value: java.lang.String,
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  def PSUBSCRIBE(arg1: java.lang.String): R = js.native
  def PSUBSCRIBE(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def PSUBSCRIBE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def PSUBSCRIBE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def PSUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def PSUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def PSUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def PSUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def PSUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def PSUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def PSUBSCRIBE(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def PSUBSCRIBE(arg1: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def PSUBSCRIBE(arg1: js.Array[java.lang.String]): R = js.native
  def PSUBSCRIBE(arg1: js.Array[java.lang.String], cb: Callback[java.lang.String]): R = js.native
  def PSUBSCRIBE(args: (java.lang.String | Callback[java.lang.String])*): R = js.native
  def PTTL(key: java.lang.String): R = js.native
  def PTTL(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def PUBLISH(channel: java.lang.String, value: java.lang.String): R = js.native
  def PUBLISH(channel: java.lang.String, value: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def PUBSUB(arg1: java.lang.String): R = js.native
  def PUBSUB(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def PUBSUB(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def PUBSUB(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def PUBSUB(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def PUBSUB(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def PUBSUB(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def PUBSUB(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def PUBSUB(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def PUBSUB(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def PUBSUB(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def PUBSUB(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def PUBSUB(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def PUBSUB(arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def PUBSUB(arg1: js.Array[java.lang.String]): R = js.native
  def PUBSUB(arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def PUBSUB(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def PUNSUBSCRIBE(arg1: java.lang.String): R = js.native
  def PUNSUBSCRIBE(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def PUNSUBSCRIBE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def PUNSUBSCRIBE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def PUNSUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def PUNSUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def PUNSUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def PUNSUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def PUNSUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def PUNSUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def PUNSUBSCRIBE(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def PUNSUBSCRIBE(arg1: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def PUNSUBSCRIBE(arg1: js.Array[java.lang.String]): R = js.native
  def PUNSUBSCRIBE(arg1: js.Array[java.lang.String], cb: Callback[java.lang.String]): R = js.native
  def PUNSUBSCRIBE(args: (java.lang.String | Callback[java.lang.String])*): R = js.native
  def QUIT(): R = js.native
  @JSName("QUIT")
  def QUIT_OK(cb: Callback[redisLib.redisLibStrings.OK]): R = js.native
  def RANDOMKEY(): R = js.native
  def RANDOMKEY(cb: Callback[java.lang.String]): R = js.native
  def READONLY(): R = js.native
  def READONLY(cb: Callback[java.lang.String]): R = js.native
  def READWRITE(): R = js.native
  def READWRITE(cb: Callback[java.lang.String]): R = js.native
  def RENAME(key: java.lang.String, newkey: java.lang.String): R = js.native
  def RENAMENX(key: java.lang.String, newkey: java.lang.String): R = js.native
  def RENAMENX(key: java.lang.String, newkey: java.lang.String, cb: Callback[scala.Double]): R = js.native
  @JSName("RENAME")
  def RENAME_OK(key: java.lang.String, newkey: java.lang.String, cb: Callback[redisLib.redisLibStrings.OK]): R = js.native
  def RESTORE(key: java.lang.String, ttl: scala.Double, serializedValue: java.lang.String): R = js.native
  @JSName("RESTORE")
  def RESTORE_OK(
    key: java.lang.String,
    ttl: scala.Double,
    serializedValue: java.lang.String,
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  def ROLE(): R = js.native
  def ROLE(
    cb: Callback[
      js.Tuple3[
        java.lang.String, 
        scala.Double, 
        js.Array[js.Tuple3[java.lang.String, java.lang.String, java.lang.String]]
      ]
    ]
  ): R = js.native
  def RPOP(key: java.lang.String): R = js.native
  def RPOP(key: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def RPOPLPUSH(source: java.lang.String, destination: java.lang.String): R = js.native
  def RPOPLPUSH(source: java.lang.String, destination: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def RPUSH(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def RPUSH(key: java.lang.String, arg1: java.lang.String): R = js.native
  def RPUSH(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def RPUSH(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def RPUSH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def RPUSH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def RPUSH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def RPUSH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def RPUSH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def RPUSH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def RPUSH(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def RPUSH(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def RPUSH(key: java.lang.String, arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def RPUSH(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  def RPUSH(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def RPUSH(key: java.lang.String, args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def RPUSHX(key: java.lang.String, value: java.lang.String): R = js.native
  def RPUSHX(key: java.lang.String, value: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def SADD(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def SADD(key: java.lang.String, arg1: java.lang.String): R = js.native
  def SADD(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def SADD(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def SADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def SADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def SADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def SADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def SADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def SADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def SADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def SADD(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def SADD(key: java.lang.String, arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def SADD(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  def SADD(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def SADD(key: java.lang.String, args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def SAVE(): R = js.native
  def SAVE(cb: Callback[java.lang.String]): R = js.native
  def SCAN(arg1: java.lang.String): R = js.native
  def SCAN(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def SCAN(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def SCAN(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def SCAN(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def SCAN(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def SCAN(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def SCAN(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def SCAN(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def SCAN(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def SCAN(
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def SCAN(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def SCAN(
    arg1: java.lang.String,
    arg2: js.Array[java.lang.String],
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def SCAN(arg1: java.lang.String, cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]): R = js.native
  def SCAN(arg1: js.Array[java.lang.String]): R = js.native
  def SCAN(
    arg1: js.Array[java.lang.String],
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def SCAN(args: (java.lang.String | (Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]))*): R = js.native
  def SCARD(key: java.lang.String): R = js.native
  def SCARD(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def SCRIPT(arg1: java.lang.String): R = js.native
  def SCRIPT(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def SCRIPT(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def SCRIPT(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def SCRIPT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def SCRIPT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def SCRIPT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def SCRIPT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def SCRIPT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  def SCRIPT(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[_]): R = js.native
  def SCRIPT(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[_]): R = js.native
  def SCRIPT(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def SCRIPT(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[_]): R = js.native
  def SCRIPT(arg1: java.lang.String, cb: Callback[_]): R = js.native
  def SCRIPT(arg1: js.Array[java.lang.String]): R = js.native
  def SCRIPT(arg1: js.Array[java.lang.String], cb: Callback[_]): R = js.native
  def SCRIPT(args: (java.lang.String | Callback[_])*): R = js.native
  def SDIFF(arg1: java.lang.String): R = js.native
  def SDIFF(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def SDIFF(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def SDIFF(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def SDIFF(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def SDIFF(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def SDIFF(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def SDIFF(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def SDIFF(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def SDIFF(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def SDIFF(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  def SDIFF(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def SDIFF(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  def SDIFF(arg1: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  def SDIFF(arg1: js.Array[java.lang.String]): R = js.native
  def SDIFF(arg1: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  def SDIFF(args: (java.lang.String | Callback[js.Array[java.lang.String]])*): R = js.native
  def SDIFFSTORE(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def SDIFFSTORE(key: java.lang.String, arg1: java.lang.String): R = js.native
  def SDIFFSTORE(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def SDIFFSTORE(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def SDIFFSTORE(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def SDIFFSTORE(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def SDIFFSTORE(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def SDIFFSTORE(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def SDIFFSTORE(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def SDIFFSTORE(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def SDIFFSTORE(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def SDIFFSTORE(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def SDIFFSTORE(key: java.lang.String, arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def SDIFFSTORE(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  def SDIFFSTORE(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def SDIFFSTORE(key: java.lang.String, args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def SELECT(index: java.lang.String): R = js.native
  def SELECT(index: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def SELECT(index: scala.Double): R = js.native
  def SELECT(index: scala.Double, cb: Callback[java.lang.String]): R = js.native
  def SET(key: java.lang.String, value: java.lang.String): R = js.native
  def SET(key: java.lang.String, value: java.lang.String, flag: java.lang.String): R = js.native
  def SET(key: java.lang.String, value: java.lang.String, mode: java.lang.String, duration: scala.Double): R = js.native
  def SET(
    key: java.lang.String,
    value: java.lang.String,
    mode: java.lang.String,
    duration: scala.Double,
    flag: java.lang.String
  ): R = js.native
  def SETBIT(key: java.lang.String, offset: scala.Double, value: java.lang.String): R = js.native
  def SETBIT(key: java.lang.String, offset: scala.Double, value: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def SETEX(key: java.lang.String, seconds: scala.Double, value: java.lang.String): R = js.native
  def SETEX(
    key: java.lang.String,
    seconds: scala.Double,
    value: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def SETNX(key: java.lang.String, value: java.lang.String): R = js.native
  def SETNX(key: java.lang.String, value: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def SETRANGE(key: java.lang.String, offset: scala.Double, value: java.lang.String): R = js.native
  def SETRANGE(key: java.lang.String, offset: scala.Double, value: java.lang.String, cb: Callback[scala.Double]): R = js.native
  @JSName("SET")
  def SET_OK(key: java.lang.String, value: java.lang.String, cb: Callback[redisLib.redisLibStrings.OK]): R = js.native
  @JSName("SET")
  def SET_OK(
    key: java.lang.String,
    value: java.lang.String,
    flag: java.lang.String,
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  @JSName("SET")
  def SET_OK(
    key: java.lang.String,
    value: java.lang.String,
    mode: java.lang.String,
    duration: scala.Double,
    cb: Callback[js.UndefOr[redisLib.redisLibStrings.OK]]
  ): R = js.native
  @JSName("SET")
  def SET_OK(
    key: java.lang.String,
    value: java.lang.String,
    mode: java.lang.String,
    duration: scala.Double,
    flag: java.lang.String,
    cb: Callback[js.UndefOr[redisLib.redisLibStrings.OK]]
  ): R = js.native
  def SHUTDOWN(arg1: java.lang.String): R = js.native
  def SHUTDOWN(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def SHUTDOWN(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def SHUTDOWN(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def SHUTDOWN(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def SHUTDOWN(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def SHUTDOWN(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def SHUTDOWN(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def SHUTDOWN(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def SHUTDOWN(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def SHUTDOWN(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def SHUTDOWN(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def SHUTDOWN(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[java.lang.String]): R = js.native
  def SHUTDOWN(arg1: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def SHUTDOWN(arg1: js.Array[java.lang.String]): R = js.native
  def SHUTDOWN(arg1: js.Array[java.lang.String], cb: Callback[java.lang.String]): R = js.native
  def SHUTDOWN(args: (java.lang.String | Callback[java.lang.String])*): R = js.native
  def SINTER(args: (java.lang.String | Callback[js.Array[java.lang.String]])*): R = js.native
  def SINTER(key: java.lang.String, arg1: java.lang.String): R = js.native
  def SINTER(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def SINTER(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def SINTER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def SINTER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def SINTER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def SINTER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def SINTER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def SINTER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def SINTER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def SINTER(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def SINTER(key: java.lang.String, arg1: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  def SINTER(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  def SINTER(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  def SINTER(key: java.lang.String, args: (java.lang.String | Callback[js.Array[java.lang.String]])*): R = js.native
  def SINTERSTORE(arg1: java.lang.String): R = js.native
  def SINTERSTORE(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def SINTERSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def SINTERSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def SINTERSTORE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def SINTERSTORE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def SINTERSTORE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def SINTERSTORE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def SINTERSTORE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def SINTERSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def SINTERSTORE(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def SINTERSTORE(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def SINTERSTORE(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def SINTERSTORE(arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def SINTERSTORE(arg1: js.Array[java.lang.String]): R = js.native
  def SINTERSTORE(arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def SINTERSTORE(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def SISMEMBER(key: java.lang.String, member: java.lang.String): R = js.native
  def SISMEMBER(key: java.lang.String, member: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def SLAVEOF(host: java.lang.String, port: java.lang.String): R = js.native
  def SLAVEOF(host: java.lang.String, port: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def SLAVEOF(host: java.lang.String, port: scala.Double): R = js.native
  def SLAVEOF(host: java.lang.String, port: scala.Double, cb: Callback[java.lang.String]): R = js.native
  def SLOWLOG(arg1: java.lang.String): R = js.native
  def SLOWLOG(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def SLOWLOG(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def SLOWLOG(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def SLOWLOG(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def SLOWLOG(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def SLOWLOG(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[
      js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]]
    ]
  ): R = js.native
  def SLOWLOG(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[
      js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]]
    ]
  ): R = js.native
  def SLOWLOG(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]]
    ]
  ): R = js.native
  def SLOWLOG(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[
      js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]]
    ]
  ): R = js.native
  def SLOWLOG(
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[
      js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]]
    ]
  ): R = js.native
  def SLOWLOG(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def SLOWLOG(
    arg1: java.lang.String,
    arg2: js.Array[java.lang.String],
    cb: Callback[
      js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]]
    ]
  ): R = js.native
  def SLOWLOG(
    arg1: java.lang.String,
    cb: Callback[
      js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]]
    ]
  ): R = js.native
  def SLOWLOG(arg1: js.Array[java.lang.String]): R = js.native
  def SLOWLOG(
    arg1: js.Array[java.lang.String],
    cb: Callback[
      js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]]
    ]
  ): R = js.native
  def SLOWLOG(
    args: (java.lang.String | (Callback[
      js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]]
    ]))*
  ): R = js.native
  def SMEMBERS(key: java.lang.String): R = js.native
  def SMEMBERS(key: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  def SMOVE(source: java.lang.String, destination: java.lang.String, member: java.lang.String): R = js.native
  def SMOVE(
    source: java.lang.String,
    destination: java.lang.String,
    member: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def SORT(arg1: java.lang.String): R = js.native
  def SORT(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def SORT(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def SORT(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def SORT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def SORT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def SORT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def SORT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def SORT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def SORT(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def SORT(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  def SORT(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def SORT(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  def SORT(arg1: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  def SORT(arg1: js.Array[java.lang.String]): R = js.native
  def SORT(arg1: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  def SORT(args: (java.lang.String | Callback[js.Array[java.lang.String]])*): R = js.native
  def SPOP(key: java.lang.String): R = js.native
  def SPOP(key: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def SPOP(key: java.lang.String, count: scala.Double): R = js.native
  def SPOP(key: java.lang.String, count: scala.Double, cb: Callback[js.Array[java.lang.String]]): R = js.native
  def SRANDMEMBER(key: java.lang.String): R = js.native
  def SRANDMEMBER(key: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def SRANDMEMBER(key: java.lang.String, count: scala.Double): R = js.native
  def SRANDMEMBER(key: java.lang.String, count: scala.Double, cb: Callback[js.Array[java.lang.String]]): R = js.native
  def SREM(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def SREM(key: java.lang.String, arg1: java.lang.String): R = js.native
  def SREM(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def SREM(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def SREM(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def SREM(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def SREM(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def SREM(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def SREM(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def SREM(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def SREM(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def SREM(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def SREM(key: java.lang.String, arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def SREM(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  def SREM(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def SREM(key: java.lang.String, args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def SSCAN(args: (java.lang.String | (Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]))*): R = js.native
  def SSCAN(key: java.lang.String, arg1: java.lang.String): R = js.native
  def SSCAN(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def SSCAN(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def SSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def SSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def SSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def SSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def SSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def SSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def SSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def SSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def SSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def SSCAN(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  def SSCAN(
    key: java.lang.String,
    arg1: js.Array[java.lang.String],
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def SSCAN(
    key: java.lang.String,
    args: (java.lang.String | (Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]))*
  ): R = js.native
  def STRLEN(key: java.lang.String): R = js.native
  def STRLEN(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def SUBSCRIBE(arg1: java.lang.String): R = js.native
  def SUBSCRIBE(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def SUBSCRIBE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def SUBSCRIBE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def SUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def SUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def SUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def SUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def SUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def SUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def SUBSCRIBE(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def SUBSCRIBE(arg1: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def SUBSCRIBE(arg1: js.Array[java.lang.String]): R = js.native
  def SUBSCRIBE(arg1: js.Array[java.lang.String], cb: Callback[java.lang.String]): R = js.native
  def SUBSCRIBE(args: (java.lang.String | Callback[java.lang.String])*): R = js.native
  def SUNION(arg1: java.lang.String): R = js.native
  def SUNION(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def SUNION(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def SUNION(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def SUNION(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def SUNION(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def SUNION(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def SUNION(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def SUNION(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def SUNION(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def SUNION(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  def SUNION(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def SUNION(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  def SUNION(arg1: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  def SUNION(arg1: js.Array[java.lang.String]): R = js.native
  def SUNION(arg1: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  def SUNION(args: (java.lang.String | Callback[js.Array[java.lang.String]])*): R = js.native
  def SUNIONSTORE(arg1: java.lang.String): R = js.native
  def SUNIONSTORE(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def SUNIONSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def SUNIONSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def SUNIONSTORE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def SUNIONSTORE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def SUNIONSTORE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def SUNIONSTORE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def SUNIONSTORE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def SUNIONSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def SUNIONSTORE(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def SUNIONSTORE(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def SUNIONSTORE(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def SUNIONSTORE(arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def SUNIONSTORE(arg1: js.Array[java.lang.String]): R = js.native
  def SUNIONSTORE(arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def SUNIONSTORE(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def SYNC(): R = js.native
  def SYNC(cb: Callback[js.UndefOr[scala.Nothing]]): R = js.native
  def TIME(): R = js.native
  def TIME(cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]): R = js.native
  def TTL(key: java.lang.String): R = js.native
  def TTL(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def TYPE(key: java.lang.String): R = js.native
  def TYPE(key: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def UNSUBSCRIBE(arg1: java.lang.String): R = js.native
  def UNSUBSCRIBE(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def UNSUBSCRIBE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def UNSUBSCRIBE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def UNSUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def UNSUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def UNSUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def UNSUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def UNSUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def UNSUBSCRIBE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def UNSUBSCRIBE(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def UNSUBSCRIBE(arg1: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def UNSUBSCRIBE(arg1: js.Array[java.lang.String]): R = js.native
  def UNSUBSCRIBE(arg1: js.Array[java.lang.String], cb: Callback[java.lang.String]): R = js.native
  def UNSUBSCRIBE(args: (java.lang.String | Callback[java.lang.String])*): R = js.native
  def UNWATCH(): R = js.native
  @JSName("UNWATCH")
  def UNWATCH_OK(cb: Callback[redisLib.redisLibStrings.OK]): R = js.native
  def WAIT(numslaves: scala.Double, timeout: scala.Double): R = js.native
  def WAIT(numslaves: scala.Double, timeout: scala.Double, cb: Callback[scala.Double]): R = js.native
  def WATCH(arg1: java.lang.String): R = js.native
  def WATCH(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def WATCH(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def WATCH(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def WATCH(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def WATCH(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def WATCH(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  def WATCH(arg1: js.Array[java.lang.String]): R = js.native
  @JSName("WATCH")
  def WATCH_OK(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  @JSName("WATCH")
  def WATCH_OK(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  @JSName("WATCH")
  def WATCH_OK(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  @JSName("WATCH")
  def WATCH_OK(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  @JSName("WATCH")
  def WATCH_OK(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[redisLib.redisLibStrings.OK]): R = js.native
  @JSName("WATCH")
  def WATCH_OK(
    arg1: java.lang.String,
    arg2: js.Array[java.lang.String],
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  @JSName("WATCH")
  def WATCH_OK(arg1: java.lang.String, cb: Callback[redisLib.redisLibStrings.OK]): R = js.native
  @JSName("WATCH")
  def WATCH_OK(arg1: js.Array[java.lang.String], cb: Callback[redisLib.redisLibStrings.OK]): R = js.native
  @JSName("WATCH")
  def WATCH_OK(args: (java.lang.String | Callback[redisLib.redisLibStrings.OK])*): R = js.native
  def ZADD(args: (java.lang.String | scala.Double | Callback[scala.Double])*): R = js.native
  def ZADD(key: java.lang.String, arg1: java.lang.String | scala.Double): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(key: java.lang.String, arg1: java.lang.String | scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZADD(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def ZADD(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def ZADD(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double): R = js.native
  def ZADD(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZADD(key: java.lang.String, arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  def ZADD(key: java.lang.String, arg1: js.Array[java.lang.String | scala.Double], cb: Callback[scala.Double]): R = js.native
  def ZADD(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String): R = js.native
  def ZADD(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def ZADD(key: java.lang.String, arg1: scala.Double, arg2: scala.Double): R = js.native
  def ZADD(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZADD(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZADD(key: java.lang.String, args: (java.lang.String | scala.Double | Callback[scala.Double])*): R = js.native
  def ZCARD(key: java.lang.String): R = js.native
  def ZCARD(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def ZCOUNT(key: java.lang.String, min: java.lang.String, max: java.lang.String): R = js.native
  def ZCOUNT(key: java.lang.String, min: java.lang.String, max: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def ZCOUNT(key: java.lang.String, min: java.lang.String, max: scala.Double): R = js.native
  def ZCOUNT(key: java.lang.String, min: java.lang.String, max: scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZCOUNT(key: java.lang.String, min: scala.Double, max: java.lang.String): R = js.native
  def ZCOUNT(key: java.lang.String, min: scala.Double, max: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def ZCOUNT(key: java.lang.String, min: scala.Double, max: scala.Double): R = js.native
  def ZCOUNT(key: java.lang.String, min: scala.Double, max: scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZINCRBY(key: java.lang.String, increment: scala.Double, member: java.lang.String): R = js.native
  def ZINCRBY(
    key: java.lang.String,
    increment: scala.Double,
    member: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  def ZINTERSTORE(arg1: java.lang.String | scala.Double): R = js.native
  def ZINTERSTORE(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  def ZINTERSTORE(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  def ZINTERSTORE(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZINTERSTORE(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZINTERSTORE(arg1: java.lang.String | scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZINTERSTORE(arg1: java.lang.String, arg2: java.lang.String | scala.Double): R = js.native
  def ZINTERSTORE(arg1: java.lang.String, arg2: java.lang.String | scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZINTERSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def ZINTERSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def ZINTERSTORE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZINTERSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  def ZINTERSTORE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZINTERSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def ZINTERSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def ZINTERSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, arg4: java.lang.String): R = js.native
  def ZINTERSTORE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZINTERSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, arg4: scala.Double): R = js.native
  def ZINTERSTORE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZINTERSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZINTERSTORE(arg1: java.lang.String, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  def ZINTERSTORE(
    arg1: java.lang.String,
    arg2: js.Array[java.lang.String | scala.Double],
    cb: Callback[scala.Double]
  ): R = js.native
  def ZINTERSTORE(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def ZINTERSTORE(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def ZINTERSTORE(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZINTERSTORE(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, arg4: scala.Double): R = js.native
  def ZINTERSTORE(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZINTERSTORE(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def ZINTERSTORE(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  def ZINTERSTORE(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, arg4: java.lang.String): R = js.native
  def ZINTERSTORE(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZINTERSTORE(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double): R = js.native
  def ZINTERSTORE(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZINTERSTORE(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZINTERSTORE(arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  def ZINTERSTORE(arg1: js.Array[java.lang.String | scala.Double], cb: Callback[scala.Double]): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: java.lang.String | scala.Double): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: java.lang.String | scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def ZINTERSTORE(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  def ZINTERSTORE(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, arg4: java.lang.String): R = js.native
  def ZINTERSTORE(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, arg4: scala.Double): R = js.native
  def ZINTERSTORE(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: js.Array[java.lang.String | scala.Double], cb: Callback[scala.Double]): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def ZINTERSTORE(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, arg4: scala.Double): R = js.native
  def ZINTERSTORE(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: java.lang.String): R = js.native
  def ZINTERSTORE(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double): R = js.native
  def ZINTERSTORE(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZINTERSTORE(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZINTERSTORE(args: (java.lang.String | scala.Double | Callback[scala.Double])*): R = js.native
  def ZLEXCOUNT(key: java.lang.String, min: java.lang.String, max: java.lang.String): R = js.native
  def ZLEXCOUNT(key: java.lang.String, min: java.lang.String, max: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def ZRANGE(key: java.lang.String, start: scala.Double, stop: scala.Double): R = js.native
  def ZRANGE(
    key: java.lang.String,
    start: scala.Double,
    stop: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANGE(key: java.lang.String, start: scala.Double, stop: scala.Double, withscores: java.lang.String): R = js.native
  def ZRANGE(
    key: java.lang.String,
    start: scala.Double,
    stop: scala.Double,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANGEBYLEX(key: java.lang.String, min: java.lang.String, max: java.lang.String): R = js.native
  def ZRANGEBYLEX(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANGEBYLEX(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def ZRANGEBYLEX(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANGEBYSCORE(key: java.lang.String, min: java.lang.String, max: java.lang.String): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANGEBYSCORE(key: java.lang.String, min: java.lang.String, max: java.lang.String, withscores: java.lang.String): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANGEBYSCORE(key: java.lang.String, min: java.lang.String, max: scala.Double): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANGEBYSCORE(key: java.lang.String, min: java.lang.String, max: scala.Double, withscores: java.lang.String): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANGEBYSCORE(key: java.lang.String, min: scala.Double, max: java.lang.String): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANGEBYSCORE(key: java.lang.String, min: scala.Double, max: java.lang.String, withscores: java.lang.String): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANGEBYSCORE(key: java.lang.String, min: scala.Double, max: scala.Double): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANGEBYSCORE(key: java.lang.String, min: scala.Double, max: scala.Double, withscores: java.lang.String): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def ZRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZRANK(key: java.lang.String, member: java.lang.String): R = js.native
  def ZRANK(key: java.lang.String, member: java.lang.String, cb: Callback[js.UndefOr[scala.Double]]): R = js.native
  def ZREM(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def ZREM(key: java.lang.String, arg1: java.lang.String): R = js.native
  def ZREM(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def ZREM(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def ZREM(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def ZREM(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def ZREM(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def ZREM(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZREM(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZREM(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZREM(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZREM(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def ZREM(key: java.lang.String, arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def ZREM(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  def ZREM(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  def ZREM(key: java.lang.String, args: (java.lang.String | Callback[scala.Double])*): R = js.native
  def ZREMRANGEBYLEX(key: java.lang.String, min: java.lang.String, max: java.lang.String): R = js.native
  def ZREMRANGEBYLEX(key: java.lang.String, min: java.lang.String, max: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def ZREMRANGEBYRANK(key: java.lang.String, start: scala.Double, stop: scala.Double): R = js.native
  def ZREMRANGEBYRANK(key: java.lang.String, start: scala.Double, stop: scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZREMRANGEBYSCORE(key: java.lang.String, min: java.lang.String, max: java.lang.String): R = js.native
  def ZREMRANGEBYSCORE(key: java.lang.String, min: java.lang.String, max: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def ZREMRANGEBYSCORE(key: java.lang.String, min: java.lang.String, max: scala.Double): R = js.native
  def ZREMRANGEBYSCORE(key: java.lang.String, min: java.lang.String, max: scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZREMRANGEBYSCORE(key: java.lang.String, min: scala.Double, max: java.lang.String): R = js.native
  def ZREMRANGEBYSCORE(key: java.lang.String, min: scala.Double, max: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def ZREMRANGEBYSCORE(key: java.lang.String, min: scala.Double, max: scala.Double): R = js.native
  def ZREMRANGEBYSCORE(key: java.lang.String, min: scala.Double, max: scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZREVRANGE(key: java.lang.String, start: scala.Double, stop: scala.Double): R = js.native
  def ZREVRANGE(
    key: java.lang.String,
    start: scala.Double,
    stop: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANGE(key: java.lang.String, start: scala.Double, stop: scala.Double, withscores: java.lang.String): R = js.native
  def ZREVRANGE(
    key: java.lang.String,
    start: scala.Double,
    stop: scala.Double,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANGEBYLEX(key: java.lang.String, min: java.lang.String, max: java.lang.String): R = js.native
  def ZREVRANGEBYLEX(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANGEBYLEX(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def ZREVRANGEBYLEX(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANGEBYSCORE(key: java.lang.String, min: java.lang.String, max: java.lang.String): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANGEBYSCORE(key: java.lang.String, min: java.lang.String, max: java.lang.String, withscores: java.lang.String): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANGEBYSCORE(key: java.lang.String, min: java.lang.String, max: scala.Double): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANGEBYSCORE(key: java.lang.String, min: java.lang.String, max: scala.Double, withscores: java.lang.String): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANGEBYSCORE(key: java.lang.String, min: scala.Double, max: java.lang.String): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANGEBYSCORE(key: java.lang.String, min: scala.Double, max: java.lang.String, withscores: java.lang.String): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANGEBYSCORE(key: java.lang.String, min: scala.Double, max: scala.Double): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANGEBYSCORE(key: java.lang.String, min: scala.Double, max: scala.Double, withscores: java.lang.String): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def ZREVRANGEBYSCORE(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def ZREVRANK(key: java.lang.String, member: java.lang.String): R = js.native
  def ZREVRANK(key: java.lang.String, member: java.lang.String, cb: Callback[js.UndefOr[scala.Double]]): R = js.native
  def ZSCAN(args: (java.lang.String | (Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]))*): R = js.native
  def ZSCAN(key: java.lang.String, arg1: java.lang.String): R = js.native
  def ZSCAN(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  def ZSCAN(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def ZSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  def ZSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  def ZSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  def ZSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def ZSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def ZSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def ZSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def ZSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def ZSCAN(
    key: java.lang.String,
    arg1: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def ZSCAN(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  def ZSCAN(
    key: java.lang.String,
    arg1: js.Array[java.lang.String],
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  def ZSCAN(
    key: java.lang.String,
    args: (java.lang.String | (Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]))*
  ): R = js.native
  def ZSCORE(key: java.lang.String, member: java.lang.String): R = js.native
  def ZSCORE(key: java.lang.String, member: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String | scala.Double): R = js.native
  def ZUNIONSTORE(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  def ZUNIONSTORE(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  def ZUNIONSTORE(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZUNIONSTORE(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String | scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String, arg2: java.lang.String | scala.Double): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String, arg2: java.lang.String | scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def ZUNIONSTORE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  def ZUNIONSTORE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, arg4: java.lang.String): R = js.native
  def ZUNIONSTORE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, arg4: scala.Double): R = js.native
  def ZUNIONSTORE(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  def ZUNIONSTORE(
    arg1: java.lang.String,
    arg2: js.Array[java.lang.String | scala.Double],
    cb: Callback[scala.Double]
  ): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def ZUNIONSTORE(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, arg4: scala.Double): R = js.native
  def ZUNIONSTORE(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, arg4: java.lang.String): R = js.native
  def ZUNIONSTORE(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double): R = js.native
  def ZUNIONSTORE(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZUNIONSTORE(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZUNIONSTORE(arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  def ZUNIONSTORE(arg1: js.Array[java.lang.String | scala.Double], cb: Callback[scala.Double]): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: java.lang.String | scala.Double): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: java.lang.String | scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def ZUNIONSTORE(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  def ZUNIONSTORE(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, arg4: java.lang.String): R = js.native
  def ZUNIONSTORE(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, arg4: scala.Double): R = js.native
  def ZUNIONSTORE(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: js.Array[java.lang.String | scala.Double], cb: Callback[scala.Double]): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  def ZUNIONSTORE(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, arg4: scala.Double): R = js.native
  def ZUNIONSTORE(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: java.lang.String): R = js.native
  def ZUNIONSTORE(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double): R = js.native
  def ZUNIONSTORE(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  def ZUNIONSTORE(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, cb: Callback[scala.Double]): R = js.native
  def ZUNIONSTORE(args: (java.lang.String | scala.Double | Callback[scala.Double])*): R = js.native
  /**
       * Append a value to a key.
       */
  def append(key: java.lang.String, value: java.lang.String): R = js.native
  /**
       * Append a value to a key.
       */
  def append(key: java.lang.String, value: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Authenticate to the server.
       */
  def auth(password: java.lang.String): R = js.native
  /**
       * Authenticate to the server.
       */
  def auth(password: java.lang.String, callback: Callback[java.lang.String]): R = js.native
  /**
       * Asynchronously rewrite the append-only file.
       */
  def bgrewriteaof(): R = js.native
  /**
       * Asynchronously rewrite the append-only file.
       */
  @JSName("bgrewriteaof")
  def bgrewriteaof_OK(cb: Callback[redisLib.redisLibStrings.OK]): R = js.native
  /**
       * Asynchronously save the dataset to disk.
       */
  def bgsave(): R = js.native
  /**
       * Asynchronously save the dataset to disk.
       */
  def bgsave(cb: Callback[java.lang.String]): R = js.native
  /**
       * Count set bits in a string.
       */
  def bitcount(key: java.lang.String): R = js.native
  /**
       * Count set bits in a string.
       */
  def bitcount(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  def bitcount(key: java.lang.String, start: scala.Double, end: scala.Double): R = js.native
  def bitcount(key: java.lang.String, start: scala.Double, end: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(args: (java.lang.String | scala.Double | (Callback[js.Tuple2[scala.Double, scala.Double]]))*): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(key: java.lang.String, arg1: java.lang.String | scala.Double): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(key: java.lang.String, arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: js.Array[java.lang.String | scala.Double],
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(key: java.lang.String, arg1: scala.Double, arg2: scala.Double): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    cb: Callback[js.Tuple2[scala.Double, scala.Double]]
  ): R = js.native
  /**
       * Perform arbitrary bitfield integer operations on strings.
       */
  def bitfield(
    key: java.lang.String,
    args: (java.lang.String | scala.Double | (Callback[js.Tuple2[scala.Double, scala.Double]]))*
  ): R = js.native
  def bitop(
    operation: java.lang.String,
    destkey: java.lang.String,
    args: (java.lang.String | Callback[scala.Double])*
  ): R = js.native
  def bitop(
    operation: java.lang.String,
    destkey: java.lang.String,
    key1: java.lang.String,
    key2: java.lang.String
  ): R = js.native
  def bitop(
    operation: java.lang.String,
    destkey: java.lang.String,
    key1: java.lang.String,
    key2: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Perform bitwise operations between strings.
       */
  def bitop(
    operation: java.lang.String,
    destkey: java.lang.String,
    key1: java.lang.String,
    key2: java.lang.String,
    key3: java.lang.String
  ): R = js.native
  /**
       * Perform bitwise operations between strings.
       */
  def bitop(
    operation: java.lang.String,
    destkey: java.lang.String,
    key1: java.lang.String,
    key2: java.lang.String,
    key3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def bitop(operation: java.lang.String, destkey: java.lang.String, key: java.lang.String): R = js.native
  def bitop(
    operation: java.lang.String,
    destkey: java.lang.String,
    key: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  def bitpos(key: java.lang.String, bit: scala.Double): R = js.native
  def bitpos(key: java.lang.String, bit: scala.Double, cb: Callback[scala.Double]): R = js.native
  def bitpos(key: java.lang.String, bit: scala.Double, start: scala.Double): R = js.native
  def bitpos(key: java.lang.String, bit: scala.Double, start: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Find first bit set or clear in a string.
       */
  def bitpos(key: java.lang.String, bit: scala.Double, start: scala.Double, end: scala.Double): R = js.native
  /**
       * Find first bit set or clear in a string.
       */
  def bitpos(
    key: java.lang.String,
    bit: scala.Double,
    start: scala.Double,
    end: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Remove and get the first element in a list, or block until one is available.
       */
  def blpop(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: scala.Double
  ): R = js.native
  /**
       * Remove and get the first element in a list, or block until one is available.
       */
  def blpop(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  /**
       * Remove and get the first element in a list, or block until one is available.
       */
  def blpop(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: scala.Double
  ): R = js.native
  /**
       * Remove and get the first element in a list, or block until one is available.
       */
  def blpop(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  /**
       * Remove and get the first element in a list, or block until one is available.
       */
  def blpop(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  /**
       * Remove and get the first element in a list, or block until one is available.
       */
  def blpop(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  /**
       * Remove and get the first element in a list, or block until one is available.
       */
  def blpop(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Remove and get the first element in a list, or block until one is available.
       */
  def blpop(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  /**
       * Remove and get the first element in a list, or block until one is available.
       */
  def blpop(arg1: java.lang.String, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Remove and get the first element in a list, or block until one is available.
       */
  def blpop(
    arg1: java.lang.String,
    arg2: js.Array[java.lang.String | scala.Double],
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  /**
       * Remove and get the first element in a list, or block until one is available.
       */
  def blpop(arg1: java.lang.String, arg2: scala.Double): R = js.native
  /**
       * Remove and get the first element in a list, or block until one is available.
       */
  def blpop(
    arg1: java.lang.String,
    arg2: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  /**
       * Remove and get the first element in a list, or block until one is available.
       */
  def blpop(
    args: (java.lang.String | scala.Double | (Callback[js.Tuple2[java.lang.String, java.lang.String]]))*
  ): R = js.native
  /**
       * Remove and get the first element in a list, or block until one is available.
       */
  def blpop(args: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Remove and get the first element in a list, or block until one is available.
       */
  def blpop(
    args: js.Array[java.lang.String | scala.Double],
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  /**
       * Remove and get the last element in a list, or block until one is available.
       */
  def brpop(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: scala.Double
  ): R = js.native
  /**
       * Remove and get the last element in a list, or block until one is available.
       */
  def brpop(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  /**
       * Remove and get the last element in a list, or block until one is available.
       */
  def brpop(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: scala.Double
  ): R = js.native
  /**
       * Remove and get the last element in a list, or block until one is available.
       */
  def brpop(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  /**
       * Remove and get the last element in a list, or block until one is available.
       */
  def brpop(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  /**
       * Remove and get the last element in a list, or block until one is available.
       */
  def brpop(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  /**
       * Remove and get the last element in a list, or block until one is available.
       */
  def brpop(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Remove and get the last element in a list, or block until one is available.
       */
  def brpop(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  /**
       * Remove and get the last element in a list, or block until one is available.
       */
  def brpop(arg1: java.lang.String, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Remove and get the last element in a list, or block until one is available.
       */
  def brpop(
    arg1: java.lang.String,
    arg2: js.Array[java.lang.String | scala.Double],
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  /**
       * Remove and get the last element in a list, or block until one is available.
       */
  def brpop(arg1: java.lang.String, arg2: scala.Double): R = js.native
  /**
       * Remove and get the last element in a list, or block until one is available.
       */
  def brpop(
    arg1: java.lang.String,
    arg2: scala.Double,
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  /**
       * Remove and get the last element in a list, or block until one is available.
       */
  def brpop(
    args: (java.lang.String | scala.Double | (Callback[js.Tuple2[java.lang.String, java.lang.String]]))*
  ): R = js.native
  /**
       * Remove and get the last element in a list, or block until one is available.
       */
  def brpop(args: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Remove and get the last element in a list, or block until one is available.
       */
  def brpop(
    args: js.Array[java.lang.String | scala.Double],
    cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]
  ): R = js.native
  /**
       * Pop a value from a list, push it to another list and return it; or block until one is available.
       */
  def brpoplpush(source: java.lang.String, destination: java.lang.String, timeout: scala.Double): R = js.native
  /**
       * Pop a value from a list, push it to another list and return it; or block until one is available.
       */
  def brpoplpush(
    source: java.lang.String,
    destination: java.lang.String,
    timeout: scala.Double,
    cb: Callback[java.lang.String | scala.Null]
  ): R = js.native
  /**
       * KILL - Kill the connection of a client.
       * LIST - Get the list of client connections.
       * GETNAME - Get the current connection name.
       * PAUSE - Stop processing commands from clients for some time.
       * REPLY - Instruct the server whether to reply to commands.
       * SETNAME - Set the current connection name.
       */
  def client(arg1: java.lang.String): R = js.native
  /**
       * KILL - Kill the connection of a client.
       * LIST - Get the list of client connections.
       * GETNAME - Get the current connection name.
       * PAUSE - Stop processing commands from clients for some time.
       * REPLY - Instruct the server whether to reply to commands.
       * SETNAME - Set the current connection name.
       */
  def client(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * KILL - Kill the connection of a client.
       * LIST - Get the list of client connections.
       * GETNAME - Get the current connection name.
       * PAUSE - Stop processing commands from clients for some time.
       * REPLY - Instruct the server whether to reply to commands.
       * SETNAME - Set the current connection name.
       */
  def client(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * KILL - Kill the connection of a client.
       * LIST - Get the list of client connections.
       * GETNAME - Get the current connection name.
       * PAUSE - Stop processing commands from clients for some time.
       * REPLY - Instruct the server whether to reply to commands.
       * SETNAME - Set the current connection name.
       */
  def client(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * KILL - Kill the connection of a client.
       * LIST - Get the list of client connections.
       * GETNAME - Get the current connection name.
       * PAUSE - Stop processing commands from clients for some time.
       * REPLY - Instruct the server whether to reply to commands.
       * SETNAME - Set the current connection name.
       */
  def client(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * KILL - Kill the connection of a client.
       * LIST - Get the list of client connections.
       * GETNAME - Get the current connection name.
       * PAUSE - Stop processing commands from clients for some time.
       * REPLY - Instruct the server whether to reply to commands.
       * SETNAME - Set the current connection name.
       */
  def client(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * KILL - Kill the connection of a client.
       * LIST - Get the list of client connections.
       * GETNAME - Get the current connection name.
       * PAUSE - Stop processing commands from clients for some time.
       * REPLY - Instruct the server whether to reply to commands.
       * SETNAME - Set the current connection name.
       */
  def client(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * KILL - Kill the connection of a client.
       * LIST - Get the list of client connections.
       * GETNAME - Get the current connection name.
       * PAUSE - Stop processing commands from clients for some time.
       * REPLY - Instruct the server whether to reply to commands.
       * SETNAME - Set the current connection name.
       */
  def client(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * KILL - Kill the connection of a client.
       * LIST - Get the list of client connections.
       * GETNAME - Get the current connection name.
       * PAUSE - Stop processing commands from clients for some time.
       * REPLY - Instruct the server whether to reply to commands.
       * SETNAME - Set the current connection name.
       */
  def client(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * KILL - Kill the connection of a client.
       * LIST - Get the list of client connections.
       * GETNAME - Get the current connection name.
       * PAUSE - Stop processing commands from clients for some time.
       * REPLY - Instruct the server whether to reply to commands.
       * SETNAME - Set the current connection name.
       */
  def client(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[_]): R = js.native
  /**
       * KILL - Kill the connection of a client.
       * LIST - Get the list of client connections.
       * GETNAME - Get the current connection name.
       * PAUSE - Stop processing commands from clients for some time.
       * REPLY - Instruct the server whether to reply to commands.
       * SETNAME - Set the current connection name.
       */
  def client(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[_]): R = js.native
  /**
       * KILL - Kill the connection of a client.
       * LIST - Get the list of client connections.
       * GETNAME - Get the current connection name.
       * PAUSE - Stop processing commands from clients for some time.
       * REPLY - Instruct the server whether to reply to commands.
       * SETNAME - Set the current connection name.
       */
  def client(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * KILL - Kill the connection of a client.
       * LIST - Get the list of client connections.
       * GETNAME - Get the current connection name.
       * PAUSE - Stop processing commands from clients for some time.
       * REPLY - Instruct the server whether to reply to commands.
       * SETNAME - Set the current connection name.
       */
  def client(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[_]): R = js.native
  /**
       * KILL - Kill the connection of a client.
       * LIST - Get the list of client connections.
       * GETNAME - Get the current connection name.
       * PAUSE - Stop processing commands from clients for some time.
       * REPLY - Instruct the server whether to reply to commands.
       * SETNAME - Set the current connection name.
       */
  def client(arg1: java.lang.String, cb: Callback[_]): R = js.native
  /**
       * KILL - Kill the connection of a client.
       * LIST - Get the list of client connections.
       * GETNAME - Get the current connection name.
       * PAUSE - Stop processing commands from clients for some time.
       * REPLY - Instruct the server whether to reply to commands.
       * SETNAME - Set the current connection name.
       */
  def client(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * KILL - Kill the connection of a client.
       * LIST - Get the list of client connections.
       * GETNAME - Get the current connection name.
       * PAUSE - Stop processing commands from clients for some time.
       * REPLY - Instruct the server whether to reply to commands.
       * SETNAME - Set the current connection name.
       */
  def client(arg1: js.Array[java.lang.String], cb: Callback[_]): R = js.native
  /**
       * KILL - Kill the connection of a client.
       * LIST - Get the list of client connections.
       * GETNAME - Get the current connection name.
       * PAUSE - Stop processing commands from clients for some time.
       * REPLY - Instruct the server whether to reply to commands.
       * SETNAME - Set the current connection name.
       */
  def client(args: (java.lang.String | Callback[_])*): R = js.native
  /**
       * ADDSLOTS - Assign new hash slots to receiving node.
       * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
       * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
       * DELSLOTS - Set hash slots as unbound in receiving node.
       * FAILOVER - Forces a slave to perform a manual failover of its master.
       * FORGET - Remove a node from the nodes table.
       * GETKEYSINSLOT - Return local key names in the specified hash slot.
       * INFO - Provides info about Redis Cluster node state.
       * KEYSLOT - Returns the hash slot of the specified key.
       * MEET - Force a node cluster to handshake with another node.
       * NODES - Get cluster config for the node.
       * REPLICATE - Reconfigure a node as a slave of the specified master node.
       * RESET - Reset a Redis Cluster node.
       * SAVECONFIG - Forces the node to save cluster state on disk.
       * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
       * SETSLOT - Bind a hash slot to a specified node.
       * SLAVES - List slave nodes of the specified master node.
       * SLOTS - Get array of Cluster slot to node mappings.
       */
  def cluster(arg1: java.lang.String): this.type = js.native
  /**
       * ADDSLOTS - Assign new hash slots to receiving node.
       * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
       * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
       * DELSLOTS - Set hash slots as unbound in receiving node.
       * FAILOVER - Forces a slave to perform a manual failover of its master.
       * FORGET - Remove a node from the nodes table.
       * GETKEYSINSLOT - Return local key names in the specified hash slot.
       * INFO - Provides info about Redis Cluster node state.
       * KEYSLOT - Returns the hash slot of the specified key.
       * MEET - Force a node cluster to handshake with another node.
       * NODES - Get cluster config for the node.
       * REPLICATE - Reconfigure a node as a slave of the specified master node.
       * RESET - Reset a Redis Cluster node.
       * SAVECONFIG - Forces the node to save cluster state on disk.
       * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
       * SETSLOT - Bind a hash slot to a specified node.
       * SLAVES - List slave nodes of the specified master node.
       * SLOTS - Get array of Cluster slot to node mappings.
       */
  def cluster(arg1: java.lang.String, arg2: java.lang.String): this.type = js.native
  /**
       * ADDSLOTS - Assign new hash slots to receiving node.
       * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
       * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
       * DELSLOTS - Set hash slots as unbound in receiving node.
       * FAILOVER - Forces a slave to perform a manual failover of its master.
       * FORGET - Remove a node from the nodes table.
       * GETKEYSINSLOT - Return local key names in the specified hash slot.
       * INFO - Provides info about Redis Cluster node state.
       * KEYSLOT - Returns the hash slot of the specified key.
       * MEET - Force a node cluster to handshake with another node.
       * NODES - Get cluster config for the node.
       * REPLICATE - Reconfigure a node as a slave of the specified master node.
       * RESET - Reset a Redis Cluster node.
       * SAVECONFIG - Forces the node to save cluster state on disk.
       * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
       * SETSLOT - Bind a hash slot to a specified node.
       * SLAVES - List slave nodes of the specified master node.
       * SLOTS - Get array of Cluster slot to node mappings.
       */
  def cluster(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): this.type = js.native
  /**
       * ADDSLOTS - Assign new hash slots to receiving node.
       * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
       * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
       * DELSLOTS - Set hash slots as unbound in receiving node.
       * FAILOVER - Forces a slave to perform a manual failover of its master.
       * FORGET - Remove a node from the nodes table.
       * GETKEYSINSLOT - Return local key names in the specified hash slot.
       * INFO - Provides info about Redis Cluster node state.
       * KEYSLOT - Returns the hash slot of the specified key.
       * MEET - Force a node cluster to handshake with another node.
       * NODES - Get cluster config for the node.
       * REPLICATE - Reconfigure a node as a slave of the specified master node.
       * RESET - Reset a Redis Cluster node.
       * SAVECONFIG - Forces the node to save cluster state on disk.
       * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
       * SETSLOT - Bind a hash slot to a specified node.
       * SLAVES - List slave nodes of the specified master node.
       * SLOTS - Get array of Cluster slot to node mappings.
       */
  def cluster(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): this.type = js.native
  /**
       * ADDSLOTS - Assign new hash slots to receiving node.
       * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
       * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
       * DELSLOTS - Set hash slots as unbound in receiving node.
       * FAILOVER - Forces a slave to perform a manual failover of its master.
       * FORGET - Remove a node from the nodes table.
       * GETKEYSINSLOT - Return local key names in the specified hash slot.
       * INFO - Provides info about Redis Cluster node state.
       * KEYSLOT - Returns the hash slot of the specified key.
       * MEET - Force a node cluster to handshake with another node.
       * NODES - Get cluster config for the node.
       * REPLICATE - Reconfigure a node as a slave of the specified master node.
       * RESET - Reset a Redis Cluster node.
       * SAVECONFIG - Forces the node to save cluster state on disk.
       * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
       * SETSLOT - Bind a hash slot to a specified node.
       * SLAVES - List slave nodes of the specified master node.
       * SLOTS - Get array of Cluster slot to node mappings.
       */
  def cluster(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): this.type = js.native
  /**
       * ADDSLOTS - Assign new hash slots to receiving node.
       * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
       * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
       * DELSLOTS - Set hash slots as unbound in receiving node.
       * FAILOVER - Forces a slave to perform a manual failover of its master.
       * FORGET - Remove a node from the nodes table.
       * GETKEYSINSLOT - Return local key names in the specified hash slot.
       * INFO - Provides info about Redis Cluster node state.
       * KEYSLOT - Returns the hash slot of the specified key.
       * MEET - Force a node cluster to handshake with another node.
       * NODES - Get cluster config for the node.
       * REPLICATE - Reconfigure a node as a slave of the specified master node.
       * RESET - Reset a Redis Cluster node.
       * SAVECONFIG - Forces the node to save cluster state on disk.
       * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
       * SETSLOT - Bind a hash slot to a specified node.
       * SLAVES - List slave nodes of the specified master node.
       * SLOTS - Get array of Cluster slot to node mappings.
       */
  def cluster(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): this.type = js.native
  /**
       * ADDSLOTS - Assign new hash slots to receiving node.
       * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
       * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
       * DELSLOTS - Set hash slots as unbound in receiving node.
       * FAILOVER - Forces a slave to perform a manual failover of its master.
       * FORGET - Remove a node from the nodes table.
       * GETKEYSINSLOT - Return local key names in the specified hash slot.
       * INFO - Provides info about Redis Cluster node state.
       * KEYSLOT - Returns the hash slot of the specified key.
       * MEET - Force a node cluster to handshake with another node.
       * NODES - Get cluster config for the node.
       * REPLICATE - Reconfigure a node as a slave of the specified master node.
       * RESET - Reset a Redis Cluster node.
       * SAVECONFIG - Forces the node to save cluster state on disk.
       * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
       * SETSLOT - Bind a hash slot to a specified node.
       * SLAVES - List slave nodes of the specified master node.
       * SLOTS - Get array of Cluster slot to node mappings.
       */
  def cluster(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[_]
  ): this.type = js.native
  /**
       * ADDSLOTS - Assign new hash slots to receiving node.
       * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
       * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
       * DELSLOTS - Set hash slots as unbound in receiving node.
       * FAILOVER - Forces a slave to perform a manual failover of its master.
       * FORGET - Remove a node from the nodes table.
       * GETKEYSINSLOT - Return local key names in the specified hash slot.
       * INFO - Provides info about Redis Cluster node state.
       * KEYSLOT - Returns the hash slot of the specified key.
       * MEET - Force a node cluster to handshake with another node.
       * NODES - Get cluster config for the node.
       * REPLICATE - Reconfigure a node as a slave of the specified master node.
       * RESET - Reset a Redis Cluster node.
       * SAVECONFIG - Forces the node to save cluster state on disk.
       * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
       * SETSLOT - Bind a hash slot to a specified node.
       * SLAVES - List slave nodes of the specified master node.
       * SLOTS - Get array of Cluster slot to node mappings.
       */
  def cluster(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[_]
  ): this.type = js.native
  /**
       * ADDSLOTS - Assign new hash slots to receiving node.
       * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
       * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
       * DELSLOTS - Set hash slots as unbound in receiving node.
       * FAILOVER - Forces a slave to perform a manual failover of its master.
       * FORGET - Remove a node from the nodes table.
       * GETKEYSINSLOT - Return local key names in the specified hash slot.
       * INFO - Provides info about Redis Cluster node state.
       * KEYSLOT - Returns the hash slot of the specified key.
       * MEET - Force a node cluster to handshake with another node.
       * NODES - Get cluster config for the node.
       * REPLICATE - Reconfigure a node as a slave of the specified master node.
       * RESET - Reset a Redis Cluster node.
       * SAVECONFIG - Forces the node to save cluster state on disk.
       * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
       * SETSLOT - Bind a hash slot to a specified node.
       * SLAVES - List slave nodes of the specified master node.
       * SLOTS - Get array of Cluster slot to node mappings.
       */
  def cluster(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): this.type = js.native
  /**
       * ADDSLOTS - Assign new hash slots to receiving node.
       * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
       * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
       * DELSLOTS - Set hash slots as unbound in receiving node.
       * FAILOVER - Forces a slave to perform a manual failover of its master.
       * FORGET - Remove a node from the nodes table.
       * GETKEYSINSLOT - Return local key names in the specified hash slot.
       * INFO - Provides info about Redis Cluster node state.
       * KEYSLOT - Returns the hash slot of the specified key.
       * MEET - Force a node cluster to handshake with another node.
       * NODES - Get cluster config for the node.
       * REPLICATE - Reconfigure a node as a slave of the specified master node.
       * RESET - Reset a Redis Cluster node.
       * SAVECONFIG - Forces the node to save cluster state on disk.
       * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
       * SETSLOT - Bind a hash slot to a specified node.
       * SLAVES - List slave nodes of the specified master node.
       * SLOTS - Get array of Cluster slot to node mappings.
       */
  def cluster(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[_]): this.type = js.native
  /**
       * ADDSLOTS - Assign new hash slots to receiving node.
       * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
       * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
       * DELSLOTS - Set hash slots as unbound in receiving node.
       * FAILOVER - Forces a slave to perform a manual failover of its master.
       * FORGET - Remove a node from the nodes table.
       * GETKEYSINSLOT - Return local key names in the specified hash slot.
       * INFO - Provides info about Redis Cluster node state.
       * KEYSLOT - Returns the hash slot of the specified key.
       * MEET - Force a node cluster to handshake with another node.
       * NODES - Get cluster config for the node.
       * REPLICATE - Reconfigure a node as a slave of the specified master node.
       * RESET - Reset a Redis Cluster node.
       * SAVECONFIG - Forces the node to save cluster state on disk.
       * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
       * SETSLOT - Bind a hash slot to a specified node.
       * SLAVES - List slave nodes of the specified master node.
       * SLOTS - Get array of Cluster slot to node mappings.
       */
  def cluster(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[_]): this.type = js.native
  /**
       * ADDSLOTS - Assign new hash slots to receiving node.
       * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
       * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
       * DELSLOTS - Set hash slots as unbound in receiving node.
       * FAILOVER - Forces a slave to perform a manual failover of its master.
       * FORGET - Remove a node from the nodes table.
       * GETKEYSINSLOT - Return local key names in the specified hash slot.
       * INFO - Provides info about Redis Cluster node state.
       * KEYSLOT - Returns the hash slot of the specified key.
       * MEET - Force a node cluster to handshake with another node.
       * NODES - Get cluster config for the node.
       * REPLICATE - Reconfigure a node as a slave of the specified master node.
       * RESET - Reset a Redis Cluster node.
       * SAVECONFIG - Forces the node to save cluster state on disk.
       * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
       * SETSLOT - Bind a hash slot to a specified node.
       * SLAVES - List slave nodes of the specified master node.
       * SLOTS - Get array of Cluster slot to node mappings.
       */
  def cluster(arg1: java.lang.String, arg2: js.Array[java.lang.String]): this.type = js.native
  /**
       * ADDSLOTS - Assign new hash slots to receiving node.
       * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
       * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
       * DELSLOTS - Set hash slots as unbound in receiving node.
       * FAILOVER - Forces a slave to perform a manual failover of its master.
       * FORGET - Remove a node from the nodes table.
       * GETKEYSINSLOT - Return local key names in the specified hash slot.
       * INFO - Provides info about Redis Cluster node state.
       * KEYSLOT - Returns the hash slot of the specified key.
       * MEET - Force a node cluster to handshake with another node.
       * NODES - Get cluster config for the node.
       * REPLICATE - Reconfigure a node as a slave of the specified master node.
       * RESET - Reset a Redis Cluster node.
       * SAVECONFIG - Forces the node to save cluster state on disk.
       * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
       * SETSLOT - Bind a hash slot to a specified node.
       * SLAVES - List slave nodes of the specified master node.
       * SLOTS - Get array of Cluster slot to node mappings.
       */
  def cluster(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[_]): this.type = js.native
  /**
       * ADDSLOTS - Assign new hash slots to receiving node.
       * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
       * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
       * DELSLOTS - Set hash slots as unbound in receiving node.
       * FAILOVER - Forces a slave to perform a manual failover of its master.
       * FORGET - Remove a node from the nodes table.
       * GETKEYSINSLOT - Return local key names in the specified hash slot.
       * INFO - Provides info about Redis Cluster node state.
       * KEYSLOT - Returns the hash slot of the specified key.
       * MEET - Force a node cluster to handshake with another node.
       * NODES - Get cluster config for the node.
       * REPLICATE - Reconfigure a node as a slave of the specified master node.
       * RESET - Reset a Redis Cluster node.
       * SAVECONFIG - Forces the node to save cluster state on disk.
       * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
       * SETSLOT - Bind a hash slot to a specified node.
       * SLAVES - List slave nodes of the specified master node.
       * SLOTS - Get array of Cluster slot to node mappings.
       */
  def cluster(arg1: java.lang.String, cb: Callback[_]): this.type = js.native
  /**
       * ADDSLOTS - Assign new hash slots to receiving node.
       * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
       * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
       * DELSLOTS - Set hash slots as unbound in receiving node.
       * FAILOVER - Forces a slave to perform a manual failover of its master.
       * FORGET - Remove a node from the nodes table.
       * GETKEYSINSLOT - Return local key names in the specified hash slot.
       * INFO - Provides info about Redis Cluster node state.
       * KEYSLOT - Returns the hash slot of the specified key.
       * MEET - Force a node cluster to handshake with another node.
       * NODES - Get cluster config for the node.
       * REPLICATE - Reconfigure a node as a slave of the specified master node.
       * RESET - Reset a Redis Cluster node.
       * SAVECONFIG - Forces the node to save cluster state on disk.
       * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
       * SETSLOT - Bind a hash slot to a specified node.
       * SLAVES - List slave nodes of the specified master node.
       * SLOTS - Get array of Cluster slot to node mappings.
       */
  def cluster(arg1: js.Array[java.lang.String]): this.type = js.native
  /**
       * ADDSLOTS - Assign new hash slots to receiving node.
       * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
       * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
       * DELSLOTS - Set hash slots as unbound in receiving node.
       * FAILOVER - Forces a slave to perform a manual failover of its master.
       * FORGET - Remove a node from the nodes table.
       * GETKEYSINSLOT - Return local key names in the specified hash slot.
       * INFO - Provides info about Redis Cluster node state.
       * KEYSLOT - Returns the hash slot of the specified key.
       * MEET - Force a node cluster to handshake with another node.
       * NODES - Get cluster config for the node.
       * REPLICATE - Reconfigure a node as a slave of the specified master node.
       * RESET - Reset a Redis Cluster node.
       * SAVECONFIG - Forces the node to save cluster state on disk.
       * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
       * SETSLOT - Bind a hash slot to a specified node.
       * SLAVES - List slave nodes of the specified master node.
       * SLOTS - Get array of Cluster slot to node mappings.
       */
  def cluster(arg1: js.Array[java.lang.String], cb: Callback[_]): this.type = js.native
  /**
       * ADDSLOTS - Assign new hash slots to receiving node.
       * COUNT-FAILURE-REPORTS - Return the number of failure reports active for a given node.
       * COUNTKEYSINSLOT - Return the number of local keys in the specified hash slot.
       * DELSLOTS - Set hash slots as unbound in receiving node.
       * FAILOVER - Forces a slave to perform a manual failover of its master.
       * FORGET - Remove a node from the nodes table.
       * GETKEYSINSLOT - Return local key names in the specified hash slot.
       * INFO - Provides info about Redis Cluster node state.
       * KEYSLOT - Returns the hash slot of the specified key.
       * MEET - Force a node cluster to handshake with another node.
       * NODES - Get cluster config for the node.
       * REPLICATE - Reconfigure a node as a slave of the specified master node.
       * RESET - Reset a Redis Cluster node.
       * SAVECONFIG - Forces the node to save cluster state on disk.
       * SET-CONFIG-EPOCH - Set the configuration epoch in a new node.
       * SETSLOT - Bind a hash slot to a specified node.
       * SLAVES - List slave nodes of the specified master node.
       * SLOTS - Get array of Cluster slot to node mappings.
       */
  def cluster(args: (java.lang.String | Callback[_])*): this.type = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get total number of Redis commands.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific REdis command details.
       */
  def command(): R = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get total number of Redis commands.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific REdis command details.
       */
  def command(
    cb: Callback[
      js.Array[
        js.Tuple6[
          java.lang.String, 
          scala.Double, 
          js.Array[java.lang.String], 
          scala.Double, 
          scala.Double, 
          scala.Double
        ]
      ]
    ]
  ): R = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get array of Redis command details.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific Redis command details.
       * GET - Get the value of a configuration parameter.
       * REWRITE - Rewrite the configuration file with the in memory configuration.
       * SET - Set a configuration parameter to the given value.
       * RESETSTAT - Reset the stats returned by INFO.
       */
  def config(arg1: java.lang.String): R = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get array of Redis command details.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific Redis command details.
       * GET - Get the value of a configuration parameter.
       * REWRITE - Rewrite the configuration file with the in memory configuration.
       * SET - Set a configuration parameter to the given value.
       * RESETSTAT - Reset the stats returned by INFO.
       */
  def config(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get array of Redis command details.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific Redis command details.
       * GET - Get the value of a configuration parameter.
       * REWRITE - Rewrite the configuration file with the in memory configuration.
       * SET - Set a configuration parameter to the given value.
       * RESETSTAT - Reset the stats returned by INFO.
       */
  def config(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get array of Redis command details.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific Redis command details.
       * GET - Get the value of a configuration parameter.
       * REWRITE - Rewrite the configuration file with the in memory configuration.
       * SET - Set a configuration parameter to the given value.
       * RESETSTAT - Reset the stats returned by INFO.
       */
  def config(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get array of Redis command details.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific Redis command details.
       * GET - Get the value of a configuration parameter.
       * REWRITE - Rewrite the configuration file with the in memory configuration.
       * SET - Set a configuration parameter to the given value.
       * RESETSTAT - Reset the stats returned by INFO.
       */
  def config(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get array of Redis command details.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific Redis command details.
       * GET - Get the value of a configuration parameter.
       * REWRITE - Rewrite the configuration file with the in memory configuration.
       * SET - Set a configuration parameter to the given value.
       * RESETSTAT - Reset the stats returned by INFO.
       */
  def config(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get array of Redis command details.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific Redis command details.
       * GET - Get the value of a configuration parameter.
       * REWRITE - Rewrite the configuration file with the in memory configuration.
       * SET - Set a configuration parameter to the given value.
       * RESETSTAT - Reset the stats returned by INFO.
       */
  def config(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get array of Redis command details.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific Redis command details.
       * GET - Get the value of a configuration parameter.
       * REWRITE - Rewrite the configuration file with the in memory configuration.
       * SET - Set a configuration parameter to the given value.
       * RESETSTAT - Reset the stats returned by INFO.
       */
  def config(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get array of Redis command details.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific Redis command details.
       * GET - Get the value of a configuration parameter.
       * REWRITE - Rewrite the configuration file with the in memory configuration.
       * SET - Set a configuration parameter to the given value.
       * RESETSTAT - Reset the stats returned by INFO.
       */
  def config(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get array of Redis command details.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific Redis command details.
       * GET - Get the value of a configuration parameter.
       * REWRITE - Rewrite the configuration file with the in memory configuration.
       * SET - Set a configuration parameter to the given value.
       * RESETSTAT - Reset the stats returned by INFO.
       */
  def config(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get array of Redis command details.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific Redis command details.
       * GET - Get the value of a configuration parameter.
       * REWRITE - Rewrite the configuration file with the in memory configuration.
       * SET - Set a configuration parameter to the given value.
       * RESETSTAT - Reset the stats returned by INFO.
       */
  def config(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get array of Redis command details.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific Redis command details.
       * GET - Get the value of a configuration parameter.
       * REWRITE - Rewrite the configuration file with the in memory configuration.
       * SET - Set a configuration parameter to the given value.
       * RESETSTAT - Reset the stats returned by INFO.
       */
  def config(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get array of Redis command details.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific Redis command details.
       * GET - Get the value of a configuration parameter.
       * REWRITE - Rewrite the configuration file with the in memory configuration.
       * SET - Set a configuration parameter to the given value.
       * RESETSTAT - Reset the stats returned by INFO.
       */
  def config(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get array of Redis command details.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific Redis command details.
       * GET - Get the value of a configuration parameter.
       * REWRITE - Rewrite the configuration file with the in memory configuration.
       * SET - Set a configuration parameter to the given value.
       * RESETSTAT - Reset the stats returned by INFO.
       */
  def config(arg1: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get array of Redis command details.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific Redis command details.
       * GET - Get the value of a configuration parameter.
       * REWRITE - Rewrite the configuration file with the in memory configuration.
       * SET - Set a configuration parameter to the given value.
       * RESETSTAT - Reset the stats returned by INFO.
       */
  def config(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get array of Redis command details.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific Redis command details.
       * GET - Get the value of a configuration parameter.
       * REWRITE - Rewrite the configuration file with the in memory configuration.
       * SET - Set a configuration parameter to the given value.
       * RESETSTAT - Reset the stats returned by INFO.
       */
  def config(arg1: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  /**
       * Get array of Redis command details.
       *
       * COUNT - Get array of Redis command details.
       * GETKEYS - Extract keys given a full Redis command.
       * INFO - Get array of specific Redis command details.
       * GET - Get the value of a configuration parameter.
       * REWRITE - Rewrite the configuration file with the in memory configuration.
       * SET - Set a configuration parameter to the given value.
       * RESETSTAT - Reset the stats returned by INFO.
       */
  def config(args: (java.lang.String | Callback[scala.Boolean])*): R = js.native
  /**
       * Return the number of keys in the selected database.
       */
  def dbsize(): R = js.native
  /**
       * Return the number of keys in the selected database.
       */
  def dbsize(cb: Callback[scala.Double]): R = js.native
  /**
       * OBJECT - Get debugging information about a key.
       * SEGFAULT - Make the server crash.
       */
  def debug(arg1: java.lang.String): R = js.native
  /**
       * OBJECT - Get debugging information about a key.
       * SEGFAULT - Make the server crash.
       */
  def debug(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * OBJECT - Get debugging information about a key.
       * SEGFAULT - Make the server crash.
       */
  def debug(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * OBJECT - Get debugging information about a key.
       * SEGFAULT - Make the server crash.
       */
  def debug(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * OBJECT - Get debugging information about a key.
       * SEGFAULT - Make the server crash.
       */
  def debug(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * OBJECT - Get debugging information about a key.
       * SEGFAULT - Make the server crash.
       */
  def debug(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * OBJECT - Get debugging information about a key.
       * SEGFAULT - Make the server crash.
       */
  def debug(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * OBJECT - Get debugging information about a key.
       * SEGFAULT - Make the server crash.
       */
  def debug(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * OBJECT - Get debugging information about a key.
       * SEGFAULT - Make the server crash.
       */
  def debug(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * OBJECT - Get debugging information about a key.
       * SEGFAULT - Make the server crash.
       */
  def debug(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * OBJECT - Get debugging information about a key.
       * SEGFAULT - Make the server crash.
       */
  def debug(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  /**
       * OBJECT - Get debugging information about a key.
       * SEGFAULT - Make the server crash.
       */
  def debug(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * OBJECT - Get debugging information about a key.
       * SEGFAULT - Make the server crash.
       */
  def debug(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  /**
       * OBJECT - Get debugging information about a key.
       * SEGFAULT - Make the server crash.
       */
  def debug(arg1: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  /**
       * OBJECT - Get debugging information about a key.
       * SEGFAULT - Make the server crash.
       */
  def debug(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * OBJECT - Get debugging information about a key.
       * SEGFAULT - Make the server crash.
       */
  def debug(arg1: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  /**
       * OBJECT - Get debugging information about a key.
       * SEGFAULT - Make the server crash.
       */
  def debug(args: (java.lang.String | Callback[scala.Boolean])*): R = js.native
  /**
       * Decrement the integer value of a key by one.
       */
  def decr(key: java.lang.String): R = js.native
  /**
       * Decrement the integer value of a key by one.
       */
  def decr(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Decrement the integer value of a key by the given number.
       */
  def decrby(key: java.lang.String, decrement: scala.Double): R = js.native
  /**
       * Decrement the integer value of a key by the given number.
       */
  def decrby(key: java.lang.String, decrement: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Delete a key.
       */
  def del(arg1: java.lang.String): R = js.native
  /**
       * Delete a key.
       */
  def del(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Delete a key.
       */
  def del(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Delete a key.
       */
  def del(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Delete a key.
       */
  def del(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Delete a key.
       */
  def del(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Delete a key.
       */
  def del(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Delete a key.
       */
  def del(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Delete a key.
       */
  def del(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Delete a key.
       */
  def del(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Delete a key.
       */
  def del(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Delete a key.
       */
  def del(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Delete a key.
       */
  def del(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Delete a key.
       */
  def del(arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Delete a key.
       */
  def del(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Delete a key.
       */
  def del(arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Delete a key.
       */
  def del(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Discard all commands issued after MULTI.
       */
  def discard(): R = js.native
  /**
       * Discard all commands issued after MULTI.
       */
  @JSName("discard")
  def discard_OK(cb: Callback[redisLib.redisLibStrings.OK]): R = js.native
  /**
       * Return a serialized version of the value stored at the specified key.
       */
  def dump(key: java.lang.String): R = js.native
  /**
       * Return a serialized version of the value stored at the specified key.
       */
  def dump(key: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Echo the given string.
       */
  def echo[T /* <: java.lang.String */](message: T): R = js.native
  /**
       * Echo the given string.
       */
  def echo[T /* <: java.lang.String */](message: T, cb: Callback[T]): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String | scala.Double): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String | scala.Double, cb: Callback[_]): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: java.lang.String | scala.Double): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: java.lang.String | scala.Double, cb: Callback[_]): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[_]): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, arg4: java.lang.String): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, arg4: scala.Double): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, cb: Callback[_]): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: js.Array[java.lang.String | scala.Double], cb: Callback[_]): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, arg4: scala.Double): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, cb: Callback[_]): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, arg4: java.lang.String): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, cb: Callback[_]): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: js.Array[java.lang.String | scala.Double], cb: Callback[_]): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: java.lang.String | scala.Double): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: java.lang.String | scala.Double, cb: Callback[_]): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[_]): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, arg4: java.lang.String): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, arg4: scala.Double): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, cb: Callback[_]): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: js.Array[java.lang.String | scala.Double], cb: Callback[_]): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, arg4: scala.Double): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, cb: Callback[_]): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: java.lang.String): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double, cb: Callback[_]): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, cb: Callback[_]): R = js.native
  /**
       * Execute a Lua script server side.
       */
  def eval(args: (java.lang.String | scala.Double | Callback[_])*): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String | scala.Double): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String | scala.Double, cb: Callback[_]): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: java.lang.String | scala.Double): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: java.lang.String | scala.Double, cb: Callback[_]): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[_]): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, arg4: java.lang.String): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, arg4: scala.Double): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, cb: Callback[_]): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: js.Array[java.lang.String | scala.Double], cb: Callback[_]): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, arg4: scala.Double): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, cb: Callback[_]): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, arg4: java.lang.String): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, cb: Callback[_]): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: js.Array[java.lang.String | scala.Double], cb: Callback[_]): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: java.lang.String | scala.Double): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: java.lang.String | scala.Double, cb: Callback[_]): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[_]): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, arg4: java.lang.String): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, arg4: scala.Double): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, cb: Callback[_]): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: js.Array[java.lang.String | scala.Double], cb: Callback[_]): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, arg4: scala.Double): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, cb: Callback[_]): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: java.lang.String): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double, cb: Callback[_]): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, cb: Callback[_]): R = js.native
  /**
       * Execute a Lue script server side.
       */
  def evalsha(args: (java.lang.String | scala.Double | Callback[_])*): R = js.native
  /**
       * Determine if a key exists.
       */
  def exists(arg1: java.lang.String): R = js.native
  /**
       * Determine if a key exists.
       */
  def exists(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Determine if a key exists.
       */
  def exists(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Determine if a key exists.
       */
  def exists(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Determine if a key exists.
       */
  def exists(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Determine if a key exists.
       */
  def exists(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Determine if a key exists.
       */
  def exists(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Determine if a key exists.
       */
  def exists(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Determine if a key exists.
       */
  def exists(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Determine if a key exists.
       */
  def exists(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Determine if a key exists.
       */
  def exists(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Determine if a key exists.
       */
  def exists(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Determine if a key exists.
       */
  def exists(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Determine if a key exists.
       */
  def exists(arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Determine if a key exists.
       */
  def exists(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Determine if a key exists.
       */
  def exists(arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Determine if a key exists.
       */
  def exists(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Set a key's time to live in seconds.
       */
  def expire(key: java.lang.String, seconds: scala.Double): R = js.native
  /**
       * Set a key's time to live in seconds.
       */
  def expire(key: java.lang.String, seconds: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Set the expiration for a key as a UNIX timestamp.
       */
  def expireat(key: java.lang.String, timestamp: scala.Double): R = js.native
  /**
       * Set the expiration for a key as a UNIX timestamp.
       */
  def expireat(key: java.lang.String, timestamp: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Remove all keys from all databases.
       */
  def flushall(): R = js.native
  /**
       * Remove all keys from all databases.
       */
  def flushall(cb: Callback[java.lang.String]): R = js.native
  /**
       * Remove all keys from the current database.
       */
  def flushdb(): R = js.native
  /**
       * Remove all keys from the current database.
       */
  def flushdb(cb: Callback[java.lang.String]): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(args: (java.lang.String | scala.Double | Callback[scala.Double])*): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: java.lang.String | scala.Double): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: java.lang.String | scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: js.Array[java.lang.String | scala.Double], cb: Callback[scala.Double]): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: scala.Double, arg2: scala.Double): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Add one or more geospatial items in the geospatial index represented using a sorted set.
       */
  def geoadd(key: java.lang.String, args: (java.lang.String | scala.Double | Callback[scala.Double])*): R = js.native
  /**
       * Returns the distance between two members of a geospatial index.
       */
  def geodist(args: (java.lang.String | Callback[java.lang.String])*): R = js.native
  /**
       * Returns the distance between two members of a geospatial index.
       */
  def geodist(key: java.lang.String, arg1: java.lang.String): R = js.native
  /**
       * Returns the distance between two members of a geospatial index.
       */
  def geodist(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Returns the distance between two members of a geospatial index.
       */
  def geodist(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Returns the distance between two members of a geospatial index.
       */
  def geodist(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Returns the distance between two members of a geospatial index.
       */
  def geodist(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Returns the distance between two members of a geospatial index.
       */
  def geodist(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Returns the distance between two members of a geospatial index.
       */
  def geodist(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Returns the distance between two members of a geospatial index.
       */
  def geodist(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Returns the distance between two members of a geospatial index.
       */
  def geodist(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Returns the distance between two members of a geospatial index.
       */
  def geodist(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Returns the distance between two members of a geospatial index.
       */
  def geodist(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Returns the distance between two members of a geospatial index.
       */
  def geodist(key: java.lang.String, arg1: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Returns the distance between two members of a geospatial index.
       */
  def geodist(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Returns the distance between two members of a geospatial index.
       */
  def geodist(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[java.lang.String]): R = js.native
  /**
       * Returns the distance between two members of a geospatial index.
       */
  def geodist(key: java.lang.String, args: (java.lang.String | Callback[java.lang.String])*): R = js.native
  /**
       * Returns members of a geospatial index as standard geohash strings.
       */
  def geohash(args: (java.lang.String | Callback[java.lang.String])*): R = js.native
  /**
       * Returns members of a geospatial index as standard geohash strings.
       */
  def geohash(key: java.lang.String, arg1: java.lang.String): R = js.native
  /**
       * Returns members of a geospatial index as standard geohash strings.
       */
  def geohash(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Returns members of a geospatial index as standard geohash strings.
       */
  def geohash(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Returns members of a geospatial index as standard geohash strings.
       */
  def geohash(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Returns members of a geospatial index as standard geohash strings.
       */
  def geohash(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Returns members of a geospatial index as standard geohash strings.
       */
  def geohash(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Returns members of a geospatial index as standard geohash strings.
       */
  def geohash(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Returns members of a geospatial index as standard geohash strings.
       */
  def geohash(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Returns members of a geospatial index as standard geohash strings.
       */
  def geohash(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Returns members of a geospatial index as standard geohash strings.
       */
  def geohash(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Returns members of a geospatial index as standard geohash strings.
       */
  def geohash(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Returns members of a geospatial index as standard geohash strings.
       */
  def geohash(key: java.lang.String, arg1: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Returns members of a geospatial index as standard geohash strings.
       */
  def geohash(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Returns members of a geospatial index as standard geohash strings.
       */
  def geohash(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[java.lang.String]): R = js.native
  /**
       * Returns members of a geospatial index as standard geohash strings.
       */
  def geohash(key: java.lang.String, args: (java.lang.String | Callback[java.lang.String])*): R = js.native
  /**
       * Returns longitude and latitude of members of a geospatial index.
       */
  def geopos(args: (java.lang.String | (Callback[js.Array[js.Tuple2[scala.Double, scala.Double]]]))*): R = js.native
  /**
       * Returns longitude and latitude of members of a geospatial index.
       */
  def geopos(key: java.lang.String, arg1: java.lang.String): R = js.native
  /**
       * Returns longitude and latitude of members of a geospatial index.
       */
  def geopos(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Returns longitude and latitude of members of a geospatial index.
       */
  def geopos(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Returns longitude and latitude of members of a geospatial index.
       */
  def geopos(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Returns longitude and latitude of members of a geospatial index.
       */
  def geopos(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Returns longitude and latitude of members of a geospatial index.
       */
  def geopos(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Returns longitude and latitude of members of a geospatial index.
       */
  def geopos(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Array[js.Tuple2[scala.Double, scala.Double]]]
  ): R = js.native
  /**
       * Returns longitude and latitude of members of a geospatial index.
       */
  def geopos(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Array[js.Tuple2[scala.Double, scala.Double]]]
  ): R = js.native
  /**
       * Returns longitude and latitude of members of a geospatial index.
       */
  def geopos(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Array[js.Tuple2[scala.Double, scala.Double]]]
  ): R = js.native
  /**
       * Returns longitude and latitude of members of a geospatial index.
       */
  def geopos(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Array[js.Tuple2[scala.Double, scala.Double]]]
  ): R = js.native
  /**
       * Returns longitude and latitude of members of a geospatial index.
       */
  def geopos(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[js.Array[js.Tuple2[scala.Double, scala.Double]]]
  ): R = js.native
  /**
       * Returns longitude and latitude of members of a geospatial index.
       */
  def geopos(
    key: java.lang.String,
    arg1: java.lang.String,
    cb: Callback[js.Array[js.Tuple2[scala.Double, scala.Double]]]
  ): R = js.native
  /**
       * Returns longitude and latitude of members of a geospatial index.
       */
  def geopos(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Returns longitude and latitude of members of a geospatial index.
       */
  def geopos(
    key: java.lang.String,
    arg1: js.Array[java.lang.String],
    cb: Callback[js.Array[js.Tuple2[scala.Double, scala.Double]]]
  ): R = js.native
  /**
       * Returns longitude and latitude of members of a geospatial index.
       */
  def geopos(
    key: java.lang.String,
    args: (java.lang.String | (Callback[js.Array[js.Tuple2[scala.Double, scala.Double]]]))*
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    args: (java.lang.String | scala.Double | (Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]))*
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(key: java.lang.String, arg1: java.lang.String | scala.Double): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(key: java.lang.String, arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: js.Array[java.lang.String | scala.Double],
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(key: java.lang.String, arg1: scala.Double, arg2: scala.Double): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a point.
       */
  def georadius(
    key: java.lang.String,
    args: (java.lang.String | scala.Double | (Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]))*
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    args: (java.lang.String | scala.Double | (Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]))*
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(key: java.lang.String, arg1: java.lang.String | scala.Double): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(key: java.lang.String, arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: js.Array[java.lang.String | scala.Double],
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(key: java.lang.String, arg1: scala.Double, arg2: scala.Double): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    cb: Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]
  ): R = js.native
  /**
       * Query a sorted set representing a geospatial index to fetch members matching a given maximum distance from a member.
       */
  def georadiusbymember(
    key: java.lang.String,
    args: (java.lang.String | scala.Double | (Callback[
      js.Array[
        java.lang.String | (js.Tuple2[
          java.lang.String, 
          java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
        ])
      ]
    ]))*
  ): R = js.native
  /**
       * Get the value of a key.
       */
  def get(key: java.lang.String): R = js.native
  /**
       * Get the value of a key.
       */
  def get(key: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Returns the bit value at offset in the string value stored at key.
       */
  def getbit(key: java.lang.String, offset: scala.Double): R = js.native
  /**
       * Returns the bit value at offset in the string value stored at key.
       */
  def getbit(key: java.lang.String, offset: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Get a substring of the string stored at a key.
       */
  def getrange(key: java.lang.String, start: scala.Double, end: scala.Double): R = js.native
  /**
       * Get a substring of the string stored at a key.
       */
  def getrange(key: java.lang.String, start: scala.Double, end: scala.Double, cb: Callback[java.lang.String]): R = js.native
  /**
       * Set the string value of a key and return its old value.
       */
  def getset(key: java.lang.String, value: java.lang.String): R = js.native
  /**
       * Set the string value of a key and return its old value.
       */
  def getset(key: java.lang.String, value: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Delete on or more hash fields.
       */
  def hdel(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Delete on or more hash fields.
       */
  def hdel(key: java.lang.String, arg1: java.lang.String): R = js.native
  /**
       * Delete on or more hash fields.
       */
  def hdel(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Delete on or more hash fields.
       */
  def hdel(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Delete on or more hash fields.
       */
  def hdel(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Delete on or more hash fields.
       */
  def hdel(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Delete on or more hash fields.
       */
  def hdel(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Delete on or more hash fields.
       */
  def hdel(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Delete on or more hash fields.
       */
  def hdel(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Delete on or more hash fields.
       */
  def hdel(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Delete on or more hash fields.
       */
  def hdel(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Delete on or more hash fields.
       */
  def hdel(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Delete on or more hash fields.
       */
  def hdel(key: java.lang.String, arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Delete on or more hash fields.
       */
  def hdel(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Delete on or more hash fields.
       */
  def hdel(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Delete on or more hash fields.
       */
  def hdel(key: java.lang.String, args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Determine if a hash field exists.
       */
  def hexists(key: java.lang.String, field: java.lang.String): R = js.native
  /**
       * Determine if a hash field exists.
       */
  def hexists(key: java.lang.String, field: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Get the value of a hash field.
       */
  def hget(key: java.lang.String, field: java.lang.String): R = js.native
  /**
       * Get the value of a hash field.
       */
  def hget(key: java.lang.String, field: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Get all fields and values in a hash.
       */
  def hgetall(key: java.lang.String): R = js.native
  /**
       * Get all fields and values in a hash.
       */
  def hgetall(key: java.lang.String, cb: Callback[ScalablyTyped.runtime.StringDictionary[java.lang.String]]): R = js.native
  /**
       * Increment the integer value of a hash field by the given number.
       */
  def hincrby(key: java.lang.String, field: java.lang.String, increment: scala.Double): R = js.native
  /**
       * Increment the integer value of a hash field by the given number.
       */
  def hincrby(
    key: java.lang.String,
    field: java.lang.String,
    increment: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Increment the float value of a hash field by the given amount.
       */
  def hincrbyfloat(key: java.lang.String, field: java.lang.String, increment: scala.Double): R = js.native
  /**
       * Increment the float value of a hash field by the given amount.
       */
  def hincrbyfloat(
    key: java.lang.String,
    field: java.lang.String,
    increment: scala.Double,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Get all the fields of a hash.
       */
  def hkeys(key: java.lang.String): R = js.native
  /**
       * Get all the fields of a hash.
       */
  def hkeys(key: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Get the number of fields in a hash.
       */
  def hlen(key: java.lang.String): R = js.native
  /**
       * Get the number of fields in a hash.
       */
  def hlen(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Get the values of all the given hash fields.
       */
  def hmget(args: (java.lang.String | Callback[js.Array[java.lang.String]])*): R = js.native
  /**
       * Get the values of all the given hash fields.
       */
  def hmget(key: java.lang.String, arg1: java.lang.String): R = js.native
  /**
       * Get the values of all the given hash fields.
       */
  def hmget(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Get the values of all the given hash fields.
       */
  def hmget(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Get the values of all the given hash fields.
       */
  def hmget(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Get the values of all the given hash fields.
       */
  def hmget(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Get the values of all the given hash fields.
       */
  def hmget(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Get the values of all the given hash fields.
       */
  def hmget(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Get the values of all the given hash fields.
       */
  def hmget(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Get the values of all the given hash fields.
       */
  def hmget(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Get the values of all the given hash fields.
       */
  def hmget(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Get the values of all the given hash fields.
       */
  def hmget(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Get the values of all the given hash fields.
       */
  def hmget(key: java.lang.String, arg1: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Get the values of all the given hash fields.
       */
  def hmget(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Get the values of all the given hash fields.
       */
  def hmget(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Get the values of all the given hash fields.
       */
  def hmget(key: java.lang.String, args: (java.lang.String | Callback[js.Array[java.lang.String]])*): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: ScalablyTyped.runtime.StringDictionary[java.lang.String | scala.Double]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: ScalablyTyped.runtime.StringDictionary[java.lang.String | scala.Double],
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, arg1: java.lang.String | scala.Double): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, arg1: java.lang.String | scala.Double, cb: Callback[scala.Boolean]): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, cb: Callback[scala.Boolean]): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: js.Array[java.lang.String | scala.Double],
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, arg1: scala.Double, arg2: scala.Double): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, cb: Callback[scala.Boolean]): R = js.native
  /**
       * Set multiple hash fields to multiple values.
       */
  def hmset(key: java.lang.String, args: (java.lang.String | scala.Double | Callback[scala.Boolean])*): R = js.native
  /**
       * Incrementally iterate hash fields and associated values.
       */
  def hscan(args: (java.lang.String | (Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]))*): R = js.native
  /**
       * Incrementally iterate hash fields and associated values.
       */
  def hscan(key: java.lang.String, arg1: java.lang.String): R = js.native
  /**
       * Incrementally iterate hash fields and associated values.
       */
  def hscan(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Incrementally iterate hash fields and associated values.
       */
  def hscan(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Incrementally iterate hash fields and associated values.
       */
  def hscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Incrementally iterate hash fields and associated values.
       */
  def hscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Incrementally iterate hash fields and associated values.
       */
  def hscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Incrementally iterate hash fields and associated values.
       */
  def hscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate hash fields and associated values.
       */
  def hscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate hash fields and associated values.
       */
  def hscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate hash fields and associated values.
       */
  def hscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate hash fields and associated values.
       */
  def hscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate hash fields and associated values.
       */
  def hscan(
    key: java.lang.String,
    arg1: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate hash fields and associated values.
       */
  def hscan(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Incrementally iterate hash fields and associated values.
       */
  def hscan(
    key: java.lang.String,
    arg1: js.Array[java.lang.String],
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate hash fields and associated values.
       */
  def hscan(
    key: java.lang.String,
    args: (java.lang.String | (Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]))*
  ): R = js.native
  /**
       * Set the string value of a hash field.
       */
  def hset(key: java.lang.String, field: java.lang.String, value: java.lang.String): R = js.native
  /**
       * Set the string value of a hash field.
       */
  def hset(
    key: java.lang.String,
    field: java.lang.String,
    value: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Set the value of a hash field, only if the field does not exist.
       */
  def hsetnx(key: java.lang.String, field: java.lang.String, value: java.lang.String): R = js.native
  /**
       * Set the value of a hash field, only if the field does not exist.
       */
  def hsetnx(
    key: java.lang.String,
    field: java.lang.String,
    value: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Get the length of the value of a hash field.
       */
  def hstrlen(key: java.lang.String, field: java.lang.String): R = js.native
  /**
       * Get the length of the value of a hash field.
       */
  def hstrlen(key: java.lang.String, field: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Get all the values of a hash.
       */
  def hvals(key: java.lang.String): R = js.native
  /**
       * Get all the values of a hash.
       */
  def hvals(key: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Increment the integer value of a key by one.
       */
  def incr(key: java.lang.String): R = js.native
  /**
       * Increment the integer value of a key by one.
       */
  def incr(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Increment the integer value of a key by the given amount.
       */
  def incrby(key: java.lang.String, increment: scala.Double): R = js.native
  /**
       * Increment the integer value of a key by the given amount.
       */
  def incrby(key: java.lang.String, increment: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Increment the float value of a key by the given amount.
       */
  def incrbyfloat(key: java.lang.String, increment: scala.Double): R = js.native
  /**
       * Increment the float value of a key by the given amount.
       */
  def incrbyfloat(key: java.lang.String, increment: scala.Double, cb: Callback[java.lang.String]): R = js.native
  /**
       * Get information and statistics about the server.
       */
  def info(): R = js.native
  /**
       * Get information and statistics about the server.
       */
  def info(cb: Callback[ServerInfo]): R = js.native
  def info(section: java.lang.String): R = js.native
  def info(section: java.lang.String, cb: Callback[ServerInfo]): R = js.native
  def info(section: js.Array[java.lang.String]): R = js.native
  def info(section: js.Array[java.lang.String], cb: Callback[ServerInfo]): R = js.native
  /**
       * Find all keys matching the given pattern.
       */
  def keys(pattern: java.lang.String): R = js.native
  /**
       * Find all keys matching the given pattern.
       */
  def keys(pattern: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Get the UNIX time stamp of the last successful save to disk.
       */
  def lastsave(): R = js.native
  /**
       * Get the UNIX time stamp of the last successful save to disk.
       */
  def lastsave(cb: Callback[scala.Double]): R = js.native
  /**
       * Get an element from a list by its index.
       */
  def lindex(key: java.lang.String, index: scala.Double): R = js.native
  /**
       * Get an element from a list by its index.
       */
  def lindex(key: java.lang.String, index: scala.Double, cb: Callback[java.lang.String]): R = js.native
  /**
       * Insert an element before or after another element in a list.
       */
  @JSName("linsert")
  def linsert_AFTER(
    key: java.lang.String,
    dir: redisLib.redisLibStrings.AFTER,
    pivot: java.lang.String,
    value: java.lang.String
  ): R = js.native
  /**
       * Insert an element before or after another element in a list.
       */
  @JSName("linsert")
  def linsert_AFTER(
    key: java.lang.String,
    dir: redisLib.redisLibStrings.AFTER,
    pivot: java.lang.String,
    value: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Insert an element before or after another element in a list.
       */
  @JSName("linsert")
  def linsert_BEFORE(
    key: java.lang.String,
    dir: redisLib.redisLibStrings.BEFORE,
    pivot: java.lang.String,
    value: java.lang.String
  ): R = js.native
  /**
       * Insert an element before or after another element in a list.
       */
  @JSName("linsert")
  def linsert_BEFORE(
    key: java.lang.String,
    dir: redisLib.redisLibStrings.BEFORE,
    pivot: java.lang.String,
    value: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Get the length of a list.
       */
  def llen(key: java.lang.String): R = js.native
  /**
       * Get the length of a list.
       */
  def llen(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Remove and get the first element in a list.
       */
  def lpop(key: java.lang.String): R = js.native
  /**
       * Remove and get the first element in a list.
       */
  def lpop(key: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Prepend one or multiple values to a list.
       */
  def lpush(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Prepend one or multiple values to a list.
       */
  def lpush(key: java.lang.String, arg1: java.lang.String): R = js.native
  /**
       * Prepend one or multiple values to a list.
       */
  def lpush(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Prepend one or multiple values to a list.
       */
  def lpush(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Prepend one or multiple values to a list.
       */
  def lpush(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Prepend one or multiple values to a list.
       */
  def lpush(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Prepend one or multiple values to a list.
       */
  def lpush(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Prepend one or multiple values to a list.
       */
  def lpush(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Prepend one or multiple values to a list.
       */
  def lpush(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Prepend one or multiple values to a list.
       */
  def lpush(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Prepend one or multiple values to a list.
       */
  def lpush(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Prepend one or multiple values to a list.
       */
  def lpush(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Prepend one or multiple values to a list.
       */
  def lpush(key: java.lang.String, arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Prepend one or multiple values to a list.
       */
  def lpush(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Prepend one or multiple values to a list.
       */
  def lpush(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Prepend one or multiple values to a list.
       */
  def lpush(key: java.lang.String, args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Prepend a value to a list, only if the list exists.
       */
  def lpushx(key: java.lang.String, value: java.lang.String): R = js.native
  /**
       * Prepend a value to a list, only if the list exists.
       */
  def lpushx(key: java.lang.String, value: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Get a range of elements from a list.
       */
  def lrange(key: java.lang.String, start: scala.Double, stop: scala.Double): R = js.native
  /**
       * Get a range of elements from a list.
       */
  def lrange(
    key: java.lang.String,
    start: scala.Double,
    stop: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Remove elements from a list.
       */
  def lrem(key: java.lang.String, count: scala.Double, value: java.lang.String): R = js.native
  /**
       * Remove elements from a list.
       */
  def lrem(key: java.lang.String, count: scala.Double, value: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Set the value of an element in a list by its index.
       */
  def lset(key: java.lang.String, index: scala.Double, value: java.lang.String): R = js.native
  /**
       * Set the value of an element in a list by its index.
       */
  @JSName("lset")
  def lset_OK(
    key: java.lang.String,
    index: scala.Double,
    value: java.lang.String,
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  /**
       * Trim a list to the specified range.
       */
  def ltrim(key: java.lang.String, start: scala.Double, stop: scala.Double): R = js.native
  /**
       * Trim a list to the specified range.
       */
  @JSName("ltrim")
  def ltrim_OK(
    key: java.lang.String,
    start: scala.Double,
    stop: scala.Double,
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  /**
       * Get the values of all given keys.
       */
  def mget(arg1: java.lang.String): R = js.native
  /**
       * Get the values of all given keys.
       */
  def mget(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Get the values of all given keys.
       */
  def mget(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Get the values of all given keys.
       */
  def mget(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Get the values of all given keys.
       */
  def mget(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Get the values of all given keys.
       */
  def mget(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Get the values of all given keys.
       */
  def mget(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Get the values of all given keys.
       */
  def mget(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Get the values of all given keys.
       */
  def mget(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Get the values of all given keys.
       */
  def mget(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Get the values of all given keys.
       */
  def mget(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Get the values of all given keys.
       */
  def mget(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Get the values of all given keys.
       */
  def mget(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Get the values of all given keys.
       */
  def mget(arg1: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Get the values of all given keys.
       */
  def mget(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Get the values of all given keys.
       */
  def mget(arg1: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Get the values of all given keys.
       */
  def mget(args: (java.lang.String | Callback[js.Array[java.lang.String]])*): R = js.native
  /**
       * Atomically tranfer a key from a Redis instance to another one.
       */
  def migrate(arg1: java.lang.String): R = js.native
  /**
       * Atomically tranfer a key from a Redis instance to another one.
       */
  def migrate(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Atomically tranfer a key from a Redis instance to another one.
       */
  def migrate(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Atomically tranfer a key from a Redis instance to another one.
       */
  def migrate(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Atomically tranfer a key from a Redis instance to another one.
       */
  def migrate(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Atomically tranfer a key from a Redis instance to another one.
       */
  def migrate(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Atomically tranfer a key from a Redis instance to another one.
       */
  def migrate(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Atomically tranfer a key from a Redis instance to another one.
       */
  def migrate(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Atomically tranfer a key from a Redis instance to another one.
       */
  def migrate(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Atomically tranfer a key from a Redis instance to another one.
       */
  def migrate(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Atomically tranfer a key from a Redis instance to another one.
       */
  def migrate(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  /**
       * Atomically tranfer a key from a Redis instance to another one.
       */
  def migrate(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Atomically tranfer a key from a Redis instance to another one.
       */
  def migrate(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  /**
       * Atomically tranfer a key from a Redis instance to another one.
       */
  def migrate(arg1: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  /**
       * Atomically tranfer a key from a Redis instance to another one.
       */
  def migrate(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Atomically tranfer a key from a Redis instance to another one.
       */
  def migrate(arg1: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  /**
       * Atomically tranfer a key from a Redis instance to another one.
       */
  def migrate(args: (java.lang.String | Callback[scala.Boolean])*): R = js.native
  /**
       * Listen for all requests received by the server in real time.
       */
  def monitor(): R = js.native
  /**
       * Listen for all requests received by the server in real time.
       */
  def monitor(cb: Callback[js.UndefOr[scala.Nothing]]): R = js.native
  /**
       * Move a key to another database.
       */
  def move(key: java.lang.String, db: java.lang.String): R = js.native
  /**
       * Move a key to another database.
       */
  def move(key: java.lang.String, db: scala.Double): R = js.native
  /**
       * Set multiple keys to multiple values.
       */
  def mset(arg1: java.lang.String): R = js.native
  /**
       * Set multiple keys to multiple values.
       */
  def mset(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Set multiple keys to multiple values.
       */
  def mset(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Set multiple keys to multiple values.
       */
  def mset(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Set multiple keys to multiple values.
       */
  def mset(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Set multiple keys to multiple values.
       */
  def mset(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Set multiple keys to multiple values.
       */
  def mset(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple keys to multiple values.
       */
  def mset(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple keys to multiple values.
       */
  def mset(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple keys to multiple values.
       */
  def mset(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple keys to multiple values.
       */
  def mset(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  /**
       * Set multiple keys to multiple values.
       */
  def mset(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Set multiple keys to multiple values.
       */
  def mset(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  /**
       * Set multiple keys to multiple values.
       */
  def mset(arg1: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  /**
       * Set multiple keys to multiple values.
       */
  def mset(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Set multiple keys to multiple values.
       */
  def mset(arg1: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  /**
       * Set multiple keys to multiple values.
       */
  def mset(args: (java.lang.String | Callback[scala.Boolean])*): R = js.native
  /**
       * Set multiple keys to multiple values, only if none of the keys exist.
       */
  def msetnx(arg1: java.lang.String): R = js.native
  /**
       * Set multiple keys to multiple values, only if none of the keys exist.
       */
  def msetnx(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Set multiple keys to multiple values, only if none of the keys exist.
       */
  def msetnx(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Set multiple keys to multiple values, only if none of the keys exist.
       */
  def msetnx(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Set multiple keys to multiple values, only if none of the keys exist.
       */
  def msetnx(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Set multiple keys to multiple values, only if none of the keys exist.
       */
  def msetnx(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Set multiple keys to multiple values, only if none of the keys exist.
       */
  def msetnx(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple keys to multiple values, only if none of the keys exist.
       */
  def msetnx(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple keys to multiple values, only if none of the keys exist.
       */
  def msetnx(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple keys to multiple values, only if none of the keys exist.
       */
  def msetnx(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Set multiple keys to multiple values, only if none of the keys exist.
       */
  def msetnx(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  /**
       * Set multiple keys to multiple values, only if none of the keys exist.
       */
  def msetnx(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Set multiple keys to multiple values, only if none of the keys exist.
       */
  def msetnx(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  /**
       * Set multiple keys to multiple values, only if none of the keys exist.
       */
  def msetnx(arg1: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  /**
       * Set multiple keys to multiple values, only if none of the keys exist.
       */
  def msetnx(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Set multiple keys to multiple values, only if none of the keys exist.
       */
  def msetnx(arg1: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  /**
       * Set multiple keys to multiple values, only if none of the keys exist.
       */
  def msetnx(args: (java.lang.String | Callback[scala.Boolean])*): R = js.native
  /**
       * Inspect the internals of Redis objects.
       */
  def `object`(arg1: java.lang.String): R = js.native
  /**
       * Inspect the internals of Redis objects.
       */
  def `object`(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Inspect the internals of Redis objects.
       */
  def `object`(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Inspect the internals of Redis objects.
       */
  def `object`(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Inspect the internals of Redis objects.
       */
  def `object`(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Inspect the internals of Redis objects.
       */
  def `object`(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Inspect the internals of Redis objects.
       */
  def `object`(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * Inspect the internals of Redis objects.
       */
  def `object`(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * Inspect the internals of Redis objects.
       */
  def `object`(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * Inspect the internals of Redis objects.
       */
  def `object`(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[_]): R = js.native
  /**
       * Inspect the internals of Redis objects.
       */
  def `object`(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[_]): R = js.native
  /**
       * Inspect the internals of Redis objects.
       */
  def `object`(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Inspect the internals of Redis objects.
       */
  def `object`(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[_]): R = js.native
  /**
       * Inspect the internals of Redis objects.
       */
  def `object`(arg1: java.lang.String, cb: Callback[_]): R = js.native
  /**
       * Inspect the internals of Redis objects.
       */
  def `object`(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Inspect the internals of Redis objects.
       */
  def `object`(arg1: js.Array[java.lang.String], cb: Callback[_]): R = js.native
  /**
       * Inspect the internals of Redis objects.
       */
  def `object`(args: (java.lang.String | Callback[_])*): R = js.native
  /**
       * Remove the expiration from a key.
       */
  def persist(key: java.lang.String): R = js.native
  /**
       * Remove the expiration from a key.
       */
  def persist(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Remove a key's time to live in milliseconds.
       */
  def pexpire(key: java.lang.String, milliseconds: scala.Double): R = js.native
  /**
       * Remove a key's time to live in milliseconds.
       */
  def pexpire(key: java.lang.String, milliseconds: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Set the expiration for a key as a UNIX timestamp specified in milliseconds.
       */
  def pexpireat(key: java.lang.String, millisecondsTimestamp: scala.Double): R = js.native
  /**
       * Set the expiration for a key as a UNIX timestamp specified in milliseconds.
       */
  def pexpireat(key: java.lang.String, millisecondsTimestamp: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Adds the specified elements to the specified HyperLogLog.
       */
  def pfadd(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Adds the specified elements to the specified HyperLogLog.
       */
  def pfadd(key: java.lang.String, arg1: java.lang.String): R = js.native
  /**
       * Adds the specified elements to the specified HyperLogLog.
       */
  def pfadd(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Adds the specified elements to the specified HyperLogLog.
       */
  def pfadd(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Adds the specified elements to the specified HyperLogLog.
       */
  def pfadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Adds the specified elements to the specified HyperLogLog.
       */
  def pfadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Adds the specified elements to the specified HyperLogLog.
       */
  def pfadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Adds the specified elements to the specified HyperLogLog.
       */
  def pfadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Adds the specified elements to the specified HyperLogLog.
       */
  def pfadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Adds the specified elements to the specified HyperLogLog.
       */
  def pfadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Adds the specified elements to the specified HyperLogLog.
       */
  def pfadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Adds the specified elements to the specified HyperLogLog.
       */
  def pfadd(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Adds the specified elements to the specified HyperLogLog.
       */
  def pfadd(key: java.lang.String, arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Adds the specified elements to the specified HyperLogLog.
       */
  def pfadd(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Adds the specified elements to the specified HyperLogLog.
       */
  def pfadd(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Adds the specified elements to the specified HyperLogLog.
       */
  def pfadd(key: java.lang.String, args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
       */
  def pfcount(arg1: java.lang.String): R = js.native
  /**
       * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
       */
  def pfcount(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
       */
  def pfcount(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
       */
  def pfcount(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
       */
  def pfcount(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
       */
  def pfcount(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
       */
  def pfcount(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
       */
  def pfcount(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
       */
  def pfcount(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
       */
  def pfcount(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
       */
  def pfcount(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
       */
  def pfcount(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
       */
  def pfcount(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
       */
  def pfcount(arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
       */
  def pfcount(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
       */
  def pfcount(arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Return the approximated cardinality of the set(s) observed by the HyperLogLog at key(s).
       */
  def pfcount(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Merge N different HyperLogLogs into a single one.
       */
  def pfmerge(arg1: java.lang.String): R = js.native
  /**
       * Merge N different HyperLogLogs into a single one.
       */
  def pfmerge(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Merge N different HyperLogLogs into a single one.
       */
  def pfmerge(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Merge N different HyperLogLogs into a single one.
       */
  def pfmerge(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Merge N different HyperLogLogs into a single one.
       */
  def pfmerge(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Merge N different HyperLogLogs into a single one.
       */
  def pfmerge(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Merge N different HyperLogLogs into a single one.
       */
  def pfmerge(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Merge N different HyperLogLogs into a single one.
       */
  def pfmerge(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Merge N different HyperLogLogs into a single one.
       */
  def pfmerge(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Merge N different HyperLogLogs into a single one.
       */
  def pfmerge(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Boolean]
  ): R = js.native
  /**
       * Merge N different HyperLogLogs into a single one.
       */
  def pfmerge(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  /**
       * Merge N different HyperLogLogs into a single one.
       */
  def pfmerge(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Merge N different HyperLogLogs into a single one.
       */
  def pfmerge(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  /**
       * Merge N different HyperLogLogs into a single one.
       */
  def pfmerge(arg1: java.lang.String, cb: Callback[scala.Boolean]): R = js.native
  /**
       * Merge N different HyperLogLogs into a single one.
       */
  def pfmerge(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Merge N different HyperLogLogs into a single one.
       */
  def pfmerge(arg1: js.Array[java.lang.String], cb: Callback[scala.Boolean]): R = js.native
  /**
       * Merge N different HyperLogLogs into a single one.
       */
  def pfmerge(args: (java.lang.String | Callback[scala.Boolean])*): R = js.native
  /**
       * Ping the server.
       */
  def ping(): R = js.native
  /**
       * Ping the server.
       */
  def ping(callback: Callback[java.lang.String]): R = js.native
  def ping(message: java.lang.String): R = js.native
  def ping(message: java.lang.String, callback: Callback[java.lang.String]): R = js.native
  /**
       * Set the value and expiration in milliseconds of a key.
       */
  def psetex(key: java.lang.String, milliseconds: scala.Double, value: java.lang.String): R = js.native
  /**
       * Set the value and expiration in milliseconds of a key.
       */
  @JSName("psetex")
  def psetex_OK(
    key: java.lang.String,
    milliseconds: scala.Double,
    value: java.lang.String,
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  /**
       * Listen for messages published to channels matching the given patterns.
       */
  def psubscribe(arg1: java.lang.String): R = js.native
  /**
       * Listen for messages published to channels matching the given patterns.
       */
  def psubscribe(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Listen for messages published to channels matching the given patterns.
       */
  def psubscribe(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Listen for messages published to channels matching the given patterns.
       */
  def psubscribe(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Listen for messages published to channels matching the given patterns.
       */
  def psubscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Listen for messages published to channels matching the given patterns.
       */
  def psubscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Listen for messages published to channels matching the given patterns.
       */
  def psubscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Listen for messages published to channels matching the given patterns.
       */
  def psubscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Listen for messages published to channels matching the given patterns.
       */
  def psubscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Listen for messages published to channels matching the given patterns.
       */
  def psubscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Listen for messages published to channels matching the given patterns.
       */
  def psubscribe(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Listen for messages published to channels matching the given patterns.
       */
  def psubscribe(arg1: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Listen for messages published to channels matching the given patterns.
       */
  def psubscribe(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Listen for messages published to channels matching the given patterns.
       */
  def psubscribe(arg1: js.Array[java.lang.String], cb: Callback[java.lang.String]): R = js.native
  /**
       * Listen for messages published to channels matching the given patterns.
       */
  def psubscribe(args: (java.lang.String | Callback[java.lang.String])*): R = js.native
  /**
       * Get the time to live for a key in milliseconds.
       */
  def pttl(key: java.lang.String): R = js.native
  /**
       * Get the time to live for a key in milliseconds.
       */
  def pttl(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Post a message to a channel.
       */
  def publish(channel: java.lang.String, value: java.lang.String): R = js.native
  /**
       * Post a message to a channel.
       */
  def publish(channel: java.lang.String, value: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Inspect the state of the Pub/Sub subsytem.
       */
  def pubsub(arg1: java.lang.String): R = js.native
  /**
       * Inspect the state of the Pub/Sub subsytem.
       */
  def pubsub(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Inspect the state of the Pub/Sub subsytem.
       */
  def pubsub(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Inspect the state of the Pub/Sub subsytem.
       */
  def pubsub(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Inspect the state of the Pub/Sub subsytem.
       */
  def pubsub(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Inspect the state of the Pub/Sub subsytem.
       */
  def pubsub(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Inspect the state of the Pub/Sub subsytem.
       */
  def pubsub(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Inspect the state of the Pub/Sub subsytem.
       */
  def pubsub(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Inspect the state of the Pub/Sub subsytem.
       */
  def pubsub(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Inspect the state of the Pub/Sub subsytem.
       */
  def pubsub(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Inspect the state of the Pub/Sub subsytem.
       */
  def pubsub(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Inspect the state of the Pub/Sub subsytem.
       */
  def pubsub(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Inspect the state of the Pub/Sub subsytem.
       */
  def pubsub(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Inspect the state of the Pub/Sub subsytem.
       */
  def pubsub(arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Inspect the state of the Pub/Sub subsytem.
       */
  def pubsub(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Inspect the state of the Pub/Sub subsytem.
       */
  def pubsub(arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Inspect the state of the Pub/Sub subsytem.
       */
  def pubsub(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Stop listening for messages posted to channels matching the given patterns.
       */
  def punsubscribe(arg1: java.lang.String): R = js.native
  /**
       * Stop listening for messages posted to channels matching the given patterns.
       */
  def punsubscribe(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Stop listening for messages posted to channels matching the given patterns.
       */
  def punsubscribe(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Stop listening for messages posted to channels matching the given patterns.
       */
  def punsubscribe(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Stop listening for messages posted to channels matching the given patterns.
       */
  def punsubscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Stop listening for messages posted to channels matching the given patterns.
       */
  def punsubscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Stop listening for messages posted to channels matching the given patterns.
       */
  def punsubscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Stop listening for messages posted to channels matching the given patterns.
       */
  def punsubscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Stop listening for messages posted to channels matching the given patterns.
       */
  def punsubscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Stop listening for messages posted to channels matching the given patterns.
       */
  def punsubscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Stop listening for messages posted to channels matching the given patterns.
       */
  def punsubscribe(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Stop listening for messages posted to channels matching the given patterns.
       */
  def punsubscribe(arg1: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Stop listening for messages posted to channels matching the given patterns.
       */
  def punsubscribe(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Stop listening for messages posted to channels matching the given patterns.
       */
  def punsubscribe(arg1: js.Array[java.lang.String], cb: Callback[java.lang.String]): R = js.native
  /**
       * Stop listening for messages posted to channels matching the given patterns.
       */
  def punsubscribe(args: (java.lang.String | Callback[java.lang.String])*): R = js.native
  /**
       * Close the connection.
       */
  def quit(): R = js.native
  /**
       * Close the connection.
       */
  @JSName("quit")
  def quit_OK(cb: Callback[redisLib.redisLibStrings.OK]): R = js.native
  /**
       * Return a random key from the keyspace.
       */
  def randomkey(): R = js.native
  /**
       * Return a random key from the keyspace.
       */
  def randomkey(cb: Callback[java.lang.String]): R = js.native
  /**
       * Enables read queries for a connection to a cluster slave node.
       */
  def readonly(): R = js.native
  /**
       * Enables read queries for a connection to a cluster slave node.
       */
  def readonly(cb: Callback[java.lang.String]): R = js.native
  /**
       * Disables read queries for a connection to cluster slave node.
       */
  def readwrite(): R = js.native
  /**
       * Disables read queries for a connection to cluster slave node.
       */
  def readwrite(cb: Callback[java.lang.String]): R = js.native
  /**
       * Rename a key.
       */
  def rename(key: java.lang.String, newkey: java.lang.String): R = js.native
  /**
       * Rename a key.
       */
  @JSName("rename")
  def rename_OK(key: java.lang.String, newkey: java.lang.String, cb: Callback[redisLib.redisLibStrings.OK]): R = js.native
  /**
       * Rename a key, only if the new key does not exist.
       */
  def renamenx(key: java.lang.String, newkey: java.lang.String): R = js.native
  /**
       * Rename a key, only if the new key does not exist.
       */
  def renamenx(key: java.lang.String, newkey: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Create a key using the provided serialized value, previously obtained using DUMP.
       */
  def restore(key: java.lang.String, ttl: scala.Double, serializedValue: java.lang.String): R = js.native
  /**
       * Create a key using the provided serialized value, previously obtained using DUMP.
       */
  @JSName("restore")
  def restore_OK(
    key: java.lang.String,
    ttl: scala.Double,
    serializedValue: java.lang.String,
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  /**
       * Return the role of the instance in the context of replication.
       */
  def role(): R = js.native
  /**
       * Return the role of the instance in the context of replication.
       */
  def role(
    cb: Callback[
      js.Tuple3[
        java.lang.String, 
        scala.Double, 
        js.Array[js.Tuple3[java.lang.String, java.lang.String, java.lang.String]]
      ]
    ]
  ): R = js.native
  /**
       * Remove and get the last element in a list.
       */
  def rpop(key: java.lang.String): R = js.native
  /**
       * Remove and get the last element in a list.
       */
  def rpop(key: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Remove the last element in a list, prepend it to another list and return it.
       */
  def rpoplpush(source: java.lang.String, destination: java.lang.String): R = js.native
  /**
       * Remove the last element in a list, prepend it to another list and return it.
       */
  def rpoplpush(source: java.lang.String, destination: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Append one or multiple values to a list.
       */
  def rpush(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Append one or multiple values to a list.
       */
  def rpush(key: java.lang.String, arg1: java.lang.String): R = js.native
  /**
       * Append one or multiple values to a list.
       */
  def rpush(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Append one or multiple values to a list.
       */
  def rpush(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Append one or multiple values to a list.
       */
  def rpush(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Append one or multiple values to a list.
       */
  def rpush(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Append one or multiple values to a list.
       */
  def rpush(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Append one or multiple values to a list.
       */
  def rpush(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Append one or multiple values to a list.
       */
  def rpush(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Append one or multiple values to a list.
       */
  def rpush(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Append one or multiple values to a list.
       */
  def rpush(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Append one or multiple values to a list.
       */
  def rpush(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Append one or multiple values to a list.
       */
  def rpush(key: java.lang.String, arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Append one or multiple values to a list.
       */
  def rpush(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Append one or multiple values to a list.
       */
  def rpush(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Append one or multiple values to a list.
       */
  def rpush(key: java.lang.String, args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Append a value to a list, only if the list exists.
       */
  def rpushx(key: java.lang.String, value: java.lang.String): R = js.native
  /**
       * Append a value to a list, only if the list exists.
       */
  def rpushx(key: java.lang.String, value: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Append one or multiple members to a set.
       */
  def sadd(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Append one or multiple members to a set.
       */
  def sadd(key: java.lang.String, arg1: java.lang.String): R = js.native
  /**
       * Append one or multiple members to a set.
       */
  def sadd(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Append one or multiple members to a set.
       */
  def sadd(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Append one or multiple members to a set.
       */
  def sadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Append one or multiple members to a set.
       */
  def sadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Append one or multiple members to a set.
       */
  def sadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Append one or multiple members to a set.
       */
  def sadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Append one or multiple members to a set.
       */
  def sadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Append one or multiple members to a set.
       */
  def sadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Append one or multiple members to a set.
       */
  def sadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Append one or multiple members to a set.
       */
  def sadd(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Append one or multiple members to a set.
       */
  def sadd(key: java.lang.String, arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Append one or multiple members to a set.
       */
  def sadd(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Append one or multiple members to a set.
       */
  def sadd(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Append one or multiple members to a set.
       */
  def sadd(key: java.lang.String, args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Synchronously save the dataset to disk.
       */
  def save(): R = js.native
  /**
       * Synchronously save the dataset to disk.
       */
  def save(cb: Callback[java.lang.String]): R = js.native
  /**
       * Incrementally iterate the keys space.
       */
  def scan(arg1: java.lang.String): R = js.native
  /**
       * Incrementally iterate the keys space.
       */
  def scan(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Incrementally iterate the keys space.
       */
  def scan(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Incrementally iterate the keys space.
       */
  def scan(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Incrementally iterate the keys space.
       */
  def scan(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Incrementally iterate the keys space.
       */
  def scan(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Incrementally iterate the keys space.
       */
  def scan(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate the keys space.
       */
  def scan(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate the keys space.
       */
  def scan(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate the keys space.
       */
  def scan(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate the keys space.
       */
  def scan(
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate the keys space.
       */
  def scan(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Incrementally iterate the keys space.
       */
  def scan(
    arg1: java.lang.String,
    arg2: js.Array[java.lang.String],
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate the keys space.
       */
  def scan(arg1: java.lang.String, cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]): R = js.native
  /**
       * Incrementally iterate the keys space.
       */
  def scan(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Incrementally iterate the keys space.
       */
  def scan(
    arg1: js.Array[java.lang.String],
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate the keys space.
       */
  def scan(args: (java.lang.String | (Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]))*): R = js.native
  /**
       * Get the number of members in a set.
       */
  def scard(key: java.lang.String): R = js.native
  /**
       * Get the number of members in a set.
       */
  def scard(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * DEBUG - Set the debug mode for executed scripts.
       * EXISTS - Check existence of scripts in the script cache.
       * FLUSH - Remove all scripts from the script cache.
       * KILL - Kill the script currently in execution.
       * LOAD - Load the specified Lua script into the script cache.
       */
  def script(arg1: java.lang.String): R = js.native
  /**
       * DEBUG - Set the debug mode for executed scripts.
       * EXISTS - Check existence of scripts in the script cache.
       * FLUSH - Remove all scripts from the script cache.
       * KILL - Kill the script currently in execution.
       * LOAD - Load the specified Lua script into the script cache.
       */
  def script(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * DEBUG - Set the debug mode for executed scripts.
       * EXISTS - Check existence of scripts in the script cache.
       * FLUSH - Remove all scripts from the script cache.
       * KILL - Kill the script currently in execution.
       * LOAD - Load the specified Lua script into the script cache.
       */
  def script(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * DEBUG - Set the debug mode for executed scripts.
       * EXISTS - Check existence of scripts in the script cache.
       * FLUSH - Remove all scripts from the script cache.
       * KILL - Kill the script currently in execution.
       * LOAD - Load the specified Lua script into the script cache.
       */
  def script(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * DEBUG - Set the debug mode for executed scripts.
       * EXISTS - Check existence of scripts in the script cache.
       * FLUSH - Remove all scripts from the script cache.
       * KILL - Kill the script currently in execution.
       * LOAD - Load the specified Lua script into the script cache.
       */
  def script(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * DEBUG - Set the debug mode for executed scripts.
       * EXISTS - Check existence of scripts in the script cache.
       * FLUSH - Remove all scripts from the script cache.
       * KILL - Kill the script currently in execution.
       * LOAD - Load the specified Lua script into the script cache.
       */
  def script(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * DEBUG - Set the debug mode for executed scripts.
       * EXISTS - Check existence of scripts in the script cache.
       * FLUSH - Remove all scripts from the script cache.
       * KILL - Kill the script currently in execution.
       * LOAD - Load the specified Lua script into the script cache.
       */
  def script(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * DEBUG - Set the debug mode for executed scripts.
       * EXISTS - Check existence of scripts in the script cache.
       * FLUSH - Remove all scripts from the script cache.
       * KILL - Kill the script currently in execution.
       * LOAD - Load the specified Lua script into the script cache.
       */
  def script(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * DEBUG - Set the debug mode for executed scripts.
       * EXISTS - Check existence of scripts in the script cache.
       * FLUSH - Remove all scripts from the script cache.
       * KILL - Kill the script currently in execution.
       * LOAD - Load the specified Lua script into the script cache.
       */
  def script(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[_]
  ): R = js.native
  /**
       * DEBUG - Set the debug mode for executed scripts.
       * EXISTS - Check existence of scripts in the script cache.
       * FLUSH - Remove all scripts from the script cache.
       * KILL - Kill the script currently in execution.
       * LOAD - Load the specified Lua script into the script cache.
       */
  def script(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[_]): R = js.native
  /**
       * DEBUG - Set the debug mode for executed scripts.
       * EXISTS - Check existence of scripts in the script cache.
       * FLUSH - Remove all scripts from the script cache.
       * KILL - Kill the script currently in execution.
       * LOAD - Load the specified Lua script into the script cache.
       */
  def script(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[_]): R = js.native
  /**
       * DEBUG - Set the debug mode for executed scripts.
       * EXISTS - Check existence of scripts in the script cache.
       * FLUSH - Remove all scripts from the script cache.
       * KILL - Kill the script currently in execution.
       * LOAD - Load the specified Lua script into the script cache.
       */
  def script(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * DEBUG - Set the debug mode for executed scripts.
       * EXISTS - Check existence of scripts in the script cache.
       * FLUSH - Remove all scripts from the script cache.
       * KILL - Kill the script currently in execution.
       * LOAD - Load the specified Lua script into the script cache.
       */
  def script(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[_]): R = js.native
  /**
       * DEBUG - Set the debug mode for executed scripts.
       * EXISTS - Check existence of scripts in the script cache.
       * FLUSH - Remove all scripts from the script cache.
       * KILL - Kill the script currently in execution.
       * LOAD - Load the specified Lua script into the script cache.
       */
  def script(arg1: java.lang.String, cb: Callback[_]): R = js.native
  /**
       * DEBUG - Set the debug mode for executed scripts.
       * EXISTS - Check existence of scripts in the script cache.
       * FLUSH - Remove all scripts from the script cache.
       * KILL - Kill the script currently in execution.
       * LOAD - Load the specified Lua script into the script cache.
       */
  def script(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * DEBUG - Set the debug mode for executed scripts.
       * EXISTS - Check existence of scripts in the script cache.
       * FLUSH - Remove all scripts from the script cache.
       * KILL - Kill the script currently in execution.
       * LOAD - Load the specified Lua script into the script cache.
       */
  def script(arg1: js.Array[java.lang.String], cb: Callback[_]): R = js.native
  /**
       * DEBUG - Set the debug mode for executed scripts.
       * EXISTS - Check existence of scripts in the script cache.
       * FLUSH - Remove all scripts from the script cache.
       * KILL - Kill the script currently in execution.
       * LOAD - Load the specified Lua script into the script cache.
       */
  def script(args: (java.lang.String | Callback[_])*): R = js.native
  /**
       * Subtract multiple sets.
       */
  def sdiff(arg1: java.lang.String): R = js.native
  /**
       * Subtract multiple sets.
       */
  def sdiff(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Subtract multiple sets.
       */
  def sdiff(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Subtract multiple sets.
       */
  def sdiff(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Subtract multiple sets.
       */
  def sdiff(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Subtract multiple sets.
       */
  def sdiff(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Subtract multiple sets.
       */
  def sdiff(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Subtract multiple sets.
       */
  def sdiff(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Subtract multiple sets.
       */
  def sdiff(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Subtract multiple sets.
       */
  def sdiff(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Subtract multiple sets.
       */
  def sdiff(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Subtract multiple sets.
       */
  def sdiff(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Subtract multiple sets.
       */
  def sdiff(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Subtract multiple sets.
       */
  def sdiff(arg1: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Subtract multiple sets.
       */
  def sdiff(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Subtract multiple sets.
       */
  def sdiff(arg1: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Subtract multiple sets.
       */
  def sdiff(args: (java.lang.String | Callback[js.Array[java.lang.String]])*): R = js.native
  /**
       * Subtract multiple sets and store the resulting set in a key.
       */
  def sdiffstore(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Subtract multiple sets and store the resulting set in a key.
       */
  def sdiffstore(key: java.lang.String, arg1: java.lang.String): R = js.native
  /**
       * Subtract multiple sets and store the resulting set in a key.
       */
  def sdiffstore(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Subtract multiple sets and store the resulting set in a key.
       */
  def sdiffstore(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Subtract multiple sets and store the resulting set in a key.
       */
  def sdiffstore(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Subtract multiple sets and store the resulting set in a key.
       */
  def sdiffstore(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Subtract multiple sets and store the resulting set in a key.
       */
  def sdiffstore(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Subtract multiple sets and store the resulting set in a key.
       */
  def sdiffstore(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Subtract multiple sets and store the resulting set in a key.
       */
  def sdiffstore(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Subtract multiple sets and store the resulting set in a key.
       */
  def sdiffstore(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Subtract multiple sets and store the resulting set in a key.
       */
  def sdiffstore(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Subtract multiple sets and store the resulting set in a key.
       */
  def sdiffstore(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Subtract multiple sets and store the resulting set in a key.
       */
  def sdiffstore(key: java.lang.String, arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Subtract multiple sets and store the resulting set in a key.
       */
  def sdiffstore(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Subtract multiple sets and store the resulting set in a key.
       */
  def sdiffstore(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Subtract multiple sets and store the resulting set in a key.
       */
  def sdiffstore(key: java.lang.String, args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Change the selected database for the current connection.
       */
  def select(index: java.lang.String): R = js.native
  /**
       * Change the selected database for the current connection.
       */
  def select(index: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Change the selected database for the current connection.
       */
  def select(index: scala.Double): R = js.native
  /**
       * Change the selected database for the current connection.
       */
  def select(index: scala.Double, cb: Callback[java.lang.String]): R = js.native
  /**
       * Set the string value of a key.
       */
  def set(key: java.lang.String, value: java.lang.String): R = js.native
  def set(key: java.lang.String, value: java.lang.String, flag: java.lang.String): R = js.native
  def set(key: java.lang.String, value: java.lang.String, mode: java.lang.String, duration: scala.Double): R = js.native
  def set(
    key: java.lang.String,
    value: java.lang.String,
    mode: java.lang.String,
    duration: scala.Double,
    flag: java.lang.String
  ): R = js.native
  /**
       * Set the string value of a key.
       */
  @JSName("set")
  def set_OK(key: java.lang.String, value: java.lang.String, cb: Callback[redisLib.redisLibStrings.OK]): R = js.native
  @JSName("set")
  def set_OK(
    key: java.lang.String,
    value: java.lang.String,
    flag: java.lang.String,
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  @JSName("set")
  def set_OK(
    key: java.lang.String,
    value: java.lang.String,
    mode: java.lang.String,
    duration: scala.Double,
    cb: Callback[js.UndefOr[redisLib.redisLibStrings.OK]]
  ): R = js.native
  @JSName("set")
  def set_OK(
    key: java.lang.String,
    value: java.lang.String,
    mode: java.lang.String,
    duration: scala.Double,
    flag: java.lang.String,
    cb: Callback[js.UndefOr[redisLib.redisLibStrings.OK]]
  ): R = js.native
  /**
       * Sets or clears the bit at offset in the string value stored at key.
       */
  def setbit(key: java.lang.String, offset: scala.Double, value: java.lang.String): R = js.native
  /**
       * Sets or clears the bit at offset in the string value stored at key.
       */
  def setbit(key: java.lang.String, offset: scala.Double, value: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Set the value and expiration of a key.
       */
  def setex(key: java.lang.String, seconds: scala.Double, value: java.lang.String): R = js.native
  /**
       * Set the value and expiration of a key.
       */
  def setex(
    key: java.lang.String,
    seconds: scala.Double,
    value: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Set the value of a key, only if the key does not exist.
       */
  def setnx(key: java.lang.String, value: java.lang.String): R = js.native
  /**
       * Set the value of a key, only if the key does not exist.
       */
  def setnx(key: java.lang.String, value: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Overwrite part of a string at key starting at the specified offset.
       */
  def setrange(key: java.lang.String, offset: scala.Double, value: java.lang.String): R = js.native
  /**
       * Overwrite part of a string at key starting at the specified offset.
       */
  def setrange(key: java.lang.String, offset: scala.Double, value: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Synchronously save the dataset to disk and then shut down the server.
       */
  def shutdown(arg1: java.lang.String): R = js.native
  /**
       * Synchronously save the dataset to disk and then shut down the server.
       */
  def shutdown(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Synchronously save the dataset to disk and then shut down the server.
       */
  def shutdown(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Synchronously save the dataset to disk and then shut down the server.
       */
  def shutdown(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Synchronously save the dataset to disk and then shut down the server.
       */
  def shutdown(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Synchronously save the dataset to disk and then shut down the server.
       */
  def shutdown(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Synchronously save the dataset to disk and then shut down the server.
       */
  def shutdown(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Synchronously save the dataset to disk and then shut down the server.
       */
  def shutdown(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Synchronously save the dataset to disk and then shut down the server.
       */
  def shutdown(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Synchronously save the dataset to disk and then shut down the server.
       */
  def shutdown(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Synchronously save the dataset to disk and then shut down the server.
       */
  def shutdown(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Synchronously save the dataset to disk and then shut down the server.
       */
  def shutdown(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Synchronously save the dataset to disk and then shut down the server.
       */
  def shutdown(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[java.lang.String]): R = js.native
  /**
       * Synchronously save the dataset to disk and then shut down the server.
       */
  def shutdown(arg1: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Synchronously save the dataset to disk and then shut down the server.
       */
  def shutdown(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Synchronously save the dataset to disk and then shut down the server.
       */
  def shutdown(arg1: js.Array[java.lang.String], cb: Callback[java.lang.String]): R = js.native
  /**
       * Synchronously save the dataset to disk and then shut down the server.
       */
  def shutdown(args: (java.lang.String | Callback[java.lang.String])*): R = js.native
  /**
       * Intersect multiple sets.
       */
  def sinter(args: (java.lang.String | Callback[js.Array[java.lang.String]])*): R = js.native
  /**
       * Intersect multiple sets.
       */
  def sinter(key: java.lang.String, arg1: java.lang.String): R = js.native
  /**
       * Intersect multiple sets.
       */
  def sinter(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Intersect multiple sets.
       */
  def sinter(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Intersect multiple sets.
       */
  def sinter(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Intersect multiple sets.
       */
  def sinter(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Intersect multiple sets.
       */
  def sinter(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Intersect multiple sets.
       */
  def sinter(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Intersect multiple sets.
       */
  def sinter(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Intersect multiple sets.
       */
  def sinter(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Intersect multiple sets.
       */
  def sinter(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Intersect multiple sets.
       */
  def sinter(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Intersect multiple sets.
       */
  def sinter(key: java.lang.String, arg1: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Intersect multiple sets.
       */
  def sinter(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Intersect multiple sets.
       */
  def sinter(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Intersect multiple sets.
       */
  def sinter(key: java.lang.String, args: (java.lang.String | Callback[js.Array[java.lang.String]])*): R = js.native
  /**
       * Intersect multiple sets and store the resulting set in a key.
       */
  def sinterstore(arg1: java.lang.String): R = js.native
  /**
       * Intersect multiple sets and store the resulting set in a key.
       */
  def sinterstore(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Intersect multiple sets and store the resulting set in a key.
       */
  def sinterstore(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Intersect multiple sets and store the resulting set in a key.
       */
  def sinterstore(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Intersect multiple sets and store the resulting set in a key.
       */
  def sinterstore(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Intersect multiple sets and store the resulting set in a key.
       */
  def sinterstore(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Intersect multiple sets and store the resulting set in a key.
       */
  def sinterstore(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sets and store the resulting set in a key.
       */
  def sinterstore(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sets and store the resulting set in a key.
       */
  def sinterstore(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sets and store the resulting set in a key.
       */
  def sinterstore(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Intersect multiple sets and store the resulting set in a key.
       */
  def sinterstore(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Intersect multiple sets and store the resulting set in a key.
       */
  def sinterstore(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Intersect multiple sets and store the resulting set in a key.
       */
  def sinterstore(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Intersect multiple sets and store the resulting set in a key.
       */
  def sinterstore(arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Intersect multiple sets and store the resulting set in a key.
       */
  def sinterstore(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Intersect multiple sets and store the resulting set in a key.
       */
  def sinterstore(arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Intersect multiple sets and store the resulting set in a key.
       */
  def sinterstore(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Determine if a given value is a member of a set.
       */
  def sismember(key: java.lang.String, member: java.lang.String): R = js.native
  /**
       * Determine if a given value is a member of a set.
       */
  def sismember(key: java.lang.String, member: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Make the server a slave of another instance, or promote it as master.
       */
  def slaveof(host: java.lang.String, port: java.lang.String): R = js.native
  /**
       * Make the server a slave of another instance, or promote it as master.
       */
  def slaveof(host: java.lang.String, port: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Make the server a slave of another instance, or promote it as master.
       */
  def slaveof(host: java.lang.String, port: scala.Double): R = js.native
  /**
       * Make the server a slave of another instance, or promote it as master.
       */
  def slaveof(host: java.lang.String, port: scala.Double, cb: Callback[java.lang.String]): R = js.native
  /**
       * Manages the Redis slow queries log.
       */
  def slowlog(arg1: java.lang.String): R = js.native
  /**
       * Manages the Redis slow queries log.
       */
  def slowlog(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Manages the Redis slow queries log.
       */
  def slowlog(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Manages the Redis slow queries log.
       */
  def slowlog(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Manages the Redis slow queries log.
       */
  def slowlog(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Manages the Redis slow queries log.
       */
  def slowlog(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Manages the Redis slow queries log.
       */
  def slowlog(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[
      js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]]
    ]
  ): R = js.native
  /**
       * Manages the Redis slow queries log.
       */
  def slowlog(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[
      js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]]
    ]
  ): R = js.native
  /**
       * Manages the Redis slow queries log.
       */
  def slowlog(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[
      js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]]
    ]
  ): R = js.native
  /**
       * Manages the Redis slow queries log.
       */
  def slowlog(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[
      js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]]
    ]
  ): R = js.native
  /**
       * Manages the Redis slow queries log.
       */
  def slowlog(
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[
      js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]]
    ]
  ): R = js.native
  /**
       * Manages the Redis slow queries log.
       */
  def slowlog(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Manages the Redis slow queries log.
       */
  def slowlog(
    arg1: java.lang.String,
    arg2: js.Array[java.lang.String],
    cb: Callback[
      js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]]
    ]
  ): R = js.native
  /**
       * Manages the Redis slow queries log.
       */
  def slowlog(
    arg1: java.lang.String,
    cb: Callback[
      js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]]
    ]
  ): R = js.native
  /**
       * Manages the Redis slow queries log.
       */
  def slowlog(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Manages the Redis slow queries log.
       */
  def slowlog(
    arg1: js.Array[java.lang.String],
    cb: Callback[
      js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]]
    ]
  ): R = js.native
  /**
       * Manages the Redis slow queries log.
       */
  def slowlog(
    args: (java.lang.String | (Callback[
      js.Array[js.Tuple4[scala.Double, scala.Double, scala.Double, js.Array[java.lang.String]]]
    ]))*
  ): R = js.native
  /**
       * Get all the members in a set.
       */
  def smembers(key: java.lang.String): R = js.native
  /**
       * Get all the members in a set.
       */
  def smembers(key: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Move a member from one set to another.
       */
  def smove(source: java.lang.String, destination: java.lang.String, member: java.lang.String): R = js.native
  /**
       * Move a member from one set to another.
       */
  def smove(
    source: java.lang.String,
    destination: java.lang.String,
    member: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Sort the elements in a list, set or sorted set.
       */
  def sort(arg1: java.lang.String): R = js.native
  /**
       * Sort the elements in a list, set or sorted set.
       */
  def sort(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Sort the elements in a list, set or sorted set.
       */
  def sort(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Sort the elements in a list, set or sorted set.
       */
  def sort(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Sort the elements in a list, set or sorted set.
       */
  def sort(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Sort the elements in a list, set or sorted set.
       */
  def sort(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Sort the elements in a list, set or sorted set.
       */
  def sort(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Sort the elements in a list, set or sorted set.
       */
  def sort(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Sort the elements in a list, set or sorted set.
       */
  def sort(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Sort the elements in a list, set or sorted set.
       */
  def sort(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Sort the elements in a list, set or sorted set.
       */
  def sort(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Sort the elements in a list, set or sorted set.
       */
  def sort(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Sort the elements in a list, set or sorted set.
       */
  def sort(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Sort the elements in a list, set or sorted set.
       */
  def sort(arg1: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Sort the elements in a list, set or sorted set.
       */
  def sort(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Sort the elements in a list, set or sorted set.
       */
  def sort(arg1: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Sort the elements in a list, set or sorted set.
       */
  def sort(args: (java.lang.String | Callback[js.Array[java.lang.String]])*): R = js.native
  /**
       * Remove and return one or multiple random members from a set.
       */
  def spop(key: java.lang.String): R = js.native
  /**
       * Remove and return one or multiple random members from a set.
       */
  def spop(key: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def spop(key: java.lang.String, count: scala.Double): R = js.native
  def spop(key: java.lang.String, count: scala.Double, cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Get one or multiple random members from a set.
       */
  def srandmember(key: java.lang.String): R = js.native
  /**
       * Get one or multiple random members from a set.
       */
  def srandmember(key: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  def srandmember(key: java.lang.String, count: scala.Double): R = js.native
  def srandmember(key: java.lang.String, count: scala.Double, cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Remove one or more members from a set.
       */
  def srem(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Remove one or more members from a set.
       */
  def srem(key: java.lang.String, arg1: java.lang.String): R = js.native
  /**
       * Remove one or more members from a set.
       */
  def srem(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Remove one or more members from a set.
       */
  def srem(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Remove one or more members from a set.
       */
  def srem(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Remove one or more members from a set.
       */
  def srem(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Remove one or more members from a set.
       */
  def srem(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Remove one or more members from a set.
       */
  def srem(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Remove one or more members from a set.
       */
  def srem(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Remove one or more members from a set.
       */
  def srem(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Remove one or more members from a set.
       */
  def srem(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Remove one or more members from a set.
       */
  def srem(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Remove one or more members from a set.
       */
  def srem(key: java.lang.String, arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Remove one or more members from a set.
       */
  def srem(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Remove one or more members from a set.
       */
  def srem(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Remove one or more members from a set.
       */
  def srem(key: java.lang.String, args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Incrementally iterate Set elements.
       */
  def sscan(args: (java.lang.String | (Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]))*): R = js.native
  /**
       * Incrementally iterate Set elements.
       */
  def sscan(key: java.lang.String, arg1: java.lang.String): R = js.native
  /**
       * Incrementally iterate Set elements.
       */
  def sscan(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Incrementally iterate Set elements.
       */
  def sscan(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Incrementally iterate Set elements.
       */
  def sscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Incrementally iterate Set elements.
       */
  def sscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Incrementally iterate Set elements.
       */
  def sscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Incrementally iterate Set elements.
       */
  def sscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate Set elements.
       */
  def sscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate Set elements.
       */
  def sscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate Set elements.
       */
  def sscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate Set elements.
       */
  def sscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate Set elements.
       */
  def sscan(
    key: java.lang.String,
    arg1: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate Set elements.
       */
  def sscan(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Incrementally iterate Set elements.
       */
  def sscan(
    key: java.lang.String,
    arg1: js.Array[java.lang.String],
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate Set elements.
       */
  def sscan(
    key: java.lang.String,
    args: (java.lang.String | (Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]))*
  ): R = js.native
  /**
       * Get the length of the value stored in a key.
       */
  def strlen(key: java.lang.String): R = js.native
  /**
       * Get the length of the value stored in a key.
       */
  def strlen(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Listen for messages published to the given channels.
       */
  def subscribe(arg1: java.lang.String): R = js.native
  /**
       * Listen for messages published to the given channels.
       */
  def subscribe(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Listen for messages published to the given channels.
       */
  def subscribe(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Listen for messages published to the given channels.
       */
  def subscribe(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Listen for messages published to the given channels.
       */
  def subscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Listen for messages published to the given channels.
       */
  def subscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Listen for messages published to the given channels.
       */
  def subscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Listen for messages published to the given channels.
       */
  def subscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Listen for messages published to the given channels.
       */
  def subscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Listen for messages published to the given channels.
       */
  def subscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Listen for messages published to the given channels.
       */
  def subscribe(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Listen for messages published to the given channels.
       */
  def subscribe(arg1: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Listen for messages published to the given channels.
       */
  def subscribe(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Listen for messages published to the given channels.
       */
  def subscribe(arg1: js.Array[java.lang.String], cb: Callback[java.lang.String]): R = js.native
  /**
       * Listen for messages published to the given channels.
       */
  def subscribe(args: (java.lang.String | Callback[java.lang.String])*): R = js.native
  /**
       * Add multiple sets.
       */
  def sunion(arg1: java.lang.String): R = js.native
  /**
       * Add multiple sets.
       */
  def sunion(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Add multiple sets.
       */
  def sunion(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Add multiple sets.
       */
  def sunion(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Add multiple sets.
       */
  def sunion(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Add multiple sets.
       */
  def sunion(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Add multiple sets.
       */
  def sunion(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Add multiple sets.
       */
  def sunion(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Add multiple sets.
       */
  def sunion(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Add multiple sets.
       */
  def sunion(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Add multiple sets.
       */
  def sunion(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Add multiple sets.
       */
  def sunion(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Add multiple sets.
       */
  def sunion(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Add multiple sets.
       */
  def sunion(arg1: java.lang.String, cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Add multiple sets.
       */
  def sunion(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Add multiple sets.
       */
  def sunion(arg1: js.Array[java.lang.String], cb: Callback[js.Array[java.lang.String]]): R = js.native
  /**
       * Add multiple sets.
       */
  def sunion(args: (java.lang.String | Callback[js.Array[java.lang.String]])*): R = js.native
  /**
       * Add multiple sets and store the resulting set in a key.
       */
  def sunionstore(arg1: java.lang.String): R = js.native
  /**
       * Add multiple sets and store the resulting set in a key.
       */
  def sunionstore(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Add multiple sets and store the resulting set in a key.
       */
  def sunionstore(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Add multiple sets and store the resulting set in a key.
       */
  def sunionstore(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Add multiple sets and store the resulting set in a key.
       */
  def sunionstore(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Add multiple sets and store the resulting set in a key.
       */
  def sunionstore(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Add multiple sets and store the resulting set in a key.
       */
  def sunionstore(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sets and store the resulting set in a key.
       */
  def sunionstore(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sets and store the resulting set in a key.
       */
  def sunionstore(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sets and store the resulting set in a key.
       */
  def sunionstore(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Add multiple sets and store the resulting set in a key.
       */
  def sunionstore(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Add multiple sets and store the resulting set in a key.
       */
  def sunionstore(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Add multiple sets and store the resulting set in a key.
       */
  def sunionstore(arg1: java.lang.String, arg2: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Add multiple sets and store the resulting set in a key.
       */
  def sunionstore(arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Add multiple sets and store the resulting set in a key.
       */
  def sunionstore(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Add multiple sets and store the resulting set in a key.
       */
  def sunionstore(arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Add multiple sets and store the resulting set in a key.
       */
  def sunionstore(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Internal command used for replication.
       */
  def sync(): R = js.native
  /**
       * Internal command used for replication.
       */
  def sync(cb: Callback[js.UndefOr[scala.Nothing]]): R = js.native
  /**
       * Return the current server time.
       */
  def time(): R = js.native
  /**
       * Return the current server time.
       */
  def time(cb: Callback[js.Tuple2[java.lang.String, java.lang.String]]): R = js.native
  /**
       * Get the time to live for a key.
       */
  def ttl(key: java.lang.String): R = js.native
  /**
       * Get the time to live for a key.
       */
  def ttl(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Determine the type stored at key.
       */
  def `type`(key: java.lang.String): R = js.native
  /**
       * Determine the type stored at key.
       */
  def `type`(key: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Stop listening for messages posted to the given channels.
       */
  def unsubscribe(arg1: java.lang.String): R = js.native
  /**
       * Stop listening for messages posted to the given channels.
       */
  def unsubscribe(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Stop listening for messages posted to the given channels.
       */
  def unsubscribe(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Stop listening for messages posted to the given channels.
       */
  def unsubscribe(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Stop listening for messages posted to the given channels.
       */
  def unsubscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Stop listening for messages posted to the given channels.
       */
  def unsubscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Stop listening for messages posted to the given channels.
       */
  def unsubscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Stop listening for messages posted to the given channels.
       */
  def unsubscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Stop listening for messages posted to the given channels.
       */
  def unsubscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Stop listening for messages posted to the given channels.
       */
  def unsubscribe(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Stop listening for messages posted to the given channels.
       */
  def unsubscribe(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Stop listening for messages posted to the given channels.
       */
  def unsubscribe(arg1: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Stop listening for messages posted to the given channels.
       */
  def unsubscribe(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Stop listening for messages posted to the given channels.
       */
  def unsubscribe(arg1: js.Array[java.lang.String], cb: Callback[java.lang.String]): R = js.native
  /**
       * Stop listening for messages posted to the given channels.
       */
  def unsubscribe(args: (java.lang.String | Callback[java.lang.String])*): R = js.native
  /**
       * Forget about all watched keys.
       */
  def unwatch(): R = js.native
  /**
       * Forget about all watched keys.
       */
  @JSName("unwatch")
  def unwatch_OK(cb: Callback[redisLib.redisLibStrings.OK]): R = js.native
  /**
       * Wait for the synchronous replication of all the write commands sent in the context of the current connection.
       */
  def wait(numslaves: scala.Double, timeout: scala.Double): R = js.native
  /**
       * Wait for the synchronous replication of all the write commands sent in the context of the current connection.
       */
  def wait(numslaves: scala.Double, timeout: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Watch the given keys to determine execution of the MULTI/EXEC block.
       */
  def watch(arg1: java.lang.String): R = js.native
  /**
       * Watch the given keys to determine execution of the MULTI/EXEC block.
       */
  def watch(arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Watch the given keys to determine execution of the MULTI/EXEC block.
       */
  def watch(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Watch the given keys to determine execution of the MULTI/EXEC block.
       */
  def watch(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Watch the given keys to determine execution of the MULTI/EXEC block.
       */
  def watch(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Watch the given keys to determine execution of the MULTI/EXEC block.
       */
  def watch(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Watch the given keys to determine execution of the MULTI/EXEC block.
       */
  def watch(arg1: java.lang.String, arg2: js.Array[java.lang.String]): R = js.native
  /**
       * Watch the given keys to determine execution of the MULTI/EXEC block.
       */
  def watch(arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Watch the given keys to determine execution of the MULTI/EXEC block.
       */
  @JSName("watch")
  def watch_OK(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  /**
       * Watch the given keys to determine execution of the MULTI/EXEC block.
       */
  @JSName("watch")
  def watch_OK(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  /**
       * Watch the given keys to determine execution of the MULTI/EXEC block.
       */
  @JSName("watch")
  def watch_OK(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  /**
       * Watch the given keys to determine execution of the MULTI/EXEC block.
       */
  @JSName("watch")
  def watch_OK(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  /**
       * Watch the given keys to determine execution of the MULTI/EXEC block.
       */
  @JSName("watch")
  def watch_OK(arg1: java.lang.String, arg2: java.lang.String, cb: Callback[redisLib.redisLibStrings.OK]): R = js.native
  /**
       * Watch the given keys to determine execution of the MULTI/EXEC block.
       */
  @JSName("watch")
  def watch_OK(
    arg1: java.lang.String,
    arg2: js.Array[java.lang.String],
    cb: Callback[redisLib.redisLibStrings.OK]
  ): R = js.native
  /**
       * Watch the given keys to determine execution of the MULTI/EXEC block.
       */
  @JSName("watch")
  def watch_OK(arg1: java.lang.String, cb: Callback[redisLib.redisLibStrings.OK]): R = js.native
  /**
       * Watch the given keys to determine execution of the MULTI/EXEC block.
       */
  @JSName("watch")
  def watch_OK(arg1: js.Array[java.lang.String], cb: Callback[redisLib.redisLibStrings.OK]): R = js.native
  /**
       * Watch the given keys to determine execution of the MULTI/EXEC block.
       */
  @JSName("watch")
  def watch_OK(args: (java.lang.String | Callback[redisLib.redisLibStrings.OK])*): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(args: (java.lang.String | scala.Double | Callback[scala.Double])*): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: java.lang.String | scala.Double): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: java.lang.String | scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: java.lang.String, arg2: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: js.Array[java.lang.String | scala.Double], cb: Callback[scala.Double]): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: scala.Double, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: scala.Double, arg2: scala.Double): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(
    key: java.lang.String,
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, arg1: scala.Double, arg2: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Add one or more members to a sorted set, or update its score if it already exists.
       */
  def zadd(key: java.lang.String, args: (java.lang.String | scala.Double | Callback[scala.Double])*): R = js.native
  /**
       * Get the number of members in a sorted set.
       */
  def zcard(key: java.lang.String): R = js.native
  /**
       * Get the number of members in a sorted set.
       */
  def zcard(key: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Count the members in a sorted set with scores between the given values.
       */
  def zcount(key: java.lang.String, min: java.lang.String, max: java.lang.String): R = js.native
  /**
       * Count the members in a sorted set with scores between the given values.
       */
  def zcount(key: java.lang.String, min: java.lang.String, max: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Count the members in a sorted set with scores between the given values.
       */
  def zcount(key: java.lang.String, min: java.lang.String, max: scala.Double): R = js.native
  /**
       * Count the members in a sorted set with scores between the given values.
       */
  def zcount(key: java.lang.String, min: java.lang.String, max: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Count the members in a sorted set with scores between the given values.
       */
  def zcount(key: java.lang.String, min: scala.Double, max: java.lang.String): R = js.native
  /**
       * Count the members in a sorted set with scores between the given values.
       */
  def zcount(key: java.lang.String, min: scala.Double, max: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Count the members in a sorted set with scores between the given values.
       */
  def zcount(key: java.lang.String, min: scala.Double, max: scala.Double): R = js.native
  /**
       * Count the members in a sorted set with scores between the given values.
       */
  def zcount(key: java.lang.String, min: scala.Double, max: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Increment the score of a member in a sorted set.
       */
  def zincrby(key: java.lang.String, increment: scala.Double, member: java.lang.String): R = js.native
  /**
       * Increment the score of a member in a sorted set.
       */
  def zincrby(
    key: java.lang.String,
    increment: scala.Double,
    member: java.lang.String,
    cb: Callback[java.lang.String]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String | scala.Double): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String | scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String, arg2: java.lang.String | scala.Double): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String, arg2: java.lang.String | scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, arg4: java.lang.String): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, arg4: scala.Double): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: java.lang.String,
    arg2: js.Array[java.lang.String | scala.Double],
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, arg4: scala.Double): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, arg4: java.lang.String): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: js.Array[java.lang.String | scala.Double], cb: Callback[scala.Double]): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: java.lang.String | scala.Double): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: java.lang.String | scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, arg4: java.lang.String): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, arg4: scala.Double): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: js.Array[java.lang.String | scala.Double], cb: Callback[scala.Double]): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, arg4: scala.Double): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: java.lang.String): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Intersect multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zinterstore(args: (java.lang.String | scala.Double | Callback[scala.Double])*): R = js.native
  /**
       * Count the number of members in a sorted set between a given lexicographic range.
       */
  def zlexcount(key: java.lang.String, min: java.lang.String, max: java.lang.String): R = js.native
  /**
       * Count the number of members in a sorted set between a given lexicographic range.
       */
  def zlexcount(key: java.lang.String, min: java.lang.String, max: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Return a range of members in a sorted set, by index.
       */
  def zrange(key: java.lang.String, start: scala.Double, stop: scala.Double): R = js.native
  /**
       * Return a range of members in a sorted set, by index.
       */
  def zrange(
    key: java.lang.String,
    start: scala.Double,
    stop: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrange(key: java.lang.String, start: scala.Double, stop: scala.Double, withscores: java.lang.String): R = js.native
  def zrange(
    key: java.lang.String,
    start: scala.Double,
    stop: scala.Double,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Return a range of members in a sorted set, by lexicographical range.
       */
  def zrangebylex(key: java.lang.String, min: java.lang.String, max: java.lang.String): R = js.native
  /**
       * Return a range of members in a sorted set, by lexicographical range.
       */
  def zrangebylex(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrangebylex(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def zrangebylex(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Return a range of members in a sorted set, by score.
       */
  def zrangebyscore(key: java.lang.String, min: java.lang.String, max: java.lang.String): R = js.native
  /**
       * Return a range of members in a sorted set, by score.
       */
  def zrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrangebyscore(key: java.lang.String, min: java.lang.String, max: java.lang.String, withscores: java.lang.String): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Return a range of members in a sorted set, by score.
       */
  def zrangebyscore(key: java.lang.String, min: java.lang.String, max: scala.Double): R = js.native
  /**
       * Return a range of members in a sorted set, by score.
       */
  def zrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrangebyscore(key: java.lang.String, min: java.lang.String, max: scala.Double, withscores: java.lang.String): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Return a range of members in a sorted set, by score.
       */
  def zrangebyscore(key: java.lang.String, min: scala.Double, max: java.lang.String): R = js.native
  /**
       * Return a range of members in a sorted set, by score.
       */
  def zrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrangebyscore(key: java.lang.String, min: scala.Double, max: java.lang.String, withscores: java.lang.String): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Return a range of members in a sorted set, by score.
       */
  def zrangebyscore(key: java.lang.String, min: scala.Double, max: scala.Double): R = js.native
  /**
       * Return a range of members in a sorted set, by score.
       */
  def zrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrangebyscore(key: java.lang.String, min: scala.Double, max: scala.Double, withscores: java.lang.String): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def zrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Determine the index of a member in a sorted set.
       */
  def zrank(key: java.lang.String, member: java.lang.String): R = js.native
  /**
       * Determine the index of a member in a sorted set.
       */
  def zrank(key: java.lang.String, member: java.lang.String, cb: Callback[js.UndefOr[scala.Double]]): R = js.native
  /**
       * Remove one or more members from a sorted set.
       */
  def zrem(args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Remove one or more members from a sorted set.
       */
  def zrem(key: java.lang.String, arg1: java.lang.String): R = js.native
  /**
       * Remove one or more members from a sorted set.
       */
  def zrem(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Remove one or more members from a sorted set.
       */
  def zrem(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Remove one or more members from a sorted set.
       */
  def zrem(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Remove one or more members from a sorted set.
       */
  def zrem(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Remove one or more members from a sorted set.
       */
  def zrem(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Remove one or more members from a sorted set.
       */
  def zrem(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Remove one or more members from a sorted set.
       */
  def zrem(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Remove one or more members from a sorted set.
       */
  def zrem(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Remove one or more members from a sorted set.
       */
  def zrem(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Remove one or more members from a sorted set.
       */
  def zrem(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Remove one or more members from a sorted set.
       */
  def zrem(key: java.lang.String, arg1: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Remove one or more members from a sorted set.
       */
  def zrem(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Remove one or more members from a sorted set.
       */
  def zrem(key: java.lang.String, arg1: js.Array[java.lang.String], cb: Callback[scala.Double]): R = js.native
  /**
       * Remove one or more members from a sorted set.
       */
  def zrem(key: java.lang.String, args: (java.lang.String | Callback[scala.Double])*): R = js.native
  /**
       * Remove all members in a sorted set between the given lexicographical range.
       */
  def zremrangebylex(key: java.lang.String, min: java.lang.String, max: java.lang.String): R = js.native
  /**
       * Remove all members in a sorted set between the given lexicographical range.
       */
  def zremrangebylex(key: java.lang.String, min: java.lang.String, max: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Remove all members in a sorted set within the given indexes.
       */
  def zremrangebyrank(key: java.lang.String, start: scala.Double, stop: scala.Double): R = js.native
  /**
       * Remove all members in a sorted set within the given indexes.
       */
  def zremrangebyrank(key: java.lang.String, start: scala.Double, stop: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Remove all members in a sorted set within the given indexes.
       */
  def zremrangebyscore(key: java.lang.String, min: java.lang.String, max: java.lang.String): R = js.native
  /**
       * Remove all members in a sorted set within the given indexes.
       */
  def zremrangebyscore(key: java.lang.String, min: java.lang.String, max: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Remove all members in a sorted set within the given indexes.
       */
  def zremrangebyscore(key: java.lang.String, min: java.lang.String, max: scala.Double): R = js.native
  /**
       * Remove all members in a sorted set within the given indexes.
       */
  def zremrangebyscore(key: java.lang.String, min: java.lang.String, max: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Remove all members in a sorted set within the given indexes.
       */
  def zremrangebyscore(key: java.lang.String, min: scala.Double, max: java.lang.String): R = js.native
  /**
       * Remove all members in a sorted set within the given indexes.
       */
  def zremrangebyscore(key: java.lang.String, min: scala.Double, max: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Remove all members in a sorted set within the given indexes.
       */
  def zremrangebyscore(key: java.lang.String, min: scala.Double, max: scala.Double): R = js.native
  /**
       * Remove all members in a sorted set within the given indexes.
       */
  def zremrangebyscore(key: java.lang.String, min: scala.Double, max: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Return a range of members in a sorted set, by index, with scores ordered from high to low.
       */
  def zrevrange(key: java.lang.String, start: scala.Double, stop: scala.Double): R = js.native
  /**
       * Return a range of members in a sorted set, by index, with scores ordered from high to low.
       */
  def zrevrange(
    key: java.lang.String,
    start: scala.Double,
    stop: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrevrange(key: java.lang.String, start: scala.Double, stop: scala.Double, withscores: java.lang.String): R = js.native
  def zrevrange(
    key: java.lang.String,
    start: scala.Double,
    stop: scala.Double,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Return a range of members in a sorted set, by lexicographical range, ordered from higher to lower strings.
       */
  def zrevrangebylex(key: java.lang.String, min: java.lang.String, max: java.lang.String): R = js.native
  /**
       * Return a range of members in a sorted set, by lexicographical range, ordered from higher to lower strings.
       */
  def zrevrangebylex(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrevrangebylex(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def zrevrangebylex(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Return a range of members in a sorted set, by score, with scores ordered from high to low.
       */
  def zrevrangebyscore(key: java.lang.String, min: java.lang.String, max: java.lang.String): R = js.native
  /**
       * Return a range of members in a sorted set, by score, with scores ordered from high to low.
       */
  def zrevrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrevrangebyscore(key: java.lang.String, min: java.lang.String, max: java.lang.String, withscores: java.lang.String): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: java.lang.String,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Return a range of members in a sorted set, by score, with scores ordered from high to low.
       */
  def zrevrangebyscore(key: java.lang.String, min: java.lang.String, max: scala.Double): R = js.native
  /**
       * Return a range of members in a sorted set, by score, with scores ordered from high to low.
       */
  def zrevrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrevrangebyscore(key: java.lang.String, min: java.lang.String, max: scala.Double, withscores: java.lang.String): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: java.lang.String,
    max: scala.Double,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Return a range of members in a sorted set, by score, with scores ordered from high to low.
       */
  def zrevrangebyscore(key: java.lang.String, min: scala.Double, max: java.lang.String): R = js.native
  /**
       * Return a range of members in a sorted set, by score, with scores ordered from high to low.
       */
  def zrevrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrevrangebyscore(key: java.lang.String, min: scala.Double, max: java.lang.String, withscores: java.lang.String): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: java.lang.String,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Return a range of members in a sorted set, by score, with scores ordered from high to low.
       */
  def zrevrangebyscore(key: java.lang.String, min: scala.Double, max: scala.Double): R = js.native
  /**
       * Return a range of members in a sorted set, by score, with scores ordered from high to low.
       */
  def zrevrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrevrangebyscore(key: java.lang.String, min: scala.Double, max: scala.Double, withscores: java.lang.String): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    withscores: java.lang.String,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double
  ): R = js.native
  def zrevrangebyscore(
    key: java.lang.String,
    min: scala.Double,
    max: scala.Double,
    withscores: java.lang.String,
    limit: java.lang.String,
    offset: scala.Double,
    count: scala.Double,
    cb: Callback[js.Array[java.lang.String]]
  ): R = js.native
  /**
       * Determine the index of a member in a sorted set, with scores ordered from high to low.
       */
  def zrevrank(key: java.lang.String, member: java.lang.String): R = js.native
  /**
       * Determine the index of a member in a sorted set, with scores ordered from high to low.
       */
  def zrevrank(key: java.lang.String, member: java.lang.String, cb: Callback[js.UndefOr[scala.Double]]): R = js.native
  /**
       * Incrementally iterate sorted sets elements and associated scores.
       */
  def zscan(args: (java.lang.String | (Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]))*): R = js.native
  /**
       * Incrementally iterate sorted sets elements and associated scores.
       */
  def zscan(key: java.lang.String, arg1: java.lang.String): R = js.native
  /**
       * Incrementally iterate sorted sets elements and associated scores.
       */
  def zscan(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String): R = js.native
  /**
       * Incrementally iterate sorted sets elements and associated scores.
       */
  def zscan(key: java.lang.String, arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Incrementally iterate sorted sets elements and associated scores.
       */
  def zscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String
  ): R = js.native
  /**
       * Incrementally iterate sorted sets elements and associated scores.
       */
  def zscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String
  ): R = js.native
  /**
       * Incrementally iterate sorted sets elements and associated scores.
       */
  def zscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String
  ): R = js.native
  /**
       * Incrementally iterate sorted sets elements and associated scores.
       */
  def zscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    arg6: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate sorted sets elements and associated scores.
       */
  def zscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    arg5: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate sorted sets elements and associated scores.
       */
  def zscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate sorted sets elements and associated scores.
       */
  def zscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate sorted sets elements and associated scores.
       */
  def zscan(
    key: java.lang.String,
    arg1: java.lang.String,
    arg2: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate sorted sets elements and associated scores.
       */
  def zscan(
    key: java.lang.String,
    arg1: java.lang.String,
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate sorted sets elements and associated scores.
       */
  def zscan(key: java.lang.String, arg1: js.Array[java.lang.String]): R = js.native
  /**
       * Incrementally iterate sorted sets elements and associated scores.
       */
  def zscan(
    key: java.lang.String,
    arg1: js.Array[java.lang.String],
    cb: Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]
  ): R = js.native
  /**
       * Incrementally iterate sorted sets elements and associated scores.
       */
  def zscan(
    key: java.lang.String,
    args: (java.lang.String | (Callback[js.Tuple2[java.lang.String, js.Array[java.lang.String]]]))*
  ): R = js.native
  /**
       * Get the score associated with the given member in a sorted set.
       */
  def zscore(key: java.lang.String, member: java.lang.String): R = js.native
  /**
       * Get the score associated with the given member in a sorted set.
       */
  def zscore(key: java.lang.String, member: java.lang.String, cb: Callback[java.lang.String]): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String | scala.Double): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    arg6: java.lang.String | scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: java.lang.String | scala.Double,
    arg2: java.lang.String | scala.Double,
    arg3: java.lang.String | scala.Double,
    arg4: java.lang.String | scala.Double,
    arg5: java.lang.String | scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String | scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String, arg2: java.lang.String | scala.Double): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String, arg2: java.lang.String | scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, arg4: java.lang.String): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, arg4: scala.Double): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: java.lang.String,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String, arg2: java.lang.String, arg3: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: java.lang.String,
    arg2: js.Array[java.lang.String | scala.Double],
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, arg4: scala.Double): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String, arg2: scala.Double, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, arg4: java.lang.String): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: java.lang.String,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: java.lang.String, arg2: scala.Double, arg3: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: js.Array[java.lang.String | scala.Double], cb: Callback[scala.Double]): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: java.lang.String | scala.Double): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: java.lang.String | scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, arg4: scala.Double): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: java.lang.String, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, arg4: java.lang.String): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, arg4: scala.Double): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: scala.Double,
    arg2: java.lang.String,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: java.lang.String, arg3: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: js.Array[java.lang.String | scala.Double]): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: js.Array[java.lang.String | scala.Double], cb: Callback[scala.Double]): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, arg4: java.lang.String): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, arg4: scala.Double): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: java.lang.String,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: scala.Double, arg3: java.lang.String, cb: Callback[scala.Double]): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: java.lang.String): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: java.lang.String,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, arg4: scala.Double): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(
    arg1: scala.Double,
    arg2: scala.Double,
    arg3: scala.Double,
    arg4: scala.Double,
    cb: Callback[scala.Double]
  ): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(arg1: scala.Double, arg2: scala.Double, arg3: scala.Double, cb: Callback[scala.Double]): R = js.native
  /**
       * Add multiple sorted sets and store the resulting sorted set in a new key.
       */
  def zunionstore(args: (java.lang.String | scala.Double | Callback[scala.Double])*): R = js.native
}

