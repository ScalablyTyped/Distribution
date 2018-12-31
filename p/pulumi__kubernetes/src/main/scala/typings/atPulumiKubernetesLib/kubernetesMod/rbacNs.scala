package typings
package atPulumiKubernetesLib.kubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "rbac")
@js.native
object rbacNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
      * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a
      * unit by a RoleBinding or ClusterRoleBinding.
      */
    @js.native
    class ClusterRole protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRole {
      /**
        * Create a rbac.v1.ClusterRole resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRole) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRole, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a
      * ClusterRole in the global namespace, and adds who information via Subject.
      */
    @js.native
    class ClusterRoleBinding protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRoleBinding {
      /**
        * Create a rbac.v1.ClusterRoleBinding resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRoleBinding) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRoleBinding, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ClusterRoleBindingList is a collection of ClusterRoleBindings
      */
    @js.native
    class ClusterRoleBindingList protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRoleBindingList {
      /**
        * Create a rbac.v1.ClusterRoleBindingList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRoleBindingList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRoleBindingList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ClusterRoleList is a collection of ClusterRoles
      */
    @js.native
    class ClusterRoleList protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRoleList {
      /**
        * Create a rbac.v1.ClusterRoleList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRoleList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.ClusterRoleList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a
      * RoleBinding.
      */
    @js.native
    class Role protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.Role {
      /**
        * Create a rbac.v1.Role resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.Role) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.Role, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * RoleBinding references a role, but does not contain it.  It can reference a Role in the same
      * namespace or a ClusterRole in the global namespace. It adds who information via Subjects and
      * namespace information by which namespace it exists in.  RoleBindings in a given namespace
      * only have effect in that namespace.
      */
    @js.native
    class RoleBinding protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.RoleBinding {
      /**
        * Create a rbac.v1.RoleBinding resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.RoleBinding) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.RoleBinding, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * RoleBindingList is a collection of RoleBindings
      */
    @js.native
    class RoleBindingList protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.RoleBindingList {
      /**
        * Create a rbac.v1.RoleBindingList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.RoleBindingList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.RoleBindingList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * RoleList is a collection of Roles
      */
    @js.native
    class RoleList protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.RoleList {
      /**
        * Create a rbac.v1.RoleList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.RoleList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1Ns.RoleList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a
      * unit by a RoleBinding or ClusterRoleBinding.
      */
    @js.native
    object ClusterRole extends js.Object {
      /**
        * Get the state of an existing `ClusterRole` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRole = js.native
    }
    
    /**
      * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a
      * ClusterRole in the global namespace, and adds who information via Subject.
      */
    @js.native
    object ClusterRoleBinding extends js.Object {
      /**
        * Get the state of an existing `ClusterRoleBinding` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRoleBinding = js.native
    }
    
    /**
      * ClusterRoleBindingList is a collection of ClusterRoleBindings
      */
    @js.native
    object ClusterRoleBindingList extends js.Object {
      /**
        * Get the state of an existing `ClusterRoleBindingList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRoleBindingList = js.native
    }
    
    /**
      * ClusterRoleList is a collection of ClusterRoles
      */
    @js.native
    object ClusterRoleList extends js.Object {
      /**
        * Get the state of an existing `ClusterRoleList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.ClusterRoleList = js.native
    }
    
    /**
      * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a
      * RoleBinding.
      */
    @js.native
    object Role extends js.Object {
      /**
        * Get the state of an existing `Role` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.Role = js.native
    }
    
    /**
      * RoleBinding references a role, but does not contain it.  It can reference a Role in the same
      * namespace or a ClusterRole in the global namespace. It adds who information via Subjects and
      * namespace information by which namespace it exists in.  RoleBindings in a given namespace
      * only have effect in that namespace.
      */
    @js.native
    object RoleBinding extends js.Object {
      /**
        * Get the state of an existing `RoleBinding` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.RoleBinding = js.native
    }
    
    /**
      * RoleBindingList is a collection of RoleBindings
      */
    @js.native
    object RoleBindingList extends js.Object {
      /**
        * Get the state of an existing `RoleBindingList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.RoleBindingList = js.native
    }
    
    /**
      * RoleList is a collection of Roles
      */
    @js.native
    object RoleList extends js.Object {
      /**
        * Get the state of an existing `RoleList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1Ns.RoleList = js.native
    }
    
  }
  
  @JSName("v1alpha1")
  @js.native
  object v1alpha1Ns extends js.Object {
    /**
      * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a
      * unit by a RoleBinding or ClusterRoleBinding.
      */
    @js.native
    class ClusterRole protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRole {
      /**
        * Create a rbac.v1alpha1.ClusterRole resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRole) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRole, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a
      * ClusterRole in the global namespace, and adds who information via Subject.
      */
    @js.native
    class ClusterRoleBinding protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRoleBinding {
      /**
        * Create a rbac.v1alpha1.ClusterRoleBinding resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRoleBinding) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRoleBinding, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ClusterRoleBindingList is a collection of ClusterRoleBindings
      */
    @js.native
    class ClusterRoleBindingList protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRoleBindingList {
      /**
        * Create a rbac.v1alpha1.ClusterRoleBindingList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRoleBindingList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRoleBindingList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ClusterRoleList is a collection of ClusterRoles
      */
    @js.native
    class ClusterRoleList protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRoleList {
      /**
        * Create a rbac.v1alpha1.ClusterRoleList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRoleList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.ClusterRoleList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a
      * RoleBinding.
      */
    @js.native
    class Role protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.Role {
      /**
        * Create a rbac.v1alpha1.Role resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.Role) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.Role, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * RoleBinding references a role, but does not contain it.  It can reference a Role in the same
      * namespace or a ClusterRole in the global namespace. It adds who information via Subjects and
      * namespace information by which namespace it exists in.  RoleBindings in a given namespace
      * only have effect in that namespace.
      */
    @js.native
    class RoleBinding protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.RoleBinding {
      /**
        * Create a rbac.v1alpha1.RoleBinding resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.RoleBinding) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.RoleBinding, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * RoleBindingList is a collection of RoleBindings
      */
    @js.native
    class RoleBindingList protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.RoleBindingList {
      /**
        * Create a rbac.v1alpha1.RoleBindingList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.RoleBindingList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.RoleBindingList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * RoleList is a collection of Roles
      */
    @js.native
    class RoleList protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.RoleList {
      /**
        * Create a rbac.v1alpha1.RoleList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.RoleList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.RoleList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * Subject contains a reference to the object or user identities a role binding applies to.
      * This can either hold a direct API object reference, or a value for non-objects such as user
      * and group names.
      */
    @js.native
    class Subject protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.Subject {
      /**
        * Create a rbac.v1alpha1.Subject resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.Subject) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1alpha1Ns.Subject, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a
      * unit by a RoleBinding or ClusterRoleBinding.
      */
    @js.native
    object ClusterRole extends js.Object {
      /**
        * Get the state of an existing `ClusterRole` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRole = js.native
    }
    
    /**
      * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a
      * ClusterRole in the global namespace, and adds who information via Subject.
      */
    @js.native
    object ClusterRoleBinding extends js.Object {
      /**
        * Get the state of an existing `ClusterRoleBinding` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRoleBinding = js.native
    }
    
    /**
      * ClusterRoleBindingList is a collection of ClusterRoleBindings
      */
    @js.native
    object ClusterRoleBindingList extends js.Object {
      /**
        * Get the state of an existing `ClusterRoleBindingList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRoleBindingList = js.native
    }
    
    /**
      * ClusterRoleList is a collection of ClusterRoles
      */
    @js.native
    object ClusterRoleList extends js.Object {
      /**
        * Get the state of an existing `ClusterRoleList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.ClusterRoleList = js.native
    }
    
    /**
      * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a
      * RoleBinding.
      */
    @js.native
    object Role extends js.Object {
      /**
        * Get the state of an existing `Role` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.Role = js.native
    }
    
    /**
      * RoleBinding references a role, but does not contain it.  It can reference a Role in the same
      * namespace or a ClusterRole in the global namespace. It adds who information via Subjects and
      * namespace information by which namespace it exists in.  RoleBindings in a given namespace
      * only have effect in that namespace.
      */
    @js.native
    object RoleBinding extends js.Object {
      /**
        * Get the state of an existing `RoleBinding` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.RoleBinding = js.native
    }
    
    /**
      * RoleBindingList is a collection of RoleBindings
      */
    @js.native
    object RoleBindingList extends js.Object {
      /**
        * Get the state of an existing `RoleBindingList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.RoleBindingList = js.native
    }
    
    /**
      * RoleList is a collection of Roles
      */
    @js.native
    object RoleList extends js.Object {
      /**
        * Get the state of an existing `RoleList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.RoleList = js.native
    }
    
    /**
      * Subject contains a reference to the object or user identities a role binding applies to.
      * This can either hold a direct API object reference, or a value for non-objects such as user
      * and group names.
      */
    @js.native
    object Subject extends js.Object {
      /**
        * Get the state of an existing `Subject` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1alpha1Ns.Subject = js.native
    }
    
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a
      * unit by a RoleBinding or ClusterRoleBinding.
      */
    @js.native
    class ClusterRole protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRole {
      /**
        * Create a rbac.v1beta1.ClusterRole resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRole) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRole, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a
      * ClusterRole in the global namespace, and adds who information via Subject.
      */
    @js.native
    class ClusterRoleBinding protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRoleBinding {
      /**
        * Create a rbac.v1beta1.ClusterRoleBinding resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRoleBinding) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRoleBinding, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ClusterRoleBindingList is a collection of ClusterRoleBindings
      */
    @js.native
    class ClusterRoleBindingList protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRoleBindingList {
      /**
        * Create a rbac.v1beta1.ClusterRoleBindingList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRoleBindingList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRoleBindingList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ClusterRoleList is a collection of ClusterRoles
      */
    @js.native
    class ClusterRoleList protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRoleList {
      /**
        * Create a rbac.v1beta1.ClusterRoleList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRoleList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.ClusterRoleList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a
      * RoleBinding.
      */
    @js.native
    class Role protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.Role {
      /**
        * Create a rbac.v1beta1.Role resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.Role) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.Role, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * RoleBinding references a role, but does not contain it.  It can reference a Role in the same
      * namespace or a ClusterRole in the global namespace. It adds who information via Subjects and
      * namespace information by which namespace it exists in.  RoleBindings in a given namespace
      * only have effect in that namespace.
      */
    @js.native
    class RoleBinding protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.RoleBinding {
      /**
        * Create a rbac.v1beta1.RoleBinding resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.RoleBinding) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.RoleBinding, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * RoleBindingList is a collection of RoleBindings
      */
    @js.native
    class RoleBindingList protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.RoleBindingList {
      /**
        * Create a rbac.v1beta1.RoleBindingList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.RoleBindingList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.RoleBindingList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * RoleList is a collection of Roles
      */
    @js.native
    class RoleList protected ()
      extends atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.RoleList {
      /**
        * Create a rbac.v1beta1.RoleList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.RoleList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.rbacNs.v1beta1Ns.RoleList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a
      * unit by a RoleBinding or ClusterRoleBinding.
      */
    @js.native
    object ClusterRole extends js.Object {
      /**
        * Get the state of an existing `ClusterRole` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRole = js.native
    }
    
    /**
      * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a
      * ClusterRole in the global namespace, and adds who information via Subject.
      */
    @js.native
    object ClusterRoleBinding extends js.Object {
      /**
        * Get the state of an existing `ClusterRoleBinding` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRoleBinding = js.native
    }
    
    /**
      * ClusterRoleBindingList is a collection of ClusterRoleBindings
      */
    @js.native
    object ClusterRoleBindingList extends js.Object {
      /**
        * Get the state of an existing `ClusterRoleBindingList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRoleBindingList = js.native
    }
    
    /**
      * ClusterRoleList is a collection of ClusterRoles
      */
    @js.native
    object ClusterRoleList extends js.Object {
      /**
        * Get the state of an existing `ClusterRoleList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.ClusterRoleList = js.native
    }
    
    /**
      * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a
      * RoleBinding.
      */
    @js.native
    object Role extends js.Object {
      /**
        * Get the state of an existing `Role` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.Role = js.native
    }
    
    /**
      * RoleBinding references a role, but does not contain it.  It can reference a Role in the same
      * namespace or a ClusterRole in the global namespace. It adds who information via Subjects and
      * namespace information by which namespace it exists in.  RoleBindings in a given namespace
      * only have effect in that namespace.
      */
    @js.native
    object RoleBinding extends js.Object {
      /**
        * Get the state of an existing `RoleBinding` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.RoleBinding = js.native
    }
    
    /**
      * RoleBindingList is a collection of RoleBindings
      */
    @js.native
    object RoleBindingList extends js.Object {
      /**
        * Get the state of an existing `RoleBindingList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.RoleBindingList = js.native
    }
    
    /**
      * RoleList is a collection of Roles
      */
    @js.native
    object RoleList extends js.Object {
      /**
        * Get the state of an existing `RoleList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.rbacNs.v1beta1Ns.RoleList = js.native
    }
    
  }
  
}

