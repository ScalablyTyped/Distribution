package typings.seleniumWebdriver.commandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver/lib/command", "Command")
@js.native
class Command protected () extends js.Object {
  // region Constructors
  /**
    * @param {!CommandName} name The name of this command.
    * @constructor
    */
  def this(name: String) = this()
  
  // endregion
  // region Methods
  /**
    * @return {!CommandName} This command's name.
    */
  def getName(): String = js.native
  
  /**
    * Returns a named command parameter.
    * @param {string} key The parameter key to look up.
    * @return {*} The parameter value, or undefined if it has not been set.
    */
  def getParameter(key: String): js.Any = js.native
  
  /**
    * @return {!Object.<*>} The parameters to send with this command.
    */
  def getParameters(): js.Any = js.native
  
  /**
    * Sets a parameter to send with this command.
    * @param {string} name The parameter name.
    * @param {*} value The parameter value.
    * @return {!Command} A self reference.
    */
  def setParameter(name: String, value: js.Any): Command = js.native
  
  /**
    * Sets the parameters for this command.
    * @param {!Object.<*>} parameters The command parameters.
    * @return {!Command} A self reference.
    */
  def setParameters(parameters: js.Any): Command = js.native
}
