package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientPagingControls extends js.Object {
  /** ClientPagingControls limit */
  var limit: js.UndefOr[Double | Null] = js.undefined
  /** ClientPagingControls start */
  var start: js.UndefOr[String | Null] = js.undefined
}

object IClientPagingControls {
  @scala.inline
  def apply(limit: Int | Double = null, start: String = null): IClientPagingControls = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientPagingControls]
  }
}

