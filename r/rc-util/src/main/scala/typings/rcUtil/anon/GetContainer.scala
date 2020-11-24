package typings.rcUtil.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetContainer extends js.Object {
  
  def getContainer(): HTMLElement = js.native
  
  def getOpenCount(): Double = js.native
  
  var ref: js.UndefOr[js.Function1[/* c */ js.Any, Unit]] = js.native
  
  def switchScrollingEffect(): Unit = js.native
}
object GetContainer {
  
  @scala.inline
  def apply(getContainer: () => HTMLElement, getOpenCount: () => Double, switchScrollingEffect: () => Unit): GetContainer = {
    val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction0(getContainer), getOpenCount = js.Any.fromFunction0(getOpenCount), switchScrollingEffect = js.Any.fromFunction0(switchScrollingEffect))
    __obj.asInstanceOf[GetContainer]
  }
  
  @scala.inline
  implicit class GetContainerOps[Self <: GetContainer] (val x: Self) extends AnyVal {
    
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
    def setGetContainer(value: () => HTMLElement): Self = this.set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOpenCount(value: () => Double): Self = this.set("getOpenCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSwitchScrollingEffect(value: () => Unit): Self = this.set("switchScrollingEffect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRef(value: /* c */ js.Any => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
  }
}
