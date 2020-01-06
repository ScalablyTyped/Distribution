package typings.atPulumiAws

import typings.atPulumiAws.ecsCapacityProviderMod.CapacityProviderArgs
import typings.atPulumiAws.ecsCapacityProviderMod.CapacityProviderState
import typings.atPulumiAws.ecsClusterMod.ClusterArgs
import typings.atPulumiAws.ecsClusterMod.ClusterState
import typings.atPulumiAws.ecsGetClusterMod.GetClusterArgs
import typings.atPulumiAws.ecsGetClusterMod.GetClusterResult
import typings.atPulumiAws.ecsGetContainerDefinitionMod.GetContainerDefinitionArgs
import typings.atPulumiAws.ecsGetContainerDefinitionMod.GetContainerDefinitionResult
import typings.atPulumiAws.ecsGetServiceMod.GetServiceArgs
import typings.atPulumiAws.ecsGetServiceMod.GetServiceResult
import typings.atPulumiAws.ecsGetTaskDefinitionMod.GetTaskDefinitionArgs
import typings.atPulumiAws.ecsGetTaskDefinitionMod.GetTaskDefinitionResult
import typings.atPulumiAws.ecsServiceMod.ServiceArgs
import typings.atPulumiAws.ecsServiceMod.ServiceState
import typings.atPulumiAws.ecsTaskDefinitionMod.TaskDefinitionArgs
import typings.atPulumiAws.ecsTaskDefinitionMod.TaskDefinitionState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ecs", JSImport.Namespace)
@js.native
object ecsMod extends js.Object {
  @js.native
  class CapacityProvider protected ()
    extends typings.atPulumiAws.ecsCapacityProviderMod.CapacityProvider {
    /**
      * Create a CapacityProvider resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CapacityProviderArgs) = this()
    def this(name: String, args: CapacityProviderArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Cluster protected ()
    extends typings.atPulumiAws.ecsClusterMod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Service protected ()
    extends typings.atPulumiAws.ecsServiceMod.Service {
    /**
      * Create a Service resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ServiceArgs) = this()
    def this(name: String, args: ServiceArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class TaskDefinition protected ()
    extends typings.atPulumiAws.ecsTaskDefinitionMod.TaskDefinition {
    /**
      * Create a TaskDefinition resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TaskDefinitionArgs) = this()
    def this(name: String, args: TaskDefinitionArgs, opts: CustomResourceOptions) = this()
  }
  
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getContainerDefinition(args: GetContainerDefinitionArgs): js.Promise[GetContainerDefinitionResult] with GetContainerDefinitionResult = js.native
  def getContainerDefinition(args: GetContainerDefinitionArgs, opts: InvokeOptions): js.Promise[GetContainerDefinitionResult] with GetContainerDefinitionResult = js.native
  def getService(args: GetServiceArgs): js.Promise[GetServiceResult] with GetServiceResult = js.native
  def getService(args: GetServiceArgs, opts: InvokeOptions): js.Promise[GetServiceResult] with GetServiceResult = js.native
  def getTaskDefinition(args: GetTaskDefinitionArgs): js.Promise[GetTaskDefinitionResult] with GetTaskDefinitionResult = js.native
  def getTaskDefinition(args: GetTaskDefinitionArgs, opts: InvokeOptions): js.Promise[GetTaskDefinitionResult] with GetTaskDefinitionResult = js.native
  /* static members */
  @js.native
  object CapacityProvider extends js.Object {
    /**
      * Get an existing CapacityProvider resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ecsCapacityProviderMod.CapacityProvider = js.native
    def get(name: String, id: Input[ID], state: CapacityProviderState): typings.atPulumiAws.ecsCapacityProviderMod.CapacityProvider = js.native
    def get(name: String, id: Input[ID], state: CapacityProviderState, opts: CustomResourceOptions): typings.atPulumiAws.ecsCapacityProviderMod.CapacityProvider = js.native
    /**
      * Returns true if the given object is an instance of CapacityProvider.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/capacityProvider.CapacityProvider */ Boolean = js.native
  }
  
  /* static members */
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ecsClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typings.atPulumiAws.ecsClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typings.atPulumiAws.ecsClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/cluster.Cluster */ Boolean = js.native
  }
  
  /* static members */
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ecsServiceMod.Service = js.native
    def get(name: String, id: Input[ID], state: ServiceState): typings.atPulumiAws.ecsServiceMod.Service = js.native
    def get(name: String, id: Input[ID], state: ServiceState, opts: CustomResourceOptions): typings.atPulumiAws.ecsServiceMod.Service = js.native
    /**
      * Returns true if the given object is an instance of Service.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/service.Service */ Boolean = js.native
  }
  
  /* static members */
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
    def get(name: String, id: Input[ID]): typings.atPulumiAws.ecsTaskDefinitionMod.TaskDefinition = js.native
    def get(name: String, id: Input[ID], state: TaskDefinitionState): typings.atPulumiAws.ecsTaskDefinitionMod.TaskDefinition = js.native
    def get(name: String, id: Input[ID], state: TaskDefinitionState, opts: CustomResourceOptions): typings.atPulumiAws.ecsTaskDefinitionMod.TaskDefinition = js.native
    /**
      * Returns true if the given object is an instance of TaskDefinition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/taskDefinition.TaskDefinition */ Boolean = js.native
  }
  
}

