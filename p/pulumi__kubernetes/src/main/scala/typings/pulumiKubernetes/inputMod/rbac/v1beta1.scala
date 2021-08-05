package typings.pulumiKubernetes.inputMod.rbac

import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta1 {
  
  /**
    * AggregationRule describes how to locate ClusterRoles to aggregate into the ClusterRole
    */
  trait AggregationRule extends StObject {
    
    /**
      * ClusterRoleSelectors holds a list of selectors which will be used to find ClusterRoles and create the rules. If any of the selectors match, then the ClusterRole's permissions will be added
      */
    var clusterRoleSelectors: js.UndefOr[Input[js.Array[Input[LabelSelector]]]] = js.undefined
  }
  object AggregationRule {
    
    inline def apply(): AggregationRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AggregationRule]
    }
    
    extension [Self <: AggregationRule](x: Self) {
      
      inline def setClusterRoleSelectors(value: Input[js.Array[Input[LabelSelector]]]): Self = StObject.set(x, "clusterRoleSelectors", value.asInstanceOf[js.Any])
      
      inline def setClusterRoleSelectorsUndefined: Self = StObject.set(x, "clusterRoleSelectors", js.undefined)
      
      inline def setClusterRoleSelectorsVarargs(value: Input[LabelSelector]*): Self = StObject.set(x, "clusterRoleSelectors", js.Array(value :_*))
    }
  }
  
  /**
    * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding. Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 ClusterRole, and will no longer be served in v1.22.
    */
  trait ClusterRole extends StObject {
    
    /**
      * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
      */
    var aggregationRule: js.UndefOr[Input[AggregationRule]] = js.undefined
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[rbacDotauthorizationDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ClusterRole]] = js.undefined
    
    /**
      * Standard object's metadata.
      */
    var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
    
    /**
      * Rules holds all the PolicyRules for this ClusterRole
      */
    var rules: js.UndefOr[Input[js.Array[Input[PolicyRule]]]] = js.undefined
  }
  object ClusterRole {
    
    inline def apply(): ClusterRole = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterRole]
    }
    
    extension [Self <: ClusterRole](x: Self) {
      
      inline def setAggregationRule(value: Input[AggregationRule]): Self = StObject.set(x, "aggregationRule", value.asInstanceOf[js.Any])
      
      inline def setAggregationRuleUndefined: Self = StObject.set(x, "aggregationRule", js.undefined)
      
      inline def setApiVersion(value: Input[rbacDotauthorizationDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ClusterRole]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setRules(value: Input[js.Array[Input[PolicyRule]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Input[PolicyRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
    }
  }
  
  /**
    * ClusterRoleBinding references a ClusterRole, but not contain it.  It can reference a ClusterRole in the global namespace, and adds who information via Subject. Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 ClusterRoleBinding, and will no longer be served in v1.22.
    */
  trait ClusterRoleBinding extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[rbacDotauthorizationDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBinding]] = js.undefined
    
    /**
      * Standard object's metadata.
      */
    var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
    
    /**
      * RoleRef can only reference a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
      */
    var roleRef: Input[RoleRef]
    
    /**
      * Subjects holds references to the objects the role applies to.
      */
    var subjects: js.UndefOr[Input[js.Array[Input[Subject]]]] = js.undefined
  }
  object ClusterRoleBinding {
    
    inline def apply(roleRef: Input[RoleRef]): ClusterRoleBinding = {
      val __obj = js.Dynamic.literal(roleRef = roleRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterRoleBinding]
    }
    
    extension [Self <: ClusterRoleBinding](x: Self) {
      
      inline def setApiVersion(value: Input[rbacDotauthorizationDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBinding]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setRoleRef(value: Input[RoleRef]): Self = StObject.set(x, "roleRef", value.asInstanceOf[js.Any])
      
      inline def setSubjects(value: Input[js.Array[Input[Subject]]]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
      
      inline def setSubjectsUndefined: Self = StObject.set(x, "subjects", js.undefined)
      
      inline def setSubjectsVarargs(value: Input[Subject]*): Self = StObject.set(x, "subjects", js.Array(value :_*))
    }
  }
  
  /**
    * PolicyRule holds information that describes a policy rule, but does not contain information about who the rule applies to or which namespace the rule applies to.
    */
  trait PolicyRule extends StObject {
    
    /**
      * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
      */
    var apiGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
      */
    var nonResourceURLs: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
      */
    var resourceNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Resources is a list of resources this rule applies to.  '*' represents all resources in the specified apiGroups. '*&#47;foo' represents the subresource 'foo' for all resources in the specified apiGroups.
      */
    var resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds.
      */
    var verbs: Input[js.Array[Input[String]]]
  }
  object PolicyRule {
    
    inline def apply(verbs: Input[js.Array[Input[String]]]): PolicyRule = {
      val __obj = js.Dynamic.literal(verbs = verbs.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyRule]
    }
    
    extension [Self <: PolicyRule](x: Self) {
      
      inline def setApiGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "apiGroups", value.asInstanceOf[js.Any])
      
      inline def setApiGroupsUndefined: Self = StObject.set(x, "apiGroups", js.undefined)
      
      inline def setApiGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "apiGroups", js.Array(value :_*))
      
      inline def setNonResourceURLs(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "nonResourceURLs", value.asInstanceOf[js.Any])
      
      inline def setNonResourceURLsUndefined: Self = StObject.set(x, "nonResourceURLs", js.undefined)
      
      inline def setNonResourceURLsVarargs(value: Input[String]*): Self = StObject.set(x, "nonResourceURLs", js.Array(value :_*))
      
      inline def setResourceNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
      
      inline def setResourceNamesUndefined: Self = StObject.set(x, "resourceNames", js.undefined)
      
      inline def setResourceNamesVarargs(value: Input[String]*): Self = StObject.set(x, "resourceNames", js.Array(value :_*))
      
      inline def setResources(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setResourcesVarargs(value: Input[String]*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      inline def setVerbs(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "verbs", value.asInstanceOf[js.Any])
      
      inline def setVerbsVarargs(value: Input[String]*): Self = StObject.set(x, "verbs", js.Array(value :_*))
    }
  }
  
  /**
    * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding. Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 Role, and will no longer be served in v1.22.
    */
  trait Role extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[rbacDotauthorizationDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Role]] = js.undefined
    
    /**
      * Standard object's metadata.
      */
    var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
    
    /**
      * Rules holds all the PolicyRules for this Role
      */
    var rules: js.UndefOr[Input[js.Array[Input[PolicyRule]]]] = js.undefined
  }
  object Role {
    
    inline def apply(): Role = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Role]
    }
    
    extension [Self <: Role](x: Self) {
      
      inline def setApiVersion(value: Input[rbacDotauthorizationDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Role]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setRules(value: Input[js.Array[Input[PolicyRule]]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
      
      inline def setRulesVarargs(value: Input[PolicyRule]*): Self = StObject.set(x, "rules", js.Array(value :_*))
    }
  }
  
  /**
    * RoleBinding references a role, but does not contain it.  It can reference a Role in the same namespace or a ClusterRole in the global namespace. It adds who information via Subjects and namespace information by which namespace it exists in.  RoleBindings in a given namespace only have effect in that namespace. Deprecated in v1.17 in favor of rbac.authorization.k8s.io/v1 RoleBinding, and will no longer be served in v1.22.
    */
  trait RoleBinding extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[rbacDotauthorizationDotk8sDotioSlashv1beta1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.RoleBinding]] = js.undefined
    
    /**
      * Standard object's metadata.
      */
    var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
    
    /**
      * RoleRef can reference a Role in the current namespace or a ClusterRole in the global namespace. If the RoleRef cannot be resolved, the Authorizer must return an error.
      */
    var roleRef: Input[RoleRef]
    
    /**
      * Subjects holds references to the objects the role applies to.
      */
    var subjects: js.UndefOr[Input[js.Array[Input[Subject]]]] = js.undefined
  }
  object RoleBinding {
    
    inline def apply(roleRef: Input[RoleRef]): RoleBinding = {
      val __obj = js.Dynamic.literal(roleRef = roleRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleBinding]
    }
    
    extension [Self <: RoleBinding](x: Self) {
      
      inline def setApiVersion(value: Input[rbacDotauthorizationDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.RoleBinding]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setRoleRef(value: Input[RoleRef]): Self = StObject.set(x, "roleRef", value.asInstanceOf[js.Any])
      
      inline def setSubjects(value: Input[js.Array[Input[Subject]]]): Self = StObject.set(x, "subjects", value.asInstanceOf[js.Any])
      
      inline def setSubjectsUndefined: Self = StObject.set(x, "subjects", js.undefined)
      
      inline def setSubjectsVarargs(value: Input[Subject]*): Self = StObject.set(x, "subjects", js.Array(value :_*))
    }
  }
  
  /**
    * RoleRef contains information that points to the role being used
    */
  trait RoleRef extends StObject {
    
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
  object RoleRef {
    
    inline def apply(apiGroup: Input[String], kind: Input[String], name: Input[String]): RoleRef = {
      val __obj = js.Dynamic.literal(apiGroup = apiGroup.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleRef]
    }
    
    extension [Self <: RoleRef](x: Self) {
      
      inline def setApiGroup(value: Input[String]): Self = StObject.set(x, "apiGroup", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Subject contains a reference to the object or user identities a role binding applies to.  This can either hold a direct API object reference, or a value for non-objects such as user and group names.
    */
  trait Subject extends StObject {
    
    /**
      * APIGroup holds the API group of the referenced subject. Defaults to "" for ServiceAccount subjects. Defaults to "rbac.authorization.k8s.io" for User and Group subjects.
      */
    var apiGroup: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Kind of object being referenced. Values defined by this API group are "User", "Group", and "ServiceAccount". If the Authorizer does not recognized the kind value, the Authorizer should report an error.
      */
    var kind: Input[String]
    
    /**
      * Name of the object being referenced.
      */
    var name: Input[String]
    
    /**
      * Namespace of the referenced object.  If the object kind is non-namespace, such as "User" or "Group", and this value is not empty the Authorizer should report an error.
      */
    var namespace: js.UndefOr[Input[String]] = js.undefined
  }
  object Subject {
    
    inline def apply(kind: Input[String], name: Input[String]): Subject = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subject]
    }
    
    extension [Self <: Subject](x: Self) {
      
      inline def setApiGroup(value: Input[String]): Self = StObject.set(x, "apiGroup", value.asInstanceOf[js.Any])
      
      inline def setApiGroupUndefined: Self = StObject.set(x, "apiGroup", js.undefined)
      
      inline def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    }
  }
}
