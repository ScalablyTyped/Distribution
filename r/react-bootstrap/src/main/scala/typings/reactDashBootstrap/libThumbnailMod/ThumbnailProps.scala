package typings.reactDashBootstrap.libThumbnailMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
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
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    __obj.asInstanceOf[ThumbnailProps]
  }
}

