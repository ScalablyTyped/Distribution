package typings.spex.spexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOriginData extends js.Object {
  var result: js.Any
  var success: Boolean
}

object IOriginData {
  @scala.inline
  def apply(result: js.Any, success: Boolean): IOriginData = {
    val __obj = js.Dynamic.literal(result = result, success = success)
  
    __obj.asInstanceOf[IOriginData]
  }
}

