package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientQueryOptions extends js.Object {
  var includeUncontrolled: js.UndefOr[scala.Boolean] = js.native
  var `type`: js.UndefOr[ClientTypes] = js.native
}

object ClientQueryOptions {
  @scala.inline
  def apply(): ClientQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientQueryOptions]
  }
  @scala.inline
  implicit class ClientQueryOptionsOps[Self <: ClientQueryOptions] (val x: Self) extends AnyVal {
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
    def setIncludeUncontrolled(value: scala.Boolean): Self = this.set("includeUncontrolled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeUncontrolled: Self = this.set("includeUncontrolled", js.undefined)
    @scala.inline
    def setType(value: ClientTypes): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

