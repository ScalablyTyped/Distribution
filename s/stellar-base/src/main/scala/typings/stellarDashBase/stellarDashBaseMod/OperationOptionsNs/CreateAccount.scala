package typings.stellarDashBase.stellarDashBaseMod.OperationOptionsNs

import typings.stellarDashBase.stellarDashBaseMod._OperationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAccount
  extends BaseOptions
     with _OperationOptions {
  var destination: String
  var startingBalance: String
}

object CreateAccount {
  @scala.inline
  def apply(destination: String, startingBalance: String, source: String = null): CreateAccount = {
    val __obj = js.Dynamic.literal(destination = destination, startingBalance = startingBalance)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[CreateAccount]
  }
}

