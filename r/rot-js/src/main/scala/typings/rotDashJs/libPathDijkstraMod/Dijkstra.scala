package typings.rotDashJs.libPathDijkstraMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dijkstra
  extends typings.rotDashJs.libPathPathMod.default {
  var _computed: StringDictionary[Item] = js.native
  var _todo: js.Array[Item] = js.native
  def _add(x: Double, y: Double): Unit = js.native
  def _add(x: Double, y: Double, prev: Item): Unit = js.native
  /**
    * Compute a non-cached value
    */
  def _compute(fromX: Double, fromY: Double): Unit = js.native
}

