package typings.pulumiAws.mod

import typings.pulumiAws.getUserPoolsMod.GetUserPoolsArgs
import typings.pulumiAws.getUserPoolsMod.GetUserPoolsResult
import typings.pulumiAws.identityPoolMod.IdentityPoolArgs
import typings.pulumiAws.identityPoolMod.IdentityPoolState
import typings.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachmentArgs
import typings.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachmentState
import typings.pulumiAws.identityProviderMod.IdentityProviderArgs
import typings.pulumiAws.identityProviderMod.IdentityProviderState
import typings.pulumiAws.resourceServerMod.ResourceServerArgs
import typings.pulumiAws.resourceServerMod.ResourceServerState
import typings.pulumiAws.userGroupMod.UserGroupArgs
import typings.pulumiAws.userGroupMod.UserGroupState
import typings.pulumiAws.userPoolClientMod.UserPoolClientArgs
import typings.pulumiAws.userPoolClientMod.UserPoolClientState
import typings.pulumiAws.userPoolDomainMod.UserPoolDomainArgs
import typings.pulumiAws.userPoolDomainMod.UserPoolDomainState
import typings.pulumiAws.userPoolMod.UserPoolArgs
import typings.pulumiAws.userPoolMod.UserPoolState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cognito {
  
  @JSImport("@pulumi/aws", "cognito.IdentityPool")
  @js.native
  class IdentityPool protected ()
    extends typings.pulumiAws.cognitoMod.IdentityPool {
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
  /* static members */
  object IdentityPool {
    
    /**
      * Get an existing IdentityPool resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "cognito.IdentityPool.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.identityPoolMod.IdentityPool = js.native
    @JSImport("@pulumi/aws", "cognito.IdentityPool.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.identityPoolMod.IdentityPool = js.native
    @JSImport("@pulumi/aws", "cognito.IdentityPool.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityPoolState): typings.pulumiAws.identityPoolMod.IdentityPool = js.native
    @JSImport("@pulumi/aws", "cognito.IdentityPool.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityPoolState, opts: CustomResourceOptions): typings.pulumiAws.identityPoolMod.IdentityPool = js.native
    
    /**
      * Returns true if the given object is an instance of IdentityPool.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "cognito.IdentityPool.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityPool.IdentityPool */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "cognito.IdentityPoolRoleAttachment")
  @js.native
  class IdentityPoolRoleAttachment protected ()
    extends typings.pulumiAws.cognitoMod.IdentityPoolRoleAttachment {
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
  /* static members */
  object IdentityPoolRoleAttachment {
    
    /**
      * Get an existing IdentityPoolRoleAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "cognito.IdentityPoolRoleAttachment.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
    @JSImport("@pulumi/aws", "cognito.IdentityPoolRoleAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
    @JSImport("@pulumi/aws", "cognito.IdentityPoolRoleAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityPoolRoleAttachmentState): typings.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
    @JSImport("@pulumi/aws", "cognito.IdentityPoolRoleAttachment.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityPoolRoleAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
    
    /**
      * Returns true if the given object is an instance of IdentityPoolRoleAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "cognito.IdentityPoolRoleAttachment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityPoolRoleAttachment.IdentityPoolRoleAttachment */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "cognito.IdentityProvider")
  @js.native
  class IdentityProvider protected ()
    extends typings.pulumiAws.cognitoMod.IdentityProvider {
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
  /* static members */
  object IdentityProvider {
    
    /**
      * Get an existing IdentityProvider resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "cognito.IdentityProvider.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.identityProviderMod.IdentityProvider = js.native
    @JSImport("@pulumi/aws", "cognito.IdentityProvider.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.identityProviderMod.IdentityProvider = js.native
    @JSImport("@pulumi/aws", "cognito.IdentityProvider.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityProviderState): typings.pulumiAws.identityProviderMod.IdentityProvider = js.native
    @JSImport("@pulumi/aws", "cognito.IdentityProvider.get")
    @js.native
    def get(name: String, id: Input[ID], state: IdentityProviderState, opts: CustomResourceOptions): typings.pulumiAws.identityProviderMod.IdentityProvider = js.native
    
    /**
      * Returns true if the given object is an instance of IdentityProvider.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "cognito.IdentityProvider.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityProvider.IdentityProvider */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "cognito.ResourceServer")
  @js.native
  class ResourceServer protected ()
    extends typings.pulumiAws.cognitoMod.ResourceServer {
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
  /* static members */
  object ResourceServer {
    
    /**
      * Get an existing ResourceServer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "cognito.ResourceServer.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.resourceServerMod.ResourceServer = js.native
    @JSImport("@pulumi/aws", "cognito.ResourceServer.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.resourceServerMod.ResourceServer = js.native
    @JSImport("@pulumi/aws", "cognito.ResourceServer.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceServerState): typings.pulumiAws.resourceServerMod.ResourceServer = js.native
    @JSImport("@pulumi/aws", "cognito.ResourceServer.get")
    @js.native
    def get(name: String, id: Input[ID], state: ResourceServerState, opts: CustomResourceOptions): typings.pulumiAws.resourceServerMod.ResourceServer = js.native
    
    /**
      * Returns true if the given object is an instance of ResourceServer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "cognito.ResourceServer.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/resourceServer.ResourceServer */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "cognito.UserGroup")
  @js.native
  class UserGroup protected ()
    extends typings.pulumiAws.cognitoMod.UserGroup {
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
  /* static members */
  object UserGroup {
    
    /**
      * Get an existing UserGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "cognito.UserGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.userGroupMod.UserGroup = js.native
    @JSImport("@pulumi/aws", "cognito.UserGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.userGroupMod.UserGroup = js.native
    @JSImport("@pulumi/aws", "cognito.UserGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserGroupState): typings.pulumiAws.userGroupMod.UserGroup = js.native
    @JSImport("@pulumi/aws", "cognito.UserGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserGroupState, opts: CustomResourceOptions): typings.pulumiAws.userGroupMod.UserGroup = js.native
    
    /**
      * Returns true if the given object is an instance of UserGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "cognito.UserGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userGroup.UserGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "cognito.UserPool")
  @js.native
  class UserPool protected ()
    extends typings.pulumiAws.cognitoMod.UserPool {
    /**
      * Create a UserPool resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: UserPoolArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: UserPoolArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object UserPool {
    
    /**
      * Get an existing UserPool resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "cognito.UserPool.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.userPoolMod.UserPool = js.native
    @JSImport("@pulumi/aws", "cognito.UserPool.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.userPoolMod.UserPool = js.native
    @JSImport("@pulumi/aws", "cognito.UserPool.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserPoolState): typings.pulumiAws.userPoolMod.UserPool = js.native
    @JSImport("@pulumi/aws", "cognito.UserPool.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserPoolState, opts: CustomResourceOptions): typings.pulumiAws.userPoolMod.UserPool = js.native
    
    /**
      * Returns true if the given object is an instance of UserPool.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "cognito.UserPool.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPool.UserPool */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "cognito.UserPoolClient")
  @js.native
  class UserPoolClient protected ()
    extends typings.pulumiAws.cognitoMod.UserPoolClient {
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
  /* static members */
  object UserPoolClient {
    
    /**
      * Get an existing UserPoolClient resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "cognito.UserPoolClient.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.userPoolClientMod.UserPoolClient = js.native
    @JSImport("@pulumi/aws", "cognito.UserPoolClient.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.userPoolClientMod.UserPoolClient = js.native
    @JSImport("@pulumi/aws", "cognito.UserPoolClient.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserPoolClientState): typings.pulumiAws.userPoolClientMod.UserPoolClient = js.native
    @JSImport("@pulumi/aws", "cognito.UserPoolClient.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserPoolClientState, opts: CustomResourceOptions): typings.pulumiAws.userPoolClientMod.UserPoolClient = js.native
    
    /**
      * Returns true if the given object is an instance of UserPoolClient.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "cognito.UserPoolClient.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolClient.UserPoolClient */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "cognito.UserPoolDomain")
  @js.native
  class UserPoolDomain protected ()
    extends typings.pulumiAws.cognitoMod.UserPoolDomain {
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
  /* static members */
  object UserPoolDomain {
    
    /**
      * Get an existing UserPoolDomain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws", "cognito.UserPoolDomain.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.userPoolDomainMod.UserPoolDomain = js.native
    @JSImport("@pulumi/aws", "cognito.UserPoolDomain.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.userPoolDomainMod.UserPoolDomain = js.native
    @JSImport("@pulumi/aws", "cognito.UserPoolDomain.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserPoolDomainState): typings.pulumiAws.userPoolDomainMod.UserPoolDomain = js.native
    @JSImport("@pulumi/aws", "cognito.UserPoolDomain.get")
    @js.native
    def get(name: String, id: Input[ID], state: UserPoolDomainState, opts: CustomResourceOptions): typings.pulumiAws.userPoolDomainMod.UserPoolDomain = js.native
    
    /**
      * Returns true if the given object is an instance of UserPoolDomain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws", "cognito.UserPoolDomain.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolDomain.UserPoolDomain */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws", "cognito.getUserPools")
  @js.native
  def getUserPools(args: GetUserPoolsArgs): js.Promise[GetUserPoolsResult] = js.native
  @JSImport("@pulumi/aws", "cognito.getUserPools")
  @js.native
  def getUserPools(args: GetUserPoolsArgs, opts: InvokeOptions): js.Promise[GetUserPoolsResult] = js.native
}
