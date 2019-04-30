package typings
package stringDashPixelDashWidthLib.stringDashPixelDashWidthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  var font: js.UndefOr[
    (stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.`andale mono`) | stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.arial | (stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.`avenir next`) | stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.avenir | (stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.`comic sans ms`) | (stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.`courier new`) | stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.georgia | stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.impact | (stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.`open sans`) | stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.tahoma | (stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.`times new roman`) | (stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.`trebuchet ms`) | stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.verdana | stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.webdings
  ] = js.undefined
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    font: (stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.`andale mono`) | stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.arial | (stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.`avenir next`) | stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.avenir | (stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.`comic sans ms`) | (stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.`courier new`) | stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.georgia | stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.impact | (stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.`open sans`) | stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.tahoma | (stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.`times new roman`) | (stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.`trebuchet ms`) | stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.verdana | stringDashPixelDashWidthLib.stringDashPixelDashWidthLibStrings.webdings = null,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    size: scala.Int | scala.Double = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

