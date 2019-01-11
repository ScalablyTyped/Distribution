package typings
package atPulumiKubernetesLib.atPulumiKubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "authentication")
@js.native
object authenticationNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
      * TokenReview attempts to authenticate a token to a known user. Note: TokenReview requests may
      * be cached by the webhook token authenticator plugin in the kube-apiserver.
      */
    @js.native
    class TokenReview protected ()
      extends atPulumiKubernetesLib.providerMod.authenticationNs.v1Ns.TokenReview {
      /**
        * Create a authentication.v1.TokenReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authenticationNs.v1Ns.TokenReview) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authenticationNs.v1Ns.TokenReview, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * TokenReview attempts to authenticate a token to a known user. Note: TokenReview requests may
      * be cached by the webhook token authenticator plugin in the kube-apiserver.
      */
    @js.native
    object TokenReview extends js.Object {
      /**
        * Get the state of an existing `TokenReview` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.authenticationNs.v1Ns.TokenReview = js.native
    }
    
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * TokenReview attempts to authenticate a token to a known user. Note: TokenReview requests may
      * be cached by the webhook token authenticator plugin in the kube-apiserver.
      */
    @js.native
    class TokenReview protected ()
      extends atPulumiKubernetesLib.providerMod.authenticationNs.v1beta1Ns.TokenReview {
      /**
        * Create a authentication.v1beta1.TokenReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authenticationNs.v1beta1Ns.TokenReview) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authenticationNs.v1beta1Ns.TokenReview, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * TokenReview attempts to authenticate a token to a known user. Note: TokenReview requests may
      * be cached by the webhook token authenticator plugin in the kube-apiserver.
      */
    @js.native
    object TokenReview extends js.Object {
      /**
        * Get the state of an existing `TokenReview` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.authenticationNs.v1beta1Ns.TokenReview = js.native
    }
    
  }
  
}

