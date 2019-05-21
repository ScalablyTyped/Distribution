package typings
package sharedbLib.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmitRequest extends js.Object {
  var channels: js.Array[java.lang.String] | scala.Null
  var collection: java.lang.String
  var id: java.lang.String
  var index: java.lang.String
  var maxRetries: scala.Double | scala.Null
  var op: Op
  var ops: js.Array[sharedbLib.libSharedbMod.Op]
  var options: js.Any
  var projection: js.UndefOr[Projection] = js.undefined
  var retries: scala.Double
  var saveMilestoneSnapshot: scala.Boolean | scala.Null
  var snapshot: sharedbLib.libSharedbMod.Snapshot | scala.Null
  var start: scala.Double
  var suppressPublish: scala.Boolean | scala.Null
}

object SubmitRequest {
  @scala.inline
  def apply(
    collection: java.lang.String,
    id: java.lang.String,
    index: java.lang.String,
    op: Op,
    ops: js.Array[sharedbLib.libSharedbMod.Op],
    options: js.Any,
    retries: scala.Double,
    start: scala.Double,
    channels: js.Array[java.lang.String] = null,
    maxRetries: scala.Int | scala.Double = null,
    projection: Projection = null,
    saveMilestoneSnapshot: js.UndefOr[scala.Boolean] = js.undefined,
    snapshot: sharedbLib.libSharedbMod.Snapshot = null,
    suppressPublish: js.UndefOr[scala.Boolean] = js.undefined
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

