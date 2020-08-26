package typings.solidAuthClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  var webId: String = js.native
}

object Session {
  @scala.inline
  def apply(webId: String): Session = {
    val __obj = js.Dynamic.literal(webId = webId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
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
    def setWebId(value: String): Self = this.set("webId", value.asInstanceOf[js.Any])
  }
  
}

