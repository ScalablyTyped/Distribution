package typings
package atPulumiKubernetesLib.atPulumiKubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "authorization")
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
      extends atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.LocalSubjectAccessReview {
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
    }
    
    /**
      * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not
      * filling in a spec.namespace means "in all namespaces".  Self is a special case, because users
      * should always be able to check whether they can perform an action
      */
    @js.native
    class SelfSubjectAccessReview protected ()
      extends atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.SelfSubjectAccessReview {
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
      extends atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.SelfSubjectRulesReview {
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
    }
    
    /**
      * SubjectAccessReview checks whether or not a user or group can perform an action.
      */
    @js.native
    class SubjectAccessReview protected ()
      extends atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.SubjectAccessReview {
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
    }
    
    /**
      * LocalSubjectAccessReview checks whether or not a user or group can perform an action in a
      * given namespace. Having a namespace scoped resource makes it much easier to grant namespace
      * scoped policy that includes permissions checking.
      */
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
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.LocalSubjectAccessReview = js.native
    }
    
    /**
      * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not
      * filling in a spec.namespace means "in all namespaces".  Self is a special case, because users
      * should always be able to check whether they can perform an action
      */
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
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.SelfSubjectAccessReview = js.native
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
    object SelfSubjectRulesReview extends js.Object {
      /**
        * Get the state of an existing `SelfSubjectRulesReview` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.SelfSubjectRulesReview = js.native
    }
    
    /**
      * SubjectAccessReview checks whether or not a user or group can perform an action.
      */
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
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.authorizationNs.v1Ns.SubjectAccessReview = js.native
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
      extends atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.LocalSubjectAccessReview {
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
    
    /**
      * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not
      * filling in a spec.namespace means "in all namespaces".  Self is a special case, because users
      * should always be able to check whether they can perform an action
      */
    @js.native
    class SelfSubjectAccessReview protected ()
      extends atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.SelfSubjectAccessReview {
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
      extends atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.SelfSubjectRulesReview {
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
    
    /**
      * SubjectAccessReview checks whether or not a user or group can perform an action.
      */
    @js.native
    class SubjectAccessReview protected ()
      extends atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.SubjectAccessReview {
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
    
    /**
      * LocalSubjectAccessReview checks whether or not a user or group can perform an action in a
      * given namespace. Having a namespace scoped resource makes it much easier to grant namespace
      * scoped policy that includes permissions checking.
      */
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
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.LocalSubjectAccessReview = js.native
    }
    
    /**
      * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not
      * filling in a spec.namespace means "in all namespaces".  Self is a special case, because users
      * should always be able to check whether they can perform an action
      */
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
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.SelfSubjectAccessReview = js.native
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
    object SelfSubjectRulesReview extends js.Object {
      /**
        * Get the state of an existing `SelfSubjectRulesReview` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.SelfSubjectRulesReview = js.native
    }
    
    /**
      * SubjectAccessReview checks whether or not a user or group can perform an action.
      */
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
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.authorizationNs.v1beta1Ns.SubjectAccessReview = js.native
    }
    
  }
  
}

