package typings.quadstore.distCjsTypesMod

import typings.rdfjsTypes.dataModelMod.DataFactory
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TermReader[T /* <: Term */] extends StObject {
  
  def read(key: String, state: ReadingState, factory: DataFactory[Quad, Quad], prefixes: Prefixes): T
}
object TermReader {
  
  inline def apply[T /* <: Term */](read: (String, ReadingState, DataFactory[Quad, Quad], Prefixes) => T): TermReader[T] = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction4(read))
    __obj.asInstanceOf[TermReader[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TermReader[?], T /* <: Term */] (val x: Self & TermReader[T]) extends AnyVal {
    
    inline def setRead(value: (String, ReadingState, DataFactory[Quad, Quad], Prefixes) => T): Self = StObject.set(x, "read", js.Any.fromFunction4(value))
  }
}
