package typings.recurlyRecurlyJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataCollector extends js.Object {
  var dataCollector: js.UndefOr[Boolean] = js.native
}

object DataCollector {
  @scala.inline
  def apply(): DataCollector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataCollector]
  }
  @scala.inline
  implicit class DataCollectorOps[Self <: DataCollector] (val x: Self) extends AnyVal {
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
    def setDataCollector(value: Boolean): Self = this.set("dataCollector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataCollector: Self = this.set("dataCollector", js.undefined)
  }
  
}

