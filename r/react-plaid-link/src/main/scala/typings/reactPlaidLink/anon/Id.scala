package typings.reactPlaidLink.anon

import typings.reactPlaidLink.reactPlaidLinkStrings.manually_verified
import typings.reactPlaidLink.reactPlaidLinkStrings.pending_automatic_verification
import typings.reactPlaidLink.reactPlaidLinkStrings.pending_manual_verification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id extends js.Object {
  var id: String = js.native
  var mask: String = js.native
  var name: String = js.native
  var subtype: String = js.native
  var `type`: String = js.native
  var verification_status: pending_automatic_verification | pending_manual_verification | manually_verified | Null = js.native
}

object Id {
  @scala.inline
  def apply(id: String, mask: String, name: String, subtype: String, `type`: String): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  @scala.inline
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubtype(value: String): Self = this.set("subtype", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerification_status(value: pending_automatic_verification | pending_manual_verification | manually_verified): Self = this.set("verification_status", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerification_statusNull: Self = this.set("verification_status", null)
  }
  
}

