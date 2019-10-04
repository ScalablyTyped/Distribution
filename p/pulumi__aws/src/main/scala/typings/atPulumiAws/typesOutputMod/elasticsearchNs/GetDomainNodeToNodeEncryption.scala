package typings.atPulumiAws.typesOutputMod.elasticsearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainNodeToNodeEncryption extends js.Object {
  /**
    * Whether node to node encryption is enabled.
    */
  var enabled: Boolean
}

object GetDomainNodeToNodeEncryption {
  @scala.inline
  def apply(enabled: Boolean): GetDomainNodeToNodeEncryption = {
    val __obj = js.Dynamic.literal(enabled = enabled)
  
    __obj.asInstanceOf[GetDomainNodeToNodeEncryption]
  }
}

