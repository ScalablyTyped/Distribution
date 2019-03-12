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
  def apply(Status: () => scala.Double, getError: () => stdLib.Error): Transaction = {
    val __obj = js.Dynamic.literal(Status = js.Any.fromFunction0(Status), getError = js.Any.fromFunction0(getError))
  
    __obj.asInstanceOf[Transaction]
  }
}

