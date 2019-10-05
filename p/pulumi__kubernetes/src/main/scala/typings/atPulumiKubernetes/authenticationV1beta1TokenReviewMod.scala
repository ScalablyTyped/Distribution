package typings.atPulumiKubernetes

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`authenticationDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.authenticationV1beta1TokenReviewMod.TokenReview
import typings.atPulumiKubernetes.typesOutputMod.authentication.v1beta1.TokenReviewSpec
import typings.atPulumiKubernetes.typesOutputMod.authentication.v1beta1.TokenReviewStatus
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/authentication/v1beta1/TokenReview", JSImport.Namespace)
@js.native
object authenticationV1beta1TokenReviewMod extends js.Object {
  @js.native
  class TokenReview protected () extends CustomResource {
    /**
      * Create a authentication.v1beta1.TokenReview resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.authentication.v1beta1.TokenReview) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.authentication.v1beta1.TokenReview,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output[`authenticationDOTk8sDOTio/v1beta1`] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.TokenReview] = js.native
    val metadata: Output[ObjectMeta] = js.native
    /**
      * Spec holds information about the request being evaluated
      */
    val spec: Output[TokenReviewSpec] = js.native
    /**
      * Status is filled in by the server and indicates whether the request can be authenticated.
      */
    val status: Output[TokenReviewStatus] = js.native
  }
  
  /* static members */
  @js.native
  object TokenReview extends js.Object {
    /**
      * Get the state of an existing `TokenReview` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): TokenReview = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): TokenReview = js.native
    /**
      * Returns true if the given object is an instance of TokenReview.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1beta1/TokenReview.TokenReview */ Boolean = js.native
  }
  
}

