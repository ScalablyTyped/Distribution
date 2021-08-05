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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cognito {
  
  @JSImport("@pulumi/aws", "cognito")
  @js.native
  val ^ : js.Any = js.native
  
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
    
    @JSImport("@pulumi/aws", "cognito.IdentityPool")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing IdentityPool resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.identityPoolMod.IdentityPool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityPoolMod.IdentityPool]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.identityPoolMod.IdentityPool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityPoolMod.IdentityPool]
    inline def get(name: String, id: Input[ID], state: IdentityPoolState): typings.pulumiAws.identityPoolMod.IdentityPool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityPoolMod.IdentityPool]
    inline def get(name: String, id: Input[ID], state: IdentityPoolState, opts: CustomResourceOptions): typings.pulumiAws.identityPoolMod.IdentityPool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityPoolMod.IdentityPool]
    
    /**
      * Returns true if the given object is an instance of IdentityPool.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityPool.IdentityPool */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cognito/identityPool.IdentityPool */ Boolean]
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
    
    @JSImport("@pulumi/aws", "cognito.IdentityPoolRoleAttachment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing IdentityPoolRoleAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment]
    inline def get(name: String, id: Input[ID], state: IdentityPoolRoleAttachmentState): typings.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment]
    inline def get(name: String, id: Input[ID], state: IdentityPoolRoleAttachmentState, opts: CustomResourceOptions): typings.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityPoolRoleAttachmentMod.IdentityPoolRoleAttachment]
    
    /**
      * Returns true if the given object is an instance of IdentityPoolRoleAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityPoolRoleAttachment.IdentityPoolRoleAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cognito/identityPoolRoleAttachment.IdentityPoolRoleAttachment */ Boolean]
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
    
    @JSImport("@pulumi/aws", "cognito.IdentityProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing IdentityProvider resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.identityProviderMod.IdentityProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityProviderMod.IdentityProvider]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.identityProviderMod.IdentityProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityProviderMod.IdentityProvider]
    inline def get(name: String, id: Input[ID], state: IdentityProviderState): typings.pulumiAws.identityProviderMod.IdentityProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityProviderMod.IdentityProvider]
    inline def get(name: String, id: Input[ID], state: IdentityProviderState, opts: CustomResourceOptions): typings.pulumiAws.identityProviderMod.IdentityProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.identityProviderMod.IdentityProvider]
    
    /**
      * Returns true if the given object is an instance of IdentityProvider.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/identityProvider.IdentityProvider */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cognito/identityProvider.IdentityProvider */ Boolean]
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
    
    @JSImport("@pulumi/aws", "cognito.ResourceServer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ResourceServer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.resourceServerMod.ResourceServer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resourceServerMod.ResourceServer]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.resourceServerMod.ResourceServer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resourceServerMod.ResourceServer]
    inline def get(name: String, id: Input[ID], state: ResourceServerState): typings.pulumiAws.resourceServerMod.ResourceServer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resourceServerMod.ResourceServer]
    inline def get(name: String, id: Input[ID], state: ResourceServerState, opts: CustomResourceOptions): typings.pulumiAws.resourceServerMod.ResourceServer = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.resourceServerMod.ResourceServer]
    
    /**
      * Returns true if the given object is an instance of ResourceServer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/resourceServer.ResourceServer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cognito/resourceServer.ResourceServer */ Boolean]
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
    
    @JSImport("@pulumi/aws", "cognito.UserGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing UserGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.userGroupMod.UserGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userGroupMod.UserGroup]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.userGroupMod.UserGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userGroupMod.UserGroup]
    inline def get(name: String, id: Input[ID], state: UserGroupState): typings.pulumiAws.userGroupMod.UserGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userGroupMod.UserGroup]
    inline def get(name: String, id: Input[ID], state: UserGroupState, opts: CustomResourceOptions): typings.pulumiAws.userGroupMod.UserGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userGroupMod.UserGroup]
    
    /**
      * Returns true if the given object is an instance of UserGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userGroup.UserGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cognito/userGroup.UserGroup */ Boolean]
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: UserPoolArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object UserPool {
    
    @JSImport("@pulumi/aws", "cognito.UserPool")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing UserPool resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.userPoolMod.UserPool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userPoolMod.UserPool]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.userPoolMod.UserPool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userPoolMod.UserPool]
    inline def get(name: String, id: Input[ID], state: UserPoolState): typings.pulumiAws.userPoolMod.UserPool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userPoolMod.UserPool]
    inline def get(name: String, id: Input[ID], state: UserPoolState, opts: CustomResourceOptions): typings.pulumiAws.userPoolMod.UserPool = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userPoolMod.UserPool]
    
    /**
      * Returns true if the given object is an instance of UserPool.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPool.UserPool */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cognito/userPool.UserPool */ Boolean]
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
    
    @JSImport("@pulumi/aws", "cognito.UserPoolClient")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing UserPoolClient resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.userPoolClientMod.UserPoolClient = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userPoolClientMod.UserPoolClient]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.userPoolClientMod.UserPoolClient = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userPoolClientMod.UserPoolClient]
    inline def get(name: String, id: Input[ID], state: UserPoolClientState): typings.pulumiAws.userPoolClientMod.UserPoolClient = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userPoolClientMod.UserPoolClient]
    inline def get(name: String, id: Input[ID], state: UserPoolClientState, opts: CustomResourceOptions): typings.pulumiAws.userPoolClientMod.UserPoolClient = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userPoolClientMod.UserPoolClient]
    
    /**
      * Returns true if the given object is an instance of UserPoolClient.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolClient.UserPoolClient */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cognito/userPoolClient.UserPoolClient */ Boolean]
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
    
    @JSImport("@pulumi/aws", "cognito.UserPoolDomain")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing UserPoolDomain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiAws.userPoolDomainMod.UserPoolDomain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userPoolDomainMod.UserPoolDomain]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.userPoolDomainMod.UserPoolDomain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userPoolDomainMod.UserPoolDomain]
    inline def get(name: String, id: Input[ID], state: UserPoolDomainState): typings.pulumiAws.userPoolDomainMod.UserPoolDomain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userPoolDomainMod.UserPoolDomain]
    inline def get(name: String, id: Input[ID], state: UserPoolDomainState, opts: CustomResourceOptions): typings.pulumiAws.userPoolDomainMod.UserPoolDomain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.userPoolDomainMod.UserPoolDomain]
    
    /**
      * Returns true if the given object is an instance of UserPoolDomain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolDomain.UserPoolDomain */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/cognito/userPoolDomain.UserPoolDomain */ Boolean]
  }
  
  inline def getUserPools(args: GetUserPoolsArgs): js.Promise[GetUserPoolsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserPools")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetUserPoolsResult]]
  inline def getUserPools(args: GetUserPoolsArgs, opts: InvokeOptions): js.Promise[GetUserPoolsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUserPools")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetUserPoolsResult]]
}
