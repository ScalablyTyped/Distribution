package typings.atPulumiAws

import typings.atPulumiAws.batchComputeEnvironmentMod.ComputeEnvironmentArgs
import typings.atPulumiAws.batchComputeEnvironmentMod.ComputeEnvironmentState
import typings.atPulumiAws.batchGetComputeEnvironmentMod.GetComputeEnvironmentArgs
import typings.atPulumiAws.batchGetComputeEnvironmentMod.GetComputeEnvironmentResult
import typings.atPulumiAws.batchGetJobQueueMod.GetJobQueueArgs
import typings.atPulumiAws.batchGetJobQueueMod.GetJobQueueResult
import typings.atPulumiAws.batchJobDefinitionMod.JobDefinitionArgs
import typings.atPulumiAws.batchJobDefinitionMod.JobDefinitionState
import typings.atPulumiAws.batchJobQueueMod.JobQueueArgs
import typings.atPulumiAws.batchJobQueueMod.JobQueueState
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/batch", JSImport.Namespace)
@js.native
object batchMod extends js.Object {
  @js.native
  class ComputeEnvironment protected ()
    extends typings.atPulumiAws.batchComputeEnvironmentMod.ComputeEnvironment {
    /**
      * Create a ComputeEnvironment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ComputeEnvironmentArgs) = this()
    def this(name: String, args: ComputeEnvironmentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class JobDefinition protected ()
    extends typings.atPulumiAws.batchJobDefinitionMod.JobDefinition {
    /**
      * Create a JobDefinition resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: JobDefinitionArgs) = this()
    def this(name: String, args: JobDefinitionArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class JobQueue protected ()
    extends typings.atPulumiAws.batchJobQueueMod.JobQueue {
    /**
      * Create a JobQueue resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: JobQueueArgs) = this()
    def this(name: String, args: JobQueueArgs, opts: CustomResourceOptions) = this()
  }
  
  def getComputeEnvironment(args: GetComputeEnvironmentArgs): js.Promise[GetComputeEnvironmentResult] with GetComputeEnvironmentResult = js.native
  def getComputeEnvironment(args: GetComputeEnvironmentArgs, opts: InvokeOptions): js.Promise[GetComputeEnvironmentResult] with GetComputeEnvironmentResult = js.native
  def getJobQueue(args: GetJobQueueArgs): js.Promise[GetJobQueueResult] with GetJobQueueResult = js.native
  def getJobQueue(args: GetJobQueueArgs, opts: InvokeOptions): js.Promise[GetJobQueueResult] with GetJobQueueResult = js.native
  /* static members */
  @js.native
  object ComputeEnvironment extends js.Object {
    /**
      * Get an existing ComputeEnvironment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.batchComputeEnvironmentMod.ComputeEnvironment = js.native
    def get(name: String, id: Input[ID], state: ComputeEnvironmentState): typings.atPulumiAws.batchComputeEnvironmentMod.ComputeEnvironment = js.native
    def get(name: String, id: Input[ID], state: ComputeEnvironmentState, opts: CustomResourceOptions): typings.atPulumiAws.batchComputeEnvironmentMod.ComputeEnvironment = js.native
    /**
      * Returns true if the given object is an instance of ComputeEnvironment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/computeEnvironment.ComputeEnvironment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object JobDefinition extends js.Object {
    /**
      * Get an existing JobDefinition resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.batchJobDefinitionMod.JobDefinition = js.native
    def get(name: String, id: Input[ID], state: JobDefinitionState): typings.atPulumiAws.batchJobDefinitionMod.JobDefinition = js.native
    def get(name: String, id: Input[ID], state: JobDefinitionState, opts: CustomResourceOptions): typings.atPulumiAws.batchJobDefinitionMod.JobDefinition = js.native
    /**
      * Returns true if the given object is an instance of JobDefinition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/jobDefinition.JobDefinition */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object JobQueue extends js.Object {
    /**
      * Get an existing JobQueue resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.batchJobQueueMod.JobQueue = js.native
    def get(name: String, id: Input[ID], state: JobQueueState): typings.atPulumiAws.batchJobQueueMod.JobQueue = js.native
    def get(name: String, id: Input[ID], state: JobQueueState, opts: CustomResourceOptions): typings.atPulumiAws.batchJobQueueMod.JobQueue = js.native
    /**
      * Returns true if the given object is an instance of JobQueue.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/jobQueue.JobQueue */ Boolean = js.native
  }
  
}

