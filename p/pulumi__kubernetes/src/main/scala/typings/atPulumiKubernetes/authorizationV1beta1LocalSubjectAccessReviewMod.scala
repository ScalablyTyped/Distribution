package typings.atPulumiKubernetes

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.authorizationDotk8sDotioSlashv1beta1
import typings.atPulumiKubernetes.typesOutputMod.authorization.v1beta1.SubjectAccessReviewSpec
import typings.atPulumiKubernetes.typesOutputMod.authorization.v1beta1.SubjectAccessReviewStatus
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/authorization/v1beta1/LocalSubjectAccessReview", JSImport.Namespace)
@js.native
object authorizationV1beta1LocalSubjectAccessReviewMod extends js.Object {
  @js.native
  class LocalSubjectAccessReview protected () extends CustomResource {
    /**
      * Create a authorization.v1beta1.LocalSubjectAccessReview resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.authorization.v1beta1.LocalSubjectAccessReview
    ) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.authorization.v1beta1.LocalSubjectAccessReview,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output[authorizationDotk8sDotioSlashv1beta1] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.LocalSubjectAccessReview] = js.native
    val metadata: Output[ObjectMeta] = js.native
    /**
      * Spec holds information about the request being evaluated.  spec.namespace must be equal to
      * the namespace you made the request against.  If empty, it is defaulted.
      */
    val spec: Output[SubjectAccessReviewSpec] = js.native
    /**
      * Status is filled in by the server and indicates whether the request is allowed or not
      */
    val status: Output[SubjectAccessReviewStatus] = js.native
  }
  
  /* static members */
  @js.native
  object LocalSubjectAccessReview extends js.Object {
    /**
      * Get the state of an existing `LocalSubjectAccessReview` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): LocalSubjectAccessReview = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): LocalSubjectAccessReview = js.native
    /**
      * Returns true if the given object is an instance of LocalSubjectAccessReview.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/LocalSubjectAccessReview.LocalSubjectAccessReview */ Boolean = js.native
  }
  
}

