package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.MuxedAccount
import typings.stellarBase.xdrMod.xdr.OperationBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Body extends js.Object {
  var body: OperationBody = js.native
  var sourceAccount: Null | MuxedAccount = js.native
}

object Body {
  @scala.inline
  def apply(body: OperationBody): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
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
    def setBody(value: OperationBody): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceAccount(value: MuxedAccount): Self = this.set("sourceAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceAccountNull: Self = this.set("sourceAccount", null)
  }
  
}

