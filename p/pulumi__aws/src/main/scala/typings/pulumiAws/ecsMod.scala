package typings.pulumiAws

import typings.pulumiAws.capacityProviderMod.CapacityProviderArgs
import typings.pulumiAws.capacityProviderMod.CapacityProviderState
import typings.pulumiAws.ecsClusterMod.ClusterArgs
import typings.pulumiAws.ecsClusterMod.ClusterState
import typings.pulumiAws.ecsGetClusterMod.GetClusterArgs
import typings.pulumiAws.ecsGetClusterMod.GetClusterResult
import typings.pulumiAws.getContainerDefinitionMod.GetContainerDefinitionArgs
import typings.pulumiAws.getContainerDefinitionMod.GetContainerDefinitionResult
import typings.pulumiAws.getServiceMod.GetServiceArgs
import typings.pulumiAws.getServiceMod.GetServiceResult
import typings.pulumiAws.getTaskDefinitionMod.GetTaskDefinitionArgs
import typings.pulumiAws.getTaskDefinitionMod.GetTaskDefinitionResult
import typings.pulumiAws.serviceMod.ServiceArgs
import typings.pulumiAws.serviceMod.ServiceState
import typings.pulumiAws.taskDefinitionMod.TaskDefinitionArgs
import typings.pulumiAws.taskDefinitionMod.TaskDefinitionState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ecs", JSImport.Namespace)
@js.native
object ecsMod extends js.Object {
  
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = js.native
  
  def getContainerDefinition(args: GetContainerDefinitionArgs): js.Promise[GetContainerDefinitionResult] = js.native
  def getContainerDefinition(args: GetContainerDefinitionArgs, opts: InvokeOptions): js.Promise[GetContainerDefinitionResult] = js.native
  
  def getService(args: GetServiceArgs): js.Promise[GetServiceResult] = js.native
  def getService(args: GetServiceArgs, opts: InvokeOptions): js.Promise[GetServiceResult] = js.native
  
  def getTaskDefinition(args: GetTaskDefinitionArgs): js.Promise[GetTaskDefinitionResult] = js.native
  def getTaskDefinition(args: GetTaskDefinitionArgs, opts: InvokeOptions): js.Promise[GetTaskDefinitionResult] = js.native
  
  @js.native
  class CapacityProvider protected ()
    extends typings.pulumiAws.capacityProviderMod.CapacityProvider {
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.capacityProviderMod.CapacityProvider = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.capacityProviderMod.CapacityProvider = js.native
    def get(name: String, id: Input[ID], state: CapacityProviderState): typings.pulumiAws.capacityProviderMod.CapacityProvider = js.native
    def get(name: String, id: Input[ID], state: CapacityProviderState, opts: CustomResourceOptions): typings.pulumiAws.capacityProviderMod.CapacityProvider = js.native
    
    /**
      * Returns true if the given object is an instance of CapacityProvider.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/capacityProvider.CapacityProvider */ Boolean = js.native
  }
  
  @js.native
  class Cluster protected ()
    extends typings.pulumiAws.ecsClusterMod.Cluster {
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
  @js.native
  object Cluster extends js.Object {
    
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.ecsClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.ecsClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typings.pulumiAws.ecsClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typings.pulumiAws.ecsClusterMod.Cluster = js.native
    
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/cluster.Cluster */ Boolean = js.native
  }
  
  @js.native
  class Service protected ()
    extends typings.pulumiAws.serviceMod.Service {
    /**
      * Create a Service resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ServiceArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ServiceArgs, opts: CustomResourceOptions) = this()
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.serviceMod.Service = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.serviceMod.Service = js.native
    def get(name: String, id: Input[ID], state: ServiceState): typings.pulumiAws.serviceMod.Service = js.native
    def get(name: String, id: Input[ID], state: ServiceState, opts: CustomResourceOptions): typings.pulumiAws.serviceMod.Service = js.native
    
    /**
      * Returns true if the given object is an instance of Service.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/service.Service */ Boolean = js.native
  }
  
  @js.native
  class TaskDefinition protected ()
    extends typings.pulumiAws.taskDefinitionMod.TaskDefinition {
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
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    def get(name: String, id: Input[ID]): typings.pulumiAws.taskDefinitionMod.TaskDefinition = js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.taskDefinitionMod.TaskDefinition = js.native
    def get(name: String, id: Input[ID], state: TaskDefinitionState): typings.pulumiAws.taskDefinitionMod.TaskDefinition = js.native
    def get(name: String, id: Input[ID], state: TaskDefinitionState, opts: CustomResourceOptions): typings.pulumiAws.taskDefinitionMod.TaskDefinition = js.native
    
    /**
      * Returns true if the given object is an instance of TaskDefinition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ecs/taskDefinition.TaskDefinition */ Boolean = js.native
  }
}
