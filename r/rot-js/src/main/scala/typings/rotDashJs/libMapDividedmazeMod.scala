package typings.rotDashJs

import typings.rotDashJs.libMapDividedmazeMod.DividedMaze
import typings.rotDashJs.libMapDividedmazeMod.Room
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/map/dividedmaze", JSImport.Namespace)
@js.native
object libMapDividedmazeMod extends js.Object {
  @js.native
  trait DividedMaze
    extends typings.rotDashJs.libMapMapMod.default {
    var _map: js.Array[js.Array[Double]] = js.native
    var _stack: js.Array[Room] = js.native
    def _partitionRoom(room: Room): Unit = js.native
    def _process(): Unit = js.native
  }
  
  @js.native
  class default () extends DividedMaze
  
  type Room = js.Tuple4[Double, Double, Double, Double]
}

