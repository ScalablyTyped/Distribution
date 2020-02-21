package typings.socketclusterClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAckTimeout extends js.Object {
  var ackTimeout: js.UndefOr[Double] = js.undefined
}

object AnonAckTimeout {
  @scala.inline
  def apply(ackTimeout: Int | Double = null): AnonAckTimeout = {
    val __obj = js.Dynamic.literal()
    if (ackTimeout != null) __obj.updateDynamic("ackTimeout")(ackTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAckTimeout]
  }
}

