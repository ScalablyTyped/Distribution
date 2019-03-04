package typings
package reactDashOverlaysLib.libDropdownToggleMod.DropdownToggleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownToggleProps extends js.Object {
  /**
    * A render prop that returns a Toggle element. The `props`
    * argument should spread through to **a component that can accept a ref**. Use
    * the `onToggle` argument to toggle the menu open or closed
    */
  def children(renderProps: DropdownToggleRenderProps): reactLib.reactMod.ReactNs.ReactElement[_]
}

object DropdownToggleProps {
  @scala.inline
  def apply(children: js.Function1[DropdownToggleRenderProps, reactLib.reactMod.ReactNs.ReactElement[_]]): DropdownToggleProps = {
    val __obj = js.Dynamic.literal(children = children)
  
    __obj.asInstanceOf[DropdownToggleProps]
  }
}

