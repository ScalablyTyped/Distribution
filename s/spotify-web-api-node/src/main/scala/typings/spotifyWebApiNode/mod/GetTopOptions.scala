package typings.spotifyWebApiNode.mod

import typings.spotifyWebApiNode.spotifyWebApiNodeStrings.long_term
import typings.spotifyWebApiNode.spotifyWebApiNodeStrings.medium_term
import typings.spotifyWebApiNode.spotifyWebApiNodeStrings.short_term
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTopOptions extends PaginationOptions {
  var time_range: js.UndefOr[long_term | medium_term | short_term] = js.native
}

object GetTopOptions {
  @scala.inline
  def apply(): GetTopOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTopOptions]
  }
  @scala.inline
  implicit class GetTopOptionsOps[Self <: GetTopOptions] (val x: Self) extends AnyVal {
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
    def setTime_range(value: long_term | medium_term | short_term): Self = this.set("time_range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime_range: Self = this.set("time_range", js.undefined)
  }
  
}

