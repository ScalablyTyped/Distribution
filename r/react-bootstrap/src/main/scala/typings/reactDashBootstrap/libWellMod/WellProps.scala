package typings.reactDashBootstrap.libWellMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WellProps
  extends AllHTMLAttributes[Well]
     with ClassAttributes[Well] {
  var bsClass: js.UndefOr[String] = js.undefined
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var bsStyle: js.UndefOr[String] = js.undefined
}

object WellProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Well] = null,
    ClassAttributes: ClassAttributes[Well] = null,
    bsClass: String = null,
    bsSize: Sizes = null,
    bsStyle: String = null
  ): WellProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    __obj.asInstanceOf[WellProps]
  }
}

