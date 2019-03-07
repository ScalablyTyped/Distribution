package typings
package atPulumiKubernetesLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/provider", "authorization")
@js.native
object authorizationNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
      * LocalSubjectAccessReview checks whether or not a user or group can perform an action in a
      * given namespace. Having a namespace scoped resource makes it much easier to grant namespace
      * scoped policy that includes permissions checking.
      */
    @js.native
    class LocalSubjectAccessReview protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a authorization.v1.LocalSubjectAccessReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authorizationNs.v1Ns.LocalSubjectAccessReview) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authorizationNs.v1Ns.LocalSubjectAccessReview, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1`] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.LocalSubjectAccessReview] = js.native
      val metadata: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Spec holds information about the request being evaluated.  spec.namespace must be equal to
        * the namespace you made the request against.  If empty, it is defaulted.
        */
      val spec: atPulumiPulumiLib.outputMod.Output[
            atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewSpec
          ] = js.native
      /**
        * Status is filled in by the server and indicates whether the request is allowed or not
        */
      val status: atPulumiPulumiLib.outputMod.Output[
            atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewStatus
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.authorizationNs.v1Ns.LocalSubjectAccessReview = js.native
    }
    
    /**
      * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not
      * filling in a spec.namespace means "in all namespaces".  Self is a special case, because users
      * should always be able to check whether they can perform an action
      */
    @js.native
    class SelfSubjectAccessReview protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a authorization.v1.SelfSubjectAccessReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authorizationNs.v1Ns.SelfSubjectAccessReview) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authorizationNs.v1Ns.SelfSubjectAccessReview, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1`] = js.native
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
            atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SelfSubjectAccessReviewSpec
          ] = js.native
      /**
        * Status is filled in by the server and indicates whether the request is allowed or not
        */
      val status: atPulumiPulumiLib.outputMod.Output[
            atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewStatus
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.authorizationNs.v1Ns.SelfSubjectAccessReview = js.native
    }
    
    /**
      * SelfSubjectRulesReview enumerates the set of actions the current user can perform within a
      * namespace. The returned list of actions may be incomplete depending on the server's
      * authorization mode, and any errors experienced during the evaluation. SelfSubjectRulesReview
      * should be used by UIs to show/hide actions, or to quickly let an end user reason about their
      * permissions. It should NOT Be used by external systems to drive authorization decisions as
      * this raises confused deputy, cache lifetime/revocation, and correctness concerns.
      * SubjectAccessReview, and LocalAccessReview are the correct way to defer authorization
      * decisions to the API server.
      */
    @js.native
    class SelfSubjectRulesReview protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a authorization.v1.SelfSubjectRulesReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authorizationNs.v1Ns.SelfSubjectRulesReview) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authorizationNs.v1Ns.SelfSubjectRulesReview, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1`] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.SelfSubjectRulesReview] = js.native
      val metadata: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Spec holds information about the request being evaluated.
        */
      val spec: atPulumiPulumiLib.outputMod.Output[
            atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SelfSubjectRulesReviewSpec
          ] = js.native
      /**
        * Status is filled in by the server and indicates the set of actions a user can perform.
        */
      val status: atPulumiPulumiLib.outputMod.Output[
            atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectRulesReviewStatus
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.authorizationNs.v1Ns.SelfSubjectRulesReview = js.native
    }
    
    /**
      * SubjectAccessReview checks whether or not a user or group can perform an action.
      */
    @js.native
    class SubjectAccessReview protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a authorization.v1.SubjectAccessReview resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authorizationNs.v1Ns.SubjectAccessReview) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.authorizationNs.v1Ns.SubjectAccessReview, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`authorizationDOTk8sDOTio/v1`] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.SubjectAccessReview] = js.native
      val metadata: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Spec holds information about the request being evaluated
        */
      val spec: atPulumiPulumiLib.outputMod.Output[
            atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewSpec
          ] = js.native
      /**
        * Status is filled in by the server and indicates whether the request is allowed or not
        */
      val status: atPulumiPulumiLib.outputMod.Output[
            atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1Ns.SubjectAccessReviewStatus
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.authorizationNs.v1Ns.SubjectAccessReview = js.native
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.LocalSubjectAccessReview = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.LocalSubjectAccessReview = js.native
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.SelfSubjectAccessReview = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.SelfSubjectAccessReview = js.native
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.SelfSubjectRulesReview = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.SelfSubjectRulesReview = js.native
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.SubjectAccessReview = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.SubjectAccessReview = js.native
    }
    
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * LocalSubjectAccessReview checks whether or not a user or group can perform an action in a
      * given namespace. Having a namespace scoped resource makes it much easier to grant namespace
      * scoped policy that includes permissions checking.
      */
    @js.native
    class LocalSubjectAccessReview protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
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
      val kind: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.LocalSubjectAccessReview] = js.native
      val metadata: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Spec holds information about the request being evaluated.  spec.namespace must be equal to
        * the namespace you made the request against.  If empty, it is defaulted.
        */
      val spec: atPulumiPulumiLib.outputMod.Output[
            atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewSpec
          ] = js.native
      /**
        * Status is filled in by the server and indicates whether the request is allowed or not
        */
      val status: atPulumiPulumiLib.outputMod.Output[
            atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewStatus
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.authorizationNs.v1beta1Ns.LocalSubjectAccessReview = js.native
    }
    
    /**
      * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not
      * filling in a spec.namespace means "in all namespaces".  Self is a special case, because users
      * should always be able to check whether they can perform an action
      */
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
      val __inputs: js.Any = js.native
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
      def getInputs(): atPulumiKubernetesLib.typesInputMod.authorizationNs.v1beta1Ns.SelfSubjectAccessReview = js.native
    }
    
    /**
      * SelfSubjectRulesReview enumerates the set of actions the current user can perform within a
      * namespace. The returned list of actions may be incomplete depending on the server's
      * authorization mode, and any errors experienced during the evaluation. SelfSubjectRulesReview
      * should be used by UIs to show/hide actions, or to quickly let an end user reason about their
      * permissions. It should NOT Be used by external systems to drive authorization decisions as
      * this raises confused deputy, cache lifetime/revocation, and correctness concerns.
      * SubjectAccessReview, and LocalAccessReview are the correct way to defer authorization
      * decisions to the API server.
      */
    @js.native
    class SelfSubjectRulesReview protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
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
      val kind: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.SelfSubjectRulesReview] = js.native
      val metadata: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Spec holds information about the request being evaluated.
        */
      val spec: atPulumiPulumiLib.outputMod.Output[
            atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SelfSubjectRulesReviewSpec
          ] = js.native
      /**
        * Status is filled in by the server and indicates the set of actions a user can perform.
        */
      val status: atPulumiPulumiLib.outputMod.Output[
            atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectRulesReviewStatus
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.authorizationNs.v1beta1Ns.SelfSubjectRulesReview = js.native
    }
    
    /**
      * SubjectAccessReview checks whether or not a user or group can perform an action.
      */
    @js.native
    class SubjectAccessReview protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
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
      val __inputs: js.Any = js.native
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
      val kind: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.SubjectAccessReview] = js.native
      val metadata: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Spec holds information about the request being evaluated
        */
      val spec: atPulumiPulumiLib.outputMod.Output[
            atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewSpec
          ] = js.native
      /**
        * Status is filled in by the server and indicates whether the request is allowed or not
        */
      val status: atPulumiPulumiLib.outputMod.Output[
            atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewStatus
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.authorizationNs.v1beta1Ns.SubjectAccessReview = js.native
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.LocalSubjectAccessReview = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.LocalSubjectAccessReview = js.native
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.SelfSubjectAccessReview = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.SelfSubjectAccessReview = js.native
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.SelfSubjectRulesReview = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.SelfSubjectRulesReview = js.native
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
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.SubjectAccessReview = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.SubjectAccessReview = js.native
    }
    
  }
  
}

