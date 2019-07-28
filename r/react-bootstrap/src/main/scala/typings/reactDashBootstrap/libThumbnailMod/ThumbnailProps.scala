package typings.reactDashBootstrap.libThumbnailMod

import typings.react.reactMod.HTMLProps
import typings.reactDashBootstrap.reactDashBootstrapMod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbnailProps extends HTMLProps[Thumbnail] {
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var bsStyle: js.UndefOr[String] = js.undefined
}

object ThumbnailProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[Thumbnail] = null, bsSize: Sizes = null, bsStyle: String = null): ThumbnailProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize)
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle)
    __obj.asInstanceOf[ThumbnailProps]
  }
}

