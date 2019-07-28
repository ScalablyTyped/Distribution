package typings.reactDashBootstrap.libPanelFooterMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelFooterProps extends HTMLProps[PanelFooter] {
  var bsClass: js.UndefOr[String] = js.undefined
}

object PanelFooterProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[PanelFooter] = null, bsClass: String = null): PanelFooterProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[PanelFooterProps]
  }
}

