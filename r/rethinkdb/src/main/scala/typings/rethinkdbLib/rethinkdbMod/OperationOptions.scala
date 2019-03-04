package typings
package rethinkdbLib.rethinkdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationOptions extends js.Object {
  /**
    * The maximum numbers of array elements that can be returned by a query (default: 100,000). This affects all ReQL commands that return arrays. Note that it has no effect on the size of arrays being written to the database; those always have an upper limit of 100,000 elements.
    */
  var arrayLimit: scala.Double
  /**
    * What format to return binary data in (default: 'native'). Set this to 'raw' if you want the raw pseudotype.
    */
  var binaryFormat: rethinkdbLib.rethinkdbLibStrings.native | rethinkdbLib.rethinkdbLibStrings.raw
  /**
    * The database to run this query against as a string. The default is the database specified in the db parameter to connect (which defaults to test). The database may also be specified with the db command.
    */
  var db: java.lang.String
  /**
    * Possible values are 'hard' and 'soft'. In soft durability mode RethinkDB will acknowledge the write immediately after receiving it, but before the write has been committed to disk.
    */
  var durability: rethinkdbLib.rethinkdbLibStrings.hard | rethinkdbLib.rethinkdbLibStrings.soft
  /**
    * Factor to scale the other parameters down by on the first batch (default: 4). For example, with this set to 8 and maxBatchRows set to 80, on the first batch maxBatchRows will be adjusted to 10 (80 / 8). This allows the first batch to return faster.
    */
  var firstBatchScaledownFactor: scala.Double
  /**
    * What format to return `grouped_data` and `grouped_streams` in (default: 'native'). Set this to 'raw' if you want the raw pseudotype.
    */
  var groupFormat: rethinkdbLib.rethinkdbLibStrings.native | rethinkdbLib.rethinkdbLibStrings.raw
  /**
    * Maximum number of bytes to wait for before batching a result set (default: 1MB). This is an integer.
    */
  var maxBatchBytes: scala.Double
  /**
    * Maximum number of rows to wait for before batching a result set (default: unlimited). This is an integer.
    */
  var maxBatchRows: scala.Double
  /**
    * Maximum number of seconds to wait before batching a result set (default: 0.5). This is a float (not an integer) and may be specified to the microsecond.
    */
  var maxBatchSeconds: scala.Double
  /**
    * Minimum number of rows to wait for before batching a result set (default: 8). This is an integer.
    */
  var minBatchRows: scala.Double
  /**
    * Set to `true` to not receive the result object or cursor and return immediately.
    */
  var noreply: scala.Boolean
  /**
    * Whether or not to return a profile of the query’s execution (default: false).
    */
  var profile: scala.Boolean
  /**
    * One of three possible values affecting the consistency guarantee for the query (default: 'single').
    *
    *   * 'single' (the default) returns values that are in memory (but not necessarily written to disk) on the primary replica.
    *   * 'majority' will only return values that are safely committed on disk on a majority of replicas. This requires sending a message to every replica on each read, so it is the slowest but most consistent.
    *   * 'outdated' will return values that are in memory on an arbitrarily-selected replica. This is the fastest but least consistent.
    */
  var readMode: rethinkdbLib.rethinkdbLibStrings.single | rethinkdbLib.rethinkdbLibStrings.majority | rethinkdbLib.rethinkdbLibStrings.outdated
  /**
    * What format to return times in (default: 'native'). Set this to 'raw' if you want times returned as JSON objects for exporting.
    */
  var timeFormat: rethinkdbLib.rethinkdbLibStrings.native | rethinkdbLib.rethinkdbLibStrings.raw
}

object OperationOptions {
  @scala.inline
  def apply(
    arrayLimit: scala.Double,
    binaryFormat: rethinkdbLib.rethinkdbLibStrings.native | rethinkdbLib.rethinkdbLibStrings.raw,
    db: java.lang.String,
    durability: rethinkdbLib.rethinkdbLibStrings.hard | rethinkdbLib.rethinkdbLibStrings.soft,
    firstBatchScaledownFactor: scala.Double,
    groupFormat: rethinkdbLib.rethinkdbLibStrings.native | rethinkdbLib.rethinkdbLibStrings.raw,
    maxBatchBytes: scala.Double,
    maxBatchRows: scala.Double,
    maxBatchSeconds: scala.Double,
    minBatchRows: scala.Double,
    noreply: scala.Boolean,
    profile: scala.Boolean,
    readMode: rethinkdbLib.rethinkdbLibStrings.single | rethinkdbLib.rethinkdbLibStrings.majority | rethinkdbLib.rethinkdbLibStrings.outdated,
    timeFormat: rethinkdbLib.rethinkdbLibStrings.native | rethinkdbLib.rethinkdbLibStrings.raw
  ): OperationOptions = {
    val __obj = js.Dynamic.literal(arrayLimit = arrayLimit, binaryFormat = binaryFormat.asInstanceOf[js.Any], db = db, durability = durability.asInstanceOf[js.Any], firstBatchScaledownFactor = firstBatchScaledownFactor, groupFormat = groupFormat.asInstanceOf[js.Any], maxBatchBytes = maxBatchBytes, maxBatchRows = maxBatchRows, maxBatchSeconds = maxBatchSeconds, minBatchRows = minBatchRows, noreply = noreply, profile = profile, readMode = readMode.asInstanceOf[js.Any], timeFormat = timeFormat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OperationOptions]
  }
}

