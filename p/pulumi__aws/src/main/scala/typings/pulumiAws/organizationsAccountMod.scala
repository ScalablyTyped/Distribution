package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object organizationsAccountMod {
  
  @JSImport("@pulumi/aws/organizations/account", "Account")
  @js.native
  class Account protected () extends CustomResource {
    /**
      * Create a Account resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AccountArgs) = this()
    def this(name: String, args: AccountArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN for this account.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The email address of the owner to assign to the new member account. This email address must not already be associated with another AWS account.
      */
    val email: Output_[String] = js.native
    
    /**
      * If set to `ALLOW`, the new account enables IAM users to access account billing information if they have the required permissions. If set to `DENY`, then only the root user of the new account can access account billing information.
      */
    val iamUserAccessToBilling: Output_[js.UndefOr[String]] = js.native
    
    val joinedMethod: Output_[String] = js.native
    
    val joinedTimestamp: Output_[String] = js.native
    
    /**
      * A friendly name for the member account.
      */
    val name: Output_[String] = js.native
    
    /**
      * Parent Organizational Unit ID or Root ID for the account. Defaults to the Organization default Root ID. A configuration must be present for this argument to perform drift detection.
      */
    val parentId: Output_[String] = js.native
    
    /**
      * The name of an IAM role that Organizations automatically preconfigures in the new member account. This role trusts the master account, allowing users in the master account to assume the role, as permitted by the master account administrator. The role has administrator permissions in the new member account. The Organizations API provides no method for reading this information after account creation, so this provider cannot perform drift detection on its value and will always show a difference for a configured value after import unless [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) is used.
      */
    val roleName: Output_[js.UndefOr[String]] = js.native
    
    val status: Output_[String] = js.native
    
    /**
      * Key-value mapping of resource tags.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Account {
    
    @JSImport("@pulumi/aws/organizations/account", "Account")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Account resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Account = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Account]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Account = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Account]
    inline def get(name: String, id: Input[ID], state: AccountState): Account = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Account]
    inline def get(name: String, id: Input[ID], state: AccountState, opts: CustomResourceOptions): Account = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Account]
    
    /**
      * Returns true if the given object is an instance of Account.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/organizations/account.Account */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/organizations/account.Account */ Boolean]
  }
  
  trait AccountArgs extends StObject {
    
    /**
      * The email address of the owner to assign to the new member account. This email address must not already be associated with another AWS account.
      */
    val email: Input[String]
    
    /**
      * If set to `ALLOW`, the new account enables IAM users to access account billing information if they have the required permissions. If set to `DENY`, then only the root user of the new account can access account billing information.
      */
    val iamUserAccessToBilling: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A friendly name for the member account.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Parent Organizational Unit ID or Root ID for the account. Defaults to the Organization default Root ID. A configuration must be present for this argument to perform drift detection.
      */
    val parentId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of an IAM role that Organizations automatically preconfigures in the new member account. This role trusts the master account, allowing users in the master account to assume the role, as permitted by the master account administrator. The role has administrator permissions in the new member account. The Organizations API provides no method for reading this information after account creation, so this provider cannot perform drift detection on its value and will always show a difference for a configured value after import unless [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) is used.
      */
    val roleName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value mapping of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object AccountArgs {
    
    inline def apply(email: Input[String]): AccountArgs = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccountArgs]
    }
    
    extension [Self <: AccountArgs](x: Self) {
      
      inline def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setIamUserAccessToBilling(value: Input[String]): Self = StObject.set(x, "iamUserAccessToBilling", value.asInstanceOf[js.Any])
      
      inline def setIamUserAccessToBillingUndefined: Self = StObject.set(x, "iamUserAccessToBilling", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParentId(value: Input[String]): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setRoleName(value: Input[String]): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
      
      inline def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait AccountState extends StObject {
    
    /**
      * The ARN for this account.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The email address of the owner to assign to the new member account. This email address must not already be associated with another AWS account.
      */
    val email: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * If set to `ALLOW`, the new account enables IAM users to access account billing information if they have the required permissions. If set to `DENY`, then only the root user of the new account can access account billing information.
      */
    val iamUserAccessToBilling: js.UndefOr[Input[String]] = js.undefined
    
    val joinedMethod: js.UndefOr[Input[String]] = js.undefined
    
    val joinedTimestamp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A friendly name for the member account.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Parent Organizational Unit ID or Root ID for the account. Defaults to the Organization default Root ID. A configuration must be present for this argument to perform drift detection.
      */
    val parentId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of an IAM role that Organizations automatically preconfigures in the new member account. This role trusts the master account, allowing users in the master account to assume the role, as permitted by the master account administrator. The role has administrator permissions in the new member account. The Organizations API provides no method for reading this information after account creation, so this provider cannot perform drift detection on its value and will always show a difference for a configured value after import unless [`ignoreChanges`](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) is used.
      */
    val roleName: js.UndefOr[Input[String]] = js.undefined
    
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value mapping of resource tags.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object AccountState {
    
    inline def apply(): AccountState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountState]
    }
    
    extension [Self <: AccountState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setEmail(value: Input[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setIamUserAccessToBilling(value: Input[String]): Self = StObject.set(x, "iamUserAccessToBilling", value.asInstanceOf[js.Any])
      
      inline def setIamUserAccessToBillingUndefined: Self = StObject.set(x, "iamUserAccessToBilling", js.undefined)
      
      inline def setJoinedMethod(value: Input[String]): Self = StObject.set(x, "joinedMethod", value.asInstanceOf[js.Any])
      
      inline def setJoinedMethodUndefined: Self = StObject.set(x, "joinedMethod", js.undefined)
      
      inline def setJoinedTimestamp(value: Input[String]): Self = StObject.set(x, "joinedTimestamp", value.asInstanceOf[js.Any])
      
      inline def setJoinedTimestampUndefined: Self = StObject.set(x, "joinedTimestamp", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setParentId(value: Input[String]): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setRoleName(value: Input[String]): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
      
      inline def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
      
      inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
