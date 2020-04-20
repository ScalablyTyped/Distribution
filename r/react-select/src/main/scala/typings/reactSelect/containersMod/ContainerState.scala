package typings.reactSelect.containersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerState extends js.Object {
  /** Whether the select is disabled. */
  var isDisabled: Boolean
  /** Whether the text in the select is indented from right to left. */
  var isRtl: Boolean
}

object ContainerState {
  @scala.inline
  def apply(isDisabled: Boolean, isRtl: Boolean): ContainerState = {
    val __obj = js.Dynamic.literal(isDisabled = isDisabled.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerState]
  }
}

