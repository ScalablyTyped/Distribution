package typings.select2.mod

import typings.select2.select2Strings.close
import typings.select2.select2Strings.open
import typings.select2.select2Strings.select
import typings.select2.select2Strings.unselect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IngParams extends js.Object {
  var name: select | open | close | unselect = js.native
  var prevented: Boolean = js.native
}

object IngParams {
  @scala.inline
  def apply(name: select | open | close | unselect, prevented: Boolean): IngParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prevented = prevented.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngParams]
  }
  @scala.inline
  implicit class IngParamsOps[Self <: IngParams] (val x: Self) extends AnyVal {
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
    def setName(value: select | open | close | unselect): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevented(value: Boolean): Self = this.set("prevented", value.asInstanceOf[js.Any])
  }
  
}

