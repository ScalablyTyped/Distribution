package typings.solverjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matrixMod {
  
  @JSImport("solverjs/matrix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def matAdd(mat1: js.Array[js.Array[Double]], mat2: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matAdd")(mat1.asInstanceOf[js.Any], mat2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  
  inline def matSpiralPrint(mat1: js.Array[js.Array[Double]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("matSpiralPrint")(mat1.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def matSub(mat1: js.Array[js.Array[Double]], mat2: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("matSub")(mat1.asInstanceOf[js.Any], mat2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  
  inline def matTrans(mat: js.Array[js.Array[Double]]): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("matTrans")(mat.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]
}
