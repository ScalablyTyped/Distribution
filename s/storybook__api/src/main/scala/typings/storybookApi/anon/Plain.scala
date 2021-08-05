package typings.storybookApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plain extends StObject {
  
  var plain: String
}
object Plain {
  
  inline def apply(plain: String): Plain = {
    val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plain]
  }
  
  extension [Self <: Plain](x: Self) {
    
    inline def setPlain(value: String): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
  }
}
