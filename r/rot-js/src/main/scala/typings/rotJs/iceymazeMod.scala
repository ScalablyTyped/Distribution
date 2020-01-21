package typings.rotJs

import typings.rotJs.rotJsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/map/iceymaze", JSImport.Namespace)
@js.native
object iceymazeMod extends js.Object {
  @js.native
  trait IceyMaze
    extends typings.rotJs.mapMapMod.default {
    var _map: js.Array[js.Array[Double]] = js.native
    var _regularity: Double = js.native
    def _isFree(map: js.Array[js.Array[Double]], x: Double, y: Double, width: Double, height: Double): Double | `false` = js.native
    def _randomize(dirs: js.Array[js.Array[Double]]): Unit = js.native
  }
  
  @js.native
  class default protected () extends IceyMaze {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, regularity: Double) = this()
  }
  
}

