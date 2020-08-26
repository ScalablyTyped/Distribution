package typings.rcSelect.anon

import typings.rcSelect.generatorMod.RawValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovedValue[P /* <: RawValueType | js.Object */] extends js.Object {
  var removedValue: P = js.native
  var values: js.Array[P] = js.native
}

object RemovedValue {
  @scala.inline
  def apply[/* <: typings.rcSelect.generatorMod.RawValueType | js.Object */ P](removedValue: P, values: js.Array[P]): RemovedValue[P] = {
    val __obj = js.Dynamic.literal(removedValue = removedValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovedValue[P]]
  }
  @scala.inline
  implicit class RemovedValueOps[Self <: RemovedValue[_], /* <: typings.rcSelect.generatorMod.RawValueType | js.Object */ P] (val x: Self with RemovedValue[P]) extends AnyVal {
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
    def setRemovedValue(value: P): Self = this.set("removedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: P*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[P]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

