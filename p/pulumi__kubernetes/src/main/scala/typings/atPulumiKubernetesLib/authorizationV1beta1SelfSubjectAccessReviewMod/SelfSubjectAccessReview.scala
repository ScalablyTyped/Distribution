package typings
package atPulumiKubernetesLib.authorizationV1beta1SelfSubjectAccessReviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/authorization/v1beta1/SelfSubjectAccessReview", "SelfSubjectAccessReview")
@js.native
class SelfSubjectAccessReview protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a authorization.v1beta1.SelfSubjectAccessReview resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authorizationNs.v1beta1Ns.SelfSubjectAccessReview) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authorizationNs.v1beta1Ns.SelfSubjectAccessReview, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1beta1`
  ] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.SelfSubjectAccessReview] = js.native
  val metadata: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  /**
    * Spec holds information about the request being evaluated.  user and groups must be empty
    */
  val spec: atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SelfSubjectAccessReviewSpec
  ] = js.native
  /**
    * Status is filled in by the server and indicates whether the request is allowed or not
    */
  val status: atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewStatus
  ] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/authorization/v1beta1/SelfSubjectAccessReview", "SelfSubjectAccessReview")
@js.native
object SelfSubjectAccessReview extends js.Object {
  /**
    * Get the state of an existing `SelfSubjectAccessReview` resource, as identified by `id`.
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.authorizationV1beta1SelfSubjectAccessReviewMod.SelfSubjectAccessReview = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiKubernetesLib.authorizationV1beta1SelfSubjectAccessReviewMod.SelfSubjectAccessReview = js.native
  /**
    * Returns true if the given object is an instance of SelfSubjectAccessReview.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/SelfSubjectAccessReview.SelfSubjectAccessReview */ scala.Boolean = js.native
}

