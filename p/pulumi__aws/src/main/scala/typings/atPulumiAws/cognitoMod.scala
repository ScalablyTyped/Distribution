package typings.atPulumiAws

import typings.atPulumiAws.cognitoGetUserPoolsMod.GetUserPoolsArgs
import typings.atPulumiAws.cognitoGetUserPoolsMod.GetUserPoolsResult
import typings.atPulumiAws.cognitoIdentityPoolMod.IdentityPoolArgs
import typings.atPulumiAws.cognitoIdentityPoolMod.IdentityPoolState
import typings.atPulumiAws.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachmentArgs
import typings.atPulumiAws.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachmentState
import typings.atPulumiAws.cognitoIdentityProviderMod.IdentityProviderArgs
import typings.atPulumiAws.cognitoIdentityProviderMod.IdentityProviderState
import typings.atPulumiAws.cognitoResourceServerMod.ResourceServerArgs
import typings.atPulumiAws.cognitoResourceServerMod.ResourceServerState
import typings.atPulumiAws.cognitoUserGroupMod.UserGroupArgs
import typings.atPulumiAws.cognitoUserGroupMod.UserGroupState
import typings.atPulumiAws.cognitoUserPoolClientMod.UserPoolClientArgs
import typings.atPulumiAws.cognitoUserPoolClientMod.UserPoolClientState
import typings.atPulumiAws.cognitoUserPoolDomainMod.UserPoolDomainArgs
import typings.atPulumiAws.cognitoUserPoolDomainMod.UserPoolDomainState
import typings.atPulumiAws.cognitoUserPoolMod.UserPoolArgs
import typings.atPulumiAws.cognitoUserPoolMod.UserPoolState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cognito", JSImport.Namespace)
@js.native
object cognitoMod extends js.Object {
  @js.native
  class IdentityPool protected ()
    extends typings.atPulumiAws.cognitoIdentityPoolMod.IdentityPool {
    /**
      * Create a IdentityPool resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IdentityPoolArgs) = this()
    def this(name: String, args: IdentityPoolArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class IdentityPoolRoleAttachment protected ()
    extends typings.atPulumiAws.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachment {
    /**
      * Create a IdentityPoolRoleAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IdentityPoolRoleAttachmentArgs) = this()
    def this(name: String, args: IdentityPoolRoleAttachmentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class IdentityProvider protected ()
    extends typings.atPulumiAws.cognitoIdentityProviderMod.IdentityProvider {
    /**
      * Create a IdentityProvider resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: IdentityProviderArgs) = this()
    def this(name: String, args: IdentityProviderArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class ResourceServer protected ()
    extends typings.atPulumiAws.cognitoResourceServerMod.ResourceServer {
    /**
      * Create a ResourceServer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ResourceServerArgs) = this()
    def this(name: String, args: ResourceServerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UserGroup protected ()
    extends typings.atPulumiAws.cognitoUserGroupMod.UserGroup {
    /**
      * Create a UserGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserGroupArgs) = this()
    def this(name: String, args: UserGroupArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UserPool protected ()
    extends typings.atPulumiAws.cognitoUserPoolMod.UserPool {
    /**
      * Create a UserPool resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: UserPoolArgs) = this()
    def this(name: String, args: UserPoolArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UserPoolClient protected ()
    extends typings.atPulumiAws.cognitoUserPoolClientMod.UserPoolClient {
    /**
      * Create a UserPoolClient resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserPoolClientArgs) = this()
    def this(name: String, args: UserPoolClientArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UserPoolDomain protected ()
    extends typings.atPulumiAws.cognitoUserPoolDomainMod.UserPoolDomain {
    /**
      * Create a UserPoolDomain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UserPoolDomainArgs) = this()
    def this(name: String, args: UserPoolDomainArgs, opts: CustomResourceOptions) = this()
  }
  
  def getUserPools(args: GetUserPoolsArgs): js.Promise[GetUserPoolsResult] with GetUserPoolsResult = js.native
  def getUserPools(args: GetUserPoolsArgs, opts: InvokeOptions): js.Promise[GetUserPoolsResult] with GetUserPoolsResult = js.native
  /* static members */
  @js.native
  object IdentityPool extends js.Object {
    /**
      * Get an existing IdentityPool resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cognitoIdentityPoolMod.IdentityPool = js.native
    def get(name: String, id: Input[ID], state: IdentityPoolState): typings.atPulumiAws.cognitoIdentityPoolMod.IdentityPool = js.native
    def get(name: String, id: Input[ID], state: IdentityPoolState, opts: CustomResourceOptions): typings.atPulumiAws.cognitoIdentityPoolMod.IdentityPool = js.native
    /**
      * Returns true if the given object is an instance of IdentityPool.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityPool.IdentityPool */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object IdentityPoolRoleAttachment extends js.Object {
    /**
      * Get an existing IdentityPoolRoleAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
    def get(name: String, id: Input[ID], state: IdentityPoolRoleAttachmentState): typings.atPulumiAws.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
    def get(name: String, id: Input[ID], state: IdentityPoolRoleAttachmentState, opts: CustomResourceOptions): typings.atPulumiAws.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
    /**
      * Returns true if the given object is an instance of IdentityPoolRoleAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityPoolRoleAttachment.IdentityPoolRoleAttachment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object IdentityProvider extends js.Object {
    /**
      * Get an existing IdentityProvider resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cognitoIdentityProviderMod.IdentityProvider = js.native
    def get(name: String, id: Input[ID], state: IdentityProviderState): typings.atPulumiAws.cognitoIdentityProviderMod.IdentityProvider = js.native
    def get(name: String, id: Input[ID], state: IdentityProviderState, opts: CustomResourceOptions): typings.atPulumiAws.cognitoIdentityProviderMod.IdentityProvider = js.native
    /**
      * Returns true if the given object is an instance of IdentityProvider.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityProvider.IdentityProvider */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ResourceServer extends js.Object {
    /**
      * Get an existing ResourceServer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cognitoResourceServerMod.ResourceServer = js.native
    def get(name: String, id: Input[ID], state: ResourceServerState): typings.atPulumiAws.cognitoResourceServerMod.ResourceServer = js.native
    def get(name: String, id: Input[ID], state: ResourceServerState, opts: CustomResourceOptions): typings.atPulumiAws.cognitoResourceServerMod.ResourceServer = js.native
    /**
      * Returns true if the given object is an instance of ResourceServer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/resourceServer.ResourceServer */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object UserGroup extends js.Object {
    /**
      * Get an existing UserGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cognitoUserGroupMod.UserGroup = js.native
    def get(name: String, id: Input[ID], state: UserGroupState): typings.atPulumiAws.cognitoUserGroupMod.UserGroup = js.native
    def get(name: String, id: Input[ID], state: UserGroupState, opts: CustomResourceOptions): typings.atPulumiAws.cognitoUserGroupMod.UserGroup = js.native
    /**
      * Returns true if the given object is an instance of UserGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userGroup.UserGroup */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object UserPool extends js.Object {
    /**
      * Get an existing UserPool resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cognitoUserPoolMod.UserPool = js.native
    def get(name: String, id: Input[ID], state: UserPoolState): typings.atPulumiAws.cognitoUserPoolMod.UserPool = js.native
    def get(name: String, id: Input[ID], state: UserPoolState, opts: CustomResourceOptions): typings.atPulumiAws.cognitoUserPoolMod.UserPool = js.native
    /**
      * Returns true if the given object is an instance of UserPool.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPool.UserPool */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object UserPoolClient extends js.Object {
    /**
      * Get an existing UserPoolClient resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cognitoUserPoolClientMod.UserPoolClient = js.native
    def get(name: String, id: Input[ID], state: UserPoolClientState): typings.atPulumiAws.cognitoUserPoolClientMod.UserPoolClient = js.native
    def get(name: String, id: Input[ID], state: UserPoolClientState, opts: CustomResourceOptions): typings.atPulumiAws.cognitoUserPoolClientMod.UserPoolClient = js.native
    /**
      * Returns true if the given object is an instance of UserPoolClient.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolClient.UserPoolClient */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object UserPoolDomain extends js.Object {
    /**
      * Get an existing UserPoolDomain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.cognitoUserPoolDomainMod.UserPoolDomain = js.native
    def get(name: String, id: Input[ID], state: UserPoolDomainState): typings.atPulumiAws.cognitoUserPoolDomainMod.UserPoolDomain = js.native
    def get(name: String, id: Input[ID], state: UserPoolDomainState, opts: CustomResourceOptions): typings.atPulumiAws.cognitoUserPoolDomainMod.UserPoolDomain = js.native
    /**
      * Returns true if the given object is an instance of UserPoolDomain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolDomain.UserPoolDomain */ Boolean = js.native
  }
  
}

