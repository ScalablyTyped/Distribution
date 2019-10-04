package typings.reactDashMedia.reactDashMediaMod

import typings.react.reactMod.ReactNode
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps extends js.Object {
  var render: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  var targetWindow: js.UndefOr[Window] = js.undefined
}

object BaseProps {
  @scala.inline
  def apply(render: () => ReactNode = null, targetWindow: Window = null): BaseProps = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    if (targetWindow != null) __obj.updateDynamic("targetWindow")(targetWindow)
    __obj.asInstanceOf[BaseProps]
  }
}

