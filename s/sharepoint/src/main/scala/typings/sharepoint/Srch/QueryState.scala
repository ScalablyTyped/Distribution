package typings.sharepoint.Srch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryState extends js.Object {
  var e: Double = js.native
  var k: String = js.native
  var r: js.Array[RefinementCategory] = js.native
}

object QueryState {
  @scala.inline
  def apply(e: Double, k: String, r: js.Array[RefinementCategory]): QueryState = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryState]
  }
  @scala.inline
  implicit class QueryStateOps[Self <: QueryState] (val x: Self) extends AnyVal {
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
    def setE(value: Double): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def setK(value: String): Self = this.set("k", value.asInstanceOf[js.Any])
    @scala.inline
    def setRVarargs(value: RefinementCategory*): Self = this.set("r", js.Array(value :_*))
    @scala.inline
    def setR(value: js.Array[RefinementCategory]): Self = this.set("r", value.asInstanceOf[js.Any])
  }
  
}

