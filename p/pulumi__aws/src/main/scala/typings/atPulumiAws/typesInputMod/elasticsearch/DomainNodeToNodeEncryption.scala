package typings.atPulumiAws.typesInputMod.elasticsearch

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainNodeToNodeEncryption extends js.Object {
  /**
    * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
    */
  var enabled: Input[Boolean]
}

object DomainNodeToNodeEncryption {
  @scala.inline
  def apply(enabled: Input[Boolean]): DomainNodeToNodeEncryption = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DomainNodeToNodeEncryption]
  }
}

