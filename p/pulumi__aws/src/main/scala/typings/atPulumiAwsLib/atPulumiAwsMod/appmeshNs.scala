package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "appmesh")
@js.native
object appmeshNs extends js.Object {
  @js.native
  class Mesh protected ()
    extends atPulumiAwsLib.appmeshMod.Mesh {
    /**
      * Create a Mesh resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.appmeshMeshMod.MeshArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.appmeshMeshMod.MeshArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Route protected ()
    extends atPulumiAwsLib.appmeshMod.Route {
    /**
      * Create a Route resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.appmeshRouteMod.RouteArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.appmeshRouteMod.RouteArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VirtualNode protected ()
    extends atPulumiAwsLib.appmeshMod.VirtualNode {
    /**
      * Create a VirtualNode resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNodeArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNodeArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VirtualRouter protected ()
    extends atPulumiAwsLib.appmeshMod.VirtualRouter {
    /**
      * Create a VirtualRouter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouterArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class VirtualService protected ()
    extends atPulumiAwsLib.appmeshMod.VirtualService {
    /**
      * Create a VirtualService resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.appmeshVirtualServiceMod.VirtualServiceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.appmeshVirtualServiceMod.VirtualServiceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.appmeshMeshMod.Mesh = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.appmeshMeshMod.MeshState
    ): atPulumiAwsLib.appmeshMeshMod.Mesh = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.appmeshMeshMod.MeshState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.appmeshMeshMod.Mesh = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.appmeshRouteMod.Route = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.appmeshRouteMod.RouteState
    ): atPulumiAwsLib.appmeshRouteMod.Route = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.appmeshRouteMod.RouteState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.appmeshRouteMod.Route = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNode = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNodeState
    ): atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNode = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNodeState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.appmeshVirtualNodeMod.VirtualNode = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouter = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouterState
    ): atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouter = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouterState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.appmeshVirtualRouterMod.VirtualRouter = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.appmeshVirtualServiceMod.VirtualService = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.appmeshVirtualServiceMod.VirtualServiceState
    ): atPulumiAwsLib.appmeshVirtualServiceMod.VirtualService = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.appmeshVirtualServiceMod.VirtualServiceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.appmeshVirtualServiceMod.VirtualService = js.native
  }
  
}

