package typings.sharepoint.SP.UI

import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagingControl extends js.Object {
  
  def getButtonState(buttonId: Double): Double = js.native
  
  def get_innerContent(): HTMLSpanElement = js.native
  
  def get_innerContentClass(): String = js.native
  
  def onNext(): Unit = js.native
  
  /**Should override*/
  def onPrev(): Unit = js.native
  
  def onWindowResized(): Unit = js.native
  
  def postRender(): Unit = js.native
  
  def render(innerContent: String): String = js.native
  
  def setButtonState(buttonId: Double, state: Double): Unit = js.native
}
object PagingControl {
  
  @scala.inline
  def apply(
    getButtonState: Double => Double,
    get_innerContent: () => HTMLSpanElement,
    get_innerContentClass: () => String,
    onNext: () => Unit,
    onPrev: () => Unit,
    onWindowResized: () => Unit,
    postRender: () => Unit,
    render: String => String,
    setButtonState: (Double, Double) => Unit
  ): PagingControl = {
    val __obj = js.Dynamic.literal(getButtonState = js.Any.fromFunction1(getButtonState), get_innerContent = js.Any.fromFunction0(get_innerContent), get_innerContentClass = js.Any.fromFunction0(get_innerContentClass), onNext = js.Any.fromFunction0(onNext), onPrev = js.Any.fromFunction0(onPrev), onWindowResized = js.Any.fromFunction0(onWindowResized), postRender = js.Any.fromFunction0(postRender), render = js.Any.fromFunction1(render), setButtonState = js.Any.fromFunction2(setButtonState))
    __obj.asInstanceOf[PagingControl]
  }
  
  @scala.inline
  implicit class PagingControlOps[Self <: PagingControl] (val x: Self) extends AnyVal {
    
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
    def setGetButtonState(value: Double => Double): Self = this.set("getButtonState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet_innerContent(value: () => HTMLSpanElement): Self = this.set("get_innerContent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_innerContentClass(value: () => String): Self = this.set("get_innerContentClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnNext(value: () => Unit): Self = this.set("onNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPrev(value: () => Unit): Self = this.set("onPrev", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnWindowResized(value: () => Unit): Self = this.set("onWindowResized", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPostRender(value: () => Unit): Self = this.set("postRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRender(value: String => String): Self = this.set("render", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetButtonState(value: (Double, Double) => Unit): Self = this.set("setButtonState", js.Any.fromFunction2(value))
  }
}
