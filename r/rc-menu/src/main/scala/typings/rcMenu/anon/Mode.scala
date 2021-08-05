package typings.rcMenu.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  var manualRef: js.Function0[Unit]
  
  var mode: String
  
  var onMouseEnter: js.Function0[Unit]
  
  var onMouseLeave: js.Function0[Unit]
  
  var onTitleClick: js.Function0[Unit]
  
  var onTitleMouseEnter: js.Function0[Unit]
  
  var onTitleMouseLeave: js.Function0[Unit]
  
  var title: String
}
object Mode {
  
  inline def apply(
    manualRef: () => Unit,
    mode: String,
    onMouseEnter: () => Unit,
    onMouseLeave: () => Unit,
    onTitleClick: () => Unit,
    onTitleMouseEnter: () => Unit,
    onTitleMouseLeave: () => Unit,
    title: String
  ): Mode = {
    val __obj = js.Dynamic.literal(manualRef = js.Any.fromFunction0(manualRef), mode = mode.asInstanceOf[js.Any], onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave), onTitleClick = js.Any.fromFunction0(onTitleClick), onTitleMouseEnter = js.Any.fromFunction0(onTitleMouseEnter), onTitleMouseLeave = js.Any.fromFunction0(onTitleMouseLeave), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  extension [Self <: Mode](x: Self) {
    
    inline def setManualRef(value: () => Unit): Self = StObject.set(x, "manualRef", js.Any.fromFunction0(value))
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOnMouseEnter(value: () => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction0(value))
    
    inline def setOnMouseLeave(value: () => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction0(value))
    
    inline def setOnTitleClick(value: () => Unit): Self = StObject.set(x, "onTitleClick", js.Any.fromFunction0(value))
    
    inline def setOnTitleMouseEnter(value: () => Unit): Self = StObject.set(x, "onTitleMouseEnter", js.Any.fromFunction0(value))
    
    inline def setOnTitleMouseLeave(value: () => Unit): Self = StObject.set(x, "onTitleMouseLeave", js.Any.fromFunction0(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
