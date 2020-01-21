package typings.sitemap2.mod

import typings.sitemap2.AnonContentloc
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlData extends js.Object {
  var chengefreq: js.UndefOr[String] = js.undefined
  var lastmod: js.UndefOr[Date] = js.undefined
  var lastmodInISO: js.UndefOr[Boolean] = js.undefined
  var lastmodWithTime: js.UndefOr[Boolean] = js.undefined
  var priority: js.UndefOr[Double | String] = js.undefined
  var url: String
  var video: js.UndefOr[AnonContentloc] = js.undefined
}

object UrlData {
  @scala.inline
  def apply(
    url: String,
    chengefreq: String = null,
    lastmod: Date = null,
    lastmodInISO: js.UndefOr[Boolean] = js.undefined,
    lastmodWithTime: js.UndefOr[Boolean] = js.undefined,
    priority: Double | String = null,
    video: AnonContentloc = null
  ): UrlData = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (chengefreq != null) __obj.updateDynamic("chengefreq")(chengefreq.asInstanceOf[js.Any])
    if (lastmod != null) __obj.updateDynamic("lastmod")(lastmod.asInstanceOf[js.Any])
    if (!js.isUndefined(lastmodInISO)) __obj.updateDynamic("lastmodInISO")(lastmodInISO.asInstanceOf[js.Any])
    if (!js.isUndefined(lastmodWithTime)) __obj.updateDynamic("lastmodWithTime")(lastmodWithTime.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlData]
  }
}

