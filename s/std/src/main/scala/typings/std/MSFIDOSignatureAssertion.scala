package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSFIDOSignatureAssertion extends MSAssertion {
  
  val signature: MSFIDOSignature = js.native
}
object MSFIDOSignatureAssertion {
  
  @scala.inline
  def apply(id: java.lang.String, signature: MSFIDOSignature, `type`: MSCredentialType): MSFIDOSignatureAssertion = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSFIDOSignatureAssertion]
  }
  
  @scala.inline
  implicit class MSFIDOSignatureAssertionMutableBuilder[Self <: MSFIDOSignatureAssertion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSignature(value: MSFIDOSignature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
