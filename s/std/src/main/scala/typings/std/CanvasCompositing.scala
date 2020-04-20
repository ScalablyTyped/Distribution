package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasCompositing extends js.Object {
  var globalAlpha: Double
  var globalCompositeOperation: java.lang.String
}

object CanvasCompositing {
  @scala.inline
  def apply(globalAlpha: Double, globalCompositeOperation: java.lang.String): CanvasCompositing = {
    val __obj = js.Dynamic.literal(globalAlpha = globalAlpha.asInstanceOf[js.Any], globalCompositeOperation = globalCompositeOperation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasCompositing]
  }
}

