package typings.shopifyPrime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disconnectifnecessary extends js.Object {
  var disconnect_if_necessary: js.UndefOr[Boolean] = js.native
}

object Disconnectifnecessary {
  @scala.inline
  def apply(): Disconnectifnecessary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disconnectifnecessary]
  }
  @scala.inline
  implicit class DisconnectifnecessaryOps[Self <: Disconnectifnecessary] (val x: Self) extends AnyVal {
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
    def setDisconnect_if_necessary(value: Boolean): Self = this.set("disconnect_if_necessary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisconnect_if_necessary: Self = this.set("disconnect_if_necessary", js.undefined)
  }
  
}

