package typings
package stellarDashBaseLib.stellarDashBaseMod.OperationOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAccount
  extends BaseOptions
     with stellarDashBaseLib.stellarDashBaseMod._OperationOptions {
  var destination: java.lang.String
  var startingBalance: java.lang.String
}

object CreateAccount {
  @scala.inline
  def apply(destination: java.lang.String, startingBalance: java.lang.String, source: java.lang.String = null): CreateAccount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destination")(destination)
    __obj.updateDynamic("startingBalance")(startingBalance)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[CreateAccount]
  }
}

