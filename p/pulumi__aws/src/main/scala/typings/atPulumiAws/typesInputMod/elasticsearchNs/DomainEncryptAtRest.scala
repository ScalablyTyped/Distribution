package typings.atPulumiAws.typesInputMod.elasticsearchNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainEncryptAtRest extends js.Object {
  /**
    * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
    */
  var enabled: Input[Boolean]
  /**
    * The KMS key id to encrypt the Elasticsearch domain with. If not specified then it defaults to using the `aws/es` service KMS key.
    */
  var kmsKeyId: js.UndefOr[Input[String]] = js.undefined
}

object DomainEncryptAtRest {
  @scala.inline
  def apply(enabled: Input[Boolean], kmsKeyId: Input[String] = null): DomainEncryptAtRest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainEncryptAtRest]
  }
}

