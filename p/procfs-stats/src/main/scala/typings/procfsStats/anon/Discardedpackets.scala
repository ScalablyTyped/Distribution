package typings.procfsStats.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Discardedpackets extends js.Object {
  var `Discarded packets`: String = js.native
}

object Discardedpackets {
  @scala.inline
  def apply(`Discarded packets`: String): Discardedpackets = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Discarded packets")((`Discarded packets`).asInstanceOf[js.Any])
    __obj.asInstanceOf[Discardedpackets]
  }
  @scala.inline
  implicit class DiscardedpacketsOps[Self <: Discardedpackets] (val x: Self) extends AnyVal {
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
    def `setDiscarded packets`(value: String): Self = this.set("Discarded packets", value.asInstanceOf[js.Any])
  }
  
}

