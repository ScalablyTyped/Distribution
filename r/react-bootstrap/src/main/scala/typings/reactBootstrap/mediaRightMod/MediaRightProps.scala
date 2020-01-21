package typings.reactBootstrap.mediaRightMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRightProps
  extends AllHTMLAttributes[MediaRight]
     with ClassAttributes[MediaRight] {
  var align: js.UndefOr[String] = js.undefined
}

object MediaRightProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[MediaRight] = null,
    ClassAttributes: ClassAttributes[MediaRight] = null,
    align: String = null
  ): MediaRightProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaRightProps]
  }
}

