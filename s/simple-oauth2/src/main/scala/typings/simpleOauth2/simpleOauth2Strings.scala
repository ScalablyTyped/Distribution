package typings.simpleOauth2

import typings.simpleOauth2.mod.TokenType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleOauth2Strings {
  
  @scala.inline
  def AuthorizationCode: AuthorizationCode = "AuthorizationCode".asInstanceOf[AuthorizationCode]
  
  @scala.inline
  def access_token: access_token = "access_token".asInstanceOf[access_token]
  
  @scala.inline
  def body: body = "body".asInstanceOf[body]
  
  @scala.inline
  def force: force = "force".asInstanceOf[force]
  
  @scala.inline
  def form: form = "form".asInstanceOf[form]
  
  @scala.inline
  def header: header = "header".asInstanceOf[header]
  
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @scala.inline
  def refresh_token: refresh_token = "refresh_token".asInstanceOf[refresh_token]
  
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait AuthorizationCode extends js.Object
  
  @js.native
  sealed trait access_token extends TokenType
  
  @js.native
  sealed trait body extends js.Object
  
  @js.native
  sealed trait force extends js.Object
  
  @js.native
  sealed trait form extends js.Object
  
  @js.native
  sealed trait header extends js.Object
  
  @js.native
  sealed trait json extends js.Object
  
  @js.native
  sealed trait refresh_token extends TokenType
  
  @js.native
  sealed trait strict extends js.Object
}
