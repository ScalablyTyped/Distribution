package typings.atPulumiKubernetes.authorizationV1beta1SubjectAccessReviewMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`authorizationDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewSpec
import typings.atPulumiKubernetes.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewStatus
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/authorization/v1beta1/SubjectAccessReview", "SubjectAccessReview")
@js.native
class SubjectAccessReview protected () extends CustomResource {
  /**
    * Create a authorization.v1beta1.SubjectAccessReview resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1beta1Ns.SubjectAccessReview
  ) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1beta1Ns.SubjectAccessReview,
    opts: CustomResourceOptions
  ) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output[`authorizationDOTk8sDOTio/v1beta1`] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.SubjectAccessReview] = js.native
  val metadata: Output[ObjectMeta] = js.native
  /**
    * Spec holds information about the request being evaluated
    */
  val spec: Output[SubjectAccessReviewSpec] = js.native
  /**
    * Status is filled in by the server and indicates whether the request is allowed or not
    */
  val status: Output[SubjectAccessReviewStatus] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/authorization/v1beta1/SubjectAccessReview", "SubjectAccessReview")
@js.native
object SubjectAccessReview extends js.Object {
  /**
    * Get the state of an existing `SubjectAccessReview` resource, as identified by `id`.
    * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
    * Kubernetes convention) the ID becomes `default/<name>`.
    *
    * Pulumi will keep track of this resource using `name` as the Pulumi ID.
    *
    * @param name _Unique_ name used to register this resource with Pulumi.
    * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
    * @param opts Uniquely specifies a CustomResource to select.
    */
  def get(name: String, id: Input[ID]): SubjectAccessReview = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): SubjectAccessReview = js.native
  /**
    * Returns true if the given object is an instance of SubjectAccessReview.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/SubjectAccessReview.SubjectAccessReview */ Boolean = js.native
}

