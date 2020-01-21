package typings.screeps

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomConstructor
  extends Constructor[Room]
     with Instantiable1[/* id */ String, Room] {
  var Terrain: RoomTerrainConstructor = js.native
  /**
    * Deserialize a short string path representation into an array form.
    * @param path A serialized path string.
    * @returns A path array.
    */
  def deserializePath(path: String): js.Array[PathStep] = js.native
  /**
    * Serialize a path array into a short string representation, which is suitable to store in memory.
    * @param path A path array retrieved from `Room.findPath`.
    * @returns A serialized string form of the given path.
    */
  def serializePath(path: js.Array[PathStep]): String = js.native
}

