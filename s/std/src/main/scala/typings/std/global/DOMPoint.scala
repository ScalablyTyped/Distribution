package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.std.DOMPointInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DOMPoint")
@js.native
class DOMPoint ()
  extends typings.std.DOMPoint {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
}

@JSGlobal("DOMPoint")
@js.native
object DOMPoint
  extends Instantiable0[typings.std.DOMPoint]
     with Instantiable1[/* x */ Double, typings.std.DOMPoint]
     with Instantiable2[/* x */ Double, /* y */ Double, typings.std.DOMPoint]
     with Instantiable3[/* x */ Double, /* y */ Double, /* z */ Double, typings.std.DOMPoint]
     with Instantiable4[/* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, typings.std.DOMPoint] {
  def fromPoint(): typings.std.DOMPoint = js.native
  def fromPoint(other: DOMPointInit): typings.std.DOMPoint = js.native
}

