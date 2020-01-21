package typings.reactDevUtils.webpackDevServerUtilsMod

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
    val __obj = js.Dynamic.literal(localUrlForBrowser = localUrlForBrowser.asInstanceOf[js.Any], localUrlForTerminal = localUrlForTerminal.asInstanceOf[js.Any])
    if (lanUrlForConfig != null) __obj.updateDynamic("lanUrlForConfig")(lanUrlForConfig.asInstanceOf[js.Any])
    if (lanUrlForTerminal != null) __obj.updateDynamic("lanUrlForTerminal")(lanUrlForTerminal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Urls]
  }
}

