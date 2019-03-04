package typings
package reactDashSelectLib.libComponentsContainersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerState extends js.Object {
  /** Whether the select is disabled. */
  var isDisabled: scala.Boolean
  /** Whether the text in the select is indented from right to left. */
  var isRtl: scala.Boolean
}

object ContainerState {
  @scala.inline
  def apply(isDisabled: scala.Boolean, isRtl: scala.Boolean): ContainerState = {
    val __obj = js.Dynamic.literal(isDisabled = isDisabled, isRtl = isRtl)
  
    __obj.asInstanceOf[ContainerState]
  }
}

