package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SVGMatrix")
@js.native
object SVGMatrix
  extends Instantiable0[DOMMatrix]
     with Instantiable1[(/* init */ js.Array[Double]) | (/* init */ java.lang.String), DOMMatrix] {
  def fromFloat32Array(array32: Float32Array): DOMMatrix = js.native
  def fromFloat64Array(array64: Float64Array): DOMMatrix = js.native
  def fromMatrix(): DOMMatrix = js.native
  def fromMatrix(other: DOMMatrixInit): DOMMatrix = js.native
}

