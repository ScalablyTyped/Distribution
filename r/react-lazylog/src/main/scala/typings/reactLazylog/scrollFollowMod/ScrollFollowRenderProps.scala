package typings.reactLazylog.scrollFollowMod

import typings.reactLazylog.anon.ClientHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollFollowRenderProps extends js.Object {
  
  var follow: Boolean = js.native
  
  def onScroll(args: ClientHeight): Unit = js.native
  
  def startFollowing(): Unit = js.native
  
  def stopFollowing(): Unit = js.native
}
object ScrollFollowRenderProps {
  
  @scala.inline
  def apply(
    follow: Boolean,
    onScroll: ClientHeight => Unit,
    startFollowing: () => Unit,
    stopFollowing: () => Unit
  ): ScrollFollowRenderProps = {
    val __obj = js.Dynamic.literal(follow = follow.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1(onScroll), startFollowing = js.Any.fromFunction0(startFollowing), stopFollowing = js.Any.fromFunction0(stopFollowing))
    __obj.asInstanceOf[ScrollFollowRenderProps]
  }
  
  @scala.inline
  implicit class ScrollFollowRenderPropsOps[Self <: ScrollFollowRenderProps] (val x: Self) extends AnyVal {
    
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
    def setFollow(value: Boolean): Self = this.set("follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnScroll(value: ClientHeight => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartFollowing(value: () => Unit): Self = this.set("startFollowing", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopFollowing(value: () => Unit): Self = this.set("stopFollowing", js.Any.fromFunction0(value))
  }
}
