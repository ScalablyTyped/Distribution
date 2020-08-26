package typings.reactstrap.collapseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UncontrolledCollapseProps extends CollapseProps {
  var defaultOpen: js.UndefOr[Boolean] = js.native
  var toggleEvents: js.UndefOr[js.Array[String]] = js.native
  var toggler: String = js.native
}

object UncontrolledCollapseProps {
  @scala.inline
  def apply(toggler: String): UncontrolledCollapseProps = {
    val __obj = js.Dynamic.literal(toggler = toggler.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncontrolledCollapseProps]
  }
  @scala.inline
  implicit class UncontrolledCollapsePropsOps[Self <: UncontrolledCollapseProps] (val x: Self) extends AnyVal {
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
    def setToggler(value: String): Self = this.set("toggler", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultOpen(value: Boolean): Self = this.set("defaultOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOpen: Self = this.set("defaultOpen", js.undefined)
    @scala.inline
    def setToggleEventsVarargs(value: String*): Self = this.set("toggleEvents", js.Array(value :_*))
    @scala.inline
    def setToggleEvents(value: js.Array[String]): Self = this.set("toggleEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggleEvents: Self = this.set("toggleEvents", js.undefined)
  }
  
}

