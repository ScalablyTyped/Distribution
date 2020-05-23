package typings.sitemap2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitemapConfig extends js.Object {
  var cacheTime: js.UndefOr[Double] = js.undefined
  var childrens: js.UndefOr[js.Array[Sitemap]] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var hostName: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var urls: js.UndefOr[js.Array[String]] = js.undefined
  var xslUrl: js.UndefOr[String] = js.undefined
}

object SitemapConfig {
  @scala.inline
  def apply(
    cacheTime: js.UndefOr[Double] = js.undefined,
    childrens: js.Array[Sitemap] = null,
    fileName: String = null,
    hostName: String = null,
    limit: js.UndefOr[Double] = js.undefined,
    urls: js.Array[String] = null,
    xslUrl: String = null
  ): SitemapConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheTime)) __obj.updateDynamic("cacheTime")(cacheTime.get.asInstanceOf[js.Any])
    if (childrens != null) __obj.updateDynamic("childrens")(childrens.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (hostName != null) __obj.updateDynamic("hostName")(hostName.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    if (xslUrl != null) __obj.updateDynamic("xslUrl")(xslUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SitemapConfig]
  }
}

