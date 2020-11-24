package typings.reactNativeAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-auth0", "Auth")
@js.native
class Auth () extends js.Object {
  
  def authorizeUrl(params: AuthorizeUrlParams): String = js.native
  
  /* tslint:disable-next-line no-unnecessary-generics */
  def createUser[T](user: CreateUserParams[T]): js.Promise[CreateUserResponse] = js.native
  
  def exchange(params: ExchangeParams): js.Promise[ExchangeResponse] = js.native
  
  def loginWithEmail(params: LoginWithEmailParams): js.Promise[_] = js.native
  
  def loginWithSMS(params: LoginWithSMSParams): js.Promise[_] = js.native
  
  def logoutUrl(params: LogoutParams): String = js.native
  
  def passwordRealm(params: PasswordRealmParams): js.Promise[PasswordRealmResponse] = js.native
  
  def passwordlessWithEmail(params: PasswordlessWithEmailParams): js.Promise[_] = js.native
  
  def passwordlessWithSMS(params: PasswordlessWithSMSParams): js.Promise[_] = js.native
  
  def refreshToken(params: RefreshTokenParams): js.Promise[RefreshTokenResponse] = js.native
  
  def resetPassword(params: ResetPasswordParams): js.Promise[_] = js.native
  
  def revoke(params: RevokeParams): js.Promise[_] = js.native
  
  /* tslint:disable-next-line no-unnecessary-generics */
  def userInfo[CustomClaims](params: UserInfoParams): js.Promise[UserInfo[CustomClaims]] = js.native
}
