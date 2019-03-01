package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Patch extends js.Object {
  var qOp: qlikLib.qlikLibStrings.add | qlikLib.qlikLibStrings.remove | qlikLib.qlikLibStrings.replace
  var qPath: java.lang.String
  var qValue: java.lang.String
}

object Patch {
  @scala.inline
  def apply(
    qOp: qlikLib.qlikLibStrings.add | qlikLib.qlikLibStrings.remove | qlikLib.qlikLibStrings.replace,
    qPath: java.lang.String,
    qValue: java.lang.String
  ): Patch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qOp")(qOp.asInstanceOf[js.Any])
    __obj.updateDynamic("qPath")(qPath)
    __obj.updateDynamic("qValue")(qValue)
    __obj.asInstanceOf[Patch]
  }
}

