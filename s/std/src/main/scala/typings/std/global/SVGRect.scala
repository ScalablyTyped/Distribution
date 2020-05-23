package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.std.DOMRectInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SVGRect")
@js.native
class SVGRect ()
  extends typings.std.DOMRect {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, width: Double) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  /* CompleteClass */
  override val bottom: Double = js.native
  /* CompleteClass */
  override val height: Double = js.native
  /* CompleteClass */
  override val left: Double = js.native
  /* CompleteClass */
  override val right: Double = js.native
  /* CompleteClass */
  override val top: Double = js.native
  /* CompleteClass */
  override val width: Double = js.native
  /* CompleteClass */
  override val x: Double = js.native
  /* CompleteClass */
  override val y: Double = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("SVGRect")
@js.native
object SVGRect
  extends Instantiable0[typings.std.DOMRect]
     with Instantiable1[/* x */ Double, typings.std.DOMRect]
     with Instantiable2[/* x */ Double, /* y */ Double, typings.std.DOMRect]
     with Instantiable3[/* x */ Double, /* y */ Double, /* width */ Double, typings.std.DOMRect]
     with Instantiable4[
      /* x */ Double, 
      /* y */ Double, 
      /* width */ Double, 
      /* height */ Double, 
      typings.std.DOMRect
    ] {
  def fromRect(): typings.std.DOMRect = js.native
  def fromRect(other: DOMRectInit): typings.std.DOMRect = js.native
}

