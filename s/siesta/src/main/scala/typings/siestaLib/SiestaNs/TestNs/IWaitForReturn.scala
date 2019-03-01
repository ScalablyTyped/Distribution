package typings
package siestaLib.SiestaNs.TestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWaitForReturn extends js.Object {
  var force: js.Function
}

object IWaitForReturn {
  @scala.inline
  def apply(force: js.Function): IWaitForReturn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[IWaitForReturn]
  }
}

