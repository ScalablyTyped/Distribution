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
    onScroll: reactDashLazylogLib.Anon_ClientHeight => scala.Unit,
    startFollowing: () => scala.Unit,
    stopFollowing: () => scala.Unit
  ): ScrollFollowRenderProps = {
    val __obj = js.Dynamic.literal(follow = follow, onScroll = js.Any.fromFunction1(onScroll), startFollowing = js.Any.fromFunction0(startFollowing), stopFollowing = js.Any.fromFunction0(stopFollowing))
  
    __obj.asInstanceOf[ScrollFollowRenderProps]
  }
}

