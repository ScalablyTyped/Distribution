package typings.recharts.anon

import typings.recharts.mod.AllowEscapeViewBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X
  extends StObject
     with AllowEscapeViewBox {
  
  var x: Boolean
}
object X {
  
  inline def apply(x: Boolean): X = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
  
  extension [Self <: X](x: Self) {
    
    inline def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
