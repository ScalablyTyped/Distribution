package typings.restifyPlugins.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlEncodedBodyParser_ extends js.Object {
  var mapParams: js.UndefOr[Boolean] = js.native
  var overrideParams: js.UndefOr[Boolean] = js.native
}

object UrlEncodedBodyParser_ {
  @scala.inline
  def apply(): UrlEncodedBodyParser_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlEncodedBodyParser_]
  }
  @scala.inline
  implicit class UrlEncodedBodyParser_Ops[Self <: UrlEncodedBodyParser_] (val x: Self) extends AnyVal {
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
    def setMapParams(value: Boolean): Self = this.set("mapParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapParams: Self = this.set("mapParams", js.undefined)
    @scala.inline
    def setOverrideParams(value: Boolean): Self = this.set("overrideParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideParams: Self = this.set("overrideParams", js.undefined)
  }
  
}

