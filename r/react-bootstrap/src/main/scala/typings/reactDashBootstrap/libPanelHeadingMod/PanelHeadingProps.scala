package typings.reactDashBootstrap.libPanelHeadingMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelHeadingProps
  extends AllHTMLAttributes[PanelHeading]
     with ClassAttributes[PanelHeading] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[String] = js.undefined
}

object PanelHeadingProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[PanelHeading] = null,
    ClassAttributes: ClassAttributes[PanelHeading] = null,
    bsClass: String = null,
    componentClass: String = null
  ): PanelHeadingProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanelHeadingProps]
  }
}

