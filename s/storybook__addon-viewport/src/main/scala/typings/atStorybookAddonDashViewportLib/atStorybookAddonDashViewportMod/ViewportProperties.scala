package typings
package atStorybookAddonDashViewportLib.atStorybookAddonDashViewportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportProperties extends js.Object {
  var name: ViewportName
  var styles: atStorybookAddonDashViewportLib.Anon_Height
  var `type`: js.UndefOr[
    atStorybookAddonDashViewportLib.atStorybookAddonDashViewportLibStrings.desktop | atStorybookAddonDashViewportLib.atStorybookAddonDashViewportLibStrings.tablet | atStorybookAddonDashViewportLib.atStorybookAddonDashViewportLibStrings.mobile | java.lang.String
  ] = js.undefined
}

object ViewportProperties {
  @scala.inline
  def apply(
    name: ViewportName,
    styles: atStorybookAddonDashViewportLib.Anon_Height,
    `type`: atStorybookAddonDashViewportLib.atStorybookAddonDashViewportLibStrings.desktop | atStorybookAddonDashViewportLib.atStorybookAddonDashViewportLibStrings.tablet | atStorybookAddonDashViewportLib.atStorybookAddonDashViewportLibStrings.mobile | java.lang.String = null
  ): ViewportProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("styles")(styles)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportProperties]
  }
}

