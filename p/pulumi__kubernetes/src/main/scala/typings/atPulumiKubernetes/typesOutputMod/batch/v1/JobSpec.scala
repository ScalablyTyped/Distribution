package typings.atPulumiKubernetes.typesOutputMod.batch.v1

import typings.atPulumiKubernetes.typesOutputMod.core.v1.PodTemplateSpec
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.LabelSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JobSpec describes how the job execution will look like.
  */
trait JobSpec extends js.Object {
  /**
    * Specifies the duration in seconds relative to the startTime that the job may be active
    * before the system tries to terminate it; value must be positive integer
    */
  val activeDeadlineSeconds: Double
  /**
    * Specifies the number of retries before marking this job failed. Defaults to 6
    */
  val backoffLimit: Double
  /**
    * Specifies the desired number of successfully finished pods the job should be run with.
    * Setting to nil means that the success of any pod signals the success of all pods, and
    * allows parallelism to have any positive value.  Setting to 1 means that parallelism is
    * limited to 1 and the success of that pod signals the success of the job. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
    */
  val completions: Double
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
  val manualSelector: Boolean
  /**
    * Specifies the maximum desired number of pods the job should run at any given time. The
    * actual number of pods running in steady state will be less than this number when
    * ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to
    * do is less than max parallelism. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
    */
  val parallelism: Double
  /**
    * A label query over pods that should match the pod count. Normally, the system sets this
    * field for you. More info:
    * https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/#label-selectors
    */
  val selector: LabelSelector
  /**
    * Describes the pod that will be created when executing a job. More info:
    * https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
    */
  val template: PodTemplateSpec
  /**
    * ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either
    * Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes,
    * it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle
    * guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won't be
    * automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted
    * immediately after it finishes. This field is alpha-level and is only honored by servers
    * that enable the TTLAfterFinished feature.
    */
  val ttlSecondsAfterFinished: Double
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
    val __obj = js.Dynamic.literal(activeDeadlineSeconds = activeDeadlineSeconds, backoffLimit = backoffLimit, completions = completions, manualSelector = manualSelector, parallelism = parallelism, selector = selector, template = template, ttlSecondsAfterFinished = ttlSecondsAfterFinished)
  
    __obj.asInstanceOf[JobSpec]
  }
}

