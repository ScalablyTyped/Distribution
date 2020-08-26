package typings.reactBootstrap.toggleButtonGroupMod

import typings.reactBootstrap.reactBootstrapStrings.checkbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxProps extends js.Object {
  var name: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[js.Function1[/* values */ js.Array[_], Unit]] = js.native
  var `type`: checkbox = js.native
}

object CheckboxProps {
  @scala.inline
  def apply(`type`: checkbox): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxProps]
  }
  @scala.inline
  implicit class CheckboxPropsOps[Self <: CheckboxProps] (val x: Self) extends AnyVal {
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
    def setType(value: checkbox): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnChange(value: /* values */ js.Array[_] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
  }
  
}

