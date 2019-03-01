package typings
package sitemap2Lib.sitemap2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlData extends js.Object {
  var chengefreq: js.UndefOr[java.lang.String] = js.undefined
  var lastmod: js.UndefOr[stdLib.Date] = js.undefined
  var lastmodInISO: js.UndefOr[scala.Boolean] = js.undefined
  var lastmodWithTime: js.UndefOr[scala.Boolean] = js.undefined
  var priority: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var url: java.lang.String
  var video: js.UndefOr[sitemap2Lib.Anon_Contentloc] = js.undefined
}

object UrlData {
  @scala.inline
  def apply(
    url: java.lang.String,
    chengefreq: java.lang.String = null,
    lastmod: stdLib.Date = null,
    lastmodInISO: js.UndefOr[scala.Boolean] = js.undefined,
    lastmodWithTime: js.UndefOr[scala.Boolean] = js.undefined,
    priority: scala.Double | java.lang.String = null,
    video: sitemap2Lib.Anon_Contentloc = null
  ): UrlData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (chengefreq != null) __obj.updateDynamic("chengefreq")(chengefreq)
    if (lastmod != null) __obj.updateDynamic("lastmod")(lastmod)
    if (!js.isUndefined(lastmodInISO)) __obj.updateDynamic("lastmodInISO")(lastmodInISO)
    if (!js.isUndefined(lastmodWithTime)) __obj.updateDynamic("lastmodWithTime")(lastmodWithTime)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video)
    __obj.asInstanceOf[UrlData]
  }
}

