package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMPointReadOnly extends js.Object {
  val w: Double = js.native
  val x: Double = js.native
  val y: Double = js.native
  val z: Double = js.native
  def matrixTransform(): DOMPoint = js.native
  def matrixTransform(matrix: DOMMatrixInit): DOMPoint = js.native
  def toJSON(): js.Any = js.native
}

@JSGlobal("DOMPointReadOnly")
@js.native
object DOMPointReadOnly
  extends Instantiable0[DOMPointReadOnly]
     with Instantiable1[/* x */ Double, DOMPointReadOnly]
     with Instantiable2[/* x */ Double, /* y */ Double, DOMPointReadOnly]
     with Instantiable3[/* x */ Double, /* y */ Double, /* z */ Double, DOMPointReadOnly]
     with Instantiable4[/* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, DOMPointReadOnly] {
  def fromPoint(): DOMPointReadOnly = js.native
  def fromPoint(other: DOMPointInit): DOMPointReadOnly = js.native
}

