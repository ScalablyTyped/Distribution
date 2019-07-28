package typings.atPulumiKubernetes.certificatesV1beta1CertificateSigningRequestListMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`certificatesDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.certificatesNs.v1beta1Ns.CertificateSigningRequest
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ListMeta
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/certificates/v1beta1/CertificateSigningRequestList", "CertificateSigningRequestList")
@js.native
class CertificateSigningRequestList protected () extends CustomResource {
  /**
    * Create a certificates.v1beta1.CertificateSigningRequestList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.certificatesNs.v1beta1Ns.CertificateSigningRequestList
  ) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.certificatesNs.v1beta1Ns.CertificateSigningRequestList,
    opts: CustomResourceOptions
  ) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: Output[`certificatesDOTk8sDOTio/v1beta1`] = js.native
  val items: Output[js.Array[CertificateSigningRequest]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: Output[
    typings.atPulumiKubernetes.atPulumiKubernetesStrings.CertificateSigningRequestList
  ] = js.native
  val metadata: Output[ListMeta] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/certificates/v1beta1/CertificateSigningRequestList", "CertificateSigningRequestList")
@js.native
object CertificateSigningRequestList extends js.Object {
  /**
    * Get the state of an existing `CertificateSigningRequestList` resource, as identified by `id`.
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
  def get(name: String, id: Input[ID]): CertificateSigningRequestList = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): CertificateSigningRequestList = js.native
  /**
    * Returns true if the given object is an instance of CertificateSigningRequestList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/CertificateSigningRequestList.CertificateSigningRequestList */ Boolean = js.native
}

