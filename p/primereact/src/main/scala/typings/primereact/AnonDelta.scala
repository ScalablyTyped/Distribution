package typings.primereact

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDelta extends js.Object {
  var delta: Double
  var element: HTMLElement
}

object AnonDelta {
  @scala.inline
  def apply(delta: Double, element: HTMLElement): AnonDelta = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelta]
  }
}

