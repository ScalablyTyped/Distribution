package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaQueryListEventInit extends EventInit {
  var matches: js.UndefOr[scala.Boolean] = js.native
  var media: js.UndefOr[java.lang.String] = js.native
}

object MediaQueryListEventInit {
  @scala.inline
  def apply(): MediaQueryListEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaQueryListEventInit]
  }
  @scala.inline
  implicit class MediaQueryListEventInitOps[Self <: MediaQueryListEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMatches(value: scala.Boolean): Self = this.set("matches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatches: Self = this.set("matches", js.undefined)
    @scala.inline
    def setMedia(value: java.lang.String): Self = this.set("media", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia: Self = this.set("media", js.undefined)
  }
  
}

