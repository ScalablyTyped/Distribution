package typings.sigmajs.SigmaJs

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGObject[T] extends StObject {
  
  def create(`object`: T, a: Any*): Element
  
  def update(`object`: T, a: Any*): Unit
}
object SVGObject {
  
  inline def apply[T](create: (T, /* repeated */ Any) => Element, update: (T, /* repeated */ Any) => Unit): SVGObject[T] = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[SVGObject[T]]
  }
  
  extension [Self <: SVGObject[?], T](x: Self & SVGObject[T]) {
    
    inline def setCreate(value: (T, /* repeated */ Any) => Element): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setUpdate(value: (T, /* repeated */ Any) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
