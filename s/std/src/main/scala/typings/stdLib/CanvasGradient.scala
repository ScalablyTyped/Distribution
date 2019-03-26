package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasGradient extends js.Object {
  /**
    * Adds a color stop with the given color to the gradient at the given offset. 0.0 is the offset
    * at one end of the gradient, 1.0 is the offset at the other end.
    * Throws an "IndexSizeError" DOMException if the offset
    * is out of range. Throws a "SyntaxError" DOMException if
    * the color cannot be parsed.
    */
  def addColorStop(offset: scala.Double, color: java.lang.String): scala.Unit
}

@JSGlobal("CanvasGradient")
@js.native
class CanvasGradientCls () extends CanvasGradient {
  /**
    * Adds a color stop with the given color to the gradient at the given offset. 0.0 is the offset
    * at one end of the gradient, 1.0 is the offset at the other end.
    * Throws an "IndexSizeError" DOMException if the offset
    * is out of range. Throws a "SyntaxError" DOMException if
    * the color cannot be parsed.
    */
  /* CompleteClass */
  override def addColorStop(offset: scala.Double, color: java.lang.String): scala.Unit = js.native
}

@JSGlobal("CanvasGradient")
@js.native
object CanvasGradient
  extends org.scalablytyped.runtime.Instantiable0[CanvasGradient]

