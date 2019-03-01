package typings
package reduxDashPackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FAILURE extends js.Object {
  val FAILURE: reduxDashPackLib.reduxDashPackLibStrings.failure
  val START: reduxDashPackLib.reduxDashPackLibStrings.start
  val SUCCESS: reduxDashPackLib.reduxDashPackLibStrings.success
}

object Anon_FAILURE {
  @scala.inline
  def apply(
    FAILURE: reduxDashPackLib.reduxDashPackLibStrings.failure,
    START: reduxDashPackLib.reduxDashPackLibStrings.start,
    SUCCESS: reduxDashPackLib.reduxDashPackLibStrings.success
  ): Anon_FAILURE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FAILURE")(FAILURE)
    __obj.updateDynamic("START")(START)
    __obj.updateDynamic("SUCCESS")(SUCCESS)
    __obj.asInstanceOf[Anon_FAILURE]
  }
}

