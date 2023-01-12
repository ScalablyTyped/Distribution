package typings.resizeObserverBrowser

import typings.resizeObserverBrowser.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var ResizeObserver: Instantiable
}
object Window {
  
  inline def apply(ResizeObserver: Instantiable): Window = {
    val __obj = js.Dynamic.literal(ResizeObserver = ResizeObserver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    inline def setResizeObserver(value: Instantiable): Self = StObject.set(x, "ResizeObserver", value.asInstanceOf[js.Any])
  }
}
