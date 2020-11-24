package typings.reactHooksHelper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationProps extends js.Object {
  
  var go: js.UndefOr[js.Function1[/* step */ Double | String, Unit]] = js.native
  
  def next(): Unit = js.native
  
  var pause: js.UndefOr[js.Function0[Unit]] = js.native
  
  var play: js.UndefOr[js.Function0[Unit]] = js.native
  
  var previous: js.UndefOr[js.Function0[Unit]] = js.native
}
object NavigationProps {
  
  @scala.inline
  def apply(next: () => Unit): NavigationProps = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[NavigationProps]
  }
  
  @scala.inline
  implicit class NavigationPropsOps[Self <: NavigationProps] (val x: Self) extends AnyVal {
    
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
    def setNext(value: () => Unit): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGo(value: /* step */ Double | String => Unit): Self = this.set("go", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGo: Self = this.set("go", js.undefined)
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("play", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
    
    @scala.inline
    def setPrevious(value: () => Unit): Self = this.set("previous", js.Any.fromFunction0(value))
    
    @scala.inline
    def deletePrevious: Self = this.set("previous", js.undefined)
  }
}
