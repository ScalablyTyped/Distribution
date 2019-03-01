package typings
package ssDashUtilsLib.ssutilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOnMessageEvent extends js.Object {
  var data: java.lang.String
}

object IOnMessageEvent {
  @scala.inline
  def apply(data: java.lang.String): IOnMessageEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[IOnMessageEvent]
  }
}

