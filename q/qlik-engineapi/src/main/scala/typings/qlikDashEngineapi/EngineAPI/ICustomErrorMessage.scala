package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomErrorMessage...
  */
trait ICustomErrorMessage extends js.Object {
  var calcCond: String
}

object ICustomErrorMessage {
  @scala.inline
  def apply(calcCond: String): ICustomErrorMessage = {
    val __obj = js.Dynamic.literal(calcCond = calcCond.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICustomErrorMessage]
  }
}

