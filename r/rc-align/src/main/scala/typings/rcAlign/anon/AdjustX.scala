package typings.rcAlign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdjustX extends js.Object {
  var adjustX: js.UndefOr[Boolean | Double] = js.native
  var adjustY: js.UndefOr[Boolean | Double] = js.native
}

object AdjustX {
  @scala.inline
  def apply(): AdjustX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustX]
  }
  @scala.inline
  implicit class AdjustXOps[Self <: AdjustX] (val x: Self) extends AnyVal {
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
    def setAdjustX(value: Boolean | Double): Self = this.set("adjustX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustX: Self = this.set("adjustX", js.undefined)
    @scala.inline
    def setAdjustY(value: Boolean | Double): Self = this.set("adjustY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustY: Self = this.set("adjustY", js.undefined)
  }
  
}

