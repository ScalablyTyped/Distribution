package typings.slimerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Std extends StObject {
  
  def read(): js.Any
  
  def write(arg: js.Any): Unit
}
object Std {
  
  inline def apply(read: () => js.Any, write: js.Any => Unit): Std = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Std]
  }
  
  extension [Self <: Std](x: Self) {
    
    inline def setRead(value: () => js.Any): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    
    inline def setWrite(value: js.Any => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
