package typings.seleniumStandalone.mod

import org.scalablytyped.runtime.StringDictionary
import typings.seleniumStandalone.anon.Dictx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsPaths
  extends /* x */ StringDictionary[js.Any] {
  var chrome: js.UndefOr[Dictx] = js.undefined
  var edge: js.UndefOr[Dictx] = js.undefined
  var firefox: js.UndefOr[Dictx] = js.undefined
  var ie: js.UndefOr[Dictx] = js.undefined
  var selenium: js.UndefOr[Dictx] = js.undefined
}

object FsPaths {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    chrome: Dictx = null,
    edge: Dictx = null,
    firefox: Dictx = null,
    ie: Dictx = null,
    selenium: Dictx = null
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

