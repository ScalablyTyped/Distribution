package typings.spectacle.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps extends js.Object {
  var alt: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var display: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var margin: js.UndefOr[Double | String] = js.undefined
  var padding: js.UndefOr[Double | String] = js.undefined
  var src: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    alt: String = null,
    className: String = null,
    display: String = null,
    height: Double | String = null,
    margin: Double | String = null,
    padding: Double | String = null,
    src: String = null,
    width: Double | String = null
  ): ImageProps = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (className != null) __obj.updateDynamic("className")(className)
    if (display != null) __obj.updateDynamic("display")(display)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
}

