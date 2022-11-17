package typings.std.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  /* standard dom */
  var mode: "byob"
}
object Mode {
  
  inline def apply(): Mode = {
    val __obj = js.Dynamic.literal(mode = "byob")
    __obj.asInstanceOf[Mode]
  }
  
  extension [Self <: Mode](x: Self) {
    
    inline def setMode(value: "byob"): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
