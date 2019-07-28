package typings.atPulumiKubernetes.batchV2alpha1CronJobMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`batch/v2alpha1`
import typings.atPulumiKubernetes.typesOutputMod.batchNs.v2alpha1Ns.CronJobSpec
import typings.atPulumiKubernetes.typesOutputMod.batchNs.v2alpha1Ns.CronJobStatus
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/batch/v2alpha1/CronJob", "CronJob")
@js.native
class CronJob protected () extends CustomResource {
  /**
    * Create a batch.v2alpha1.CronJob resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.batchNs.v2alpha1Ns.CronJob) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.batchNs.v2alpha1Ns.CronJob,
    opts: CustomResourceOptions
  ) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: Output[`batch/v2alpha1`] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.CronJob] = js.native
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: Output[ObjectMeta] = js.native
  /**
    * Specification of the desired behavior of a cron job, including the schedule. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
    */
  val spec: Output[CronJobSpec] = js.native
  /**
    * Current status of a cron job. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
    */
  val status: Output[CronJobStatus] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/batch/v2alpha1/CronJob", "CronJob")
@js.native
object CronJob extends js.Object {
  /**
    * Get the state of an existing `CronJob` resource, as identified by `id`.
    * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
    * Kubernetes convention) the ID becomes default/<name>.
    *
    * Pulumi will keep track of this resource using `name` as the Pulumi ID.
    *
    * @param name _Unique_ name used to register this resource with Pulumi.
    * @param id An ID for the Kubernetes resource to retrieve. Takes the form
    *  <namespace>/<name> or <name>.
    * @param opts Uniquely specifies a CustomResource to select.
    */
  def get(name: String, id: Input[ID]): CronJob = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): CronJob = js.native
  /**
    * Returns true if the given object is an instance of CronJob.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v2alpha1/CronJob.CronJob */ Boolean = js.native
}

