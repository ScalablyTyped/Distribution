package typings.reactBreadcrumbs.mod

import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import typings.reactBreadcrumbs.anon.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreadcrumbProps extends js.Object {
  var data: LocationDescriptor[LocationState] with Title = js.native
  var hidden: js.UndefOr[Boolean] = js.native
}

object BreadcrumbProps {
  @scala.inline
  def apply(data: LocationDescriptor[LocationState] with Title): BreadcrumbProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbProps]
  }
  @scala.inline
  implicit class BreadcrumbPropsOps[Self <: BreadcrumbProps] (val x: Self) extends AnyVal {
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
    def setData(value: LocationDescriptor[LocationState] with Title): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
  }
  
}

