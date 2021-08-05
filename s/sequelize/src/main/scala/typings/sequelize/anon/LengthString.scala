package typings.sequelize.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LengthString extends StObject {
  
  var length: String
}
object LengthString {
  
  inline def apply(length: String): LengthString = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthString]
  }
  
  extension [Self <: LengthString](x: Self) {
    
    inline def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
