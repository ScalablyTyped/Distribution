package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialsContainer extends js.Object {
  
  def create(): js.Promise[Credential | Null] = js.native
  def create(options: CredentialCreationOptions): js.Promise[Credential | Null] = js.native
  
  def get(): js.Promise[Credential | Null] = js.native
  def get(options: CredentialRequestOptions): js.Promise[Credential | Null] = js.native
  
  def preventSilentAccess(): js.Promise[Unit] = js.native
  
  def store(credential: Credential): js.Promise[Credential] = js.native
}
