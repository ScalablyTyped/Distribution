package typings.spotifyWebApiNode.mod

import typings.spotifyWebApiNode.spotifyWebApiNodeStrings.context
import typings.spotifyWebApiNode.spotifyWebApiNodeStrings.off
import typings.spotifyWebApiNode.spotifyWebApiNodeStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepeatOptions extends DeviceOptions {
  var state: js.UndefOr[track | context | off] = js.native
}

object RepeatOptions {
  @scala.inline
  def apply(): RepeatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepeatOptions]
  }
  @scala.inline
  implicit class RepeatOptionsOps[Self <: RepeatOptions] (val x: Self) extends AnyVal {
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
    def setState(value: track | context | off): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

