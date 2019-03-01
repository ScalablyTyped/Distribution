package typings
package reactDashLazylogLib.buildScrollFollowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollFollowProps extends js.Object {
  var startFollowing: js.UndefOr[scala.Boolean] = js.undefined
  def render(props: ScrollFollowRenderProps): reactLib.reactMod.ReactNs.ReactNode
}

object ScrollFollowProps {
  @scala.inline
  def apply(
    render: js.Function1[ScrollFollowRenderProps, reactLib.reactMod.ReactNs.ReactNode],
    startFollowing: js.UndefOr[scala.Boolean] = js.undefined
  ): ScrollFollowProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("render")(render)
    if (!js.isUndefined(startFollowing)) __obj.updateDynamic("startFollowing")(startFollowing)
    __obj.asInstanceOf[ScrollFollowProps]
  }
}

