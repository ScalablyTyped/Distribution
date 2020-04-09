package typings.saxes.mod

import typings.saxes.saxesBooleans.`false`
import typings.saxes.saxesStrings.`1Dot0`
import typings.saxes.saxesStrings.`1Dot1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoForcedXMLVersion extends XMLVersionOptions {
  @JSName("forceXMLVersion")
  var forceXMLVersion_NoForcedXMLVersion: js.UndefOr[`false`] = js.undefined
}

object NoForcedXMLVersion {
  @scala.inline
  def apply(defaultXMLVersion: `1Dot0` | `1Dot1` = null, forceXMLVersion: `false` = null): NoForcedXMLVersion = {
    val __obj = js.Dynamic.literal()
    if (defaultXMLVersion != null) __obj.updateDynamic("defaultXMLVersion")(defaultXMLVersion.asInstanceOf[js.Any])
    if (forceXMLVersion != null) __obj.updateDynamic("forceXMLVersion")(forceXMLVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoForcedXMLVersion]
  }
}

