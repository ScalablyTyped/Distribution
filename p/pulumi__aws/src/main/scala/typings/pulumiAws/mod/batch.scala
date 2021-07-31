package typings.pulumiAws.mod

import typings.pulumiAws.computeEnvironmentMod.ComputeEnvironmentArgs
import typings.pulumiAws.computeEnvironmentMod.ComputeEnvironmentState
import typings.pulumiAws.getComputeEnvironmentMod.GetComputeEnvironmentArgs
import typings.pulumiAws.getComputeEnvironmentMod.GetComputeEnvironmentResult
import typings.pulumiAws.getJobQueueMod.GetJobQueueArgs
import typings.pulumiAws.getJobQueueMod.GetJobQueueResult
import typings.pulumiAws.jobDefinitionMod.JobDefinitionArgs
import typings.pulumiAws.jobDefinitionMod.JobDefinitionState
import typings.pulumiAws.jobQueueMod.JobQueueArgs
import typings.pulumiAws.jobQueueMod.JobQueueState
import typings.pulumiPulumi.invokeMod.InvokeOptions
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batch {
  
  @JSImport("@pulumi/aws", "batch")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/aws", "batch.ComputeEnvironment")
  @js.native
  class ComputeEnvironment protected ()
    extends typings.pulumiAws.batchMod.ComputeEnvironment {
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
  /* static members */
  object ComputeEnvironment {
    
    @JSImport("@pulumi/aws", "batch.ComputeEnvironment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ComputeEnvironment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.computeEnvironmentMod.ComputeEnvironment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.computeEnvironmentMod.ComputeEnvironment]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.computeEnvironmentMod.ComputeEnvironment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.computeEnvironmentMod.ComputeEnvironment]
    @scala.inline
    def get(name: String, id: Input[ID], state: ComputeEnvironmentState): typings.pulumiAws.computeEnvironmentMod.ComputeEnvironment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.computeEnvironmentMod.ComputeEnvironment]
    @scala.inline
    def get(name: String, id: Input[ID], state: ComputeEnvironmentState, opts: CustomResourceOptions): typings.pulumiAws.computeEnvironmentMod.ComputeEnvironment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.computeEnvironmentMod.ComputeEnvironment]
    
    /**
      * Returns true if the given object is an instance of ComputeEnvironment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/computeEnvironment.ComputeEnvironment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/batch/computeEnvironment.ComputeEnvironment */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "batch.JobDefinition")
  @js.native
  class JobDefinition protected ()
    extends typings.pulumiAws.batchMod.JobDefinition {
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
  /* static members */
  object JobDefinition {
    
    @JSImport("@pulumi/aws", "batch.JobDefinition")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing JobDefinition resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.jobDefinitionMod.JobDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.jobDefinitionMod.JobDefinition]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.jobDefinitionMod.JobDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.jobDefinitionMod.JobDefinition]
    @scala.inline
    def get(name: String, id: Input[ID], state: JobDefinitionState): typings.pulumiAws.jobDefinitionMod.JobDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.jobDefinitionMod.JobDefinition]
    @scala.inline
    def get(name: String, id: Input[ID], state: JobDefinitionState, opts: CustomResourceOptions): typings.pulumiAws.jobDefinitionMod.JobDefinition = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.jobDefinitionMod.JobDefinition]
    
    /**
      * Returns true if the given object is an instance of JobDefinition.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/jobDefinition.JobDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/batch/jobDefinition.JobDefinition */ Boolean]
  }
  
  @JSImport("@pulumi/aws", "batch.JobQueue")
  @js.native
  class JobQueue protected ()
    extends typings.pulumiAws.batchMod.JobQueue {
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
  /* static members */
  object JobQueue {
    
    @JSImport("@pulumi/aws", "batch.JobQueue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing JobQueue resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiAws.jobQueueMod.JobQueue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.jobQueueMod.JobQueue]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): typings.pulumiAws.jobQueueMod.JobQueue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.jobQueueMod.JobQueue]
    @scala.inline
    def get(name: String, id: Input[ID], state: JobQueueState): typings.pulumiAws.jobQueueMod.JobQueue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.jobQueueMod.JobQueue]
    @scala.inline
    def get(name: String, id: Input[ID], state: JobQueueState, opts: CustomResourceOptions): typings.pulumiAws.jobQueueMod.JobQueue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiAws.jobQueueMod.JobQueue]
    
    /**
      * Returns true if the given object is an instance of JobQueue.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/jobQueue.JobQueue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/batch/jobQueue.JobQueue */ Boolean]
  }
  
  @scala.inline
  def getComputeEnvironment(args: GetComputeEnvironmentArgs): js.Promise[GetComputeEnvironmentResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComputeEnvironment")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetComputeEnvironmentResult]]
  @scala.inline
  def getComputeEnvironment(args: GetComputeEnvironmentArgs, opts: InvokeOptions): js.Promise[GetComputeEnvironmentResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getComputeEnvironment")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetComputeEnvironmentResult]]
  
  @scala.inline
  def getJobQueue(args: GetJobQueueArgs): js.Promise[GetJobQueueResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getJobQueue")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetJobQueueResult]]
  @scala.inline
  def getJobQueue(args: GetJobQueueArgs, opts: InvokeOptions): js.Promise[GetJobQueueResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getJobQueue")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetJobQueueResult]]
}
