package typings.seleniumStandalone.mod

import org.scalablytyped.runtime.StringDictionary
import typings.seleniumStandalone.AnonInstallPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsPaths
  extends /* x */ StringDictionary[js.Any] {
  var chrome: js.UndefOr[AnonInstallPath] = js.undefined
  var edge: js.UndefOr[AnonInstallPath] = js.undefined
  var firefox: js.UndefOr[AnonInstallPath] = js.undefined
  var ie: js.UndefOr[AnonInstallPath] = js.undefined
  var selenium: js.UndefOr[AnonInstallPath] = js.undefined
}

object FsPaths {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    chrome: AnonInstallPath = null,
    edge: AnonInstallPath = null,
    firefox: AnonInstallPath = null,
    ie: AnonInstallPath = null,
    selenium: AnonInstallPath = null
  ): FsPaths = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (chrome != null) __obj.updateDynamic("chrome")(chrome.asInstanceOf[js.Any])
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (firefox != null) __obj.updateDynamic("firefox")(firefox.asInstanceOf[js.Any])
    if (ie != null) __obj.updateDynamic("ie")(ie.asInstanceOf[js.Any])
    if (selenium != null) __obj.updateDynamic("selenium")(selenium.asInstanceOf[js.Any])
    __obj.asInstanceOf[FsPaths]
  }
}

