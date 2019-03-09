package typings
package seenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_INITIALSTATEMATRIX extends js.Object {
  var INITIAL_STATE_MATRIX: js.Array[js.Array[scala.Double]]
  def ORTHONORMAL_BASIS(): js.Array[seenLib.seenMod.Point]
  def solveForAffineTransform(points: js.Array[seenLib.seenMod.Point]): js.Array[scala.Double]
}

object Anon_INITIALSTATEMATRIX {
  @scala.inline
  def apply(
    INITIAL_STATE_MATRIX: js.Array[js.Array[scala.Double]],
    ORTHONORMAL_BASIS: js.Function0[js.Array[seenLib.seenMod.Point]],
    solveForAffineTransform: js.Function1[js.Array[seenLib.seenMod.Point], js.Array[scala.Double]]
  ): Anon_INITIALSTATEMATRIX = {
    val __obj = js.Dynamic.literal(INITIAL_STATE_MATRIX = INITIAL_STATE_MATRIX, ORTHONORMAL_BASIS = ORTHONORMAL_BASIS, solveForAffineTransform = solveForAffineTransform)
  
    __obj.asInstanceOf[Anon_INITIALSTATEMATRIX]
  }
}

