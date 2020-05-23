package typings.reactBootstrap.panelBodyMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelBodyProps
  extends AllHTMLAttributes[PanelBody]
     with ClassAttributes[PanelBody] {
  var bsClass: js.UndefOr[String] = js.undefined
  var collapsible: js.UndefOr[Boolean] = js.undefined
}

object PanelBodyProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[PanelBody] = null,
    ClassAttributes: ClassAttributes[PanelBody] = null,
    bsClass: String = null,
    collapsible: js.UndefOr[Boolean] = js.undefined
  ): PanelBodyProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelBodyProps]
  }
}

