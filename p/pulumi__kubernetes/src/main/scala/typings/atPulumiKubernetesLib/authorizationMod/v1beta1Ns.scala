package typings
package atPulumiKubernetesLib.authorizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/authorization", "v1beta1")
@js.native
object v1beta1Ns extends js.Object {
  @js.native
  class LocalSubjectAccessReview protected ()
    extends atPulumiKubernetesLib.authorizationV1beta1Mod.LocalSubjectAccessReview {
    /**
      * Create a authorization.v1beta1.LocalSubjectAccessReview resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authorizationNs.v1beta1Ns.LocalSubjectAccessReview) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authorizationNs.v1beta1Ns.LocalSubjectAccessReview, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SelfSubjectAccessReview protected ()
    extends atPulumiKubernetesLib.authorizationV1beta1Mod.SelfSubjectAccessReview {
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
  }
  
  @js.native
  class SelfSubjectRulesReview protected ()
    extends atPulumiKubernetesLib.authorizationV1beta1Mod.SelfSubjectRulesReview {
    /**
      * Create a authorization.v1beta1.SelfSubjectRulesReview resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authorizationNs.v1beta1Ns.SelfSubjectRulesReview) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authorizationNs.v1beta1Ns.SelfSubjectRulesReview, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class SubjectAccessReview protected ()
    extends atPulumiKubernetesLib.authorizationV1beta1Mod.SubjectAccessReview {
    /**
      * Create a authorization.v1beta1.SubjectAccessReview resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authorizationNs.v1beta1Ns.SubjectAccessReview) = this()
    def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authorizationNs.v1beta1Ns.SubjectAccessReview, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object LocalSubjectAccessReview extends js.Object {
    /**
      * Get the state of an existing `LocalSubjectAccessReview` resource, as identified by `id`.
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.authorizationV1beta1LocalSubjectAccessReviewMod.LocalSubjectAccessReview = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiKubernetesLib.authorizationV1beta1LocalSubjectAccessReviewMod.LocalSubjectAccessReview = js.native
    /**
      * Returns true if the given object is an instance of LocalSubjectAccessReview.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/LocalSubjectAccessReview.LocalSubjectAccessReview */ scala.Boolean = js.native
  }
  
  /* static members */
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
  
  /* static members */
  @js.native
  object SelfSubjectRulesReview extends js.Object {
    /**
      * Get the state of an existing `SelfSubjectRulesReview` resource, as identified by `id`.
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.authorizationV1beta1SelfSubjectRulesReviewMod.SelfSubjectRulesReview = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiKubernetesLib.authorizationV1beta1SelfSubjectRulesReviewMod.SelfSubjectRulesReview = js.native
    /**
      * Returns true if the given object is an instance of SelfSubjectRulesReview.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/SelfSubjectRulesReview.SelfSubjectRulesReview */ scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SubjectAccessReview extends js.Object {
    /**
      * Get the state of an existing `SubjectAccessReview` resource, as identified by `id`.
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.authorizationV1beta1SubjectAccessReviewMod.SubjectAccessReview = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiKubernetesLib.authorizationV1beta1SubjectAccessReviewMod.SubjectAccessReview = js.native
    /**
      * Returns true if the given object is an instance of SubjectAccessReview.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/SubjectAccessReview.SubjectAccessReview */ scala.Boolean = js.native
  }
  
}

