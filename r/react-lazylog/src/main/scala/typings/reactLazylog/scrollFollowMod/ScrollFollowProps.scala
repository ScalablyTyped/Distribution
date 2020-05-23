package typings.reactLazylog.scrollFollowMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollFollowProps extends js.Object {
  var startFollowing: js.UndefOr[Boolean] = js.undefined
  def render(props: ScrollFollowRenderProps): ReactNode
}

object ScrollFollowProps {
  @scala.inline
  def apply(render: ScrollFollowRenderProps => ReactNode, startFollowing: js.UndefOr[Boolean] = js.undefined): ScrollFollowProps = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    if (!js.isUndefined(startFollowing)) __obj.updateDynamic("startFollowing")(startFollowing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollFollowProps]
  }
}

