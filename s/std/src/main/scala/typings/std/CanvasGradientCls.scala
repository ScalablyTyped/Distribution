package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CanvasGradient")
@js.native
class CanvasGradientCls () extends CanvasGradient {
  /**
    * Adds a color stop with the given color to the gradient at the given offset. 0.0 is the offset at one end of the gradient, 1.0 is the offset at the other end.
    * 
    * Throws an "IndexSizeError" DOMException if the offset is out of range. Throws a "SyntaxError" DOMException if the color cannot be parsed.
    */
  /* CompleteClass */
  override def addColorStop(offset: Double, color: java.lang.String): Unit = js.native
}

