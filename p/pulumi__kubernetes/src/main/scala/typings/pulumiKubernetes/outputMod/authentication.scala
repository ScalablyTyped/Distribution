package typings.pulumiKubernetes.outputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authentication {
  
  object v1 {
    
    /**
      * BoundObjectReference is a reference to an object that a token is bound to.
      */
    trait BoundObjectReference extends StObject {
      
      /**
        * API version of the referent.
        */
      var apiVersion: String
      
      /**
        * Kind of the referent. Valid kinds are 'Pod' and 'Secret'.
        */
      var kind: String
      
      /**
        * Name of the referent.
        */
      var name: String
      
      /**
        * UID of the referent.
        */
      var uid: String
    }
    object BoundObjectReference {
      
      @scala.inline
      def apply(apiVersion: String, kind: String, name: String, uid: String): BoundObjectReference = {
        val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
        __obj.asInstanceOf[BoundObjectReference]
      }
      
      @scala.inline
      implicit class BoundObjectReferenceMutableBuilder[Self <: BoundObjectReference] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * TokenRequestSpec contains client provided parameters of a token request.
      */
    trait TokenRequestSpec extends StObject {
      
      /**
        * Audiences are the intendend audiences of the token. A recipient of a token must identitfy themself with an identifier in the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be used to authenticate against any of the audiences listed but implies a high degree of trust between the target audiences.
        */
      var audiences: js.Array[String]
      
      /**
        * BoundObjectRef is a reference to an object that the token will be bound to. The token will only be valid for as long as the bound object exists. NOTE: The API server's TokenReview endpoint will validate the BoundObjectRef, but other audiences may not. Keep ExpirationSeconds small if you want prompt revocation.
        */
      var boundObjectRef: BoundObjectReference
      
      /**
        * ExpirationSeconds is the requested duration of validity of the request. The token issuer may return a token with a different validity duration so a client needs to check the 'expiration' field in a response.
        */
      var expirationSeconds: Double
    }
    object TokenRequestSpec {
      
      @scala.inline
      def apply(audiences: js.Array[String], boundObjectRef: BoundObjectReference, expirationSeconds: Double): TokenRequestSpec = {
        val __obj = js.Dynamic.literal(audiences = audiences.asInstanceOf[js.Any], boundObjectRef = boundObjectRef.asInstanceOf[js.Any], expirationSeconds = expirationSeconds.asInstanceOf[js.Any])
        __obj.asInstanceOf[TokenRequestSpec]
      }
      
      @scala.inline
      implicit class TokenRequestSpecMutableBuilder[Self <: TokenRequestSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAudiences(value: js.Array[String]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAudiencesVarargs(value: String*): Self = StObject.set(x, "audiences", js.Array(value :_*))
        
        @scala.inline
        def setBoundObjectRef(value: BoundObjectReference): Self = StObject.set(x, "boundObjectRef", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpirationSeconds(value: Double): Self = StObject.set(x, "expirationSeconds", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * TokenRequestStatus is the result of a token request.
      */
    trait TokenRequestStatus extends StObject {
      
      /**
        * ExpirationTimestamp is the time of expiration of the returned token.
        */
      var expirationTimestamp: String
      
      /**
        * Token is the opaque bearer token.
        */
      var token: String
    }
    object TokenRequestStatus {
      
      @scala.inline
      def apply(expirationTimestamp: String, token: String): TokenRequestStatus = {
        val __obj = js.Dynamic.literal(expirationTimestamp = expirationTimestamp.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
        __obj.asInstanceOf[TokenRequestStatus]
      }
      
      @scala.inline
      implicit class TokenRequestStatusMutableBuilder[Self <: TokenRequestStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExpirationTimestamp(value: String): Self = StObject.set(x, "expirationTimestamp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * TokenReviewSpec is a description of the token authentication request.
      */
    trait TokenReviewSpec extends StObject {
      
      /**
        * Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
        */
      var audiences: js.Array[String]
      
      /**
        * Token is the opaque bearer token.
        */
      var token: String
    }
    object TokenReviewSpec {
      
      @scala.inline
      def apply(audiences: js.Array[String], token: String): TokenReviewSpec = {
        val __obj = js.Dynamic.literal(audiences = audiences.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
        __obj.asInstanceOf[TokenReviewSpec]
      }
      
      @scala.inline
      implicit class TokenReviewSpecMutableBuilder[Self <: TokenReviewSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAudiences(value: js.Array[String]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAudiencesVarargs(value: String*): Self = StObject.set(x, "audiences", js.Array(value :_*))
        
        @scala.inline
        def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * TokenReviewStatus is the result of the token authentication request.
      */
    trait TokenReviewStatus extends StObject {
      
      /**
        * Audiences are audience identifiers chosen by the authenticator that are compatible with both the TokenReview and token. An identifier is any identifier in the intersection of the TokenReviewSpec audiences and the token's audiences. A client of the TokenReview API that sets the spec.audiences field should validate that a compatible audience identifier is returned in the status.audiences field to ensure that the TokenReview server is audience aware. If a TokenReview returns an empty status.audience field where status.authenticated is "true", the token is valid against the audience of the Kubernetes API server.
        */
      var audiences: js.Array[String]
      
      /**
        * Authenticated indicates that the token was associated with a known user.
        */
      var authenticated: Boolean
      
      /**
        * Error indicates that the token couldn't be checked
        */
      var error: String
      
      /**
        * User is the UserInfo associated with the provided token.
        */
      var user: UserInfo
    }
    object TokenReviewStatus {
      
      @scala.inline
      def apply(audiences: js.Array[String], authenticated: Boolean, error: String, user: UserInfo): TokenReviewStatus = {
        val __obj = js.Dynamic.literal(audiences = audiences.asInstanceOf[js.Any], authenticated = authenticated.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
        __obj.asInstanceOf[TokenReviewStatus]
      }
      
      @scala.inline
      implicit class TokenReviewStatusMutableBuilder[Self <: TokenReviewStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAudiences(value: js.Array[String]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAudiencesVarargs(value: String*): Self = StObject.set(x, "audiences", js.Array(value :_*))
        
        @scala.inline
        def setAuthenticated(value: Boolean): Self = StObject.set(x, "authenticated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUser(value: UserInfo): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * UserInfo holds the information about the user needed to implement the user.Info interface.
      */
    trait UserInfo extends StObject {
      
      /**
        * Any additional information provided by the authenticator.
        */
      var extra: StringDictionary[js.Array[String]]
      
      /**
        * The names of groups this user is a part of.
        */
      var groups: js.Array[String]
      
      /**
        * A unique value that identifies this user across time. If this user is deleted and another user by the same name is added, they will have different UIDs.
        */
      var uid: String
      
      /**
        * The name that uniquely identifies this user among all active users.
        */
      var username: String
    }
    object UserInfo {
      
      @scala.inline
      def apply(extra: StringDictionary[js.Array[String]], groups: js.Array[String], uid: String, username: String): UserInfo = {
        val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
        __obj.asInstanceOf[UserInfo]
      }
      
      @scala.inline
      implicit class UserInfoMutableBuilder[Self <: UserInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExtra(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
        
        @scala.inline
        def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object v1beta1 {
    
    /**
      * TokenReviewSpec is a description of the token authentication request.
      */
    trait TokenReviewSpec extends StObject {
      
      /**
        * Audiences is a list of the identifiers that the resource server presented with the token identifies as. Audience-aware token authenticators will verify that the token was intended for at least one of the audiences in this list. If no audiences are provided, the audience will default to the audience of the Kubernetes apiserver.
        */
      var audiences: js.Array[String]
      
      /**
        * Token is the opaque bearer token.
        */
      var token: String
    }
    object TokenReviewSpec {
      
      @scala.inline
      def apply(audiences: js.Array[String], token: String): TokenReviewSpec = {
        val __obj = js.Dynamic.literal(audiences = audiences.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
        __obj.asInstanceOf[TokenReviewSpec]
      }
      
      @scala.inline
      implicit class TokenReviewSpecMutableBuilder[Self <: TokenReviewSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAudiences(value: js.Array[String]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAudiencesVarargs(value: String*): Self = StObject.set(x, "audiences", js.Array(value :_*))
        
        @scala.inline
        def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * TokenReviewStatus is the result of the token authentication request.
      */
    trait TokenReviewStatus extends StObject {
      
      /**
        * Audiences are audience identifiers chosen by the authenticator that are compatible with both the TokenReview and token. An identifier is any identifier in the intersection of the TokenReviewSpec audiences and the token's audiences. A client of the TokenReview API that sets the spec.audiences field should validate that a compatible audience identifier is returned in the status.audiences field to ensure that the TokenReview server is audience aware. If a TokenReview returns an empty status.audience field where status.authenticated is "true", the token is valid against the audience of the Kubernetes API server.
        */
      var audiences: js.Array[String]
      
      /**
        * Authenticated indicates that the token was associated with a known user.
        */
      var authenticated: Boolean
      
      /**
        * Error indicates that the token couldn't be checked
        */
      var error: String
      
      /**
        * User is the UserInfo associated with the provided token.
        */
      var user: UserInfo
    }
    object TokenReviewStatus {
      
      @scala.inline
      def apply(audiences: js.Array[String], authenticated: Boolean, error: String, user: UserInfo): TokenReviewStatus = {
        val __obj = js.Dynamic.literal(audiences = audiences.asInstanceOf[js.Any], authenticated = authenticated.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
        __obj.asInstanceOf[TokenReviewStatus]
      }
      
      @scala.inline
      implicit class TokenReviewStatusMutableBuilder[Self <: TokenReviewStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAudiences(value: js.Array[String]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAudiencesVarargs(value: String*): Self = StObject.set(x, "audiences", js.Array(value :_*))
        
        @scala.inline
        def setAuthenticated(value: Boolean): Self = StObject.set(x, "authenticated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUser(value: UserInfo): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * UserInfo holds the information about the user needed to implement the user.Info interface.
      */
    trait UserInfo extends StObject {
      
      /**
        * Any additional information provided by the authenticator.
        */
      var extra: StringDictionary[js.Array[String]]
      
      /**
        * The names of groups this user is a part of.
        */
      var groups: js.Array[String]
      
      /**
        * A unique value that identifies this user across time. If this user is deleted and another user by the same name is added, they will have different UIDs.
        */
      var uid: String
      
      /**
        * The name that uniquely identifies this user among all active users.
        */
      var username: String
    }
    object UserInfo {
      
      @scala.inline
      def apply(extra: StringDictionary[js.Array[String]], groups: js.Array[String], uid: String, username: String): UserInfo = {
        val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
        __obj.asInstanceOf[UserInfo]
      }
      
      @scala.inline
      implicit class UserInfoMutableBuilder[Self <: UserInfo] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExtra(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
        
        @scala.inline
        def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      }
    }
  }
}
