package typings.sharedb.sharedbMod

import typings.sharedb.libSharedbMod.Snapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmitRequest extends js.Object {
  var channels: js.Array[String] | Null
  var collection: String
  var id: String
  var index: String
  var maxRetries: Double | Null
  var op: Op
  var ops: js.Array[typings.sharedb.libSharedbMod.Op]
  var options: js.Any
  var projection: js.UndefOr[Projection] = js.undefined
  var retries: Double
  var saveMilestoneSnapshot: Boolean | Null
  var snapshot: Snapshot | Null
  var start: Double
  var suppressPublish: Boolean | Null
}

object SubmitRequest {
  @scala.inline
  def apply(
    collection: String,
    id: String,
    index: String,
    op: Op,
    ops: js.Array[typings.sharedb.libSharedbMod.Op],
    options: js.Any,
    retries: Double,
    start: Double,
    channels: js.Array[String] = null,
    maxRetries: Int | Double = null,
    projection: Projection = null,
    saveMilestoneSnapshot: js.UndefOr[Boolean] = js.undefined,
    snapshot: Snapshot = null,
    suppressPublish: js.UndefOr[Boolean] = js.undefined
  ): SubmitRequest = {
    val __obj = js.Dynamic.literal(collection = collection, id = id, index = index, op = op, ops = ops, options = options, retries = retries, start = start)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (!js.isUndefined(saveMilestoneSnapshot)) __obj.updateDynamic("saveMilestoneSnapshot")(saveMilestoneSnapshot)
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot)
    if (!js.isUndefined(suppressPublish)) __obj.updateDynamic("suppressPublish")(suppressPublish)
    __obj.asInstanceOf[SubmitRequest]
  }
}

