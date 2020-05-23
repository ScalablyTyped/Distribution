package typings.soap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOneWayOptions extends js.Object {
  var emptyBody: js.UndefOr[Boolean] = js.undefined
  var responseCode: js.UndefOr[Double] = js.undefined
}

object IOneWayOptions {
  @scala.inline
  def apply(emptyBody: js.UndefOr[Boolean] = js.undefined, responseCode: js.UndefOr[Double] = js.undefined): IOneWayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emptyBody)) __obj.updateDynamic("emptyBody")(emptyBody.get.asInstanceOf[js.Any])
    if (!js.isUndefined(responseCode)) __obj.updateDynamic("responseCode")(responseCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOneWayOptions]
  }
}

