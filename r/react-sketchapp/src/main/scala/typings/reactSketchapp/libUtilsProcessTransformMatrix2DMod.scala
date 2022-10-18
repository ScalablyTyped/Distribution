package typings.reactSketchapp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsProcessTransformMatrix2DMod {
  
  @JSImport("react-sketchapp/lib/utils/processTransform/matrix2D", "Matrix2D")
  @js.native
  open class Matrix2D protected () extends StObject {
    def this(
      a: js.UndefOr[Double],
      b: js.UndefOr[Double],
      c: js.UndefOr[Double],
      d: js.UndefOr[Double],
      tx: js.UndefOr[Double],
      ty: js.UndefOr[Double]
    ) = this()
    
    var a: Double = js.native
    
    /**
      * Appends the specified matrix properties to this matrix. All parameters are required.
      * This is the equivalent of multiplying `(this matrix) * (specified matrix)`.
      * */
    def append(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): this.type = js.native
    
    var b: Double = js.native
    
    var c: Double = js.native
    
    /**
      * Copies all properties from the specified matrix to this matrix.
      */
    def copy(matrix: Matrix2D): this.type = js.native
    
    var d: Double = js.native
    
    /**
      * Prepends the specified matrix properties to this matrix.
      * This is the equivalent of multiplying `(specified matrix) * (this matrix)`.
      * All parameters are required.
      * */
    def prepend(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): this.type = js.native
    
    /**
      * Reset current matrix to an identity matrix.
      * */
    def reset(): this.type = js.native
    
    /**
      * Set current matrix to new absolute matrix.
      */
    def setTransform(
      a: js.UndefOr[Double],
      b: js.UndefOr[Double],
      c: js.UndefOr[Double],
      d: js.UndefOr[Double],
      tx: js.UndefOr[Double],
      ty: js.UndefOr[Double]
    ): this.type = js.native
    
    /**
      * Returns an array with current matrix values.
      * */
    def toArray(): js.Array[Double] = js.native
    
    var tx: Double = js.native
    
    var ty: Double = js.native
  }
}
