package typings.receptacle.receptacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions[X] extends js.Object {
  var meta: js.UndefOr[X] = js.undefined
  var refresh: js.UndefOr[Boolean] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply[X](meta: X = null, refresh: js.UndefOr[Boolean] = js.undefined, ttl: Int | Double = null): SetOptions[X] = {
    val __obj = js.Dynamic.literal()
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptions[X]]
  }
}

