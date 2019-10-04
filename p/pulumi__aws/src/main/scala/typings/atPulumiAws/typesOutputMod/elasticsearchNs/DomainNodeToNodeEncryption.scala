package typings.atPulumiAws.typesOutputMod.elasticsearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainNodeToNodeEncryption extends js.Object {
  /**
    * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
    */
  var enabled: Boolean
}

object DomainNodeToNodeEncryption {
  @scala.inline
  def apply(enabled: Boolean): DomainNodeToNodeEncryption = {
    val __obj = js.Dynamic.literal(enabled = enabled)
  
    __obj.asInstanceOf[DomainNodeToNodeEncryption]
  }
}

