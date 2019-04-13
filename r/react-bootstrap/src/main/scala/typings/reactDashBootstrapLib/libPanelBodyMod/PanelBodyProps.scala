package typings
package reactDashBootstrapLib.libPanelBodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBodyProps
  extends reactLib.reactMod.HTMLProps[PanelBody] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
}

object PanelBodyProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[PanelBody] = null,
    bsClass: java.lang.String = null,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined
  ): PanelBodyProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    __obj.asInstanceOf[PanelBodyProps]
  }
}

