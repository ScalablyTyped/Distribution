package typings.atPulumiKubernetes.typesInputMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`rbacDOTauthorizationDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`rbacDOTauthorizationDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.LabelSelector
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ListMeta
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiKubernetes.typesInputMod.rbacNs.v1Ns.AggregationRule
import typings.atPulumiKubernetes.typesInputMod.rbacNs.v1Ns.ClusterRole
import typings.atPulumiKubernetes.typesInputMod.rbacNs.v1Ns.ClusterRoleBinding
import typings.atPulumiKubernetes.typesInputMod.rbacNs.v1Ns.PolicyRule
import typings.atPulumiKubernetes.typesInputMod.rbacNs.v1Ns.Role
import typings.atPulumiKubernetes.typesInputMod.rbacNs.v1Ns.RoleBinding
import typings.atPulumiKubernetes.typesInputMod.rbacNs.v1Ns.RoleRef
import typings.atPulumiKubernetes.typesInputMod.rbacNs.v1Ns.Subject
import typings.atPulumiPulumi.outputMod.Input
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
      var clusterRoleSelectors: js.UndefOr[Input[js.Array[Input[LabelSelector]]]] = js.undefined
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
      var aggregationRule: js.UndefOr[Input[AggregationRule]] = js.undefined
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRole]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Rules holds all the PolicyRules for this ClusterRole
        */
      var rules: js.UndefOr[Input[js.Array[Input[PolicyRule]]]] = js.undefined
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRoleBinding]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be
        * resolved, the Authorizer must return an error.
        */
      var roleRef: Input[RoleRef]
      /**
        * Subjects holds references to the objects the role applies to.
        */
      var subjects: js.UndefOr[Input[js.Array[Input[Subject]]]] = js.undefined
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Items is a list of ClusterRoleBindings
        */
      var items: Input[js.Array[Input[ClusterRoleBinding]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRoleBindingList]
          ] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Items is a list of ClusterRoles
        */
      var items: Input[js.Array[Input[ClusterRole]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRoleList]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
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
      var apiGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * NonResourceURLs is a set of partial urls that a user should have access to.  *s are
        * allowed, but only as the full, final step in the path Since non-resource URLs are not
        * namespaced, this field is only applicable for ClusterRoles referenced from a
        * ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets")
        * or non-resource URL paths (such as "/api"),  but not both.
        */
      var nonResourceURLs: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * ResourceNames is an optional white list of names that the rule applies to.  An empty set
        * means that everything is allowed.
        */
      var resourceNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Resources is a list of resources this rule applies to.  ResourceAll represents all
        * resources.
        */
      var resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions
        * contained in this rule.  VerbAll represents all kinds.
        */
      var verbs: Input[js.Array[Input[String]]]
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Role]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Rules holds all the PolicyRules for this Role
        */
      var rules: js.UndefOr[Input[js.Array[Input[PolicyRule]]]] = js.undefined
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RoleBinding]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * RoleRef can reference a Role in the current namespace or a ClusterRole in the global
        * namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
        */
      var roleRef: Input[RoleRef]
      /**
        * Subjects holds references to the objects the role applies to.
        */
      var subjects: js.UndefOr[Input[js.Array[Input[Subject]]]] = js.undefined
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Items is a list of RoleBindings
        */
      var items: Input[js.Array[Input[RoleBinding]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RoleBindingList]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Items is a list of Roles
        */
      var items: Input[js.Array[Input[Role]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RoleList]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * RoleRef contains information that points to the role being used
      */
    trait RoleRef extends js.Object {
      /**
        * APIGroup is the group for the resource being referenced
        */
      var apiGroup: Input[String]
      /**
        * Kind is the type of resource being referenced
        */
      var kind: Input[String]
      /**
        * Name is the name of resource being referenced
        */
      var name: Input[String]
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
      var apiGroup: js.UndefOr[Input[String]] = js.undefined
      /**
        * Kind of object being referenced. Values defined by this API group are "User", "Group", and
        * "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer
        * should report an error.
        */
      var kind: Input[String]
      /**
        * Name of the object being referenced.
        */
      var name: Input[String]
      /**
        * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or
        * "Group", and this value is not empty the Authorizer should report an error.
        */
      var namespace: js.UndefOr[Input[String]] = js.undefined
    }
    
    def isClusterRole(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1.ClusterRole */ Boolean = js.native
    def isClusterRoleBinding(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1.ClusterRoleBinding */ Boolean = js.native
    def isClusterRoleBindingList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1.ClusterRoleBindingList */ Boolean = js.native
    def isClusterRoleList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1.ClusterRoleList */ Boolean = js.native
    def isRole(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1.Role */ Boolean = js.native
    def isRoleBinding(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1.RoleBinding */ Boolean = js.native
    def isRoleBindingList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1.RoleBindingList */ Boolean = js.native
    def isRoleList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1.RoleList */ Boolean = js.native
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
      var clusterRoleSelectors: js.UndefOr[Input[js.Array[Input[LabelSelector]]]] = js.undefined
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
      var aggregationRule: js.UndefOr[
            Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1alpha1Ns.AggregationRule]
          ] = js.undefined
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRole]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Rules holds all the PolicyRules for this ClusterRole
        */
      var rules: js.UndefOr[
            Input[
              js.Array[Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1alpha1Ns.PolicyRule]]
            ]
          ] = js.undefined
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRoleBinding]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be
        * resolved, the Authorizer must return an error.
        */
      var roleRef: Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1alpha1Ns.RoleRef]
      /**
        * Subjects holds references to the objects the role applies to.
        */
      var subjects: js.UndefOr[
            Input[
              js.Array[Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1alpha1Ns.Subject]]
            ]
          ] = js.undefined
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`]] = js.undefined
      /**
        * Items is a list of ClusterRoleBindings
        */
      var items: Input[
            js.Array[
              Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1alpha1Ns.ClusterRoleBinding]
            ]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRoleBindingList]
          ] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`]] = js.undefined
      /**
        * Items is a list of ClusterRoles
        */
      var items: Input[
            js.Array[Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1alpha1Ns.ClusterRole]]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRoleList]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
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
      var apiGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * NonResourceURLs is a set of partial urls that a user should have access to.  *s are
        * allowed, but only as the full, final step in the path This name is intentionally different
        * than the internal type so that the DefaultConvert works nicely and because the ordering may
        * be different. Since non-resource URLs are not namespaced, this field is only applicable for
        * ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources
        * (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
        */
      var nonResourceURLs: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * ResourceNames is an optional white list of names that the rule applies to.  An empty set
        * means that everything is allowed.
        */
      var resourceNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Resources is a list of resources this rule applies to.  ResourceAll represents all
        * resources.
        */
      var resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions
        * contained in this rule.  VerbAll represents all kinds.
        */
      var verbs: Input[js.Array[Input[String]]]
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Role]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Rules holds all the PolicyRules for this Role
        */
      var rules: js.UndefOr[
            Input[
              js.Array[Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1alpha1Ns.PolicyRule]]
            ]
          ] = js.undefined
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RoleBinding]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * RoleRef can reference a Role in the current namespace or a ClusterRole in the global
        * namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
        */
      var roleRef: Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1alpha1Ns.RoleRef]
      /**
        * Subjects holds references to the objects the role applies to.
        */
      var subjects: js.UndefOr[
            Input[
              js.Array[Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1alpha1Ns.Subject]]
            ]
          ] = js.undefined
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`]] = js.undefined
      /**
        * Items is a list of RoleBindings
        */
      var items: Input[
            js.Array[Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1alpha1Ns.RoleBinding]]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RoleBindingList]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1alpha1`]] = js.undefined
      /**
        * Items is a list of Roles
        */
      var items: Input[js.Array[Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1alpha1Ns.Role]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RoleList]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * RoleRef contains information that points to the role being used
      */
    trait RoleRef extends js.Object {
      /**
        * APIGroup is the group for the resource being referenced
        */
      var apiGroup: Input[String]
      /**
        * Kind is the type of resource being referenced
        */
      var kind: Input[String]
      /**
        * Name is the name of resource being referenced
        */
      var name: Input[String]
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
      var apiVersion: js.UndefOr[Input[String]] = js.undefined
      /**
        * Kind of object being referenced. Values defined by this API group are "User", "Group", and
        * "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer
        * should report an error.
        */
      var kind: Input[String]
      /**
        * Name of the object being referenced.
        */
      var name: Input[String]
      /**
        * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or
        * "Group", and this value is not empty the Authorizer should report an error.
        */
      var namespace: js.UndefOr[Input[String]] = js.undefined
    }
    
    def isClusterRole(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1alpha1.ClusterRole */ Boolean = js.native
    def isClusterRoleBinding(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1alpha1.ClusterRoleBinding */ Boolean = js.native
    def isClusterRoleBindingList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1alpha1.ClusterRoleBindingList */ Boolean = js.native
    def isClusterRoleList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1alpha1.ClusterRoleList */ Boolean = js.native
    def isRole(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1alpha1.Role */ Boolean = js.native
    def isRoleBinding(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1alpha1.RoleBinding */ Boolean = js.native
    def isRoleBindingList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1alpha1.RoleBindingList */ Boolean = js.native
    def isRoleList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1alpha1.RoleList */ Boolean = js.native
    def isSubject(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1alpha1.Subject */ Boolean = js.native
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
      var clusterRoleSelectors: js.UndefOr[Input[js.Array[Input[LabelSelector]]]] = js.undefined
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
      var aggregationRule: js.UndefOr[Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1beta1Ns.AggregationRule]] = js.undefined
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRole]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Rules holds all the PolicyRules for this ClusterRole
        */
      var rules: js.UndefOr[
            Input[
              js.Array[Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1beta1Ns.PolicyRule]]
            ]
          ] = js.undefined
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRoleBinding]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be
        * resolved, the Authorizer must return an error.
        */
      var roleRef: Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1beta1Ns.RoleRef]
      /**
        * Subjects holds references to the objects the role applies to.
        */
      var subjects: js.UndefOr[
            Input[
              js.Array[Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1beta1Ns.Subject]]
            ]
          ] = js.undefined
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Items is a list of ClusterRoleBindings
        */
      var items: Input[
            js.Array[
              Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1beta1Ns.ClusterRoleBinding]
            ]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRoleBindingList]
          ] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Items is a list of ClusterRoles
        */
      var items: Input[
            js.Array[Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1beta1Ns.ClusterRole]]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ClusterRoleList]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
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
      var apiGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * NonResourceURLs is a set of partial urls that a user should have access to.  *s are
        * allowed, but only as the full, final step in the path Since non-resource URLs are not
        * namespaced, this field is only applicable for ClusterRoles referenced from a
        * ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets")
        * or non-resource URL paths (such as "/api"),  but not both.
        */
      var nonResourceURLs: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * ResourceNames is an optional white list of names that the rule applies to.  An empty set
        * means that everything is allowed.
        */
      var resourceNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Resources is a list of resources this rule applies to.  '*' represents all resources in the
        * specified apiGroups. '*&#8205;/foo' represents the subresource 'foo' for all resources in
        * the specified apiGroups.
        */
      var resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions
        * contained in this rule.  VerbAll represents all kinds.
        */
      var verbs: Input[js.Array[Input[String]]]
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Role]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Rules holds all the PolicyRules for this Role
        */
      var rules: js.UndefOr[
            Input[
              js.Array[Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1beta1Ns.PolicyRule]]
            ]
          ] = js.undefined
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RoleBinding]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * RoleRef can reference a Role in the current namespace or a ClusterRole in the global
        * namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
        */
      var roleRef: Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1beta1Ns.RoleRef]
      /**
        * Subjects holds references to the objects the role applies to.
        */
      var subjects: js.UndefOr[
            Input[
              js.Array[Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1beta1Ns.Subject]]
            ]
          ] = js.undefined
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Items is a list of RoleBindings
        */
      var items: Input[
            js.Array[Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1beta1Ns.RoleBinding]]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RoleBindingList]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
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
      var apiVersion: js.UndefOr[Input[`rbacDOTauthorizationDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Items is a list of Roles
        */
      var items: Input[js.Array[Input[typings.atPulumiKubernetes.typesInputMod.rbacNs.v1beta1Ns.Role]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RoleList]] = js.undefined
      /**
        * Standard object's metadata.
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * RoleRef contains information that points to the role being used
      */
    trait RoleRef extends js.Object {
      /**
        * APIGroup is the group for the resource being referenced
        */
      var apiGroup: Input[String]
      /**
        * Kind is the type of resource being referenced
        */
      var kind: Input[String]
      /**
        * Name is the name of resource being referenced
        */
      var name: Input[String]
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
      var apiGroup: js.UndefOr[Input[String]] = js.undefined
      /**
        * Kind of object being referenced. Values defined by this API group are "User", "Group", and
        * "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer
        * should report an error.
        */
      var kind: Input[String]
      /**
        * Name of the object being referenced.
        */
      var name: Input[String]
      /**
        * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or
        * "Group", and this value is not empty the Authorizer should report an error.
        */
      var namespace: js.UndefOr[Input[String]] = js.undefined
    }
    
    def isClusterRole(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1beta1.ClusterRole */ Boolean = js.native
    def isClusterRoleBinding(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1beta1.ClusterRoleBinding */ Boolean = js.native
    def isClusterRoleBindingList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1beta1.ClusterRoleBindingList */ Boolean = js.native
    def isClusterRoleList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1beta1.ClusterRoleList */ Boolean = js.native
    def isRole(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1beta1.Role */ Boolean = js.native
    def isRoleBinding(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1beta1.RoleBinding */ Boolean = js.native
    def isRoleBindingList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1beta1.RoleBindingList */ Boolean = js.native
    def isRoleList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1beta1.RoleList */ Boolean = js.native
  }
  
}

