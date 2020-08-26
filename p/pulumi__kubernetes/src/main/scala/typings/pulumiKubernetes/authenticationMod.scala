package typings.pulumiKubernetes

import typings.pulumiKubernetes.tokenRequestMod.TokenRequestArgs
import typings.pulumiKubernetes.v1TokenReviewMod.TokenReviewArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/authentication", JSImport.Namespace)
@js.native
object authenticationMod extends js.Object {
  @js.native
  object v1 extends js.Object {
    @js.native
    class TokenRequest protected ()
      extends typings.pulumiKubernetes.authenticationV1Mod.TokenRequest {
      /**
        * Create a TokenRequest resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: TokenRequestArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: TokenRequestArgs, opts: CustomResourceOptions) = this()
    }
    
    @js.native
    class TokenReview protected ()
      extends typings.pulumiKubernetes.authenticationV1Mod.TokenReview {
      /**
        * Create a TokenReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: TokenReviewArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: TokenReviewArgs, opts: CustomResourceOptions) = this()
    }
    
    /* static members */
    @js.native
    object TokenRequest extends js.Object {
      /**
        * Get an existing TokenRequest resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.tokenRequestMod.TokenRequest = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.tokenRequestMod.TokenRequest = js.native
      /**
        * Returns true if the given object is an instance of TokenRequest.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1/tokenRequest.TokenRequest */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object TokenReview extends js.Object {
      /**
        * Get an existing TokenReview resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1TokenReviewMod.TokenReview = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1TokenReviewMod.TokenReview = js.native
      /**
        * Returns true if the given object is an instance of TokenReview.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1/tokenReview.TokenReview */ Boolean = js.native
    }
    
  }
  
  @js.native
  object v1beta1 extends js.Object {
    @js.native
    class TokenReview protected ()
      extends typings.pulumiKubernetes.authenticationV1beta1Mod.TokenReview {
      /**
        * Create a TokenReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.pulumiKubernetes.tokenReviewMod.TokenReviewArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(
        name: String,
        args: typings.pulumiKubernetes.tokenReviewMod.TokenReviewArgs,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object TokenReview extends js.Object {
      /**
        * Get an existing TokenReview resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.tokenReviewMod.TokenReview = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.tokenReviewMod.TokenReview = js.native
      /**
        * Returns true if the given object is an instance of TokenReview.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1beta1/tokenReview.TokenReview */ Boolean = js.native
    }
    
  }
  
}

