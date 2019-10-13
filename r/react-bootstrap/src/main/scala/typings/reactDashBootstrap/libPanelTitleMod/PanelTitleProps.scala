package typings.reactDashBootstrap.libPanelTitleMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelTitleProps
  extends AllHTMLAttributes[PanelTitle]
     with ClassAttributes[PanelTitle] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[String] = js.undefined
  var toggle: js.UndefOr[Boolean] = js.undefined
}

object PanelTitleProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[PanelTitle] = null,
    ClassAttributes: ClassAttributes[PanelTitle] = null,
    bsClass: String = null,
    componentClass: String = null,
    toggle: js.UndefOr[Boolean] = js.undefined
  ): PanelTitleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass)
    if (!js.isUndefined(toggle)) __obj.updateDynamic("toggle")(toggle)
    __obj.asInstanceOf[PanelTitleProps]
  }
}

