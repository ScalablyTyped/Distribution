package typings.pulumiAws

import typings.pulumiAws.outputMod.kms.GrantConstraint
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grantMod {
  
  @JSImport("@pulumi/aws/kms/grant", "Grant")
  @js.native
  class Grant protected () extends CustomResource {
    /**
      * Create a Grant resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GrantArgs) = this()
    def this(name: String, args: GrantArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
      */
    val constraints: Output_[js.UndefOr[js.Array[GrantConstraint]]] = js.native
    
    /**
      * A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
      */
    val grantCreationTokens: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The unique identifier for the grant.
      */
    val grantId: Output_[String] = js.native
    
    /**
      * The grant token for the created grant. For more information, see [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token).
      */
    val grantToken: Output_[String] = js.native
    
    /**
      * The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the state may not always be refreshed to reflect what is true in AWS.
      */
    val granteePrincipal: Output_[String] = js.native
    
    /**
      * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
      */
    val keyId: Output_[String] = js.native
    
    /**
      * A friendly name for identifying the grant.
      */
    val name: Output_[String] = js.native
    
    /**
      * A list of operations that the grant permits. The permitted values are: `Decrypt, Encrypt, GenerateDataKey, GenerateDataKeyWithoutPlaintext, ReEncryptFrom, ReEncryptTo, CreateGrant, RetireGrant, DescribeKey`
      */
    val operations: Output_[js.Array[String]] = js.native
    
    /**
      * -(Defaults to false, Forces new resources) If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
      * See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
      */
    val retireOnDelete: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the state may not always be refreshed to reflect what is true in AWS.
      */
    val retiringPrincipal: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Grant {
    
    /**
      * Get an existing Grant resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/kms/grant", "Grant.get")
    @js.native
    def get(name: String, id: Input[ID]): Grant = js.native
    @JSImport("@pulumi/aws/kms/grant", "Grant.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Grant = js.native
    @JSImport("@pulumi/aws/kms/grant", "Grant.get")
    @js.native
    def get(name: String, id: Input[ID], state: GrantState): Grant = js.native
    @JSImport("@pulumi/aws/kms/grant", "Grant.get")
    @js.native
    def get(name: String, id: Input[ID], state: GrantState, opts: CustomResourceOptions): Grant = js.native
    
    /**
      * Returns true if the given object is an instance of Grant.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/kms/grant", "Grant.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kms/grant.Grant */ Boolean = js.native
  }
  
  @js.native
  trait GrantArgs extends StObject {
    
    /**
      * A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
      */
    val constraints: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.kms.GrantConstraint]]]] = js.native
    
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
    implicit class GrantArgsMutableBuilder[Self <: GrantArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstraints(value: Input[js.Array[Input[typings.pulumiAws.inputMod.kms.GrantConstraint]]]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      @scala.inline
      def setConstraintsVarargs(value: Input[typings.pulumiAws.inputMod.kms.GrantConstraint]*): Self = StObject.set(x, "constraints", js.Array(value :_*))
      
      @scala.inline
      def setGrantCreationTokens(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "grantCreationTokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantCreationTokensUndefined: Self = StObject.set(x, "grantCreationTokens", js.undefined)
      
      @scala.inline
      def setGrantCreationTokensVarargs(value: Input[String]*): Self = StObject.set(x, "grantCreationTokens", js.Array(value :_*))
      
      @scala.inline
      def setGranteePrincipal(value: Input[String]): Self = StObject.set(x, "granteePrincipal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyId(value: Input[String]): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOperations(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationsVarargs(value: Input[String]*): Self = StObject.set(x, "operations", js.Array(value :_*))
      
      @scala.inline
      def setRetireOnDelete(value: Input[Boolean]): Self = StObject.set(x, "retireOnDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetireOnDeleteUndefined: Self = StObject.set(x, "retireOnDelete", js.undefined)
      
      @scala.inline
      def setRetiringPrincipal(value: Input[String]): Self = StObject.set(x, "retiringPrincipal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetiringPrincipalUndefined: Self = StObject.set(x, "retiringPrincipal", js.undefined)
    }
  }
  
  @js.native
  trait GrantState extends StObject {
    
    /**
      * A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
      */
    val constraints: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.kms.GrantConstraint]]]] = js.native
    
    /**
      * A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
      */
    val grantCreationTokens: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The unique identifier for the grant.
      */
    val grantId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The grant token for the created grant. For more information, see [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token).
      */
    val grantToken: js.UndefOr[Input[String]] = js.native
    
    /**
      * The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the state may not always be refreshed to reflect what is true in AWS.
      */
    val granteePrincipal: js.UndefOr[Input[String]] = js.native
    
    /**
      * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
      */
    val keyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A friendly name for identifying the grant.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of operations that the grant permits. The permitted values are: `Decrypt, Encrypt, GenerateDataKey, GenerateDataKeyWithoutPlaintext, ReEncryptFrom, ReEncryptTo, CreateGrant, RetireGrant, DescribeKey`
      */
    val operations: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
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
  object GrantState {
    
    @scala.inline
    def apply(): GrantState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrantState]
    }
    
    @scala.inline
    implicit class GrantStateMutableBuilder[Self <: GrantState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstraints(value: Input[js.Array[Input[typings.pulumiAws.inputMod.kms.GrantConstraint]]]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      @scala.inline
      def setConstraintsVarargs(value: Input[typings.pulumiAws.inputMod.kms.GrantConstraint]*): Self = StObject.set(x, "constraints", js.Array(value :_*))
      
      @scala.inline
      def setGrantCreationTokens(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "grantCreationTokens", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantCreationTokensUndefined: Self = StObject.set(x, "grantCreationTokens", js.undefined)
      
      @scala.inline
      def setGrantCreationTokensVarargs(value: Input[String]*): Self = StObject.set(x, "grantCreationTokens", js.Array(value :_*))
      
      @scala.inline
      def setGrantId(value: Input[String]): Self = StObject.set(x, "grantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantIdUndefined: Self = StObject.set(x, "grantId", js.undefined)
      
      @scala.inline
      def setGrantToken(value: Input[String]): Self = StObject.set(x, "grantToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrantTokenUndefined: Self = StObject.set(x, "grantToken", js.undefined)
      
      @scala.inline
      def setGranteePrincipal(value: Input[String]): Self = StObject.set(x, "granteePrincipal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGranteePrincipalUndefined: Self = StObject.set(x, "granteePrincipal", js.undefined)
      
      @scala.inline
      def setKeyId(value: Input[String]): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOperations(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
      
      @scala.inline
      def setOperationsVarargs(value: Input[String]*): Self = StObject.set(x, "operations", js.Array(value :_*))
      
      @scala.inline
      def setRetireOnDelete(value: Input[Boolean]): Self = StObject.set(x, "retireOnDelete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetireOnDeleteUndefined: Self = StObject.set(x, "retireOnDelete", js.undefined)
      
      @scala.inline
      def setRetiringPrincipal(value: Input[String]): Self = StObject.set(x, "retiringPrincipal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetiringPrincipalUndefined: Self = StObject.set(x, "retiringPrincipal", js.undefined)
    }
  }
}
