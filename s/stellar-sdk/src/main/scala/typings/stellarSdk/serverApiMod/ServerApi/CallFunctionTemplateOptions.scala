package typings.stellarSdk.serverApiMod.ServerApi

import typings.stellarSdk.stellarSdkStrings.asc
import typings.stellarSdk.stellarSdkStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallFunctionTemplateOptions extends js.Object {
  var cursor: js.UndefOr[String | Double] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var order: js.UndefOr[asc | desc] = js.undefined
}

object CallFunctionTemplateOptions {
  @scala.inline
  def apply(cursor: String | Double = null, limit: Int | Double = null, order: asc | desc = null): CallFunctionTemplateOptions = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFunctionTemplateOptions]
  }
}

