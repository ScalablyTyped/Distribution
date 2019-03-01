package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomErrorMessage...
  */
trait ICustomErrorMessage extends js.Object {
  var calcCond: java.lang.String
}

object ICustomErrorMessage {
  @scala.inline
  def apply(calcCond: java.lang.String): ICustomErrorMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calcCond")(calcCond)
    __obj.asInstanceOf[ICustomErrorMessage]
  }
}

