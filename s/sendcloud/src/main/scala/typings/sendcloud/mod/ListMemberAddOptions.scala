package typings.sendcloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMemberAddOptions extends js.Object {
  var description: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var upsert: js.UndefOr[String] = js.native
  var vars: js.UndefOr[String] = js.native
}

object ListMemberAddOptions {
  @scala.inline
  def apply(): ListMemberAddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMemberAddOptions]
  }
  @scala.inline
  implicit class ListMemberAddOptionsOps[Self <: ListMemberAddOptions] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setUpsert(value: String): Self = this.set("upsert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpsert: Self = this.set("upsert", js.undefined)
    @scala.inline
    def setVars(value: String): Self = this.set("vars", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVars: Self = this.set("vars", js.undefined)
  }
  
}

