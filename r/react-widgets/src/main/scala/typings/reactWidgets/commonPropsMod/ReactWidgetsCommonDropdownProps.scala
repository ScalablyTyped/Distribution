package typings.reactWidgets.commonPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactWidgetsCommonDropdownProps extends ReactWidgetsCommonProps {
  /**
    * Show "drop up" not "drop down"
    * @default false
    */
  var dropUp: js.UndefOr[Boolean] = js.native
}

object ReactWidgetsCommonDropdownProps {
  @scala.inline
  def apply(): ReactWidgetsCommonDropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactWidgetsCommonDropdownProps]
  }
  @scala.inline
  implicit class ReactWidgetsCommonDropdownPropsOps[Self <: ReactWidgetsCommonDropdownProps] (val x: Self) extends AnyVal {
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
    def setDropUp(value: Boolean): Self = this.set("dropUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropUp: Self = this.set("dropUp", js.undefined)
  }
  
}

