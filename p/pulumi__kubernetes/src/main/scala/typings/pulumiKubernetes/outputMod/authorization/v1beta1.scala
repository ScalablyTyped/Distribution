package typings.pulumiKubernetes.outputMod.authorization

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta1 {
  
  /**
    * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface
    */
  trait NonResourceAttributes extends StObject {
    
    /**
      * Path is the URL path of the request
      */
    var path: String
    
    /**
      * Verb is the standard HTTP verb
      */
    var verb: String
  }
  object NonResourceAttributes {
    
    inline def apply(path: String, verb: String): NonResourceAttributes = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonResourceAttributes]
    }
    
    extension [Self <: NonResourceAttributes](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * NonResourceRule holds information that describes a rule for the non-resource
    */
  trait NonResourceRule extends StObject {
    
    /**
      * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path.  "*" means all.
      */
    var nonResourceURLs: js.Array[String]
    
    /**
      * Verb is a list of kubernetes non-resource API verbs, like: get, post, put, delete, patch, head, options.  "*" means all.
      */
    var verbs: js.Array[String]
  }
  object NonResourceRule {
    
    inline def apply(nonResourceURLs: js.Array[String], verbs: js.Array[String]): NonResourceRule = {
      val __obj = js.Dynamic.literal(nonResourceURLs = nonResourceURLs.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
      __obj.asInstanceOf[NonResourceRule]
    }
    
    extension [Self <: NonResourceRule](x: Self) {
      
      inline def setNonResourceURLs(value: js.Array[String]): Self = StObject.set(x, "nonResourceURLs", value.asInstanceOf[js.Any])
      
      inline def setNonResourceURLsVarargs(value: String*): Self = StObject.set(x, "nonResourceURLs", js.Array(value :_*))
      
      inline def setVerbs(value: js.Array[String]): Self = StObject.set(x, "verbs", value.asInstanceOf[js.Any])
      
      inline def setVerbsVarargs(value: String*): Self = StObject.set(x, "verbs", js.Array(value :_*))
    }
  }
  
  /**
    * ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface
    */
  trait ResourceAttributes extends StObject {
    
    /**
      * Group is the API Group of the Resource.  "*" means all.
      */
    var group: String
    
    /**
      * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
      */
    var name: String
    
    /**
      * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces "" (empty) is defaulted for LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
      */
    var namespace: String
    
    /**
      * Resource is one of the existing resource types.  "*" means all.
      */
    var resource: String
    
    /**
      * Subresource is one of the existing resource types.  "" means none.
      */
    var subresource: String
    
    /**
      * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
      */
    var verb: String
    
    /**
      * Version is the API Version of the Resource.  "*" means all.
      */
    var version: String
  }
  object ResourceAttributes {
    
    inline def apply(
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
    
    extension [Self <: ResourceAttributes](x: Self) {
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setSubresource(value: String): Self = StObject.set(x, "subresource", value.asInstanceOf[js.Any])
      
      inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * ResourceRule is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
    */
  trait ResourceRule extends StObject {
    
    /**
      * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.  "*" means all.
      */
    var apiGroups: js.Array[String]
    
    /**
      * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.  "*" means all.
      */
    var resourceNames: js.Array[String]
    
    /**
      * Resources is a list of resources this rule applies to.  "*" means all in the specified apiGroups.
      *  "*&#47;foo" represents the subresource 'foo' for all resources in the specified apiGroups.
      */
    var resources: js.Array[String]
    
    /**
      * Verb is a list of kubernetes resource API verbs, like: get, list, watch, create, update, delete, proxy.  "*" means all.
      */
    var verbs: js.Array[String]
  }
  object ResourceRule {
    
    inline def apply(
      apiGroups: js.Array[String],
      resourceNames: js.Array[String],
      resources: js.Array[String],
      verbs: js.Array[String]
    ): ResourceRule = {
      val __obj = js.Dynamic.literal(apiGroups = apiGroups.asInstanceOf[js.Any], resourceNames = resourceNames.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceRule]
    }
    
    extension [Self <: ResourceRule](x: Self) {
      
      inline def setApiGroups(value: js.Array[String]): Self = StObject.set(x, "apiGroups", value.asInstanceOf[js.Any])
      
      inline def setApiGroupsVarargs(value: String*): Self = StObject.set(x, "apiGroups", js.Array(value :_*))
      
      inline def setResourceNames(value: js.Array[String]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
      
      inline def setResourceNamesVarargs(value: String*): Self = StObject.set(x, "resourceNames", js.Array(value :_*))
      
      inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      inline def setVerbs(value: js.Array[String]): Self = StObject.set(x, "verbs", value.asInstanceOf[js.Any])
      
      inline def setVerbsVarargs(value: String*): Self = StObject.set(x, "verbs", js.Array(value :_*))
    }
  }
  
  /**
    * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
    */
  trait SelfSubjectAccessReviewSpec extends StObject {
    
    /**
      * NonResourceAttributes describes information for a non-resource access request
      */
    var nonResourceAttributes: NonResourceAttributes
    
    /**
      * ResourceAuthorizationAttributes describes information for a resource access request
      */
    var resourceAttributes: ResourceAttributes
  }
  object SelfSubjectAccessReviewSpec {
    
    inline def apply(nonResourceAttributes: NonResourceAttributes, resourceAttributes: ResourceAttributes): SelfSubjectAccessReviewSpec = {
      val __obj = js.Dynamic.literal(nonResourceAttributes = nonResourceAttributes.asInstanceOf[js.Any], resourceAttributes = resourceAttributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelfSubjectAccessReviewSpec]
    }
    
    extension [Self <: SelfSubjectAccessReviewSpec](x: Self) {
      
      inline def setNonResourceAttributes(value: NonResourceAttributes): Self = StObject.set(x, "nonResourceAttributes", value.asInstanceOf[js.Any])
      
      inline def setResourceAttributes(value: ResourceAttributes): Self = StObject.set(x, "resourceAttributes", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelfSubjectRulesReviewSpec extends StObject {
    
    /**
      * Namespace to evaluate rules for. Required.
      */
    var namespace: String
  }
  object SelfSubjectRulesReviewSpec {
    
    inline def apply(namespace: String): SelfSubjectRulesReviewSpec = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelfSubjectRulesReviewSpec]
    }
    
    extension [Self <: SelfSubjectRulesReviewSpec](x: Self) {
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
    */
  trait SubjectAccessReviewSpec extends StObject {
    
    /**
      * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
      */
    var extra: StringDictionary[js.Array[String]]
    
    /**
      * Groups is the groups you're testing for.
      */
    var group: js.Array[String]
    
    /**
      * NonResourceAttributes describes information for a non-resource access request
      */
    var nonResourceAttributes: NonResourceAttributes
    
    /**
      * ResourceAuthorizationAttributes describes information for a resource access request
      */
    var resourceAttributes: ResourceAttributes
    
    /**
      * UID information about the requesting user.
      */
    var uid: String
    
    /**
      * User is the user you're testing for. If you specify "User" but not "Group", then is it interpreted as "What if User were not a member of any groups
      */
    var user: String
  }
  object SubjectAccessReviewSpec {
    
    inline def apply(
      extra: StringDictionary[js.Array[String]],
      group: js.Array[String],
      nonResourceAttributes: NonResourceAttributes,
      resourceAttributes: ResourceAttributes,
      uid: String,
      user: String
    ): SubjectAccessReviewSpec = {
      val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], nonResourceAttributes = nonResourceAttributes.asInstanceOf[js.Any], resourceAttributes = resourceAttributes.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubjectAccessReviewSpec]
    }
    
    extension [Self <: SubjectAccessReviewSpec](x: Self) {
      
      inline def setExtra(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setGroup(value: js.Array[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupVarargs(value: String*): Self = StObject.set(x, "group", js.Array(value :_*))
      
      inline def setNonResourceAttributes(value: NonResourceAttributes): Self = StObject.set(x, "nonResourceAttributes", value.asInstanceOf[js.Any])
      
      inline def setResourceAttributes(value: ResourceAttributes): Self = StObject.set(x, "resourceAttributes", value.asInstanceOf[js.Any])
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * SubjectAccessReviewStatus
    */
  trait SubjectAccessReviewStatus extends StObject {
    
    /**
      * Allowed is required. True if the action would be allowed, false otherwise.
      */
    var allowed: Boolean
    
    /**
      * Denied is optional. True if the action would be denied, otherwise false. If both allowed is false and denied is false, then the authorizer has no opinion on whether to authorize the action. Denied may not be true if Allowed is true.
      */
    var denied: Boolean
    
    /**
      * EvaluationError is an indication that some error occurred during the authorization check. It is entirely possible to get an error and be able to continue determine authorization status in spite of it. For instance, RBAC can be missing a role, but enough roles are still present and bound to reason about the request.
      */
    var evaluationError: String
    
    /**
      * Reason is optional.  It indicates why a request was allowed or denied.
      */
    var reason: String
  }
  object SubjectAccessReviewStatus {
    
    inline def apply(allowed: Boolean, denied: Boolean, evaluationError: String, reason: String): SubjectAccessReviewStatus = {
      val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], denied = denied.asInstanceOf[js.Any], evaluationError = evaluationError.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubjectAccessReviewStatus]
    }
    
    extension [Self <: SubjectAccessReviewStatus](x: Self) {
      
      inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
      
      inline def setDenied(value: Boolean): Self = StObject.set(x, "denied", value.asInstanceOf[js.Any])
      
      inline def setEvaluationError(value: String): Self = StObject.set(x, "evaluationError", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete depending on the set of authorizers the server is configured with and any errors experienced during evaluation. Because authorization rules are additive, if a rule appears in a list it's safe to assume the subject has that permission, even if that list is incomplete.
    */
  trait SubjectRulesReviewStatus extends StObject {
    
    /**
      * EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn't support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete.
      */
    var evaluationError: String
    
    /**
      * Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.
      */
    var incomplete: Boolean
    
    /**
      * NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
      */
    var nonResourceRules: js.Array[NonResourceRule]
    
    /**
      * ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.
      */
    var resourceRules: js.Array[ResourceRule]
  }
  object SubjectRulesReviewStatus {
    
    inline def apply(
      evaluationError: String,
      incomplete: Boolean,
      nonResourceRules: js.Array[NonResourceRule],
      resourceRules: js.Array[ResourceRule]
    ): SubjectRulesReviewStatus = {
      val __obj = js.Dynamic.literal(evaluationError = evaluationError.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], nonResourceRules = nonResourceRules.asInstanceOf[js.Any], resourceRules = resourceRules.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubjectRulesReviewStatus]
    }
    
    extension [Self <: SubjectRulesReviewStatus](x: Self) {
      
      inline def setEvaluationError(value: String): Self = StObject.set(x, "evaluationError", value.asInstanceOf[js.Any])
      
      inline def setIncomplete(value: Boolean): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
      
      inline def setNonResourceRules(value: js.Array[NonResourceRule]): Self = StObject.set(x, "nonResourceRules", value.asInstanceOf[js.Any])
      
      inline def setNonResourceRulesVarargs(value: NonResourceRule*): Self = StObject.set(x, "nonResourceRules", js.Array(value :_*))
      
      inline def setResourceRules(value: js.Array[ResourceRule]): Self = StObject.set(x, "resourceRules", value.asInstanceOf[js.Any])
      
      inline def setResourceRulesVarargs(value: ResourceRule*): Self = StObject.set(x, "resourceRules", js.Array(value :_*))
    }
  }
}
