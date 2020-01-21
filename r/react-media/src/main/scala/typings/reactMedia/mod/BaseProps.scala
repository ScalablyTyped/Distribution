package typings.reactMedia.mod

import typings.react.mod.ReactNode
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps extends js.Object {
  var render: js.UndefOr[js.Function0[ReactNode]] = js.undefined
  var targetWindow: js.UndefOr[Window_] = js.undefined
}

object BaseProps {
  @scala.inline
  def apply(render: () => ReactNode = null, targetWindow: Window_ = null): BaseProps = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    if (targetWindow != null) __obj.updateDynamic("targetWindow")(targetWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
}

