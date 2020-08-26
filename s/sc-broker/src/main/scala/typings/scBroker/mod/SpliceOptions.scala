package typings.scBroker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpliceOptions extends js.Object {
  var count: js.UndefOr[Double] = js.native
  var getValue: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[Double] = js.native
  var items: js.UndefOr[js.Array[_]] = js.native
  var noAck: js.UndefOr[Boolean] = js.native
}

object SpliceOptions {
  @scala.inline
  def apply(): SpliceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpliceOptions]
  }
  @scala.inline
  implicit class SpliceOptionsOps[Self <: SpliceOptions] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setGetValue(value: Boolean): Self = this.set("getValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetValue: Self = this.set("getValue", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setNoAck(value: Boolean): Self = this.set("noAck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoAck: Self = this.set("noAck", js.undefined)
  }
  
}

