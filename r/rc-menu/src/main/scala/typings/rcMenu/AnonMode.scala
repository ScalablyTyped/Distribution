package typings.rcMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMode extends js.Object {
  var manualRef: js.Function0[Unit]
  var mode: String
  var onMouseEnter: js.Function0[Unit]
  var onMouseLeave: js.Function0[Unit]
  var onTitleClick: js.Function0[Unit]
  var onTitleMouseEnter: js.Function0[Unit]
  var onTitleMouseLeave: js.Function0[Unit]
  var title: String
}

object AnonMode {
  @scala.inline
  def apply(
    manualRef: () => Unit,
    mode: String,
    onMouseEnter: () => Unit,
    onMouseLeave: () => Unit,
    onTitleClick: () => Unit,
    onTitleMouseEnter: () => Unit,
    onTitleMouseLeave: () => Unit,
    title: String
  ): AnonMode = {
    val __obj = js.Dynamic.literal(manualRef = js.Any.fromFunction0(manualRef), mode = mode.asInstanceOf[js.Any], onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave), onTitleClick = js.Any.fromFunction0(onTitleClick), onTitleMouseEnter = js.Any.fromFunction0(onTitleMouseEnter), onTitleMouseLeave = js.Any.fromFunction0(onTitleMouseLeave), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMode]
  }
}

