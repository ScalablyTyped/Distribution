package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageSignature extends StObject {
  
  var messageSignature: WithRequiredMessageSignat
}
object MessageSignature {
  
  inline def apply(messageSignature: WithRequiredMessageSignat): MessageSignature = {
    val __obj = js.Dynamic.literal(messageSignature = messageSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageSignature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageSignature] (val x: Self) extends AnyVal {
    
    inline def setMessageSignature(value: WithRequiredMessageSignat): Self = StObject.set(x, "messageSignature", value.asInstanceOf[js.Any])
  }
}
