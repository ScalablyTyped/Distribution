package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
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
  extends Instantiable0[DOMQuad]
     with Instantiable1[/* p1 */ DOMPointInit, DOMQuad]
     with Instantiable2[/* p1 */ DOMPointInit, /* p2 */ DOMPointInit, DOMQuad]
     with Instantiable3[/* p1 */ DOMPointInit, /* p2 */ DOMPointInit, /* p3 */ DOMPointInit, DOMQuad]
     with Instantiable4[
      /* p1 */ DOMPointInit, 
      /* p2 */ DOMPointInit, 
      /* p3 */ DOMPointInit, 
      /* p4 */ DOMPointInit, 
      DOMQuad
    ] {
  def fromQuad(): DOMQuad = js.native
  def fromQuad(other: DOMQuadInit): DOMQuad = js.native
  def fromRect(): DOMQuad = js.native
  def fromRect(other: DOMRectInit): DOMQuad = js.native
}

