package typings.pulumiAws

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appmeshMod {
  
  @JSImport("@pulumi/aws/appmesh", "GatewayRoute")
  @js.native
  class GatewayRoute protected ()
    extends typings.pulumiAws.gatewayRouteMod.GatewayRoute {
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
  object GatewayRoute {
    
    @JSImport("@pulumi/aws/appmesh", "GatewayRoute")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing GatewayRoute resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.gatewayRouteMod.GatewayRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gatewayRouteMod.GatewayRoute]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.gatewayRouteMod.GatewayRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gatewayRouteMod.GatewayRoute]
    @scala.inline
    def get(name: String, id: Input[ID], state: GatewayRouteState): typings.pulumiAws.gatewayRouteMod.GatewayRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gatewayRouteMod.GatewayRoute]
    @scala.inline
    def get(name: String, id: Input[ID], state: GatewayRouteState, opts: CustomResourceOptions): typings.pulumiAws.gatewayRouteMod.GatewayRoute = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.gatewayRouteMod.GatewayRoute]
    
    /**
      * Returns true if the given object is an instance of GatewayRoute.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/gatewayRoute.GatewayRoute */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appmesh/gatewayRoute.GatewayRoute */ Boolean]
  }
  
  @JSImport("@pulumi/aws/appmesh", "Mesh")
  @js.native
  class Mesh protected ()
    extends typings.pulumiAws.meshMod.Mesh {
    /**
      * Create a Mesh resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: MeshArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: MeshArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Mesh {
    
    @JSImport("@pulumi/aws/appmesh", "Mesh")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Mesh resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.meshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.meshMod.Mesh]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.meshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.meshMod.Mesh]
    @scala.inline
    def get(name: String, id: Input[ID], state: MeshState): typings.pulumiAws.meshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.meshMod.Mesh]
    @scala.inline
    def get(name: String, id: Input[ID], state: MeshState, opts: CustomResourceOptions): typings.pulumiAws.meshMod.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.meshMod.Mesh]
    
    /**
      * Returns true if the given object is an instance of Mesh.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/mesh.Mesh */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appmesh/mesh.Mesh */ Boolean]
  }
  
  @JSImport("@pulumi/aws/appmesh", "Route")
  @js.native
  class Route protected ()
    extends typings.pulumiAws.appmeshRouteMod.Route {
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
    
    @JSImport("@pulumi/aws/appmesh", "Route")
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
    def get(name: String, id: Input[ID]): typings.pulumiAws.appmeshRouteMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.appmeshRouteMod.Route]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.appmeshRouteMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.appmeshRouteMod.Route]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteState): typings.pulumiAws.appmeshRouteMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.appmeshRouteMod.Route]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): typings.pulumiAws.appmeshRouteMod.Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.appmeshRouteMod.Route]
    
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/route.Route */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appmesh/route.Route */ Boolean]
  }
  
  @JSImport("@pulumi/aws/appmesh", "VirtualGateway")
  @js.native
  class VirtualGateway protected ()
    extends typings.pulumiAws.virtualGatewayMod.VirtualGateway {
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
  object VirtualGateway {
    
    @JSImport("@pulumi/aws/appmesh", "VirtualGateway")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VirtualGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.virtualGatewayMod.VirtualGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.virtualGatewayMod.VirtualGateway]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.virtualGatewayMod.VirtualGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.virtualGatewayMod.VirtualGateway]
    @scala.inline
    def get(name: String, id: Input[ID], state: VirtualGatewayState): typings.pulumiAws.virtualGatewayMod.VirtualGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.virtualGatewayMod.VirtualGateway]
    @scala.inline
    def get(name: String, id: Input[ID], state: VirtualGatewayState, opts: CustomResourceOptions): typings.pulumiAws.virtualGatewayMod.VirtualGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.virtualGatewayMod.VirtualGateway]
    
    /**
      * Returns true if the given object is an instance of VirtualGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualGateway.VirtualGateway */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appmesh/virtualGateway.VirtualGateway */ Boolean]
  }
  
  @JSImport("@pulumi/aws/appmesh", "VirtualNode")
  @js.native
  class VirtualNode protected ()
    extends typings.pulumiAws.virtualNodeMod.VirtualNode {
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
  object VirtualNode {
    
    @JSImport("@pulumi/aws/appmesh", "VirtualNode")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VirtualNode resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.virtualNodeMod.VirtualNode = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.virtualNodeMod.VirtualNode]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.virtualNodeMod.VirtualNode = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.virtualNodeMod.VirtualNode]
    @scala.inline
    def get(name: String, id: Input[ID], state: VirtualNodeState): typings.pulumiAws.virtualNodeMod.VirtualNode = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.virtualNodeMod.VirtualNode]
    @scala.inline
    def get(name: String, id: Input[ID], state: VirtualNodeState, opts: CustomResourceOptions): typings.pulumiAws.virtualNodeMod.VirtualNode = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.virtualNodeMod.VirtualNode]
    
    /**
      * Returns true if the given object is an instance of VirtualNode.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualNode.VirtualNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appmesh/virtualNode.VirtualNode */ Boolean]
  }
  
  @JSImport("@pulumi/aws/appmesh", "VirtualRouter")
  @js.native
  class VirtualRouter protected ()
    extends typings.pulumiAws.virtualRouterMod.VirtualRouter {
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
  object VirtualRouter {
    
    @JSImport("@pulumi/aws/appmesh", "VirtualRouter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VirtualRouter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.virtualRouterMod.VirtualRouter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.virtualRouterMod.VirtualRouter]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.virtualRouterMod.VirtualRouter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.virtualRouterMod.VirtualRouter]
    @scala.inline
    def get(name: String, id: Input[ID], state: VirtualRouterState): typings.pulumiAws.virtualRouterMod.VirtualRouter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.virtualRouterMod.VirtualRouter]
    @scala.inline
    def get(name: String, id: Input[ID], state: VirtualRouterState, opts: CustomResourceOptions): typings.pulumiAws.virtualRouterMod.VirtualRouter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.virtualRouterMod.VirtualRouter]
    
    /**
      * Returns true if the given object is an instance of VirtualRouter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualRouter.VirtualRouter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appmesh/virtualRouter.VirtualRouter */ Boolean]
  }
  
  @JSImport("@pulumi/aws/appmesh", "VirtualService")
  @js.native
  class VirtualService protected ()
    extends typings.pulumiAws.virtualServiceMod.VirtualService {
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
  object VirtualService {
    
    @JSImport("@pulumi/aws/appmesh", "VirtualService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VirtualService resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.virtualServiceMod.VirtualService = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.virtualServiceMod.VirtualService]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.virtualServiceMod.VirtualService = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.virtualServiceMod.VirtualService]
    @scala.inline
    def get(name: String, id: Input[ID], state: VirtualServiceState): typings.pulumiAws.virtualServiceMod.VirtualService = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.virtualServiceMod.VirtualService]
    @scala.inline
    def get(name: String, id: Input[ID], state: VirtualServiceState, opts: CustomResourceOptions): typings.pulumiAws.virtualServiceMod.VirtualService = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.virtualServiceMod.VirtualService]
    
    /**
      * Returns true if the given object is an instance of VirtualService.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualService.VirtualService */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/appmesh/virtualService.VirtualService */ Boolean]
  }
}
