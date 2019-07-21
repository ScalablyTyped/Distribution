package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersApi extends js.Object {
  def create(body: CreateUserRequest): CreateUserResponse = js.native
  def create(body: CreateUserRequest, callback: RequestCallback): CreateUserResponse = js.native
  def get(): User = js.native
  def get(callback: RequestCallback): User = js.native
  def list(): ListUsersResponse = js.native
  def list(callback: RequestCallback): ListUsersResponse = js.native
  def remove(user: java.lang.String): DeleteUserResponse = js.native
  def remove(user: java.lang.String, callback: RequestCallback): DeleteUserResponse = js.native
}

