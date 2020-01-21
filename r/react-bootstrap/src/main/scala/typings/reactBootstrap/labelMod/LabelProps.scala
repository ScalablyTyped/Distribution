package typings.reactBootstrap.labelMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelProps
  extends AllHTMLAttributes[Label]
     with ClassAttributes[Label] {
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var bsStyle: js.UndefOr[String] = js.undefined
}

object LabelProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Label] = null,
    ClassAttributes: ClassAttributes[Label] = null,
    bsSize: Sizes = null,
    bsStyle: String = null
  ): LabelProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelProps]
  }
}

