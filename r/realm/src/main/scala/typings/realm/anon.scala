package typings.realm

import org.scalablytyped.runtime.Instantiable1
import typings.realm.Realm.Credentials
import typings.realm.Realm.Credentials.AnonymousPayload
import typings.realm.Realm.Credentials.ApiKeyPayload
import typings.realm.Realm.Credentials.ApplePayload
import typings.realm.Realm.Credentials.EmailPasswordPayload
import typings.realm.Realm.Credentials.FacebookPayload
import typings.realm.Realm.Credentials.FunctionPayload
import typings.realm.Realm.Credentials.GooglePayload
import typings.realm.Realm.Credentials.JWTPayload
import typings.realm.Realm.Object
import typings.realm.Realm.Services.MongoDB.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Filter extends StObject {
    
    /** A filter document */
    var filter: typings.realm.Realm.Services.MongoDB.Filter = js.native
  }
  object Filter {
    
    @scala.inline
    def apply(filter: typings.realm.Realm.Services.MongoDB.Filter): Filter = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filter]
    }
    
    @scala.inline
    implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: typings.realm.Realm.Services.MongoDB.Filter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Id[IdType] extends StObject {
    
    /** The id of the document. */
    var _id: IdType = js.native
  }
  object Id {
    
    @scala.inline
    def apply[IdType](_id: IdType): Id[IdType] = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id[IdType]]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id[_], IdType] (val x: Self with Id[IdType]) extends AnyVal {
      
      @scala.inline
      def set_id(value: IdType): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Ids[T /* <: Document[_] */] extends StObject {
    
    /** List of ids to watch */
    var ids: js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
      ] = js.native
  }
  object Ids {
    
    @scala.inline
    def apply[T /* <: Document[_] */](
      ids: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
        ]
    ): Ids[T] = {
      val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ids[T]]
    }
    
    @scala.inline
    implicit class IdsMutableBuilder[Self <: Ids[_], T /* <: Document[_] */] (val x: Self with Ids[T]) extends AnyVal {
      
      @scala.inline
      def setIds(
        value: js.Array[
              /* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any
            ]
      ): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdsVarargs(value: (/* import warning: importer.ImportType#apply Failed type conversion: T['_id'] */ js.Any)*): Self = StObject.set(x, "ids", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Instantiable[T /* <: Object */]
    extends Instantiable1[/* arg (repeated) */ js.Any, T]
  
  /* Inlined std.Omit<realm.Realm.Services.MongoDB.DocumentNamespace, 'coll'> */
  @js.native
  trait OmitDocumentNamespacecoll extends StObject {
    
    var db: String = js.native
  }
  object OmitDocumentNamespacecoll {
    
    @scala.inline
    def apply(db: String): OmitDocumentNamespacecoll = {
      val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitDocumentNamespacecoll]
    }
    
    @scala.inline
    implicit class OmitDocumentNamespacecollMutableBuilder[Self <: OmitDocumentNamespacecoll] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofCredentials extends StObject {
    
    /**
      * Factory for `Credentials` which authenticate using the [Anonymous Provider](https://docs.mongodb.com/realm/authentication/anonymous/).
      *
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    def anonymous(): Credentials[AnonymousPayload] = js.native
    
    /**
      * Factory for `Credentials` which authenticate using the [Apple ID Provider](https://docs.mongodb.com/realm/authentication/apple/).
      *
      * @param idToken The id_token returned from Apple.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    def apple(idToken: String): Credentials[ApplePayload] = js.native
    
    /**
      * Factory for `Credentials` which authenticate using the [Email/Password Provider](https://docs.mongodb.com/realm/authentication/email-password/).
      * Note: This was formerly known as the "Username/Password" provider.
      *
      * @param email The end-users email address.
      * @param password The end-users password.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    def emailPassword(email: String, password: String): Credentials[EmailPasswordPayload] = js.native
    
    /**
      * Factory for `Credentials` which authenticate using the [Facebook Provider](https://docs.mongodb.com/realm/authentication/facebook/).
      *
      * @param accessToken The access token returned from Facebook.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    def facebook(accessToken: String): Credentials[FacebookPayload] = js.native
    
    /**
      * Factory for `Credentials` which authenticate using the [Custom Function Provider](https://docs.mongodb.com/realm/authentication/custom-function/).
      *
      * @param payload The custom payload as expected by the server.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    def function[PayloadType /* <: FunctionPayload */](payload: PayloadType): Credentials[PayloadType] = js.native
    
    /**
      * Factory for `Credentials` which authenticate using the [Google Provider](https://docs.mongodb.com/realm/authentication/google/).
      *
      * @param authCode The auth code returned from Google.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    def google(authCode: String): Credentials[GooglePayload] = js.native
    
    /**
      * Factory for `Credentials` which authenticate using the [Custom JWT Provider](https://docs.mongodb.com/realm/authentication/custom-jwt/).
      *
      * @param token The JSON Web Token (JWT).
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    def jwt(token: String): Credentials[JWTPayload] = js.native
    
    /**
      * Factory for `Credentials` which authenticate using the [API Key Provider](https://docs.mongodb.com/realm/authentication/api-key/).
      *
      * @deprecated Use `Credentials.apiKey`.
      *
      * @param key The secret content of the API key.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    def serverApiKey(key: String): Credentials[ApiKeyPayload] = js.native
    
    /**
      * Factory for `Credentials` which authenticate using the [API Key Provider](https://docs.mongodb.com/realm/authentication/api-key/).
      *
      * @deprecated Use `Credentials.apiKey`.
      *
      * @param key The secret content of the API key.
      * @returns A `Credentials` object for logging in using `app.logIn`.
      */
    /* static member */
    def userApiKey(key: String): Credentials[ApiKeyPayload] = js.native
  }
  object TypeofCredentials {
    
    @scala.inline
    def apply(
      anonymous: () => Credentials[AnonymousPayload],
      apple: String => Credentials[ApplePayload],
      emailPassword: (String, String) => Credentials[EmailPasswordPayload],
      facebook: String => Credentials[FacebookPayload],
      function: js.Any => Credentials[js.Any],
      google: String => Credentials[GooglePayload],
      jwt: String => Credentials[JWTPayload],
      serverApiKey: String => Credentials[ApiKeyPayload],
      userApiKey: String => Credentials[ApiKeyPayload]
    ): TypeofCredentials = {
      val __obj = js.Dynamic.literal(anonymous = js.Any.fromFunction0(anonymous), apple = js.Any.fromFunction1(apple), emailPassword = js.Any.fromFunction2(emailPassword), facebook = js.Any.fromFunction1(facebook), function = js.Any.fromFunction1(function), google = js.Any.fromFunction1(google), jwt = js.Any.fromFunction1(jwt), serverApiKey = js.Any.fromFunction1(serverApiKey), userApiKey = js.Any.fromFunction1(userApiKey))
      __obj.asInstanceOf[TypeofCredentials]
    }
    
    @scala.inline
    implicit class TypeofCredentialsMutableBuilder[Self <: TypeofCredentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnonymous(value: () => Credentials[AnonymousPayload]): Self = StObject.set(x, "anonymous", js.Any.fromFunction0(value))
      
      @scala.inline
      def setApple(value: String => Credentials[ApplePayload]): Self = StObject.set(x, "apple", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmailPassword(value: (String, String) => Credentials[EmailPasswordPayload]): Self = StObject.set(x, "emailPassword", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFacebook(value: String => Credentials[FacebookPayload]): Self = StObject.set(x, "facebook", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFunction(value: js.Any => Credentials[js.Any]): Self = StObject.set(x, "function", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGoogle(value: String => Credentials[GooglePayload]): Self = StObject.set(x, "google", js.Any.fromFunction1(value))
      
      @scala.inline
      def setJwt(value: String => Credentials[JWTPayload]): Self = StObject.set(x, "jwt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setServerApiKey(value: String => Credentials[ApiKeyPayload]): Self = StObject.set(x, "serverApiKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUserApiKey(value: String => Credentials[ApiKeyPayload]): Self = StObject.set(x, "userApiKey", js.Any.fromFunction1(value))
    }
  }
}
