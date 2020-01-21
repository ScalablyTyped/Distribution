package typings.reactNativeMaterialKit.mod.MKPropTypes

import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`100`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`200`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`300`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`400`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`500`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`600`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`700`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`800`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.`900`
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.bold
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.italic
import typings.reactNativeMaterialKit.reactNativeMaterialKitStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait font extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var fontStyle: js.UndefOr[normal | italic] = js.undefined
  var fontWeight: js.UndefOr[
    normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
  ] = js.undefined
}

object font {
  @scala.inline
  def apply(
    color: String = null,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    fontStyle: normal | italic = null,
    fontWeight: normal | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900` = null
  ): font = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[font]
  }
}

