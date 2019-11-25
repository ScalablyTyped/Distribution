package typings.ssDashUtils.ssutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOnMessageEvent extends js.Object {
  var data: String
}

object IOnMessageEvent {
  @scala.inline
  def apply(data: String): IOnMessageEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOnMessageEvent]
  }
}

