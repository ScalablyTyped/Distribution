package typings.sharepoint.SP.UI

import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PagingControl extends StObject {
  
  def getButtonState(buttonId: Double): Double
  
  def get_innerContent(): HTMLSpanElement
  
  def get_innerContentClass(): String
  
  def onNext(): Unit
  
  /**Should override*/
  def onPrev(): Unit
  
  def onWindowResized(): Unit
  
  def postRender(): Unit
  
  def render(innerContent: String): String
  
  def setButtonState(buttonId: Double, state: Double): Unit
}
object PagingControl {
  
  inline def apply(
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
  
  extension [Self <: PagingControl](x: Self) {
    
    inline def setGetButtonState(value: Double => Double): Self = StObject.set(x, "getButtonState", js.Any.fromFunction1(value))
    
    inline def setGet_innerContent(value: () => HTMLSpanElement): Self = StObject.set(x, "get_innerContent", js.Any.fromFunction0(value))
    
    inline def setGet_innerContentClass(value: () => String): Self = StObject.set(x, "get_innerContentClass", js.Any.fromFunction0(value))
    
    inline def setOnNext(value: () => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction0(value))
    
    inline def setOnPrev(value: () => Unit): Self = StObject.set(x, "onPrev", js.Any.fromFunction0(value))
    
    inline def setOnWindowResized(value: () => Unit): Self = StObject.set(x, "onWindowResized", js.Any.fromFunction0(value))
    
    inline def setPostRender(value: () => Unit): Self = StObject.set(x, "postRender", js.Any.fromFunction0(value))
    
    inline def setRender(value: String => String): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    
    inline def setSetButtonState(value: (Double, Double) => Unit): Self = StObject.set(x, "setButtonState", js.Any.fromFunction2(value))
  }
}
