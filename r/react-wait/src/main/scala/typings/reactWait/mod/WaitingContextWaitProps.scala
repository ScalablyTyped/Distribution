package typings.reactWait.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitingContextWaitProps extends js.Object {
  var fallback: Element
}

object WaitingContextWaitProps {
  @scala.inline
  def apply(fallback: Element): WaitingContextWaitProps = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitingContextWaitProps]
  }
}

