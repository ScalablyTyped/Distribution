package typings.reactDashLazylog.buildScrollFollowMod

import typings.reactDashLazylog.Anon_ClientHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollFollowRenderProps extends js.Object {
  var follow: Boolean
  def onScroll(args: Anon_ClientHeight): Unit
  def startFollowing(): Unit
  def stopFollowing(): Unit
}

object ScrollFollowRenderProps {
  @scala.inline
  def apply(
    follow: Boolean,
    onScroll: Anon_ClientHeight => Unit,
    startFollowing: () => Unit,
    stopFollowing: () => Unit
  ): ScrollFollowRenderProps = {
    val __obj = js.Dynamic.literal(follow = follow, onScroll = js.Any.fromFunction1(onScroll), startFollowing = js.Any.fromFunction0(startFollowing), stopFollowing = js.Any.fromFunction0(stopFollowing))
  
    __obj.asInstanceOf[ScrollFollowRenderProps]
  }
}

