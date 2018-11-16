package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMPoint extends DOMPointReadOnly

@JSGlobal("DOMPoint")
@js.native
object DOMPoint
  extends ScalablyTyped.runtime.Instantiable0[DOMPoint]
     with ScalablyTyped.runtime.Instantiable1[/* x */ scala.Double, DOMPoint]
     with ScalablyTyped.runtime.Instantiable2[/* x */ scala.Double, /* y */ scala.Double, DOMPoint]
     with ScalablyTyped.runtime.Instantiable3[/* x */ scala.Double, /* y */ scala.Double, /* z */ scala.Double, DOMPoint]
     with ScalablyTyped.runtime.Instantiable4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* z */ scala.Double, 
      /* w */ scala.Double, 
      DOMPoint
    ] {
  def fromPoint(): stdLib.DOMPoint = js.native
  def fromPoint(other: stdLib.DOMPointInit): stdLib.DOMPoint = js.native
}

