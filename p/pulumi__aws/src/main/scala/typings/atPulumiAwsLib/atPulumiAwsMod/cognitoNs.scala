package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "cognito")
@js.native
object cognitoNs extends js.Object {
  @js.native
  class IdentityPool protected ()
    extends atPulumiAwsLib.cognitoMod.IdentityPool {
    /**
      * Create a IdentityPool resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cognitoIdentityPoolMod.IdentityPoolArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cognitoIdentityPoolMod.IdentityPoolArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class IdentityPoolRoleAttachment protected ()
    extends atPulumiAwsLib.cognitoMod.IdentityPoolRoleAttachment {
    /**
      * Create a IdentityPoolRoleAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachmentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class IdentityProvider protected ()
    extends atPulumiAwsLib.cognitoMod.IdentityProvider {
    /**
      * Create a IdentityProvider resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProviderArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProviderArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class ResourceServer protected ()
    extends atPulumiAwsLib.cognitoMod.ResourceServer {
    /**
      * Create a ResourceServer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cognitoResourceServerMod.ResourceServerArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cognitoResourceServerMod.ResourceServerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class UserGroup protected ()
    extends atPulumiAwsLib.cognitoMod.UserGroup {
    /**
      * Create a UserGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cognitoUserGroupMod.UserGroupArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cognitoUserGroupMod.UserGroupArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class UserPool protected ()
    extends atPulumiAwsLib.cognitoMod.UserPool {
    /**
      * Create a UserPool resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cognitoUserPoolMod.UserPoolArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cognitoUserPoolMod.UserPoolArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class UserPoolClient protected ()
    extends atPulumiAwsLib.cognitoMod.UserPoolClient {
    /**
      * Create a UserPoolClient resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cognitoUserPoolClientMod.UserPoolClientArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cognitoUserPoolClientMod.UserPoolClientArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class UserPoolDomain protected ()
    extends atPulumiAwsLib.cognitoMod.UserPoolDomain {
    /**
      * Create a UserPoolDomain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.cognitoUserPoolDomainMod.UserPoolDomainArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.cognitoUserPoolDomainMod.UserPoolDomainArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getUserPools(args: atPulumiAwsLib.cognitoGetUserPoolsMod.GetUserPoolsArgs): js.Promise[atPulumiAwsLib.cognitoGetUserPoolsMod.GetUserPoolsResult] = js.native
  def getUserPools(
    args: atPulumiAwsLib.cognitoGetUserPoolsMod.GetUserPoolsArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.cognitoGetUserPoolsMod.GetUserPoolsResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cognitoIdentityPoolMod.IdentityPool = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cognitoIdentityPoolMod.IdentityPoolState
    ): atPulumiAwsLib.cognitoIdentityPoolMod.IdentityPool = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cognitoIdentityPoolMod.IdentityPoolState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cognitoIdentityPoolMod.IdentityPool = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachmentState
    ): atPulumiAwsLib.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachmentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProvider = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProviderState
    ): atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProvider = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProviderState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cognitoIdentityProviderMod.IdentityProvider = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cognitoResourceServerMod.ResourceServer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cognitoResourceServerMod.ResourceServerState
    ): atPulumiAwsLib.cognitoResourceServerMod.ResourceServer = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cognitoResourceServerMod.ResourceServerState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cognitoResourceServerMod.ResourceServer = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cognitoUserGroupMod.UserGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cognitoUserGroupMod.UserGroupState
    ): atPulumiAwsLib.cognitoUserGroupMod.UserGroup = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cognitoUserGroupMod.UserGroupState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cognitoUserGroupMod.UserGroup = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cognitoUserPoolMod.UserPool = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cognitoUserPoolMod.UserPoolState
    ): atPulumiAwsLib.cognitoUserPoolMod.UserPool = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cognitoUserPoolMod.UserPoolState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cognitoUserPoolMod.UserPool = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cognitoUserPoolClientMod.UserPoolClient = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cognitoUserPoolClientMod.UserPoolClientState
    ): atPulumiAwsLib.cognitoUserPoolClientMod.UserPoolClient = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cognitoUserPoolClientMod.UserPoolClientState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cognitoUserPoolClientMod.UserPoolClient = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cognitoUserPoolDomainMod.UserPoolDomain = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cognitoUserPoolDomainMod.UserPoolDomainState
    ): atPulumiAwsLib.cognitoUserPoolDomainMod.UserPoolDomain = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.cognitoUserPoolDomainMod.UserPoolDomainState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.cognitoUserPoolDomainMod.UserPoolDomain = js.native
  }
  
}

