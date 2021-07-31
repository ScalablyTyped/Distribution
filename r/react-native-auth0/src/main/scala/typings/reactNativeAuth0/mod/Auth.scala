package typings.reactNativeAuth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-auth0", "Auth")
@js.native
class Auth () extends StObject {
  
  def authorizeUrl(params: AuthorizeUrlParams): String = js.native
  
  /* tslint:disable-next-line no-unnecessary-generics */
  def createUser[T](user: CreateUserParams[T]): js.Promise[CreateUserResponse] = js.native
  
  def exchange(params: ExchangeParams): js.Promise[ExchangeResponse] = js.native
  
  def loginWithEmail(params: LoginWithEmailParams): js.Promise[js.Any] = js.native
  
  def loginWithSMS(params: LoginWithSMSParams): js.Promise[js.Any] = js.native
  
  def logoutUrl(params: LogoutParams): String = js.native
  
  def passwordRealm(params: PasswordRealmParams): js.Promise[PasswordRealmResponse] = js.native
  
  def passwordlessWithEmail(params: PasswordlessWithEmailParams): js.Promise[js.Any] = js.native
  
  def passwordlessWithSMS(params: PasswordlessWithSMSParams): js.Promise[js.Any] = js.native
  
  def refreshToken(params: RefreshTokenParams): js.Promise[RefreshTokenResponse] = js.native
  
  def resetPassword(params: ResetPasswordParams): js.Promise[js.Any] = js.native
  
  def revoke(params: RevokeParams): js.Promise[js.Any] = js.native
  
  /* tslint:disable-next-line no-unnecessary-generics */
  def userInfo[CustomClaims](params: UserInfoParams): js.Promise[UserInfo[CustomClaims]] = js.native
}
