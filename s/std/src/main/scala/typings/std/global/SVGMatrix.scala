package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.DOMMatrixInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SVGMatrix")
@js.native
class SVGMatrix ()
  extends typings.std.DOMMatrix {
  def this(init: java.lang.String) = this()
  def this(init: js.Array[Double]) = this()
}

@JSGlobal("SVGMatrix")
@js.native
object SVGMatrix
  extends Instantiable0[typings.std.DOMMatrix]
     with Instantiable1[
      (/* init */ js.Array[Double]) | (/* init */ java.lang.String), 
      typings.std.DOMMatrix
    ] {
  def fromFloat32Array(array32: typings.std.Float32Array): typings.std.DOMMatrix = js.native
  def fromFloat64Array(array64: typings.std.Float64Array): typings.std.DOMMatrix = js.native
  def fromMatrix(): typings.std.DOMMatrix = js.native
  def fromMatrix(other: DOMMatrixInit): typings.std.DOMMatrix = js.native
}

