package typings.registryAuthToken

import typings.registryAuthToken.anon.DictregistryUrls
import typings.registryAuthToken.registryAuthTokenStrings.Basic
import typings.registryAuthToken.registryAuthTokenStrings.Bearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    *
    * @param registryUrl - Either the registry url used
    * for matching or a configuration object describing the contents of the .npmrc file
    * @param [options] - a configuration object describing the
    * contents of the .npmrc file.  If an `npmrc` config object was passed in as the
    * first parameter, this parameter is ignored.
    * @returns The `NpmCredentials` object or undefined if no match found.
    */
  @scala.inline
  def apply(registryUrl: String): NpmCredentials = ^.asInstanceOf[js.Dynamic].apply(registryUrl.asInstanceOf[js.Any]).asInstanceOf[NpmCredentials]
  @scala.inline
  def apply(registryUrl: String, options: AuthOptions): NpmCredentials = (^.asInstanceOf[js.Dynamic].apply(registryUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NpmCredentials]
  @scala.inline
  def apply(registryUrl: AuthOptions): NpmCredentials = ^.asInstanceOf[js.Dynamic].apply(registryUrl.asInstanceOf[js.Any]).asInstanceOf[NpmCredentials]
  @scala.inline
  def apply(registryUrl: AuthOptions, options: AuthOptions): NpmCredentials = (^.asInstanceOf[js.Dynamic].apply(registryUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[NpmCredentials]
  
  @JSImport("registry-auth-token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The options for passing into `registry-auth-token`
    */
  trait AuthOptions extends StObject {
    
    /**
      * An npmrc configuration object used when searching for tokens. If no object is provided,
      * the `.npmrc` file at the base of the project is used.
      */
    var npmrc: js.UndefOr[DictregistryUrls] = js.undefined
    
    /**
      * Wether or not url's path parts are recursively trimmed from the registry
      * url when searching for tokens
      */
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object AuthOptions {
    
    @scala.inline
    def apply(): AuthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthOptions]
    }
    
    @scala.inline
    implicit class AuthOptionsMutableBuilder[Self <: AuthOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNpmrc(value: DictregistryUrls): Self = StObject.set(x, "npmrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNpmrcUndefined: Self = StObject.set(x, "npmrc", js.undefined)
      
      @scala.inline
      def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  /**
    * The generated authentication information
    */
  trait NpmCredentials extends StObject {
    
    /**
      * The password used in `Basic`
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * The token representing the users credentials
      */
    var token: String
    
    /**
      * The type of token
      */
    var `type`: Basic | Bearer
    
    /**
      * The username used in `Basic`
      */
    var username: js.UndefOr[String] = js.undefined
  }
  object NpmCredentials {
    
    @scala.inline
    def apply(token: String, `type`: Basic | Bearer): NpmCredentials = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NpmCredentials]
    }
    
    @scala.inline
    implicit class NpmCredentialsMutableBuilder[Self <: NpmCredentials] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Basic | Bearer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
