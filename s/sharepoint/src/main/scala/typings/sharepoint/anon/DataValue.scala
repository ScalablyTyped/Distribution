package typings.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataValue extends js.Object {
  var dataValue: js.Any = js.native
  var isValid: Boolean = js.native
  var normalizedLocValue: String = js.native
}

object DataValue {
  @scala.inline
  def apply(dataValue: js.Any, isValid: Boolean, normalizedLocValue: String): DataValue = {
    val __obj = js.Dynamic.literal(dataValue = dataValue.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], normalizedLocValue = normalizedLocValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValue]
  }
  @scala.inline
  implicit class DataValueOps[Self <: DataValue] (val x: Self) extends AnyVal {
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
    def setDataValue(value: js.Any): Self = this.set("dataValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalizedLocValue(value: String): Self = this.set("normalizedLocValue", value.asInstanceOf[js.Any])
  }
  
}

