package typings.reactGa.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimingArgs extends js.Object {
  var category: String = js.native
  var label: js.UndefOr[String] = js.native
  var value: Double = js.native
  var variable: String = js.native
}

object TimingArgs {
  @scala.inline
  def apply(category: String, value: Double, variable: String): TimingArgs = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimingArgs]
  }
  @scala.inline
  implicit class TimingArgsOps[Self <: TimingArgs] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariable(value: String): Self = this.set("variable", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
  }
  
}

