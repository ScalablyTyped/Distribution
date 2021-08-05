package typings.rcMenu.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManualRef extends StObject {
  
  var manualRef: js.Function0[Unit]
  
  var onMouseEnter: js.Function0[Unit]
  
  var onMouseLeave: js.Function0[Unit]
  
  var onSelect: js.Function0[Unit]
}
object ManualRef {
  
  inline def apply(manualRef: () => Unit, onMouseEnter: () => Unit, onMouseLeave: () => Unit, onSelect: () => Unit): ManualRef = {
    val __obj = js.Dynamic.literal(manualRef = js.Any.fromFunction0(manualRef), onMouseEnter = js.Any.fromFunction0(onMouseEnter), onMouseLeave = js.Any.fromFunction0(onMouseLeave), onSelect = js.Any.fromFunction0(onSelect))
    __obj.asInstanceOf[ManualRef]
  }
  
  extension [Self <: ManualRef](x: Self) {
    
    inline def setManualRef(value: () => Unit): Self = StObject.set(x, "manualRef", js.Any.fromFunction0(value))
    
    inline def setOnMouseEnter(value: () => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction0(value))
    
    inline def setOnMouseLeave(value: () => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction0(value))
    
    inline def setOnSelect(value: () => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction0(value))
  }
}
