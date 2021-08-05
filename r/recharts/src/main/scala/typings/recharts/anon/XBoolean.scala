package typings.recharts.anon

import typings.recharts.mod.AllowEscapeViewBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XBoolean
  extends StObject
     with AllowEscapeViewBox {
  
  var x: Boolean
}
object XBoolean {
  
  inline def apply(x: Boolean): XBoolean = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[XBoolean]
  }
  
  extension [Self <: XBoolean](x: Self) {
    
    inline def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
  }
}
