package typings.spex.spexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TOriginData extends js.Object {
  var result: js.Any
  var success: Boolean
}

object TOriginData {
  @scala.inline
  def apply(result: js.Any, success: Boolean): TOriginData = {
    val __obj = js.Dynamic.literal(result = result, success = success)
  
    __obj.asInstanceOf[TOriginData]
  }
}

