package typings.reactDashNativeDashModalDashPopover.libPopoverControllerMod

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  def children(props: PopoverControllerRenderProps): ReactElement
}

object Props {
  @scala.inline
  def apply(children: PopoverControllerRenderProps => ReactElement): Props = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[Props]
  }
}

