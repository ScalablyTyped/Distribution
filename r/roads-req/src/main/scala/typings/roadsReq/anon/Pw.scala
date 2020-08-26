package typings.roadsReq.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pw extends js.Object {
  var pw: String = js.native
  var un: String = js.native
}

object Pw {
  @scala.inline
  def apply(pw: String, un: String): Pw = {
    val __obj = js.Dynamic.literal(pw = pw.asInstanceOf[js.Any], un = un.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pw]
  }
  @scala.inline
  implicit class PwOps[Self <: Pw] (val x: Self) extends AnyVal {
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
    def setPw(value: String): Self = this.set("pw", value.asInstanceOf[js.Any])
    @scala.inline
    def setUn(value: String): Self = this.set("un", value.asInstanceOf[js.Any])
  }
  
}

