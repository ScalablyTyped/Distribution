package typings
package rcDashSwipeoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var text: reactLib.reactMod.ReactNs.ReactNode
  var `type`: js.UndefOr[js.Any] = js.undefined
}

object Anon_ClassName {
  @scala.inline
  def apply(
    text: reactLib.reactMod.ReactNs.ReactNode,
    className: java.lang.String = null,
    onPress: () => scala.Unit = null,
    style: js.Any = null,
    `type`: js.Any = null
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ClassName]
  }
}

