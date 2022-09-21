package typings.redisClient

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  trait Composer[T] extends StObject {
    
    def end(buffer: Buffer): T
    
    def reset(): Unit
    
    def write(buffer: Buffer): Unit
  }
  object Composer {
    
    inline def apply[T](end: Buffer => T, reset: () => Unit, write: Buffer => Unit): Composer[T] = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), reset = js.Any.fromFunction0(reset), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Composer[T]]
    }
    
    extension [Self <: Composer[?], T](x: Self & Composer[T]) {
      
      inline def setEnd(value: Buffer => T): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setWrite(value: Buffer => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
