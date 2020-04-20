package typings.storybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScale extends js.Object {
  var scale: Double = js.native
}

object AnonScale {
  @scala.inline
  def apply(scale: Double): AnonScale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScale]
  }
}

