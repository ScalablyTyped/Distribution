package typings.reactDashBootstrap.libTabContentMod

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabContentProps extends HTMLProps[TabContent] {
  var animation: js.UndefOr[Boolean | ReactType[_]] = js.undefined
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
  var mountOnEnter: js.UndefOr[Boolean] = js.undefined
  var unmountOnExit: js.UndefOr[Boolean] = js.undefined
}

object TabContentProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[TabContent] = null,
    animation: Boolean | ReactType[_] = null,
    bsClass: String = null,
    componentClass: ReactType[_] = null,
    mountOnEnter: js.UndefOr[Boolean] = js.undefined,
    unmountOnExit: js.UndefOr[Boolean] = js.undefined
  ): TabContentProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (!js.isUndefined(mountOnEnter)) __obj.updateDynamic("mountOnEnter")(mountOnEnter)
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit)
    __obj.asInstanceOf[TabContentProps]
  }
}

