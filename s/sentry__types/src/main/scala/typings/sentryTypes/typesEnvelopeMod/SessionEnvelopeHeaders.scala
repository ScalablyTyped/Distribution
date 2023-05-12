package typings.sentryTypes.typesEnvelopeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionEnvelopeHeaders extends StObject {
  
  var sent_at: String
}
object SessionEnvelopeHeaders {
  
  inline def apply(sent_at: String): SessionEnvelopeHeaders = {
    val __obj = js.Dynamic.literal(sent_at = sent_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionEnvelopeHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionEnvelopeHeaders] (val x: Self) extends AnyVal {
    
    inline def setSent_at(value: String): Self = StObject.set(x, "sent_at", value.asInstanceOf[js.Any])
  }
}
