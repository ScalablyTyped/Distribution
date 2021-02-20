package typings.sigmajs.SigmaJs

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Renderer extends StObject {
  
  var container: HTMLElement = js.native
  
  def refresh(): Sigma = js.native
  
  def render(): Sigma = js.native
  
  def resize(): Sigma = js.native
  
  def settings(settings: Settings): Unit = js.native
}
object Renderer {
  
  @scala.inline
  def apply(
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
  implicit class RendererMutableBuilder[Self <: Renderer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Sigma): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRender(value: () => Sigma): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResize(value: () => Sigma): Self = StObject.set(x, "resize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSettings(value: Settings => Unit): Self = StObject.set(x, "settings", js.Any.fromFunction1(value))
  }
}
