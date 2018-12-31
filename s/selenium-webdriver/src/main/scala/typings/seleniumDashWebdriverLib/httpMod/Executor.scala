package typings
package seleniumDashWebdriverLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/http", "Executor")
@js.native
class Executor protected () extends js.Object {
  /**
    * @param {!(HttpClient|IThenable<!HttpClient>)} client The client to use for sending
    *     requests to the server, or a promise-like object that will resolve to
    *     to the client.
    */
  def this(client: HttpClient) = this()
  def this(client: seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IThenable[HttpClient]) = this()
  /**
    * Defines a new command for use with this executor. When a command is sent,
    * the {@code path} will be preprocessed using the command's parameters; any
    * path segments prefixed with ':' will be replaced by the parameter of the
    * same name. For example, given '/person/:name' and the parameters
    * '{name: 'Bob'}', the final command path will be '/person/Bob'.
    *
    * @param {string} name The command name.
    * @param {string} method The HTTP method to use when sending this command.
    * @param {string} path The path to send the command to, relative to
    *     the WebDriver server's command root and of the form
    *     '/path/:variable/segment'.
    */
  def defineCommand(name: java.lang.String, method: java.lang.String, path: java.lang.String): scala.Unit = js.native
  /** @override */
  def execute(command: js.Any): js.Any = js.native
}

