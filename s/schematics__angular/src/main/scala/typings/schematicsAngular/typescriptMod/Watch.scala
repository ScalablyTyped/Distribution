package typings.schematicsAngular.typescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Watch[T] extends StObject {
  
  /** Closes the watch */
  def close(): Unit
  
  /** Synchronize with host and get updated program */
  def getProgram(): T
}
object Watch {
  
  inline def apply[T](close: () => Unit, getProgram: () => T): Watch[T] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getProgram = js.Any.fromFunction0(getProgram))
    __obj.asInstanceOf[Watch[T]]
  }
  
  extension [Self <: Watch[?], T](x: Self & Watch[T]) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setGetProgram(value: () => T): Self = StObject.set(x, "getProgram", js.Any.fromFunction0(value))
  }
}
