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

@JSGlobal("DOMPointReadOnly")
@js.native
class DOMPointReadOnly ()
  extends typings.std.DOMPointReadOnly {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
}

@JSGlobal("DOMPointReadOnly")
@js.native
object DOMPointReadOnly
  extends Instantiable0[typings.std.DOMPointReadOnly]
     with Instantiable1[/* x */ Double, typings.std.DOMPointReadOnly]
     with Instantiable2[/* x */ Double, /* y */ Double, typings.std.DOMPointReadOnly]
     with Instantiable3[/* x */ Double, /* y */ Double, /* z */ Double, typings.std.DOMPointReadOnly]
     with Instantiable4[
      /* x */ Double, 
      /* y */ Double, 
      /* z */ Double, 
      /* w */ Double, 
      typings.std.DOMPointReadOnly
    ] {
  def fromPoint(): typings.std.DOMPointReadOnly = js.native
  def fromPoint(other: DOMPointInit): typings.std.DOMPointReadOnly = js.native
}

