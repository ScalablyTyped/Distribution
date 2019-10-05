package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.react.reactMod.Global.JSX.Element
import typings.reactDashNativeDashMaterialDashUi.Anon_ContentContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogContentProps extends js.Object {
  var children: Element
  var style: js.UndefOr[Anon_ContentContainer] = js.undefined
}

object DialogContentProps {
  @scala.inline
  def apply(children: Element, style: Anon_ContentContainer = null): DialogContentProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DialogContentProps]
  }
}

