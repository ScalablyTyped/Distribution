package typings.stencilCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ts extends StObject {
  
  var ts: Any
}
object Ts {
  
  inline def apply(ts: Any): Ts = {
    val __obj = js.Dynamic.literal(ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ts]
  }
  
  extension [Self <: Ts](x: Self) {
    
    inline def setTs(value: Any): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
  }
}
