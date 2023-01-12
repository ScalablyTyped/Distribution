package typings.reactNativeWindows.rntypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatrixTransform extends StObject {
  
  var matrix: js.Array[Double]
}
object MatrixTransform {
  
  inline def apply(matrix: js.Array[Double]): MatrixTransform = {
    val __obj = js.Dynamic.literal(matrix = matrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatrixTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatrixTransform] (val x: Self) extends AnyVal {
    
    inline def setMatrix(value: js.Array[Double]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixVarargs(value: Double*): Self = StObject.set(x, "matrix", js.Array(value*))
  }
}
