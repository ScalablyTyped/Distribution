package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersApi extends js.Object {
  
  def create(body: CreateUserRequest): CreateUserResponse = js.native
  def create(body: CreateUserRequest, callback: RequestCallback): CreateUserResponse = js.native
  
  def get(): User = js.native
  def get(callback: RequestCallback): User = js.native
  
  def list(): ListUsersResponse = js.native
  def list(callback: RequestCallback): ListUsersResponse = js.native
  
  def remove(user: String): DeleteUserResponse = js.native
  def remove(user: String, callback: RequestCallback): DeleteUserResponse = js.native
}
