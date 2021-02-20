package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Affine {
  
  @JSImport("seen", "Affine")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("seen", "Affine.INITIAL_STATE_MATRIX")
  @js.native
  def INITIAL_STATE_MATRIX: js.Array[js.Array[Double]] = js.native
  @scala.inline
  def INITIAL_STATE_MATRIX_=(x: js.Array[js.Array[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INITIAL_STATE_MATRIX")(x.asInstanceOf[js.Any])
  
  @JSImport("seen", "Affine.ORTHONORMAL_BASIS")
  @js.native
  def ORTHONORMAL_BASIS(): js.Array[Point] = js.native
  
  @JSImport("seen", "Affine.solveForAffineTransform")
  @js.native
  def solveForAffineTransform(points: js.Array[Point]): js.Array[Double] = js.native
}
