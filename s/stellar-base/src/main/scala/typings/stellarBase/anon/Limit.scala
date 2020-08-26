package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Limit extends js.Object {
  var limit: Int64 = js.native
  var line: typings.stellarBase.xdrMod.xdr.Asset = js.native
}

object Limit {
  @scala.inline
  def apply(limit: Int64, line: typings.stellarBase.xdrMod.xdr.Asset): Limit = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
  @scala.inline
  implicit class LimitOps[Self <: Limit] (val x: Self) extends AnyVal {
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
    def setLimit(value: Int64): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: typings.stellarBase.xdrMod.xdr.Asset): Self = this.set("line", value.asInstanceOf[js.Any])
  }
  
}

