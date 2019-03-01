package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  var qContent: qlikLib.Anon_QIsNum
}

object Variable {
  @scala.inline
  def apply(qContent: qlikLib.Anon_QIsNum): Variable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qContent")(qContent)
    __obj.asInstanceOf[Variable]
  }
}

