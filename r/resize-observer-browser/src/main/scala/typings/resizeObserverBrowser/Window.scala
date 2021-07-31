package typings.resizeObserverBrowser

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var ResizeObserver: Instantiable1[
    /* callback */ ResizeObserverCallback, 
    typings.resizeObserverBrowser.ResizeObserver
  ]
}
object Window {
  
  @scala.inline
  def apply(ResizeObserver: Instantiable1[/* callback */ ResizeObserverCallback, ResizeObserver]): Window = {
    val __obj = js.Dynamic.literal(ResizeObserver = ResizeObserver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResizeObserver(value: Instantiable1[/* callback */ ResizeObserverCallback, ResizeObserver]): Self = StObject.set(x, "ResizeObserver", value.asInstanceOf[js.Any])
  }
}
