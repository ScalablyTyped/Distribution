package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashNativeDashMaterialDashUi.Anon_ContainerViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogProps extends js.Object {
  var children: Element | js.Array[Element]
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[Anon_ContainerViewStyle] = js.undefined
}

object DialogProps {
  @scala.inline
  def apply(
    children: Element | js.Array[Element],
    onPress: () => Unit = null,
    style: Anon_ContainerViewStyle = null
  ): DialogProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DialogProps]
  }
}

