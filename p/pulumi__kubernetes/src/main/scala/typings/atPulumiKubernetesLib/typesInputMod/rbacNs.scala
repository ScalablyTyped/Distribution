package typings
package atPulumiKubernetesLib.typesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "rbac")
@js.native
object rbacNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
             * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
             */
    
    trait AggregationRule extends js.Object {
      /**
                   * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and
                   * create the rules. If any of the selectors match, then the ClusterRole's permissions will be
                   * added
                   */
      var clusterRoleSelectors: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]]
          ] = js.undefined
    }
    
    /**
             * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a
             * unit by a RoleBinding or ClusterRoleBinding.
             */
    
    trait ClusterRole extends js.Object {
      /**
                   * AggregationRule is an optional field that describes how to build the Rules for this
                   * ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct
                   * changes to Rules will be stomped by the controller.
                   */
      var aggregationRule: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[AggregationRule]] = js.undefined
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Rules holds all the PolicyRules for this ClusterRole
                   */
      var rules: atPulumiPulumiLib.resourceMod.Input[js.Array[PolicyRule]]
    }
    
    /**
             * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a
             * ClusterRole in the global namespace, and adds who information via Subject.
             */
    
    trait ClusterRoleBinding extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be
                   * resolved, the Authorizer must return an error.
                   */
      var roleRef: atPulumiPulumiLib.resourceMod.Input[RoleRef]
      /**
                   * Subjects holds references to the objects the role applies to.
                   */
      var subjects: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[Subject]]] = js.undefined
    }
    
    /**
             * ClusterRoleBindingList is a collection of ClusterRoleBindings
             */
    
    trait ClusterRoleBindingList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is a list of ClusterRoleBindings
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[ClusterRoleBinding]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * ClusterRoleList is a collection of ClusterRoles
             */
    
    trait ClusterRoleList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is a list of ClusterRoles
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[ClusterRole]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * PolicyRule holds information that describes a policy rule, but does not contain information
             * about who the rule applies to or which namespace the rule applies to.
             */
    
    trait PolicyRule extends js.Object {
      /**
                   * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups
                   * are specified, any action requested against one of the enumerated resources in any API
                   * group will be allowed.
                   */
      var apiGroups: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * NonResourceURLs is a set of partial urls that a user should have access to.  *s are
                   * allowed, but only as the full, final step in the path Since non-resource URLs are not
                   * namespaced, this field is only applicable for ClusterRoles referenced from a
                   * ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets")
                   * or non-resource URL paths (such as "/api"),  but not both.
                   */
      var nonResourceURLs: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * ResourceNames is an optional white list of names that the rule applies to.  An empty set
                   * means that everything is allowed.
                   */
      var resourceNames: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * Resources is a list of resources this rule applies to.  ResourceAll represents all
                   * resources.
                   */
      var resources: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions
                   * contained in this rule.  VerbAll represents all kinds.
                   */
      var verbs: atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]
    }
    
    /**
             * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a
             * RoleBinding.
             */
    
    trait Role extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Rules holds all the PolicyRules for this Role
                   */
      var rules: atPulumiPulumiLib.resourceMod.Input[js.Array[PolicyRule]]
    }
    
    /**
             * RoleBinding references a role, but does not contain it.  It can reference a Role in the same
             * namespace or a ClusterRole in the global namespace. It adds who information via Subjects and
             * namespace information by which namespace it exists in.  RoleBindings in a given namespace
             * only have effect in that namespace.
             */
    
    trait RoleBinding extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * RoleRef can reference a Role in the current namespace or a ClusterRole in the global
                   * namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
                   */
      var roleRef: atPulumiPulumiLib.resourceMod.Input[RoleRef]
      /**
                   * Subjects holds references to the objects the role applies to.
                   */
      var subjects: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[Subject]]] = js.undefined
    }
    
    /**
             * RoleBindingList is a collection of RoleBindings
             */
    
    trait RoleBindingList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is a list of RoleBindings
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[RoleBinding]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * RoleList is a collection of Roles
             */
    
    trait RoleList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is a list of Roles
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[Role]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * RoleRef contains information that points to the role being used
             */
    
    trait RoleRef extends js.Object {
      /**
                   * APIGroup is the group for the resource being referenced
                   */
      var apiGroup: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Kind is the type of resource being referenced
                   */
      var kind: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Name is the name of resource being referenced
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * Subject contains a reference to the object or user identities a role binding applies to.
             * This can either hold a direct API object reference, or a value for non-objects such as user
             * and group names.
             */
    
    trait Subject extends js.Object {
      /**
                   * APIGroup holds the API group of the referenced subject. Defaults to "" for ServiceAccount
                   * subjects. Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
                   */
      var apiGroup: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind of object being referenced. Values defined by this API group are "User", "Group", and
                   * "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer
                   * should report an error.
                   */
      var kind: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Name of the object being referenced.
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or
                   * "Group", and this value is not empty the Authorizer should report an error.
                   */
      var namespace: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    def isClusterRole(o: js.Any): /* is ClusterRole */scala.Boolean = js.native
    def isClusterRoleBinding(o: js.Any): /* is ClusterRoleBinding */scala.Boolean = js.native
    def isClusterRoleBindingList(o: js.Any): /* is ClusterRoleBindingList */scala.Boolean = js.native
    def isClusterRoleList(o: js.Any): /* is ClusterRoleList */scala.Boolean = js.native
    def isRole(o: js.Any): /* is Role */scala.Boolean = js.native
    def isRoleBinding(o: js.Any): /* is RoleBinding */scala.Boolean = js.native
    def isRoleBindingList(o: js.Any): /* is RoleBindingList */scala.Boolean = js.native
    def isRoleList(o: js.Any): /* is RoleList */scala.Boolean = js.native
  }
  
  @JSName("v1alpha1")
  @js.native
  object v1alpha1Ns extends js.Object {
    /**
             * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
             */
    
    trait AggregationRule extends js.Object {
      /**
                   * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and
                   * create the rules. If any of the selectors match, then the ClusterRole's permissions will be
                   * added
                   */
      var clusterRoleSelectors: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]]
          ] = js.undefined
    }
    
    /**
             * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a
             * unit by a RoleBinding or ClusterRoleBinding.
             */
    
    trait ClusterRole extends js.Object {
      /**
                   * AggregationRule is an optional field that describes how to build the Rules for this
                   * ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct
                   * changes to Rules will be stomped by the controller.
                   */
      var aggregationRule: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[AggregationRule]] = js.undefined
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Rules holds all the PolicyRules for this ClusterRole
                   */
      var rules: atPulumiPulumiLib.resourceMod.Input[js.Array[PolicyRule]]
    }
    
    /**
             * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a
             * ClusterRole in the global namespace, and adds who information via Subject.
             */
    
    trait ClusterRoleBinding extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be
                   * resolved, the Authorizer must return an error.
                   */
      var roleRef: atPulumiPulumiLib.resourceMod.Input[RoleRef]
      /**
                   * Subjects holds references to the objects the role applies to.
                   */
      var subjects: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[Subject]]] = js.undefined
    }
    
    /**
             * ClusterRoleBindingList is a collection of ClusterRoleBindings
             */
    
    trait ClusterRoleBindingList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is a list of ClusterRoleBindings
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[ClusterRoleBinding]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * ClusterRoleList is a collection of ClusterRoles
             */
    
    trait ClusterRoleList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is a list of ClusterRoles
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[ClusterRole]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * PolicyRule holds information that describes a policy rule, but does not contain information
             * about who the rule applies to or which namespace the rule applies to.
             */
    
    trait PolicyRule extends js.Object {
      /**
                   * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups
                   * are specified, any action requested against one of the enumerated resources in any API
                   * group will be allowed.
                   */
      var apiGroups: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * NonResourceURLs is a set of partial urls that a user should have access to.  *s are
                   * allowed, but only as the full, final step in the path This name is intentionally different
                   * than the internal type so that the DefaultConvert works nicely and because the ordering may
                   * be different. Since non-resource URLs are not namespaced, this field is only applicable for
                   * ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources
                   * (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
                   */
      var nonResourceURLs: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * ResourceNames is an optional white list of names that the rule applies to.  An empty set
                   * means that everything is allowed.
                   */
      var resourceNames: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * Resources is a list of resources this rule applies to.  ResourceAll represents all
                   * resources.
                   */
      var resources: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions
                   * contained in this rule.  VerbAll represents all kinds.
                   */
      var verbs: atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]
    }
    
    /**
             * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a
             * RoleBinding.
             */
    
    trait Role extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Rules holds all the PolicyRules for this Role
                   */
      var rules: atPulumiPulumiLib.resourceMod.Input[js.Array[PolicyRule]]
    }
    
    /**
             * RoleBinding references a role, but does not contain it.  It can reference a Role in the same
             * namespace or a ClusterRole in the global namespace. It adds who information via Subjects and
             * namespace information by which namespace it exists in.  RoleBindings in a given namespace
             * only have effect in that namespace.
             */
    
    trait RoleBinding extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * RoleRef can reference a Role in the current namespace or a ClusterRole in the global
                   * namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
                   */
      var roleRef: atPulumiPulumiLib.resourceMod.Input[RoleRef]
      /**
                   * Subjects holds references to the objects the role applies to.
                   */
      var subjects: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[Subject]]] = js.undefined
    }
    
    /**
             * RoleBindingList is a collection of RoleBindings
             */
    
    trait RoleBindingList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is a list of RoleBindings
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[RoleBinding]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * RoleList is a collection of Roles
             */
    
    trait RoleList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is a list of Roles
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[Role]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * RoleRef contains information that points to the role being used
             */
    
    trait RoleRef extends js.Object {
      /**
                   * APIGroup is the group for the resource being referenced
                   */
      var apiGroup: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Kind is the type of resource being referenced
                   */
      var kind: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Name is the name of resource being referenced
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * Subject contains a reference to the object or user identities a role binding applies to.
             * This can either hold a direct API object reference, or a value for non-objects such as user
             * and group names.
             */
    
    trait Subject extends js.Object {
      /**
                   * APIVersion holds the API group and version of the referenced subject. Defaults to "v1" for
                   * ServiceAccount subjects. Defaults to "rbac.authorization.k8s.io/v1alpha1" for User and
                   * Group subjects.
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind of object being referenced. Values defined by this API group are "User", "Group", and
                   * "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer
                   * should report an error.
                   */
      var kind: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Name of the object being referenced.
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or
                   * "Group", and this value is not empty the Authorizer should report an error.
                   */
      var namespace: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    def isClusterRole(o: js.Any): /* is ClusterRole */scala.Boolean = js.native
    def isClusterRoleBinding(o: js.Any): /* is ClusterRoleBinding */scala.Boolean = js.native
    def isClusterRoleBindingList(o: js.Any): /* is ClusterRoleBindingList */scala.Boolean = js.native
    def isClusterRoleList(o: js.Any): /* is ClusterRoleList */scala.Boolean = js.native
    def isRole(o: js.Any): /* is Role */scala.Boolean = js.native
    def isRoleBinding(o: js.Any): /* is RoleBinding */scala.Boolean = js.native
    def isRoleBindingList(o: js.Any): /* is RoleBindingList */scala.Boolean = js.native
    def isRoleList(o: js.Any): /* is RoleList */scala.Boolean = js.native
    def isSubject(o: js.Any): /* is Subject */scala.Boolean = js.native
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
             * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
             */
    
    trait AggregationRule extends js.Object {
      /**
                   * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and
                   * create the rules. If any of the selectors match, then the ClusterRole's permissions will be
                   * added
                   */
      var clusterRoleSelectors: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]]
          ] = js.undefined
    }
    
    /**
             * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a
             * unit by a RoleBinding or ClusterRoleBinding.
             */
    
    trait ClusterRole extends js.Object {
      /**
                   * AggregationRule is an optional field that describes how to build the Rules for this
                   * ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct
                   * changes to Rules will be stomped by the controller.
                   */
      var aggregationRule: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[AggregationRule]] = js.undefined
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Rules holds all the PolicyRules for this ClusterRole
                   */
      var rules: atPulumiPulumiLib.resourceMod.Input[js.Array[PolicyRule]]
    }
    
    /**
             * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a
             * ClusterRole in the global namespace, and adds who information via Subject.
             */
    
    trait ClusterRoleBinding extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be
                   * resolved, the Authorizer must return an error.
                   */
      var roleRef: atPulumiPulumiLib.resourceMod.Input[RoleRef]
      /**
                   * Subjects holds references to the objects the role applies to.
                   */
      var subjects: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[Subject]]] = js.undefined
    }
    
    /**
             * ClusterRoleBindingList is a collection of ClusterRoleBindings
             */
    
    trait ClusterRoleBindingList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is a list of ClusterRoleBindings
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[ClusterRoleBinding]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * ClusterRoleList is a collection of ClusterRoles
             */
    
    trait ClusterRoleList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is a list of ClusterRoles
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[ClusterRole]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * PolicyRule holds information that describes a policy rule, but does not contain information
             * about who the rule applies to or which namespace the rule applies to.
             */
    
    trait PolicyRule extends js.Object {
      /**
                   * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups
                   * are specified, any action requested against one of the enumerated resources in any API
                   * group will be allowed.
                   */
      var apiGroups: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * NonResourceURLs is a set of partial urls that a user should have access to.  *s are
                   * allowed, but only as the full, final step in the path Since non-resource URLs are not
                   * namespaced, this field is only applicable for ClusterRoles referenced from a
                   * ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets")
                   * or non-resource URL paths (such as "/api"),  but not both.
                   */
      var nonResourceURLs: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * ResourceNames is an optional white list of names that the rule applies to.  An empty set
                   * means that everything is allowed.
                   */
      var resourceNames: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * Resources is a list of resources this rule applies to.  '*' represents all resources in the
                   * specified apiGroups. '*&#8205;/foo' represents the subresource 'foo' for all resources in
                   * the specified apiGroups.
                   */
      var resources: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions
                   * contained in this rule.  VerbAll represents all kinds.
                   */
      var verbs: atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]
    }
    
    /**
             * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a
             * RoleBinding.
             */
    
    trait Role extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Rules holds all the PolicyRules for this Role
                   */
      var rules: atPulumiPulumiLib.resourceMod.Input[js.Array[PolicyRule]]
    }
    
    /**
             * RoleBinding references a role, but does not contain it.  It can reference a Role in the same
             * namespace or a ClusterRole in the global namespace. It adds who information via Subjects and
             * namespace information by which namespace it exists in.  RoleBindings in a given namespace
             * only have effect in that namespace.
             */
    
    trait RoleBinding extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * RoleRef can reference a Role in the current namespace or a ClusterRole in the global
                   * namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
                   */
      var roleRef: atPulumiPulumiLib.resourceMod.Input[RoleRef]
      /**
                   * Subjects holds references to the objects the role applies to.
                   */
      var subjects: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[Subject]]] = js.undefined
    }
    
    /**
             * RoleBindingList is a collection of RoleBindings
             */
    
    trait RoleBindingList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is a list of RoleBindings
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[RoleBinding]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * RoleList is a collection of Roles
             */
    
    trait RoleList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items is a list of Roles
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[Role]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object's metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * RoleRef contains information that points to the role being used
             */
    
    trait RoleRef extends js.Object {
      /**
                   * APIGroup is the group for the resource being referenced
                   */
      var apiGroup: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Kind is the type of resource being referenced
                   */
      var kind: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Name is the name of resource being referenced
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * Subject contains a reference to the object or user identities a role binding applies to.
             * This can either hold a direct API object reference, or a value for non-objects such as user
             * and group names.
             */
    
    trait Subject extends js.Object {
      /**
                   * APIGroup holds the API group of the referenced subject. Defaults to "" for ServiceAccount
                   * subjects. Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
                   */
      var apiGroup: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind of object being referenced. Values defined by this API group are "User", "Group", and
                   * "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer
                   * should report an error.
                   */
      var kind: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Name of the object being referenced.
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or
                   * "Group", and this value is not empty the Authorizer should report an error.
                   */
      var namespace: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    def isClusterRole(o: js.Any): /* is ClusterRole */scala.Boolean = js.native
    def isClusterRoleBinding(o: js.Any): /* is ClusterRoleBinding */scala.Boolean = js.native
    def isClusterRoleBindingList(o: js.Any): /* is ClusterRoleBindingList */scala.Boolean = js.native
    def isClusterRoleList(o: js.Any): /* is ClusterRoleList */scala.Boolean = js.native
    def isRole(o: js.Any): /* is Role */scala.Boolean = js.native
    def isRoleBinding(o: js.Any): /* is RoleBinding */scala.Boolean = js.native
    def isRoleBindingList(o: js.Any): /* is RoleBindingList */scala.Boolean = js.native
    def isRoleList(o: js.Any): /* is RoleList */scala.Boolean = js.native
  }
  
}

