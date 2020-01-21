package typings.pulumiKubernetes.mod

import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "authentication")
@js.native
object authentication extends js.Object {
  @js.native
  object v1 extends js.Object {
    @js.native
    class TokenRequest protected ()
      extends typings.pulumiKubernetes.authenticationMod.v1.TokenRequest {
      /**
        * Create a authentication.v1.TokenRequest resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.inputMod.authentication.v1.TokenRequest) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.authentication.v1.TokenRequest,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class TokenReview protected ()
      extends typings.pulumiKubernetes.authenticationMod.v1.TokenReview {
      /**
        * Create a authentication.v1.TokenReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.inputMod.authentication.v1.TokenReview) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.authentication.v1.TokenReview,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object TokenRequest extends js.Object {
      /**
        * Get the state of an existing `TokenRequest` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.tokenRequestMod.TokenRequest = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.tokenRequestMod.TokenRequest = js.native
      /**
        * Returns true if the given object is an instance of TokenRequest.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1/TokenRequest.TokenRequest */ Boolean = js.native
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
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1TokenReviewMod.TokenReview = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1TokenReviewMod.TokenReview = js.native
      /**
        * Returns true if the given object is an instance of TokenReview.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1/TokenReview.TokenReview */ Boolean = js.native
    }
    
  }
  
  @js.native
  object v1beta1 extends js.Object {
    @js.native
    class TokenReview protected ()
      extends typings.pulumiKubernetes.authenticationMod.v1beta1.TokenReview {
      /**
        * Create a authentication.v1beta1.TokenReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.inputMod.authentication.v1beta1.TokenReview) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.inputMod.authentication.v1beta1.TokenReview,
        opts: CustomResourceOptions
      ) = this()
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
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.tokenReviewMod.TokenReview = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.tokenReviewMod.TokenReview = js.native
      /**
        * Returns true if the given object is an instance of TokenReview.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1beta1/TokenReview.TokenReview */ Boolean = js.native
    }
    
  }
  
}

