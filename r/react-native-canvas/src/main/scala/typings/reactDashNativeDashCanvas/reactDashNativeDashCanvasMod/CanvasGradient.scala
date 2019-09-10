package typings.reactDashNativeDashCanvas.reactDashNativeDashCanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasGradient extends js.Object {
  def addColorStop(offset: Double, color: String): Unit
}

object CanvasGradient {
  @scala.inline
  def apply(addColorStop: (Double, String) => Unit): CanvasGradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2(addColorStop))
  
    __obj.asInstanceOf[CanvasGradient]
  }
}

