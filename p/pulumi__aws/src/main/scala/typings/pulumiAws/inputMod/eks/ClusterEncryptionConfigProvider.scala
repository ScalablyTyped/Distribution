package typings.pulumiAws.inputMod.eks

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterEncryptionConfigProvider extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the Key Management Service (KMS) customer master key (CMK). The CMK must be symmetric, created in the same region as the cluster, and if the CMK was created in a different account, the user must have access to the CMK. For more information, see [Allowing Users in Other Accounts to Use a CMK in the AWS Key Management Service Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/key-policy-modifying-external-accounts.html).
    */
  var keyArn: Input[String] = js.native
}

object ClusterEncryptionConfigProvider {
  @scala.inline
  def apply(keyArn: Input[String]): ClusterEncryptionConfigProvider = {
    val __obj = js.Dynamic.literal(keyArn = keyArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClusterEncryptionConfigProvider]
  }
}

