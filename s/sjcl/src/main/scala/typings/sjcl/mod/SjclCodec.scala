package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ________________________________________________________________________
trait SjclCodec[T] extends StObject {
  
  def fromBits(bits: BitArray_): T
  
  def toBits(value: T): BitArray_
}
object SjclCodec {
  
  inline def apply[T](fromBits: BitArray_ => T, toBits: T => BitArray_): SjclCodec[T] = {
    val __obj = js.Dynamic.literal(fromBits = js.Any.fromFunction1(fromBits), toBits = js.Any.fromFunction1(toBits))
    __obj.asInstanceOf[SjclCodec[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SjclCodec[?], T] (val x: Self & SjclCodec[T]) extends AnyVal {
    
    inline def setFromBits(value: BitArray_ => T): Self = StObject.set(x, "fromBits", js.Any.fromFunction1(value))
    
    inline def setToBits(value: T => BitArray_): Self = StObject.set(x, "toBits", js.Any.fromFunction1(value))
  }
}
