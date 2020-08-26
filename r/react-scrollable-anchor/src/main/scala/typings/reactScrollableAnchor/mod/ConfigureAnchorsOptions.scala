package typings.reactScrollableAnchor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigureAnchorsOptions extends js.Object {
  var keepLastAnchorHash: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Double] = js.native
  var scrollDuration: js.UndefOr[Double] = js.native
}

object ConfigureAnchorsOptions {
  @scala.inline
  def apply(): ConfigureAnchorsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureAnchorsOptions]
  }
  @scala.inline
  implicit class ConfigureAnchorsOptionsOps[Self <: ConfigureAnchorsOptions] (val x: Self) extends AnyVal {
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
    def setKeepLastAnchorHash(value: Boolean): Self = this.set("keepLastAnchorHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepLastAnchorHash: Self = this.set("keepLastAnchorHash", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setScrollDuration(value: Double): Self = this.set("scrollDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollDuration: Self = this.set("scrollDuration", js.undefined)
  }
  
}

