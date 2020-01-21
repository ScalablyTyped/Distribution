package typings.seen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Affine")
@js.native
object Affine extends js.Object {
  var INITIAL_STATE_MATRIX: js.Array[js.Array[Double]] = js.native
  def ORTHONORMAL_BASIS(): js.Array[Point] = js.native
  def solveForAffineTransform(points: js.Array[Point]): js.Array[Double] = js.native
}

