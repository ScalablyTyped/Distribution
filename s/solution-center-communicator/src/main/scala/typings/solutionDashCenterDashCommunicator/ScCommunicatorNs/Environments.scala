package typings.solutionDashCenterDashCommunicator.ScCommunicatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environments extends js.Object {
  /**
    * Development environment
    */
  var DEVELOPMENT: Environment
  /**
    * Integration environment
    */
  var INTEGRATION: Environment
  /**
    * Local environment
    */
  var LOCAL: Environment
  /**
    * Production environment
    */
  var PRODUCTION: Environment
  /**
    * Stage environment
    */
  var STAGE: Environment
  /**
    * Testing environment
    */
  var TESTING: Environment
}

object Environments {
  @scala.inline
  def apply(
    DEVELOPMENT: Environment,
    INTEGRATION: Environment,
    LOCAL: Environment,
    PRODUCTION: Environment,
    STAGE: Environment,
    TESTING: Environment
  ): Environments = {
    val __obj = js.Dynamic.literal(DEVELOPMENT = DEVELOPMENT, INTEGRATION = INTEGRATION, LOCAL = LOCAL, PRODUCTION = PRODUCTION, STAGE = STAGE, TESTING = TESTING)
  
    __obj.asInstanceOf[Environments]
  }
}

