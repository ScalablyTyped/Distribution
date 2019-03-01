package typings
package reactDashCloseDashOnDashEscapeLib.reactDashCloseDashOnDashEscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseOnEscapeProps extends js.Object {
  /**
    * Callback triggered by pressing ESC
    */
  def onEscape(): scala.Unit
}

object CloseOnEscapeProps {
  @scala.inline
  def apply(onEscape: js.Function0[scala.Unit]): CloseOnEscapeProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onEscape")(onEscape)
    __obj.asInstanceOf[CloseOnEscapeProps]
  }
}

