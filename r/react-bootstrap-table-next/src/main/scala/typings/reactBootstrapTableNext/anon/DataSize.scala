package typings.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSize extends js.Object {
  var dataSize: Double = js.native
}

object DataSize {
  @scala.inline
  def apply(dataSize: Double): DataSize = {
    val __obj = js.Dynamic.literal(dataSize = dataSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSize]
  }
  @scala.inline
  implicit class DataSizeOps[Self <: DataSize] (val x: Self) extends AnyVal {
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
    def setDataSize(value: Double): Self = this.set("dataSize", value.asInstanceOf[js.Any])
  }
  
}

