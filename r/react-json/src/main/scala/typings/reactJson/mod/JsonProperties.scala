package typings.reactJson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonProperties extends js.Object {
  var onChange: js.UndefOr[OnChangeHandler] = js.native
  var value: js.Any = js.native
}

object JsonProperties {
  @scala.inline
  def apply(value: js.Any): JsonProperties = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonProperties]
  }
  @scala.inline
  implicit class JsonPropertiesOps[Self <: JsonProperties] (val x: Self) extends AnyVal {
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
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: /* value */ js.Any => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
  }
  
}

