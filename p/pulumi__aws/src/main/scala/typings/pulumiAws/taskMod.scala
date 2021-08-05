package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.outputMod.datasync.TaskOptions
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taskMod {
  
  @JSImport("@pulumi/aws/datasync/task", "Task")
  @js.native
  class Task protected () extends CustomResource {
    /**
      * Create a Task resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TaskArgs) = this()
    def this(name: String, args: TaskArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of the DataSync Task.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
      */
    val cloudwatchLogGroupArn: Output_[js.UndefOr[ARN]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of destination DataSync Location.
      */
    val destinationLocationArn: Output_[ARN] = js.native
    
    /**
      * Name of the DataSync Task.
      */
    val name: Output_[String] = js.native
    
    /**
      * Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
      */
    val options: Output_[js.UndefOr[TaskOptions]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of source DataSync Location.
      */
    val sourceLocationArn: Output_[ARN] = js.native
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Task.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Task {
    
    @JSImport("@pulumi/aws/datasync/task", "Task")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Task resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Task = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Task]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Task = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Task]
    inline def get(name: String, id: Input[ID], state: TaskState): Task = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Task]
    inline def get(name: String, id: Input[ID], state: TaskState, opts: CustomResourceOptions): Task = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Task]
    
    /**
      * Returns true if the given object is an instance of Task.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/task.Task */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/datasync/task.Task */ Boolean]
  }
  
  trait TaskArgs extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
      */
    val cloudwatchLogGroupArn: js.UndefOr[Input[ARN]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of destination DataSync Location.
      */
    val destinationLocationArn: Input[ARN]
    
    /**
      * Name of the DataSync Task.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
      */
    val options: js.UndefOr[Input[typings.pulumiAws.inputMod.datasync.TaskOptions]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of source DataSync Location.
      */
    val sourceLocationArn: Input[ARN]
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Task.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object TaskArgs {
    
    extension [Self <: TaskArgs](x: Self) {
      
      inline def setCloudwatchLogGroupArn(value: Input[ARN]): Self = StObject.set(x, "cloudwatchLogGroupArn", value.asInstanceOf[js.Any])
      
      inline def setCloudwatchLogGroupArnUndefined: Self = StObject.set(x, "cloudwatchLogGroupArn", js.undefined)
      
      inline def setDestinationLocationArn(value: Input[ARN]): Self = StObject.set(x, "destinationLocationArn", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptions(value: Input[typings.pulumiAws.inputMod.datasync.TaskOptions]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setSourceLocationArn(value: Input[ARN]): Self = StObject.set(x, "sourceLocationArn", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait TaskState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of the DataSync Task.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
      */
    val cloudwatchLogGroupArn: js.UndefOr[Input[ARN]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of destination DataSync Location.
      */
    val destinationLocationArn: js.UndefOr[Input[ARN]] = js.undefined
    
    /**
      * Name of the DataSync Task.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
      */
    val options: js.UndefOr[Input[typings.pulumiAws.inputMod.datasync.TaskOptions]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of source DataSync Location.
      */
    val sourceLocationArn: js.UndefOr[Input[ARN]] = js.undefined
    
    /**
      * Key-value pairs of resource tags to assign to the DataSync Task.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object TaskState {
    
    inline def apply(): TaskState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TaskState]
    }
    
    extension [Self <: TaskState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setCloudwatchLogGroupArn(value: Input[ARN]): Self = StObject.set(x, "cloudwatchLogGroupArn", value.asInstanceOf[js.Any])
      
      inline def setCloudwatchLogGroupArnUndefined: Self = StObject.set(x, "cloudwatchLogGroupArn", js.undefined)
      
      inline def setDestinationLocationArn(value: Input[ARN]): Self = StObject.set(x, "destinationLocationArn", value.asInstanceOf[js.Any])
      
      inline def setDestinationLocationArnUndefined: Self = StObject.set(x, "destinationLocationArn", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptions(value: Input[typings.pulumiAws.inputMod.datasync.TaskOptions]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setSourceLocationArn(value: Input[ARN]): Self = StObject.set(x, "sourceLocationArn", value.asInstanceOf[js.Any])
      
      inline def setSourceLocationArnUndefined: Self = StObject.set(x, "sourceLocationArn", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
