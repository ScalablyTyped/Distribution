package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Affine")
@js.native
object Affine extends js.Object {
  var INITIAL_STATE_MATRIX: js.Array[js.Array[scala.Double]] = js.native
  def ORTHONORMAL_BASIS(): js.Array[seenLib.seenMod.Point] = js.native
  def solveForAffineTransform(points: js.Array[seenLib.seenMod.Point]): js.Array[scala.Double] = js.native
}

