package typings.stellarSdk.serverApiMod.ServerApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRecordSigners extends js.Object {
  var key: String = js.native
  var `type`: String = js.native
  var weight: Double = js.native
}

object AccountRecordSigners {
  @scala.inline
  def apply(key: String, `type`: String, weight: Double): AccountRecordSigners = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRecordSigners]
  }
  @scala.inline
  implicit class AccountRecordSignersOps[Self <: AccountRecordSigners] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
  
}

