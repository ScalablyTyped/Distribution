package typings.slimerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Std extends StObject {
  
  def read(): Any
  
  def write(arg: Any): Unit
}
object Std {
  
  inline def apply(read: () => Any, write: Any => Unit): Std = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction0(read), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Std]
  }
  
  extension [Self <: Std](x: Self) {
    
    inline def setRead(value: () => Any): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
    
    inline def setWrite(value: Any => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
