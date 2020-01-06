package typings.atPulumiAws.ebsGetDefaultKmsKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDefaultKmsKeyResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Amazon Resource Name (ARN) of the default KMS key uses to encrypt an EBS volume in this region when no key is specified in an API call that creates the volume and encryption by default is enabled.
    */
  val keyArn: String = js.native
}

object GetDefaultKmsKeyResult {
  @scala.inline
  def apply(id: String, keyArn: String): GetDefaultKmsKeyResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], keyArn = keyArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDefaultKmsKeyResult]
  }
}

