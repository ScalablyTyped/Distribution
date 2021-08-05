package typings.pulumiAws

import typings.pulumiAws.outputMod.ssm.MaintenanceWindowTaskTarget
import typings.pulumiAws.outputMod.ssm.MaintenanceWindowTaskTaskInvocationParameters
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maintenanceWindowTaskMod {
  
  @JSImport("@pulumi/aws/ssm/maintenanceWindowTask", "MaintenanceWindowTask")
  @js.native
  class MaintenanceWindowTask protected () extends CustomResource {
    /**
      * Create a MaintenanceWindowTask resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MaintenanceWindowTaskArgs) = this()
    def this(name: String, args: MaintenanceWindowTaskArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The description of the maintenance window task.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The maximum number of targets this task can be run for in parallel.
      */
    val maxConcurrency: Output_[String] = js.native
    
    /**
      * The maximum number of errors allowed before this task stops being scheduled.
      */
    val maxErrors: Output_[String] = js.native
    
    /**
      * The name of the maintenance window task.
      */
    val name: Output_[String] = js.native
    
    /**
      * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
      */
    val priority: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The role that should be assumed when executing the task.
      */
    val serviceRoleArn: Output_[String] = js.native
    
    /**
      * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
      */
    val targets: Output_[js.Array[MaintenanceWindowTaskTarget]] = js.native
    
    /**
      * The ARN of the task to execute.
      */
    val taskArn: Output_[String] = js.native
    
    /**
      * Configuration block with parameters for task execution.
      */
    val taskInvocationParameters: Output_[js.UndefOr[MaintenanceWindowTaskTaskInvocationParameters]] = js.native
    
    /**
      * The type of task being registered. The only allowed value is `RUN_COMMAND`.
      */
    val taskType: Output_[String] = js.native
    
    /**
      * The Id of the maintenance window to register the task with.
      */
    val windowId: Output_[String] = js.native
  }
  /* static members */
  object MaintenanceWindowTask {
    
    @JSImport("@pulumi/aws/ssm/maintenanceWindowTask", "MaintenanceWindowTask")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing MaintenanceWindowTask resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): MaintenanceWindowTask = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[MaintenanceWindowTask]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): MaintenanceWindowTask = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MaintenanceWindowTask]
    inline def get(name: String, id: Input[ID], state: MaintenanceWindowTaskState): MaintenanceWindowTask = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[MaintenanceWindowTask]
    inline def get(name: String, id: Input[ID], state: MaintenanceWindowTaskState, opts: CustomResourceOptions): MaintenanceWindowTask = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[MaintenanceWindowTask]
    
    /**
      * Returns true if the given object is an instance of MaintenanceWindowTask.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTask.MaintenanceWindowTask */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTask.MaintenanceWindowTask */ Boolean]
  }
  
  trait MaintenanceWindowTaskArgs extends StObject {
    
    /**
      * The description of the maintenance window task.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The maximum number of targets this task can be run for in parallel.
      */
    val maxConcurrency: Input[String]
    
    /**
      * The maximum number of errors allowed before this task stops being scheduled.
      */
    val maxErrors: Input[String]
    
    /**
      * The name of the maintenance window task.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
      */
    val priority: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The role that should be assumed when executing the task.
      */
    val serviceRoleArn: Input[String]
    
    /**
      * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
      */
    val targets: Input[js.Array[Input[typings.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTarget]]]
    
    /**
      * The ARN of the task to execute.
      */
    val taskArn: Input[String]
    
    /**
      * Configuration block with parameters for task execution.
      */
    val taskInvocationParameters: js.UndefOr[
        Input[typings.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTaskInvocationParameters]
      ] = js.undefined
    
    /**
      * The type of task being registered. The only allowed value is `RUN_COMMAND`.
      */
    val taskType: Input[String]
    
    /**
      * The Id of the maintenance window to register the task with.
      */
    val windowId: Input[String]
  }
  object MaintenanceWindowTaskArgs {
    
    inline def apply(
      maxConcurrency: Input[String],
      maxErrors: Input[String],
      serviceRoleArn: Input[String],
      targets: Input[js.Array[Input[typings.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTarget]]],
      taskArn: Input[String],
      taskType: Input[String],
      windowId: Input[String]
    ): MaintenanceWindowTaskArgs = {
      val __obj = js.Dynamic.literal(maxConcurrency = maxConcurrency.asInstanceOf[js.Any], maxErrors = maxErrors.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], taskArn = taskArn.asInstanceOf[js.Any], taskType = taskType.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaintenanceWindowTaskArgs]
    }
    
    extension [Self <: MaintenanceWindowTaskArgs](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setMaxConcurrency(value: Input[String]): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
      
      inline def setMaxErrors(value: Input[String]): Self = StObject.set(x, "maxErrors", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setServiceRoleArn(value: Input[String]): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
      
      inline def setTargets(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTarget]]]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsVarargs(value: Input[typings.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTarget]*): Self = StObject.set(x, "targets", js.Array(value :_*))
      
      inline def setTaskArn(value: Input[String]): Self = StObject.set(x, "taskArn", value.asInstanceOf[js.Any])
      
      inline def setTaskInvocationParameters(value: Input[typings.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTaskInvocationParameters]): Self = StObject.set(x, "taskInvocationParameters", value.asInstanceOf[js.Any])
      
      inline def setTaskInvocationParametersUndefined: Self = StObject.set(x, "taskInvocationParameters", js.undefined)
      
      inline def setTaskType(value: Input[String]): Self = StObject.set(x, "taskType", value.asInstanceOf[js.Any])
      
      inline def setWindowId(value: Input[String]): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaintenanceWindowTaskState extends StObject {
    
    /**
      * The description of the maintenance window task.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The maximum number of targets this task can be run for in parallel.
      */
    val maxConcurrency: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The maximum number of errors allowed before this task stops being scheduled.
      */
    val maxErrors: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the maintenance window task.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
      */
    val priority: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The role that should be assumed when executing the task.
      */
    val serviceRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
      */
    val targets: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTarget]]]
      ] = js.undefined
    
    /**
      * The ARN of the task to execute.
      */
    val taskArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block with parameters for task execution.
      */
    val taskInvocationParameters: js.UndefOr[
        Input[typings.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTaskInvocationParameters]
      ] = js.undefined
    
    /**
      * The type of task being registered. The only allowed value is `RUN_COMMAND`.
      */
    val taskType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The Id of the maintenance window to register the task with.
      */
    val windowId: js.UndefOr[Input[String]] = js.undefined
  }
  object MaintenanceWindowTaskState {
    
    inline def apply(): MaintenanceWindowTaskState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaintenanceWindowTaskState]
    }
    
    extension [Self <: MaintenanceWindowTaskState](x: Self) {
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setMaxConcurrency(value: Input[String]): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "maxConcurrency", js.undefined)
      
      inline def setMaxErrors(value: Input[String]): Self = StObject.set(x, "maxErrors", value.asInstanceOf[js.Any])
      
      inline def setMaxErrorsUndefined: Self = StObject.set(x, "maxErrors", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setServiceRoleArn(value: Input[String]): Self = StObject.set(x, "serviceRoleArn", value.asInstanceOf[js.Any])
      
      inline def setServiceRoleArnUndefined: Self = StObject.set(x, "serviceRoleArn", js.undefined)
      
      inline def setTargets(value: Input[js.Array[Input[typings.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTarget]]]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      inline def setTargetsVarargs(value: Input[typings.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTarget]*): Self = StObject.set(x, "targets", js.Array(value :_*))
      
      inline def setTaskArn(value: Input[String]): Self = StObject.set(x, "taskArn", value.asInstanceOf[js.Any])
      
      inline def setTaskArnUndefined: Self = StObject.set(x, "taskArn", js.undefined)
      
      inline def setTaskInvocationParameters(value: Input[typings.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTaskInvocationParameters]): Self = StObject.set(x, "taskInvocationParameters", value.asInstanceOf[js.Any])
      
      inline def setTaskInvocationParametersUndefined: Self = StObject.set(x, "taskInvocationParameters", js.undefined)
      
      inline def setTaskType(value: Input[String]): Self = StObject.set(x, "taskType", value.asInstanceOf[js.Any])
      
      inline def setTaskTypeUndefined: Self = StObject.set(x, "taskType", js.undefined)
      
      inline def setWindowId(value: Input[String]): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
      
      inline def setWindowIdUndefined: Self = StObject.set(x, "windowId", js.undefined)
    }
  }
}
