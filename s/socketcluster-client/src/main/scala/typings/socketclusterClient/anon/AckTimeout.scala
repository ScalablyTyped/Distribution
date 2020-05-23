package typings.socketclusterClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AckTimeout extends js.Object {
  var ackTimeout: js.UndefOr[Double] = js.undefined
}

object AckTimeout {
  @scala.inline
  def apply(ackTimeout: js.UndefOr[Double] = js.undefined): AckTimeout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ackTimeout)) __obj.updateDynamic("ackTimeout")(ackTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AckTimeout]
  }
}

