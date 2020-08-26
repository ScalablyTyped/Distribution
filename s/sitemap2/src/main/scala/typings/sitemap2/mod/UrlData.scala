package typings.sitemap2.mod

import typings.sitemap2.anon.Contentloc
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlData extends js.Object {
  var chengefreq: js.UndefOr[String] = js.native
  var lastmod: js.UndefOr[Date] = js.native
  var lastmodInISO: js.UndefOr[Boolean] = js.native
  var lastmodWithTime: js.UndefOr[Boolean] = js.native
  var priority: js.UndefOr[Double | String] = js.native
  var url: String = js.native
  var video: js.UndefOr[Contentloc] = js.native
}

object UrlData {
  @scala.inline
  def apply(url: String): UrlData = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlData]
  }
  @scala.inline
  implicit class UrlDataOps[Self <: UrlData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setChengefreq(value: String): Self = this.set("chengefreq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChengefreq: Self = this.set("chengefreq", js.undefined)
    @scala.inline
    def setLastmod(value: Date): Self = this.set("lastmod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastmod: Self = this.set("lastmod", js.undefined)
    @scala.inline
    def setLastmodInISO(value: Boolean): Self = this.set("lastmodInISO", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastmodInISO: Self = this.set("lastmodInISO", js.undefined)
    @scala.inline
    def setLastmodWithTime(value: Boolean): Self = this.set("lastmodWithTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastmodWithTime: Self = this.set("lastmodWithTime", js.undefined)
    @scala.inline
    def setPriority(value: Double | String): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setVideo(value: Contentloc): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
  
}

