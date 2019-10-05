package typings.screeps

import org.scalablytyped.runtime.TopLevel
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
  def getLocal(): String
  /**
    * Returns the string contents of another shard's data, null if shard exists but data is not set.
    *
    * @param shard Shard name.
    * @throws Error if shard name is invalid
    */
  def getRemote(shard: String): String | Null
  /**
    * Replace the current shard's data with the new value
    * @param value New data value in string format.
    */
  def setLocal(value: String): Unit
}

@JSGlobal("InterShardMemory")
@js.native
object InterShardMemory extends TopLevel[InterShardMemory]

