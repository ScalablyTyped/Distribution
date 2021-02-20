package typings.pulumiKubernetes.outputMod

import typings.pulumiKubernetes.outputMod.batch.v1.JobSpec
import typings.pulumiKubernetes.outputMod.core.v1.ObjectReference
import typings.pulumiKubernetes.outputMod.core.v1.PodTemplateSpec
import typings.pulumiKubernetes.outputMod.meta.v1.LabelSelector
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.batchSlashv1
import typings.pulumiKubernetes.pulumiKubernetesStrings.batchSlashv1beta1
import typings.pulumiKubernetes.pulumiKubernetesStrings.batchSlashv2alpha1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    @js.native
    trait Job extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: batchSlashv1 = js.native
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Job = js.native
      
      /**
        * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: ObjectMeta = js.native
      
      /**
        * Specification of the desired behavior of a job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: JobSpec = js.native
      
      /**
        * Current status of a job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var status: JobStatus = js.native
    }
    object Job {
      
      @scala.inline
      def apply(
        apiVersion: batchSlashv1,
        kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Job,
        metadata: ObjectMeta,
        spec: JobSpec,
        status: JobStatus
      ): Job = {
        val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[Job]
      }
      
      @scala.inline
      implicit class JobMutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: batchSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.Job): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpec(value: JobSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * JobCondition describes current state of a job.
      */
    @js.native
    trait JobCondition extends StObject {
      
      /**
        * Last time the condition was checked.
        */
      var lastProbeTime: String = js.native
      
      /**
        * Last time the condition transit from one status to another.
        */
      var lastTransitionTime: String = js.native
      
      /**
        * Human readable message indicating details about last transition.
        */
      var message: String = js.native
      
      /**
        * (brief) reason for the condition's last transition.
        */
      var reason: String = js.native
      
      /**
        * Status of the condition, one of True, False, Unknown.
        */
      var status: String = js.native
      
      /**
        * Type of job condition, Complete or Failed.
        */
      var `type`: String = js.native
    }
    object JobCondition {
      
      @scala.inline
      def apply(
        lastProbeTime: String,
        lastTransitionTime: String,
        message: String,
        reason: String,
        status: String,
        `type`: String
      ): JobCondition = {
        val __obj = js.Dynamic.literal(lastProbeTime = lastProbeTime.asInstanceOf[js.Any], lastTransitionTime = lastTransitionTime.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[JobCondition]
      }
      
      @scala.inline
      implicit class JobConditionMutableBuilder[Self <: JobCondition] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setLastProbeTime(value: String): Self = StObject.set(x, "lastProbeTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * JobSpec describes how the job execution will look like.
      */
    @js.native
    trait JobSpec extends StObject {
      
      /**
        * Specifies the duration in seconds relative to the startTime that the job may be active before the system tries to terminate it; value must be positive integer
        */
      var activeDeadlineSeconds: Double = js.native
      
      /**
        * Specifies the number of retries before marking this job failed. Defaults to 6
        */
      var backoffLimit: Double = js.native
      
      /**
        * Specifies the desired number of successfully finished pods the job should be run with.  Setting to nil means that the success of any pod signals the success of all pods, and allows parallelism to have any positive value.  Setting to 1 means that parallelism is limited to 1 and the success of that pod signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
        */
      var completions: Double = js.native
      
      /**
        * manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector` unset unless you are certain what you are doing. When false or unset, the system pick labels unique to this job and appends those labels to the pod template.  When true, the user is responsible for picking unique labels and specifying the selector.  Failure to pick a unique label may cause this and other jobs to not function correctly.  However, You may see `manualSelector=true` in jobs that were created with the old `extensions/v1beta1` API. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
        */
      var manualSelector: Boolean = js.native
      
      /**
        * Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
        */
      var parallelism: Double = js.native
      
      /**
        * A label query over pods that should match the pod count. Normally, the system sets this field for you. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
        */
      var selector: LabelSelector = js.native
      
      /**
        * Describes the pod that will be created when executing a job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
        */
      var template: PodTemplateSpec = js.native
      
      /**
        * ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes. This field is alpha-level and is only honored by servers that enable the TTLAfterFinished feature.
        */
      var ttlSecondsAfterFinished: Double = js.native
    }
    object JobSpec {
      
      @scala.inline
      def apply(
        activeDeadlineSeconds: Double,
        backoffLimit: Double,
        completions: Double,
        manualSelector: Boolean,
        parallelism: Double,
        selector: LabelSelector,
        template: PodTemplateSpec,
        ttlSecondsAfterFinished: Double
      ): JobSpec = {
        val __obj = js.Dynamic.literal(activeDeadlineSeconds = activeDeadlineSeconds.asInstanceOf[js.Any], backoffLimit = backoffLimit.asInstanceOf[js.Any], completions = completions.asInstanceOf[js.Any], manualSelector = manualSelector.asInstanceOf[js.Any], parallelism = parallelism.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], ttlSecondsAfterFinished = ttlSecondsAfterFinished.asInstanceOf[js.Any])
        __obj.asInstanceOf[JobSpec]
      }
      
      @scala.inline
      implicit class JobSpecMutableBuilder[Self <: JobSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActiveDeadlineSeconds(value: Double): Self = StObject.set(x, "activeDeadlineSeconds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBackoffLimit(value: Double): Self = StObject.set(x, "backoffLimit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCompletions(value: Double): Self = StObject.set(x, "completions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setManualSelector(value: Boolean): Self = StObject.set(x, "manualSelector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParallelism(value: Double): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelector(value: LabelSelector): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplate(value: PodTemplateSpec): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTtlSecondsAfterFinished(value: Double): Self = StObject.set(x, "ttlSecondsAfterFinished", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * JobStatus represents the current state of a Job.
      */
    @js.native
    trait JobStatus extends StObject {
      
      /**
        * The number of actively running pods.
        */
      var active: Double = js.native
      
      /**
        * Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
        */
      var completionTime: String = js.native
      
      /**
        * The latest available observations of an object's current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
        */
      var conditions: js.Array[JobCondition] = js.native
      
      /**
        * The number of pods which reached phase Failed.
        */
      var failed: Double = js.native
      
      /**
        * Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
        */
      var startTime: String = js.native
      
      /**
        * The number of pods which reached phase Succeeded.
        */
      var succeeded: Double = js.native
    }
    object JobStatus {
      
      @scala.inline
      def apply(
        active: Double,
        completionTime: String,
        conditions: js.Array[JobCondition],
        failed: Double,
        startTime: String,
        succeeded: Double
      ): JobStatus = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], completionTime = completionTime.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
        __obj.asInstanceOf[JobStatus]
      }
      
      @scala.inline
      implicit class JobStatusMutableBuilder[Self <: JobStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCompletionTime(value: String): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConditions(value: js.Array[JobCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConditionsVarargs(value: JobCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
        
        @scala.inline
        def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSucceeded(value: Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object v1beta1 {
    
    /**
      * CronJob represents the configuration of a single cron job.
      */
    @js.native
    trait CronJob extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: batchSlashv1beta1 = js.native
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CronJob = js.native
      
      /**
        * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: ObjectMeta = js.native
      
      /**
        * Specification of the desired behavior of a cron job, including the schedule. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: CronJobSpec = js.native
      
      /**
        * Current status of a cron job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var status: CronJobStatus = js.native
    }
    object CronJob {
      
      @scala.inline
      def apply(
        apiVersion: batchSlashv1beta1,
        kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CronJob,
        metadata: ObjectMeta,
        spec: CronJobSpec,
        status: CronJobStatus
      ): CronJob = {
        val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[CronJob]
      }
      
      @scala.inline
      implicit class CronJobMutableBuilder[Self <: CronJob] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: batchSlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.CronJob): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpec(value: CronJobSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: CronJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * CronJobSpec describes how the job execution will look like and when it will actually run.
      */
    @js.native
    trait CronJobSpec extends StObject {
      
      /**
        * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
        */
      var concurrencyPolicy: String = js.native
      
      /**
        * The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 1.
        */
      var failedJobsHistoryLimit: Double = js.native
      
      /**
        * Specifies the job that will be created when executing a CronJob.
        */
      var jobTemplate: JobTemplateSpec = js.native
      
      /**
        * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
        */
      var schedule: String = js.native
      
      /**
        * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
        */
      var startingDeadlineSeconds: Double = js.native
      
      /**
        * The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified. Defaults to 3.
        */
      var successfulJobsHistoryLimit: Double = js.native
      
      /**
        * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
        */
      var suspend: Boolean = js.native
    }
    object CronJobSpec {
      
      @scala.inline
      def apply(
        concurrencyPolicy: String,
        failedJobsHistoryLimit: Double,
        jobTemplate: JobTemplateSpec,
        schedule: String,
        startingDeadlineSeconds: Double,
        successfulJobsHistoryLimit: Double,
        suspend: Boolean
      ): CronJobSpec = {
        val __obj = js.Dynamic.literal(concurrencyPolicy = concurrencyPolicy.asInstanceOf[js.Any], failedJobsHistoryLimit = failedJobsHistoryLimit.asInstanceOf[js.Any], jobTemplate = jobTemplate.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], startingDeadlineSeconds = startingDeadlineSeconds.asInstanceOf[js.Any], successfulJobsHistoryLimit = successfulJobsHistoryLimit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any])
        __obj.asInstanceOf[CronJobSpec]
      }
      
      @scala.inline
      implicit class CronJobSpecMutableBuilder[Self <: CronJobSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConcurrencyPolicy(value: String): Self = StObject.set(x, "concurrencyPolicy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFailedJobsHistoryLimit(value: Double): Self = StObject.set(x, "failedJobsHistoryLimit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJobTemplate(value: JobTemplateSpec): Self = StObject.set(x, "jobTemplate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartingDeadlineSeconds(value: Double): Self = StObject.set(x, "startingDeadlineSeconds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSuccessfulJobsHistoryLimit(value: Double): Self = StObject.set(x, "successfulJobsHistoryLimit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSuspend(value: Boolean): Self = StObject.set(x, "suspend", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * CronJobStatus represents the current state of a cron job.
      */
    @js.native
    trait CronJobStatus extends StObject {
      
      /**
        * A list of pointers to currently running jobs.
        */
      var active: js.Array[ObjectReference] = js.native
      
      /**
        * Information when was the last time the job was successfully scheduled.
        */
      var lastScheduleTime: String = js.native
    }
    object CronJobStatus {
      
      @scala.inline
      def apply(active: js.Array[ObjectReference], lastScheduleTime: String): CronJobStatus = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], lastScheduleTime = lastScheduleTime.asInstanceOf[js.Any])
        __obj.asInstanceOf[CronJobStatus]
      }
      
      @scala.inline
      implicit class CronJobStatusMutableBuilder[Self <: CronJobStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActive(value: js.Array[ObjectReference]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActiveVarargs(value: ObjectReference*): Self = StObject.set(x, "active", js.Array(value :_*))
        
        @scala.inline
        def setLastScheduleTime(value: String): Self = StObject.set(x, "lastScheduleTime", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * JobTemplateSpec describes the data a Job should have when created from a template
      */
    @js.native
    trait JobTemplateSpec extends StObject {
      
      /**
        * Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: ObjectMeta = js.native
      
      /**
        * Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: JobSpec = js.native
    }
    object JobTemplateSpec {
      
      @scala.inline
      def apply(metadata: ObjectMeta, spec: JobSpec): JobTemplateSpec = {
        val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
        __obj.asInstanceOf[JobTemplateSpec]
      }
      
      @scala.inline
      implicit class JobTemplateSpecMutableBuilder[Self <: JobTemplateSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpec(value: JobSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object v2alpha1 {
    
    /**
      * CronJob represents the configuration of a single cron job.
      */
    @js.native
    trait CronJob extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: batchSlashv2alpha1 = js.native
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CronJob = js.native
      
      /**
        * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: ObjectMeta = js.native
      
      /**
        * Specification of the desired behavior of a cron job, including the schedule. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: CronJobSpec = js.native
      
      /**
        * Current status of a cron job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var status: CronJobStatus = js.native
    }
    object CronJob {
      
      @scala.inline
      def apply(
        apiVersion: batchSlashv2alpha1,
        kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CronJob,
        metadata: ObjectMeta,
        spec: CronJobSpec,
        status: CronJobStatus
      ): CronJob = {
        val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[CronJob]
      }
      
      @scala.inline
      implicit class CronJobMutableBuilder[Self <: CronJob] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: batchSlashv2alpha1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.CronJob): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpec(value: CronJobSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: CronJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * CronJobSpec describes how the job execution will look like and when it will actually run.
      */
    @js.native
    trait CronJobSpec extends StObject {
      
      /**
        * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow" (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - "Replace": cancels currently running job and replaces it with a new one
        */
      var concurrencyPolicy: String = js.native
      
      /**
        * The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
        */
      var failedJobsHistoryLimit: Double = js.native
      
      /**
        * Specifies the job that will be created when executing a CronJob.
        */
      var jobTemplate: JobTemplateSpec = js.native
      
      /**
        * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
        */
      var schedule: String = js.native
      
      /**
        * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
        */
      var startingDeadlineSeconds: Double = js.native
      
      /**
        * The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
        */
      var successfulJobsHistoryLimit: Double = js.native
      
      /**
        * This flag tells the controller to suspend subsequent executions, it does not apply to already started executions.  Defaults to false.
        */
      var suspend: Boolean = js.native
    }
    object CronJobSpec {
      
      @scala.inline
      def apply(
        concurrencyPolicy: String,
        failedJobsHistoryLimit: Double,
        jobTemplate: JobTemplateSpec,
        schedule: String,
        startingDeadlineSeconds: Double,
        successfulJobsHistoryLimit: Double,
        suspend: Boolean
      ): CronJobSpec = {
        val __obj = js.Dynamic.literal(concurrencyPolicy = concurrencyPolicy.asInstanceOf[js.Any], failedJobsHistoryLimit = failedJobsHistoryLimit.asInstanceOf[js.Any], jobTemplate = jobTemplate.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any], startingDeadlineSeconds = startingDeadlineSeconds.asInstanceOf[js.Any], successfulJobsHistoryLimit = successfulJobsHistoryLimit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any])
        __obj.asInstanceOf[CronJobSpec]
      }
      
      @scala.inline
      implicit class CronJobSpecMutableBuilder[Self <: CronJobSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConcurrencyPolicy(value: String): Self = StObject.set(x, "concurrencyPolicy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFailedJobsHistoryLimit(value: Double): Self = StObject.set(x, "failedJobsHistoryLimit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJobTemplate(value: JobTemplateSpec): Self = StObject.set(x, "jobTemplate", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSchedule(value: String): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartingDeadlineSeconds(value: Double): Self = StObject.set(x, "startingDeadlineSeconds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSuccessfulJobsHistoryLimit(value: Double): Self = StObject.set(x, "successfulJobsHistoryLimit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSuspend(value: Boolean): Self = StObject.set(x, "suspend", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * CronJobStatus represents the current state of a cron job.
      */
    @js.native
    trait CronJobStatus extends StObject {
      
      /**
        * A list of pointers to currently running jobs.
        */
      var active: js.Array[ObjectReference] = js.native
      
      /**
        * Information when was the last time the job was successfully scheduled.
        */
      var lastScheduleTime: String = js.native
    }
    object CronJobStatus {
      
      @scala.inline
      def apply(active: js.Array[ObjectReference], lastScheduleTime: String): CronJobStatus = {
        val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], lastScheduleTime = lastScheduleTime.asInstanceOf[js.Any])
        __obj.asInstanceOf[CronJobStatus]
      }
      
      @scala.inline
      implicit class CronJobStatusMutableBuilder[Self <: CronJobStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setActive(value: js.Array[ObjectReference]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setActiveVarargs(value: ObjectReference*): Self = StObject.set(x, "active", js.Array(value :_*))
        
        @scala.inline
        def setLastScheduleTime(value: String): Self = StObject.set(x, "lastScheduleTime", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * JobTemplateSpec describes the data a Job should have when created from a template
      */
    @js.native
    trait JobTemplateSpec extends StObject {
      
      /**
        * Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: ObjectMeta = js.native
      
      /**
        * Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: JobSpec = js.native
    }
    object JobTemplateSpec {
      
      @scala.inline
      def apply(metadata: ObjectMeta, spec: JobSpec): JobTemplateSpec = {
        val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
        __obj.asInstanceOf[JobTemplateSpec]
      }
      
      @scala.inline
      implicit class JobTemplateSpecMutableBuilder[Self <: JobTemplateSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpec(value: JobSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      }
    }
  }
}
