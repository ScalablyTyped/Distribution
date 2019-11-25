package typings.proxyDashLists.proxyDashListsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSourcesOptions extends js.Object {
  var sourcesBlackList: js.UndefOr[js.Array[String]] = js.undefined
  var sourcesWhiteList: js.UndefOr[js.Array[String]] = js.undefined
}

object ListSourcesOptions {
  @scala.inline
  def apply(sourcesBlackList: js.Array[String] = null, sourcesWhiteList: js.Array[String] = null): ListSourcesOptions = {
    val __obj = js.Dynamic.literal()
    if (sourcesBlackList != null) __obj.updateDynamic("sourcesBlackList")(sourcesBlackList.asInstanceOf[js.Any])
    if (sourcesWhiteList != null) __obj.updateDynamic("sourcesWhiteList")(sourcesWhiteList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSourcesOptions]
  }
}

