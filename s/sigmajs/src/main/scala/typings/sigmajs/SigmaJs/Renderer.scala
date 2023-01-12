package typings.sigmajs.SigmaJs

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Renderer extends StObject {
  
  var container: HTMLElement
  
  def refresh(): Sigma
  
  def render(): Sigma
  
  def resize(): Sigma
  
  def settings(settings: Settings): Unit
}
object Renderer {
  
  inline def apply(
    container: HTMLElement,
    refresh: () => Sigma,
    render: () => Sigma,
    resize: () => Sigma,
    settings: Settings => Unit
  ): Renderer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh), render = js.Any.fromFunction0(render), resize = js.Any.fromFunction0(resize), settings = js.Any.fromFunction1(settings))
    __obj.asInstanceOf[Renderer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Renderer] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: () => Sigma): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    inline def setRender(value: () => Sigma): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    
    inline def setResize(value: () => Sigma): Self = StObject.set(x, "resize", js.Any.fromFunction0(value))
    
    inline def setSettings(value: Settings => Unit): Self = StObject.set(x, "settings", js.Any.fromFunction1(value))
  }
}
