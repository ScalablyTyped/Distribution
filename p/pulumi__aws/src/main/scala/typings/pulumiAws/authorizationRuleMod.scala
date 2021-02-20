package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authorizationRuleMod {
  
  @JSImport("@pulumi/aws/ec2clientvpn/authorizationRule", "AuthorizationRule")
  @js.native
  class AuthorizationRule protected () extends CustomResource {
    /**
      * Create a AuthorizationRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AuthorizationRuleArgs) = this()
    def this(name: String, args: AuthorizationRuleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ID of the group to which the authorization rule grants access. One of `accessGroupId` or `authorizeAllGroups` must be set.
      */
    val accessGroupId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Indicates whether the authorization rule grants access to all clients. One of `accessGroupId` or `authorizeAllGroups` must be set.
      */
    val authorizeAllGroups: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The ID of the Client VPN endpoint.
      */
    val clientVpnEndpointId: Output_[String] = js.native
    
    /**
      * A brief description of the authorization rule.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The IPv4 address range, in CIDR notation, of the network to which the authorization rule applies.
      */
    val targetNetworkCidr: Output_[String] = js.native
  }
  /* static members */
  object AuthorizationRule {
    
    /**
      * Get an existing AuthorizationRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2clientvpn/authorizationRule", "AuthorizationRule.get")
    @js.native
    def get(name: String, id: Input[ID]): AuthorizationRule = js.native
    @JSImport("@pulumi/aws/ec2clientvpn/authorizationRule", "AuthorizationRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AuthorizationRule = js.native
    @JSImport("@pulumi/aws/ec2clientvpn/authorizationRule", "AuthorizationRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: AuthorizationRuleState): AuthorizationRule = js.native
    @JSImport("@pulumi/aws/ec2clientvpn/authorizationRule", "AuthorizationRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: AuthorizationRuleState, opts: CustomResourceOptions): AuthorizationRule = js.native
    
    /**
      * Returns true if the given object is an instance of AuthorizationRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2clientvpn/authorizationRule", "AuthorizationRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/authorizationRule.AuthorizationRule */ Boolean = js.native
  }
  
  @js.native
  trait AuthorizationRuleArgs extends StObject {
    
    /**
      * The ID of the group to which the authorization rule grants access. One of `accessGroupId` or `authorizeAllGroups` must be set.
      */
    val accessGroupId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Indicates whether the authorization rule grants access to all clients. One of `accessGroupId` or `authorizeAllGroups` must be set.
      */
    val authorizeAllGroups: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The ID of the Client VPN endpoint.
      */
    val clientVpnEndpointId: Input[String] = js.native
    
    /**
      * A brief description of the authorization rule.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IPv4 address range, in CIDR notation, of the network to which the authorization rule applies.
      */
    val targetNetworkCidr: Input[String] = js.native
  }
  object AuthorizationRuleArgs {
    
    @scala.inline
    def apply(clientVpnEndpointId: Input[String], targetNetworkCidr: Input[String]): AuthorizationRuleArgs = {
      val __obj = js.Dynamic.literal(clientVpnEndpointId = clientVpnEndpointId.asInstanceOf[js.Any], targetNetworkCidr = targetNetworkCidr.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationRuleArgs]
    }
    
    @scala.inline
    implicit class AuthorizationRuleArgsMutableBuilder[Self <: AuthorizationRuleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessGroupId(value: Input[String]): Self = StObject.set(x, "accessGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessGroupIdUndefined: Self = StObject.set(x, "accessGroupId", js.undefined)
      
      @scala.inline
      def setAuthorizeAllGroups(value: Input[Boolean]): Self = StObject.set(x, "authorizeAllGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizeAllGroupsUndefined: Self = StObject.set(x, "authorizeAllGroups", js.undefined)
      
      @scala.inline
      def setClientVpnEndpointId(value: Input[String]): Self = StObject.set(x, "clientVpnEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setTargetNetworkCidr(value: Input[String]): Self = StObject.set(x, "targetNetworkCidr", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AuthorizationRuleState extends StObject {
    
    /**
      * The ID of the group to which the authorization rule grants access. One of `accessGroupId` or `authorizeAllGroups` must be set.
      */
    val accessGroupId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Indicates whether the authorization rule grants access to all clients. One of `accessGroupId` or `authorizeAllGroups` must be set.
      */
    val authorizeAllGroups: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The ID of the Client VPN endpoint.
      */
    val clientVpnEndpointId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A brief description of the authorization rule.
      */
    val description: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IPv4 address range, in CIDR notation, of the network to which the authorization rule applies.
      */
    val targetNetworkCidr: js.UndefOr[Input[String]] = js.native
  }
  object AuthorizationRuleState {
    
    @scala.inline
    def apply(): AuthorizationRuleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationRuleState]
    }
    
    @scala.inline
    implicit class AuthorizationRuleStateMutableBuilder[Self <: AuthorizationRuleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessGroupId(value: Input[String]): Self = StObject.set(x, "accessGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessGroupIdUndefined: Self = StObject.set(x, "accessGroupId", js.undefined)
      
      @scala.inline
      def setAuthorizeAllGroups(value: Input[Boolean]): Self = StObject.set(x, "authorizeAllGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizeAllGroupsUndefined: Self = StObject.set(x, "authorizeAllGroups", js.undefined)
      
      @scala.inline
      def setClientVpnEndpointId(value: Input[String]): Self = StObject.set(x, "clientVpnEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientVpnEndpointIdUndefined: Self = StObject.set(x, "clientVpnEndpointId", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setTargetNetworkCidr(value: Input[String]): Self = StObject.set(x, "targetNetworkCidr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNetworkCidrUndefined: Self = StObject.set(x, "targetNetworkCidr", js.undefined)
    }
  }
}
