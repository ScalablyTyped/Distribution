package typings.refArray

import org.scalablytyped.runtime.NumberDictionary
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dicti[T]
    extends StObject
       with /* i */ NumberDictionary[T] {
    
    var buffer: Buffer
    
    def inspect(): String
    
    var length: Double
    
    def ref(): Buffer
    
    def toArray(): js.Array[T]
    
    def toJSON(): js.Array[T]
  }
  object Dicti {
    
    @scala.inline
    def apply[T](
      buffer: Buffer,
      inspect: () => String,
      length: Double,
      ref: () => Buffer,
      toArray: () => js.Array[T],
      toJSON: () => js.Array[T]
    ): Dicti[T] = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), length = length.asInstanceOf[js.Any], ref = js.Any.fromFunction0(ref), toArray = js.Any.fromFunction0(toArray), toJSON = js.Any.fromFunction0(toJSON))
      __obj.asInstanceOf[Dicti[T]]
    }
    
    @scala.inline
    implicit class DictiMutableBuilder[Self <: Dicti[?], T] (val x: Self & Dicti[T]) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInspect(value: () => String): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: () => Buffer): Self = StObject.set(x, "ref", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToArray(value: () => js.Array[T]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToJSON(value: () => js.Array[T]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
    }
  }
}
