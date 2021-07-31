package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainNodeToNodeEncryption extends StObject {
  
  /**
    * Whether node to node encryption is enabled.
    */
  var enabled: Boolean
}
object GetDomainNodeToNodeEncryption {
  
  @scala.inline
  def apply(enabled: Boolean): GetDomainNodeToNodeEncryption = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainNodeToNodeEncryption]
  }
  
  @scala.inline
  implicit class GetDomainNodeToNodeEncryptionMutableBuilder[Self <: GetDomainNodeToNodeEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
