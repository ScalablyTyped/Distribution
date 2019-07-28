package typings.reactDashBootstrap.libPanelHeadingMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelHeadingProps extends HTMLProps[PanelHeading] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[String] = js.undefined
}

object PanelHeadingProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[PanelHeading] = null, bsClass: String = null, componentClass: String = null): PanelHeadingProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass)
    __obj.asInstanceOf[PanelHeadingProps]
  }
}

