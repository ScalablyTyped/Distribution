package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SVGRect")
@js.native
object SVGRect
  extends ScalablyTyped.runtime.Instantiable0[DOMRect]
     with ScalablyTyped.runtime.Instantiable1[/* x */ scala.Double, DOMRect]
     with ScalablyTyped.runtime.Instantiable2[/* x */ scala.Double, /* y */ scala.Double, DOMRect]
     with ScalablyTyped.runtime.Instantiable3[/* x */ scala.Double, /* y */ scala.Double, /* width */ scala.Double, DOMRect]
     with ScalablyTyped.runtime.Instantiable4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      DOMRect
    ] {
  def fromRect(): stdLib.DOMRect = js.native
  def fromRect(other: stdLib.DOMRectInit): stdLib.DOMRect = js.native
}

