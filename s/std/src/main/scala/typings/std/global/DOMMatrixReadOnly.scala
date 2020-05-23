package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.DOMMatrixInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DOMMatrixReadOnly")
@js.native
class DOMMatrixReadOnly ()
  extends typings.std.DOMMatrixReadOnly {
  def this(init: java.lang.String) = this()
  def this(init: js.Array[Double]) = this()
}

@JSGlobal("DOMMatrixReadOnly")
@js.native
object DOMMatrixReadOnly
  extends Instantiable0[typings.std.DOMMatrixReadOnly]
     with Instantiable1[
      (/* init */ js.Array[Double]) | (/* init */ java.lang.String), 
      typings.std.DOMMatrixReadOnly
    ] {
  def fromFloat32Array(array32: typings.std.Float32Array): typings.std.DOMMatrixReadOnly = js.native
  def fromFloat64Array(array64: typings.std.Float64Array): typings.std.DOMMatrixReadOnly = js.native
  def fromMatrix(): typings.std.DOMMatrixReadOnly = js.native
  def fromMatrix(other: DOMMatrixInit): typings.std.DOMMatrixReadOnly = js.native
}

