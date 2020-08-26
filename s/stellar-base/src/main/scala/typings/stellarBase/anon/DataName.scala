package typings.stellarBase.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataName extends js.Object {
  var dataName: String | Buffer = js.native
  var dataValue: Null | Buffer = js.native
}

object DataName {
  @scala.inline
  def apply(dataName: String | Buffer): DataName = {
    val __obj = js.Dynamic.literal(dataName = dataName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataName]
  }
  @scala.inline
  implicit class DataNameOps[Self <: DataName] (val x: Self) extends AnyVal {
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
    def setDataName(value: String | Buffer): Self = this.set("dataName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataValue(value: Buffer): Self = this.set("dataValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataValueNull: Self = this.set("dataValue", null)
  }
  
}

