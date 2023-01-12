package typings.restartHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var ResizeObserver: typings.restartHooks.ResizeObserver
}
object Window {
  
  inline def apply(ResizeObserver: ResizeObserver): Window = {
    val __obj = js.Dynamic.literal(ResizeObserver = ResizeObserver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    inline def setResizeObserver(value: ResizeObserver): Self = StObject.set(x, "ResizeObserver", value.asInstanceOf[js.Any])
  }
}
