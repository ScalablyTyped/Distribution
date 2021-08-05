package typings.pulumiKubernetes.inputMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authorization {
  
  object v1 {
    
    /**
      * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface
      */
    trait NonResourceAttributes extends StObject {
      
      /**
        * Path is the URL path of the request
        */
      var path: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Verb is the standard HTTP verb
        */
      var verb: js.UndefOr[Input[String]] = js.undefined
    }
    object NonResourceAttributes {
      
      inline def apply(): NonResourceAttributes = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NonResourceAttributes]
      }
      
      extension [Self <: NonResourceAttributes](x: Self) {
        
        inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setVerb(value: Input[String]): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
        
        inline def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
      }
    }
    
    /**
      * ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface
      */
    trait ResourceAttributes extends StObject {
      
      /**
        * Group is the API Group of the Resource.  "*" means all.
        */
      var group: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
        */
      var name: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces "" (empty) is defaulted for LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
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
        * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
        */
      var verb: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Version is the API Version of the Resource.  "*" means all.
        */
      var version: js.UndefOr[Input[String]] = js.undefined
    }
    object ResourceAttributes {
      
      inline def apply(): ResourceAttributes = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResourceAttributes]
      }
      
      extension [Self <: ResourceAttributes](x: Self) {
        
        inline def setGroup(value: Input[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
        
        inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
        
        inline def setResource(value: Input[String]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
        
        inline def setSubresource(value: Input[String]): Self = StObject.set(x, "subresource", value.asInstanceOf[js.Any])
        
        inline def setSubresourceUndefined: Self = StObject.set(x, "subresource", js.undefined)
        
        inline def setVerb(value: Input[String]): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
        
        inline def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
        
        inline def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    /**
      * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
      */
    trait SelfSubjectAccessReviewSpec extends StObject {
      
      /**
        * NonResourceAttributes describes information for a non-resource access request
        */
      var nonResourceAttributes: js.UndefOr[Input[NonResourceAttributes]] = js.undefined
      
      /**
        * ResourceAuthorizationAttributes describes information for a resource access request
        */
      var resourceAttributes: js.UndefOr[Input[ResourceAttributes]] = js.undefined
    }
    object SelfSubjectAccessReviewSpec {
      
      inline def apply(): SelfSubjectAccessReviewSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SelfSubjectAccessReviewSpec]
      }
      
      extension [Self <: SelfSubjectAccessReviewSpec](x: Self) {
        
        inline def setNonResourceAttributes(value: Input[NonResourceAttributes]): Self = StObject.set(x, "nonResourceAttributes", value.asInstanceOf[js.Any])
        
        inline def setNonResourceAttributesUndefined: Self = StObject.set(x, "nonResourceAttributes", js.undefined)
        
        inline def setResourceAttributes(value: Input[ResourceAttributes]): Self = StObject.set(x, "resourceAttributes", value.asInstanceOf[js.Any])
        
        inline def setResourceAttributesUndefined: Self = StObject.set(x, "resourceAttributes", js.undefined)
      }
    }
    
    trait SelfSubjectRulesReviewSpec extends StObject {
      
      /**
        * Namespace to evaluate rules for. Required.
        */
      var namespace: js.UndefOr[Input[String]] = js.undefined
    }
    object SelfSubjectRulesReviewSpec {
      
      inline def apply(): SelfSubjectRulesReviewSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SelfSubjectRulesReviewSpec]
      }
      
      extension [Self <: SelfSubjectRulesReviewSpec](x: Self) {
        
        inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      }
    }
    
    /**
      * SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
      */
    trait SubjectAccessReviewSpec extends StObject {
      
      /**
        * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
        */
      var extra: js.UndefOr[Input[StringDictionary[Input[js.Array[Input[String]]]]]] = js.undefined
      
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
        * User is the user you're testing for. If you specify "User" but not "Groups", then is it interpreted as "What if User were not a member of any groups
        */
      var user: js.UndefOr[Input[String]] = js.undefined
    }
    object SubjectAccessReviewSpec {
      
      inline def apply(): SubjectAccessReviewSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubjectAccessReviewSpec]
      }
      
      extension [Self <: SubjectAccessReviewSpec](x: Self) {
        
        inline def setExtra(value: Input[StringDictionary[Input[js.Array[Input[String]]]]]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
        
        inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
        
        inline def setGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
        
        inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
        
        inline def setGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "groups", js.Array(value :_*))
        
        inline def setNonResourceAttributes(value: Input[NonResourceAttributes]): Self = StObject.set(x, "nonResourceAttributes", value.asInstanceOf[js.Any])
        
        inline def setNonResourceAttributesUndefined: Self = StObject.set(x, "nonResourceAttributes", js.undefined)
        
        inline def setResourceAttributes(value: Input[ResourceAttributes]): Self = StObject.set(x, "resourceAttributes", value.asInstanceOf[js.Any])
        
        inline def setResourceAttributesUndefined: Self = StObject.set(x, "resourceAttributes", js.undefined)
        
        inline def setUid(value: Input[String]): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
        
        inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
        
        inline def setUser(value: Input[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      }
    }
  }
  
  object v1beta1 {
    
    /**
      * NonResourceAttributes includes the authorization attributes available for non-resource requests to the Authorizer interface
      */
    trait NonResourceAttributes extends StObject {
      
      /**
        * Path is the URL path of the request
        */
      var path: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Verb is the standard HTTP verb
        */
      var verb: js.UndefOr[Input[String]] = js.undefined
    }
    object NonResourceAttributes {
      
      inline def apply(): NonResourceAttributes = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NonResourceAttributes]
      }
      
      extension [Self <: NonResourceAttributes](x: Self) {
        
        inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setVerb(value: Input[String]): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
        
        inline def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
      }
    }
    
    /**
      * ResourceAttributes includes the authorization attributes available for resource requests to the Authorizer interface
      */
    trait ResourceAttributes extends StObject {
      
      /**
        * Group is the API Group of the Resource.  "*" means all.
        */
      var group: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Name is the name of the resource being requested for a "get" or deleted for a "delete". "" (empty) means all.
        */
      var name: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Namespace is the namespace of the action being requested.  Currently, there is no distinction between no namespace and all namespaces "" (empty) is defaulted for LocalSubjectAccessReviews "" (empty) is empty for cluster-scoped resources "" (empty) means "all" for namespace scoped resources from a SubjectAccessReview or SelfSubjectAccessReview
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
        * Verb is a kubernetes resource API verb, like: get, list, watch, create, update, delete, proxy.  "*" means all.
        */
      var verb: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * Version is the API Version of the Resource.  "*" means all.
        */
      var version: js.UndefOr[Input[String]] = js.undefined
    }
    object ResourceAttributes {
      
      inline def apply(): ResourceAttributes = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResourceAttributes]
      }
      
      extension [Self <: ResourceAttributes](x: Self) {
        
        inline def setGroup(value: Input[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
        
        inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
        
        inline def setResource(value: Input[String]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
        
        inline def setSubresource(value: Input[String]): Self = StObject.set(x, "subresource", value.asInstanceOf[js.Any])
        
        inline def setSubresourceUndefined: Self = StObject.set(x, "subresource", js.undefined)
        
        inline def setVerb(value: Input[String]): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
        
        inline def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
        
        inline def setVersion(value: Input[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    /**
      * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
      */
    trait SelfSubjectAccessReviewSpec extends StObject {
      
      /**
        * NonResourceAttributes describes information for a non-resource access request
        */
      var nonResourceAttributes: js.UndefOr[Input[NonResourceAttributes]] = js.undefined
      
      /**
        * ResourceAuthorizationAttributes describes information for a resource access request
        */
      var resourceAttributes: js.UndefOr[Input[ResourceAttributes]] = js.undefined
    }
    object SelfSubjectAccessReviewSpec {
      
      inline def apply(): SelfSubjectAccessReviewSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SelfSubjectAccessReviewSpec]
      }
      
      extension [Self <: SelfSubjectAccessReviewSpec](x: Self) {
        
        inline def setNonResourceAttributes(value: Input[NonResourceAttributes]): Self = StObject.set(x, "nonResourceAttributes", value.asInstanceOf[js.Any])
        
        inline def setNonResourceAttributesUndefined: Self = StObject.set(x, "nonResourceAttributes", js.undefined)
        
        inline def setResourceAttributes(value: Input[ResourceAttributes]): Self = StObject.set(x, "resourceAttributes", value.asInstanceOf[js.Any])
        
        inline def setResourceAttributesUndefined: Self = StObject.set(x, "resourceAttributes", js.undefined)
      }
    }
    
    trait SelfSubjectRulesReviewSpec extends StObject {
      
      /**
        * Namespace to evaluate rules for. Required.
        */
      var namespace: js.UndefOr[Input[String]] = js.undefined
    }
    object SelfSubjectRulesReviewSpec {
      
      inline def apply(): SelfSubjectRulesReviewSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SelfSubjectRulesReviewSpec]
      }
      
      extension [Self <: SelfSubjectRulesReviewSpec](x: Self) {
        
        inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      }
    }
    
    /**
      * SubjectAccessReviewSpec is a description of the access request.  Exactly one of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes must be set
      */
    trait SubjectAccessReviewSpec extends StObject {
      
      /**
        * Extra corresponds to the user.Info.GetExtra() method from the authenticator.  Since that is input to the authorizer it needs a reflection here.
        */
      var extra: js.UndefOr[Input[StringDictionary[Input[js.Array[Input[String]]]]]] = js.undefined
      
      /**
        * Groups is the groups you're testing for.
        */
      var group: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      
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
        * User is the user you're testing for. If you specify "User" but not "Group", then is it interpreted as "What if User were not a member of any groups
        */
      var user: js.UndefOr[Input[String]] = js.undefined
    }
    object SubjectAccessReviewSpec {
      
      inline def apply(): SubjectAccessReviewSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[SubjectAccessReviewSpec]
      }
      
      extension [Self <: SubjectAccessReviewSpec](x: Self) {
        
        inline def setExtra(value: Input[StringDictionary[Input[js.Array[Input[String]]]]]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
        
        inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
        
        inline def setGroup(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
        
        inline def setGroupVarargs(value: Input[String]*): Self = StObject.set(x, "group", js.Array(value :_*))
        
        inline def setNonResourceAttributes(value: Input[NonResourceAttributes]): Self = StObject.set(x, "nonResourceAttributes", value.asInstanceOf[js.Any])
        
        inline def setNonResourceAttributesUndefined: Self = StObject.set(x, "nonResourceAttributes", js.undefined)
        
        inline def setResourceAttributes(value: Input[ResourceAttributes]): Self = StObject.set(x, "resourceAttributes", value.asInstanceOf[js.Any])
        
        inline def setResourceAttributesUndefined: Self = StObject.set(x, "resourceAttributes", js.undefined)
        
        inline def setUid(value: Input[String]): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
        
        inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
        
        inline def setUser(value: Input[String]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
        
        inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
      }
    }
  }
}
