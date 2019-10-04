package typings.atPulumiKubernetes.authorizationMod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/authorization", "v1")
@js.native
object v1Ns extends js.Object {
  @js.native
  class LocalSubjectAccessReview protected ()
    extends typings.atPulumiKubernetes.authorizationV1Mod.LocalSubjectAccessReview {
    /**
      * Create a authorization.v1.LocalSubjectAccessReview resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1Ns.LocalSubjectAccessReview
    ) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1Ns.LocalSubjectAccessReview,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class SelfSubjectAccessReview protected ()
    extends typings.atPulumiKubernetes.authorizationV1Mod.SelfSubjectAccessReview {
    /**
      * Create a authorization.v1.SelfSubjectAccessReview resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1Ns.SelfSubjectAccessReview
    ) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1Ns.SelfSubjectAccessReview,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class SelfSubjectRulesReview protected ()
    extends typings.atPulumiKubernetes.authorizationV1Mod.SelfSubjectRulesReview {
    /**
      * Create a authorization.v1.SelfSubjectRulesReview resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1Ns.SelfSubjectRulesReview
    ) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1Ns.SelfSubjectRulesReview,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class SubjectAccessReview protected ()
    extends typings.atPulumiKubernetes.authorizationV1Mod.SubjectAccessReview {
    /**
      * Create a authorization.v1.SubjectAccessReview resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1Ns.SubjectAccessReview
    ) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1Ns.SubjectAccessReview,
      opts: CustomResourceOptions
    ) = this()
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
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.authorizationV1LocalSubjectAccessReviewMod.LocalSubjectAccessReview = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.authorizationV1LocalSubjectAccessReviewMod.LocalSubjectAccessReview = js.native
    /**
      * Returns true if the given object is an instance of LocalSubjectAccessReview.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1/LocalSubjectAccessReview.LocalSubjectAccessReview */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SelfSubjectAccessReview extends js.Object {
    /**
      * Get the state of an existing `SelfSubjectAccessReview` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.authorizationV1SelfSubjectAccessReviewMod.SelfSubjectAccessReview = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.authorizationV1SelfSubjectAccessReviewMod.SelfSubjectAccessReview = js.native
    /**
      * Returns true if the given object is an instance of SelfSubjectAccessReview.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1/SelfSubjectAccessReview.SelfSubjectAccessReview */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SelfSubjectRulesReview extends js.Object {
    /**
      * Get the state of an existing `SelfSubjectRulesReview` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.authorizationV1SelfSubjectRulesReviewMod.SelfSubjectRulesReview = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.authorizationV1SelfSubjectRulesReviewMod.SelfSubjectRulesReview = js.native
    /**
      * Returns true if the given object is an instance of SelfSubjectRulesReview.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1/SelfSubjectRulesReview.SelfSubjectRulesReview */ Boolean = js.native
  }
  
  /* static members */
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
    def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.authorizationV1SubjectAccessReviewMod.SubjectAccessReview = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.authorizationV1SubjectAccessReviewMod.SubjectAccessReview = js.native
    /**
      * Returns true if the given object is an instance of SubjectAccessReview.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1/SubjectAccessReview.SubjectAccessReview */ Boolean = js.native
  }
  
}

