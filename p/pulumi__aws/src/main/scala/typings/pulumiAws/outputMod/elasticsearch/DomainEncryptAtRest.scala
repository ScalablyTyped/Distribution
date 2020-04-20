package typings.pulumiAws.outputMod.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainEncryptAtRest extends js.Object {
  /**
    * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
    */
  var enabled: Boolean = js.native
  /**
    * The KMS key id to encrypt the Elasticsearch domain with. If not specified then it defaults to using the `aws/es` service KMS key.
    */
  var kmsKeyId: String = js.native
}

object DomainEncryptAtRest {
  @scala.inline
  def apply(enabled: Boolean, kmsKeyId: String): DomainEncryptAtRest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainEncryptAtRest]
  }
}

