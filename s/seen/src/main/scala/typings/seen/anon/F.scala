package typings.seen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait F extends StObject {
  
  def f(f: Any): Any
  
  def v(v: Any): Any
}
object F {
  
  inline def apply(f: Any => Any, v: Any => Any): F = {
    val __obj = js.Dynamic.literal(f = js.Any.fromFunction1(f), v = js.Any.fromFunction1(v))
    __obj.asInstanceOf[F]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: F] (val x: Self) extends AnyVal {
    
    inline def setF(value: Any => Any): Self = StObject.set(x, "f", js.Any.fromFunction1(value))
    
    inline def setV(value: Any => Any): Self = StObject.set(x, "v", js.Any.fromFunction1(value))
  }
}
