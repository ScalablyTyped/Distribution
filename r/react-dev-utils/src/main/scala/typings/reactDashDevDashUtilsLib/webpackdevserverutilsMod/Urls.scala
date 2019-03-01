package typings
package reactDashDevDashUtilsLib.webpackdevserverutilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Urls extends js.Object {
  var lanUrlForConfig: js.UndefOr[java.lang.String] = js.undefined
  var lanUrlForTerminal: js.UndefOr[java.lang.String] = js.undefined
  var localUrlForBrowser: java.lang.String
  var localUrlForTerminal: java.lang.String
}

object Urls {
  @scala.inline
  def apply(
    localUrlForBrowser: java.lang.String,
    localUrlForTerminal: java.lang.String,
    lanUrlForConfig: java.lang.String = null,
    lanUrlForTerminal: java.lang.String = null
  ): Urls = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("localUrlForBrowser")(localUrlForBrowser)
    __obj.updateDynamic("localUrlForTerminal")(localUrlForTerminal)
    if (lanUrlForConfig != null) __obj.updateDynamic("lanUrlForConfig")(lanUrlForConfig)
    if (lanUrlForTerminal != null) __obj.updateDynamic("lanUrlForTerminal")(lanUrlForTerminal)
    __obj.asInstanceOf[Urls]
  }
}

