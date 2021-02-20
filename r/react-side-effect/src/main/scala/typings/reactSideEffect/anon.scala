package typings.reactSideEffect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Peek[TPeek, TRewind] extends StObject {
    
    def peek(): TPeek = js.native
    
    def rewind(): TRewind = js.native
  }
  object Peek {
    
    @scala.inline
    def apply[TPeek, TRewind](peek: () => TPeek, rewind: () => TRewind): Peek[TPeek, TRewind] = {
      val __obj = js.Dynamic.literal(peek = js.Any.fromFunction0(peek), rewind = js.Any.fromFunction0(rewind))
      __obj.asInstanceOf[Peek[TPeek, TRewind]]
    }
    
    @scala.inline
    implicit class PeekMutableBuilder[Self <: Peek[_, _], TPeek, TRewind] (val x: Self with (Peek[TPeek, TRewind])) extends AnyVal {
      
      @scala.inline
      def setPeek(value: () => TPeek): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRewind(value: () => TRewind): Self = StObject.set(x, "rewind", js.Any.fromFunction0(value))
    }
  }
}
