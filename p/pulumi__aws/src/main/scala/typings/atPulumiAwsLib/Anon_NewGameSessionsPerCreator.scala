package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewGameSessionsPerCreator extends js.Object {
  var newGameSessionsPerCreator: js.UndefOr[scala.Double] = js.undefined
  var policyPeriodInMinutes: js.UndefOr[scala.Double] = js.undefined
}

object Anon_NewGameSessionsPerCreator {
  @scala.inline
  def apply(
    newGameSessionsPerCreator: scala.Int | scala.Double = null,
    policyPeriodInMinutes: scala.Int | scala.Double = null
  ): Anon_NewGameSessionsPerCreator = {
    val __obj = js.Dynamic.literal()
    if (newGameSessionsPerCreator != null) __obj.updateDynamic("newGameSessionsPerCreator")(newGameSessionsPerCreator.asInstanceOf[js.Any])
    if (policyPeriodInMinutes != null) __obj.updateDynamic("policyPeriodInMinutes")(policyPeriodInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NewGameSessionsPerCreator]
  }
}

