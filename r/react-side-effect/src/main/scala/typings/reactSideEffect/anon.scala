package typings.reactSideEffect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Peek[TPeek, TRewind] extends StObject {
    
    def peek(): TPeek
    
    def rewind(): TRewind
  }
  object Peek {
    
    inline def apply[TPeek, TRewind](peek: () => TPeek, rewind: () => TRewind): Peek[TPeek, TRewind] = {
      val __obj = js.Dynamic.literal(peek = js.Any.fromFunction0(peek), rewind = js.Any.fromFunction0(rewind))
      __obj.asInstanceOf[Peek[TPeek, TRewind]]
    }
    
    extension [Self <: Peek[?, ?], TPeek, TRewind](x: Self & (Peek[TPeek, TRewind])) {
      
      inline def setPeek(value: () => TPeek): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
      
      inline def setRewind(value: () => TRewind): Self = StObject.set(x, "rewind", js.Any.fromFunction0(value))
    }
  }
}
