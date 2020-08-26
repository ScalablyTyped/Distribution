package typings.routie.routie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteOptions extends js.Object {
  var silent: js.UndefOr[Boolean] = js.native
}

object RouteOptions {
  @scala.inline
  def apply(): RouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteOptions]
  }
  @scala.inline
  implicit class RouteOptionsOps[Self <: RouteOptions] (val x: Self) extends AnyVal {
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
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
  
}

