package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  def Status(): scala.Double
  def getError(): stdLib.Error
}

object Transaction {
  @scala.inline
  def apply(Status: js.Function0[scala.Double], getError: js.Function0[stdLib.Error]): Transaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Status")(Status)
    __obj.updateDynamic("getError")(getError)
    __obj.asInstanceOf[Transaction]
  }
}

