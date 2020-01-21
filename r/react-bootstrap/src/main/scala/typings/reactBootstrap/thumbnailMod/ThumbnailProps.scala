package typings.reactBootstrap.thumbnailMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbnailProps
  extends AllHTMLAttributes[Thumbnail]
     with ClassAttributes[Thumbnail] {
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var bsStyle: js.UndefOr[String] = js.undefined
}

object ThumbnailProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Thumbnail] = null,
    ClassAttributes: ClassAttributes[Thumbnail] = null,
    bsSize: Sizes = null,
    bsStyle: String = null
  ): ThumbnailProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThumbnailProps]
  }
}

