package typings.ssh2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientErrorExtensions extends js.Object {
  /** Additional detail for 'client-ssh' messages. */
  var description: js.UndefOr[String] = js.native
  /** Indicates 'client-socket' for socket-level errors and 'client-ssh' for SSH disconnection messages. */
  var level: js.UndefOr[String] = js.native
}

object ClientErrorExtensions {
  @scala.inline
  def apply(): ClientErrorExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientErrorExtensions]
  }
  @scala.inline
  implicit class ClientErrorExtensionsOps[Self <: ClientErrorExtensions] (val x: Self) extends AnyVal {
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
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
  
}

