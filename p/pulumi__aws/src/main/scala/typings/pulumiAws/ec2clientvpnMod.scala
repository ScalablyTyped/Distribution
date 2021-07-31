package typings.pulumiAws

import typings.pulumiAws.authorizationRuleMod.AuthorizationRuleArgs
import typings.pulumiAws.authorizationRuleMod.AuthorizationRuleState
import typings.pulumiAws.ec2clientvpnEndpointMod.EndpointArgs
import typings.pulumiAws.ec2clientvpnEndpointMod.EndpointState
import typings.pulumiAws.ec2clientvpnRouteMod.RouteArgs
import typings.pulumiAws.ec2clientvpnRouteMod.RouteState
import typings.pulumiAws.networkAssociationMod.NetworkAssociationArgs
import typings.pulumiAws.networkAssociationMod.NetworkAssociationState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ec2clientvpnMod {
  
  @JSImport("@pulumi/aws/ec2clientvpn", "AuthorizationRule")
  @js.native
  class AuthorizationRule protected ()
    extends typings.pulumiAws.authorizationRuleMod.AuthorizationRule {
    /**
      * Create a AuthorizationRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AuthorizationRuleArgs) = this()
    def this(name: String, args: AuthorizationRuleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object AuthorizationRule {
    
    @JSImport("@pulumi/aws/ec2clientvpn", "AuthorizationRule")
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
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.authorizationRuleMod.AuthorizationRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.authorizationRuleMod.AuthorizationRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.authorizationRuleMod.AuthorizationRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.authorizationRuleMod.AuthorizationRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: AuthorizationRuleState): typings.pulumiAws.authorizationRuleMod.AuthorizationRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.authorizationRuleMod.AuthorizationRule]
    @scala.inline
    def get(name: String, id: Input[ID], state: AuthorizationRuleState, opts: CustomResourceOptions): typings.pulumiAws.authorizationRuleMod.AuthorizationRule = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.authorizationRuleMod.AuthorizationRule]
    
    /**
      * Returns true if the given object is an instance of AuthorizationRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/authorizationRule.AuthorizationRule */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2clientvpn/authorizationRule.AuthorizationRule */ Boolean]
  }
  
  @JSImport("@pulumi/aws/ec2clientvpn", "Endpoint")
  @js.native
  class Endpoint protected ()
    extends typings.pulumiAws.ec2clientvpnEndpointMod.Endpoint {
    /**
      * Create a Endpoint resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EndpointArgs) = this()
    def this(name: String, args: EndpointArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Endpoint {
    
    @JSImport("@pulumi/aws/ec2clientvpn", "Endpoint")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Endpoint resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.ec2clientvpnEndpointMod.Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ec2clientvpnEndpointMod.Endpoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.ec2clientvpnEndpointMod.Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ec2clientvpnEndpointMod.Endpoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: EndpointState): typings.pulumiAws.ec2clientvpnEndpointMod.Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ec2clientvpnEndpointMod.Endpoint]
    @scala.inline
    def get(name: String, id: Input[ID], state: EndpointState, opts: CustomResourceOptions): typings.pulumiAws.ec2clientvpnEndpointMod.Endpoint = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ec2clientvpnEndpointMod.Endpoint]
    
    /**
      * Returns true if the given object is an instance of Endpoint.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/endpoint.Endpoint */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2clientvpn/endpoint.Endpoint */ Boolean]
  }
  
  @JSImport("@pulumi/aws/ec2clientvpn", "NetworkAssociation")
  @js.native
  class NetworkAssociation protected ()
    extends typings.pulumiAws.networkAssociationMod.NetworkAssociation {
    /**
      * Create a NetworkAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NetworkAssociationArgs) = this()
    def this(name: String, args: NetworkAssociationArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object NetworkAssociation {
    
    @JSImport("@pulumi/aws/ec2clientvpn", "NetworkAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing NetworkAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.networkAssociationMod.NetworkAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.networkAssociationMod.NetworkAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.networkAssociationMod.NetworkAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.networkAssociationMod.NetworkAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: NetworkAssociationState): typings.pulumiAws.networkAssociationMod.NetworkAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.networkAssociationMod.NetworkAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: NetworkAssociationState, opts: CustomResourceOptions): typings.pulumiAws.networkAssociationMod.NetworkAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.networkAssociationMod.NetworkAssociation]
    
    /**
      * Returns true if the given object is an instance of NetworkAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/networkAssociation.NetworkAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2clientvpn/networkAssociation.NetworkAssociation */ Boolean]
  }
  
  @JSImport("@pulumi/aws/ec2clientvpn", "Route")
  @js.native
  class Route protected ()
    extends typings.pulumiAws.ec2clientvpnRouteMod.Route {
    /**
      * Create a Route resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteArgs) = this()
    def this(name: String, args: RouteArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Route {
    
    @JSImport("@pulumi/aws/ec2clientvpn", "Route")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Route resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.ec2clientvpnRouteMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ec2clientvpnRouteMod.Route]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.ec2clientvpnRouteMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ec2clientvpnRouteMod.Route]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteState): typings.pulumiAws.ec2clientvpnRouteMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ec2clientvpnRouteMod.Route]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): typings.pulumiAws.ec2clientvpnRouteMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.ec2clientvpnRouteMod.Route]
    
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/route.Route */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2clientvpn/route.Route */ Boolean]
  }
}
