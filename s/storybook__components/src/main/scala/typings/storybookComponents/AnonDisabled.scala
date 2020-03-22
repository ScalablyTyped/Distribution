package typings.storybookComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisabled extends js.Object {
  var disabled: Boolean = js.native
}

object AnonDisabled {
  @scala.inline
  def apply(disabled: Boolean): AnonDisabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDisabled]
  }
}

