package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InnerProps extends js.Object {
  /** Props that will be passed on to the children. */
  var innerProps: js.Any
  /** The focused state of the select. */
  var isFocused: scala.Boolean
  /** Whether the text is right to left */
  var isRtl: scala.Boolean
  /** Set size of the container. */
  var size: scala.Double
}

object Anon_InnerProps {
  @scala.inline
  def apply(innerProps: js.Any, isFocused: scala.Boolean, isRtl: scala.Boolean, size: scala.Double): Anon_InnerProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("innerProps")(innerProps)
    __obj.updateDynamic("isFocused")(isFocused)
    __obj.updateDynamic("isRtl")(isRtl)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_InnerProps]
  }
}

