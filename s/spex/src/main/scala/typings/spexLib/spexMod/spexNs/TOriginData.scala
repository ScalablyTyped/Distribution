package typings
package spexLib.spexMod.spexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TOriginData extends js.Object {
  var result: js.Any
  var success: scala.Boolean
}

object TOriginData {
  @scala.inline
  def apply(result: js.Any, success: scala.Boolean): TOriginData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[TOriginData]
  }
}

