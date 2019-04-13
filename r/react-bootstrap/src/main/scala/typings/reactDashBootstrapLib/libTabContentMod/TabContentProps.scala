package typings
package reactDashBootstrapLib.libTabContentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabContentProps
  extends reactLib.reactMod.HTMLProps[TabContent] {
  var animation: js.UndefOr[scala.Boolean | reactLib.reactMod.ReactType[_]] = js.undefined
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var componentClass: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var mountOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  var unmountOnExit: js.UndefOr[scala.Boolean] = js.undefined
}

object TabContentProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[TabContent] = null,
    animation: scala.Boolean | reactLib.reactMod.ReactType[_] = null,
    bsClass: java.lang.String = null,
    componentClass: reactLib.reactMod.ReactType[_] = null,
    mountOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    unmountOnExit: js.UndefOr[scala.Boolean] = js.undefined
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

