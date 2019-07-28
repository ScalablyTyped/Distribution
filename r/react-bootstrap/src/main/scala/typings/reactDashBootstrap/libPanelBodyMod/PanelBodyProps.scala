package typings.reactDashBootstrap.libPanelBodyMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBodyProps extends HTMLProps[PanelBody] {
  var bsClass: js.UndefOr[String] = js.undefined
  var collapsible: js.UndefOr[Boolean] = js.undefined
}

object PanelBodyProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[PanelBody] = null,
    bsClass: String = null,
    collapsible: js.UndefOr[Boolean] = js.undefined
  ): PanelBodyProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    __obj.asInstanceOf[PanelBodyProps]
  }
}

