package typings.reactDashBootstrap.libPanelFooterMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelFooterProps
  extends AllHTMLAttributes[PanelFooter]
     with ClassAttributes[PanelFooter] {
  var bsClass: js.UndefOr[String] = js.undefined
}

object PanelFooterProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[PanelFooter] = null,
    ClassAttributes: ClassAttributes[PanelFooter] = null,
    bsClass: String = null
  ): PanelFooterProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[PanelFooterProps]
  }
}

