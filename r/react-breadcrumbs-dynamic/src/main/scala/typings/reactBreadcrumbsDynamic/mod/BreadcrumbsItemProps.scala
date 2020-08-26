package typings.reactBreadcrumbsDynamic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreadcrumbsItemProps extends js.Object {
  var to: String = js.native
}

object BreadcrumbsItemProps {
  @scala.inline
  def apply(to: String): BreadcrumbsItemProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbsItemProps]
  }
  @scala.inline
  implicit class BreadcrumbsItemPropsOps[Self <: BreadcrumbsItemProps] (val x: Self) extends AnyVal {
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
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}

