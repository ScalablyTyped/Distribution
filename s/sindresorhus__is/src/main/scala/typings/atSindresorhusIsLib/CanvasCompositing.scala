package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasCompositing extends js.Object {
  var globalAlpha: scala.Double
  var globalCompositeOperation: java.lang.String
}

object CanvasCompositing {
  @scala.inline
  def apply(globalAlpha: scala.Double, globalCompositeOperation: java.lang.String): CanvasCompositing = {
    val __obj = js.Dynamic.literal(globalAlpha = globalAlpha, globalCompositeOperation = globalCompositeOperation)
  
    __obj.asInstanceOf[CanvasCompositing]
  }
}

