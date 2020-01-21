package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.CreateAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAccount_ extends BaseOperation[CreateAccount] {
  var destination: String
  var startingBalance: String
}

object CreateAccount_ {
  @scala.inline
  def apply(destination: String, startingBalance: String, `type`: CreateAccount, source: String = null): CreateAccount_ = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], startingBalance = startingBalance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccount_]
  }
}

