package typings.solutionCenterCommunicator.ScCommunicator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScEnvironmentsProvider extends js.Object {
  /**
    * Access to the public methods of the service
    */
  @JSName("$get")
  def $get(): js.Any = js.native
  /**
    * Get current environment
    * If environment was not previously configured, use default environment
    *
    * @public
    * @returns {Object} Current or default environment
    */
  def getCurrentEnvironment(): Environment = js.native
  /**
    * Get specific environment
    *
    * @public
    * @param {string} name - Environment name
    * @returns {Object} Specific or default environment
    */
  def getSpecificEnvironment(name: String): Environment = js.native
  /**
    * Set current environment
    *
    * @public
    * @param {string|Object} env - Environment name or custom environment object
    * @returns {Object} Named or custom environment
    */
  def setCurrentEnvironment(env: js.Any): Environment = js.native
}

