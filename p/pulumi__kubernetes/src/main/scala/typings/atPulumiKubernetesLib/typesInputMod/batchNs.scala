package typings
package atPulumiKubernetesLib.typesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "batch")
@js.native
object batchNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
      * Job represents the configuration of a single job.
      */
    trait Job extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1`]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Job]
          ] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * Specification of the desired behavior of a job. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[JobSpec]] = js.undefined
      /**
        * Current status of a job. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[JobStatus]] = js.undefined
    }
    
    /**
      * JobCondition describes current state of a job.
      */
    trait JobCondition extends js.Object {
      /**
        * Last time the condition was checked.
        */
      var lastProbeTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * Last time the condition transit from one status to another.
        */
      var lastTransitionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * Human readable message indicating details about last transition.
        */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * (brief) reason for the condition's last transition.
        */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * Status of the condition, one of True, False, Unknown.
        */
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
        * Type of job condition, Complete or Failed.
        */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
      * JobList is a collection of jobs.
      */
    trait JobList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1`]
          ] = js.undefined
      /**
        * items is the list of Jobs.
        */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[Job]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.JobList]
          ] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
      * JobSpec describes how the job execution will look like.
      */
    trait JobSpec extends js.Object {
      /**
        * Specifies the duration in seconds relative to the startTime that the job may be active
        * before the system tries to terminate it; value must be positive integer
        */
      var activeDeadlineSeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
        * Specifies the number of retries before marking this job failed. Defaults to 6
        */
      var backoffLimit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
        * Specifies the desired number of successfully finished pods the job should be run with.
        * Setting to nil means that the success of any pod signals the success of all pods, and
        * allows parallelism to have any positive value.  Setting to 1 means that parallelism is
        * limited to 1 and the success of that pod signals the success of the job. More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
        */
      var completions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
        * manualSelector controls generation of pod labels and pod selectors. Leave `manualSelector`
        * unset unless you are certain what you are doing. When false or unset, the system pick
        * labels unique to this job and appends those labels to the pod template.  When true, the
        * user is responsible for picking unique labels and specifying the selector.  Failure to pick
        * a unique label may cause this and other jobs to not function correctly.  However, You may
        * see `manualSelector=true` in jobs that were created with the old `extensions/v1beta1` API.
        * More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/#specifying-your-own-pod-selector
        */
      var manualSelector: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
        * Specifies the maximum desired number of pods the job should run at any given time. The
        * actual number of pods running in steady state will be less than this number when
        * ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to
        * do is less than max parallelism. More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
        */
      var parallelism: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
        * A label query over pods that should match the pod count. Normally, the system sets this
        * field for you. More info:
        * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
        */
      var selector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
          ] = js.undefined
      /**
        * Describes the pod that will be created when executing a job. More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
        */
      var template: atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.PodTemplateSpec]
      /**
        * ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either
        * Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes,
        * it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle
        * guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be
        * automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted
        * immediately after it finishes. This field is alpha-level and is only honored by servers
        * that enable the TTLAfterFinished feature.
        */
      var ttlSecondsAfterFinished: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
      * JobStatus represents the current state of a Job.
      */
    trait JobStatus extends js.Object {
      /**
        * The number of actively running pods.
        */
      var active: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
        * Represents time when the job was completed. It is not guaranteed to be set in
        * happens-before order across separate operations. It is represented in RFC3339 form and is
        * in UTC.
        */
      var completionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * The latest available observations of an object's current state. More info:
        * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
        */
      var conditions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[JobCondition]]] = js.undefined
      /**
        * The number of pods which reached phase Failed.
        */
      var failed: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
        * Represents time when the job was acknowledged by the job controller. It is not guaranteed
        * to be set in happens-before order across separate operations. It is represented in RFC3339
        * form and is in UTC.
        */
      var startTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * The number of pods which reached phase Succeeded.
        */
      var succeeded: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    def isJob(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.batch.v1.Job */ scala.Boolean = js.native
    def isJobList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.batch.v1.JobList */ scala.Boolean = js.native
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * CronJob represents the configuration of a single cron job.
      */
    trait CronJob extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1`]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CronJob]
          ] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * Specification of the desired behavior of a cron job, including the schedule. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[CronJobSpec]] = js.undefined
      /**
        * Current status of a cron job. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[CronJobStatus]] = js.undefined
    }
    
    /**
      * CronJobList is a collection of cron jobs.
      */
    trait CronJobList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v1beta1`]
          ] = js.undefined
      /**
        * items is the list of CronJobs.
        */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[CronJob]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CronJobList]
          ] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
      * CronJobSpec describes how the job execution will look like and when it will actually run.
      */
    trait CronJobSpec extends js.Object {
      /**
        * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow"
        * (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs,
        * skipping next run if previous run hasn't finished yet; - "Replace": cancels currently
        * running job and replaces it with a new one
        */
      var concurrencyPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * The number of failed finished jobs to retain. This is a pointer to distinguish between
        * explicit zero and not specified. Defaults to 1.
        */
      var failedJobsHistoryLimit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
        * Specifies the job that will be created when executing a CronJob.
        */
      var jobTemplate: atPulumiPulumiLib.resourceMod.Input[JobTemplateSpec]
      /**
        * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
        */
      var schedule: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
        * Optional deadline in seconds for starting the job if it misses scheduled time for any
        * reason.  Missed jobs executions will be counted as failed ones.
        */
      var startingDeadlineSeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
        * The number of successful finished jobs to retain. This is a pointer to distinguish between
        * explicit zero and not specified. Defaults to 3.
        */
      var successfulJobsHistoryLimit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
        * This flag tells the controller to suspend subsequent executions, it does not apply to
        * already started executions.  Defaults to false.
        */
      var suspend: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
    }
    
    /**
      * CronJobStatus represents the current state of a cron job.
      */
    trait CronJobStatus extends js.Object {
      /**
        * A list of pointers to currently running jobs.
        */
      var active: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ObjectReference]]
          ] = js.undefined
      /**
        * Information when was the last time the job was successfully scheduled.
        */
      var lastScheduleTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
      * JobTemplateSpec describes the data a Job should have when created from a template
      */
    trait JobTemplateSpec extends js.Object {
      /**
        * Standard object's metadata of the jobs created from this template. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * Specification of the desired behavior of the job. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.batchNs.v1Ns.JobSpec]
          ] = js.undefined
    }
    
    def isCronJob(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.batch.v1beta1.CronJob */ scala.Boolean = js.native
    def isCronJobList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.batch.v1beta1.CronJobList */ scala.Boolean = js.native
  }
  
  @JSName("v2alpha1")
  @js.native
  object v2alpha1Ns extends js.Object {
    /**
      * CronJob represents the configuration of a single cron job.
      */
    trait CronJob extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1`]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CronJob]
          ] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * Specification of the desired behavior of a cron job, including the schedule. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[CronJobSpec]] = js.undefined
      /**
        * Current status of a cron job. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[CronJobStatus]] = js.undefined
    }
    
    /**
      * CronJobList is a collection of cron jobs.
      */
    trait CronJobList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`batch/v2alpha1`]
          ] = js.undefined
      /**
        * items is the list of CronJobs.
        */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[CronJob]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CronJobList]
          ] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
      * CronJobSpec describes how the job execution will look like and when it will actually run.
      */
    trait CronJobSpec extends js.Object {
      /**
        * Specifies how to treat concurrent executions of a Job. Valid values are: - "Allow"
        * (default): allows CronJobs to run concurrently; - "Forbid": forbids concurrent runs,
        * skipping next run if previous run hasn't finished yet; - "Replace": cancels currently
        * running job and replaces it with a new one
        */
      var concurrencyPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * The number of failed finished jobs to retain. This is a pointer to distinguish between
        * explicit zero and not specified.
        */
      var failedJobsHistoryLimit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
        * Specifies the job that will be created when executing a CronJob.
        */
      var jobTemplate: atPulumiPulumiLib.resourceMod.Input[JobTemplateSpec]
      /**
        * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
        */
      var schedule: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
        * Optional deadline in seconds for starting the job if it misses scheduled time for any
        * reason.  Missed jobs executions will be counted as failed ones.
        */
      var startingDeadlineSeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
        * The number of successful finished jobs to retain. This is a pointer to distinguish between
        * explicit zero and not specified.
        */
      var successfulJobsHistoryLimit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
        * This flag tells the controller to suspend subsequent executions, it does not apply to
        * already started executions.  Defaults to false.
        */
      var suspend: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
    }
    
    /**
      * CronJobStatus represents the current state of a cron job.
      */
    trait CronJobStatus extends js.Object {
      /**
        * A list of pointers to currently running jobs.
        */
      var active: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.ObjectReference]]
          ] = js.undefined
      /**
        * Information when was the last time the job was successfully scheduled.
        */
      var lastScheduleTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
      * JobTemplateSpec describes the data a Job should have when created from a template
      */
    trait JobTemplateSpec extends js.Object {
      /**
        * Standard object's metadata of the jobs created from this template. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * Specification of the desired behavior of the job. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.batchNs.v1Ns.JobSpec]
          ] = js.undefined
    }
    
    def isCronJob(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.batch.v2alpha1.CronJob */ scala.Boolean = js.native
    def isCronJobList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.batch.v2alpha1.CronJobList */ scala.Boolean = js.native
  }
  
}

