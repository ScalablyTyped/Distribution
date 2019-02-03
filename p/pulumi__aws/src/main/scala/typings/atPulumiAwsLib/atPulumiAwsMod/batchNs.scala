package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "batch")
@js.native
object batchNs extends js.Object {
  @js.native
  class ComputeEnvironment protected ()
    extends atPulumiAwsLib.batchMod.ComputeEnvironment {
    /**
      * Create a ComputeEnvironment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.batchComputeEnvironmentMod.ComputeEnvironmentArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.batchComputeEnvironmentMod.ComputeEnvironmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class JobDefinition protected ()
    extends atPulumiAwsLib.batchMod.JobDefinition {
    /**
      * Create a JobDefinition resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.batchJobDefinitionMod.JobDefinitionArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.batchJobDefinitionMod.JobDefinitionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class JobQueue protected ()
    extends atPulumiAwsLib.batchMod.JobQueue {
    /**
      * Create a JobQueue resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.batchJobQueueMod.JobQueueArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.batchJobQueueMod.JobQueueArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  def getComputeEnvironment(args: atPulumiAwsLib.batchGetComputeEnvironmentMod.GetComputeEnvironmentArgs): js.Promise[atPulumiAwsLib.batchGetComputeEnvironmentMod.GetComputeEnvironmentResult] = js.native
  def getComputeEnvironment(
    args: atPulumiAwsLib.batchGetComputeEnvironmentMod.GetComputeEnvironmentArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.batchGetComputeEnvironmentMod.GetComputeEnvironmentResult] = js.native
  def getJobQueue(args: atPulumiAwsLib.batchGetJobQueueMod.GetJobQueueArgs): js.Promise[atPulumiAwsLib.batchGetJobQueueMod.GetJobQueueResult] = js.native
  def getJobQueue(
    args: atPulumiAwsLib.batchGetJobQueueMod.GetJobQueueArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.batchGetJobQueueMod.GetJobQueueResult] = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.batchComputeEnvironmentMod.ComputeEnvironment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.batchComputeEnvironmentMod.ComputeEnvironmentState
    ): atPulumiAwsLib.batchComputeEnvironmentMod.ComputeEnvironment = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.batchComputeEnvironmentMod.ComputeEnvironmentState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.batchComputeEnvironmentMod.ComputeEnvironment = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.batchJobDefinitionMod.JobDefinition = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.batchJobDefinitionMod.JobDefinitionState
    ): atPulumiAwsLib.batchJobDefinitionMod.JobDefinition = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.batchJobDefinitionMod.JobDefinitionState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.batchJobDefinitionMod.JobDefinition = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.batchJobQueueMod.JobQueue = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.batchJobQueueMod.JobQueueState
    ): atPulumiAwsLib.batchJobQueueMod.JobQueue = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.batchJobQueueMod.JobQueueState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.batchJobQueueMod.JobQueue = js.native
  }
  
}

