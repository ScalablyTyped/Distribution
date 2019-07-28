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
trait DOMPoint extends DOMPointReadOnly

@JSGlobal("DOMPoint")
@js.native
class DOMPointCls () extends DOMPoint {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
}

@JSGlobal("DOMPoint")
@js.native
object DOMPoint
  extends Instantiable0[DOMPoint]
     with Instantiable1[/* x */ Double, DOMPoint]
     with Instantiable2[/* x */ Double, /* y */ Double, DOMPoint]
     with Instantiable3[/* x */ Double, /* y */ Double, /* z */ Double, DOMPoint]
     with Instantiable4[/* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, DOMPoint] {
  def fromPoint(): DOMPoint = js.native
  def fromPoint(other: DOMPointInit): DOMPoint = js.native
}

