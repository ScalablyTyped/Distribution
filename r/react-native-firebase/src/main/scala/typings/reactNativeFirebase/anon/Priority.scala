package typings.reactNativeFirebase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Priority extends js.Object {
  @JSName(".priority")
  var Dotpriority: String | Double | Null = js.native
  @JSName(".value")
  var Dotvalue: js.Any = js.native
}

object Priority {
  @scala.inline
  def apply(Dotvalue: js.Any): Priority = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".value")(Dotvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Priority]
  }
  @scala.inline
  implicit class PriorityOps[Self <: Priority] (val x: Self) extends AnyVal {
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
    def setDotvalue(value: js.Any): Self = this.set(".value", value.asInstanceOf[js.Any])
    @scala.inline
    def setDotpriority(value: String | Double): Self = this.set(".priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setDotpriorityNull: Self = this.set(".priority", null)
  }
  
}

