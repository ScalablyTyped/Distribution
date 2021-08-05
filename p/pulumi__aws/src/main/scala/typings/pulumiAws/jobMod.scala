package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.glue.JobCommand
import typings.pulumiAws.outputMod.glue.JobExecutionProperty
import typings.pulumiAws.outputMod.glue.JobNotificationProperty
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jobMod {
  
  @JSImport("@pulumi/aws/glue/job", "Job")
  @js.native
  class Job protected () extends CustomResource {
    /**
      * Create a Job resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: JobArgs) = this()
    def this(name: String, args: JobArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Amazon Resource Name (ARN) of Glue Job
      */
    val arn: Output_[String] = js.native
    
    /**
      * The command of the job. Defined below.
      */
    val command: Output_[JobCommand] = js.native
    
    /**
      * The list of connections used for this job.
      */
    val connections: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * The map of default arguments for this job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the [Calling AWS Glue APIs in Python](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html) topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the [Special Parameters Used by AWS Glue](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-glue-arguments.html) topic in the developer guide.
      */
    val defaultArguments: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Description of the job.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Execution property of the job. Defined below.
      */
    val executionProperty: Output_[JobExecutionProperty] = js.native
    
    /**
      * The version of glue to use, for example "1.0". For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
      */
    val glueVersion: Output_[String] = js.native
    
    /**
      * The maximum number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. `Required` when `pythonshell` is set, accept either `0.0625` or `1.0`. Use `numberOfWorkers` and `workerType` arguments instead with `glueVersion` `2.0` and above.
      */
    val maxCapacity: Output_[Double] = js.native
    
    /**
      * The maximum number of times to retry this job if it fails.
      */
    val maxRetries: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The name you assign to this job. It must be unique in your account.
      */
    val name: Output_[String] = js.native
    
    /**
      * Non-overridable arguments for this job, specified as name-value pairs.
      */
    val nonOverridableArguments: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Notification property of the job. Defined below.
      */
    val notificationProperty: Output_[JobNotificationProperty] = js.native
    
    /**
      * The number of workers of a defined workerType that are allocated when a job runs.
      */
    val numberOfWorkers: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The ARN of the IAM role associated with this job.
      */
    val roleArn: Output_[String] = js.native
    
    /**
      * The name of the Security Configuration to be associated with the job.
      */
    val securityConfiguration: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Key-value map of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The job timeout in minutes. The default is 2880 minutes (48 hours).
      */
    val timeout: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.
      */
    val workerType: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Job {
    
    @JSImport("@pulumi/aws/glue/job", "Job")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Job resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Job]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Job]
    inline def get(name: String, id: Input[ID], state: JobState): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Job]
    inline def get(name: String, id: Input[ID], state: JobState, opts: CustomResourceOptions): Job = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Job]
    
    /**
      * Returns true if the given object is an instance of Job.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/glue/job.Job */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/glue/job.Job */ Boolean]
  }
  
  trait JobArgs extends StObject {
    
    /**
      * The command of the job. Defined below.
      */
    val command: Input[typings.pulumiAws.inputMod.glue.JobCommand]
    
    /**
      * The list of connections used for this job.
      */
    val connections: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The map of default arguments for this job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the [Calling AWS Glue APIs in Python](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html) topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the [Special Parameters Used by AWS Glue](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-glue-arguments.html) topic in the developer guide.
      */
    val defaultArguments: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Description of the job.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Execution property of the job. Defined below.
      */
    val executionProperty: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.JobExecutionProperty]] = js.undefined
    
    /**
      * The version of glue to use, for example "1.0". For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
      */
    val glueVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The maximum number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. `Required` when `pythonshell` is set, accept either `0.0625` or `1.0`. Use `numberOfWorkers` and `workerType` arguments instead with `glueVersion` `2.0` and above.
      */
    val maxCapacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The maximum number of times to retry this job if it fails.
      */
    val maxRetries: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The name you assign to this job. It must be unique in your account.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Non-overridable arguments for this job, specified as name-value pairs.
      */
    val nonOverridableArguments: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Notification property of the job. Defined below.
      */
    val notificationProperty: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.JobNotificationProperty]] = js.undefined
    
    /**
      * The number of workers of a defined workerType that are allocated when a job runs.
      */
    val numberOfWorkers: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The ARN of the IAM role associated with this job.
      */
    val roleArn: Input[String]
    
    /**
      * The name of the Security Configuration to be associated with the job.
      */
    val securityConfiguration: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The job timeout in minutes. The default is 2880 minutes (48 hours).
      */
    val timeout: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.
      */
    val workerType: js.UndefOr[Input[String]] = js.undefined
  }
  object JobArgs {
    
    inline def apply(command: Input[typings.pulumiAws.inputMod.glue.JobCommand], roleArn: Input[String]): JobArgs = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[JobArgs]
    }
    
    extension [Self <: JobArgs](x: Self) {
      
      inline def setCommand(value: Input[typings.pulumiAws.inputMod.glue.JobCommand]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setConnections(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
      
      inline def setConnectionsVarargs(value: Input[String]*): Self = StObject.set(x, "connections", js.Array(value :_*))
      
      inline def setDefaultArguments(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "defaultArguments", value.asInstanceOf[js.Any])
      
      inline def setDefaultArgumentsUndefined: Self = StObject.set(x, "defaultArguments", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExecutionProperty(value: Input[typings.pulumiAws.inputMod.glue.JobExecutionProperty]): Self = StObject.set(x, "executionProperty", value.asInstanceOf[js.Any])
      
      inline def setExecutionPropertyUndefined: Self = StObject.set(x, "executionProperty", js.undefined)
      
      inline def setGlueVersion(value: Input[String]): Self = StObject.set(x, "glueVersion", value.asInstanceOf[js.Any])
      
      inline def setGlueVersionUndefined: Self = StObject.set(x, "glueVersion", js.undefined)
      
      inline def setMaxCapacity(value: Input[Double]): Self = StObject.set(x, "maxCapacity", value.asInstanceOf[js.Any])
      
      inline def setMaxCapacityUndefined: Self = StObject.set(x, "maxCapacity", js.undefined)
      
      inline def setMaxRetries(value: Input[Double]): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNonOverridableArguments(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "nonOverridableArguments", value.asInstanceOf[js.Any])
      
      inline def setNonOverridableArgumentsUndefined: Self = StObject.set(x, "nonOverridableArguments", js.undefined)
      
      inline def setNotificationProperty(value: Input[typings.pulumiAws.inputMod.glue.JobNotificationProperty]): Self = StObject.set(x, "notificationProperty", value.asInstanceOf[js.Any])
      
      inline def setNotificationPropertyUndefined: Self = StObject.set(x, "notificationProperty", js.undefined)
      
      inline def setNumberOfWorkers(value: Input[Double]): Self = StObject.set(x, "numberOfWorkers", value.asInstanceOf[js.Any])
      
      inline def setNumberOfWorkersUndefined: Self = StObject.set(x, "numberOfWorkers", js.undefined)
      
      inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      inline def setSecurityConfiguration(value: Input[String]): Self = StObject.set(x, "securityConfiguration", value.asInstanceOf[js.Any])
      
      inline def setSecurityConfigurationUndefined: Self = StObject.set(x, "securityConfiguration", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTimeout(value: Input[Double]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWorkerType(value: Input[String]): Self = StObject.set(x, "workerType", value.asInstanceOf[js.Any])
      
      inline def setWorkerTypeUndefined: Self = StObject.set(x, "workerType", js.undefined)
    }
  }
  
  trait JobState extends StObject {
    
    /**
      * Amazon Resource Name (ARN) of Glue Job
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The command of the job. Defined below.
      */
    val command: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.JobCommand]] = js.undefined
    
    /**
      * The list of connections used for this job.
      */
    val connections: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The map of default arguments for this job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the [Calling AWS Glue APIs in Python](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html) topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the [Special Parameters Used by AWS Glue](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-glue-arguments.html) topic in the developer guide.
      */
    val defaultArguments: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Description of the job.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Execution property of the job. Defined below.
      */
    val executionProperty: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.JobExecutionProperty]] = js.undefined
    
    /**
      * The version of glue to use, for example "1.0". For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
      */
    val glueVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The maximum number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. `Required` when `pythonshell` is set, accept either `0.0625` or `1.0`. Use `numberOfWorkers` and `workerType` arguments instead with `glueVersion` `2.0` and above.
      */
    val maxCapacity: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The maximum number of times to retry this job if it fails.
      */
    val maxRetries: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The name you assign to this job. It must be unique in your account.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Non-overridable arguments for this job, specified as name-value pairs.
      */
    val nonOverridableArguments: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Notification property of the job. Defined below.
      */
    val notificationProperty: js.UndefOr[Input[typings.pulumiAws.inputMod.glue.JobNotificationProperty]] = js.undefined
    
    /**
      * The number of workers of a defined workerType that are allocated when a job runs.
      */
    val numberOfWorkers: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The ARN of the IAM role associated with this job.
      */
    val roleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The name of the Security Configuration to be associated with the job.
      */
    val securityConfiguration: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value map of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The job timeout in minutes. The default is 2880 minutes (48 hours).
      */
    val timeout: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.
      */
    val workerType: js.UndefOr[Input[String]] = js.undefined
  }
  object JobState {
    
    inline def apply(): JobState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JobState]
    }
    
    extension [Self <: JobState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setCommand(value: Input[typings.pulumiAws.inputMod.glue.JobCommand]): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      inline def setConnections(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
      
      inline def setConnectionsVarargs(value: Input[String]*): Self = StObject.set(x, "connections", js.Array(value :_*))
      
      inline def setDefaultArguments(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "defaultArguments", value.asInstanceOf[js.Any])
      
      inline def setDefaultArgumentsUndefined: Self = StObject.set(x, "defaultArguments", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setExecutionProperty(value: Input[typings.pulumiAws.inputMod.glue.JobExecutionProperty]): Self = StObject.set(x, "executionProperty", value.asInstanceOf[js.Any])
      
      inline def setExecutionPropertyUndefined: Self = StObject.set(x, "executionProperty", js.undefined)
      
      inline def setGlueVersion(value: Input[String]): Self = StObject.set(x, "glueVersion", value.asInstanceOf[js.Any])
      
      inline def setGlueVersionUndefined: Self = StObject.set(x, "glueVersion", js.undefined)
      
      inline def setMaxCapacity(value: Input[Double]): Self = StObject.set(x, "maxCapacity", value.asInstanceOf[js.Any])
      
      inline def setMaxCapacityUndefined: Self = StObject.set(x, "maxCapacity", js.undefined)
      
      inline def setMaxRetries(value: Input[Double]): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNonOverridableArguments(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "nonOverridableArguments", value.asInstanceOf[js.Any])
      
      inline def setNonOverridableArgumentsUndefined: Self = StObject.set(x, "nonOverridableArguments", js.undefined)
      
      inline def setNotificationProperty(value: Input[typings.pulumiAws.inputMod.glue.JobNotificationProperty]): Self = StObject.set(x, "notificationProperty", value.asInstanceOf[js.Any])
      
      inline def setNotificationPropertyUndefined: Self = StObject.set(x, "notificationProperty", js.undefined)
      
      inline def setNumberOfWorkers(value: Input[Double]): Self = StObject.set(x, "numberOfWorkers", value.asInstanceOf[js.Any])
      
      inline def setNumberOfWorkersUndefined: Self = StObject.set(x, "numberOfWorkers", js.undefined)
      
      inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
      
      inline def setSecurityConfiguration(value: Input[String]): Self = StObject.set(x, "securityConfiguration", value.asInstanceOf[js.Any])
      
      inline def setSecurityConfigurationUndefined: Self = StObject.set(x, "securityConfiguration", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTimeout(value: Input[Double]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWorkerType(value: Input[String]): Self = StObject.set(x, "workerType", value.asInstanceOf[js.Any])
      
      inline def setWorkerTypeUndefined: Self = StObject.set(x, "workerType", js.undefined)
    }
  }
}
