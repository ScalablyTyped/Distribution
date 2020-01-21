package typings.sharedb.mod

import typings.sharedb.sharedbMod.Snapshot
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
  var ops: js.Array[typings.sharedb.sharedbMod.Op]
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
    ops: js.Array[typings.sharedb.sharedbMod.Op],
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
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(saveMilestoneSnapshot)) __obj.updateDynamic("saveMilestoneSnapshot")(saveMilestoneSnapshot.asInstanceOf[js.Any])
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressPublish)) __obj.updateDynamic("suppressPublish")(suppressPublish.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitRequest]
  }
}

