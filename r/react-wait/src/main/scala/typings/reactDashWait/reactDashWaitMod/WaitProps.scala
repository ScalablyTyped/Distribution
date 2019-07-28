package typings.reactDashWait.reactDashWaitMod

import typings.react.reactMod.Global.JSXNs.Element
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
    val __obj = js.Dynamic.literal(fallback = fallback, on = on)
  
    __obj.asInstanceOf[WaitProps]
  }
}

