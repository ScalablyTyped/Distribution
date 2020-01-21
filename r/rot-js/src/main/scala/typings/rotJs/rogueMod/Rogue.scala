package typings.rotJs.rogueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rogue
  extends typings.rotJs.mapMapMod.default {
  var _options: js.Any = js.native
  var connectedCells: js.Any = js.native
  var map: js.Any = js.native
  var rooms: js.Any = js.native
  def _calculateRoomSize(size: Double, cell: Double): js.Tuple2[Double, Double] = js.native
  def _connectRooms(): Unit = js.native
  def _connectUnconnectedRooms(): Unit = js.native
  def _createCorridors(): Unit = js.native
  def _createRandomRoomConnections(): Unit = js.native
  def _createRooms(): Unit = js.native
  def _drawCorridor(startPosition: Point, endPosition: Point): Unit = js.native
  def _getWallPosition(aRoom: Room, aDirection: Double): Point = js.native
  def _initRooms(): Unit = js.native
}

