package typings.screeps

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RawMemory object allows to implement your own memory stringifier instead of built-in serializer based on JSON.stringify.
  */
@js.native
trait RawMemory extends js.Object {
  /**
    * An object with a memory segment of another player available on this tick. Use `setActiveForeignSegment` to fetch segments on the next tick.
    */
  var foreignSegment: Anon_Data = js.native
  /**
    *  @deprecated Use `InterShardMemory` instead.
    *
    *  A string with a shared memory segment available on every world shard. Maximum string length is 100 KB.
    *
    * **Warning:** this segment is not safe for concurrent usage! All shards have shared access to the same instance of
    * data. When the segment contents is changed by two shards simultaneously, you may lose some data, since the segment
    * string value is written all at once atomically. You must implement your own system to determine when each shard is
    * allowed to rewrite the inter-shard memory, e.g. based on mutual exclusions.
    *
    */
  var interShardSegment: String = js.native
  /**
    * An object with asynchronous memory segments available on this tick. Each object key is the segment ID with data in string values.
    * Use RawMemory.setActiveSegments to fetch segments on the next tick. Segments data is saved automatically in the end of the tick.
    */
  var segments: NumberDictionary[String] = js.native
  /**
    * Get a raw string representation of the Memory object.
    */
  def get(): String = js.native
  /**
    * Set new memory value.
    * @param value New memory value as a string.
    */
  def set(value: String): js.UndefOr[scala.Nothing] = js.native
  def setActiveForeignSegment(): js.UndefOr[scala.Nothing] = js.native
  /**
    * Request a memory segment of another user.
    *
    * The segment should be marked by its owner as public using `setPublicSegments`.
    *
    * The segment data will become available on the next tick in `foreignSegment` object.
    *
    * You can only have access to one foreign segment at the same time.
    *
    * @param username The name of another user. Pass `null` to clear the foreign segment.
    * @param id The ID of the requested segment from 0 to 99. If undefined, the user's default public segment is requested as set by `setDefaultPublicSegment`.
    */
  def setActiveForeignSegment(username: String): js.UndefOr[scala.Nothing] = js.native
  def setActiveForeignSegment(username: String, id: Double): js.UndefOr[scala.Nothing] = js.native
  def setActiveForeignSegment(username: Null, id: Double): js.UndefOr[scala.Nothing] = js.native
  /**
    * Request memory segments using the list of their IDs. Memory segments will become available on the next tick in RawMemory.segments object.
    * @param ids An array of segment IDs. Each ID should be a number from 0 to 99. Maximum 10 segments can be active at the same time. Subsequent calls of setActiveSegments override previous ones.
    */
  def setActiveSegments(ids: js.Array[Double]): js.UndefOr[scala.Nothing] = js.native
  def setDefaultPublicSegment(): js.UndefOr[scala.Nothing] = js.native
  /**
    * Set the specified segment as your default public segment. It will be returned if no id parameter is passed to `setActiveForeignSegment` by another user.
    *
    * @param id The ID of the requested segment from 0 to 99. Pass `null` to clear the foreign segment.
    */
  def setDefaultPublicSegment(id: Double): js.UndefOr[scala.Nothing] = js.native
  /**
    * Set specified segments as public. Other users will be able to request access to them using `setActiveForeignSegment`.
    *
    * @param ids An array of segment IDs. Each ID should be a number from 0 to 99. Subsequent calls of `setPublicSegments` override previous ones.
    */
  def setPublicSegments(ids: js.Array[Double]): js.UndefOr[scala.Nothing] = js.native
}

