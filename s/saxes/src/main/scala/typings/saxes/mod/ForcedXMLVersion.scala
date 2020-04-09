package typings.saxes.mod

import typings.saxes.saxesBooleans.`true`
import typings.saxes.saxesStrings.`1Dot0`
import typings.saxes.saxesStrings.`1Dot1`
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForcedXMLVersion extends XMLVersionOptions {
  @JSName("defaultXMLVersion")
  var defaultXMLVersion_ForcedXMLVersion: Exclude[js.UndefOr[`1Dot0` | `1Dot1`], js.UndefOr[scala.Nothing]]
  @JSName("forceXMLVersion")
  var forceXMLVersion_ForcedXMLVersion: `true`
}

object ForcedXMLVersion {
  @scala.inline
  def apply(
    forceXMLVersion: `true`,
    defaultXMLVersion: Exclude[js.UndefOr[`1Dot0` | `1Dot1`], js.UndefOr[scala.Nothing]] = null
  ): ForcedXMLVersion = {
    val __obj = js.Dynamic.literal(forceXMLVersion = forceXMLVersion.asInstanceOf[js.Any])
    if (defaultXMLVersion != null) __obj.updateDynamic("defaultXMLVersion")(defaultXMLVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForcedXMLVersion]
  }
}

