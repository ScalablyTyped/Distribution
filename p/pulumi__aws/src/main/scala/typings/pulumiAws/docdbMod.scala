package typings.pulumiAws

import typings.pulumiAws.clusterInstanceMod.ClusterInstanceArgs
import typings.pulumiAws.clusterInstanceMod.ClusterInstanceState
import typings.pulumiAws.clusterParameterGroupMod.ClusterParameterGroupArgs
import typings.pulumiAws.clusterParameterGroupMod.ClusterParameterGroupState
import typings.pulumiAws.clusterSnapshotMod.ClusterSnapshotArgs
import typings.pulumiAws.clusterSnapshotMod.ClusterSnapshotState
import typings.pulumiAws.docdbClusterMod.ClusterArgs
import typings.pulumiAws.docdbClusterMod.ClusterState
import typings.pulumiAws.docdbSubnetGroupMod.SubnetGroupArgs
import typings.pulumiAws.docdbSubnetGroupMod.SubnetGroupState
import typings.pulumiAws.getEngineVersionMod.GetEngineVersionArgs
import typings.pulumiAws.getEngineVersionMod.GetEngineVersionResult
import typings.pulumiAws.getOrderableDbInstanceMod.GetOrderableDbInstanceArgs
import typings.pulumiAws.getOrderableDbInstanceMod.GetOrderableDbInstanceResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docdbMod {
  
  @JSImport("@pulumi/aws/docdb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws/docdb", "Cluster")
  @js.native
  class Cluster protected ()
    extends typings.pulumiAws.docdbClusterMod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Cluster {
    
    @JSImport("@pulumi/aws/docdb", "Cluster")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.docdbClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.docdbClusterMod.Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.docdbClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.docdbClusterMod.Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterState): typings.pulumiAws.docdbClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.docdbClusterMod.Cluster]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typings.pulumiAws.docdbClusterMod.Cluster = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.docdbClusterMod.Cluster]
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/cluster.Cluster */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/docdb/cluster.Cluster */ Boolean]
  }
  
  @JSImport("@pulumi/aws/docdb", "ClusterInstance")
  @js.native
  class ClusterInstance protected ()
    extends typings.pulumiAws.clusterInstanceMod.ClusterInstance {
    /**
      * Create a ClusterInstance resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterInstanceArgs) = this()
    def this(name: String, args: ClusterInstanceArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterInstance {
    
    @JSImport("@pulumi/aws/docdb", "ClusterInstance")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterInstance resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.clusterInstanceMod.ClusterInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clusterInstanceMod.ClusterInstance]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.clusterInstanceMod.ClusterInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clusterInstanceMod.ClusterInstance]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterInstanceState): typings.pulumiAws.clusterInstanceMod.ClusterInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clusterInstanceMod.ClusterInstance]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterInstanceState, opts: CustomResourceOptions): typings.pulumiAws.clusterInstanceMod.ClusterInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clusterInstanceMod.ClusterInstance]
    
    /**
      * Returns true if the given object is an instance of ClusterInstance.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/clusterInstance.ClusterInstance */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/docdb/clusterInstance.ClusterInstance */ Boolean]
  }
  
  @JSImport("@pulumi/aws/docdb", "ClusterParameterGroup")
  @js.native
  class ClusterParameterGroup protected ()
    extends typings.pulumiAws.clusterParameterGroupMod.ClusterParameterGroup {
    /**
      * Create a ClusterParameterGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterParameterGroupArgs) = this()
    def this(name: String, args: ClusterParameterGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterParameterGroup {
    
    @JSImport("@pulumi/aws/docdb", "ClusterParameterGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterParameterGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.clusterParameterGroupMod.ClusterParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clusterParameterGroupMod.ClusterParameterGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.clusterParameterGroupMod.ClusterParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clusterParameterGroupMod.ClusterParameterGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState): typings.pulumiAws.clusterParameterGroupMod.ClusterParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clusterParameterGroupMod.ClusterParameterGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterParameterGroupState, opts: CustomResourceOptions): typings.pulumiAws.clusterParameterGroupMod.ClusterParameterGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clusterParameterGroupMod.ClusterParameterGroup]
    
    /**
      * Returns true if the given object is an instance of ClusterParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/clusterParameterGroup.ClusterParameterGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/docdb/clusterParameterGroup.ClusterParameterGroup */ Boolean]
  }
  
  @JSImport("@pulumi/aws/docdb", "ClusterSnapshot")
  @js.native
  class ClusterSnapshot protected ()
    extends typings.pulumiAws.clusterSnapshotMod.ClusterSnapshot {
    /**
      * Create a ClusterSnapshot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterSnapshotArgs) = this()
    def this(name: String, args: ClusterSnapshotArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterSnapshot {
    
    @JSImport("@pulumi/aws/docdb", "ClusterSnapshot")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterSnapshot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.clusterSnapshotMod.ClusterSnapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clusterSnapshotMod.ClusterSnapshot]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.clusterSnapshotMod.ClusterSnapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clusterSnapshotMod.ClusterSnapshot]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterSnapshotState): typings.pulumiAws.clusterSnapshotMod.ClusterSnapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clusterSnapshotMod.ClusterSnapshot]
    @scala.inline
    def get(name: String, id: Input[ID], state: ClusterSnapshotState, opts: CustomResourceOptions): typings.pulumiAws.clusterSnapshotMod.ClusterSnapshot = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.clusterSnapshotMod.ClusterSnapshot]
    
    /**
      * Returns true if the given object is an instance of ClusterSnapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/clusterSnapshot.ClusterSnapshot */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/docdb/clusterSnapshot.ClusterSnapshot */ Boolean]
  }
  
  @JSImport("@pulumi/aws/docdb", "SubnetGroup")
  @js.native
  class SubnetGroup protected ()
    extends typings.pulumiAws.docdbSubnetGroupMod.SubnetGroup {
    /**
      * Create a SubnetGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SubnetGroupArgs) = this()
    def this(name: String, args: SubnetGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SubnetGroup {
    
    @JSImport("@pulumi/aws/docdb", "SubnetGroup")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing SubnetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.docdbSubnetGroupMod.SubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.docdbSubnetGroupMod.SubnetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.docdbSubnetGroupMod.SubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.docdbSubnetGroupMod.SubnetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: SubnetGroupState): typings.pulumiAws.docdbSubnetGroupMod.SubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.docdbSubnetGroupMod.SubnetGroup]
    @scala.inline
    def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): typings.pulumiAws.docdbSubnetGroupMod.SubnetGroup = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.docdbSubnetGroupMod.SubnetGroup]
    
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/subnetGroup.SubnetGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/docdb/subnetGroup.SubnetGroup */ Boolean]
  }
  
  @scala.inline
  def getEngineVersion(): js.Promise[GetEngineVersionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEngineVersion")().asInstanceOf[js.Promise[GetEngineVersionResult]]
  @scala.inline
  def getEngineVersion(args: Unit, opts: InvokeOptions): js.Promise[GetEngineVersionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEngineVersion")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetEngineVersionResult]]
  @scala.inline
  def getEngineVersion(args: GetEngineVersionArgs): js.Promise[GetEngineVersionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEngineVersion")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetEngineVersionResult]]
  @scala.inline
  def getEngineVersion(args: GetEngineVersionArgs, opts: InvokeOptions): js.Promise[GetEngineVersionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getEngineVersion")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetEngineVersionResult]]
  
  @scala.inline
  def getOrderableDbInstance(): js.Promise[GetOrderableDbInstanceResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableDbInstance")().asInstanceOf[js.Promise[GetOrderableDbInstanceResult]]
  @scala.inline
  def getOrderableDbInstance(args: Unit, opts: InvokeOptions): js.Promise[GetOrderableDbInstanceResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableDbInstance")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOrderableDbInstanceResult]]
  @scala.inline
  def getOrderableDbInstance(args: GetOrderableDbInstanceArgs): js.Promise[GetOrderableDbInstanceResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableDbInstance")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetOrderableDbInstanceResult]]
  @scala.inline
  def getOrderableDbInstance(args: GetOrderableDbInstanceArgs, opts: InvokeOptions): js.Promise[GetOrderableDbInstanceResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrderableDbInstance")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOrderableDbInstanceResult]]
}
