package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.appmeshMeshMod.MeshArgs
import typings.atPulumiAws.appmeshMeshMod.MeshState
import typings.atPulumiAws.appmeshRouteMod.RouteArgs
import typings.atPulumiAws.appmeshRouteMod.RouteState
import typings.atPulumiAws.appmeshVirtualNodeMod.VirtualNodeArgs
import typings.atPulumiAws.appmeshVirtualNodeMod.VirtualNodeState
import typings.atPulumiAws.appmeshVirtualRouterMod.VirtualRouterArgs
import typings.atPulumiAws.appmeshVirtualRouterMod.VirtualRouterState
import typings.atPulumiAws.appmeshVirtualServiceMod.VirtualServiceArgs
import typings.atPulumiAws.appmeshVirtualServiceMod.VirtualServiceState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "appmesh")
@js.native
object appmeshNs extends js.Object {
  @js.native
  class Mesh protected ()
    extends typings.atPulumiAws.appmeshMod.Mesh {
    /**
      * Create a Mesh resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: MeshArgs) = this()
    def this(name: String, args: MeshArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Route protected ()
    extends typings.atPulumiAws.appmeshMod.Route {
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
  
  @js.native
  class VirtualNode protected ()
    extends typings.atPulumiAws.appmeshMod.VirtualNode {
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
  
  @js.native
  class VirtualRouter protected ()
    extends typings.atPulumiAws.appmeshMod.VirtualRouter {
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
  
  @js.native
  class VirtualService protected ()
    extends typings.atPulumiAws.appmeshMod.VirtualService {
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
  object Mesh extends js.Object {
    /**
      * Get an existing Mesh resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.appmeshMeshMod.Mesh = js.native
    def get(name: String, id: Input[ID], state: MeshState): typings.atPulumiAws.appmeshMeshMod.Mesh = js.native
    def get(name: String, id: Input[ID], state: MeshState, opts: CustomResourceOptions): typings.atPulumiAws.appmeshMeshMod.Mesh = js.native
    /**
      * Returns true if the given object is an instance of Mesh.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/mesh.Mesh */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.appmeshRouteMod.Route = js.native
    def get(name: String, id: Input[ID], state: RouteState): typings.atPulumiAws.appmeshRouteMod.Route = js.native
    def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): typings.atPulumiAws.appmeshRouteMod.Route = js.native
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/route.Route */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.appmeshVirtualNodeMod.VirtualNode = js.native
    def get(name: String, id: Input[ID], state: VirtualNodeState): typings.atPulumiAws.appmeshVirtualNodeMod.VirtualNode = js.native
    def get(name: String, id: Input[ID], state: VirtualNodeState, opts: CustomResourceOptions): typings.atPulumiAws.appmeshVirtualNodeMod.VirtualNode = js.native
    /**
      * Returns true if the given object is an instance of VirtualNode.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualNode.VirtualNode */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.appmeshVirtualRouterMod.VirtualRouter = js.native
    def get(name: String, id: Input[ID], state: VirtualRouterState): typings.atPulumiAws.appmeshVirtualRouterMod.VirtualRouter = js.native
    def get(name: String, id: Input[ID], state: VirtualRouterState, opts: CustomResourceOptions): typings.atPulumiAws.appmeshVirtualRouterMod.VirtualRouter = js.native
    /**
      * Returns true if the given object is an instance of VirtualRouter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualRouter.VirtualRouter */ Boolean = js.native
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
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.appmeshVirtualServiceMod.VirtualService = js.native
    def get(name: String, id: Input[ID], state: VirtualServiceState): typings.atPulumiAws.appmeshVirtualServiceMod.VirtualService = js.native
    def get(name: String, id: Input[ID], state: VirtualServiceState, opts: CustomResourceOptions): typings.atPulumiAws.appmeshVirtualServiceMod.VirtualService = js.native
    /**
      * Returns true if the given object is an instance of VirtualService.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualService.VirtualService */ Boolean = js.native
  }
  
}

