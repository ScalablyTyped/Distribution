package typings.seleniumDashStandalone.seleniumDashStandaloneMod

import org.scalablytyped.runtime.StringDictionary
import typings.seleniumDashStandalone.Anon_InstallPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsPaths
  extends /* x */ StringDictionary[js.Any] {
  var chrome: js.UndefOr[Anon_InstallPath] = js.undefined
  var edge: js.UndefOr[Anon_InstallPath] = js.undefined
  var firefox: js.UndefOr[Anon_InstallPath] = js.undefined
  var ie: js.UndefOr[Anon_InstallPath] = js.undefined
  var selenium: js.UndefOr[Anon_InstallPath] = js.undefined
}

object FsPaths {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    chrome: Anon_InstallPath = null,
    edge: Anon_InstallPath = null,
    firefox: Anon_InstallPath = null,
    ie: Anon_InstallPath = null,
    selenium: Anon_InstallPath = null
  ): FsPaths = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (chrome != null) __obj.updateDynamic("chrome")(chrome)
    if (edge != null) __obj.updateDynamic("edge")(edge)
    if (firefox != null) __obj.updateDynamic("firefox")(firefox)
    if (ie != null) __obj.updateDynamic("ie")(ie)
    if (selenium != null) __obj.updateDynamic("selenium")(selenium)
    __obj.asInstanceOf[FsPaths]
  }
}

