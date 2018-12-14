package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DOMQuad extends js.Object {
  val p1: DOMPoint
  val p2: DOMPoint
  val p3: DOMPoint
  val p4: DOMPoint
  def getBounds(): DOMRect
  def toJSON(): js.Any
}

@JSGlobal("DOMQuad")
@js.native
object DOMQuad
  extends org.scalablytyped.runtime.Instantiable0[DOMQuad]
     with org.scalablytyped.runtime.Instantiable1[/* p1 */ DOMPointInit, DOMQuad]
     with org.scalablytyped.runtime.Instantiable2[/* p1 */ DOMPointInit, /* p2 */ DOMPointInit, DOMQuad]
     with org.scalablytyped.runtime.Instantiable3[/* p1 */ DOMPointInit, /* p2 */ DOMPointInit, /* p3 */ DOMPointInit, DOMQuad]
     with org.scalablytyped.runtime.Instantiable4[
      /* p1 */ DOMPointInit, 
      /* p2 */ DOMPointInit, 
      /* p3 */ DOMPointInit, 
      /* p4 */ DOMPointInit, 
      DOMQuad
    ] {
  def fromQuad(): stdLib.DOMQuad = js.native
  def fromQuad(other: stdLib.DOMQuadInit): stdLib.DOMQuad = js.native
  def fromRect(): stdLib.DOMQuad = js.native
  def fromRect(other: stdLib.DOMRectInit): stdLib.DOMQuad = js.native
}

