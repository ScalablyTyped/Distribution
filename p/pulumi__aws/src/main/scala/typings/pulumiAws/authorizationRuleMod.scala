package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/ec2clientvpn/authorizationRule", "AuthorizationRule")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing AuthorizationRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): AuthorizationRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[AuthorizationRule]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): AuthorizationRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AuthorizationRule]
    inline def get(name: String, id: Input[ID], state: AuthorizationRuleState): AuthorizationRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[AuthorizationRule]
    inline def get(name: String, id: Input[ID], state: AuthorizationRuleState, opts: CustomResourceOptions): AuthorizationRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AuthorizationRule]
    
    /**
      * Returns true if the given object is an instance of AuthorizationRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/authorizationRule.AuthorizationRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2clientvpn/authorizationRule.AuthorizationRule */ Boolean]
  }
  
  trait AuthorizationRuleArgs extends StObject {
    
    /**
      * The ID of the group to which the authorization rule grants access. One of `accessGroupId` or `authorizeAllGroups` must be set.
      */
    val accessGroupId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether the authorization rule grants access to all clients. One of `accessGroupId` or `authorizeAllGroups` must be set.
      */
    val authorizeAllGroups: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The ID of the Client VPN endpoint.
      */
    val clientVpnEndpointId: Input[String]
    
    /**
      * A brief description of the authorization rule.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IPv4 address range, in CIDR notation, of the network to which the authorization rule applies.
      */
    val targetNetworkCidr: Input[String]
  }
  object AuthorizationRuleArgs {
    
    inline def apply(clientVpnEndpointId: Input[String], targetNetworkCidr: Input[String]): AuthorizationRuleArgs = {
      val __obj = js.Dynamic.literal(clientVpnEndpointId = clientVpnEndpointId.asInstanceOf[js.Any], targetNetworkCidr = targetNetworkCidr.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthorizationRuleArgs]
    }
    
    extension [Self <: AuthorizationRuleArgs](x: Self) {
      
      inline def setAccessGroupId(value: Input[String]): Self = StObject.set(x, "accessGroupId", value.asInstanceOf[js.Any])
      
      inline def setAccessGroupIdUndefined: Self = StObject.set(x, "accessGroupId", js.undefined)
      
      inline def setAuthorizeAllGroups(value: Input[Boolean]): Self = StObject.set(x, "authorizeAllGroups", value.asInstanceOf[js.Any])
      
      inline def setAuthorizeAllGroupsUndefined: Self = StObject.set(x, "authorizeAllGroups", js.undefined)
      
      inline def setClientVpnEndpointId(value: Input[String]): Self = StObject.set(x, "clientVpnEndpointId", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setTargetNetworkCidr(value: Input[String]): Self = StObject.set(x, "targetNetworkCidr", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthorizationRuleState extends StObject {
    
    /**
      * The ID of the group to which the authorization rule grants access. One of `accessGroupId` or `authorizeAllGroups` must be set.
      */
    val accessGroupId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates whether the authorization rule grants access to all clients. One of `accessGroupId` or `authorizeAllGroups` must be set.
      */
    val authorizeAllGroups: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The ID of the Client VPN endpoint.
      */
    val clientVpnEndpointId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A brief description of the authorization rule.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IPv4 address range, in CIDR notation, of the network to which the authorization rule applies.
      */
    val targetNetworkCidr: js.UndefOr[Input[String]] = js.undefined
  }
  object AuthorizationRuleState {
    
    inline def apply(): AuthorizationRuleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthorizationRuleState]
    }
    
    extension [Self <: AuthorizationRuleState](x: Self) {
      
      inline def setAccessGroupId(value: Input[String]): Self = StObject.set(x, "accessGroupId", value.asInstanceOf[js.Any])
      
      inline def setAccessGroupIdUndefined: Self = StObject.set(x, "accessGroupId", js.undefined)
      
      inline def setAuthorizeAllGroups(value: Input[Boolean]): Self = StObject.set(x, "authorizeAllGroups", value.asInstanceOf[js.Any])
      
      inline def setAuthorizeAllGroupsUndefined: Self = StObject.set(x, "authorizeAllGroups", js.undefined)
      
      inline def setClientVpnEndpointId(value: Input[String]): Self = StObject.set(x, "clientVpnEndpointId", value.asInstanceOf[js.Any])
      
      inline def setClientVpnEndpointIdUndefined: Self = StObject.set(x, "clientVpnEndpointId", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setTargetNetworkCidr(value: Input[String]): Self = StObject.set(x, "targetNetworkCidr", value.asInstanceOf[js.Any])
      
      inline def setTargetNetworkCidrUndefined: Self = StObject.set(x, "targetNetworkCidr", js.undefined)
    }
  }
}
