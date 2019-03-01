package typings
package reduxDashPackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LIFECYCLE extends js.Object {
  val LIFECYCLE: reduxDashPackLib.reduxDashPackLibStrings.`redux-pack/LIFECYCLE`
  val TRANSACTION: reduxDashPackLib.reduxDashPackLibStrings.`redux-pack/TRANSACTION`
}

object Anon_LIFECYCLE {
  @scala.inline
  def apply(
    LIFECYCLE: reduxDashPackLib.reduxDashPackLibStrings.`redux-pack/LIFECYCLE`,
    TRANSACTION: reduxDashPackLib.reduxDashPackLibStrings.`redux-pack/TRANSACTION`
  ): Anon_LIFECYCLE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LIFECYCLE")(LIFECYCLE)
    __obj.updateDynamic("TRANSACTION")(TRANSACTION)
    __obj.asInstanceOf[Anon_LIFECYCLE]
  }
}

