package typings.pulumiAws.grantMod

import typings.pulumiAws.inputMod.kms.GrantConstraint
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrantArgs extends js.Object {
  
  /**
    * A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
    */
  val constraints: js.UndefOr[Input[js.Array[Input[GrantConstraint]]]] = js.native
  
  /**
    * A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
    */
  val grantCreationTokens: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the state may not always be refreshed to reflect what is true in AWS.
    */
  val granteePrincipal: Input[String] = js.native
  
  /**
    * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
    */
  val keyId: Input[String] = js.native
  
  /**
    * A friendly name for identifying the grant.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of operations that the grant permits. The permitted values are: `Decrypt, Encrypt, GenerateDataKey, GenerateDataKeyWithoutPlaintext, ReEncryptFrom, ReEncryptTo, CreateGrant, RetireGrant, DescribeKey`
    */
  val operations: Input[js.Array[Input[String]]] = js.native
  
  /**
    * -(Defaults to false, Forces new resources) If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
    * See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
    */
  val retireOnDelete: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the state may not always be refreshed to reflect what is true in AWS.
    */
  val retiringPrincipal: js.UndefOr[Input[String]] = js.native
}
object GrantArgs {
  
  @scala.inline
  def apply(granteePrincipal: Input[String], keyId: Input[String], operations: Input[js.Array[Input[String]]]): GrantArgs = {
    val __obj = js.Dynamic.literal(granteePrincipal = granteePrincipal.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantArgs]
  }
  
  @scala.inline
  implicit class GrantArgsOps[Self <: GrantArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGranteePrincipal(value: Input[String]): Self = this.set("granteePrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyId(value: Input[String]): Self = this.set("keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsVarargs(value: Input[String]*): Self = this.set("operations", js.Array(value :_*))
    
    @scala.inline
    def setOperations(value: Input[js.Array[Input[String]]]): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintsVarargs(value: Input[GrantConstraint]*): Self = this.set("constraints", js.Array(value :_*))
    
    @scala.inline
    def setConstraints(value: Input[js.Array[Input[GrantConstraint]]]): Self = this.set("constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    
    @scala.inline
    def setGrantCreationTokensVarargs(value: Input[String]*): Self = this.set("grantCreationTokens", js.Array(value :_*))
    
    @scala.inline
    def setGrantCreationTokens(value: Input[js.Array[Input[String]]]): Self = this.set("grantCreationTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantCreationTokens: Self = this.set("grantCreationTokens", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRetireOnDelete(value: Input[Boolean]): Self = this.set("retireOnDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetireOnDelete: Self = this.set("retireOnDelete", js.undefined)
    
    @scala.inline
    def setRetiringPrincipal(value: Input[String]): Self = this.set("retiringPrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetiringPrincipal: Self = this.set("retiringPrincipal", js.undefined)
  }
}
