package typings.atPulumiKubernetes

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.batchSlashv2alpha1
import typings.atPulumiKubernetes.typesOutputMod.batch.v2alpha1.CronJob
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/batch/v2alpha1/CronJobList", JSImport.Namespace)
@js.native
object batchV2alpha1CronJobListMod extends js.Object {
  @js.native
  class CronJobList protected () extends CustomResource {
    /**
      * Create a batch.v2alpha1.CronJobList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.batch.v2alpha1.CronJobList) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.batch.v2alpha1.CronJobList,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output[batchSlashv2alpha1] = js.native
    /**
      * items is the list of CronJobs.
      */
    val items: Output[js.Array[CronJob]] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.CronJobList] = js.native
    /**
      * Standard list metadata. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output[ListMeta] = js.native
  }
  
  /* static members */
  @js.native
  object CronJobList extends js.Object {
    /**
      * Get the state of an existing `CronJobList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): CronJobList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): CronJobList = js.native
    /**
      * Returns true if the given object is an instance of CronJobList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/batch/v2alpha1/CronJobList.CronJobList */ Boolean = js.native
  }
  
}

