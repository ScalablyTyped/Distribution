package typings.reactAuthKit

import typings.reactAuthKit.reactAuthKitStrings.cookie
import typings.reactAuthKit.reactAuthKitStrings.localstorage
import typings.reactAuthKit.typesMod.AuthKitStateInterface
import typings.reactAuthKit.typesMod.AuthStateUserObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokenObjectMod {
  
  /**
    * @class TokenObject
    *
    * Stores and retrieve Token
    */
  @JSImport("react-auth-kit/dist/TokenObject", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TokenObject {
    /**
      * TokenObject - Stores, retrieve and process tokens
      *
      * @param authStorageName - Name of the Token,
      * which will store the Authorization Token
      *
      * @param authStorageType - Type of the auth Storage, `
      * cookie` or `localstorage`
      *
      * @param refreshTokenName - Name of the refresh Token,
      * if `undefined`, then no refreshToken feature is using
      *
      * @param cookieDomain - domain name for the Cookies,
      * only applicable when `authStorageType` is `cookie`
      *
      * @param cookieSecure - cookies are secure or not,
      * only applicable when `authStorageType` is `cookie`
      *
      * @constructor
      */
    def this(authStorageName: String, authStorageType: cookie | localstorage) = this()
    def this(authStorageName: String, authStorageType: cookie | localstorage, refreshTokenName: String) = this()
    def this(
      authStorageName: String,
      authStorageType: cookie | localstorage,
      refreshTokenName: String,
      cookieDomain: String
    ) = this()
    def this(
      authStorageName: String,
      authStorageType: cookie | localstorage,
      refreshTokenName: Null,
      cookieDomain: String
    ) = this()
    def this(
      authStorageName: String,
      authStorageType: cookie | localstorage,
      refreshTokenName: String,
      cookieDomain: String,
      cookieSecure: Boolean
    ) = this()
    def this(
      authStorageName: String,
      authStorageType: cookie | localstorage,
      refreshTokenName: String,
      cookieDomain: Unit,
      cookieSecure: Boolean
    ) = this()
    def this(
      authStorageName: String,
      authStorageType: cookie | localstorage,
      refreshTokenName: Null,
      cookieDomain: String,
      cookieSecure: Boolean
    ) = this()
    def this(
      authStorageName: String,
      authStorageType: cookie | localstorage,
      refreshTokenName: Null,
      cookieDomain: Unit,
      cookieSecure: Boolean
    ) = this()
  }
  
  /**
    * @class TokenObject
    *
    * Stores and retrieve Token
    */
  @js.native
  trait TokenObject extends StObject {
    
    /* private */ val authStorageName: Any = js.native
    
    /* private */ val authStorageType: Any = js.native
    
    /* private */ val authStorageTypeName: Any = js.native
    
    /* private */ val authTimeStorageName: Any = js.native
    
    /**
      * Check if the Initial token is valid or not,
      * Called Internally by `initialCookieToken_()` and `initialLSToken_()`
      *
      * If the tokens are valid,
      * then it response TokenObject with auth Information
      * Else it response TokenObject with all null
      *
      * @param authToken
      * @param authTokenType
      * @param authTokenTime
      * @param stateCookie
      * @param refreshToken
      * @param refreshTokenTime
      *
      * @returns AuthKitStateInterface
      *
      */
    def checkTokenExist(
      authToken: js.UndefOr[String | Null],
      authTokenType: js.UndefOr[String | Null],
      authTokenTime: js.UndefOr[String | Null],
      stateCookie: js.UndefOr[String | Null],
      refreshToken: js.UndefOr[String | Null],
      refreshTokenTime: js.UndefOr[String | Null]
    ): AuthKitStateInterface = js.native
    
    /* private */ val cookieDomain: Any = js.native
    
    /* private */ val cookieSecure: Any = js.native
    
    /**
      * Get the Initial Token from Cookies
      * Called internally by `initialToken` method
      *
      * If the `authStorageType` is `cookie`
      * then this function is called
      * And returns the Tokens and states Stored in all 4 cookies
      *
      * @returns AuthKitStateInterface
      */
    def initialCookieToken_(): AuthKitStateInterface = js.native
    
    /**
      * Get the Initial Token from LocalStorage
      * Called internally by `initialToken` method
      *
      * If the `authStorageType` is `localstorage`
      * then this function is called
      * And returns the Tokens and states Stored in all 4 cookies
      *
      * @returns AuthKitStateInterface
      */
    def initialLSToken_(): AuthKitStateInterface = js.native
    
    /**
      * Get the Initial Tokens and states
      * Called externally in `AuthProvider`
      * when the Application is bootstrapping or refreshed
      *
      * If the `authStorageType` is `cookie`,
      * get information from `initialCookieToken()` function
      *
      * If the `authTokenType` is `localStorage`
      * get information from `initialLSToken()` function
      *
      * @returns AuthKitStateInterface
      */
    def initialToken(): AuthKitStateInterface = js.native
    
    /* private */ val isUsingRefreshToken: Any = js.native
    
    /* private */ val refreshTokenName: Any = js.native
    
    /* private */ val refreshTokenTimeName: Any = js.native
    
    /**
      * Remove Token from Cookies
      */
    def removeCookieToken_(): Unit = js.native
    
    /**
      * Remove Token from LocalStorage
      */
    def removeLSToken_(): Unit = js.native
    
    /**
      * Remove Tokens on time of Logout
      */
    def removeToken(): Unit = js.native
    
    /**
      *
      * Set Cookie on time of Login
      *
      * @param authToken
      * @param authTokenType
      * @param refreshToken
      * @param expiresAt
      * @param refreshTokenExpiresAt
      * @param authState
      */
    def setCookieToken_(authToken: String, authTokenType: String, refreshToken: String, expiresAt: js.Date): Unit = js.native
    def setCookieToken_(
      authToken: String,
      authTokenType: String,
      refreshToken: String,
      expiresAt: js.Date,
      refreshTokenExpiresAt: js.Date
    ): Unit = js.native
    def setCookieToken_(
      authToken: String,
      authTokenType: String,
      refreshToken: String,
      expiresAt: js.Date,
      refreshTokenExpiresAt: js.Date,
      authState: AuthStateUserObject
    ): Unit = js.native
    def setCookieToken_(
      authToken: String,
      authTokenType: String,
      refreshToken: String,
      expiresAt: js.Date,
      refreshTokenExpiresAt: Null,
      authState: AuthStateUserObject
    ): Unit = js.native
    def setCookieToken_(authToken: String, authTokenType: String, refreshToken: Null, expiresAt: js.Date): Unit = js.native
    def setCookieToken_(
      authToken: String,
      authTokenType: String,
      refreshToken: Null,
      expiresAt: js.Date,
      refreshTokenExpiresAt: js.Date
    ): Unit = js.native
    def setCookieToken_(
      authToken: String,
      authTokenType: String,
      refreshToken: Null,
      expiresAt: js.Date,
      refreshTokenExpiresAt: js.Date,
      authState: AuthStateUserObject
    ): Unit = js.native
    def setCookieToken_(
      authToken: String,
      authTokenType: String,
      refreshToken: Null,
      expiresAt: js.Date,
      refreshTokenExpiresAt: Null,
      authState: AuthStateUserObject
    ): Unit = js.native
    
    /**
      * Set LocalStorage at the time of Login
      *
      * @param authToken
      * @param authTokenType
      * @param refreshToken
      * @param expiresAt
      * @param refreshTokenExpiresAt
      * @param authState
      */
    def setLSToken_(authToken: String, authTokenType: String, refreshToken: String, expiresAt: js.Date): Unit = js.native
    def setLSToken_(
      authToken: String,
      authTokenType: String,
      refreshToken: String,
      expiresAt: js.Date,
      refreshTokenExpiresAt: js.Date
    ): Unit = js.native
    def setLSToken_(
      authToken: String,
      authTokenType: String,
      refreshToken: String,
      expiresAt: js.Date,
      refreshTokenExpiresAt: js.Date,
      authState: AuthStateUserObject
    ): Unit = js.native
    def setLSToken_(
      authToken: String,
      authTokenType: String,
      refreshToken: String,
      expiresAt: js.Date,
      refreshTokenExpiresAt: Null,
      authState: AuthStateUserObject
    ): Unit = js.native
    def setLSToken_(authToken: String, authTokenType: String, refreshToken: Null, expiresAt: js.Date): Unit = js.native
    def setLSToken_(
      authToken: String,
      authTokenType: String,
      refreshToken: Null,
      expiresAt: js.Date,
      refreshTokenExpiresAt: js.Date
    ): Unit = js.native
    def setLSToken_(
      authToken: String,
      authTokenType: String,
      refreshToken: Null,
      expiresAt: js.Date,
      refreshTokenExpiresAt: js.Date,
      authState: AuthStateUserObject
    ): Unit = js.native
    def setLSToken_(
      authToken: String,
      authTokenType: String,
      refreshToken: Null,
      expiresAt: js.Date,
      refreshTokenExpiresAt: Null,
      authState: AuthStateUserObject
    ): Unit = js.native
    
    /**
      * Set Cookies or localstorage on login
      *
      * @param authToken
      * @param authTokenType
      * @param refreshToken
      * @param refreshTokenExpiresAt
      * @param expiresAt
      * @param authState
      */
    def setToken(
      authToken: String,
      authTokenType: String,
      refreshToken: String,
      refreshTokenExpiresAt: js.Date,
      expiresAt: js.Date
    ): Unit = js.native
    def setToken(
      authToken: String,
      authTokenType: String,
      refreshToken: String,
      refreshTokenExpiresAt: js.Date,
      expiresAt: js.Date,
      authState: AuthStateUserObject
    ): Unit = js.native
    def setToken(
      authToken: String,
      authTokenType: String,
      refreshToken: String,
      refreshTokenExpiresAt: Null,
      expiresAt: js.Date
    ): Unit = js.native
    def setToken(
      authToken: String,
      authTokenType: String,
      refreshToken: String,
      refreshTokenExpiresAt: Null,
      expiresAt: js.Date,
      authState: AuthStateUserObject
    ): Unit = js.native
    def setToken(
      authToken: String,
      authTokenType: String,
      refreshToken: Null,
      refreshTokenExpiresAt: js.Date,
      expiresAt: js.Date
    ): Unit = js.native
    def setToken(
      authToken: String,
      authTokenType: String,
      refreshToken: Null,
      refreshTokenExpiresAt: js.Date,
      expiresAt: js.Date,
      authState: AuthStateUserObject
    ): Unit = js.native
    def setToken(
      authToken: String,
      authTokenType: String,
      refreshToken: Null,
      refreshTokenExpiresAt: Null,
      expiresAt: js.Date
    ): Unit = js.native
    def setToken(
      authToken: String,
      authTokenType: String,
      refreshToken: Null,
      refreshTokenExpiresAt: Null,
      expiresAt: js.Date,
      authState: AuthStateUserObject
    ): Unit = js.native
    
    /* private */ val stateStorageName: Any = js.native
    
    /**
      * Sync Auth Tokens on time of login and logout
      *
      * Set the New Cookies or new Localstorage on login
      * Or Remove the old Cookies or old Localstorage on logout
      *
      * @param authState
      */
    def syncTokens(authState: AuthKitStateInterface): Unit = js.native
  }
}
