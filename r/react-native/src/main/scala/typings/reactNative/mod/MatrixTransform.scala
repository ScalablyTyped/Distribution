package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatrixTransform extends StObject {
  
  var matrix: js.Array[Double]
}
object MatrixTransform {
  
  @scala.inline
  def apply(matrix: js.Array[Double]): MatrixTransform = {
    val __obj = js.Dynamic.literal(matrix = matrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatrixTransform]
  }
  
  @scala.inline
  implicit class MatrixTransformMutableBuilder[Self <: MatrixTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatrix(value: js.Array[Double]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrixVarargs(value: Double*): Self = StObject.set(x, "matrix", js.Array(value :_*))
  }
}
