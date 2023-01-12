package typings.std.anon

import typings.std.stdStrings.byob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  /* standard dom */
  var mode: byob
}
object Mode {
  
  inline def apply(): Mode = {
    val __obj = js.Dynamic.literal(mode = "byob")
    __obj.asInstanceOf[Mode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
    
    inline def setMode(value: byob): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
