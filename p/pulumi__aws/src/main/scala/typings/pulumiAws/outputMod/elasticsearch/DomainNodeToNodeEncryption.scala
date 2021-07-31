package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainNodeToNodeEncryption extends StObject {
  
  /**
    * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
    */
  var enabled: Boolean
}
object DomainNodeToNodeEncryption {
  
  @scala.inline
  def apply(enabled: Boolean): DomainNodeToNodeEncryption = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainNodeToNodeEncryption]
  }
  
  @scala.inline
  implicit class DomainNodeToNodeEncryptionMutableBuilder[Self <: DomainNodeToNodeEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
