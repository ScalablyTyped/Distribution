package typings
package sitemap2Lib.sitemap2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitemapConfig extends js.Object {
  var cacheTime: js.UndefOr[scala.Double] = js.undefined
  var childrens: js.UndefOr[js.Array[Sitemap]] = js.undefined
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var hostName: js.UndefOr[java.lang.String] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var urls: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var xslUrl: js.UndefOr[java.lang.String] = js.undefined
}

object SitemapConfig {
  @scala.inline
  def apply(
    cacheTime: scala.Int | scala.Double = null,
    childrens: js.Array[Sitemap] = null,
    fileName: java.lang.String = null,
    hostName: java.lang.String = null,
    limit: scala.Int | scala.Double = null,
    urls: js.Array[java.lang.String] = null,
    xslUrl: java.lang.String = null
  ): SitemapConfig = {
    val __obj = js.Dynamic.literal()
    if (cacheTime != null) __obj.updateDynamic("cacheTime")(cacheTime.asInstanceOf[js.Any])
    if (childrens != null) __obj.updateDynamic("childrens")(childrens)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (hostName != null) __obj.updateDynamic("hostName")(hostName)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls)
    if (xslUrl != null) __obj.updateDynamic("xslUrl")(xslUrl)
    __obj.asInstanceOf[SitemapConfig]
  }
}

