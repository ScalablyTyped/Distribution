package typings.pulumiAws.mod

import typings.pulumiAws.appmeshRouteMod.RouteArgs
import typings.pulumiAws.appmeshRouteMod.RouteState
import typings.pulumiAws.gatewayRouteMod.GatewayRouteArgs
import typings.pulumiAws.gatewayRouteMod.GatewayRouteState
import typings.pulumiAws.meshMod.MeshArgs
import typings.pulumiAws.meshMod.MeshState
import typings.pulumiAws.virtualGatewayMod.VirtualGatewayArgs
import typings.pulumiAws.virtualGatewayMod.VirtualGatewayState
import typings.pulumiAws.virtualNodeMod.VirtualNodeArgs
import typings.pulumiAws.virtualNodeMod.VirtualNodeState
import typings.pulumiAws.virtualRouterMod.VirtualRouterArgs
import typings.pulumiAws.virtualRouterMod.VirtualRouterState
import typings.pulumiAws.virtualServiceMod.VirtualServiceArgs
import typings.pulumiAws.virtualServiceMod.VirtualServiceState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "appmesh")
@js.native
object appmesh extends js.Object {
  
  @js.native
  class GatewayRoute protected ()
    extends typings.pulumiAws.appmeshMod.GatewayRoute {
    /**
      * Create a GatewayRoute resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GatewayRouteArgs) = this()
    def this(name: String, args: GatewayRouteArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object GatewayRoute extends js.Object {
    
    /**
      * Get an existing GatewayRoute resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.gatewayRouteMod.GatewayRoute = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.gatewayRouteMod.GatewayRoute = js.native
    def get(name: String, id: Input[ID], state: GatewayRouteState): typings.pulumiAws.gatewayRouteMod.GatewayRoute = js.native
    def get(name: String, id: Input[ID], state: GatewayRouteState, opts: CustomResourceOptions): typings.pulumiAws.gatewayRouteMod.GatewayRoute = js.native
    
    /**
      * Returns true if the given object is an instance of GatewayRoute.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/gatewayRoute.GatewayRoute */ Boolean = js.native
  }
  
  @js.native
  class Mesh protected ()
    extends typings.pulumiAws.appmeshMod.Mesh {
    /**
      * Create a Mesh resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: MeshArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: MeshArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object Mesh extends js.Object {
    
    /**
      * Get an existing Mesh resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.meshMod.Mesh = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.meshMod.Mesh = js.native
    def get(name: String, id: Input[ID], state: MeshState): typings.pulumiAws.meshMod.Mesh = js.native
    def get(name: String, id: Input[ID], state: MeshState, opts: CustomResourceOptions): typings.pulumiAws.meshMod.Mesh = js.native
    
    /**
      * Returns true if the given object is an instance of Mesh.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/mesh.Mesh */ Boolean = js.native
  }
  
  @js.native
  class Route protected ()
    extends typings.pulumiAws.appmeshMod.Route {
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
  @js.native
  object Route extends js.Object {
    
    /**
      * Get an existing Route resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.appmeshRouteMod.Route = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.appmeshRouteMod.Route = js.native
    def get(name: String, id: Input[ID], state: RouteState): typings.pulumiAws.appmeshRouteMod.Route = js.native
    def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): typings.pulumiAws.appmeshRouteMod.Route = js.native
    
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/route.Route */ Boolean = js.native
  }
  
  @js.native
  class VirtualGateway protected ()
    extends typings.pulumiAws.appmeshMod.VirtualGateway {
    /**
      * Create a VirtualGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VirtualGatewayArgs) = this()
    def this(name: String, args: VirtualGatewayArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object VirtualGateway extends js.Object {
    
    /**
      * Get an existing VirtualGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.virtualGatewayMod.VirtualGateway = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.virtualGatewayMod.VirtualGateway = js.native
    def get(name: String, id: Input[ID], state: VirtualGatewayState): typings.pulumiAws.virtualGatewayMod.VirtualGateway = js.native
    def get(name: String, id: Input[ID], state: VirtualGatewayState, opts: CustomResourceOptions): typings.pulumiAws.virtualGatewayMod.VirtualGateway = js.native
    
    /**
      * Returns true if the given object is an instance of VirtualGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualGateway.VirtualGateway */ Boolean = js.native
  }
  
  @js.native
  class VirtualNode protected ()
    extends typings.pulumiAws.appmeshMod.VirtualNode {
    /**
      * Create a VirtualNode resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VirtualNodeArgs) = this()
    def this(name: String, args: VirtualNodeArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object VirtualNode extends js.Object {
    
    /**
      * Get an existing VirtualNode resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.virtualNodeMod.VirtualNode = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.virtualNodeMod.VirtualNode = js.native
    def get(name: String, id: Input[ID], state: VirtualNodeState): typings.pulumiAws.virtualNodeMod.VirtualNode = js.native
    def get(name: String, id: Input[ID], state: VirtualNodeState, opts: CustomResourceOptions): typings.pulumiAws.virtualNodeMod.VirtualNode = js.native
    
    /**
      * Returns true if the given object is an instance of VirtualNode.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualNode.VirtualNode */ Boolean = js.native
  }
  
  @js.native
  class VirtualRouter protected ()
    extends typings.pulumiAws.appmeshMod.VirtualRouter {
    /**
      * Create a VirtualRouter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VirtualRouterArgs) = this()
    def this(name: String, args: VirtualRouterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object VirtualRouter extends js.Object {
    
    /**
      * Get an existing VirtualRouter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.virtualRouterMod.VirtualRouter = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.virtualRouterMod.VirtualRouter = js.native
    def get(name: String, id: Input[ID], state: VirtualRouterState): typings.pulumiAws.virtualRouterMod.VirtualRouter = js.native
    def get(name: String, id: Input[ID], state: VirtualRouterState, opts: CustomResourceOptions): typings.pulumiAws.virtualRouterMod.VirtualRouter = js.native
    
    /**
      * Returns true if the given object is an instance of VirtualRouter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualRouter.VirtualRouter */ Boolean = js.native
  }
  
  @js.native
  class VirtualService protected ()
    extends typings.pulumiAws.appmeshMod.VirtualService {
    /**
      * Create a VirtualService resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VirtualServiceArgs) = this()
    def this(name: String, args: VirtualServiceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  @js.native
  object VirtualService extends js.Object {
    
    /**
      * Get an existing VirtualService resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.virtualServiceMod.VirtualService = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.virtualServiceMod.VirtualService = js.native
    def get(name: String, id: Input[ID], state: VirtualServiceState): typings.pulumiAws.virtualServiceMod.VirtualService = js.native
    def get(name: String, id: Input[ID], state: VirtualServiceState, opts: CustomResourceOptions): typings.pulumiAws.virtualServiceMod.VirtualService = js.native
    
    /**
      * Returns true if the given object is an instance of VirtualService.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualService.VirtualService */ Boolean = js.native
  }
}
