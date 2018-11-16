package typings
package smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Requests.System.LoginRequest")
@js.native
class LoginRequest protected () extends js.Object {
  /**
                   * Creates a new LoginRequest instance.
                   * @param {string} userName The name to be assigned to the user. If not passed and if the Zone allows guest users, the name is generated automatically by the server.
                   * @param {string} [password] The user password to access the system. SmartFoxServer doesn't offer a default authentication system, so the password must be validated implementing a custom login system in the Zone's server-side Extension.
                   * @param {Object} [params]   An object containing custom parameters to be passed to the Zone Extension (requires a custom login system to be in place).
                   * @param {string} [zoneName] The name (case-sensitive) of the server Zone to login to; if a Zone name is not specified, the client will use the setting passed to the SmartFox class constructor.
                   */
  def this(userName: java.lang.String) = this()
  /**
                   * Creates a new LoginRequest instance.
                   * @param {string} userName The name to be assigned to the user. If not passed and if the Zone allows guest users, the name is generated automatically by the server.
                   * @param {string} [password] The user password to access the system. SmartFoxServer doesn't offer a default authentication system, so the password must be validated implementing a custom login system in the Zone's server-side Extension.
                   * @param {Object} [params]   An object containing custom parameters to be passed to the Zone Extension (requires a custom login system to be in place).
                   * @param {string} [zoneName] The name (case-sensitive) of the server Zone to login to; if a Zone name is not specified, the client will use the setting passed to the SmartFox class constructor.
                   */
  def this(userName: java.lang.String, password: java.lang.String) = this()
  /**
                   * Creates a new LoginRequest instance.
                   * @param {string} userName The name to be assigned to the user. If not passed and if the Zone allows guest users, the name is generated automatically by the server.
                   * @param {string} [password] The user password to access the system. SmartFoxServer doesn't offer a default authentication system, so the password must be validated implementing a custom login system in the Zone's server-side Extension.
                   * @param {Object} [params]   An object containing custom parameters to be passed to the Zone Extension (requires a custom login system to be in place).
                   * @param {string} [zoneName] The name (case-sensitive) of the server Zone to login to; if a Zone name is not specified, the client will use the setting passed to the SmartFox class constructor.
                   */
  def this(userName: java.lang.String, password: java.lang.String, params: js.Object) = this()
  /**
                   * Creates a new LoginRequest instance.
                   * @param {string} userName The name to be assigned to the user. If not passed and if the Zone allows guest users, the name is generated automatically by the server.
                   * @param {string} [password] The user password to access the system. SmartFoxServer doesn't offer a default authentication system, so the password must be validated implementing a custom login system in the Zone's server-side Extension.
                   * @param {Object} [params]   An object containing custom parameters to be passed to the Zone Extension (requires a custom login system to be in place).
                   * @param {string} [zoneName] The name (case-sensitive) of the server Zone to login to; if a Zone name is not specified, the client will use the setting passed to the SmartFox class constructor.
                   */
  def this(userName: java.lang.String, password: java.lang.String, params: js.Object, zoneName: java.lang.String) = this()
}

