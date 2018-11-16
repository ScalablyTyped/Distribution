package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoomConstructor
  extends _Constructor[Room]
     with ScalablyTyped.runtime.Instantiable1[/* id */ java.lang.String, Room] {
  var Terrain: RoomTerrainConstructor = js.native
  /**
       * Deserialize a short string path representation into an array form.
       * @param path A serialized path string.
       * @returns A path array.
       */
  def deserializePath(path: java.lang.String): js.Array[PathStep] = js.native
  /**
       * Serialize a path array into a short string representation, which is suitable to store in memory.
       * @param path A path array retrieved from `Room.findPath`.
       * @returns A serialized string form of the given path.
       */
  def serializePath(path: js.Array[PathStep]): java.lang.String = js.native
}

