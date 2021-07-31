package typings.pulumiKubernetes

import typings.pulumiKubernetes.tokenRequestMod.TokenRequestArgs
import typings.pulumiKubernetes.v1TokenReviewMod.TokenReviewArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authenticationV1Mod {
  
  @JSImport("@pulumi/kubernetes/authentication/v1", "TokenRequest")
  @js.native
  class TokenRequest protected ()
    extends typings.pulumiKubernetes.tokenRequestMod.TokenRequest {
    /**
      * Create a TokenRequest resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TokenRequestArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: TokenRequestArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object TokenRequest {
    
    @JSImport("@pulumi/kubernetes/authentication/v1", "TokenRequest")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing TokenRequest resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.tokenRequestMod.TokenRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.tokenRequestMod.TokenRequest]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.tokenRequestMod.TokenRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.tokenRequestMod.TokenRequest]
    
    /**
      * Returns true if the given object is an instance of TokenRequest.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1/tokenRequest.TokenRequest */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1/tokenRequest.TokenRequest */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes/authentication/v1", "TokenReview")
  @js.native
  class TokenReview protected ()
    extends typings.pulumiKubernetes.v1TokenReviewMod.TokenReview {
    /**
      * Create a TokenReview resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TokenReviewArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: TokenReviewArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object TokenReview {
    
    @JSImport("@pulumi/kubernetes/authentication/v1", "TokenReview")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing TokenReview resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1TokenReviewMod.TokenReview = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1TokenReviewMod.TokenReview]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1TokenReviewMod.TokenReview = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1TokenReviewMod.TokenReview]
    
    /**
      * Returns true if the given object is an instance of TokenReview.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1/tokenReview.TokenReview */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/authentication/v1/tokenReview.TokenReview */ Boolean]
  }
}
