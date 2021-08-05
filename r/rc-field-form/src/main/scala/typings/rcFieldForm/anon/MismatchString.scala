package typings.rcFieldForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MismatchString extends StObject {
  
  var mismatch: String
}
object MismatchString {
  
  inline def apply(mismatch: String): MismatchString = {
    val __obj = js.Dynamic.literal(mismatch = mismatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[MismatchString]
  }
  
  extension [Self <: MismatchString](x: Self) {
    
    inline def setMismatch(value: String): Self = StObject.set(x, "mismatch", value.asInstanceOf[js.Any])
  }
}
