package typings.pulumiAws

import typings.pulumiAws.elasticacheClusterMod.ClusterArgs
import typings.pulumiAws.elasticacheClusterMod.ClusterState
import typings.pulumiAws.elasticacheGetClusterMod.GetClusterArgs
import typings.pulumiAws.elasticacheGetClusterMod.GetClusterResult
import typings.pulumiAws.elasticacheParameterGroupMod.ParameterGroupArgs
import typings.pulumiAws.elasticacheParameterGroupMod.ParameterGroupState
import typings.pulumiAws.elasticacheSecurityGroupMod.SecurityGroupArgs
import typings.pulumiAws.elasticacheSecurityGroupMod.SecurityGroupState
import typings.pulumiAws.elasticacheSubnetGroupMod.SubnetGroupArgs
import typings.pulumiAws.elasticacheSubnetGroupMod.SubnetGroupState
import typings.pulumiAws.getReplicationGroupMod.GetReplicationGroupArgs
import typings.pulumiAws.getReplicationGroupMod.GetReplicationGroupResult
import typings.pulumiAws.replicationGroupMod.ReplicationGroupArgs
import typings.pulumiAws.replicationGroupMod.ReplicationGroupState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticacheMod {
  
  @JSImport("@pulumi/aws/elasticache", "Cluster")
  @js.native
  class Cluster protected ()
    extends typings.pulumiAws.elasticacheClusterMod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Cluster {
    
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elasticache", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.elasticacheClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws/elasticache", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elasticacheClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws/elasticache", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState): typings.pulumiAws.elasticacheClusterMod.Cluster = js.native
    @JSImport("@pulumi/aws/elasticache", "Cluster.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typings.pulumiAws.elasticacheClusterMod.Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elasticache", "Cluster.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticache/cluster.Cluster */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/elasticache", "ParameterGroup")
  @js.native
  class ParameterGroup protected ()
    extends typings.pulumiAws.elasticacheParameterGroupMod.ParameterGroup {
    /**
      * Create a ParameterGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ParameterGroupArgs) = this()
    def this(name: String, args: ParameterGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ParameterGroup {
    
    /**
      * Get an existing ParameterGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elasticache", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.elasticacheParameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws/elasticache", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elasticacheParameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws/elasticache", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState): typings.pulumiAws.elasticacheParameterGroupMod.ParameterGroup = js.native
    @JSImport("@pulumi/aws/elasticache", "ParameterGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ParameterGroupState, opts: CustomResourceOptions): typings.pulumiAws.elasticacheParameterGroupMod.ParameterGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ParameterGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elasticache", "ParameterGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticache/parameterGroup.ParameterGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/elasticache", "ReplicationGroup")
  @js.native
  class ReplicationGroup protected ()
    extends typings.pulumiAws.replicationGroupMod.ReplicationGroup {
    /**
      * Create a ReplicationGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ReplicationGroupArgs) = this()
    def this(name: String, args: ReplicationGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ReplicationGroup {
    
    /**
      * Get an existing ReplicationGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elasticache", "ReplicationGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.replicationGroupMod.ReplicationGroup = js.native
    @JSImport("@pulumi/aws/elasticache", "ReplicationGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.replicationGroupMod.ReplicationGroup = js.native
    @JSImport("@pulumi/aws/elasticache", "ReplicationGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReplicationGroupState): typings.pulumiAws.replicationGroupMod.ReplicationGroup = js.native
    @JSImport("@pulumi/aws/elasticache", "ReplicationGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: ReplicationGroupState, opts: CustomResourceOptions): typings.pulumiAws.replicationGroupMod.ReplicationGroup = js.native
    
    /**
      * Returns true if the given object is an instance of ReplicationGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elasticache", "ReplicationGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticache/replicationGroup.ReplicationGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/elasticache", "SecurityGroup")
  @js.native
  class SecurityGroup protected ()
    extends typings.pulumiAws.elasticacheSecurityGroupMod.SecurityGroup {
    /**
      * Create a SecurityGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SecurityGroupArgs) = this()
    def this(name: String, args: SecurityGroupArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object SecurityGroup {
    
    /**
      * Get an existing SecurityGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elasticache", "SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.elasticacheSecurityGroupMod.SecurityGroup = js.native
    @JSImport("@pulumi/aws/elasticache", "SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elasticacheSecurityGroupMod.SecurityGroup = js.native
    @JSImport("@pulumi/aws/elasticache", "SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState): typings.pulumiAws.elasticacheSecurityGroupMod.SecurityGroup = js.native
    @JSImport("@pulumi/aws/elasticache", "SecurityGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SecurityGroupState, opts: CustomResourceOptions): typings.pulumiAws.elasticacheSecurityGroupMod.SecurityGroup = js.native
    
    /**
      * Returns true if the given object is an instance of SecurityGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elasticache", "SecurityGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticache/securityGroup.SecurityGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/elasticache", "SubnetGroup")
  @js.native
  class SubnetGroup protected ()
    extends typings.pulumiAws.elasticacheSubnetGroupMod.SubnetGroup {
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
    
    /**
      * Get an existing SubnetGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elasticache", "SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.elasticacheSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws/elasticache", "SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.elasticacheSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws/elasticache", "SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState): typings.pulumiAws.elasticacheSubnetGroupMod.SubnetGroup = js.native
    @JSImport("@pulumi/aws/elasticache", "SubnetGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetGroupState, opts: CustomResourceOptions): typings.pulumiAws.elasticacheSubnetGroupMod.SubnetGroup = js.native
    
    /**
      * Returns true if the given object is an instance of SubnetGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elasticache", "SubnetGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticache/subnetGroup.SubnetGroup */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/elasticache", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = js.native
  @JSImport("@pulumi/aws/elasticache", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = js.native
  
  @JSImport("@pulumi/aws/elasticache", "getReplicationGroup")
  @js.native
  def getReplicationGroup(args: GetReplicationGroupArgs): js.Promise[GetReplicationGroupResult] = js.native
  @JSImport("@pulumi/aws/elasticache", "getReplicationGroup")
  @js.native
  def getReplicationGroup(args: GetReplicationGroupArgs, opts: InvokeOptions): js.Promise[GetReplicationGroupResult] = js.native
}
