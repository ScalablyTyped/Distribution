package typings.rotDashJs.libPathPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path extends js.Object {
  var _dirs: js.Array[js.Array[Double]] = js.native
  var _options: Options = js.native
  @JSName("_passableCallback")
  var _passableCallback_Original: PassableCallback = js.native
  var _toX: Double = js.native
  var _toY: Double = js.native
  def _getNeighbors(cx: Double, cy: Double): js.Array[js.Array[Double]] = js.native
  def _passableCallback(x: Double, y: Double): Boolean = js.native
  /**
    * Compute a path from a given point
    * @param {int} fromX
    * @param {int} fromY
    * @param {function} callback Will be called for every path item with arguments "x" and "y"
    */
  def compute(fromX: Double, fromY: Double, callback: ComputeCallback): Unit = js.native
}

