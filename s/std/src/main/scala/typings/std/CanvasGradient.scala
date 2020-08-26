package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An opaque object describing a gradient. It is returned by the methods CanvasRenderingContext2D.createLinearGradient() or CanvasRenderingContext2D.createRadialGradient(). */
@js.native
trait CanvasGradient extends js.Object {
  /**
    * Adds a color stop with the given color to the gradient at the given offset. 0.0 is the offset at one end of the gradient, 1.0 is the offset at the other end.
    * 
    * Throws an "IndexSizeError" DOMException if the offset is out of range. Throws a "SyntaxError" DOMException if the color cannot be parsed.
    */
  def addColorStop(offset: Double, color: java.lang.String): Unit = js.native
}

object CanvasGradient {
  @scala.inline
  def apply(addColorStop: (Double, java.lang.String) => Unit): CanvasGradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop))
    __obj.asInstanceOf[CanvasGradient]
  }
  @scala.inline
  implicit class CanvasGradientOps[Self <: CanvasGradient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddColorStop(value: (Double, java.lang.String) => Unit): Self = this.set("addColorStop", js.Any.fromFunction2(value))
  }
  
}

