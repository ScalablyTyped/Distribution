package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ecs")
@js.native
object ecsNs extends js.Object {
  @js.native
  class Cluster protected ()
    extends atPulumiAwsLib.ecsMod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ecsClusterMod.ClusterArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ecsClusterMod.ClusterArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class Service protected ()
    extends atPulumiAwsLib.ecsMod.Service {
    /**
      * Create a Service resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ecsServiceMod.ServiceArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ecsServiceMod.ServiceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class TaskDefinition protected ()
    extends atPulumiAwsLib.ecsMod.TaskDefinition {
    /**
      * Create a TaskDefinition resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.ecsTaskDefinitionMod.TaskDefinitionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.ecsTaskDefinitionMod.TaskDefinitionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getCluster(args: atPulumiAwsLib.ecsGetClusterMod.GetClusterArgs): js.Promise[atPulumiAwsLib.ecsGetClusterMod.GetClusterResult] = js.native
  def getCluster(
    args: atPulumiAwsLib.ecsGetClusterMod.GetClusterArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ecsGetClusterMod.GetClusterResult] = js.native
  def getContainerDefinition(args: atPulumiAwsLib.ecsGetContainerDefinitionMod.GetContainerDefinitionArgs): js.Promise[atPulumiAwsLib.ecsGetContainerDefinitionMod.GetContainerDefinitionResult] = js.native
  def getContainerDefinition(
    args: atPulumiAwsLib.ecsGetContainerDefinitionMod.GetContainerDefinitionArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ecsGetContainerDefinitionMod.GetContainerDefinitionResult] = js.native
  def getService(args: atPulumiAwsLib.ecsGetServiceMod.GetServiceArgs): js.Promise[atPulumiAwsLib.ecsGetServiceMod.GetServiceResult] = js.native
  def getService(
    args: atPulumiAwsLib.ecsGetServiceMod.GetServiceArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ecsGetServiceMod.GetServiceResult] = js.native
  def getTaskDefinition(args: atPulumiAwsLib.ecsGetTaskDefinitionMod.GetTaskDefinitionArgs): js.Promise[atPulumiAwsLib.ecsGetTaskDefinitionMod.GetTaskDefinitionResult] = js.native
  def getTaskDefinition(
    args: atPulumiAwsLib.ecsGetTaskDefinitionMod.GetTaskDefinitionArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.ecsGetTaskDefinitionMod.GetTaskDefinitionResult] = js.native
  @js.native
  object Cluster extends js.Object {
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ecsClusterMod.Cluster = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ecsClusterMod.ClusterState
    ): atPulumiAwsLib.ecsClusterMod.Cluster = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ecsClusterMod.ClusterState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ecsClusterMod.Cluster = js.native
  }
  
  @js.native
  object Service extends js.Object {
    /**
      * Get an existing Service resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ecsServiceMod.Service = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ecsServiceMod.ServiceState
    ): atPulumiAwsLib.ecsServiceMod.Service = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ecsServiceMod.ServiceState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ecsServiceMod.Service = js.native
  }
  
  @js.native
  object TaskDefinition extends js.Object {
    /**
      * Get an existing TaskDefinition resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ecsTaskDefinitionMod.TaskDefinition = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ecsTaskDefinitionMod.TaskDefinitionState
    ): atPulumiAwsLib.ecsTaskDefinitionMod.TaskDefinition = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.ecsTaskDefinitionMod.TaskDefinitionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.ecsTaskDefinitionMod.TaskDefinition = js.native
  }
  
}

