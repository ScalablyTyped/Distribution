package typings
package reactDashNativeDashModalDashPopoverLib.libPopoverControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  def children(props: PopoverControllerRenderProps): reactLib.reactMod.ReactElement
}

object Props {
  @scala.inline
  def apply(children: PopoverControllerRenderProps => reactLib.reactMod.ReactElement): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[Props]
  }
}

