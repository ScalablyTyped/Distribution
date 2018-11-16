package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebKitCSSMatrix")
@js.native
object WebKitCSSMatrix
  extends ScalablyTyped.runtime.Instantiable1[(/* init */ java.lang.String) | (/* init */ js.Array[scala.Double]), DOMMatrix]
     with ScalablyTyped.runtime.Instantiable0[DOMMatrix] {
  def fromFloat32Array(array32: stdLib.Float32Array): stdLib.DOMMatrix = js.native
  def fromFloat64Array(array64: stdLib.Float64Array): stdLib.DOMMatrix = js.native
  def fromMatrix(): stdLib.DOMMatrix = js.native
  def fromMatrix(other: stdLib.DOMMatrixInit): stdLib.DOMMatrix = js.native
}

