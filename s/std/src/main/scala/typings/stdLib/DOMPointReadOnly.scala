package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMPointReadOnly extends js.Object {
  val w: scala.Double = js.native
  val x: scala.Double = js.native
  val y: scala.Double = js.native
  val z: scala.Double = js.native
  def matrixTransform(): DOMPoint = js.native
  def matrixTransform(matrix: DOMMatrixInit): DOMPoint = js.native
  def toJSON(): js.Any = js.native
}

@JSGlobal("DOMPointReadOnly")
@js.native
object DOMPointReadOnly
  extends org.scalablytyped.runtime.Instantiable0[DOMPointReadOnly]
     with org.scalablytyped.runtime.Instantiable1[/* x */ scala.Double, DOMPointReadOnly]
     with org.scalablytyped.runtime.Instantiable2[/* x */ scala.Double, /* y */ scala.Double, DOMPointReadOnly]
     with org.scalablytyped.runtime.Instantiable3[/* x */ scala.Double, /* y */ scala.Double, /* z */ scala.Double, DOMPointReadOnly]
     with org.scalablytyped.runtime.Instantiable4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* z */ scala.Double, 
      /* w */ scala.Double, 
      DOMPointReadOnly
    ] {
  def fromPoint(): stdLib.DOMPointReadOnly = js.native
  def fromPoint(other: stdLib.DOMPointInit): stdLib.DOMPointReadOnly = js.native
}

