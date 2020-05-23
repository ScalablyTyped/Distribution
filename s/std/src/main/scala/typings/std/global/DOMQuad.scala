package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.std.DOMPointInit
import typings.std.DOMQuadInit
import typings.std.DOMRectInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DOMQuad")
@js.native
class DOMQuad ()
  extends typings.std.DOMQuad {
  def this(p1: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  /* CompleteClass */
  override val p1: typings.std.DOMPoint = js.native
  /* CompleteClass */
  override val p2: typings.std.DOMPoint = js.native
  /* CompleteClass */
  override val p3: typings.std.DOMPoint = js.native
  /* CompleteClass */
  override val p4: typings.std.DOMPoint = js.native
  /* CompleteClass */
  override def getBounds(): typings.std.DOMRect = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("DOMQuad")
@js.native
object DOMQuad
  extends Instantiable0[typings.std.DOMQuad]
     with Instantiable1[/* p1 */ DOMPointInit, typings.std.DOMQuad]
     with Instantiable2[/* p1 */ DOMPointInit, /* p2 */ DOMPointInit, typings.std.DOMQuad]
     with Instantiable3[
      /* p1 */ DOMPointInit, 
      /* p2 */ DOMPointInit, 
      /* p3 */ DOMPointInit, 
      typings.std.DOMQuad
    ]
     with Instantiable4[
      /* p1 */ DOMPointInit, 
      /* p2 */ DOMPointInit, 
      /* p3 */ DOMPointInit, 
      /* p4 */ DOMPointInit, 
      typings.std.DOMQuad
    ] {
  def fromQuad(): typings.std.DOMQuad = js.native
  def fromQuad(other: DOMQuadInit): typings.std.DOMQuad = js.native
  def fromRect(): typings.std.DOMQuad = js.native
  def fromRect(other: DOMRectInit): typings.std.DOMQuad = js.native
}

