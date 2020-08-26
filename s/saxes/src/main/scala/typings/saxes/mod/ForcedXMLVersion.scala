package typings.saxes.mod

import typings.saxes.saxesBooleans.`true`
import typings.saxes.saxesStrings.`1Dot0`
import typings.saxes.saxesStrings.`1Dot1`
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForcedXMLVersion extends XMLVersionOptions {
  @JSName("defaultXMLVersion")
  var defaultXMLVersion_ForcedXMLVersion: Exclude[js.UndefOr[`1Dot0` | `1Dot1`], js.UndefOr[scala.Nothing]] = js.native
  @JSName("forceXMLVersion")
  var forceXMLVersion_ForcedXMLVersion: `true` = js.native
}

object ForcedXMLVersion {
  @scala.inline
  def apply(forceXMLVersion: `true`): ForcedXMLVersion = {
    val __obj = js.Dynamic.literal(forceXMLVersion = forceXMLVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForcedXMLVersion]
  }
  @scala.inline
  implicit class ForcedXMLVersionOps[Self <: ForcedXMLVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForceXMLVersion(value: `true`): Self = this.set("forceXMLVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultXMLVersion(value: Exclude[js.UndefOr[`1Dot0` | `1Dot1`], js.UndefOr[scala.Nothing]]): Self = this.set("defaultXMLVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultXMLVersion: Self = this.set("defaultXMLVersion", js.undefined)
  }
  
}

