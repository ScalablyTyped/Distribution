package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `InterShardMemory` object provides an interface for communicating between shards.
  * Your script is executed separatedly on each shard, and their `Memory` objects are isolated from each other.
  * In order to pass messages and data between shards, you need to use `InterShardMemory` instead.
  *
  * Every shard can have its own data string that can be accessed by all other shards.
  * A shard can write only to its own data, other shards' data is read-only.
  *
  * This data has nothing to do with `Memory` contents, it's a separate data container.
  */
trait InterShardMemory extends js.Object {
  /**
    * Returns the string contents of the current shard's data.
    */
  def getLocal(): java.lang.String
  /**
    * Returns the string contents of another shard's data, null if shard exists but data is not set.
    *
    * @param shard Shard name.
    * @throws Error if shard name is invalid
    */
  def getRemote(shard: java.lang.String): java.lang.String | scala.Null
  /**
    * Replace the current shard's data with the new value
    * @param value New data value in string format.
    */
  def setLocal(value: java.lang.String): scala.Unit
}

object InterShardMemory {
  @scala.inline
  def apply(
    getLocal: () => java.lang.String,
    getRemote: java.lang.String => java.lang.String | scala.Null,
    setLocal: java.lang.String => scala.Unit
  ): InterShardMemory = {
    val __obj = js.Dynamic.literal(getLocal = js.Any.fromFunction0(getLocal), getRemote = js.Any.fromFunction1(getRemote), setLocal = js.Any.fromFunction1(setLocal))
  
    __obj.asInstanceOf[InterShardMemory]
  }
}

