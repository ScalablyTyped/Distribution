package typings.atPulumiKubernetes.typesInputMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`authorizationDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`authorizationDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1Ns.NonResourceAttributes
import typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1Ns.NonResourceRule
import typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1Ns.ResourceAttributes
import typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1Ns.ResourceRule
import typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1Ns.SelfSubjectAccessReviewSpec
import typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1Ns.SelfSubjectRulesReviewSpec
import typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1Ns.SubjectAccessReviewSpec
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "authorization")
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
    trait LocalSubjectAccessReview extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`authorizationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.LocalSubjectAccessReview]
          ] = js.undefined
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Spec holds information about the request being evaluated.  spec.namespace must be equal to
        * the namespace you made the request against.  If empty, it is defaulted.
        */
      var spec: Input[SubjectAccessReviewSpec]
    }
    
    /**
      * NonResourceAttributes includes the authorization attributes available for non-resource
      * requests to the Authorizer interface
      */
    trait NonResourceAttributes extends js.Object {
      /**
        * Path is the URL path of the request
        */
      var path: js.UndefOr[Input[String]] = js.undefined
      /**
        * Verb is the standard HTTP verb
        */
      var verb: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * NonResourceRule holds information that describes a rule for the non-resource
      */
    trait NonResourceRule extends js.Object {
      /**
        * NonResourceURLs is a set of partial urls that a user should have access to.  *s are
        * allowed, but only as the full, final step in the path.  "*" means all.
        */
      var nonResourceURLs: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch,
        * head, options.  "*" means all.
        */
      var verbs: Input[js.Array[Input[String]]]
    }
    
    /**
      * ResourceAttributes includes the authorization attributes available for resource requests to
      * the Authorizer interface
      */
    trait ResourceAttributes extends js.Object {
      /**
        * Group is the API Group of the Resource.  "*" means all.
        */
      var group: js.UndefOr[Input[String]] = js.undefined
      /**
        * Name is the name of the resource being requested for a "get" or deleted for a "delete". ""
        * (empty) means all.
        */
      var name: js.UndefOr[Input[String]] = js.undefined
      /**
        * Namespace is the namespace of the action being requested.  Currently, there is no
        * distinction between no namespace and all namespaces "" (empty) is defaulted for
        * LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means
        * "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
        */
      var namespace: js.UndefOr[Input[String]] = js.undefined
      /**
        * Resource is one of the existing resource types.  "*" means all.
        */
      var resource: js.UndefOr[Input[String]] = js.undefined
      /**
        * Subresource is one of the existing resource types.  "" means none.
        */
      var subresource: js.UndefOr[Input[String]] = js.undefined
      /**
        * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete,
        * proxy.  "*" means all.
        */
      var verb: js.UndefOr[Input[String]] = js.undefined
      /**
        * Version is the API Version of the Resource.  "*" means all.
        */
      var version: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * ResourceRule is the list of actions the subject is allowed to perform on resources. The list
      * ordering isn't significant, may contain duplicates, and possibly be incomplete.
      */
    trait ResourceRule extends js.Object {
      /**
        * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups
        * are specified, any action requested against one of the enumerated resources in any API
        * group will be allowed.  "*" means all.
        */
      var apiGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * ResourceNames is an optional white list of names that the rule applies to.  An empty set
        * means that everything is allowed.  "*" means all.
        */
      var resourceNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Resources is a list of resources this rule applies to.  "*" means all in the specified
        * apiGroups.
        *  "*&#8205;/foo" represents the subresource 'foo' for all resources in the specified
        * apiGroups.
        */
      var resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update,
        * delete, proxy.  "*" means all.
        */
      var verbs: Input[js.Array[Input[String]]]
    }
    
    /**
      * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not
      * filling in a spec.namespace means "in all namespaces".  Self is a special case, because users
      * should always be able to check whether they can perform an action
      */
    trait SelfSubjectAccessReview extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`authorizationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.SelfSubjectAccessReview]
          ] = js.undefined
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Spec holds information about the request being evaluated.  user and groups must be empty
        */
      var spec: Input[SelfSubjectAccessReviewSpec]
    }
    
    /**
      * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of
      * ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
      */
    trait SelfSubjectAccessReviewSpec extends js.Object {
      /**
        * NonResourceAttributes describes information for a non-resource access request
        */
      var nonResourceAttributes: js.UndefOr[Input[NonResourceAttributes]] = js.undefined
      /**
        * ResourceAuthorizationAttributes describes information for a resource access request
        */
      var resourceAttributes: js.UndefOr[Input[ResourceAttributes]] = js.undefined
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
    trait SelfSubjectRulesReview extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`authorizationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.SelfSubjectRulesReview]
          ] = js.undefined
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Spec holds information about the request being evaluated.
        */
      var spec: Input[SelfSubjectRulesReviewSpec]
    }
    
    /**
      *
      */
    trait SelfSubjectRulesReviewSpec extends js.Object {
      /**
        * Namespace to evaluate rules for. Required.
        */
      var namespace: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * SubjectAccessReview checks whether or not a user or group can perform an action.
      */
    trait SubjectAccessReview extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`authorizationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.SubjectAccessReview]] = js.undefined
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Spec holds information about the request being evaluated
        */
      var spec: Input[SubjectAccessReviewSpec]
    }
    
    /**
      * SubjectAccessReviewSpec is a description of the access request.  Exactly one of
      * ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
      */
    trait SubjectAccessReviewSpec extends js.Object {
      /**
        * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is
        * input to the authorizer it needs a reflection here.
        */
      var extra: js.UndefOr[Input[js.Object]] = js.undefined
      /**
        * Groups is the groups you're testing for.
        */
      var groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * NonResourceAttributes describes information for a non-resource access request
        */
      var nonResourceAttributes: js.UndefOr[Input[NonResourceAttributes]] = js.undefined
      /**
        * ResourceAuthorizationAttributes describes information for a resource access request
        */
      var resourceAttributes: js.UndefOr[Input[ResourceAttributes]] = js.undefined
      /**
        * UID information about the requesting user.
        */
      var uid: js.UndefOr[Input[String]] = js.undefined
      /**
        * User is the user you're testing for. If you specify "User" but not "Groups", then is it
        * interpreted as "What if User were not a member of any groups
        */
      var user: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * SubjectAccessReviewStatus
      */
    trait SubjectAccessReviewStatus extends js.Object {
      /**
        * Allowed is required. True if the action would be allowed, false otherwise.
        */
      var allowed: Input[Boolean]
      /**
        * Denied is optional. True if the action would be denied, otherwise false. If both allowed is
        * false and denied is false, then the authorizer has no opinion on whether to authorize the
        * action. Denied may not be true if Allowed is true.
        */
      var denied: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * EvaluationError is an indication that some error occurred during the authorization check.
        * It is entirely possible to get an error and be able to continue determine authorization
        * status in spite of it. For instance, RBAC can be missing a role, but enough roles are still
        * present and bound to reason about the request.
        */
      var evaluationError: js.UndefOr[Input[String]] = js.undefined
      /**
        * Reason is optional.  It indicates why a request was allowed or denied.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete
      * depending on the set of authorizers the server is configured with and any errors experienced
      * during evaluation. Because authorization rules are additive, if a rule appears in a list it's
      * safe to assume the subject has that permission, even if that list is incomplete.
      */
    trait SubjectRulesReviewStatus extends js.Object {
      /**
        * EvaluationError can appear in combination with Rules. It indicates an error occurred during
        * rule evaluation, such as an authorizer that doesn't support rule evaluation, and that
        * ResourceRules and/or NonResourceRules may be incomplete.
        */
      var evaluationError: js.UndefOr[Input[String]] = js.undefined
      /**
        * Incomplete is true when the rules returned by this call are incomplete. This is most
        * commonly encountered when an authorizer, such as an external authorizer, doesn't support
        * rules evaluation.
        */
      var incomplete: Input[Boolean]
      /**
        * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
        * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
        */
      var nonResourceRules: Input[js.Array[Input[NonResourceRule]]]
      /**
        * ResourceRules is the list of actions the subject is allowed to perform on resources. The
        * list ordering isn't significant, may contain duplicates, and possibly be incomplete.
        */
      var resourceRules: Input[js.Array[Input[ResourceRule]]]
    }
    
    def isLocalSubjectAccessReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authorization.v1.LocalSubjectAccessReview */ Boolean = js.native
    def isSelfSubjectAccessReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authorization.v1.SelfSubjectAccessReview */ Boolean = js.native
    def isSelfSubjectRulesReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authorization.v1.SelfSubjectRulesReview */ Boolean = js.native
    def isSubjectAccessReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authorization.v1.SubjectAccessReview */ Boolean = js.native
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * LocalSubjectAccessReview checks whether or not a user or group can perform an action in a
      * given namespace. Having a namespace scoped resource makes it much easier to grant namespace
      * scoped policy that includes permissions checking.
      */
    trait LocalSubjectAccessReview extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`authorizationDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.LocalSubjectAccessReview]
          ] = js.undefined
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Spec holds information about the request being evaluated.  spec.namespace must be equal to
        * the namespace you made the request against.  If empty, it is defaulted.
        */
      var spec: Input[
            typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewSpec
          ]
    }
    
    /**
      * NonResourceAttributes includes the authorization attributes available for non-resource
      * requests to the Authorizer interface
      */
    trait NonResourceAttributes extends js.Object {
      /**
        * Path is the URL path of the request
        */
      var path: js.UndefOr[Input[String]] = js.undefined
      /**
        * Verb is the standard HTTP verb
        */
      var verb: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * NonResourceRule holds information that describes a rule for the non-resource
      */
    trait NonResourceRule extends js.Object {
      /**
        * NonResourceURLs is a set of partial urls that a user should have access to.  *s are
        * allowed, but only as the full, final step in the path.  "*" means all.
        */
      var nonResourceURLs: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch,
        * head, options.  "*" means all.
        */
      var verbs: Input[js.Array[Input[String]]]
    }
    
    /**
      * ResourceAttributes includes the authorization attributes available for resource requests to
      * the Authorizer interface
      */
    trait ResourceAttributes extends js.Object {
      /**
        * Group is the API Group of the Resource.  "*" means all.
        */
      var group: js.UndefOr[Input[String]] = js.undefined
      /**
        * Name is the name of the resource being requested for a "get" or deleted for a "delete". ""
        * (empty) means all.
        */
      var name: js.UndefOr[Input[String]] = js.undefined
      /**
        * Namespace is the namespace of the action being requested.  Currently, there is no
        * distinction between no namespace and all namespaces "" (empty) is defaulted for
        * LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means
        * "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
        */
      var namespace: js.UndefOr[Input[String]] = js.undefined
      /**
        * Resource is one of the existing resource types.  "*" means all.
        */
      var resource: js.UndefOr[Input[String]] = js.undefined
      /**
        * Subresource is one of the existing resource types.  "" means none.
        */
      var subresource: js.UndefOr[Input[String]] = js.undefined
      /**
        * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete,
        * proxy.  "*" means all.
        */
      var verb: js.UndefOr[Input[String]] = js.undefined
      /**
        * Version is the API Version of the Resource.  "*" means all.
        */
      var version: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * ResourceRule is the list of actions the subject is allowed to perform on resources. The list
      * ordering isn't significant, may contain duplicates, and possibly be incomplete.
      */
    trait ResourceRule extends js.Object {
      /**
        * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups
        * are specified, any action requested against one of the enumerated resources in any API
        * group will be allowed.  "*" means all.
        */
      var apiGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * ResourceNames is an optional white list of names that the rule applies to.  An empty set
        * means that everything is allowed.  "*" means all.
        */
      var resourceNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Resources is a list of resources this rule applies to.  "*" means all in the specified
        * apiGroups.
        *  "*&#8205;/foo" represents the subresource 'foo' for all resources in the specified
        * apiGroups.
        */
      var resources: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update,
        * delete, proxy.  "*" means all.
        */
      var verbs: Input[js.Array[Input[String]]]
    }
    
    /**
      * SelfSubjectAccessReview checks whether or the current user can perform an action.  Not
      * filling in a spec.namespace means "in all namespaces".  Self is a special case, because users
      * should always be able to check whether they can perform an action
      */
    trait SelfSubjectAccessReview extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`authorizationDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.SelfSubjectAccessReview]
          ] = js.undefined
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Spec holds information about the request being evaluated.  user and groups must be empty
        */
      var spec: Input[
            typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1beta1Ns.SelfSubjectAccessReviewSpec
          ]
    }
    
    /**
      * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of
      * ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
      */
    trait SelfSubjectAccessReviewSpec extends js.Object {
      /**
        * NonResourceAttributes describes information for a non-resource access request
        */
      var nonResourceAttributes: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1beta1Ns.NonResourceAttributes
            ]
          ] = js.undefined
      /**
        * ResourceAuthorizationAttributes describes information for a resource access request
        */
      var resourceAttributes: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1beta1Ns.ResourceAttributes
            ]
          ] = js.undefined
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
    trait SelfSubjectRulesReview extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`authorizationDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.SelfSubjectRulesReview]
          ] = js.undefined
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Spec holds information about the request being evaluated.
        */
      var spec: Input[
            typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1beta1Ns.SelfSubjectRulesReviewSpec
          ]
    }
    
    /**
      *
      */
    trait SelfSubjectRulesReviewSpec extends js.Object {
      /**
        * Namespace to evaluate rules for. Required.
        */
      var namespace: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * SubjectAccessReview checks whether or not a user or group can perform an action.
      */
    trait SubjectAccessReview extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`authorizationDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.SubjectAccessReview]] = js.undefined
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Spec holds information about the request being evaluated
        */
      var spec: Input[
            typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1beta1Ns.SubjectAccessReviewSpec
          ]
    }
    
    /**
      * SubjectAccessReviewSpec is a description of the access request.  Exactly one of
      * ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
      */
    trait SubjectAccessReviewSpec extends js.Object {
      /**
        * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is
        * input to the authorizer it needs a reflection here.
        */
      var extra: js.UndefOr[Input[js.Object]] = js.undefined
      /**
        * Groups is the groups you're testing for.
        */
      var group: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * NonResourceAttributes describes information for a non-resource access request
        */
      var nonResourceAttributes: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1beta1Ns.NonResourceAttributes
            ]
          ] = js.undefined
      /**
        * ResourceAuthorizationAttributes describes information for a resource access request
        */
      var resourceAttributes: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1beta1Ns.ResourceAttributes
            ]
          ] = js.undefined
      /**
        * UID information about the requesting user.
        */
      var uid: js.UndefOr[Input[String]] = js.undefined
      /**
        * User is the user you're testing for. If you specify "User" but not "Group", then is it
        * interpreted as "What if User were not a member of any groups
        */
      var user: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * SubjectAccessReviewStatus
      */
    trait SubjectAccessReviewStatus extends js.Object {
      /**
        * Allowed is required. True if the action would be allowed, false otherwise.
        */
      var allowed: Input[Boolean]
      /**
        * Denied is optional. True if the action would be denied, otherwise false. If both allowed is
        * false and denied is false, then the authorizer has no opinion on whether to authorize the
        * action. Denied may not be true if Allowed is true.
        */
      var denied: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * EvaluationError is an indication that some error occurred during the authorization check.
        * It is entirely possible to get an error and be able to continue determine authorization
        * status in spite of it. For instance, RBAC can be missing a role, but enough roles are still
        * present and bound to reason about the request.
        */
      var evaluationError: js.UndefOr[Input[String]] = js.undefined
      /**
        * Reason is optional.  It indicates why a request was allowed or denied.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete
      * depending on the set of authorizers the server is configured with and any errors experienced
      * during evaluation. Because authorization rules are additive, if a rule appears in a list it's
      * safe to assume the subject has that permission, even if that list is incomplete.
      */
    trait SubjectRulesReviewStatus extends js.Object {
      /**
        * EvaluationError can appear in combination with Rules. It indicates an error occurred during
        * rule evaluation, such as an authorizer that doesn't support rule evaluation, and that
        * ResourceRules and/or NonResourceRules may be incomplete.
        */
      var evaluationError: js.UndefOr[Input[String]] = js.undefined
      /**
        * Incomplete is true when the rules returned by this call are incomplete. This is most
        * commonly encountered when an authorizer, such as an external authorizer, doesn't support
        * rules evaluation.
        */
      var incomplete: Input[Boolean]
      /**
        * NonResourceRules is the list of actions the subject is allowed to perform on non-resources.
        * The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
        */
      var nonResourceRules: Input[
            js.Array[
              Input[
                typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1beta1Ns.NonResourceRule
              ]
            ]
          ]
      /**
        * ResourceRules is the list of actions the subject is allowed to perform on resources. The
        * list ordering isn't significant, may contain duplicates, and possibly be incomplete.
        */
      var resourceRules: Input[
            js.Array[
              Input[typings.atPulumiKubernetes.typesInputMod.authorizationNs.v1beta1Ns.ResourceRule]
            ]
          ]
    }
    
    def isLocalSubjectAccessReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authorization.v1beta1.LocalSubjectAccessReview */ Boolean = js.native
    def isSelfSubjectAccessReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authorization.v1beta1.SelfSubjectAccessReview */ Boolean = js.native
    def isSelfSubjectRulesReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authorization.v1beta1.SelfSubjectRulesReview */ Boolean = js.native
    def isSubjectAccessReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authorization.v1beta1.SubjectAccessReview */ Boolean = js.native
  }
  
}

