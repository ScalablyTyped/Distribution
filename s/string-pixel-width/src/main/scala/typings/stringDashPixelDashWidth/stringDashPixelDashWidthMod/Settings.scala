package typings.stringDashPixelDashWidth.stringDashPixelDashWidthMod

import typings.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.`andale mono`
import typings.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.`avenir next`
import typings.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.`comic sans ms`
import typings.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.`courier new`
import typings.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.`open sans`
import typings.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.`times new roman`
import typings.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.`trebuchet ms`
import typings.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.arial
import typings.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.avenir
import typings.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.georgia
import typings.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.impact
import typings.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.tahoma
import typings.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.verdana
import typings.stringDashPixelDashWidth.stringDashPixelDashWidthStrings.webdings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var bold: js.UndefOr[Boolean] = js.undefined
  var font: js.UndefOr[
    (`andale mono`) | arial | (`avenir next`) | avenir | (`comic sans ms`) | (`courier new`) | georgia | impact | (`open sans`) | tahoma | (`times new roman`) | (`trebuchet ms`) | verdana | webdings
  ] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    bold: js.UndefOr[Boolean] = js.undefined,
    font: (`andale mono`) | arial | (`avenir next`) | avenir | (`comic sans ms`) | (`courier new`) | georgia | impact | (`open sans`) | tahoma | (`times new roman`) | (`trebuchet ms`) | verdana | webdings = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    size: Int | Double = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

