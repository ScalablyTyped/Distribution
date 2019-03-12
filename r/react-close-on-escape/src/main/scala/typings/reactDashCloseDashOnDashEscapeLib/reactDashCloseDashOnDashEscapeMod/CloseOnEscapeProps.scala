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
  def apply(onEscape: () => scala.Unit): CloseOnEscapeProps = {
    val __obj = js.Dynamic.literal(onEscape = js.Any.fromFunction0(onEscape))
  
    __obj.asInstanceOf[CloseOnEscapeProps]
  }
}

