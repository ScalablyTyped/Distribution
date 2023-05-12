package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawBytes extends StObject {
  
  var rawBytes: String
}
object RawBytes {
  
  inline def apply(rawBytes: String): RawBytes = {
    val __obj = js.Dynamic.literal(rawBytes = rawBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawBytes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawBytes] (val x: Self) extends AnyVal {
    
    inline def setRawBytes(value: String): Self = StObject.set(x, "rawBytes", value.asInstanceOf[js.Any])
  }
}
