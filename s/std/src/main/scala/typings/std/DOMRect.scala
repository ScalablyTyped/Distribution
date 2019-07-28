package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRect extends DOMRectReadOnly

@JSGlobal("DOMRect")
@js.native
class DOMRectCls () extends DOMRect {
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

@JSGlobal("DOMRect")
@js.native
object DOMRect
  extends Instantiable0[DOMRect]
     with Instantiable1[/* x */ Double, DOMRect]
     with Instantiable2[/* x */ Double, /* y */ Double, DOMRect]
     with Instantiable3[/* x */ Double, /* y */ Double, /* width */ Double, DOMRect]
     with Instantiable4[/* x */ Double, /* y */ Double, /* width */ Double, /* height */ Double, DOMRect] {
  def fromRect(): DOMRect = js.native
  def fromRect(other: DOMRectInit): DOMRect = js.native
}

