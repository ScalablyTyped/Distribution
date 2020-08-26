package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.SequenceNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BumpTo extends js.Object {
  var bumpTo: SequenceNumber = js.native
}

object BumpTo {
  @scala.inline
  def apply(bumpTo: SequenceNumber): BumpTo = {
    val __obj = js.Dynamic.literal(bumpTo = bumpTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BumpTo]
  }
  @scala.inline
  implicit class BumpToOps[Self <: BumpTo] (val x: Self) extends AnyVal {
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
    def setBumpTo(value: SequenceNumber): Self = this.set("bumpTo", value.asInstanceOf[js.Any])
  }
  
}

