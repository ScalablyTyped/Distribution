package typings
package soapLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOneWayOptions extends js.Object {
  var emptyBody: js.UndefOr[scala.Boolean] = js.undefined
  var responseCode: js.UndefOr[scala.Double] = js.undefined
}

object IOneWayOptions {
  @scala.inline
  def apply(emptyBody: js.UndefOr[scala.Boolean] = js.undefined, responseCode: scala.Int | scala.Double = null): IOneWayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emptyBody)) __obj.updateDynamic("emptyBody")(emptyBody)
    if (responseCode != null) __obj.updateDynamic("responseCode")(responseCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOneWayOptions]
  }
}

