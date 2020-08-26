package typings.screeps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZK extends js.Object {
  var ZK: typings.screeps.screepsStrings.G = js.native
}

object ZK {
  @scala.inline
  def apply(ZK: typings.screeps.screepsStrings.G): ZK = {
    val __obj = js.Dynamic.literal(ZK = ZK.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZK]
  }
  @scala.inline
  implicit class ZKOps[Self <: ZK] (val x: Self) extends AnyVal {
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
    def setZK(value: typings.screeps.screepsStrings.G): Self = this.set("ZK", value.asInstanceOf[js.Any])
  }
  
}

