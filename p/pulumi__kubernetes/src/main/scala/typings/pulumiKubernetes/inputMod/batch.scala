package typings.pulumiKubernetes.inputMod

import typings.pulumiKubernetes.inputMod.batch.v1.JobSpec
import typings.pulumiKubernetes.inputMod.core.v1.ObjectReference
import typings.pulumiKubernetes.inputMod.core.v1.PodTemplateSpec
import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.batchSlashv1
import typings.pulumiKubernetes.pulumiKubernetesStrings.batchSlashv1beta1
import typings.pulumiKubernetes.pulumiKubernetesStrings.batchSlashv2alpha1
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batch {
  
  object v1 {
    
    /**
      * Job represents the configuration of a single job.
      *
      * This resource waits until its status is ready before registering success
      * for create/update, and populating output properties from the current state of the resource.
      * The following conditions are used to determine whether the resource creation has
      * succeeded or failed:
      *
      * 1. The Job's '.status.startTime' is set, which indicates that the Job has started running.
      * 2. The Job's '.status.conditions' has a status of type 'Complete', and a 'status' set
      *    to 'True'.
      * 3. The Job's '.status.conditions' do not have a status of type 'Failed', with a
      * 	'status' set to 'True'. If this condition is set, we should fail the Job immediately.
      *
      * If the Job has not reached a Ready state after 10 minutes, it will
      * time out and mark the resource update as Failed. You can override the default timeout value
      * by setting the 'customTimeouts' option on the resource.
      */
    trait Job extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[batchSlashv1]] = js.undefined
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Job]] = js.undefined
      
      /**
        * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      
      /**
        * Specification of the desired behavior of a job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[Input[JobSpec]] = js.undefined
      
      /**
        * Current status of a job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var status: js.UndefOr[Input[JobStatus]] = js.undefined
    }
    object Job {
      
      inline def apply(): Job = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Job]
      }
      
      extension [Self <: Job](x: Self) {
        
        inline def setApiVersion(value: Input[batchSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        inline def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Job]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setSpec(value: Input[JobSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
        
        inline def setStatus(value: Input[JobStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    /**
      * JobCondition describes current state of a job.
      */
    trait JobCondition extends StObject {
      
      /**
        * Last time the condition was checked.
        */
      var lastProbeTime: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Last time the condition transit from one status to another.
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Human readable message indicating details about last transition.
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * (brief) reason for the condition's last transition.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Status of the condition, one of True, False, Unknown.
        */
      var status: Input[String]
      
      /**
        * Type of job condition, Complete or Failed.
        */
      var `type`: Input[String]
    }
    object JobCondition {
      
      inline def apply(status: Input[String], `type`: Input[String]): JobCondition = {
        val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[JobCondition]
      }
      
      extension [Self <: JobCondition](x: Self) {
        
        inline def setLastProbeTime(value: Input[String]): Self = StObject.set(x, "lastProbeTime", value.asInstanceOf[js.Any])
        
        inline def setLastProbeTimeUndefined: Self = StObject.set(x, "lastProbeTime", js.undefined)
        
        inline def setLastTransitionTime(value: Input[String]): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
        
        inline def setLastTransitionTimeUndefined: Self = StObject.set(x, "lastTransitionTime", js.undefined)
        
        inline def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        
        inline def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
        
        inline def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * JobSpec describes how the job execution will look like.
      */
    trait JobSpec extends StObject {
      
      /**
        * Specifies the duration in seconds relative to the startTime that the job may be active before the system tries to terminate it; value must be positive integer
        */
      var activeDeadlineSeconds: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * Specifies the number of retries before marking this job failed. Defaults to 6
        */
      var backoffLimit: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * Specifies the desired number of successfully finished pods the job should be run with.  Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
        */
      var completions: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector` unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see `manualSelector=true` in jobs that were created with the old `extensions/v1beta1` API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
        */
      var manualSelector: js.UndefOr[Input[Boolean]] = js.undefined
      
      /**
        * Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
        */
      var parallelism: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * A label query over pods that should match the pod count. Normally, the system sets this field for you. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
        */
      var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
      
      /**
        * Describes the pod that will be created when executing a job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
        */
      var template: Input[PodTemplateSpec]
      
      /**
        * ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes. This field is alpha-level and is only honored by servers that enable the TTLAfterFinished feature.
        */
      var ttlSecondsAfterFinished: js.UndefOr[Input[Double]] = js.undefined
    }
    object JobSpec {
      
      inline def apply(template: Input[PodTemplateSpec]): JobSpec = {
        val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
        __obj.asInstanceOf[JobSpec]
      }
      
      extension [Self <: JobSpec](x: Self) {
        
        inline def setActiveDeadlineSeconds(value: Input[Double]): Self = StObject.set(x, "activeDeadlineSeconds", value.asInstanceOf[js.Any])
        
        inline def setActiveDeadlineSecondsUndefined: Self = StObject.set(x, "activeDeadlineSeconds", js.undefined)
        
        inline def setBackoffLimit(value: Input[Double]): Self = StObject.set(x, "backoffLimit", value.asInstanceOf[js.Any])
        
        inline def setBackoffLimitUndefined: Self = StObject.set(x, "backoffLimit", js.undefined)
        
        inline def setCompletions(value: Input[Double]): Self = StObject.set(x, "completions", value.asInstanceOf[js.Any])
        
        inline def setCompletionsUndefined: Self = StObject.set(x, "completions", js.undefined)
        
        inline def setManualSelector(value: Input[Boolean]): Self = StObject.set(x, "manualSelector", value.asInstanceOf[js.Any])
        
        inline def setManualSelectorUndefined: Self = StObject.set(x, "manualSelector", js.undefined)
        
        inline def setParallelism(value: Input[Double]): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
        
        inline def setParallelismUndefined: Self = StObject.set(x, "parallelism", js.undefined)
        
        inline def setSelector(value: Input[LabelSelector]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        inline def setTemplate(value: Input[PodTemplateSpec]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        inline def setTtlSecondsAfterFinished(value: Input[Double]): Self = StObject.set(x, "ttlSecondsAfterFinished", value.asInstanceOf[js.Any])
        
        inline def setTtlSecondsAfterFinishedUndefined: Self = StObject.set(x, "ttlSecondsAfterFinished", js.undefined)
      }
    }
    
    /**
      * JobStatus represents the current state of a Job.
      */
    trait JobStatus extends StObject {
      
      /**
        * The number of actively running pods.
        */
      var active: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
        */
      var completionTime: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * The latest available observations of an object's current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
        */
      var conditions: js.UndefOr[Input[js.Array[Input[JobCondition]]]] = js.undefined
      
      /**
        * The number of pods which reached phase Failed.
        */
      var failed: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
        */
      var startTime: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * The number of pods which reached phase Succeeded.
        */
      var succeeded: js.UndefOr[Input[Double]] = js.undefined
    }
    object JobStatus {
      
      inline def apply(): JobStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JobStatus]
      }
      
      extension [Self <: JobStatus](x: Self) {
        
        inline def setActive(value: Input[Double]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
        
        inline def setCompletionTime(value: Input[String]): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
        
        inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
        
        inline def setConditions(value: Input[js.Array[Input[JobCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
        
        inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
        
        inline def setConditionsVarargs(value: Input[JobCondition]*): Self = StObject.set(x, "conditions", js.Array(value :_*))
        
        inline def setFailed(value: Input[Double]): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
        
        inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
        
        inline def setStartTime(value: Input[String]): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
        
        inline def setSucceeded(value: Input[Double]): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
        
        inline def setSucceededUndefined: Self = StObject.set(x, "succeeded", js.undefined)
      }
    }
  }
  
  object v1beta1 {
    
    /**
      * CronJob represents the configuration of a single cron job.
      */
    trait CronJob extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[batchSlashv1beta1]] = js.undefined
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.CronJob]] = js.undefined
      
      /**
        * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      
      /**
        * Specification of the desired behavior of a cron job, including the schedule. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[Input[CronJobSpec]] = js.undefined
      
      /**
        * Current status of a cron job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var status: js.UndefOr[Input[CronJobStatus]] = js.undefined
    }
    object CronJob {
      
      inline def apply(): CronJob = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CronJob]
      }
      
      extension [Self <: CronJob](x: Self) {
        
        inline def setApiVersion(value: Input[batchSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        inline def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.CronJob]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setSpec(value: Input[CronJobSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
        
        inline def setStatus(value: Input[CronJobStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    /**
      * CronJobSpec describes how the job execution will look like and when it will actually run.
      */
    trait CronJobSpec extends StObject {
      
      /**
        * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
        */
      var concurrencyPolicy: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
        */
      var failedJobsHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * Specifies the job that will be created when executing a CronJob.
        */
      var jobTemplate: Input[JobTemplateSpec]
      
      /**
        * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
        */
      var schedule: Input[String]
      
      /**
        * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
        */
      var startingDeadlineSeconds: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.
        */
      var successfulJobsHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
        */
      var suspend: js.UndefOr[Input[Boolean]] = js.undefined
    }
    object CronJobSpec {
      
      inline def apply(jobTemplate: Input[JobTemplateSpec], schedule: Input[String]): CronJobSpec = {
        val __obj = js.Dynamic.literal(jobTemplate = jobTemplate.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
        __obj.asInstanceOf[CronJobSpec]
      }
      
      extension [Self <: CronJobSpec](x: Self) {
        
        inline def setConcurrencyPolicy(value: Input[String]): Self = StObject.set(x, "concurrencyPolicy", value.asInstanceOf[js.Any])
        
        inline def setConcurrencyPolicyUndefined: Self = StObject.set(x, "concurrencyPolicy", js.undefined)
        
        inline def setFailedJobsHistoryLimit(value: Input[Double]): Self = StObject.set(x, "failedJobsHistoryLimit", value.asInstanceOf[js.Any])
        
        inline def setFailedJobsHistoryLimitUndefined: Self = StObject.set(x, "failedJobsHistoryLimit", js.undefined)
        
        inline def setJobTemplate(value: Input[JobTemplateSpec]): Self = StObject.set(x, "jobTemplate", value.asInstanceOf[js.Any])
        
        inline def setSchedule(value: Input[String]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
        
        inline def setStartingDeadlineSeconds(value: Input[Double]): Self = StObject.set(x, "startingDeadlineSeconds", value.asInstanceOf[js.Any])
        
        inline def setStartingDeadlineSecondsUndefined: Self = StObject.set(x, "startingDeadlineSeconds", js.undefined)
        
        inline def setSuccessfulJobsHistoryLimit(value: Input[Double]): Self = StObject.set(x, "successfulJobsHistoryLimit", value.asInstanceOf[js.Any])
        
        inline def setSuccessfulJobsHistoryLimitUndefined: Self = StObject.set(x, "successfulJobsHistoryLimit", js.undefined)
        
        inline def setSuspend(value: Input[Boolean]): Self = StObject.set(x, "suspend", value.asInstanceOf[js.Any])
        
        inline def setSuspendUndefined: Self = StObject.set(x, "suspend", js.undefined)
      }
    }
    
    /**
      * CronJobStatus represents the current state of a cron job.
      */
    trait CronJobStatus extends StObject {
      
      /**
        * A list of pointers to currently running jobs.
        */
      var active: js.UndefOr[Input[js.Array[Input[ObjectReference]]]] = js.undefined
      
      /**
        * Information when was the last time the job was successfully scheduled.
        */
      var lastScheduleTime: js.UndefOr[Input[String]] = js.undefined
    }
    object CronJobStatus {
      
      inline def apply(): CronJobStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CronJobStatus]
      }
      
      extension [Self <: CronJobStatus](x: Self) {
        
        inline def setActive(value: Input[js.Array[Input[ObjectReference]]]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
        
        inline def setActiveVarargs(value: Input[ObjectReference]*): Self = StObject.set(x, "active", js.Array(value :_*))
        
        inline def setLastScheduleTime(value: Input[String]): Self = StObject.set(x, "lastScheduleTime", value.asInstanceOf[js.Any])
        
        inline def setLastScheduleTimeUndefined: Self = StObject.set(x, "lastScheduleTime", js.undefined)
      }
    }
    
    /**
      * JobTemplateSpec describes the data a Job should have when created from a template
      */
    trait JobTemplateSpec extends StObject {
      
      /**
        * Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      
      /**
        * Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[Input[JobSpec]] = js.undefined
    }
    object JobTemplateSpec {
      
      inline def apply(): JobTemplateSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JobTemplateSpec]
      }
      
      extension [Self <: JobTemplateSpec](x: Self) {
        
        inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setSpec(value: Input[JobSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      }
    }
  }
  
  object v2alpha1 {
    
    /**
      * CronJob represents the configuration of a single cron job.
      */
    trait CronJob extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[batchSlashv2alpha1]] = js.undefined
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.CronJob]] = js.undefined
      
      /**
        * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      
      /**
        * Specification of the desired behavior of a cron job, including the schedule. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[Input[CronJobSpec]] = js.undefined
      
      /**
        * Current status of a cron job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var status: js.UndefOr[Input[CronJobStatus]] = js.undefined
    }
    object CronJob {
      
      inline def apply(): CronJob = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CronJob]
      }
      
      extension [Self <: CronJob](x: Self) {
        
        inline def setApiVersion(value: Input[batchSlashv2alpha1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        inline def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.CronJob]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setSpec(value: Input[CronJobSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
        
        inline def setStatus(value: Input[CronJobStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    /**
      * CronJobSpec describes how the job execution will look like and when it will actually run.
      */
    trait CronJobSpec extends StObject {
      
      /**
        * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
        */
      var concurrencyPolicy: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
        */
      var failedJobsHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * Specifies the job that will be created when executing a CronJob.
        */
      var jobTemplate: Input[JobTemplateSpec]
      
      /**
        * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
        */
      var schedule: Input[String]
      
      /**
        * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
        */
      var startingDeadlineSeconds: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
        */
      var successfulJobsHistoryLimit: js.UndefOr[Input[Double]] = js.undefined
      
      /**
        * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
        */
      var suspend: js.UndefOr[Input[Boolean]] = js.undefined
    }
    object CronJobSpec {
      
      inline def apply(jobTemplate: Input[JobTemplateSpec], schedule: Input[String]): CronJobSpec = {
        val __obj = js.Dynamic.literal(jobTemplate = jobTemplate.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
        __obj.asInstanceOf[CronJobSpec]
      }
      
      extension [Self <: CronJobSpec](x: Self) {
        
        inline def setConcurrencyPolicy(value: Input[String]): Self = StObject.set(x, "concurrencyPolicy", value.asInstanceOf[js.Any])
        
        inline def setConcurrencyPolicyUndefined: Self = StObject.set(x, "concurrencyPolicy", js.undefined)
        
        inline def setFailedJobsHistoryLimit(value: Input[Double]): Self = StObject.set(x, "failedJobsHistoryLimit", value.asInstanceOf[js.Any])
        
        inline def setFailedJobsHistoryLimitUndefined: Self = StObject.set(x, "failedJobsHistoryLimit", js.undefined)
        
        inline def setJobTemplate(value: Input[JobTemplateSpec]): Self = StObject.set(x, "jobTemplate", value.asInstanceOf[js.Any])
        
        inline def setSchedule(value: Input[String]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
        
        inline def setStartingDeadlineSeconds(value: Input[Double]): Self = StObject.set(x, "startingDeadlineSeconds", value.asInstanceOf[js.Any])
        
        inline def setStartingDeadlineSecondsUndefined: Self = StObject.set(x, "startingDeadlineSeconds", js.undefined)
        
        inline def setSuccessfulJobsHistoryLimit(value: Input[Double]): Self = StObject.set(x, "successfulJobsHistoryLimit", value.asInstanceOf[js.Any])
        
        inline def setSuccessfulJobsHistoryLimitUndefined: Self = StObject.set(x, "successfulJobsHistoryLimit", js.undefined)
        
        inline def setSuspend(value: Input[Boolean]): Self = StObject.set(x, "suspend", value.asInstanceOf[js.Any])
        
        inline def setSuspendUndefined: Self = StObject.set(x, "suspend", js.undefined)
      }
    }
    
    /**
      * CronJobStatus represents the current state of a cron job.
      */
    trait CronJobStatus extends StObject {
      
      /**
        * A list of pointers to currently running jobs.
        */
      var active: js.UndefOr[Input[js.Array[Input[ObjectReference]]]] = js.undefined
      
      /**
        * Information when was the last time the job was successfully scheduled.
        */
      var lastScheduleTime: js.UndefOr[Input[String]] = js.undefined
    }
    object CronJobStatus {
      
      inline def apply(): CronJobStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CronJobStatus]
      }
      
      extension [Self <: CronJobStatus](x: Self) {
        
        inline def setActive(value: Input[js.Array[Input[ObjectReference]]]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
        
        inline def setActiveVarargs(value: Input[ObjectReference]*): Self = StObject.set(x, "active", js.Array(value :_*))
        
        inline def setLastScheduleTime(value: Input[String]): Self = StObject.set(x, "lastScheduleTime", value.asInstanceOf[js.Any])
        
        inline def setLastScheduleTimeUndefined: Self = StObject.set(x, "lastScheduleTime", js.undefined)
      }
    }
    
    /**
      * JobTemplateSpec describes the data a Job should have when created from a template
      */
    trait JobTemplateSpec extends StObject {
      
      /**
        * Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      
      /**
        * Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[Input[JobSpec]] = js.undefined
    }
    object JobTemplateSpec {
      
      inline def apply(): JobTemplateSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JobTemplateSpec]
      }
      
      extension [Self <: JobTemplateSpec](x: Self) {
        
        inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setSpec(value: Input[JobSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      }
    }
  }
}
