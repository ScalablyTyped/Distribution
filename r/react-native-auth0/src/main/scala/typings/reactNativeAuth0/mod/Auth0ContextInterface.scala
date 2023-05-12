package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-auth0", "Auth0ContextInterface")
@js.native
open class Auth0ContextInterface () extends StObject {
  
  def authorize(): js.Promise[Unit] = js.native
  def authorize(parameters: Unit, options: AuthorizeOptions): js.Promise[Unit] = js.native
  def authorize(parameters: AuthorizeParams): js.Promise[Unit] = js.native
  def authorize(parameters: AuthorizeParams, options: AuthorizeOptions): js.Promise[Unit] = js.native
  
  def clearCredentials(): js.Promise[Unit] = js.native
  
  def clearSession(): js.Promise[Unit] = js.native
  
  var error: BaseError | Null = js.native
  
  def getCredentials(): js.Promise[Credentials] = js.native
  def getCredentials(scope: String): js.Promise[Credentials] = js.native
  def getCredentials(scope: String, minTtl: Double): js.Promise[Credentials] = js.native
  def getCredentials(scope: String, minTtl: Double, parameters: Any): js.Promise[Credentials] = js.native
  def getCredentials(scope: String, minTtl: Unit, parameters: Any): js.Promise[Credentials] = js.native
  def getCredentials(scope: Unit, minTtl: Double): js.Promise[Credentials] = js.native
  def getCredentials(scope: Unit, minTtl: Double, parameters: Any): js.Promise[Credentials] = js.native
  def getCredentials(scope: Unit, minTtl: Unit, parameters: Any): js.Promise[Credentials] = js.native
  
  var isLoading: Boolean = js.native
  
  def requireLocalAuthentication(): js.Promise[Unit] = js.native
  def requireLocalAuthentication(title: String): js.Promise[Unit] = js.native
  def requireLocalAuthentication(title: String, description: String): js.Promise[Unit] = js.native
  def requireLocalAuthentication(title: String, description: String, cancelTitle: String): js.Promise[Unit] = js.native
  def requireLocalAuthentication(title: String, description: String, cancelTitle: String, fallbackTitle: String): js.Promise[Unit] = js.native
  def requireLocalAuthentication(
    title: String,
    description: String,
    cancelTitle: String,
    fallbackTitle: String,
    strategy: LocalAuthenticationStrategy
  ): js.Promise[Unit] = js.native
  def requireLocalAuthentication(
    title: String,
    description: String,
    cancelTitle: String,
    fallbackTitle: Unit,
    strategy: LocalAuthenticationStrategy
  ): js.Promise[Unit] = js.native
  def requireLocalAuthentication(title: String, description: String, cancelTitle: Unit, fallbackTitle: String): js.Promise[Unit] = js.native
  def requireLocalAuthentication(
    title: String,
    description: String,
    cancelTitle: Unit,
    fallbackTitle: String,
    strategy: LocalAuthenticationStrategy
  ): js.Promise[Unit] = js.native
  def requireLocalAuthentication(
    title: String,
    description: String,
    cancelTitle: Unit,
    fallbackTitle: Unit,
    strategy: LocalAuthenticationStrategy
  ): js.Promise[Unit] = js.native
  def requireLocalAuthentication(title: String, description: Unit, cancelTitle: String): js.Promise[Unit] = js.native
  def requireLocalAuthentication(title: String, description: Unit, cancelTitle: String, fallbackTitle: String): js.Promise[Unit] = js.native
  def requireLocalAuthentication(
    title: String,
    description: Unit,
    cancelTitle: String,
    fallbackTitle: String,
    strategy: LocalAuthenticationStrategy
  ): js.Promise[Unit] = js.native
  def requireLocalAuthentication(
    title: String,
    description: Unit,
    cancelTitle: String,
    fallbackTitle: Unit,
    strategy: LocalAuthenticationStrategy
  ): js.Promise[Unit] = js.native
  def requireLocalAuthentication(title: String, description: Unit, cancelTitle: Unit, fallbackTitle: String): js.Promise[Unit] = js.native
  def requireLocalAuthentication(
    title: String,
    description: Unit,
    cancelTitle: Unit,
    fallbackTitle: String,
    strategy: LocalAuthenticationStrategy
  ): js.Promise[Unit] = js.native
  def requireLocalAuthentication(
    title: String,
    description: Unit,
    cancelTitle: Unit,
    fallbackTitle: Unit,
    strategy: LocalAuthenticationStrategy
  ): js.Promise[Unit] = js.native
  def requireLocalAuthentication(title: Unit, description: String): js.Promise[Unit] = js.native
  def requireLocalAuthentication(title: Unit, description: String, cancelTitle: String): js.Promise[Unit] = js.native
  def requireLocalAuthentication(title: Unit, description: String, cancelTitle: String, fallbackTitle: String): js.Promise[Unit] = js.native
  def requireLocalAuthentication(
    title: Unit,
    description: String,
    cancelTitle: String,
    fallbackTitle: String,
    strategy: LocalAuthenticationStrategy
  ): js.Promise[Unit] = js.native
  def requireLocalAuthentication(
    title: Unit,
    description: String,
    cancelTitle: String,
    fallbackTitle: Unit,
    strategy: LocalAuthenticationStrategy
  ): js.Promise[Unit] = js.native
  def requireLocalAuthentication(title: Unit, description: String, cancelTitle: Unit, fallbackTitle: String): js.Promise[Unit] = js.native
  def requireLocalAuthentication(
    title: Unit,
    description: String,
    cancelTitle: Unit,
    fallbackTitle: String,
    strategy: LocalAuthenticationStrategy
  ): js.Promise[Unit] = js.native
  def requireLocalAuthentication(
    title: Unit,
    description: String,
    cancelTitle: Unit,
    fallbackTitle: Unit,
    strategy: LocalAuthenticationStrategy
  ): js.Promise[Unit] = js.native
  def requireLocalAuthentication(title: Unit, description: Unit, cancelTitle: String): js.Promise[Unit] = js.native
  def requireLocalAuthentication(title: Unit, description: Unit, cancelTitle: String, fallbackTitle: String): js.Promise[Unit] = js.native
  def requireLocalAuthentication(
    title: Unit,
    description: Unit,
    cancelTitle: String,
    fallbackTitle: String,
    strategy: LocalAuthenticationStrategy
  ): js.Promise[Unit] = js.native
  def requireLocalAuthentication(
    title: Unit,
    description: Unit,
    cancelTitle: String,
    fallbackTitle: Unit,
    strategy: LocalAuthenticationStrategy
  ): js.Promise[Unit] = js.native
  def requireLocalAuthentication(title: Unit, description: Unit, cancelTitle: Unit, fallbackTitle: String): js.Promise[Unit] = js.native
  def requireLocalAuthentication(
    title: Unit,
    description: Unit,
    cancelTitle: Unit,
    fallbackTitle: String,
    strategy: LocalAuthenticationStrategy
  ): js.Promise[Unit] = js.native
  def requireLocalAuthentication(
    title: Unit,
    description: Unit,
    cancelTitle: Unit,
    fallbackTitle: Unit,
    strategy: LocalAuthenticationStrategy
  ): js.Promise[Unit] = js.native
  
  var user: Any = js.native
}
