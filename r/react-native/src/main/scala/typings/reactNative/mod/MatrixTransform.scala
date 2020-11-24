package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MatrixTransform extends js.Object {
  
  var matrix: js.Array[Double] = js.native
}
object MatrixTransform {
  
  @scala.inline
  def apply(matrix: js.Array[Double]): MatrixTransform = {
    val __obj = js.Dynamic.literal(matrix = matrix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatrixTransform]
  }
  
  @scala.inline
  implicit class MatrixTransformOps[Self <: MatrixTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMatrixVarargs(value: Double*): Self = this.set("matrix", js.Array(value :_*))
    
    @scala.inline
    def setMatrix(value: js.Array[Double]): Self = this.set("matrix", value.asInstanceOf[js.Any])
  }
}
