package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SVGRect")
@js.native
class SVGRectCls () extends DOMRect {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double) = this()
  /* CompleteClass */
  override val bottom: scala.Double = js.native
  /* CompleteClass */
  override val height: scala.Double = js.native
  /* CompleteClass */
  override val left: scala.Double = js.native
  /* CompleteClass */
  override val right: scala.Double = js.native
  /* CompleteClass */
  override val top: scala.Double = js.native
  /* CompleteClass */
  override val width: scala.Double = js.native
  /* CompleteClass */
  override val x: scala.Double = js.native
  /* CompleteClass */
  override val y: scala.Double = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("SVGRect")
@js.native
object SVGRect
  extends org.scalablytyped.runtime.Instantiable0[DOMRect]
     with org.scalablytyped.runtime.Instantiable1[/* x */ scala.Double, DOMRect]
     with org.scalablytyped.runtime.Instantiable2[/* x */ scala.Double, /* y */ scala.Double, DOMRect]
     with org.scalablytyped.runtime.Instantiable3[/* x */ scala.Double, /* y */ scala.Double, /* width */ scala.Double, DOMRect]
     with org.scalablytyped.runtime.Instantiable4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      DOMRect
    ] {
  def fromRect(): stdLib.DOMRect = js.native
  def fromRect(other: stdLib.DOMRectInit): stdLib.DOMRect = js.native
}

