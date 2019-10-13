package typings.reactDashNativeDashMaterialDashUi.reactDashNativeDashMaterialDashUiMod

import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashNativeDashMaterialDashUi.Anon_TitleContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogTitleProps extends js.Object {
  var children: Element
  var style: js.UndefOr[Anon_TitleContainer] = js.undefined
}

object DialogTitleProps {
  @scala.inline
  def apply(children: Element, style: Anon_TitleContainer = null): DialogTitleProps = {
    val __obj = js.Dynamic.literal(children = children)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DialogTitleProps]
  }
}

