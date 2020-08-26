package typings.storybookAddons.distMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchOptions extends js.Object {
  var viewMode: String = js.native
}

object MatchOptions {
  @scala.inline
  def apply(viewMode: String): MatchOptions = {
    val __obj = js.Dynamic.literal(viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchOptions]
  }
  @scala.inline
  implicit class MatchOptionsOps[Self <: MatchOptions] (val x: Self) extends AnyVal {
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
    def setViewMode(value: String): Self = this.set("viewMode", value.asInstanceOf[js.Any])
  }
  
}

