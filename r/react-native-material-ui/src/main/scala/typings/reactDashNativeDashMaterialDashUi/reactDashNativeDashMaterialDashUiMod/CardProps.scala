package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.react.reactMod.Global.JSX.Element
import typings.reactDashNativeDashMaterialDashUi.Anon_ContainerViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardProps extends js.Object {
  var children: js.UndefOr[Element] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[Anon_ContainerViewStyle] = js.undefined
}

object CardProps {
  @scala.inline
  def apply(children: Element = null, onPress: () => Unit = null, style: Anon_ContainerViewStyle = null): CardProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CardProps]
  }
}

