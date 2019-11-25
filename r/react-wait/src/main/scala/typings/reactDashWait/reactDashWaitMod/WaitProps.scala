package typings.reactDashWait.reactDashWaitMod

import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitProps extends js.Object {
  var fallback: Element
  var on: String
}

object WaitProps {
  @scala.inline
  def apply(fallback: Element, on: String): WaitProps = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WaitProps]
  }
}

