package typings.seen.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Affine {
  
  @JSImport("seen", "Affine")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("seen", "Affine.INITIAL_STATE_MATRIX")
  @js.native
  def INITIAL_STATE_MATRIX: js.Array[js.Array[Double]] = js.native
  inline def INITIAL_STATE_MATRIX_=(x: js.Array[js.Array[Double]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INITIAL_STATE_MATRIX")(x.asInstanceOf[js.Any])
  
  inline def ORTHONORMAL_BASIS(): js.Array[Point] = ^.asInstanceOf[js.Dynamic].applyDynamic("ORTHONORMAL_BASIS")().asInstanceOf[js.Array[Point]]
  
  inline def solveForAffineTransform(points: js.Array[Point]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("solveForAffineTransform")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
