package typings
package reactDashBytesizeDashIconsLib.reactDashBytesizeDashIconsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BytesizeIconsProps
  extends reactLib.reactMod.ReactNs.Props[js.Any] {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var strokeLinecap: js.UndefOr[StrokeLinecap] = js.undefined
  var strokeLinejoin: js.UndefOr[StrokeLinejoin] = js.undefined
  var strokeWidth: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object BytesizeIconsProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    color: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[js.Any] = null,
    strokeLinecap: StrokeLinecap = null,
    strokeLinejoin: StrokeLinejoin = null,
    strokeWidth: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): BytesizeIconsProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap)
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BytesizeIconsProps]
  }
}

