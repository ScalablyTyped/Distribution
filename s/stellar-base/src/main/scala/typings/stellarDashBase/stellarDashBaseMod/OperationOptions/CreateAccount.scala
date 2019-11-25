package typings.stellarDashBase.stellarDashBaseMod.OperationOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAccount extends BaseOptions {
  var destination: String
  var startingBalance: String
}

object CreateAccount {
  @scala.inline
  def apply(destination: String, startingBalance: String, source: String = null): CreateAccount = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], startingBalance = startingBalance.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccount]
  }
}

