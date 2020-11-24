package typings.resizeObserverBrowser

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends js.Object {
  
  var ResizeObserver: Instantiable1[
    /* callback */ ResizeObserverCallback, 
    typings.resizeObserverBrowser.ResizeObserver
  ] = js.native
}
object Window {
  
  @scala.inline
  def apply(ResizeObserver: Instantiable1[/* callback */ ResizeObserverCallback, ResizeObserver]): Window = {
    val __obj = js.Dynamic.literal(ResizeObserver = ResizeObserver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    
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
    def setResizeObserver(value: Instantiable1[/* callback */ ResizeObserverCallback, ResizeObserver]): Self = this.set("ResizeObserver", value.asInstanceOf[js.Any])
  }
}
