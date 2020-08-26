package typings.reactLazylog.scrollFollowMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollFollowProps extends js.Object {
  var startFollowing: js.UndefOr[Boolean] = js.native
  def render(props: ScrollFollowRenderProps): ReactNode = js.native
}

object ScrollFollowProps {
  @scala.inline
  def apply(render: ScrollFollowRenderProps => ReactNode): ScrollFollowProps = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[ScrollFollowProps]
  }
  @scala.inline
  implicit class ScrollFollowPropsOps[Self <: ScrollFollowProps] (val x: Self) extends AnyVal {
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
    def setRender(value: ScrollFollowRenderProps => ReactNode): Self = this.set("render", js.Any.fromFunction1(value))
    @scala.inline
    def setStartFollowing(value: Boolean): Self = this.set("startFollowing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartFollowing: Self = this.set("startFollowing", js.undefined)
  }
  
}

