package typings.atPulumiKubernetes.apiregistrationV1APIServiceMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`apiregistrationDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.typesOutputMod.apiregistrationNs.v1Ns.APIServiceSpec
import typings.atPulumiKubernetes.typesOutputMod.apiregistrationNs.v1Ns.APIServiceStatus
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/apiregistration/v1/APIService", "APIService")
@js.native
class APIService protected () extends CustomResource {
  /**
    * Create a apiregistration.v1.APIService resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.apiregistrationNs.v1Ns.APIService) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.apiregistrationNs.v1Ns.APIService,
    opts: CustomResourceOptions
  ) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: Output[`apiregistrationDOTk8sDOTio/v1`] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.APIService] = js.native
  val metadata: Output[ObjectMeta] = js.native
  /**
    * Spec contains information for locating and communicating with a server
    */
  val spec: Output[APIServiceSpec] = js.native
  /**
    * Status contains derived information about an API server
    */
  val status: Output[APIServiceStatus] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/apiregistration/v1/APIService", "APIService")
@js.native
object APIService extends js.Object {
  /**
    * Get the state of an existing `APIService` resource, as identified by `id`.
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
  def get(name: String, id: Input[ID]): APIService = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): APIService = js.native
  /**
    * Returns true if the given object is an instance of APIService.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiregistration/v1/APIService.APIService */ Boolean = js.native
}

