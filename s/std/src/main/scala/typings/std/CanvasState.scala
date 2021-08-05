package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasState extends StObject {
  
  def restore(): Unit
  
  def save(): Unit
}
object CanvasState {
  
  inline def apply(restore: () => Unit, save: () => Unit): CanvasState = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction0(restore), save = js.Any.fromFunction0(save))
    __obj.asInstanceOf[CanvasState]
  }
  
  extension [Self <: CanvasState](x: Self) {
    
    inline def setRestore(value: () => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction0(value))
    
    inline def setSave(value: () => Unit): Self = StObject.set(x, "save", js.Any.fromFunction0(value))
  }
}
