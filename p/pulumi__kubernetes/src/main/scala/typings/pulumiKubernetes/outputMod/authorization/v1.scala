package typings.pulumiKubernetes.outputMod.authorization

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1 {
  
  /**
    * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface
    */
  @js.native
  trait NonResourceAttributes extends StObject {
    
    /**
      * Path is the URL path of the request
      */
    var path: String = js.native
    
    /**
      * Verb is the standard HTTP verb
      */
    var verb: String = js.native
  }
  object NonResourceAttributes {
    
    @scala.inline
    def apply(path: String, verb: String): NonResourceAttributes = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonResourceAttributes]
    }
    
    @scala.inline
    implicit class NonResourceAttributesMutableBuilder[Self <: NonResourceAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * NonResourceRule holds information that describes a rule for the non-resource
    */
  @js.native
  trait NonResourceRule extends StObject {
    
    /**
      * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path.  "*" means all.
      */
    var nonResourceURLs: js.Array[String] = js.native
    
    /**
      * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
      */
    var verbs: js.Array[String] = js.native
  }
  object NonResourceRule {
    
    @scala.inline
    def apply(nonResourceURLs: js.Array[String], verbs: js.Array[String]): NonResourceRule = {
      val __obj = js.Dynamic.literal(nonResourceURLs = nonResourceURLs.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonResourceRule]
    }
    
    @scala.inline
    implicit class NonResourceRuleMutableBuilder[Self <: NonResourceRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNonResourceURLs(value: js.Array[String]): Self = StObject.set(x, "nonResourceURLs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonResourceURLsVarargs(value: String*): Self = StObject.set(x, "nonResourceURLs", js.Array(value :_*))
      
      @scala.inline
      def setVerbs(value: js.Array[String]): Self = StObject.set(x, "verbs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbsVarargs(value: String*): Self = StObject.set(x, "verbs", js.Array(value :_*))
    }
  }
  
  /**
    * ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface
    */
  @js.native
  trait ResourceAttributes extends StObject {
    
    /**
      * Group is the API Group of the Resource.  "*" means all.
      */
    var group: String = js.native
    
    /**
      * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
      */
    var name: String = js.native
    
    /**
      * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces "" (empty) is defaulted for LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
      */
    var namespace: String = js.native
    
    /**
      * Resource is one of the existing resource types.  "*" means all.
      */
    var resource: String = js.native
    
    /**
      * Subresource is one of the existing resource types.  "" means none.
      */
    var subresource: String = js.native
    
    /**
      * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
      */
    var verb: String = js.native
    
    /**
      * Version is the API Version of the Resource.  "*" means all.
      */
    var version: String = js.native
  }
  object ResourceAttributes {
    
    @scala.inline
    def apply(
      group: String,
      name: String,
      namespace: String,
      resource: String,
      subresource: String,
      verb: String,
      version: String
    ): ResourceAttributes = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], subresource = subresource.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceAttributes]
    }
    
    @scala.inline
    implicit class ResourceAttributesMutableBuilder[Self <: ResourceAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubresource(value: String): Self = StObject.set(x, "subresource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * ResourceRule is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
    */
  @js.native
  trait ResourceRule extends StObject {
    
    /**
      * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.  "*" means all.
      */
    var apiGroups: js.Array[String] = js.native
    
    /**
      * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
      */
    var resourceNames: js.Array[String] = js.native
    
    /**
      * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
      *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
      */
    var resources: js.Array[String] = js.native
    
    /**
      * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
      */
    var verbs: js.Array[String] = js.native
  }
  object ResourceRule {
    
    @scala.inline
    def apply(
      apiGroups: js.Array[String],
      resourceNames: js.Array[String],
      resources: js.Array[String],
      verbs: js.Array[String]
    ): ResourceRule = {
      val __obj = js.Dynamic.literal(apiGroups = apiGroups.asInstanceOf[js.Any], resourceNames = resourceNames.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceRule]
    }
    
    @scala.inline
    implicit class ResourceRuleMutableBuilder[Self <: ResourceRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiGroups(value: js.Array[String]): Self = StObject.set(x, "apiGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiGroupsVarargs(value: String*): Self = StObject.set(x, "apiGroups", js.Array(value :_*))
      
      @scala.inline
      def setResourceNames(value: js.Array[String]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceNamesVarargs(value: String*): Self = StObject.set(x, "resourceNames", js.Array(value :_*))
      
      @scala.inline
      def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      @scala.inline
      def setVerbs(value: js.Array[String]): Self = StObject.set(x, "verbs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerbsVarargs(value: String*): Self = StObject.set(x, "verbs", js.Array(value :_*))
    }
  }
  
  /**
    * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
    */
  @js.native
  trait SelfSubjectAccessReviewSpec extends StObject {
    
    /**
      * NonResourceAttributes describes information for a non-resource access request
      */
    var nonResourceAttributes: NonResourceAttributes = js.native
    
    /**
      * ResourceAuthorizationAttributes describes information for a resource access request
      */
    var resourceAttributes: ResourceAttributes = js.native
  }
  object SelfSubjectAccessReviewSpec {
    
    @scala.inline
    def apply(nonResourceAttributes: NonResourceAttributes, resourceAttributes: ResourceAttributes): SelfSubjectAccessReviewSpec = {
      val __obj = js.Dynamic.literal(nonResourceAttributes = nonResourceAttributes.asInstanceOf[js.Any], resourceAttributes = resourceAttributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelfSubjectAccessReviewSpec]
    }
    
    @scala.inline
    implicit class SelfSubjectAccessReviewSpecMutableBuilder[Self <: SelfSubjectAccessReviewSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNonResourceAttributes(value: NonResourceAttributes): Self = StObject.set(x, "nonResourceAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceAttributes(value: ResourceAttributes): Self = StObject.set(x, "resourceAttributes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SelfSubjectRulesReviewSpec extends StObject {
    
    /**
      * Namespace to evaluate rules for. Required.
      */
    var namespace: String = js.native
  }
  object SelfSubjectRulesReviewSpec {
    
    @scala.inline
    def apply(namespace: String): SelfSubjectRulesReviewSpec = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelfSubjectRulesReviewSpec]
    }
    
    @scala.inline
    implicit class SelfSubjectRulesReviewSpecMutableBuilder[Self <: SelfSubjectRulesReviewSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
    */
  @js.native
  trait SubjectAccessReviewSpec extends StObject {
    
    /**
      * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
      */
    var extra: StringDictionary[js.Array[String]] = js.native
    
    /**
      * Groups is the groups you're testing for.
      */
    var groups: js.Array[String] = js.native
    
    /**
      * NonResourceAttributes describes information for a non-resource access request
      */
    var nonResourceAttributes: NonResourceAttributes = js.native
    
    /**
      * ResourceAuthorizationAttributes describes information for a resource access request
      */
    var resourceAttributes: ResourceAttributes = js.native
    
    /**
      * UID information about the requesting user.
      */
    var uid: String = js.native
    
    /**
      * User is the user you're testing for. If you specify "User" but not "Groups", then is it interpreted as "What if User were not a member of any groups
      */
    var user: String = js.native
  }
  object SubjectAccessReviewSpec {
    
    @scala.inline
    def apply(
      extra: StringDictionary[js.Array[String]],
      groups: js.Array[String],
      nonResourceAttributes: NonResourceAttributes,
      resourceAttributes: ResourceAttributes,
      uid: String,
      user: String
    ): SubjectAccessReviewSpec = {
      val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], nonResourceAttributes = nonResourceAttributes.asInstanceOf[js.Any], resourceAttributes = resourceAttributes.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubjectAccessReviewSpec]
    }
    
    @scala.inline
    implicit class SubjectAccessReviewSpecMutableBuilder[Self <: SubjectAccessReviewSpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtra(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setNonResourceAttributes(value: NonResourceAttributes): Self = StObject.set(x, "nonResourceAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceAttributes(value: ResourceAttributes): Self = StObject.set(x, "resourceAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * SubjectAccessReviewStatus
    */
  @js.native
  trait SubjectAccessReviewStatus extends StObject {
    
    /**
      * Allowed is required. True if the action would be allowed, false otherwise.
      */
    var allowed: Boolean = js.native
    
    /**
      * Denied is optional. True if the action would be denied, otherwise false. If both allowed is false and denied is false, then the authorizer has no opinion on whether to authorize the action. Denied may not be true if Allowed is true.
      */
    var denied: Boolean = js.native
    
    /**
      * EvaluationError is an indication that some error occurred during the authorization check. It is entirely possible to get an error and be able to continue determine authorization status in spite of it. For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
      */
    var evaluationError: String = js.native
    
    /**
      * Reason is optional.  It indicates why a request was allowed or denied.
      */
    var reason: String = js.native
  }
  object SubjectAccessReviewStatus {
    
    @scala.inline
    def apply(allowed: Boolean, denied: Boolean, evaluationError: String, reason: String): SubjectAccessReviewStatus = {
      val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], denied = denied.asInstanceOf[js.Any], evaluationError = evaluationError.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubjectAccessReviewStatus]
    }
    
    @scala.inline
    implicit class SubjectAccessReviewStatusMutableBuilder[Self <: SubjectAccessReviewStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDenied(value: Boolean): Self = StObject.set(x, "denied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvaluationError(value: String): Self = StObject.set(x, "evaluationError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete depending on the set of authorizers the server is configured with and any errors experienced during evaluation. Because authorization rules are additive, if a rule appears in a list it's safe to assume the subject has that permission, even if that list is incomplete.
    */
  @js.native
  trait SubjectRulesReviewStatus extends StObject {
    
    /**
      * EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn't support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete.
      */
    var evaluationError: String = js.native
    
    /**
      * Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.
      */
    var incomplete: Boolean = js.native
    
    /**
      * NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
      */
    var nonResourceRules: js.Array[NonResourceRule] = js.native
    
    /**
      * ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
      */
    var resourceRules: js.Array[ResourceRule] = js.native
  }
  object SubjectRulesReviewStatus {
    
    @scala.inline
    def apply(
      evaluationError: String,
      incomplete: Boolean,
      nonResourceRules: js.Array[NonResourceRule],
      resourceRules: js.Array[ResourceRule]
    ): SubjectRulesReviewStatus = {
      val __obj = js.Dynamic.literal(evaluationError = evaluationError.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], nonResourceRules = nonResourceRules.asInstanceOf[js.Any], resourceRules = resourceRules.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubjectRulesReviewStatus]
    }
    
    @scala.inline
    implicit class SubjectRulesReviewStatusMutableBuilder[Self <: SubjectRulesReviewStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvaluationError(value: String): Self = StObject.set(x, "evaluationError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncomplete(value: Boolean): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonResourceRules(value: js.Array[NonResourceRule]): Self = StObject.set(x, "nonResourceRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonResourceRulesVarargs(value: NonResourceRule*): Self = StObject.set(x, "nonResourceRules", js.Array(value :_*))
      
      @scala.inline
      def setResourceRules(value: js.Array[ResourceRule]): Self = StObject.set(x, "resourceRules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceRulesVarargs(value: ResourceRule*): Self = StObject.set(x, "resourceRules", js.Array(value :_*))
    }
  }
}
