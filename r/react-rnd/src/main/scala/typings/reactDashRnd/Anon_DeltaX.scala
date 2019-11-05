package typings.reactDashRnd

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeltaX extends js.Object {
  var deltaX: Double
  var deltaY: Double
  var lastX: Double
  var lastY: Double
  var node: HTMLElement
}

object Anon_DeltaX {
  @scala.inline
  def apply(deltaX: Double, deltaY: Double, lastX: Double, lastY: Double, node: HTMLElement): Anon_DeltaX = {
    val __obj = js.Dynamic.literal(deltaX = deltaX, deltaY = deltaY, lastX = lastX, lastY = lastY, node = node)
  
    __obj.asInstanceOf[Anon_DeltaX]
  }
}

