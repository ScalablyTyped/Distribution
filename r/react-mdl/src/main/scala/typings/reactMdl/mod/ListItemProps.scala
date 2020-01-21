package typings.reactMdl.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any] {
  var threeLine: js.UndefOr[Boolean] = js.undefined
  var twoLine: js.UndefOr[Boolean] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    threeLine: js.UndefOr[Boolean] = js.undefined,
    twoLine: js.UndefOr[Boolean] = js.undefined
  ): ListItemProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(threeLine)) __obj.updateDynamic("threeLine")(threeLine.asInstanceOf[js.Any])
    if (!js.isUndefined(twoLine)) __obj.updateDynamic("twoLine")(twoLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemProps]
  }
}

