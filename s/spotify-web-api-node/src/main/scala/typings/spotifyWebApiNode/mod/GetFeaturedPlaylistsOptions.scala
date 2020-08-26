package typings.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFeaturedPlaylistsOptions
  extends PaginationOptions
     with LocaleOptions {
  var timestamp: js.UndefOr[String] = js.native
}

object GetFeaturedPlaylistsOptions {
  @scala.inline
  def apply(): GetFeaturedPlaylistsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFeaturedPlaylistsOptions]
  }
  @scala.inline
  implicit class GetFeaturedPlaylistsOptionsOps[Self <: GetFeaturedPlaylistsOptions] (val x: Self) extends AnyVal {
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
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
  
}

