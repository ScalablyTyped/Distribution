package typings.reactOverlays.dropdownToggleMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownToggleProps extends js.Object {
  /**
    * A render prop that returns a Toggle element. The `props`
    * argument should spread through to **a component that can accept a ref**. Use
    * the `onToggle` argument to toggle the menu open or closed
    */
  def children(renderProps: DropdownToggleRenderProps): ReactElement
}

object DropdownToggleProps {
  @scala.inline
  def apply(children: DropdownToggleRenderProps => ReactElement): DropdownToggleProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[DropdownToggleProps]
  }
}

