package typings.reactNativeMaterialMenu.mod

import typings.react.mod.ReactElement
import typings.std.StyleMedia_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var button: js.UndefOr[ReactElement] = js.undefined
  var onHidden: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[StyleMedia_] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    animationDuration: Int | Double = null,
    button: ReactElement = null,
    onHidden: () => Unit = null,
    style: StyleMedia_ = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (onHidden != null) __obj.updateDynamic("onHidden")(js.Any.fromFunction0(onHidden))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuProps]
  }
}

