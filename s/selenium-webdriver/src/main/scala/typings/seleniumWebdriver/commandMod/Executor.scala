package typings.seleniumWebdriver.commandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver/lib/command", "Executor")
@js.native
class Executor () extends js.Object {
  
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
  def defineCommand(name: String, method: String, path: String): Unit = js.native
  
  /**
    * Executes the given {@code command}. If there is an error executing the
    * command, the provided callback will be invoked with the offending error.
    * Otherwise, the callback will be invoked with a null Error and non-null
    * response object.
    *
    * @param {!Command} command The command to execute.
    * @return {!Promise<?>} A promise that will be fulfilled with
    *     the command result.
    */
  def execute(command: Command): js.Promise[_] = js.native
}
