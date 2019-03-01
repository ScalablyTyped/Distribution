package typings
package spectacleLib.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageProps extends js.Object {
  var alt: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var display: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var margin: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var padding: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var src: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object ImageProps {
  @scala.inline
  def apply(
    alt: java.lang.String = null,
    className: java.lang.String = null,
    display: java.lang.String = null,
    height: scala.Double | java.lang.String = null,
    margin: scala.Double | java.lang.String = null,
    padding: scala.Double | java.lang.String = null,
    src: java.lang.String = null,
    width: scala.Double | java.lang.String = null
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

