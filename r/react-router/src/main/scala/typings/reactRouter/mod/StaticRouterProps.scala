package typings.reactRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticRouterProps extends js.Object {
  var basename: js.UndefOr[String] = js.native
  var context: js.UndefOr[StaticRouterContext] = js.native
  var location: js.UndefOr[String | js.Object] = js.native
}

object StaticRouterProps {
  @scala.inline
  def apply(): StaticRouterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticRouterProps]
  }
  @scala.inline
  implicit class StaticRouterPropsOps[Self <: StaticRouterProps] (val x: Self) extends AnyVal {
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
    def setBasename(value: String): Self = this.set("basename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasename: Self = this.set("basename", js.undefined)
    @scala.inline
    def setContext(value: StaticRouterContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setLocation(value: String | js.Object): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
  
}

