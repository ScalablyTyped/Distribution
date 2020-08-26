package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExceptionInformation extends js.Object {
  var domain: js.UndefOr[java.lang.String | Null] = js.native
}

object ExceptionInformation {
  @scala.inline
  def apply(): ExceptionInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExceptionInformation]
  }
  @scala.inline
  implicit class ExceptionInformationOps[Self <: ExceptionInformation] (val x: Self) extends AnyVal {
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
    def setDomain(value: java.lang.String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setDomainNull: Self = this.set("domain", null)
  }
  
}

