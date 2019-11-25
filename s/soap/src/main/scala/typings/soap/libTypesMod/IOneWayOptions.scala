package typings.soap.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOneWayOptions extends js.Object {
  var emptyBody: js.UndefOr[Boolean] = js.undefined
  var responseCode: js.UndefOr[Double] = js.undefined
}

object IOneWayOptions {
  @scala.inline
  def apply(emptyBody: js.UndefOr[Boolean] = js.undefined, responseCode: Int | Double = null): IOneWayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emptyBody)) __obj.updateDynamic("emptyBody")(emptyBody.asInstanceOf[js.Any])
    if (responseCode != null) __obj.updateDynamic("responseCode")(responseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOneWayOptions]
  }
}

