package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeString extends StObject {
  
  var envelope: String
}
object EnvelopeString {
  
  inline def apply(envelope: String): EnvelopeString = {
    val __obj = js.Dynamic.literal(envelope = envelope.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvelopeString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvelopeString] (val x: Self) extends AnyVal {
    
    inline def setEnvelope(value: String): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
  }
}
