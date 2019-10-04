package typings.atPulumiAws.typesOutputMod.elasticsearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainEncryptAtRest extends js.Object {
  /**
    * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
    */
  var enabled: Boolean
  /**
    * The KMS key id to encrypt the Elasticsearch domain with. If not specified then it defaults to using the `aws/es` service KMS key.
    */
  var kmsKeyId: String
}

object DomainEncryptAtRest {
  @scala.inline
  def apply(enabled: Boolean, kmsKeyId: String): DomainEncryptAtRest = {
    val __obj = js.Dynamic.literal(enabled = enabled, kmsKeyId = kmsKeyId)
  
    __obj.asInstanceOf[DomainEncryptAtRest]
  }
}

