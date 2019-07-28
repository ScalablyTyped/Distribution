package typings.atStorybookAddonDashViewport.atStorybookAddonDashViewportMod

import typings.atStorybookAddonDashViewport.Anon_Height
import typings.atStorybookAddonDashViewport.atStorybookAddonDashViewportStrings.desktop
import typings.atStorybookAddonDashViewport.atStorybookAddonDashViewportStrings.mobile
import typings.atStorybookAddonDashViewport.atStorybookAddonDashViewportStrings.tablet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportProperties extends js.Object {
  var name: ViewportName
  var styles: Anon_Height
  var `type`: js.UndefOr[desktop | tablet | mobile | String] = js.undefined
}

object ViewportProperties {
  @scala.inline
  def apply(name: ViewportName, styles: Anon_Height, `type`: desktop | tablet | mobile | String = null): ViewportProperties = {
    val __obj = js.Dynamic.literal(name = name, styles = styles)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportProperties]
  }
}

