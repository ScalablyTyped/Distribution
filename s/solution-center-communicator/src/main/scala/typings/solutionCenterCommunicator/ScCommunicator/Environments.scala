package typings.solutionCenterCommunicator.ScCommunicator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environments extends js.Object {
  /**
    * Development environment
    */
  var DEVELOPMENT: Environment = js.native
  /**
    * Integration environment
    */
  var INTEGRATION: Environment = js.native
  /**
    * Local environment
    */
  var LOCAL: Environment = js.native
  /**
    * Production environment
    */
  var PRODUCTION: Environment = js.native
  /**
    * Stage environment
    */
  var STAGE: Environment = js.native
  /**
    * Testing environment
    */
  var TESTING: Environment = js.native
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
    val __obj = js.Dynamic.literal(DEVELOPMENT = DEVELOPMENT.asInstanceOf[js.Any], INTEGRATION = INTEGRATION.asInstanceOf[js.Any], LOCAL = LOCAL.asInstanceOf[js.Any], PRODUCTION = PRODUCTION.asInstanceOf[js.Any], STAGE = STAGE.asInstanceOf[js.Any], TESTING = TESTING.asInstanceOf[js.Any])
    __obj.asInstanceOf[Environments]
  }
  @scala.inline
  implicit class EnvironmentsOps[Self <: Environments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDEVELOPMENT(value: Environment): Self = this.set("DEVELOPMENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setINTEGRATION(value: Environment): Self = this.set("INTEGRATION", value.asInstanceOf[js.Any])
    @scala.inline
    def setLOCAL(value: Environment): Self = this.set("LOCAL", value.asInstanceOf[js.Any])
    @scala.inline
    def setPRODUCTION(value: Environment): Self = this.set("PRODUCTION", value.asInstanceOf[js.Any])
    @scala.inline
    def setSTAGE(value: Environment): Self = this.set("STAGE", value.asInstanceOf[js.Any])
    @scala.inline
    def setTESTING(value: Environment): Self = this.set("TESTING", value.asInstanceOf[js.Any])
  }
  
}

