package typings.rockset.distCodegenApiMod

import typings.rockset.distCodegenConfigurationMod.Configuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rockset/dist/codegen/api", "UsersApi")
@js.native
open class UsersApi () extends BaseAPI {
  def this(configuration: Configuration) = this()
  def this(configuration: Unit, basePath: String) = this()
  def this(configuration: Configuration, basePath: String) = this()
  def this(configuration: Unit, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Unit, basePath: Unit, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: String, fetch: FetchAPI) = this()
  def this(configuration: Configuration, basePath: Unit, fetch: FetchAPI) = this()
  
  /**
    * Create a new user for an organization.
    * @summary Create User
    * @param {CreateUserRequest} body JSON object
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof UsersApi
    */
  def createUser(body: CreateUserRequest): js.Promise[CreateUserResponse] = js.native
  def createUser(body: CreateUserRequest, options: Any): js.Promise[CreateUserResponse] = js.native
  
  /**
    * Delete a user from an organization.
    * @summary Delete User
    * @param {string} user user email
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof UsersApi
    */
  def deleteUser(user: String): js.Promise[DeleteUserResponse] = js.native
  def deleteUser(user: String, options: Any): js.Promise[DeleteUserResponse] = js.native
  
  /**
    * Retrieve currently active user.
    * @summary Get Current User
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof UsersApi
    */
  def getCurrentUser(): js.Promise[User] = js.native
  def getCurrentUser(options: Any): js.Promise[User] = js.native
  
  /**
    * Retrieve all users for an organization.
    * @summary List Users
    * @param {*} [options] Override http request option.
    * @throws {RequiredError}
    * @memberof UsersApi
    */
  def listUsers(): js.Promise[ListUsersResponse] = js.native
  def listUsers(options: Any): js.Promise[ListUsersResponse] = js.native
}
