package typings.storybookComponents.tabsMod

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabWrapperProps extends js.Object {
  var active: Boolean = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var render: js.UndefOr[js.Function0[Element]] = js.native
}

object TabWrapperProps {
  @scala.inline
  def apply(active: Boolean, children: ReactNode = null, render: () => Element = null): TabWrapperProps = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    __obj.asInstanceOf[TabWrapperProps]
  }
}

