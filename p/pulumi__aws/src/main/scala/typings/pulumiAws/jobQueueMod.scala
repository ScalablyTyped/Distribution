package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobQueueMod {
  
  @JSImport("@pulumi/aws/batch/jobQueue", "JobQueue")
  @js.native
  class JobQueue protected () extends CustomResource {
    /**
      * Create a JobQueue resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: JobQueueArgs) = this()
    def this(name: String, args: JobQueueArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name of the job queue.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Specifies the set of compute environments
      * mapped to a job queue and their order.  The position of the compute environments
      * in the list will dictate the order. You can associate up to 3 compute environments
      * with a job queue.
      */
    val computeEnvironments: Output_[js.Array[String]] = js.native
    
    /**
      * Specifies the name of the job queue.
      */
    val name: Output_[String] = js.native
    
    /**
      * The priority of the job queue. Job queues with a higher priority
      * are evaluated first when associated with the same compute environment.
      */
    val priority: Output_[Double] = js.native
    
    /**
      * The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
      */
    val state: Output_[String] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object JobQueue {
    
    @JSImport("@pulumi/aws/batch/jobQueue", "JobQueue")
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
    inline def get(name: String, id: Input[ID]): JobQueue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[JobQueue]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): JobQueue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[JobQueue]
    inline def get(name: String, id: Input[ID], state: JobQueueState): JobQueue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[JobQueue]
    inline def get(name: String, id: Input[ID], state: JobQueueState, opts: CustomResourceOptions): JobQueue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[JobQueue]
    
    /**
      * Returns true if the given object is an instance of JobQueue.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/jobQueue.JobQueue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/batch/jobQueue.JobQueue */ Boolean]
  }
  
  trait JobQueueArgs extends StObject {
    
    /**
      * Specifies the set of compute environments
      * mapped to a job queue and their order.  The position of the compute environments
      * in the list will dictate the order. You can associate up to 3 compute environments
      * with a job queue.
      */
    val computeEnvironments: Input[js.Array[Input[String]]]
    
    /**
      * Specifies the name of the job queue.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The priority of the job queue. Job queues with a higher priority
      * are evaluated first when associated with the same compute environment.
      */
    val priority: Input[Double]
    
    /**
      * The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
      */
    val state: Input[String]
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object JobQueueArgs {
    
    inline def apply(computeEnvironments: Input[js.Array[Input[String]]], priority: Input[Double], state: Input[String]): JobQueueArgs = {
      val __obj = js.Dynamic.literal(computeEnvironments = computeEnvironments.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobQueueArgs]
    }
    
    extension [Self <: JobQueueArgs](x: Self) {
      
      inline def setComputeEnvironments(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "computeEnvironments", value.asInstanceOf[js.Any])
      
      inline def setComputeEnvironmentsVarargs(value: Input[String]*): Self = StObject.set(x, "computeEnvironments", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait JobQueueState extends StObject {
    
    /**
      * The Amazon Resource Name of the job queue.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies the set of compute environments
      * mapped to a job queue and their order.  The position of the compute environments
      * in the list will dictate the order. You can associate up to 3 compute environments
      * with a job queue.
      */
    val computeEnvironments: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Specifies the name of the job queue.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The priority of the job queue. Job queues with a higher priority
      * are evaluated first when associated with the same compute environment.
      */
    val priority: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
      */
    val state: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object JobQueueState {
    
    inline def apply(): JobQueueState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JobQueueState]
    }
    
    extension [Self <: JobQueueState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setComputeEnvironments(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "computeEnvironments", value.asInstanceOf[js.Any])
      
      inline def setComputeEnvironmentsUndefined: Self = StObject.set(x, "computeEnvironments", js.undefined)
      
      inline def setComputeEnvironmentsVarargs(value: Input[String]*): Self = StObject.set(x, "computeEnvironments", js.Array(value :_*))
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
