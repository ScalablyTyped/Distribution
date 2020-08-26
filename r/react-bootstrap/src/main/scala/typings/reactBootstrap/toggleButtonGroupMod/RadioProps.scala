package typings.reactBootstrap.toggleButtonGroupMod

import typings.reactBootstrap.reactBootstrapStrings.radio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RadioProps extends js.Object {
  /** Required if `type` is set to "radio" */
  var name: String = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  var `type`: radio = js.native
}

object RadioProps {
  @scala.inline
  def apply(name: String, `type`: radio): RadioProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioProps]
  }
  @scala.inline
  implicit class RadioPropsOps[Self <: RadioProps] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: radio): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: /* value */ js.Any => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
  }
  
}

