package typings.rotDashJs.libMapDiggerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Digger
  extends typings.rotDashJs.libMapDungeonMod.default {
  var _dug: Double = js.native
  var _featureAttempts: Double = js.native
  var _features: StringDictionary[Double] = js.native
  var _map: js.Array[js.Array[Double]] = js.native
  var _options: Options = js.native
  var _walls: StringDictionary[Double] = js.native
  /**
    * Find empty spaces surrounding rooms, and apply doors.
    */
  def _addDoors(): Unit = js.native
  def _canBeDugCallback(x: Double, y: Double): Boolean = js.native
  def _digCallback(x: Double, y: Double, value: Double): Unit = js.native
  /**
    * Get a suitable wall
    */
  def _findWall(): String | Null = js.native
  def _firstRoom(): Unit = js.native
  /**
    * Returns vector in "digging" direction, or false, if this does not exist (or is not unique)
    */
  def _getDiggingDirection(cx: Double, cy: Double): js.Array[Double] | Null = js.native
  def _isWallCallback(x: Double, y: Double): Boolean = js.native
  def _priorityWallCallback(x: Double, y: Double): Unit = js.native
  def _removeSurroundingWalls(cx: Double, cy: Double): Unit = js.native
  /**
    * Tries adding a feature
    * @returns {bool} was this a successful try?
    */
  def _tryFeature(x: Double, y: Double, dx: Double, dy: Double): Boolean = js.native
}

