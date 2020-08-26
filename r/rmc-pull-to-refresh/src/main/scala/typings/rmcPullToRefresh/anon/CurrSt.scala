package typings.rmcPullToRefresh.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrSt extends js.Object {
  var currSt: String = js.native
  var dragOnEdge: Boolean = js.native
}

object CurrSt {
  @scala.inline
  def apply(currSt: String, dragOnEdge: Boolean): CurrSt = {
    val __obj = js.Dynamic.literal(currSt = currSt.asInstanceOf[js.Any], dragOnEdge = dragOnEdge.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrSt]
  }
  @scala.inline
  implicit class CurrStOps[Self <: CurrSt] (val x: Self) extends AnyVal {
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
    def setCurrSt(value: String): Self = this.set("currSt", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragOnEdge(value: Boolean): Self = this.set("dragOnEdge", value.asInstanceOf[js.Any])
  }
  
}

