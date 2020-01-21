package typings.reactNativeFirebase.mod.RNFirebase.firestore.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions extends js.Object {
  var endAt: js.UndefOr[js.Array[_]] = js.undefined
  var endBefore: js.UndefOr[js.Array[_]] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var selectFields: js.UndefOr[js.Array[String]] = js.undefined
  var startAfter: js.UndefOr[js.Array[_]] = js.undefined
  var startAt: js.UndefOr[js.Array[_]] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply(
    endAt: js.Array[_] = null,
    endBefore: js.Array[_] = null,
    limit: Int | Double = null,
    offset: Int | Double = null,
    selectFields: js.Array[String] = null,
    startAfter: js.Array[_] = null,
    startAt: js.Array[_] = null
  ): QueryOptions = {
    val __obj = js.Dynamic.literal()
    if (endAt != null) __obj.updateDynamic("endAt")(endAt.asInstanceOf[js.Any])
    if (endBefore != null) __obj.updateDynamic("endBefore")(endBefore.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (selectFields != null) __obj.updateDynamic("selectFields")(selectFields.asInstanceOf[js.Any])
    if (startAfter != null) __obj.updateDynamic("startAfter")(startAfter.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions]
  }
}

