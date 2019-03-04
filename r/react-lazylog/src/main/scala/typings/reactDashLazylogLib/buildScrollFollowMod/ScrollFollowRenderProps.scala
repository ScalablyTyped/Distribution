package typings
package reactDashLazylogLib.buildScrollFollowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollFollowRenderProps extends js.Object {
  var follow: scala.Boolean
  def onScroll(args: reactDashLazylogLib.Anon_ClientHeight): scala.Unit
  def startFollowing(): scala.Unit
  def stopFollowing(): scala.Unit
}

object ScrollFollowRenderProps {
  @scala.inline
  def apply(
    follow: scala.Boolean,
    onScroll: js.Function1[reactDashLazylogLib.Anon_ClientHeight, scala.Unit],
    startFollowing: js.Function0[scala.Unit],
    stopFollowing: js.Function0[scala.Unit]
  ): ScrollFollowRenderProps = {
    val __obj = js.Dynamic.literal(follow = follow, onScroll = onScroll, startFollowing = startFollowing, stopFollowing = stopFollowing)
  
    __obj.asInstanceOf[ScrollFollowRenderProps]
  }
}

