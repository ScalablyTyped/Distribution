package typings
package reactDashWaitLib.reactDashWaitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitProps extends js.Object {
  var fallback: reactLib.reactMod.Global.JSXNs.Element
  var on: java.lang.String
}

object WaitProps {
  @scala.inline
  def apply(fallback: reactLib.reactMod.Global.JSXNs.Element, on: java.lang.String): WaitProps = {
    val __obj = js.Dynamic.literal(fallback = fallback, on = on)
  
    __obj.asInstanceOf[WaitProps]
  }
}

