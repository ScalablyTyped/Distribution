package typings.reactDashDevDashUtils.webpackDevServerUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Urls extends js.Object {
  var lanUrlForConfig: js.UndefOr[String] = js.undefined
  var lanUrlForTerminal: js.UndefOr[String] = js.undefined
  var localUrlForBrowser: String
  var localUrlForTerminal: String
}

object Urls {
  @scala.inline
  def apply(
    localUrlForBrowser: String,
    localUrlForTerminal: String,
    lanUrlForConfig: String = null,
    lanUrlForTerminal: String = null
  ): Urls = {
    val __obj = js.Dynamic.literal(localUrlForBrowser = localUrlForBrowser, localUrlForTerminal = localUrlForTerminal)
    if (lanUrlForConfig != null) __obj.updateDynamic("lanUrlForConfig")(lanUrlForConfig)
    if (lanUrlForTerminal != null) __obj.updateDynamic("lanUrlForTerminal")(lanUrlForTerminal)
    __obj.asInstanceOf[Urls]
  }
}

