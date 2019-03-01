package typings
package seleniumDashStandaloneLib.seleniumDashStandaloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsPaths
  extends /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var chrome: js.UndefOr[seleniumDashStandaloneLib.Anon_InstallPath] = js.undefined
  var edge: js.UndefOr[seleniumDashStandaloneLib.Anon_InstallPath] = js.undefined
  var firefox: js.UndefOr[seleniumDashStandaloneLib.Anon_InstallPath] = js.undefined
  var ie: js.UndefOr[seleniumDashStandaloneLib.Anon_InstallPath] = js.undefined
  var selenium: js.UndefOr[seleniumDashStandaloneLib.Anon_InstallPath] = js.undefined
}

object FsPaths {
  @scala.inline
  def apply(
    StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    chrome: seleniumDashStandaloneLib.Anon_InstallPath = null,
    edge: seleniumDashStandaloneLib.Anon_InstallPath = null,
    firefox: seleniumDashStandaloneLib.Anon_InstallPath = null,
    ie: seleniumDashStandaloneLib.Anon_InstallPath = null,
    selenium: seleniumDashStandaloneLib.Anon_InstallPath = null
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

