package typings.seen.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait F extends StObject {
  
  def f(f: js.Any): js.Any
  
  def v(v: js.Any): js.Any
}
object F {
  
  inline def apply(f: js.Any => js.Any, v: js.Any => js.Any): F = {
    val __obj = js.Dynamic.literal(f = js.Any.fromFunction1(f), v = js.Any.fromFunction1(v))
    __obj.asInstanceOf[F]
  }
  
  extension [Self <: F](x: Self) {
    
    inline def setF(value: js.Any => js.Any): Self = StObject.set(x, "f", js.Any.fromFunction1(value))
    
    inline def setV(value: js.Any => js.Any): Self = StObject.set(x, "v", js.Any.fromFunction1(value))
  }
}
