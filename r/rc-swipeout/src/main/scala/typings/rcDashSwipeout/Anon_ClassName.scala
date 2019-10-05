package typings.rcDashSwipeout

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var text: ReactNode
  var `type`: js.UndefOr[js.Any] = js.undefined
}

object Anon_ClassName {
  @scala.inline
  def apply(
    className: String = null,
    onPress: () => Unit = null,
    style: js.Any = null,
    text: ReactNode = null,
    `type`: js.Any = null
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ClassName]
  }
}

